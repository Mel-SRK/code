package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ml implements um0 {
    public final /* synthetic */ nl a;

    public ml(nl nlVar) {
        this.a = nlVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [cv, x10] */
    @Override // defpackage.um0
    public final float a(float f) {
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        nl nlVar = this.a;
        float fFloatValue = ((Number) nlVar.a.g(Float.valueOf(f))).floatValue();
        nlVar.e.setValue(Boolean.valueOf(fFloatValue > 0.0f));
        nlVar.f.setValue(Boolean.valueOf(fFloatValue < 0.0f));
        return fFloatValue;
    }
}
