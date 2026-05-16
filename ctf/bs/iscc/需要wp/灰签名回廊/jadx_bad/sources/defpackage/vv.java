package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class vv implements Iterator, d10 {
    public final /* synthetic */ int d;
    public int e;
    public Object f;
    public final Object g;

    public vv(t80 t80Var) {
        this.d = 1;
        this.g = t80Var;
        this.e = -1;
        this.f = bo0.l(new s80(t80Var, this, null));
    }

    public void a() {
        Object objG;
        int i = this.e;
        cm cmVar = (cm) this.g;
        if (i == -2) {
            objG = ((pu) cmVar.b).a();
        } else {
            cv cvVar = (cv) cmVar.c;
            Object obj = this.f;
            obj.getClass();
            objG = cvVar.g(obj);
        }
        this.f = objG;
        this.e = objG == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.d) {
            case 0:
                if (this.e < 0) {
                    a();
                }
                return this.e == 1;
            case 1:
                return ((op0) this.f).hasNext();
            default:
                return this.e < ((Map) this.g).size();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.d) {
            case 0:
                if (this.e < 0) {
                    a();
                }
                if (this.e == 0) {
                    wc.p();
                    return null;
                }
                Object obj = this.f;
                obj.getClass();
                this.e = -1;
                return obj;
            case 1:
                return ((op0) this.f).next();
            default:
                if (!hasNext()) {
                    wc.p();
                    return null;
                }
                Object obj2 = this.f;
                this.e++;
                Object obj3 = ((Map) this.g).get(obj2);
                if (obj3 != null) {
                    this.f = ((l40) obj3).b;
                    return obj2;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj2 + ") has changed after it was added to the persistent set.");
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                int i = this.e;
                if (i != -1) {
                    ((t80) this.g).e.l(i);
                    this.e = -1;
                    return;
                }
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public vv(cm cmVar) {
        this.d = 0;
        this.g = cmVar;
        this.e = -2;
    }

    public vv(Object obj, Map map) {
        this.d = 2;
        this.f = obj;
        this.g = map;
    }
}
