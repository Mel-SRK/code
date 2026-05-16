package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import android.text.TextPaint;
import android.util.SparseArray;
import com.example.gnd.R;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class o6 implements p6 {
    public static volatile o6 d;
    public static final Object e = new Object();
    public Object a;
    public Object b;
    public Object c;

    public o6(int i) {
        switch (i) {
            case 3:
                this.a = new bu(5);
                this.b = new bu(5);
                this.c = new bu(5);
                break;
            case 9:
                this.a = new AtomicReference(f00.j);
                this.b = new Object();
                break;
            case 11:
                this.a = new WeakHashMap();
                this.b = new WeakHashMap();
                this.c = new WeakHashMap();
                break;
            default:
                this.c = new yf0(18);
                break;
        }
    }

    public static o6 p(Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        o6 o6Var = new o6();
                        o6Var.c = context.getApplicationContext();
                        o6Var.b = new HashSet();
                        o6Var.a = new HashMap();
                        d = o6Var;
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public void a(s20 s20Var, n00 n00Var) {
        bu buVar = (bu) this.a;
        bu buVar2 = (bu) this.b;
        bu buVar3 = (bu) this.c;
        int iOrdinal = n00Var.ordinal();
        if (iOrdinal == 0) {
            buVar.e(s20Var);
            buVar3.e(s20Var);
            return;
        }
        if (iOrdinal == 1) {
            buVar2.e(s20Var);
            buVar3.e(s20Var);
            return;
        }
        if (iOrdinal == 2) {
            if (s20Var.j != null) {
                buVar3.e(s20Var);
                return;
            } else {
                buVar.e(s20Var);
                return;
            }
        }
        if (iOrdinal != 3) {
            wc.l();
        } else if (s20Var.j != null) {
            buVar3.e(s20Var);
        } else {
            buVar2.e(s20Var);
        }
    }

    public void aa(e20 e20Var) {
        ((ra) this.c).d.b = e20Var;
    }

    public void ab(long j) {
        ((ra) this.c).d.d = j;
    }

    public void ac() {
        q80 q80Var = (q80) this.a;
        String str = (String) this.b;
        List list = (List) q80Var.j(str);
        if (list != null) {
            list.remove((t4) this.c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        q80Var.l(str, list);
    }

    @Override // defpackage.p6
    public void b(int i, Object obj) {
        ((s20) this.c).w(i, (s20) obj);
    }

    @Override // defpackage.p6
    public void c(Object obj) {
        ((ArrayList) this.b).add(this.c);
        this.c = obj;
    }

    @Override // defpackage.p6
    public void d() {
        c0 c0Var;
        s20 s20Var = (s20) this.c;
        da0 da0Var = s20Var.ag;
        if (!s20Var.ae()) {
            sy.a("onReuse is only expected on attached node");
        }
        s20Var.u = false;
        if (s20Var.ao) {
            s20Var.ao = false;
        } else {
            i70 i70Var = (hu0) s20Var.ag.i;
            for (i70 i70Var2 = i70Var; i70Var2 != null; i70Var2 = i70Var2.h) {
                if (i70Var2.q) {
                    i70Var2.bp();
                }
            }
            for (i70 i70Var3 = i70Var; i70Var3 != null; i70Var3 = i70Var3.h) {
                if (i70Var3.q) {
                    i70Var3.br();
                }
            }
            while (i70Var != null) {
                if (i70Var.q) {
                    i70Var.bl();
                }
                i70Var = i70Var.h;
            }
        }
        int i = s20Var.e;
        s20Var.e = ro0.a.addAndGet(1);
        b1 b1Var = s20Var.p;
        if (b1Var != null) {
            b1Var.m4getLayoutNodes().f(i);
            b1Var.m4getLayoutNodes().g(s20Var.e, s20Var);
        }
        for (i70 i70Var4 = (i70) da0Var.j; i70Var4 != null; i70Var4 = i70Var4.i) {
            i70Var4.bk();
        }
        da0Var.j();
        if (da0Var.h(8)) {
            s20Var.ac();
        }
        s20.aq(s20Var);
        b1 b1Var2 = s20Var.p;
        if (b1Var2 != null) {
            if (b1.g() && (c0Var = b1Var2.ah) != null) {
                b1 b1Var3 = c0Var.c;
                bu buVar = c0Var.a;
                f80 f80Var = c0Var.g;
                if (f80Var.e(i)) {
                    buVar.j(b1Var3, i, false);
                }
                po0 po0VarS = s20Var.s();
                if (po0VarS != null && po0VarS.d.b(zo0.q)) {
                    f80Var.a(s20Var.e);
                    buVar.j(b1Var3, s20Var.e, true);
                }
            }
            b1Var2.getRectManager().g(s20Var, true);
        }
    }

    @Override // defpackage.p6
    public /* bridge */ /* synthetic */ void e(int i, Object obj) {
    }

    @Override // defpackage.p6
    public void f(int i, int i2, int i3) {
        s20 s20Var = (s20) this.c;
        f1 f1Var = s20Var.l;
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i > i2 ? i + i4 : i;
            int i6 = i > i2 ? i2 + i4 : (i2 + i3) - 2;
            a90 a90Var = (a90) f1Var.e;
            b bVar = (b) f1Var.f;
            Object objJ = a90Var.j(i5);
            bVar.a();
            ((a90) f1Var.e).a(i6, (s20) objJ);
            bVar.a();
        }
        s20Var.ak();
        s20Var.ad();
        s20Var.aa();
    }

    @Override // defpackage.p6
    public Object g() {
        return this.c;
    }

    @Override // defpackage.p6
    public void h(int i, int i2) {
        s20 s20Var = (s20) this.c;
        f1 f1Var = s20Var.l;
        if (i2 < 0) {
            sy.a("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            s20Var.ah((s20) ((a90) f1Var.e).d[i3]);
            Object objJ = ((a90) f1Var.e).j(i3);
            ((b) f1Var.f).a();
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public void i() {
        ((ArrayList) this.b).clear();
        this.c = this.a;
        s20 s20Var = (s20) this.a;
        f1 f1Var = s20Var.l;
        int i = ((a90) f1Var.e).f;
        while (true) {
            i--;
            a90 a90Var = (a90) f1Var.e;
            if (-1 >= i) {
                a90Var.g();
                ((b) f1Var.f).a();
                return;
            }
            s20Var.ah((s20) a90Var.d[i]);
        }
    }

    public void k(Bundle bundle) {
        HashSet hashSet = (HashSet) this.b;
        String string = ((Context) this.c).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (ry.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    l((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new xd(e2);
            }
        }
    }

    public Object l(Class cls, HashSet hashSet) {
        Object objB;
        HashMap map = (HashMap) this.a;
        if (jo0.g()) {
            try {
                jo0.d(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                ry ryVar = (ry) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = ryVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            l(cls2, hashSet);
                        }
                    }
                }
                objB = ryVar.b((Context) this.c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new xd(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    @Override // defpackage.p6
    public void m() {
        this.c = ((ArrayList) this.b).remove(r0.size() - 1);
    }

    public Object n() {
        long jE = go0.e();
        if (jE == yx0.a) {
            return this.c;
        }
        vx0 vx0Var = (vx0) ((AtomicReference) this.a).get();
        int iA = vx0Var.a(jE);
        if (iA >= 0) {
            return vx0Var.c[iA];
        }
        return null;
    }

    public oa o() {
        return ((ra) this.c).d.c;
    }

    public s10 q() {
        s10 s10Var = (s10) this.b;
        if (s10Var != null) {
            return s10Var;
        }
        f00.ag("keyboardActions");
        throw null;
    }

    public long r() {
        return ((ra) this.c).d.d;
    }

    public boolean s(CharSequence charSequence, int i, int i2, kz0 kz0Var) {
        if ((kz0Var.c & 3) == 0) {
            zk zkVar = (zk) this.c;
            z60 z60VarB = kz0Var.b();
            int iA = z60VarB.a(8);
            if (iA != 0) {
                ((ByteBuffer) z60VarB.g).getShort(iA + z60VarB.d);
            }
            zkVar.getClass();
            ThreadLocal threadLocal = zk.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = zkVar.a;
            String string = sb.toString();
            int i3 = zd0.a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i4 = kz0Var.c & 4;
            kz0Var.c = zHasGlyph ? i4 | 2 : i4 | 1;
        }
        return (kz0Var.c & 3) == 2;
    }

    public boolean t() {
        return !(((wr0) ((bu) this.a).e).isEmpty() && ((wr0) ((bu) this.c).e).isEmpty() && ((wr0) ((bu) this.b).e).isEmpty());
    }

    public boolean u() {
        if (((ms0) this.a).getValue() != this.c) {
            return true;
        }
        o6 o6Var = (o6) this.b;
        return o6Var != null && o6Var.u();
    }

    public void v() {
        b1 b1Var = ((s20) this.a).p;
        if (b1Var != null) {
            b1Var.u();
        }
    }

    public Object w(CharSequence charSequence, int i, int i2, int i3, boolean z, hq hqVar) {
        int i4;
        char c;
        kq kqVar = new kq((b70) ((a0) this.b).c);
        int iCodePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean zI = true;
        int iCharCount = i;
        loop0: while (true) {
            i4 = iCharCount;
            while (iCharCount < i2 && i5 < i3 && zI) {
                SparseArray sparseArray = kqVar.c.a;
                b70 b70Var = sparseArray == null ? null : (b70) sparseArray.get(iCodePointAt);
                if (kqVar.a == 2) {
                    if (b70Var != null) {
                        kqVar.c = b70Var;
                        kqVar.f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            kqVar.a();
                        } else if (iCodePointAt != 65039) {
                            b70 b70Var2 = kqVar.c;
                            if (b70Var2.b != null) {
                                if (kqVar.f != 1) {
                                    kqVar.d = b70Var2;
                                    kqVar.a();
                                } else if (kqVar.b()) {
                                    kqVar.d = kqVar.c;
                                    kqVar.a();
                                } else {
                                    kqVar.a();
                                }
                                c = 3;
                            } else {
                                kqVar.a();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                } else if (b70Var == null) {
                    kqVar.a();
                    c = 1;
                } else {
                    kqVar.a = 2;
                    kqVar.c = b70Var;
                    kqVar.f = 1;
                    c = 2;
                }
                kqVar.e = iCodePointAt;
                if (c == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (iCharCount < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i2) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c == 3) {
                    if (z || !s(charSequence, i4, iCharCount, kqVar.d.b)) {
                        zI = hqVar.i(charSequence, i4, iCharCount, kqVar.d.b);
                        i5++;
                    }
                }
            }
            break loop0;
        }
        if (kqVar.a == 2 && kqVar.c.b != null && ((kqVar.f > 1 || kqVar.b()) && i5 < i3 && zI && (z || !s(charSequence, i4, iCharCount, kqVar.c.b)))) {
            hqVar.i(charSequence, i4, iCharCount, kqVar.c.b);
        }
        return hqVar.a();
    }

    public void x(Object obj) {
        long jE = go0.e();
        if (jE == yx0.a) {
            this.c = obj;
            return;
        }
        synchronized (this.b) {
            vx0 vx0Var = (vx0) ((AtomicReference) this.a).get();
            int iA = vx0Var.a(jE);
            if (iA < 0) {
                ((AtomicReference) this.a).set(vx0Var.b(jE, obj));
            } else {
                vx0Var.c[iA] = obj;
            }
        }
    }

    public void y(oa oaVar) {
        ((ra) this.c).d.c = oaVar;
    }

    public void z(em emVar) {
        ((ra) this.c).d.a = emVar;
    }

    public /* synthetic */ o6(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public o6(nz0 nz0Var, o6 o6Var) {
        this.a = nz0Var;
        this.b = o6Var;
        this.c = nz0Var.d;
    }
}
