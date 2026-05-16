package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class mr0 extends tt0 implements gv {
    public final /* synthetic */ int h = 1;
    public int i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mr0(ContentResolver contentResolver, Uri uri, s31 s31Var, o9 o9Var, Context context, ji jiVar) {
        super(2, jiVar);
        this.l = contentResolver;
        this.m = uri;
        this.n = s31Var;
        this.o = o9Var;
        this.p = context;
    }

    @Override // defpackage.gv
    public final Object f(Object obj, Object obj2) throws Throwable {
        zr zrVar = (zr) obj;
        ji jiVar = (ji) obj2;
        switch (this.h) {
            case 0:
                ((mr0) k(jiVar, zrVar)).o(wz0.a);
                return yj.d;
            default:
                return ((mr0) k(jiVar, zrVar)).o(wz0.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [pu, x10] */
    @Override // defpackage.s7
    public final ji k(ji jiVar, Object obj) {
        switch (this.h) {
            case 0:
                mr0 mr0Var = new mr0((x10) this.p, jiVar);
                mr0Var.o = obj;
                return mr0Var;
            default:
                mr0 mr0Var2 = new mr0((ContentResolver) this.l, (Uri) this.m, (s31) this.n, (o9) this.o, (Context) this.p, jiVar);
                mr0Var2.j = obj;
                return mr0Var2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0259, code lost:
    
        r7 = r18;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Path cross not found for [B:75:0x01c2, B:87:0x01f3], limit reached: 166 */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0275 A[LOOP:0: B:68:0x019d->B:128:0x0275, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x019f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x021b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #6 {all -> 0x002b, blocks: (B:9:0x0025, B:19:0x005d, B:23:0x006f, B:25:0x0077, B:15:0x003e, B:18:0x0054), top: B:152:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0215  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v3, types: [pu, x10] */
    /* JADX WARN: Type inference failed for: r4v7, types: [pu, x10] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x0258 -> B:115:0x0259). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x009c -> B:19:0x005d). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) throws Throwable {
        gb0 gb0Var;
        zr zrVar;
        r80 r80Var;
        cv hVar;
        ya yaVarA;
        xq0 xq0VarU;
        xq0 xq0VarJ;
        Object obj2;
        Object objO;
        Set set;
        boolean z;
        gb0 gb0Var2;
        int i;
        int i2;
        Object objS;
        zr zrVar2;
        n9 n9Var;
        zr zrVar3;
        Object objB;
        n9 n9Var2;
        switch (this.h) {
            case 0:
                yj yjVar = yj.d;
                int i3 = this.i;
                int i4 = 2;
                try {
                    if (i3 == 0) {
                        i60.az(obj);
                        zrVar = (zr) this.o;
                        r80Var = new r80();
                        hVar = new h(9, r80Var);
                        yaVarA = i60.a(Integer.MAX_VALUE, 6, null);
                        n3 n3Var = new n3(4, yaVarA);
                        fr0.f(fr0.a);
                        synchronized (fr0.c) {
                            fr0.h = kc.ay(fr0.h, n3Var);
                        }
                        gb0Var = new gb0(n3Var);
                        xq0VarU = fr0.k().u(hVar);
                        ?? r12 = (x10) this.p;
                        try {
                            xq0VarJ = xq0VarU.j();
                            try {
                                Object objA = r12.a();
                                xq0VarU.c();
                                this.o = zrVar;
                                this.k = r80Var;
                                this.l = hVar;
                                this.m = yaVarA;
                                this.n = gb0Var;
                                this.j = objA;
                                this.i = 1;
                                if (zrVar.i(objA, this) == yjVar) {
                                    return yjVar;
                                }
                                obj2 = objA;
                            } finally {
                                xq0.q(xq0VarJ);
                            }
                        } finally {
                            xq0VarU.c();
                        }
                    } else if (i3 == 1) {
                        obj2 = this.j;
                        gb0Var = (gb0) this.n;
                        yaVarA = (ya) this.m;
                        hVar = (cv) this.l;
                        r80Var = (r80) this.k;
                        zrVar = (zr) this.o;
                        i60.az(obj);
                    } else if (i3 == 2) {
                        obj2 = this.j;
                        gb0Var = (gb0) this.n;
                        yaVarA = (ya) this.m;
                        hVar = (cv) this.l;
                        r80Var = (r80) this.k;
                        zrVar = (zr) this.o;
                        i60.az(obj);
                        objO = obj;
                        set = (Set) objO;
                        z = false;
                        while (true) {
                            if (z) {
                                try {
                                    Object[] objArr = r80Var.b;
                                    long[] jArr = r80Var.a;
                                    i = i4;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i5 = 0;
                                        while (true) {
                                            long j = jArr[i5];
                                            gb0Var2 = gb0Var;
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i6 = 8;
                                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                                int i8 = 0;
                                                while (i8 < i7) {
                                                    if ((j & 255) < 128) {
                                                        i2 = i6;
                                                        try {
                                                            if (set.contains(objArr[(i5 << 3) + i8])) {
                                                            }
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            gb0Var = gb0Var2;
                                                            gb0Var.b();
                                                            throw th;
                                                        }
                                                    } else {
                                                        i2 = i6;
                                                    }
                                                    j >>= i2;
                                                    i8++;
                                                    i6 = i2;
                                                }
                                                if (i7 == i6) {
                                                }
                                            }
                                            if (i5 != length) {
                                                i5++;
                                                gb0Var = gb0Var2;
                                            }
                                        }
                                    } else {
                                        gb0Var2 = gb0Var;
                                    }
                                    z = false;
                                    objS = yaVarA.s();
                                    if (objS instanceof jb) {
                                        objS = null;
                                    }
                                    set = (Set) objS;
                                    if (set != null) {
                                        i4 = i;
                                        gb0Var = gb0Var2;
                                    } else {
                                        if (z) {
                                            try {
                                                r80Var.b();
                                                xq0VarU = fr0.k().u(hVar);
                                                ?? r4 = (x10) this.p;
                                                try {
                                                    Object objA2 = r4.a();
                                                    xq0VarU.c();
                                                    if (f00.h(objA2, obj2)) {
                                                        gb0Var = gb0Var2;
                                                    } else {
                                                        this.o = zrVar;
                                                        this.k = r80Var;
                                                        this.l = hVar;
                                                        this.m = yaVarA;
                                                        gb0Var = gb0Var2;
                                                        this.n = gb0Var;
                                                        this.j = objA2;
                                                        this.i = 3;
                                                        if (zrVar.i(objA2, this) == yjVar) {
                                                            return yjVar;
                                                        }
                                                        obj2 = objA2;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            } catch (Throwable th3) {
                                                try {
                                                    throw th3;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    throw th;
                                                }
                                            }
                                            xq0VarJ = xq0VarU.j();
                                            break;
                                        }
                                        i4 = i;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    gb0Var2 = gb0Var;
                                }
                            } else {
                                i = i4;
                                gb0Var2 = gb0Var;
                            }
                            z = true;
                            objS = yaVarA.s();
                            if (objS instanceof jb) {
                            }
                            set = (Set) objS;
                            if (set != null) {
                            }
                        }
                    } else {
                        if (i3 != 3) {
                            wc.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj2 = this.j;
                        gb0Var = (gb0) this.n;
                        yaVarA = (ya) this.m;
                        hVar = (cv) this.l;
                        r80Var = (r80) this.k;
                        zrVar = (zr) this.o;
                        i60.az(obj);
                        i = 2;
                        i4 = i;
                    }
                    this.o = zrVar;
                    this.k = r80Var;
                    this.l = hVar;
                    this.m = yaVarA;
                    this.n = gb0Var;
                    this.j = obj2;
                    this.i = i4;
                    objO = yaVarA.o(this);
                    if (objO == yjVar) {
                        return yjVar;
                    }
                    set = (Set) objO;
                    z = false;
                    while (true) {
                        if (z) {
                        }
                        z = true;
                        objS = yaVarA.s();
                        if (objS instanceof jb) {
                        }
                        set = (Set) objS;
                        if (set != null) {
                        }
                        i4 = i;
                        gb0Var = gb0Var2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    gb0Var.b();
                    throw th;
                }
                break;
            default:
                s31 s31Var = (s31) this.n;
                ContentResolver contentResolver = (ContentResolver) this.l;
                yj yjVar2 = yj.d;
                int i9 = this.i;
                try {
                    if (i9 == 0) {
                        i60.az(obj);
                        zrVar2 = (zr) this.j;
                        contentResolver.registerContentObserver((Uri) this.m, false, s31Var);
                        n9Var = new n9((o9) this.o);
                    } else if (i9 == 1) {
                        n9Var2 = (n9) this.k;
                        zr zrVar4 = (zr) this.j;
                        i60.az(obj);
                        zrVar3 = zrVar4;
                        objB = obj;
                        if (((Boolean) objB).booleanValue()) {
                            contentResolver.unregisterContentObserver(s31Var);
                            return wz0.a;
                        }
                        n9Var2.c();
                        Float f = new Float(Settings.Global.getFloat(((Context) this.p).getContentResolver(), "animator_duration_scale", 1.0f));
                        this.j = zrVar3;
                        this.k = n9Var2;
                        this.i = 2;
                        if (zrVar3.i(f, this) == yjVar2) {
                            return yjVar2;
                        }
                        zr zrVar5 = zrVar3;
                        n9Var = n9Var2;
                        zrVar2 = zrVar5;
                    } else {
                        if (i9 != 2) {
                            wc.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        n9 n9Var3 = (n9) this.k;
                        zr zrVar6 = (zr) this.j;
                        i60.az(obj);
                        n9Var = n9Var3;
                        zrVar2 = zrVar6;
                    }
                    this.j = zrVar2;
                    this.k = n9Var;
                    this.i = 1;
                    objB = n9Var.b(this);
                    if (objB == yjVar2) {
                        return yjVar2;
                    }
                    n9 n9Var4 = n9Var;
                    zrVar3 = zrVar2;
                    n9Var2 = n9Var4;
                    if (((Boolean) objB).booleanValue()) {
                    }
                } catch (Throwable th7) {
                    contentResolver.unregisterContentObserver(s31Var);
                    throw th7;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mr0(pu puVar, ji jiVar) {
        super(2, jiVar);
        this.p = (x10) puVar;
    }
}
