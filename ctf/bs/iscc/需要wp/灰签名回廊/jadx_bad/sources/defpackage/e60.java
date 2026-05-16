package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e60 implements Map.Entry, d10 {
    public final /* synthetic */ int d;
    public final Object e;
    public final Object f;

    public /* synthetic */ e60(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        switch (this.d) {
            case 0:
                Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
                return entry != null && f00.h(entry.getKey(), this.e) && f00.h(entry.getValue(), getValue());
            default:
                return super.equals(obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.d) {
        }
        return this.e;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.d) {
        }
        return this.f;
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        switch (this.d) {
            case 0:
                Object obj = this.e;
                int iHashCode = obj != null ? obj.hashCode() : 0;
                Object value = getValue();
                return (value != null ? value.hashCode() : 0) ^ iHashCode;
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.d) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        switch (this.d) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append(this.e);
                sb.append('=');
                sb.append(getValue());
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
