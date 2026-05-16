package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class re0 implements pu {
    public final /* synthetic */ se0 d;

    public re0(se0 se0Var) {
        this.d = se0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [m80] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, n10] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v3, types: [m80] */
    @Override // defpackage.pu
    public final Object a() {
        ArrayList arrayList = this.d.a;
        q80 q80Var = new q80(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ?? r5 = (n10) arrayList.get(i);
            Object obj = r5.b;
            int i2 = r5.a;
            Object b10Var = obj != null ? new b10(Integer.valueOf(i2), r5.b) : Integer.valueOf(i2);
            int iF = q80Var.f(b10Var);
            boolean z = iF < 0;
            Object obj2 = z ? null : q80Var.c[iF];
            if (obj2 != null) {
                if (obj2 instanceof m80) {
                    ?? r9 = (m80) obj2;
                    r9.a(r5);
                    r5 = r9;
                } else {
                    Object[] objArr = ta0.a;
                    ?? m80Var = new m80(2);
                    m80Var.a(obj2);
                    m80Var.a(r5);
                    r5 = m80Var;
                }
            }
            if (z) {
                int i3 = ~iF;
                q80Var.b[i3] = b10Var;
                q80Var.c[i3] = r5;
            } else {
                q80Var.c[iF] = r5;
            }
        }
        return new a80(q80Var);
    }
}
