package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class mq0 extends i70 implements l20, so0 {
    public long aa;
    public int ab;
    public l1 ac;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public long w;
    public aq0 x;
    public boolean y;
    public long z;

    @Override // defpackage.i70
    public final boolean bj() {
        return false;
    }

    @Override // defpackage.l20
    public final q60 e(r60 r60Var, k60 k60Var, long j) {
        lf0 lf0VarE = k60Var.e(j);
        return r60Var.av(lf0VarE.d, lf0VarE.e, sq.d, new a2(19, lf0VarE, this));
    }

    @Override // defpackage.so0
    public final boolean h() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleGraphicsLayerModifier(scaleX=");
        sb.append(this.r);
        sb.append(", scaleY=");
        sb.append(this.s);
        sb.append(", alpha = ");
        sb.append(this.t);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.u);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=");
        sb.append(this.v);
        sb.append(", transformOrigin=");
        long j = this.w;
        int i = iy0.b;
        sb.append((Object) ("TransformOrigin(packedValue=" + j + ')'));
        sb.append(", shape=");
        sb.append(this.x);
        sb.append(", clip=");
        sb.append(this.y);
        sb.append(", renderEffect=null, ambientShadowColor=");
        n5.k(this.z, sb, ", spotShadowColor=");
        n5.k(this.aa, sb, ", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) f00.ah(this.ab));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // defpackage.so0
    public final void ag(po0 po0Var) {
    }
}
