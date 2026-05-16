package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class me0 extends us0 implements Parcelable, jr0 {
    public static final Parcelable.Creator<me0> CREATOR = new le0();
    public final bw e;
    public kr0 f;

    public me0(Object obj, bw bwVar) {
        this.e = bwVar;
        xq0 xq0VarK = fr0.k();
        kr0 kr0Var = new kr0(xq0VarK.g(), obj);
        if (!(xq0VarK instanceof dw)) {
            kr0Var.b = new kr0(1, obj);
        }
        this.f = kr0Var;
    }

    @Override // defpackage.ts0
    public final vs0 a() {
        return this.f;
    }

    @Override // defpackage.ts0
    public final vs0 b(vs0 vs0Var, vs0 vs0Var2, vs0 vs0Var3) {
        if (this.e.h(((kr0) vs0Var2).c, ((kr0) vs0Var3).c)) {
            return vs0Var2;
        }
        return null;
    }

    @Override // defpackage.ts0
    public final void c(vs0 vs0Var) {
        vs0Var.getClass();
        this.f = (kr0) vs0Var;
    }

    @Override // defpackage.jr0
    public final bw d() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ms0
    public final Object getValue() {
        return ((kr0) fr0.t(this.f, this)).c;
    }

    @Override // defpackage.w80
    public final void setValue(Object obj) {
        xq0 xq0VarK;
        kr0 kr0Var = (kr0) fr0.i(this.f);
        if (this.e.h(kr0Var.c, obj)) {
            return;
        }
        kr0 kr0Var2 = this.f;
        synchronized (fr0.c) {
            xq0VarK = fr0.k();
            ((kr0) fr0.o(kr0Var2, this, xq0VarK, kr0Var)).c = obj;
        }
        fr0.n(xq0VarK, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((kr0) fr0.i(this.f)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        bw bwVar = bw.ai;
        bw bwVar2 = this.e;
        if (f00.h(bwVar2, bwVar)) {
            i2 = 0;
        } else if (f00.h(bwVar2, bw.au)) {
            i2 = 1;
        } else {
            if (!f00.h(bwVar2, bw.am)) {
                wc.q("Only known types of MutableState's SnapshotMutationPolicy are supported");
                return;
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }
}
