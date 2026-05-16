package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class qj0 extends s7 {
    public qj0(ji jiVar) {
        super(jiVar);
        if (jiVar == null || jiVar.e() == pq.d) {
            return;
        }
        wc.n("Coroutines with restricted suspension must have EmptyCoroutineContext");
        throw null;
    }

    @Override // defpackage.ji
    public final pj e() {
        return pq.d;
    }
}
