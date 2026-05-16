package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class n80 extends o80 implements i10, cv {
    public n80(String str, String str2) {
        super(1, bp0.class, da.d, str, str2);
    }

    @Override // defpackage.ea
    public final c10 d() {
        yi0.a.getClass();
        return this;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        i();
        throw null;
    }

    public final void i() {
        if (this.j) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        c10 c10VarH = h();
        if (c10VarH == this) {
            throw new dk("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
        }
        ((n80) ((i10) c10VarH)).i();
    }
}
