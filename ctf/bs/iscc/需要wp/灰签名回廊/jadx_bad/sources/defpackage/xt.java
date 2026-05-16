package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class xt {
    public static final r50 a = new r50(2);
    public static final wf b = new wf(3);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: all -> 0x0083, TryCatch #0 {all -> 0x0083, blocks: (B:3:0x0005, B:4:0x000c, B:6:0x0012, B:8:0x001e, B:10:0x0025, B:13:0x002c, B:15:0x0038, B:19:0x0041, B:21:0x0047, B:28:0x0077, B:22:0x0056, B:24:0x0064, B:27:0x006e, B:29:0x007a), top: B:35:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static o5 a(Context context, List list) {
        jo0.d("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                yt ytVar = (yt) list.get(i);
                if (Build.VERSION.SDK_INT >= 31) {
                    String str = ytVar.e;
                    wo0 wo0Var = dz0.a;
                    Typeface typeface = null;
                    if (str != null && !str.isEmpty()) {
                        Typeface typefaceCreate = Typeface.create(str, 0);
                        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                        if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                            typeface = typefaceCreate;
                        }
                    }
                    if (typeface == null || dz0.a(typeface) == null) {
                        ProviderInfo providerInfoB = b(context.getPackageManager(), ytVar, context.getResources());
                        if (providerInfoB == null) {
                            return new o5(1);
                        }
                        arrayList.add(c(context, ytVar, providerInfoB.authority));
                    } else {
                        arrayList.add(new ku[]{new ku(str, ytVar.f)});
                    }
                }
            }
            return new o5(arrayList);
        } finally {
            Trace.endSection();
        }
    }

    public static ProviderInfo b(PackageManager packageManager, yt ytVar, Resources resources) {
        wf wfVar = b;
        r50 r50Var = a;
        jo0.d("FontProvider.getProvider");
        try {
            List listAf = ytVar.d;
            String str = ytVar.a;
            String str2 = ytVar.b;
            if (listAf == null) {
                listAf = e00.af(resources, 0);
            }
            wt wtVar = new wt();
            wtVar.a = str;
            wtVar.b = str2;
            wtVar.c = listAf;
            ProviderInfo providerInfo = (ProviderInfo) r50Var.a(wtVar);
            if (providerInfo != null) {
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, wfVar);
            for (int i = 0; i < listAf.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listAf.get(i));
                Collections.sort(arrayList2, wfVar);
                if (arrayList.size() == arrayList2.size()) {
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                    }
                    r50Var.b(wtVar, providerInfoResolveContentProvider);
                    return providerInfoResolveContentProvider;
                }
            }
            Trace.endSection();
            return null;
        } finally {
            Trace.endSection();
        }
    }

    public static ku[] c(Context context, yt ytVar, String str) {
        jo0.d("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                jo0.d("ContentQueryWrapper.query");
                try {
                    String[] strArr2 = {ytVar.c};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            arrayList2.add(new ku(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i));
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    return (ku[]) arrayList.toArray(new ku[0]);
                } finally {
                }
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th;
            }
        } finally {
        }
    }
}
