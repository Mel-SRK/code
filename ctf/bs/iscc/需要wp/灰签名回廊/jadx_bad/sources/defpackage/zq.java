package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class zq extends r implements yq, Serializable {
    public final Enum[] d;

    public zq(Enum[] enumArr) {
        this.d = enumArr;
    }

    @Override // defpackage.i
    public final int a() {
        return this.d.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0015  */
    @Override // defpackage.i, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean contains(Object obj) {
        Enum r0;
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.d;
            r0 = iOrdinal < enumArr.length ? enumArr[iOrdinal] : null;
        }
        return r0 == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.d;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        wc.g(n5.g("index: ", i, ", size: ", length));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // defpackage.r, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int indexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.d;
            r2 = iOrdinal < enumArr.length ? enumArr[iOrdinal] : null;
        }
        if (r2 == r5) {
            return iOrdinal;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    @Override // defpackage.r, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int lastIndexOf(Object obj) {
        Enum r2;
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        int iOrdinal = r5.ordinal();
        if (iOrdinal >= 0) {
            Enum[] enumArr = this.d;
            r2 = iOrdinal < enumArr.length ? enumArr[iOrdinal] : null;
        }
        if (r2 == r5) {
            return iOrdinal;
        }
        return -1;
    }
}
