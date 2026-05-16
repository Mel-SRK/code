package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class du0 {
    public final bu0 a;
    public final ArrayList b = new ArrayList();
    public iz c;
    public iz d;
    public int e;

    public du0(ViewGroup viewGroup) {
        iz izVar = iz.e;
        this.c = izVar;
        this.d = izVar;
        Drawable background = viewGroup.getBackground();
        this.e = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        bu0 bu0Var = new bu0(this, viewGroup.getContext(), viewGroup);
        this.a = bu0Var;
        bu0Var.setWillNotDraw(true);
        gb0 gb0Var = new gb0(this);
        int i = f11.a;
        a11.b(bu0Var, gb0Var);
        f11.a(bu0Var, new cu0(this));
        viewGroup.addView(bu0Var, 0);
    }
}
