package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class je0 extends us0 implements Parcelable, jr0, ms0, w80 {
    public static final Parcelable.Creator<je0> CREATOR = new bl(3);
    public hr0 e;

    public je0(int i) {
        xq0 xq0VarK = fr0.k();
        hr0 hr0Var = new hr0(xq0VarK.g(), i);
        if (!(xq0VarK instanceof dw)) {
            hr0Var.b = new hr0(1, i);
        }
        this.e = hr0Var;
    }

    @Override // defpackage.ts0
    public final vs0 a() {
        return this.e;
    }

    @Override // defpackage.ts0
    public final vs0 b(vs0 vs0Var, vs0 vs0Var2, vs0 vs0Var3) {
        if (((hr0) vs0Var2).c == ((hr0) vs0Var3).c) {
            return vs0Var2;
        }
        return null;
    }

    @Override // defpackage.ts0
    public final void c(vs0 vs0Var) {
        vs0Var.getClass();
        this.e = (hr0) vs0Var;
    }

    @Override // defpackage.jr0
    public final bw d() {
        return bw.au;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((hr0) fr0.t(this.e, this)).c;
    }

    @Override // defpackage.ms0
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i) {
        xq0 xq0VarK;
        hr0 hr0Var = (hr0) fr0.i(this.e);
        if (hr0Var.c != i) {
            hr0 hr0Var2 = this.e;
            synchronized (fr0.c) {
                xq0VarK = fr0.k();
                ((hr0) fr0.o(hr0Var2, this, xq0VarK, hr0Var)).c = i;
            }
            fr0.n(xq0VarK, this);
        }
    }

    @Override // defpackage.w80
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((hr0) fr0.i(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(g());
    }
}
