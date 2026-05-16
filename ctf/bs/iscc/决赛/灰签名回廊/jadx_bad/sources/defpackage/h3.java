package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h3 extends rv implements cv {
    public final /* synthetic */ c30 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(c30 c30Var) {
        super(1, e00.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.l = c30Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        float[] fArr = ((j60) obj).a;
        d20 d20Var = (d20) this.l.u.getValue();
        if (d20Var != null) {
            if (!d20Var.af()) {
                d20Var = null;
            }
            if (d20Var != null) {
                d20Var.ag(fArr);
            }
        }
        return wz0.a;
    }
}
