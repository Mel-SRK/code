package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.t01;
import defpackage.u01;
import defpackage.v01;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(t01 t01Var) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        v01 v01VarG = remoteActionCompat.a;
        boolean z = true;
        if (t01Var.e(1)) {
            v01VarG = t01Var.g();
        }
        remoteActionCompat.a = (IconCompat) v01VarG;
        CharSequence charSequence = remoteActionCompat.b;
        if (t01Var.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((u01) t01Var).e);
        }
        remoteActionCompat.b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.c;
        if (t01Var.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((u01) t01Var).e);
        }
        remoteActionCompat.c = charSequence2;
        remoteActionCompat.d = (PendingIntent) t01Var.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.e;
        if (t01Var.e(5)) {
            z2 = ((u01) t01Var).e.readInt() != 0;
        }
        remoteActionCompat.e = z2;
        boolean z3 = remoteActionCompat.f;
        if (!t01Var.e(6)) {
            z = z3;
        } else if (((u01) t01Var).e.readInt() == 0) {
            z = false;
        }
        remoteActionCompat.f = z;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, t01 t01Var) {
        t01Var.getClass();
        IconCompat iconCompat = remoteActionCompat.a;
        t01Var.h(1);
        t01Var.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.b;
        t01Var.h(2);
        Parcel parcel = ((u01) t01Var).e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.c;
        t01Var.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        t01Var.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.e;
        t01Var.h(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f;
        t01Var.h(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}
