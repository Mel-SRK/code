package defpackage;

import com.example.gnd.MainActivity;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements cv {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        String strConcat;
        StringBuilder sb;
        int i;
        switch (this.d) {
            case 0:
                return obj == ((i) this.e) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                ve0 ve0Var = (ve0) this.e;
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                StringBuilder sb2 = new StringBuilder();
                Object key = entry.getKey();
                sb2.append(key == ve0Var ? "(this Map)" : String.valueOf(key));
                sb2.append('=');
                Object value = entry.getValue();
                sb2.append(value != ve0Var ? String.valueOf(value) : "(this Map)");
                return sb2.toString();
            case 2:
                op opVar = (op) obj;
                String str = ((op) this.e) == opVar ? " > " : "   ";
                if (opVar instanceof pd) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    pd pdVar = (pd) opVar;
                    sb.append(pdVar.a.e.length());
                    sb.append(", newCursorPosition=");
                    i = pdVar.b;
                } else {
                    if (!(opVar instanceof vp0)) {
                        if (opVar instanceof up0) {
                            strConcat = ((up0) opVar).toString();
                        } else if (opVar instanceof xl) {
                            strConcat = ((xl) opVar).toString();
                        } else if (opVar instanceof yl) {
                            strConcat = ((yl) opVar).toString();
                        } else if (opVar instanceof wp0) {
                            strConcat = ((wp0) opVar).toString();
                        } else if (opVar instanceof mr) {
                            strConcat = "FinishComposingTextCommand()";
                        } else if (opVar instanceof wl) {
                            strConcat = "DeleteAllCommand()";
                        } else {
                            String strA = yi0.a(opVar.getClass()).a();
                            if (strA == null) {
                                strA = "{anonymous EditCommand}";
                            }
                            strConcat = "Unknown EditCommand: ".concat(strA);
                        }
                        return str.concat(strConcat);
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    vp0 vp0Var = (vp0) opVar;
                    sb.append(vp0Var.a.e.length());
                    sb.append(", newCursorPosition=");
                    i = vp0Var.b;
                }
                strConcat = n5.h(sb, i, ')');
                return str.concat(strConcat);
            case 3:
                mz0 mz0Var = (mz0) obj;
                return ((rt) this.e).a(new mz0(null, mz0Var.b, mz0Var.c, mz0Var.d, mz0Var.e)).d;
            case 4:
                w80 w80Var = (w80) this.e;
                String str2 = (String) obj;
                str2.getClass();
                w80Var.setValue(str2);
                return wz0.a;
            case 5:
                ((i90) this.e).d(null);
                return wz0.a;
            case 6:
                ((jg) this.e).u(obj);
                return wz0.a;
            case 7:
                mi0 mi0Var = (mi0) this.e;
                Throwable th = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th);
                synchronized (mi0Var.b) {
                    try {
                        t00 t00Var = mi0Var.c;
                        if (t00Var != null) {
                            ps0 ps0Var = mi0Var.t;
                            ii0 ii0Var = ii0.e;
                            ps0Var.getClass();
                            ps0Var.h(null, ii0Var);
                            t00Var.a(cancellationException);
                            mi0Var.q = null;
                            t00Var.t(new yw(2, mi0Var, th));
                        } else {
                            mi0Var.d = cancellationException;
                            ps0 ps0Var2 = mi0Var.t;
                            ii0 ii0Var2 = ii0.d;
                            ps0Var2.getClass();
                            ps0Var2.h(null, ii0Var2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return wz0.a;
            case MainActivity.$stable /* 8 */:
                xq0 xq0Var = (xq0) ((cv) this.e).g((cr0) obj);
                synchronized (fr0.c) {
                    fr0.d = fr0.d.e(xq0Var.g());
                }
                return xq0Var;
            case 9:
                r80 r80Var = (r80) this.e;
                if (obj instanceof us0) {
                    ((us0) obj).f(4);
                }
                r80Var.a(obj);
                return wz0.a;
            default:
                rr0 rr0Var = (rr0) this.e;
                synchronized (rr0Var.g) {
                    qr0 qr0Var = rr0Var.i;
                    qr0Var.getClass();
                    Object obj2 = qr0Var.b;
                    obj2.getClass();
                    int i2 = qr0Var.d;
                    l80 l80Var = qr0Var.c;
                    if (l80Var == null) {
                        l80Var = new l80();
                        qr0Var.c = l80Var;
                        qr0Var.f.l(obj2, l80Var);
                    }
                    qr0Var.c(obj, i2, obj2, l80Var);
                }
                return wz0.a;
        }
    }

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
    }
}
