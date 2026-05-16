package defpackage;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j21 extends WindowInsetsAnimation$Callback {
    public final d21 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public j21(d21 d21Var) {
        super(d21Var.e);
        this.d = new HashMap();
        this.a = d21Var;
    }

    public final m21 a(WindowInsetsAnimation windowInsetsAnimation) {
        m21 m21Var = (m21) this.d.get(windowInsetsAnimation);
        if (m21Var == null) {
            m21Var = new m21(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                m21Var.a = new k21(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, m21Var);
        }
        return m21Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationJ = at.j(list.get(size));
            m21 m21VarA = a(windowInsetsAnimationJ);
            m21VarA.a.e(windowInsetsAnimationJ.getFraction());
            this.c.add(m21VarA);
        }
        return this.a.d(e31.b(windowInsets, null), this.b).a();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        f1 f1VarE = this.a.e(a(windowInsetsAnimation), new f1(bounds));
        f1VarE.getClass();
        at.m();
        return at.h(((iz) f1VarE.e).e(), ((iz) f1VarE.f).e());
    }
}
