package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zt0 extends i70 implements tg0, em, sg0 {
    public ig0 aa;
    public long ab;
    public Object r;
    public Object s;
    public tt0 t;
    public PointerInputEventHandler u;
    public hs0 v;
    public ig0 w = vt0.a;
    public final a90 x;
    public final a90 y;
    public final a90 z;

    public zt0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.r = obj;
        this.s = obj2;
        this.u = pointerInputEventHandler;
        a90 a90Var = new a90(new yt0[16]);
        this.x = a90Var;
        this.y = a90Var;
        this.z = new a90(new yt0[16]);
        this.ab = 0L;
    }

    @Override // defpackage.ql, defpackage.sg0
    public final void a() {
        bw();
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.sg0
    public final void ad(ig0 ig0Var, jg0 jg0Var, long j) {
        this.ab = j;
        if (jg0Var == jg0.d) {
            this.w = ig0Var;
        }
        ji jiVar = null;
        if (this.v == null) {
            this.v = i60.an(bi(), null, new sk(this, jiVar, 3), 1);
        }
        bv(ig0Var, jg0Var);
        ?? r4 = ig0Var.a;
        int size = r4.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ig0Var = null;
                break;
            } else if (!d41.m((pg0) r4.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.aa = ig0Var;
    }

    @Override // defpackage.sg0
    public final void as() {
        bw();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.sg0
    public final void aw() {
        ig0 ig0Var = this.aa;
        if (ig0Var == null) {
            return;
        }
        ?? r1 = ig0Var.a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            if (((pg0) r1.get(i)).d) {
                ArrayList arrayList = new ArrayList(r1.size());
                int size2 = r1.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    pg0 pg0Var = (pg0) r1.get(i2);
                    long j = pg0Var.a;
                    long j2 = pg0Var.c;
                    long j3 = pg0Var.b;
                    float f = pg0Var.e;
                    boolean z = pg0Var.d;
                    arrayList.add(new pg0(j, j3, j2, false, f, j3, j2, z, z, pg0Var.i, 0L));
                }
                ig0 ig0Var2 = new ig0(arrayList, null);
                this.w = ig0Var2;
                bv(ig0Var2, jg0.d);
                bv(ig0Var2, jg0.e);
                bv(ig0Var2, jg0.f);
                this.aa = null;
                return;
            }
        }
    }

    @Override // defpackage.em
    public final float b() {
        return pk.ay(this).z.b();
    }

    @Override // defpackage.i70
    public final void bn() {
        bw();
    }

    public final Object bu(gv gvVar, ji jiVar) {
        la laVar = new la(1, f00.x(jiVar));
        laVar.t();
        yt0 yt0Var = new yt0(this, laVar);
        synchronized (this.y) {
            this.x.b(yt0Var);
            new ll0(f00.x(f00.p(yt0Var, yt0Var, gvVar))).h(wz0.a);
        }
        laVar.v(new l1(27, yt0Var));
        return laVar.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bv(defpackage.ig0 r7, defpackage.jg0 r8) {
        /*
            r6 = this;
            a90 r0 = r6.y
            monitor-enter(r0)
            a90 r1 = r6.z     // Catch: java.lang.Throwable -> L6c
            a90 r2 = r6.x     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.f     // Catch: java.lang.Throwable -> L6c
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            xd r7 = new xd     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            a90 r0 = r6.z     // Catch: java.lang.Throwable -> L21
            int r3 = r0.f     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.d     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            yt0 r2 = (defpackage.yt0) r2     // Catch: java.lang.Throwable -> L21
            jg0 r4 = r2.g     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            la r4 = r2.f     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.f = r1     // Catch: java.lang.Throwable -> L21
            r4.h(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            a90 r0 = r6.z     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.d     // Catch: java.lang.Throwable -> L21
            int r0 = r0.f     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            yt0 r4 = (defpackage.yt0) r4     // Catch: java.lang.Throwable -> L21
            jg0 r5 = r4.g     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            la r5 = r4.f     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.f = r1     // Catch: java.lang.Throwable -> L21
            r5.h(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            a90 r7 = r6.z
            r7.g()
            return
        L66:
            a90 r8 = r6.z
            r8.g()
            throw r7
        L6c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.bv(ig0, jg0):void");
    }

    public final void bw() {
        hs0 hs0Var = this.v;
        if (hs0Var != null) {
            hs0Var.ac(new m70("Pointer input was reset", 0));
            this.v = null;
        }
    }

    @Override // defpackage.em
    public final float k() {
        return pk.ay(this).z.k();
    }
}
