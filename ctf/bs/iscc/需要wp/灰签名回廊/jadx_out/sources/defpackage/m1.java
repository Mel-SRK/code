package defpackage;

import android.view.View;
import android.view.ViewStructure;

/* JADX INFO: loaded from: classes.dex */
public final class m1 {
    public static final m1 a = new m1();

    public final void a(ViewStructure viewStructure, View view) {
        viewStructure.setClassName(view.getAccessibilityClassName().toString());
    }
}
