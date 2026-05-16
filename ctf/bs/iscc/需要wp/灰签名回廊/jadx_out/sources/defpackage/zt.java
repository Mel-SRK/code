package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class zt implements xp {
    public final Context d;
    public final yt e;
    public final n31 f;
    public final Object g = new Object();
    public Handler h;
    public ThreadPoolExecutor i;
    public ThreadPoolExecutor j;
    public i60 k;

    public zt(Context context, yt ytVar) {
        e00.q(context, "Context cannot be null");
        this.d = context.getApplicationContext();
        this.e = ytVar;
        this.f = cu.d;
    }

    @Override // defpackage.xp
    public final void a(i60 i60Var) {
        synchronized (this.g) {
            this.k = i60Var;
        }
        synchronized (this.g) {
            try {
                if (this.k == null) {
                    return;
                }
                if (this.i == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new sg("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.j = threadPoolExecutor;
                    this.i = threadPoolExecutor;
                }
                this.i.execute(new m0(4, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.g) {
            try {
                this.k = null;
                Handler handler = this.h;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.h = null;
                ThreadPoolExecutor threadPoolExecutor = this.j;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.i = null;
                this.j = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ku c() {
        try {
            n31 n31Var = this.f;
            Context context = this.d;
            yt ytVar = this.e;
            n31Var.getClass();
            Object[] objArr = {ytVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            o5 o5VarA = xt.a(context, Collections.unmodifiableList(arrayList));
            int i = o5VarA.b;
            if (i != 0) {
                throw new RuntimeException("fetchFonts failed (" + i + ")");
            }
            ku[] kuVarArr = (ku[]) ((List) o5VarA.c).get(0);
            if (kuVarArr == null || kuVarArr.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return kuVarArr[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
