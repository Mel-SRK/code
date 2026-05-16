package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i50 implements q60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ cv d;
    public final /* synthetic */ x10 e;
    public final /* synthetic */ j50 f;

    /* JADX WARN: Multi-variable type inference failed */
    public i50(int i, int i2, Map map, cv cvVar, cv cvVar2, j50 j50Var) {
        this.a = i;
        this.b = i2;
        this.c = map;
        this.d = cvVar;
        this.e = (x10) cvVar2;
        this.f = j50Var;
    }

    @Override // defpackage.q60
    public final Map a() {
        return this.c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [cv, x10] */
    @Override // defpackage.q60
    public final void b() {
        this.e.g(this.f.o);
    }

    @Override // defpackage.q60
    public final int c() {
        return this.b;
    }

    @Override // defpackage.q60
    public final cv d() {
        return this.d;
    }

    @Override // defpackage.q60
    public final int e() {
        return this.a;
    }
}
