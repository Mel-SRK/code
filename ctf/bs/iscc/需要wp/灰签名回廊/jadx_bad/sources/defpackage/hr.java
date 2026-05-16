package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hr implements Iterable {
    public nl0 d;
    public nl0 e;
    public final WeakHashMap f = new WeakHashMap();
    public int g = 0;
    public final HashMap h = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r3.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        if (((defpackage.ml0) r7).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hr)) {
            return false;
        }
        hr hrVar = (hr) obj;
        if (this.g != hrVar.g) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = hrVar.iterator();
        while (true) {
            ml0 ml0Var = (ml0) it;
            if (!ml0Var.hasNext()) {
                break;
            }
            ml0 ml0Var2 = (ml0) it2;
            if (!ml0Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) ml0Var.next();
            Object next = ml0Var2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                break;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            ml0 ml0Var = (ml0) it;
            if (!ml0Var.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) ml0Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ml0 ml0Var = new ml0(this.d, this.e, 0);
        this.f.put(ml0Var, Boolean.FALSE);
        return ml0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ml0 ml0Var = (ml0) it;
            if (!ml0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) ml0Var.next()).toString());
            if (ml0Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
