package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class or0 implements Parcelable.ClassLoaderCreator {
    public static pr0 a(Parcel parcel, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = or0.class.getClassLoader();
        }
        int i = parcel.readInt();
        if (i == 0) {
            return new pr0();
        }
        gf0 gf0VarE = wq0.e.e();
        for (int i2 = 0; i2 < i; i2++) {
            gf0VarE.add(parcel.readValue(classLoader));
        }
        return new pr0(gf0VarE.c());
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new pr0[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }
}
