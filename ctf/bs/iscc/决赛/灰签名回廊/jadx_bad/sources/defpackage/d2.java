package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import com.example.gnd.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class d2 {
    public static final qg a = new qg(u1.f);
    public static final xs0 b = new xs0(u1.g);
    public static final qg c = new qg(q0.i);
    public static final xs0 d = new xs0(u1.h);
    public static final xs0 e = new xs0(u1.i);
    public static final xs0 f = new xs0(u1.j);

    public static final void a(b1 b1Var, gv gvVar, vf vfVar, int i) {
        LinkedHashMap linkedHashMap;
        boolean z;
        vfVar.aw(-520299287);
        int i2 = (vfVar.h(b1Var) ? 4 : 2) | i | (vfVar.h(gvVar) ? 32 : 16);
        if (vfVar.an(i2 & 1, (i2 & 19) != 18)) {
            Context context = b1Var.getContext();
            Object objAk = vfVar.ak();
            Object obj = nf.a;
            if (objAk == obj) {
                objAk = bo0.m(new Configuration(context.getResources().getConfiguration()));
                vfVar.be(objAk);
            }
            w80 w80Var = (w80) objAk;
            Object objAk2 = vfVar.ak();
            if (objAk2 == obj) {
                objAk2 = new v1(w80Var, 0);
                vfVar.be(objAk2);
            }
            b1Var.setConfigurationChangeObserver((cv) objAk2);
            Object objAk3 = vfVar.ak();
            if (objAk3 == obj) {
                objAk3 = new c5();
                vfVar.be(objAk3);
            }
            c5 c5Var = (c5) objAk3;
            p0 viewTreeOwners = b1Var.getViewTreeOwners();
            if (viewTreeOwners == null) {
                wc.q("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            em0 em0Var = viewTreeOwners.b;
            Object objAk4 = vfVar.ak();
            if (objAk4 == obj) {
                Object parent = b1Var.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = rl0.class.getSimpleName() + ':' + strValueOf;
                bm0 savedStateRegistry = em0Var.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                } else {
                    linkedHashMap = null;
                }
                xs0 xs0Var = tl0.a;
                sl0 sl0Var = new sl0(linkedHashMap);
                try {
                    savedStateRegistry.b(str, new fe(1, sl0Var));
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                Object fnVar = new fn(sl0Var, new gn(z, savedStateRegistry, str));
                vfVar.be(fnVar);
                objAk4 = fnVar;
            }
            Object obj2 = (fn) objAk4;
            boolean zH = vfVar.h(obj2);
            Object objAk5 = vfVar.ak();
            if (zH || objAk5 == obj) {
                objAk5 = new l1(3, obj2);
                vfVar.be(objAk5);
            }
            pk.b(wz0.a, (cv) objAk5, vfVar);
            Object objAk6 = vfVar.ak();
            if (objAk6 == obj) {
                objAk6 = (Build.VERSION.SDK_INT < 31 || !((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2)) ? new z90() : new cl(b1Var.getView(), 0);
                vfVar.be(objAk6);
            }
            ix ixVar = (ix) objAk6;
            Configuration configuration = (Configuration) w80Var.getValue();
            Object objAk7 = vfVar.ak();
            if (objAk7 == obj) {
                objAk7 = new cy();
                vfVar.be(objAk7);
            }
            cy cyVar = (cy) objAk7;
            Object objAk8 = vfVar.ak();
            Object obj3 = objAk8;
            if (objAk8 == obj) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                vfVar.be(configuration2);
                obj3 = configuration2;
            }
            Configuration configuration3 = (Configuration) obj3;
            Object objAk9 = vfVar.ak();
            if (objAk9 == obj) {
                objAk9 = new b2(configuration3, cyVar);
                vfVar.be(objAk9);
            }
            b2 b2Var = (b2) objAk9;
            boolean zH2 = vfVar.h(context);
            Object objAk10 = vfVar.ak();
            if (zH2 || objAk10 == obj) {
                objAk10 = new a2(0, context, b2Var);
                vfVar.be(objAk10);
            }
            pk.b(cyVar, (cv) objAk10, vfVar);
            Object objAk11 = vfVar.ak();
            if (objAk11 == obj) {
                objAk11 = new pj0();
                vfVar.be(objAk11);
            }
            pj0 pj0Var = (pj0) objAk11;
            Object objAk12 = vfVar.ak();
            if (objAk12 == obj) {
                objAk12 = new c2(pj0Var);
                vfVar.be(objAk12);
            }
            c2 c2Var = (c2) objAk12;
            boolean zH3 = vfVar.h(context);
            Object objAk13 = vfVar.ak();
            if (zH3 || objAk13 == obj) {
                objAk13 = new a2(1, context, c2Var);
                vfVar.be(objAk13);
            }
            pk.b(pj0Var, (cv) objAk13, vfVar);
            ai0 ai0Var = og.v;
            az0.b(new ci0[]{a.a((Configuration) w80Var.getValue()), b.a(context), q40.a.a(viewTreeOwners.a), r40.a.a(em0Var), tl0.a.a(obj2), f.a(b1Var.getView()), d.a(cyVar), e.a(pj0Var), ai0Var.a(Boolean.valueOf(((Boolean) vfVar.j(ai0Var)).booleanValue() | b1Var.getScrollCaptureInProgress$ui_release())), og.l.a(ixVar)}, t1.aq(1059770793, new x1(b1Var, c5Var, gvVar), vfVar), vfVar, 56);
        } else {
            vfVar.aq();
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new y1(i, 0, b1Var, gvVar);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
