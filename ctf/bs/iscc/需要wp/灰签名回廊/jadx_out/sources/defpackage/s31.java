package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class s31 extends ContentObserver {
    public final /* synthetic */ o9 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s31(o9 o9Var, Handler handler) {
        super(handler);
        this.a = o9Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        this.a.u(wz0.a);
    }
}
