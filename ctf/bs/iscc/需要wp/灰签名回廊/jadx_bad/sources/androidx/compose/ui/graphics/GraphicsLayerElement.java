package androidx.compose.ui.graphics;

import defpackage.aq0;
import defpackage.f00;
import defpackage.fa0;
import defpackage.i70;
import defpackage.iy0;
import defpackage.l1;
import defpackage.mq0;
import defpackage.n5;
import defpackage.n70;
import defpackage.pk;
import defpackage.qc;

/* JADX INFO: loaded from: classes.dex */
final class GraphicsLayerElement extends n70 {
    public final float a;
    public final float b;
    public final long c;
    public final aq0 d;
    public final boolean e;
    public final long f;
    public final long g;

    public GraphicsLayerElement(float f, float f2, long j, aq0 aq0Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = j;
        this.d = aq0Var;
        this.e = z;
        this.f = j2;
        this.g = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GraphicsLayerElement) {
            GraphicsLayerElement graphicsLayerElement = (GraphicsLayerElement) obj;
            if (Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.a, graphicsLayerElement.a) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.b, graphicsLayerElement.b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0) {
                long j = graphicsLayerElement.c;
                int i = iy0.b;
                if (this.c == j && f00.h(this.d, graphicsLayerElement.d) && this.e == graphicsLayerElement.e && qc.c(this.f, graphicsLayerElement.f) && qc.c(this.g, graphicsLayerElement.g)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.n70
    public final i70 f() {
        mq0 mq0Var = new mq0();
        mq0Var.r = 1.0f;
        mq0Var.s = 1.0f;
        mq0Var.t = this.a;
        mq0Var.u = this.b;
        mq0Var.v = 8.0f;
        mq0Var.w = this.c;
        mq0Var.x = this.d;
        mq0Var.y = this.e;
        mq0Var.z = this.f;
        mq0Var.aa = this.g;
        mq0Var.ab = 3;
        mq0Var.ac = new l1(24, mq0Var);
        return mq0Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        mq0 mq0Var = (mq0) i70Var;
        mq0Var.r = 1.0f;
        mq0Var.s = 1.0f;
        mq0Var.t = this.a;
        mq0Var.u = this.b;
        mq0Var.v = 8.0f;
        mq0Var.w = this.c;
        mq0Var.x = this.d;
        mq0Var.y = this.e;
        mq0Var.z = this.f;
        mq0Var.aa = this.g;
        mq0Var.ab = 3;
        fa0 fa0Var = pk.aw(mq0Var, 2).s;
        if (fa0Var != null) {
            fa0Var.c0(mq0Var.ac, true);
        }
    }

    public final int hashCode() {
        int iB = n5.b(8.0f, n5.b(0.0f, n5.b(0.0f, n5.b(0.0f, n5.b(this.b, n5.b(0.0f, n5.b(0.0f, n5.b(this.a, n5.b(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = iy0.b;
        int iE = n5.e((this.d.hashCode() + n5.d(iB, 31, this.c)) * 31, 961, this.e);
        int i2 = qc.h;
        return n5.c(3, n5.c(0, n5.d(n5.d(iE, 31, this.f), 31, this.g), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.a);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.b);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        int i = iy0.b;
        sb.append((Object) ("TransformOrigin(packedValue=" + this.c + ')'));
        sb.append(", shape=");
        sb.append(this.d);
        sb.append(", clip=");
        sb.append(this.e);
        sb.append(", renderEffect=null, ambientShadowColor=");
        n5.k(this.f, sb, ", spotShadowColor=");
        sb.append((Object) qc.i(this.g));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) f00.ah(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
