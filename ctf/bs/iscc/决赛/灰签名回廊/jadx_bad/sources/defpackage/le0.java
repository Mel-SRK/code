package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class le0 implements Parcelable.ClassLoaderCreator {
    public static me0 a(Parcel parcel, ClassLoader classLoader) {
        bw bwVar;
        if (classLoader == null) {
            classLoader = le0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i = parcel.readInt();
        if (i == 0) {
            bwVar = bw.ai;
        } else if (i == 1) {
            bwVar = bw.au;
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unsupported MutableState policy " + i + " was restored");
            }
            bwVar = bw.am;
        }
        return new me0(value, bwVar);
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new me0[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
