package defpackage;

import android.os.Build;
import com.example.gnd.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b3 implements iw {
    public static boolean f = true;
    public boolean a;
    public Object b;
    public Object c = e00.a();
    public Object d = new ArrayList();
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public b3(pu puVar, boolean z) {
        this.a = z;
        this.b = (x10) puVar;
    }

    @Override // defpackage.iw
    public void a(jw jwVar) {
        synchronized (this.c) {
            if (!jwVar.s) {
                jwVar.s = true;
                jwVar.b();
            }
        }
    }

    @Override // defpackage.iw
    public jw b() {
        kw rwVar;
        jw jwVar;
        synchronized (this.c) {
            try {
                b1 b1Var = (b1) this.b;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    b1Var.getUniqueDrawingId();
                }
                if (i >= 29) {
                    rwVar = new pw();
                } else if (f) {
                    try {
                        rwVar = new nw((b1) this.b, new sa(), new ra());
                    } catch (Throwable unused) {
                        f = false;
                        rwVar = new rw(e((b1) this.b));
                    }
                } else {
                    rwVar = new rw(e((b1) this.b));
                }
                jwVar = new jw(rwVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jwVar;
    }

    public void c(u20 u20Var, float f2, long j) {
        ra raVar = u20Var.d;
        float fFloatValue = ((Number) ((j5) this.c).c()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = qc.b(j, fFloatValue);
            if (!this.a) {
                xo.at(u20Var, jB, f2, 0L, 124);
                return;
            }
            float fD = pq0.d(raVar.c());
            float fB = pq0.b(raVar.c());
            o6 o6Var = raVar.e;
            long jR = o6Var.r();
            o6Var.o().l();
            ((o6) ((bu) o6Var.a).e).o().e(0.0f, 0.0f, fD, fB, 1);
            xo.at(u20Var, jB, f2, 0L, 124);
            o6Var.o().i();
            o6Var.ab(jR);
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [pu, x10] */
    public void d(yz yzVar, xj xjVar) {
        ArrayList arrayList = (ArrayList) this.d;
        boolean z = yzVar instanceof wx;
        if (z) {
            arrayList.add(yzVar);
        } else if (yzVar instanceof xx) {
            arrayList.remove(((xx) yzVar).a);
        } else if (yzVar instanceof ps) {
            arrayList.add(yzVar);
        } else if (yzVar instanceof qs) {
            arrayList.remove(((qs) yzVar).a);
        } else if (yzVar instanceof qo) {
            arrayList.add(yzVar);
        } else if (yzVar instanceof ro) {
            arrayList.remove(((ro) yzVar).a);
        } else if (!(yzVar instanceof po)) {
            return;
        } else {
            arrayList.remove(((po) yzVar).a);
        }
        yz yzVar2 = (yz) kc.ax(arrayList);
        if (f00.h((yz) this.e, yzVar2)) {
            return;
        }
        ji jiVar = null;
        if (yzVar2 != null) {
            ck0 ck0Var = (ck0) ((x10) this.b).a();
            float f2 = z ? ck0Var.c : yzVar instanceof ps ? ck0Var.b : yzVar instanceof qo ? ck0Var.a : 0.0f;
            yy0 yy0Var = nk0.a;
            if (!(yzVar2 instanceof wx) && ((yzVar2 instanceof ps) || (yzVar2 instanceof qo))) {
                yy0Var = new yy0(45, 0, fp.b);
            }
            i60.an(xjVar, null, new rs0(this, f2, yy0Var, null), 3);
        } else {
            yz yzVar3 = (yz) this.e;
            yy0 yy0Var2 = nk0.a;
            if (!(yzVar3 instanceof wx) && !(yzVar3 instanceof ps) && (yzVar3 instanceof qo)) {
                yy0Var2 = new yy0(150, 0, fp.b);
            }
            i60.an(xjVar, null, new c(this, yy0Var2, jiVar, 18), 3);
        }
        this.e = yzVar2;
    }

    public to e(b1 b1Var) {
        n11 n11Var = (n11) this.d;
        if (n11Var != null) {
            return n11Var;
        }
        n11 n11Var2 = new n11(b1Var.getContext());
        n11Var2.setClipChildren(false);
        n11Var2.setClipToPadding(false);
        n11Var2.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        b1Var.addView(n11Var2, -1);
        this.d = n11Var2;
        return n11Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int f(f1 f1Var, b1 b1Var, boolean z) {
        Object[] objArr;
        int i;
        int i2;
        mx mxVar = (mx) this.c;
        px pxVar = (px) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            f1 f1VarL = ((bu) this.d).l(f1Var, b1Var);
            e50 e50Var = (e50) f1VarL.e;
            int iC = e50Var.c();
            for (int i3 = 0; i3 < iC; i3++) {
                pg0 pg0Var = (pg0) e50Var.d(i3);
                if (!pg0Var.d && !pg0Var.h) {
                }
                objArr = false;
                break;
            }
            objArr = true;
            int iC2 = e50Var.c();
            for (int i4 = 0; i4 < iC2; i4++) {
                pg0 pg0Var2 = (pg0) e50Var.d(i4);
                if (objArr != false || d41.k(pg0Var2)) {
                    ((s20) this.b).v(pg0Var2.c, (px) this.e, pg0Var2.i, true);
                    if (!pxVar.d.g()) {
                        mxVar.a(pg0Var2.a, pxVar, d41.k(pg0Var2));
                        pxVar.clear();
                    }
                }
            }
            boolean zB = mxVar.b(f1VarL, z);
            int iC3 = e50Var.c();
            int i5 = 0;
            while (true) {
                if (i5 >= iC3) {
                    i = 0;
                    break;
                }
                pg0 pg0Var3 = (pg0) e50Var.d(i5);
                if (!xa0.b(d41.ai(pg0Var3, true), 0L) && pg0Var3.b()) {
                    i = 1;
                    break;
                }
                i5++;
            }
            int iC4 = e50Var.c();
            int i6 = 0;
            while (true) {
                if (i6 >= iC4) {
                    i2 = 0;
                    break;
                }
                if (((pg0) e50Var.d(i6)).b()) {
                    i2 = 1;
                    break;
                }
                i6++;
            }
            int i7 = (zB ? 1 : 0) | (i << 1) | (i2 << 2);
            this.a = false;
            return i7;
        } catch (Throwable th) {
            this.a = false;
            throw th;
        }
    }
}
