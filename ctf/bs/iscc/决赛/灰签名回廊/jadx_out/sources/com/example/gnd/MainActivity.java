package com.example.gnd;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.d41;
import defpackage.dr0;
import defpackage.e00;
import defpackage.eu0;
import defpackage.f6;
import defpackage.hp;
import defpackage.ip;
import defpackage.jo0;
import defpackage.jp;
import defpackage.kp;
import defpackage.lI;
import defpackage.lf;
import defpackage.lp;
import defpackage.mp;
import defpackage.n0;
import defpackage.np;
import defpackage.oe;
import defpackage.pe;
import defpackage.qo0;
import defpackage.te;
import defpackage.v50;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends oe {
    public static final int $stable = 8;
    public static final v50 Companion = new v50();

    static {
        System.loadLibrary("native-verify");
    }

    @Override // defpackage.oe, defpackage.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = 1;
        if (!f6.a) {
            new Thread(new n0(this)).start();
            f6.a = true;
        }
        dr0 dr0Var = new dr0(i);
        eu0 eu0Var = new eu0(0, 0, dr0Var);
        int i2 = hp.a;
        int i3 = hp.b;
        dr0 dr0Var2 = new dr0(i);
        eu0 eu0Var2 = new eu0(i2, i3, dr0Var2);
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        Resources resources = decorView.getResources();
        resources.getClass();
        boolean zBooleanValue = ((Boolean) dr0Var.g(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        resources2.getClass();
        boolean zBooleanValue2 = ((Boolean) dr0Var2.g(resources2)).booleanValue();
        e00 npVar = hp.c;
        if (npVar == null) {
            int i4 = Build.VERSION.SDK_INT;
            npVar = i4 >= 35 ? new np() : i4 >= 30 ? new mp() : i4 >= 29 ? new lp() : i4 >= 28 ? new kp() : i4 >= 26 ? new jp() : new ip();
            hp.c = npVar;
        }
        e00 e00Var = npVar;
        Window window = getWindow();
        window.getClass();
        e00Var.al(eu0Var, eu0Var2, window, decorView, zBooleanValue, zBooleanValue2);
        Window window2 = getWindow();
        window2.getClass();
        e00Var.k(window2);
        te teVar = d41.c;
        ViewGroup.LayoutParams layoutParams = pe.a;
        View childAt = ((ViewGroup) getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        lf lfVar = childAt instanceof lf ? (lf) childAt : null;
        if (lfVar != null) {
            lfVar.setParentCompositionContext(null);
            lfVar.setContent(teVar);
            return;
        }
        lf lfVar2 = new lf(this);
        lfVar2.setParentCompositionContext(null);
        lfVar2.setContent(teVar);
        View decorView2 = getWindow().getDecorView();
        if (jo0.e(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_lifecycle_owner, this);
        }
        if (qo0.f(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        }
        if (lI.h(decorView2) == null) {
            decorView2.setTag(R.id.view_tree_saved_state_registry_owner, this);
        }
        setContentView(lfVar2, pe.a);
    }
}
