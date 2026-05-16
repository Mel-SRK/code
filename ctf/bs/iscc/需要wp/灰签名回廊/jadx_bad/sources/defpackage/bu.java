package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Region;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.example.gnd.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class bu implements xp, qh0, yr {
    public static final bu f = new bu(0, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public final /* synthetic */ int d;
    public Object e;

    public bu(int i) {
        this.d = i;
        switch (i) {
            case 5:
                this.e = new wr0(i60.e);
                break;
            case 11:
                this.e = new LinkedHashMap(0, 0.75f, true);
                break;
            case 13:
                this.e = Build.VERSION.SDK_INT >= 28 ? new yf0(1) : new yf0(2);
                break;
            case 14:
                this.e = new e50(10);
                break;
            case 19:
                this.e = bo0.m(Boolean.FALSE);
                break;
            case 20:
                this.e = new Region();
                break;
            default:
                this.e = new a90(new kh[16]);
                break;
        }
    }

    @Override // defpackage.xp
    public void a(final i60 i60Var) {
        sg sgVar = new sg("EmojiCompatInitializer");
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), sgVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: cq
            @Override // java.lang.Runnable
            public final void run() {
                bu buVar = this.d;
                i60 i60Var2 = i60Var;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                try {
                    cu cuVarS = d41.s((Context) buVar.e);
                    if (cuVarS == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    zt ztVar = (zt) cuVarS.a;
                    synchronized (ztVar.g) {
                        ztVar.i = threadPoolExecutor2;
                    }
                    cuVarS.a.a(new dq(i60Var2, threadPoolExecutor2));
                } catch (Throwable th) {
                    i60Var2.ar(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v4, types: [gv, tt0] */
    @Override // defpackage.yr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(zr zrVar, ji jiVar) throws Throwable {
        n nVar;
        Throwable th;
        il0 il0Var;
        if (jiVar instanceof n) {
            nVar = (n) jiVar;
            int i = nVar.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                nVar.j = i - Integer.MIN_VALUE;
            } else {
                nVar = new n(this, jiVar);
            }
        }
        Object obj = nVar.h;
        int i2 = nVar.j;
        wz0 wz0Var = wz0.a;
        if (i2 != 0) {
            if (i2 != 1) {
                wc.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            il0Var = nVar.g;
            try {
                i60.az(obj);
                il0Var.p();
                return wz0Var;
            } catch (Throwable th2) {
                th = th2;
                il0Var.p();
                throw th;
            }
        }
        i60.az(obj);
        pj pjVar = nVar.e;
        pjVar.getClass();
        il0 il0Var2 = new il0(zrVar, pjVar);
        try {
            nVar.g = il0Var2;
            nVar.j = 1;
            Object objF = ((tt0) this.e).f(il0Var2, nVar);
            yj yjVar = yj.d;
            if (objF != yjVar) {
                objF = wz0Var;
            }
            if (objF == yjVar) {
                return yjVar;
            }
            il0Var = il0Var2;
            il0Var.p();
            return wz0Var;
        } catch (Throwable th3) {
            th = th3;
            il0Var = il0Var2;
            il0Var.p();
            throw th;
        }
    }

    @Override // defpackage.qh0
    public void d(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case MainActivity.$stable /* 8 */:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.e).setResultCode(i);
    }

    public void e(s20 s20Var) {
        if (!s20Var.ae()) {
            sy.b("DepthSortedSet.add called on an unattached node");
        }
        ((wr0) this.e).add(s20Var);
    }

    public void f(CancellationException cancellationException) {
        a90 a90Var = (a90) this.e;
        int i = a90Var.f;
        ja[] jaVarArr = new ja[i];
        for (int i2 = 0; i2 < i; i2++) {
            jaVarArr[i2] = ((kh) a90Var.d[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            jaVarArr[i3].n(cancellationException);
        }
        if (a90Var.f == 0) {
            return;
        }
        wc.q("uncancelled requests present");
    }

    public ur g(int i) {
        switch (this.d) {
            case 27:
                return (vr) ((ArrayList) this.e).get(i);
            case 28:
                return (vr) this.e;
            default:
                return (ur) this.e;
        }
    }

    public ms0 h() {
        yp ypVarA = yp.a();
        if (ypVarA.c() == 1) {
            return new fy(true);
        }
        me0 me0VarM = bo0.m(Boolean.FALSE);
        dl dlVar = new dl(me0VarM, this);
        ypVarA.a.writeLock().lock();
        try {
            if (ypVarA.c == 1 || ypVarA.c == 2) {
                ypVarA.d.post(new wp(Arrays.asList(dlVar), ypVarA.c, null));
            } else {
                ypVarA.b.add(dlVar);
            }
            ypVarA.a.writeLock().unlock();
            return me0VarM;
        } catch (Throwable th) {
            ypVarA.a.writeLock().unlock();
            throw th;
        }
    }

    public void i() {
        View view = (View) this.e;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void j(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.e).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public f1 l(f1 f1Var, b1 b1Var) {
        Object obj;
        int i;
        long jAd;
        long j;
        boolean z;
        Object obj2 = pk.d;
        e50 e50Var = (e50) this.e;
        List list = (List) f1Var.e;
        e50 e50Var2 = new e50(list.size());
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            rg0 rg0Var = (rg0) list.get(i2);
            long j2 = rg0Var.a;
            int iN = e00.n(e50Var.e, e50Var.g, j2);
            if (iN < 0 || (obj = e50Var.f[iN]) == obj2) {
                obj = null;
            }
            qg0 qg0Var = (qg0) obj;
            if (qg0Var == null) {
                i = i2;
                j = rg0Var.b;
                jAd = rg0Var.d;
                z = false;
            } else {
                long j3 = qg0Var.a;
                boolean z2 = qg0Var.c;
                i = i2;
                jAd = b1Var.ad(qg0Var.b);
                j = j3;
                z = z2;
            }
            long j4 = rg0Var.a;
            List list2 = list;
            int i3 = size;
            e50Var2.b(j4, new pg0(j4, rg0Var.b, rg0Var.d, rg0Var.e, rg0Var.f, j, jAd, z, rg0Var.g, rg0Var.i, rg0Var.j, rg0Var.k));
            boolean z3 = rg0Var.e;
            if (z3) {
                e50Var.b(j2, new qg0(rg0Var.b, rg0Var.c, z3));
            } else {
                int iN2 = e00.n(e50Var.e, e50Var.g, j2);
                if (iN2 >= 0) {
                    Object[] objArr = e50Var.f;
                    if (objArr[iN2] != obj2) {
                        objArr[iN2] = obj2;
                        e50Var.d = true;
                    }
                }
            }
            i2 = i + 1;
            list = list2;
            size = i3;
        }
        return new f1(6, e50Var2, f1Var);
    }

    public boolean m(s20 s20Var) {
        if (!s20Var.ae()) {
            sy.b("DepthSortedSet.remove called on an unattached node");
        }
        return ((wr0) this.e).remove(s20Var);
    }

    public void n() {
        a90 a90Var = (a90) this.e;
        int i = 0;
        int i2 = new sz(0, a90Var.f - 1, 1).e;
        if (i2 >= 0) {
            while (true) {
                ((kh) a90Var.d[i]).b.h(wz0.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        a90Var.g();
    }

    public void o(float f2, float f3, long j) {
        oa oaVarO = ((o6) this.e).o();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        oaVarO.f(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        oaVarO.b(f2, f3);
        oaVarO.f(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void p() {
        View viewFindViewById;
        View view = (View) this.e;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new m0(7, viewFindViewById));
    }

    public void q(float f2, float f3) {
        ((o6) this.e).o().f(f2, f3);
    }

    public void r(lw0 lw0Var, long j, boolean z, wc wcVar) {
        cw0 cw0Var = (cw0) this.e;
        cw0Var.n(hx0.b(cw0.a(cw0Var, lw0Var, j, z, false, wcVar, false)) ? xw.f : xw.e);
    }

    public String toString() {
        switch (this.d) {
            case 0:
                return "Bradford";
            case 5:
                return ((wr0) this.e).toString();
            default:
                return super.toString();
        }
    }

    public void k() {
    }

    public /* synthetic */ bu(int i, boolean z) {
        this.d = i;
    }

    public bu(em emVar) {
        this.d = 24;
        this.e = new rr(cs0.a, emVar);
    }

    public /* synthetic */ bu(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    public bu(View view) {
        this.d = 23;
        if (Build.VERSION.SDK_INT >= 30) {
            ur0 ur0Var = new ur0(22, view);
            ur0Var.g = view;
            this.e = ur0Var;
            return;
        }
        this.e = new bu(22, view);
    }

    public bu(long[] jArr) {
        h80 h80Var;
        this.d = 21;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            h80Var = new h80(jArrCopyOf.length);
            int i = h80Var.b;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = h80Var.a;
                    if (jArr2.length < length) {
                        h80Var.a = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = h80Var.a;
                    int i2 = h80Var.b;
                    if (i != i2) {
                        h7.at(jArr3, jArr3, jArrCopyOf.length + i, i, i2);
                    }
                    h7.at(jArrCopyOf, jArr3, i, 0, jArrCopyOf.length);
                    h80Var.b += jArrCopyOf.length;
                }
            } else {
                wc.g("");
                throw null;
            }
        } else {
            h80Var = new h80(16);
        }
        this.e = h80Var;
    }

    public bu(Context context) {
        this.d = 8;
        this.e = context.getApplicationContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bu(gv gvVar) {
        this.d = 18;
        this.e = (tt0) gvVar;
    }

    public bu(float f2, float f3, w5 w5Var) {
        this.d = 27;
        sz szVarBb = i60.bb(0, w5Var.b());
        ArrayList arrayList = new ArrayList(lc.an(szVarBb));
        Iterator it = szVarBb.iterator();
        while (true) {
            rz rzVar = (rz) it;
            if (rzVar.f) {
                arrayList.add(new vr(f2, f3, w5Var.a(rzVar.nextInt())));
            } else {
                this.e = arrayList;
                return;
            }
        }
    }

    public bu(float f2, float f3) {
        this.d = 28;
        this.e = new vr(f2, f3, 0.01f);
    }
}
