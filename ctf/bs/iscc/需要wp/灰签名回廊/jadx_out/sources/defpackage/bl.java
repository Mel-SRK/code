package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

/* JADX INFO: loaded from: classes.dex */
public final class bl implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new bm(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                return new ie0(parcel.readFloat());
            case 3:
                return new je0(parcel.readInt());
            default:
                return new ke0(parcel.readLong());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new bm[i];
            case 1:
                return new ParcelImpl[i];
            case 2:
                return new ie0[i];
            case 3:
                return new je0[i];
            default:
                return new ke0[i];
        }
    }
}
