package androidx.compose.foundation.layout;

import defpackage.i70;
import defpackage.mn;
import defpackage.n5;
import defpackage.n70;
import defpackage.qq0;

/* JADX INFO: loaded from: classes.dex */
final class SizeElement extends n70 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public SizeElement(float f, float f2, float f3, float f4, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SizeElement)) {
            return false;
        }
        SizeElement sizeElement = (SizeElement) obj;
        return mn.a(this.a, sizeElement.a) && mn.a(this.b, sizeElement.b) && mn.a(this.c, sizeElement.c) && mn.a(this.d, sizeElement.d) && this.e == sizeElement.e;
    }

    @Override // defpackage.n70
    public final i70 f() {
        qq0 qq0Var = new qq0();
        qq0Var.r = this.a;
        qq0Var.s = this.b;
        qq0Var.t = this.c;
        qq0Var.u = this.d;
        qq0Var.v = this.e;
        return qq0Var;
    }

    @Override // defpackage.n70
    public final void g(i70 i70Var) {
        qq0 qq0Var = (qq0) i70Var;
        qq0Var.r = this.a;
        qq0Var.s = this.b;
        qq0Var.t = this.c;
        qq0Var.u = this.d;
        qq0Var.v = this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + n5.b(this.d, n5.b(this.c, n5.b(this.b, Float.hashCode(this.a) * 31, 31), 31), 31);
    }

    public /* synthetic */ SizeElement(float f, float f2) {
        this(Float.NaN, f, Float.NaN, f2, true);
    }
}
