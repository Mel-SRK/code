package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.example.gnd.R;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class hd0 extends x10 implements gv {
    public final /* synthetic */ j70 e;
    public final /* synthetic */ gv f;
    public final /* synthetic */ em g;
    public final /* synthetic */ gv0 h;
    public final /* synthetic */ String i;
    public final /* synthetic */ cv j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ nx0 l;
    public final /* synthetic */ t10 m;
    public final /* synthetic */ s10 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ g11 r;
    public final /* synthetic */ g80 s;
    public final /* synthetic */ aq0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd0(j70 j70Var, gv gvVar, em emVar, gv0 gv0Var, String str, cv cvVar, boolean z, nx0 nx0Var, t10 t10Var, s10 s10Var, boolean z2, int i, int i2, g11 g11Var, g80 g80Var, aq0 aq0Var) {
        super(2);
        this.e = j70Var;
        this.f = gvVar;
        this.g = emVar;
        this.h = gv0Var;
        this.i = str;
        this.j = cvVar;
        this.k = z;
        this.l = nx0Var;
        this.m = t10Var;
        this.n = s10Var;
        this.o = z2;
        this.p = i;
        this.q = i2;
        this.r = g11Var;
        this.s = g80Var;
        this.t = aq0Var;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) {
        j70 j70VarE;
        vf vfVar = (vf) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && vfVar.z()) {
            vfVar.aq();
        } else {
            if (this.f != null) {
                f50 f50Var = f50.k;
                AtomicInteger atomicInteger = ro0.a;
                j70VarE = a.e(new AppendedSemanticsElement(f50Var, true), 0.0f, this.g.ae(ld0.b), 0.0f, 13);
            } else {
                j70VarE = g70.a;
            }
            j70 j70VarC = this.e.c(j70VarE);
            vfVar.j(d2.a);
            ((Context) vfVar.j(d2.b)).getResources().getString(R.string.default_error_message);
            float f = qv0.b;
            j70 j70VarA = b.a(j70VarC, ed0.c, ed0.b);
            gv0 gv0Var = this.h;
            vr0 vr0Var = new vr0(gv0Var.i);
            gv gvVar = this.f;
            aq0 aq0Var = this.t;
            String str = this.i;
            boolean z = this.k;
            boolean z2 = this.o;
            g11 g11Var = this.r;
            g80 g80Var = this.s;
            w7.a(str, this.j, j70VarA, z, this.l, this.m, this.n, z2, this.p, this.q, g11Var, null, g80Var, vr0Var, t1.aq(1474611661, new gd0(str, z, z2, g11Var, g80Var, gvVar, gv0Var, aq0Var), vfVar), vfVar, 0);
        }
        return wz0.a;
    }
}
