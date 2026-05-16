package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class li0 extends tt0 implements hv {
    public List h;
    public List i;
    public List j;
    public r80 k;
    public r80 l;
    public r80 m;
    public Set n;
    public r80 o;
    public int p;
    public /* synthetic */ o70 q;
    public final /* synthetic */ mi0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li0(mi0 mi0Var, ji jiVar) {
        super(3, jiVar);
        this.r = mi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(defpackage.mi0 r22, java.util.List r23, java.util.List r24, java.util.List r25, defpackage.r80 r26, defpackage.r80 r27, defpackage.r80 r28, defpackage.r80 r29) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li0.q(mi0, java.util.List, java.util.List, java.util.List, r80, r80, r80, r80):void");
    }

    public static final void r(List list, mi0 mi0Var) {
        list.clear();
        synchronized (mi0Var.b) {
            try {
                ArrayList arrayList = mi0Var.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((v70) arrayList.get(i));
                }
                mi0Var.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        li0 li0Var = new li0(this.r, (ji) obj3);
        li0Var.q = (o70) obj2;
        li0Var.o(wz0.a);
        return yj.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0122 -> B:44:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01c3 -> B:12:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li0.o(java.lang.Object):java.lang.Object");
    }
}
