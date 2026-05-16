package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class ie0 extends us0 implements Parcelable, jr0, ms0, w80 {
    public static final Parcelable.Creator<ie0> CREATOR = new bl(2);
    public gr0 e;

    public ie0(float f) {
        xq0 xq0VarK = fr0.k();
        gr0 gr0Var = new gr0(xq0VarK.g(), f);
        if (!(xq0VarK instanceof dw)) {
            gr0Var.b = new gr0(1, f);
        }
        this.e = gr0Var;
    }

    @Override // defpackage.ts0
    public final vs0 a() {
        return this.e;
    }

    @Override // defpackage.ts0
    public final vs0 b(vs0 vs0Var, vs0 vs0Var2, vs0 vs0Var3) {
        if (((gr0) vs0Var2).c == ((gr0) vs0Var3).c) {
            return vs0Var2;
        }
        return null;
    }

    @Override // defpackage.ts0
    public final void c(vs0 vs0Var) {
        vs0Var.getClass();
        this.e = (gr0) vs0Var;
    }

    @Override // defpackage.jr0
    public final bw d() {
        return bw.au;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((gr0) fr0.t(this.e, this)).c;
    }

    @Override // defpackage.ms0
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f) {
        xq0 xq0VarK;
        gr0 gr0Var = (gr0) fr0.i(this.e);
        if (gr0Var.c == f) {
            return;
        }
        gr0 gr0Var2 = this.e;
        synchronized (fr0.c) {
            xq0VarK = fr0.k();
            ((gr0) fr0.o(gr0Var2, this, xq0VarK, gr0Var)).c = f;
        }
        fr0.n(xq0VarK, this);
    }

    @Override // defpackage.w80
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((gr0) fr0.i(this.e)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(g());
    }
}
