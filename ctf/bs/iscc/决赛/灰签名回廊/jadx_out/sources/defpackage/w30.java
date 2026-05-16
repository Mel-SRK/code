package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class w30 extends p30 {
    public final boolean a;
    public hr b;
    public o30 c;
    public final WeakReference d;
    public int e;
    public boolean f;
    public boolean g;
    public final ArrayList h;
    public final ps0 i;

    public w30(u30 u30Var) {
        new AtomicReference(null);
        this.a = true;
        this.b = new hr();
        o30 o30Var = o30.e;
        this.c = o30Var;
        this.h = new ArrayList();
        this.d = new WeakReference(u30Var);
        this.i = i60.e(o30Var);
    }

    @Override // defpackage.p30
    public final void a(t30 t30Var) {
        s30 jlVar;
        v30 v30Var;
        u30 u30Var;
        t30Var.getClass();
        d("addObserver");
        o30 o30Var = this.c;
        o30 o30Var2 = o30.d;
        if (o30Var != o30Var2) {
            o30Var2 = o30.e;
        }
        v30 v30Var2 = new v30();
        HashMap map = x30.a;
        boolean z = t30Var instanceof s30;
        boolean z2 = t30Var instanceof gl;
        if (z && z2) {
            jlVar = new jl((gl) t30Var, (s30) t30Var);
        } else if (z2) {
            jlVar = new jl((gl) t30Var, (s30) null);
        } else if (z) {
            jlVar = (s30) t30Var;
        } else {
            Class<?> cls = t30Var.getClass();
            if (x30.c(cls) == 2) {
                Object obj = x30.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    x30.a((Constructor) list.get(0), t30Var);
                    throw null;
                }
                int size = list.size();
                uv[] uvVarArr = new uv[size];
                if (size > 0) {
                    x30.a((Constructor) list.get(0), t30Var);
                    throw null;
                }
                jlVar = new yf(i, uvVarArr);
            } else {
                jlVar = new jl(t30Var);
            }
        }
        v30Var2.b = jlVar;
        v30Var2.a = o30Var2;
        hr hrVar = this.b;
        nl0 nl0Var = (nl0) hrVar.h.get(t30Var);
        if (nl0Var != null) {
            v30Var = nl0Var.e;
        } else {
            HashMap map2 = hrVar.h;
            nl0 nl0Var2 = new nl0(t30Var, v30Var2);
            hrVar.g++;
            nl0 nl0Var3 = hrVar.e;
            if (nl0Var3 == null) {
                hrVar.d = nl0Var2;
                hrVar.e = nl0Var2;
            } else {
                nl0Var3.f = nl0Var2;
                nl0Var2.g = nl0Var3;
                hrVar.e = nl0Var2;
            }
            map2.put(t30Var, nl0Var2);
            v30Var = null;
        }
        if (v30Var == null && (u30Var = (u30) this.d.get()) != null) {
            i = (this.e != 0 || this.f) ? 1 : 0;
            o30 o30VarC = c(t30Var);
            this.e++;
            while (v30Var2.a.compareTo(o30VarC) < 0 && this.b.h.containsKey(t30Var)) {
                o30 o30Var3 = v30Var2.a;
                ArrayList arrayList = this.h;
                arrayList.add(o30Var3);
                l30 l30Var = n30.Companion;
                o30 o30Var4 = v30Var2.a;
                l30Var.getClass();
                o30Var4.getClass();
                int iOrdinal = o30Var4.ordinal();
                n30 n30Var = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : n30.ON_RESUME : n30.ON_START : n30.ON_CREATE;
                if (n30Var == null) {
                    wc.m(v30Var2.a, "no event up from ");
                    return;
                } else {
                    v30Var2.a(u30Var, n30Var);
                    arrayList.remove(arrayList.size() - 1);
                    o30VarC = c(t30Var);
                }
            }
            if (i == 0) {
                g();
            }
            this.e--;
        }
    }

    @Override // defpackage.p30
    public final void b(t30 t30Var) {
        t30Var.getClass();
        d("removeObserver");
        hr hrVar = this.b;
        WeakHashMap weakHashMap = hrVar.f;
        HashMap map = hrVar.h;
        nl0 nl0Var = (nl0) map.get(t30Var);
        if (nl0Var != null) {
            hrVar.g--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((pl0) it.next()).a(nl0Var);
                }
            }
            nl0 nl0Var2 = nl0Var.g;
            nl0 nl0Var3 = nl0Var.f;
            if (nl0Var2 != null) {
                nl0Var2.f = nl0Var3;
            } else {
                hrVar.d = nl0Var3;
            }
            nl0 nl0Var4 = nl0Var.f;
            if (nl0Var4 != null) {
                nl0Var4.g = nl0Var2;
            } else {
                hrVar.e = nl0Var2;
            }
            nl0Var.f = null;
            nl0Var.g = null;
        }
        map.remove(t30Var);
    }

    public final o30 c(t30 t30Var) {
        HashMap map = this.b.h;
        nl0 nl0Var = map.containsKey(t30Var) ? ((nl0) map.get(t30Var)).g : null;
        o30 o30Var = nl0Var != null ? nl0Var.e.a : null;
        ArrayList arrayList = this.h;
        o30 o30Var2 = arrayList.isEmpty() ? null : (o30) arrayList.get(arrayList.size() - 1);
        o30 o30Var3 = this.c;
        o30Var3.getClass();
        if (o30Var == null || o30Var.compareTo(o30Var3) >= 0) {
            o30Var = o30Var3;
        }
        return (o30Var2 == null || o30Var2.compareTo(o30Var) >= 0) ? o30Var : o30Var2;
    }

    public final void d(String str) {
        q6 q6Var;
        if (this.a) {
            if (q6.b != null) {
                q6Var = q6.b;
            } else {
                synchronized (q6.class) {
                    try {
                        if (q6.b == null) {
                            q6.b = new q6(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                q6Var = q6.b;
            }
            ((q6) q6Var.a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void e(n30 n30Var) {
        n30Var.getClass();
        d("handleLifecycleEvent");
        f(n30Var.a());
    }

    public final void f(o30 o30Var) {
        if (this.c == o30Var) {
            return;
        }
        u30 u30Var = (u30) this.d.get();
        o30 o30Var2 = this.c;
        o30Var2.getClass();
        o30 o30Var3 = o30.e;
        o30 o30Var4 = o30.d;
        if (o30Var2 == o30Var3 && o30Var == o30Var4) {
            throw new IllegalStateException(("State must be at least '" + o30.f + "' to be moved to '" + o30Var + "' in component " + u30Var).toString());
        }
        if (o30Var2 == o30Var4 && o30Var2 != o30Var) {
            throw new IllegalStateException(("State is '" + o30Var4 + "' and cannot be moved to `" + o30Var + "` in component " + u30Var).toString());
        }
        this.c = o30Var;
        if (this.f || this.e != 0) {
            this.g = true;
            return;
        }
        this.f = true;
        g();
        this.f = false;
        if (this.c == o30Var4) {
            this.b = new hr();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        r11.g = false;
        r0 = r11.c;
        r1 = r11.i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        r0 = defpackage.m10.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        r1.h(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w30.g():void");
    }
}
