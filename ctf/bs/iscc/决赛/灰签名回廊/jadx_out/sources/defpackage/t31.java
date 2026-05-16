package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.example.gnd.R;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class t31 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final ns0 a(Context context) {
        ns0 ns0Var;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object objAm = linkedHashMap.get(context);
                if (objAm == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    o9 o9VarA = i60.a(-1, 6, null);
                    bu buVar = new bu(new mr0(contentResolver, uriFor, new s31(o9VarA, d41.t(Looper.getMainLooper())), o9VarA, context, null));
                    lt0 lt0Var = new lt0(null);
                    kl klVar = wm.a;
                    objAm = e00.am(buVar, new ii(pk.an(lt0Var, x50.a)), new ls0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objAm);
                }
                ns0Var = (ns0) objAm;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ns0Var;
    }

    public static final cg b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof cg) {
            return (cg) tag;
        }
        return null;
    }
}
