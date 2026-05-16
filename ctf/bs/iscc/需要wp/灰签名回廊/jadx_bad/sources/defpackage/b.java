package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final class b extends x10 implements pu {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, Object obj) {
        super(0);
        this.e = i;
        this.f = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x016e, code lost:
    
        continue;
     */
    @Override // defpackage.pu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a() {
        boolean zO0;
        switch (this.e) {
            case 0:
                ((yb) this.f).x.a();
                return Boolean.TRUE;
            case 1:
                i60.o(((w3) this.f).f, null);
                return wz0.a;
            case 2:
                ((h4) this.f).l.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return wz0.a;
            case 3:
                t1.ae((i4) this.f);
                return wz0.a;
            case 4:
                ((v4) this.f).b = null;
                return wz0.a;
            case 5:
                ((zh) this.f).a.setValue(wh.a);
                return wz0.a;
            case 6:
                return ((h30) this.f).d();
            case 7:
                return new zv0((wc0) this.f, 0.0f);
            case MainActivity.$stable /* 8 */:
                ((gt) this.f).bv();
                return wz0.a;
            case 9:
                lt ltVar = (lt) this.f;
                q0 q0Var = q0.ad;
                i70 i70VarM = ltVar.d;
                a90 a90Var = null;
                while (true) {
                    zO0 = false;
                    int i = 0;
                    if (i70VarM == null) {
                        if (!ltVar.d.q) {
                            sy.b("visitChildren called on an unattached node");
                        }
                        a90 a90Var2 = new a90(new i70[16]);
                        i70 i70Var = ltVar.d;
                        i70 i70Var2 = i70Var.i;
                        if (i70Var2 == null) {
                            pk.j(a90Var2, i70Var);
                        } else {
                            a90Var2.b(i70Var2);
                        }
                        while (true) {
                            int i2 = a90Var2.f;
                            if (i2 != 0) {
                                i70 i70VarM2 = (i70) a90Var2.j(i2 - 1);
                                if ((i70VarM2.g & 1024) == 0) {
                                    pk.j(a90Var2, i70VarM2);
                                } else {
                                    while (true) {
                                        if (i70VarM2 == null) {
                                        }
                                        if ((i70VarM2.f & 1024) != 0) {
                                            a90 a90Var3 = null;
                                            while (i70VarM2 != null) {
                                                if (i70VarM2 instanceof gt) {
                                                    gt gtVar = (gt) i70VarM2;
                                                    zO0 = gtVar.bv().a ? gtVar.O0(7) : q6.f(gtVar, 7, q0Var);
                                                } else {
                                                    if ((i70VarM2.f & 1024) != 0 && (i70VarM2 instanceof rl)) {
                                                        int i3 = 0;
                                                        for (i70 i70Var3 = ((rl) i70VarM2).s; i70Var3 != null; i70Var3 = i70Var3.i) {
                                                            if ((i70Var3.f & 1024) != 0) {
                                                                i3++;
                                                                if (i3 == 1) {
                                                                    i70VarM2 = i70Var3;
                                                                } else {
                                                                    if (a90Var3 == null) {
                                                                        a90Var3 = new a90(new i70[16]);
                                                                    }
                                                                    if (i70VarM2 != null) {
                                                                        a90Var3.b(i70VarM2);
                                                                        i70VarM2 = null;
                                                                    }
                                                                    a90Var3.b(i70Var3);
                                                                }
                                                            }
                                                        }
                                                        if (i3 == 1) {
                                                        }
                                                    }
                                                    i70VarM2 = pk.m(a90Var3);
                                                }
                                            }
                                        } else {
                                            i70VarM2 = i70VarM2.i;
                                        }
                                    }
                                }
                                break;
                            }
                        }
                    } else if (i70VarM instanceof gt) {
                        gt gtVar2 = (gt) i70VarM;
                        zO0 = gtVar2.bv().a ? gtVar2.O0(7) : q6.f(gtVar2, 7, q0Var);
                    } else {
                        if ((i70VarM.f & 1024) != 0 && (i70VarM instanceof rl)) {
                            for (i70 i70Var4 = ((rl) i70VarM).s; i70Var4 != null; i70Var4 = i70Var4.i) {
                                if ((i70Var4.f & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        i70VarM = i70Var4;
                                    } else {
                                        if (a90Var == null) {
                                            a90Var = new a90(new i70[16]);
                                        }
                                        if (i70VarM != null) {
                                            a90Var.b(i70VarM);
                                            i70VarM = null;
                                        }
                                        a90Var.b(i70Var4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        i70VarM = pk.m(a90Var);
                    }
                }
                return Boolean.valueOf(zO0);
            case 10:
                Object systemService = ((View) ((o6) this.f).a).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 11:
                Object systemService2 = ((cz) this.f).b.getContext().getSystemService("input_method");
                systemService2.getClass();
                return (InputMethodManager) systemService2;
            case 12:
                v20 v20Var = ((s20) this.f).ah;
                v20Var.o.ab = true;
                q50 q50Var = v20Var.p;
                if (q50Var != null) {
                    q50Var.v = true;
                }
                return wz0.a;
            case 13:
                return new BaseInputConnection(((i30) this.f).a, false);
            case 14:
                return (xj) ((a0) this.f).d;
            case 15:
                return ((y90) this.f).bu();
            case 16:
                cv cvVar = (cv) this.f;
                uj0 uj0Var = fa0.am;
                cvVar.g(uj0Var);
                uj0Var.s = uj0Var.m.a(uj0Var.o, uj0Var.q, uj0Var.p);
                return wz0.a;
            case 17:
                zg0 zg0Var = (zg0) this.f;
                d20 parentLayoutCoordinates = zg0Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates == null || !parentLayoutCoordinates.af()) {
                    parentLayoutCoordinates = null;
                }
                return Boolean.valueOf((parentLayoutCoordinates == null || zg0Var.m6getPopupContentSizebOM6tXw() == null) ? false : true);
            case 18:
                si0 si0Var = (si0) this.f;
                si0Var.g = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    si0Var.b();
                    Trace.endSection();
                    return wz0.a;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            case 19:
                return new BaseInputConnection(((sw0) this.f).a, false);
            case 20:
                mx0 mx0Var = (mx0) this.f;
                mx0Var.ab = null;
                q6.j(mx0Var);
                d41.aa(mx0Var);
                t1.ae(mx0Var);
                return Boolean.TRUE;
            default:
                return Long.valueOf(((ny0) this.f).b());
        }
    }
}
