package defpackage;

import android.graphics.Typeface;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rt implements qt {
    public final n31 a;
    public final z2 b;
    public final f1 c;
    public final vt d;
    public final bu e;

    public rt(n31 n31Var, z2 z2Var) {
        f1 f1Var = st.a;
        f1 f1Var2 = st.a;
        vt vtVar = new vt();
        ut utVar = vt.a;
        cx cxVar = vm.a;
        utVar.getClass();
        i60.c(pk.an(utVar, cxVar).j(pq.d).j(new lt0(null)));
        bu buVar = new bu(13);
        this.a = n31Var;
        this.b = z2Var;
        this.c = f1Var;
        this.d = vtVar;
        this.e = buVar;
        new h(3, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0 A[Catch: Exception -> 0x00a8, TRY_ENTER, TryCatch #1 {Exception -> 0x00a8, blocks: (B:25:0x0042, B:27:0x0055, B:30:0x005a, B:32:0x005e, B:38:0x0077, B:55:0x00a0, B:56:0x00a7, B:34:0x0067, B:35:0x0069, B:36:0x006c, B:37:0x0072), top: B:64:0x0042 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final nz0 a(mz0 mz0Var) {
        Typeface typefaceC;
        nz0 nz0Var;
        Object objRemove;
        f1 f1Var = this.c;
        synchronized (((yf0) f1Var.e)) {
            try {
                nz0 nz0Var2 = (nz0) ((r50) f1Var.f).a(mz0Var);
                if (nz0Var2 != null) {
                    if (nz0Var2.e) {
                        return nz0Var2;
                    }
                    r50 r50Var = (r50) f1Var.f;
                    synchronized (r50Var.c) {
                        bu buVar = r50Var.b;
                        buVar.getClass();
                        objRemove = ((LinkedHashMap) buVar.e).remove(mz0Var);
                        if (objRemove != null) {
                            r50Var.d--;
                        }
                    }
                }
                try {
                    this.d.getClass();
                    fu0 fu0Var = mz0Var.a;
                    yf0 yf0Var = (yf0) this.e.e;
                    int i = mz0Var.c;
                    iu iuVar = mz0Var.b;
                    if (fu0Var == null || (fu0Var instanceof yk)) {
                        switch (yf0Var.d) {
                            case 1:
                                typefaceC = yf0.c(null, iuVar, i);
                                break;
                            default:
                                typefaceC = yf0.e(null, iuVar, i);
                                break;
                        }
                    } else {
                        if (!(fu0Var instanceof wv)) {
                            nz0Var = null;
                            if (nz0Var != null) {
                                throw new IllegalStateException("Could not load font");
                            }
                            synchronized (((yf0) f1Var.e)) {
                                if (((r50) f1Var.f).a(mz0Var) == null && nz0Var.e) {
                                    ((r50) f1Var.f).b(mz0Var, nz0Var);
                                }
                            }
                            return nz0Var;
                        }
                        typefaceC = yf0Var.f((wv) fu0Var, iuVar, i);
                    }
                    nz0Var = new nz0(typefaceC);
                    if (nz0Var != null) {
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final nz0 b(fu0 fu0Var, iu iuVar, int i, int i2) {
        z2 z2Var = this.b;
        z2Var.getClass();
        int i3 = z2Var.d;
        iu iuVar2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? iuVar : new iu(i60.t(iuVar.d + i3, 1, 1000));
        this.a.getClass();
        return a(new mz0(fu0Var, iuVar2, i, i2, null));
    }
}
