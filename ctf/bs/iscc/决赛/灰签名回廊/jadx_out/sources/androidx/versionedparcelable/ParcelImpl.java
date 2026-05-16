package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bl;
import defpackage.u01;
import defpackage.v01;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new bl(1);
    public final v01 d;

    public ParcelImpl(Parcel parcel) {
        this.d = new u01(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new u01(parcel).i(this.d);
    }
}
