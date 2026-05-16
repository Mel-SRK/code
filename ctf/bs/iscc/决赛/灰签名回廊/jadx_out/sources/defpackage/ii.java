package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ii implements xj {
    public final pj d;

    public ii(pj pjVar) {
        this.d = pjVar;
    }

    @Override // defpackage.xj
    public final pj f() {
        return this.d;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.d + ')';
    }
}
