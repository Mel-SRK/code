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
    */
    public final void bv(ig0 ig0Var, jg0 jg0Var) {
        int i;
        int i2;
        la laVar;
        la laVar2;
        synchronized (this.y) {
            a90 a90Var = this.z;
            a90Var.c(a90Var.f, this.x);
        }
        try {
            int iOrdinal = jg0Var.ordinal();
            if (iOrdinal == 0) {
                a90 a90Var2 = this.z;
                Object[] objArr = a90Var2.d;
                i = a90Var2.f;
                for (i2 = 0; i2 < i; i2++) {
                    yt0 yt0Var = (yt0) objArr[i2];
                    if (jg0Var == yt0Var.g && (laVar = yt0Var.f) != null) {
                        yt0Var.f = null;
                        laVar.h(ig0Var);
                    }
                }
            } else if (iOrdinal == 1) {
                a90 a90Var3 = this.z;
                int i3 = a90Var3.f - 1;
                Object[] objArr2 = a90Var3.d;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        yt0 yt0Var2 = (yt0) objArr2[i3];
                        if (jg0Var == yt0Var2.g && (laVar2 = yt0Var2.f) != null) {
                            yt0Var2.f = null;
                            laVar2.h(ig0Var);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new xd();
                }
                a90 a90Var22 = this.z;
                Object[] objArr3 = a90Var22.d;
                i = a90Var22.f;
                while (i2 < i) {
                }
            }
            this.z.g();
        } catch (Throwable th) {
            this.z.g();
            throw th;
        }
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
