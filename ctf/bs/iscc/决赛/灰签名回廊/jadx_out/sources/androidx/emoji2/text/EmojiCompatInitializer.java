package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.bu;
import defpackage.cu;
import defpackage.o6;
import defpackage.p30;
import defpackage.ry;
import defpackage.u30;
import defpackage.yp;
import defpackage.zp;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements ry {
    @Override // defpackage.ry
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.ry
    public final Object b(Context context) {
        Object objL;
        cu cuVar = new cu(new bu(context));
        cuVar.b = 1;
        if (yp.k == null) {
            synchronized (yp.j) {
                try {
                    if (yp.k == null) {
                        yp.k = new yp(cuVar);
                    }
                } finally {
                }
            }
        }
        o6 o6VarP = o6.p(context);
        o6VarP.getClass();
        synchronized (o6.e) {
            try {
                objL = ((HashMap) o6VarP.a).get(ProcessLifecycleInitializer.class);
                if (objL == null) {
                    objL = o6VarP.l(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        p30 lifecycle = ((u30) objL).getLifecycle();
        lifecycle.a(new zp(this, lifecycle));
        return Boolean.TRUE;
    }
}
