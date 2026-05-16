package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class r50 {
    public final int a;
    public final bu b;
    public final n31 c;
    public int d;
    public int e;
    public int f;

    public r50(int i) {
        this.a = i;
        if (i <= 0) {
            wc.n("maxSize <= 0");
            throw null;
        }
        this.b = new bu(11);
        this.c = new n31(22);
    }

    public final Object a(Object obj) {
        synchronized (this.c) {
            bu buVar = this.b;
            buVar.getClass();
            Object obj2 = ((LinkedHashMap) buVar.e).get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b8, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.c) {
            this.d++;
            bu buVar = this.b;
            buVar.getClass();
            objPut = ((LinkedHashMap) buVar.e).put(obj, obj2);
            if (objPut != null) {
                this.d--;
            }
        }
        int i = this.a;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (((LinkedHashMap) this.b.e).isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || ((LinkedHashMap) this.b.e).isEmpty()) {
                        break;
                    }
                    Set setEntrySet = ((LinkedHashMap) this.b.e).entrySet();
                    setEntrySet.getClass();
                    Set set = setEntrySet;
                    Object next = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null) {
                        return objPut;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    bu buVar2 = this.b;
                    buVar2.getClass();
                    key.getClass();
                    ((LinkedHashMap) buVar2.e).remove(key);
                    int i2 = this.d;
                    value.getClass();
                    this.d = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
