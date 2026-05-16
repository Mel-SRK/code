package com.example.gnd.hidden;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import defpackage.f00;
import defpackage.kc;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class SecretContentProvider extends ContentProvider {
    public static final UriMatcher d;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("com.example.gnd.secret.provider", "keys", 1);
        uriMatcher.addURI("com.example.gnd.secret.provider", "keys/fragment", 2);
        d = uriMatcher;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        uri.getClass();
        int iMatch = d.match(uri);
        if (iMatch == 1 || iMatch == 2) {
            return "vnd.android.cursor.item/vnd.gnd.secret";
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        uri.getClass();
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutString;
        uri.getClass();
        int iMatch = d.match(uri);
        if (iMatch == 1) {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"status", "type"});
            matrixCursor.addRow(new String[]{"ready", "info"});
            return matrixCursor;
        }
        if (iMatch != 2) {
            return null;
        }
        int[] iArr = {82, 32, 37, 67};
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            arrayList.add(Character.valueOf((char) (iArr[i] ^ 23)));
        }
        String strT = f00.t(kc.av(arrayList, "", null, null, null, 62));
        Context context = getContext();
        if (context != null && (sharedPreferences = context.getSharedPreferences("key_cache", 0)) != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutString = editorEdit.putString("fragment2", strT)) != null) {
            editorPutString.apply();
        }
        MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"data", "encoding"});
        matrixCursor2.addRow(new String[]{strT, "custom_base64"});
        return matrixCursor2;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        uri.getClass();
        return 0;
    }
}
