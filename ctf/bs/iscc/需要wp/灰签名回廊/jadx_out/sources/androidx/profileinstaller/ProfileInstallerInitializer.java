package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import defpackage.rh0;
import defpackage.ry;
import defpackage.yf0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements ry {
    @Override // defpackage.ry
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.ry
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new rh0(this, context.getApplicationContext()));
        return new yf0(6);
    }
}
