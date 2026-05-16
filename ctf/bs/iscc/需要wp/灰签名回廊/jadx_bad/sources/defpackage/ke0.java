package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ke0 extends us0 implements Parcelable, jr0, ms0, w80 {
    public static final Parcelable.Creator<ke0> CREATOR = new bl(4);
    public ir0 e;

    public ke0(long j) {
        xq0 xq0VarK = fr0.k();
        ir0 ir0Var = new ir0(xq0VarK.g(), j);
        if (!(xq0VarK instanceof dw)) {
            ir0Var.b = new ir0(1, j);
        }
        this.e = ir0Var;
    }

    @Override // defpackage.ts0
    public final vs0 a() {
        return this.e;
    }

    @Override // defpackage.ts0
    public final vs0 b(vs0 vs0Var, vs0 vs0Var2, vs0 vs0Var3) {
        if (((ir0) vs0Var2).c == ((ir0) vs0Var3).c) {
            return vs0Var2;
        }
        return null;
    }

    @Override // defpackage.ts0
    public final void c(vs0 vs0Var) {
        vs0Var.getClass();
        this.e = (ir0) vs0Var;
    }

    @Override // defpackage.jr0
    public final bw d() {
        return bw.au;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((ir0) fr0.t(this.e, this)).c;
    }

    @Override // defpackage.ms0
    public final Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j) {
        xq0 xq0VarK;
        ir0 ir0Var = (ir0) fr0.i(this.e);
        if (ir0Var.c != j) {
            ir0 ir0Var2 = this.e;
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                ((ir0) fr0.o(ir0Var2, this, xq0VarK, ir0Var)).c = j;
            }
            fr0.n(xq0VarK, this);
        }
    }

    @Override // defpackage.w80
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((ir0) fr0.i(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(g());
    }
}
