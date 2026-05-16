package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

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
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 662
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr0.o(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mr0(pu puVar, ji jiVar) {
        super(2, jiVar);
        this.p = (x10) puVar;
    }
}
