package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class pr0 implements Parcelable, ts0, List, RandomAccess, e10 {
    public static final Parcelable.Creator<pr0> CREATOR = new or0();
    public ss0 d;

    public pr0(w wVar) {
        xq0 xq0VarK = fr0.k();
        ss0 ss0Var = new ss0(xq0VarK.g(), wVar);
        if (!(xq0VarK instanceof dw)) {
            ss0Var.b = new ss0(1, wVar);
        }
        this.d = ss0Var;
    }

    @Override // defpackage.ts0
    public final vs0 a() {
        return this.d;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        w wVar;
        xq0 xq0VarK;
        boolean zL;
        do {
            synchronized (e00.v) {
                ss0 ss0Var = this.d;
                ss0Var.getClass();
                ss0 ss0Var2 = (ss0) fr0.i(ss0Var);
                i = ss0Var2.d;
                wVar = ss0Var2.c;
            }
            wVar.getClass();
            w wVarC = wVar.c(obj);
            if (wVarC.equals(wVar)) {
                return false;
            }
            ss0 ss0Var3 = this.d;
            ss0Var3.getClass();
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                zL = e00.l((ss0) fr0.w(ss0Var3, this, xq0VarK), i, wVarC, true);
            }
            fr0.n(xq0VarK, this);
        } while (!zL);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        w wVar;
        xq0 xq0VarK;
        boolean zL;
        do {
            synchronized (e00.v) {
                ss0 ss0Var = this.d;
                ss0Var.getClass();
                ss0 ss0Var2 = (ss0) fr0.i(ss0Var);
                i = ss0Var2.d;
                wVar = ss0Var2.c;
            }
            wVar.getClass();
            w wVarD = wVar.d(collection);
            if (f00.h(wVarD, wVar)) {
                return false;
            }
            ss0 ss0Var3 = this.d;
            ss0Var3.getClass();
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                zL = e00.l((ss0) fr0.w(ss0Var3, this, xq0VarK), i, wVarD, true);
            }
            fr0.n(xq0VarK, this);
        } while (!zL);
        return true;
    }

    @Override // defpackage.ts0
    public final void c(vs0 vs0Var) {
        vs0Var.b = this.d;
        this.d = (ss0) vs0Var;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        xq0 xq0VarK;
        ss0 ss0Var = this.d;
        ss0Var.getClass();
        synchronized (fr0.c) {
            xq0VarK = fr0.k();
            ss0 ss0Var2 = (ss0) fr0.w(ss0Var, this, xq0VarK);
            synchronized (e00.v) {
                ss0Var2.c = wq0.e;
                ss0Var2.d++;
                ss0Var2.e++;
            }
        }
        fr0.n(xq0VarK, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return e00.aa(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return e00.aa(this).c.containsAll(collection);
    }

    public final void d(int i, int i2) {
        int i3;
        w wVar;
        xq0 xq0VarK;
        boolean zL;
        do {
            synchronized (e00.v) {
                ss0 ss0Var = this.d;
                ss0Var.getClass();
                ss0 ss0Var2 = (ss0) fr0.i(ss0Var);
                i3 = ss0Var2.d;
                wVar = ss0Var2.c;
            }
            wVar.getClass();
            gf0 gf0VarE = wVar.e();
            gf0VarE.subList(i, i2).clear();
            w wVarC = gf0VarE.c();
            if (f00.h(wVarC, wVar)) {
                return;
            }
            ss0 ss0Var3 = this.d;
            ss0Var3.getClass();
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                zL = e00.l((ss0) fr0.w(ss0Var3, this, xq0VarK), i3, wVarC, true);
            }
            fr0.n(xq0VarK, this);
        } while (!zL);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return e00.aa(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return e00.aa(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return e00.aa(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return e00.aa(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new nx(this, 0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        w wVar;
        xq0 xq0VarK;
        boolean zL;
        do {
            synchronized (e00.v) {
                ss0 ss0Var = this.d;
                ss0Var.getClass();
                ss0 ss0Var2 = (ss0) fr0.i(ss0Var);
                i = ss0Var2.d;
                wVar = ss0Var2.c;
            }
            wVar.getClass();
            int iIndexOf = wVar.indexOf(obj);
            w wVarG = iIndexOf != -1 ? wVar.g(iIndexOf) : wVar;
            if (wVarG.equals(wVar)) {
                return false;
            }
            ss0 ss0Var3 = this.d;
            ss0Var3.getClass();
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                zL = e00.l((ss0) fr0.w(ss0Var3, this, xq0VarK), i, wVarG, true);
            }
            fr0.n(xq0VarK, this);
        } while (!zL);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        w wVar;
        xq0 xq0VarK;
        boolean zL;
        do {
            synchronized (e00.v) {
                ss0 ss0Var = this.d;
                ss0Var.getClass();
                ss0 ss0Var2 = (ss0) fr0.i(ss0Var);
                i = ss0Var2.d;
                wVar = ss0Var2.c;
            }
            wVar.getClass();
            w wVarF = wVar.f(new v(0, collection));
            if (f00.h(wVarF, wVar)) {
                return false;
            }
            ss0 ss0Var3 = this.d;
            ss0Var3.getClass();
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                zL = e00.l((ss0) fr0.w(ss0Var3, this, xq0VarK), i, wVarF, true);
            }
            fr0.n(xq0VarK, this);
        } while (!zL);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return e00.ae(this, new v(2, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        w wVar;
        xq0 xq0VarK;
        boolean zL;
        Object obj2 = get(i);
        do {
            synchronized (e00.v) {
                ss0 ss0Var = this.d;
                ss0Var.getClass();
                ss0 ss0Var2 = (ss0) fr0.i(ss0Var);
                i2 = ss0Var2.d;
                wVar = ss0Var2.c;
            }
            wVar.getClass();
            w wVarH = wVar.h(i, obj);
            if (wVarH.equals(wVar)) {
                break;
            }
            ss0 ss0Var3 = this.d;
            ss0Var3.getClass();
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                zL = e00.l((ss0) fr0.w(ss0Var3, this, xq0VarK), i2, wVarH, false);
            }
            fr0.n(xq0VarK, this);
        } while (!zL);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return e00.aa(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            dh0.a("fromIndex or toIndex are out of bounds");
        }
        return new jt0(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return az0.ak(this);
    }

    public final String toString() {
        ss0 ss0Var = this.d;
        ss0Var.getClass();
        return "SnapshotStateList(value=" + ((ss0) fr0.i(ss0Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        w wVar = e00.aa(this).c;
        int iA = wVar.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(wVar.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return az0.al(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new nx(this, i);
    }

    public pr0() {
        this(wq0.e);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        w wVar;
        xq0 xq0VarK;
        boolean zL;
        do {
            synchronized (e00.v) {
                ss0 ss0Var = this.d;
                ss0Var.getClass();
                ss0 ss0Var2 = (ss0) fr0.i(ss0Var);
                i2 = ss0Var2.d;
                wVar = ss0Var2.c;
            }
            wVar.getClass();
            w wVarB = wVar.b(i, obj);
            if (wVarB.equals(wVar)) {
                return;
            }
            ss0 ss0Var3 = this.d;
            ss0Var3.getClass();
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                zL = e00.l((ss0) fr0.w(ss0Var3, this, xq0VarK), i2, wVarB, true);
            }
            fr0.n(xq0VarK, this);
        } while (!zL);
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection collection) {
        return e00.ae(this, new cv() { // from class: nr0
            @Override // defpackage.cv
            public final Object g(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        w wVar;
        xq0 xq0VarK;
        boolean zL;
        Object obj = get(i);
        do {
            synchronized (e00.v) {
                ss0 ss0Var = this.d;
                ss0Var.getClass();
                ss0 ss0Var2 = (ss0) fr0.i(ss0Var);
                i2 = ss0Var2.d;
                wVar = ss0Var2.c;
            }
            wVar.getClass();
            w wVarG = wVar.g(i);
            if (wVarG.equals(wVar)) {
                break;
            }
            ss0 ss0Var3 = this.d;
            ss0Var3.getClass();
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                zL = e00.l((ss0) fr0.w(ss0Var3, this, xq0VarK), i2, wVarG, true);
            }
            fr0.n(xq0VarK, this);
        } while (!zL);
        return obj;
    }
}
