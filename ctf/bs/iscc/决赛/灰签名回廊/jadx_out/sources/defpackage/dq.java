package defpackage;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public final class dq extends i60 {
    public final /* synthetic */ i60 q;
    public final /* synthetic */ ThreadPoolExecutor r;

    public dq(i60 i60Var, ThreadPoolExecutor threadPoolExecutor) {
        this.q = i60Var;
        this.r = threadPoolExecutor;
    }

    @Override // defpackage.i60
    public final void ar(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.r;
        try {
            this.q.ar(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // defpackage.i60
    public final void as(a0 a0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.r;
        try {
            this.q.as(a0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
