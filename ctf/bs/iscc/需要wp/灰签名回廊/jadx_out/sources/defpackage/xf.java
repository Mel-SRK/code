package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class xf {
    public static final ob0 a = new ob0("provider");
    public static final ob0 b = new ob0("provider");
    public static final ob0 c = new ob0("compositionLocalMap");
    public static final ob0 d = new ob0("providers");
    public static final ob0 e = new ob0("reference");
    public static final wf f = new wf(0);

    public static final void a(ArrayList arrayList, int i, int i2) {
        int iE = e(i, arrayList);
        if (iE < 0) {
            iE = -(iE + 1);
        }
        while (iE < arrayList.size() && ((o00) arrayList.get(iE)).b < i2) {
        }
    }

    public static final void b(rq0 rq0Var, ArrayList arrayList, int i) {
        boolean zL = rq0Var.l(i);
        int[] iArr = rq0Var.b;
        if (zL) {
            arrayList.add(rq0Var.n(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            b(rq0Var, arrayList, i3);
        }
    }

    public static final void c(String str) {
        throw new cf("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Void d(String str) {
        throw new cf("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final int e(int i, List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int iM = f00.m(((o00) list.get(i3)).b, i);
            if (iM < 0) {
                i2 = i3 + 1;
            } else {
                if (iM <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f5, code lost:
    
        defpackage.wc.g("Index must be between 0 and size");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fa, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(defpackage.vq0 r17, defpackage.da0 r18) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf.f(vq0, da0):void");
    }
}
