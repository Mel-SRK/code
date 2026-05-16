package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class b31 {
    public static final /* synthetic */ int b = 0;
    public final e31 a;

    static {
        int i = Build.VERSION.SDK_INT;
        (i >= 34 ? new r21() : i >= 31 ? new q21() : i >= 30 ? new p21() : i >= 29 ? new o21() : new n21()).b().a.a().a.b().a.c();
    }

    public b31(e31 e31Var) {
        this.a = e31Var;
    }

    public e31 a() {
        return this.a;
    }

    public e31 b() {
        return this.a;
    }

    public e31 c() {
        return this.a;
    }

    public ym e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b31)) {
            return false;
        }
        b31 b31Var = (b31) obj;
        return n() == b31Var.n() && m() == b31Var.m() && Objects.equals(k(), b31Var.k()) && Objects.equals(i(), b31Var.i()) && Objects.equals(e(), b31Var.e());
    }

    public iz f(int i) {
        return iz.e;
    }

    public iz g(int i) {
        if ((i & 8) == 0) {
            return iz.e;
        }
        wc.n("Unable to query the maximum insets for IME");
        return null;
    }

    public iz h() {
        return k();
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), k(), i(), e());
    }

    public iz i() {
        return iz.e;
    }

    public iz j() {
        return k();
    }

    public iz k() {
        return iz.e;
    }

    public iz l() {
        return k();
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void p(iz[] izVarArr) {
    }

    public void q(e31 e31Var) {
    }

    public void r(iz izVar) {
    }

    public void s(int i) {
    }
}
