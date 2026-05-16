package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import com.example.gnd.MainActivity;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes.dex */
public final class u1 extends x10 implements pu {
    public static final u1 aa;
    public static final u1 ab;
    public static final u1 ac;
    public static final u1 ad;
    public static final u1 ae;
    public static final u1 af;
    public static final u1 ag;
    public static final u1 ah;
    public static final u1 ai;
    public static final u1 f;
    public static final u1 g;
    public static final u1 h;
    public static final u1 i;
    public static final u1 j;
    public static final u1 k;
    public static final u1 l;
    public static final u1 m;
    public static final u1 n;
    public static final u1 o;
    public static final u1 p;
    public static final u1 q;
    public static final u1 r;
    public static final u1 s;
    public static final u1 t;
    public static final u1 u;
    public static final u1 v;
    public static final u1 w;
    public static final u1 x;
    public static final u1 y;
    public static final u1 z;
    public final /* synthetic */ int e;

    static {
        int i2 = 0;
        f = new u1(i2, 0);
        g = new u1(i2, 1);
        h = new u1(i2, 2);
        i = new u1(i2, 3);
        j = new u1(i2, 4);
        k = new u1(i2, 5);
        l = new u1(i2, 6);
        m = new u1(i2, 7);
        n = new u1(i2, 8);
        o = new u1(i2, 9);
        p = new u1(i2, 10);
        q = new u1(i2, 11);
        r = new u1(i2, 12);
        s = new u1(i2, 13);
        t = new u1(i2, 14);
        u = new u1(i2, 15);
        v = new u1(i2, 16);
        w = new u1(i2, 17);
        x = new u1(i2, 18);
        y = new u1(i2, 19);
        z = new u1(i2, 20);
        aa = new u1(i2, 21);
        ab = new u1(i2, 22);
        ac = new u1(i2, 23);
        ad = new u1(i2, 24);
        ae = new u1(i2, 25);
        af = new u1(i2, 26);
        ag = new u1(i2, 27);
        ah = new u1(i2, 28);
        ai = new u1(i2, 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u1(int i2, int i3) {
        super(i2);
        this.e = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pu
    public final Object a() throws Throwable {
        cr crVarA;
        pj pjVarZ;
        Choreographer choreographer;
        Object[] objArr = 0;
        switch (this.e) {
            case 0:
                d2.b("LocalConfiguration");
                throw null;
            case 1:
                d2.b("LocalContext");
                throw null;
            case 2:
                d2.b("LocalImageVectorCache");
                throw null;
            case 3:
                d2.b("LocalResourceIdCache");
                throw null;
            case 4:
                d2.b("LocalView");
                throw null;
            case 5:
                return "DEFAULT_TEST_TAG";
            case 6:
                return UUID.randomUUID();
            case 7:
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    kl klVar = wm.a;
                    cx cxVar = x50.a;
                    gv w4Var = new w4(2, objArr == true ? 1 : 0, 0);
                    Thread threadCurrentThread = Thread.currentThread();
                    bw bwVar = bw.u;
                    a aVar = (a) cxVar.k(bwVar);
                    pq pqVar = pq.d;
                    if (aVar == null) {
                        crVarA = ux0.a();
                        pjVarZ = e00.z(pqVar, pk.an(cxVar, crVarA), true);
                        kl klVar2 = wm.a;
                        if (pjVarZ != klVar2 && pjVarZ.k(bwVar) == null) {
                            pjVarZ = pjVarZ.j(klVar2);
                        }
                    } else {
                        if (aVar instanceof cr) {
                        }
                        crVarA = (cr) ux0.a.get();
                        pjVarZ = e00.z(pqVar, cxVar, true);
                        kl klVar3 = wm.a;
                        if (pjVarZ != klVar3 && pjVarZ.k(bwVar) == null) {
                            pjVarZ = pjVarZ.j(klVar3);
                        }
                    }
                    e8 e8Var = new e8(pjVarZ, threadCurrentThread, crVarA);
                    e8Var.bg(ck.d, e8Var, w4Var);
                    cr crVar = e8Var.h;
                    if (crVar != null) {
                        int i2 = cr.i;
                        crVar.n(false);
                    }
                    while (!Thread.interrupted()) {
                        try {
                            long jO = crVar != null ? crVar.o() : Long.MAX_VALUE;
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a10.d;
                            if (atomicReferenceFieldUpdater.get(e8Var) instanceof iy) {
                                LockSupport.parkNanos(e8Var, jO);
                            } else {
                                if (crVar != null) {
                                    int i3 = cr.i;
                                    crVar.h(false);
                                }
                                Object objAp = az0.ap(atomicReferenceFieldUpdater.get(e8Var));
                                wd wdVar = objAp instanceof wd ? (wd) objAp : null;
                                if (wdVar != null) {
                                    throw wdVar.a;
                                }
                                choreographer = (Choreographer) objAp;
                            }
                        } catch (Throwable th) {
                            if (crVar != null) {
                                int i4 = cr.i;
                                crVar.h(false);
                            }
                            throw th;
                        }
                    }
                    InterruptedException interruptedException = new InterruptedException();
                    e8Var.ab(interruptedException);
                    throw interruptedException;
                } else {
                    choreographer = Choreographer.getInstance();
                }
                z4 z4Var = new z4(choreographer, d41.t(Looper.getMainLooper()));
                return pk.an(z4Var, z4Var.o);
            case MainActivity.$stable /* 8 */:
                return cd.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 15);
            case 9:
                return Boolean.TRUE;
            case 10:
            case 11:
                return null;
            case 12:
                og.b("LocalAutofillManager");
                throw null;
            case 13:
                og.b("LocalAutofillTree");
                throw null;
            case 14:
                og.b("LocalClipboard");
                throw null;
            case 15:
                og.b("LocalClipboardManager");
                throw null;
            case 16:
                return Boolean.TRUE;
            case 17:
                og.b("LocalDensity");
                throw null;
            case 18:
                og.b("LocalFocusManager");
                throw null;
            case 19:
                og.b("LocalFontFamilyResolver");
                throw null;
            case 20:
                og.b("LocalFontLoader");
                throw null;
            case 21:
                og.b("LocalGraphicsContext");
                throw null;
            case 22:
                og.b("LocalHapticFeedback");
                throw null;
            case 23:
                og.b("LocalInputManager");
                throw null;
            case 24:
                og.b("LocalLayoutDirection");
                throw null;
            case 25:
                return null;
            case 26:
                return Boolean.FALSE;
            case 27:
            case 28:
                return null;
            default:
                og.b("LocalTextToolbar");
                throw null;
        }
    }
}
