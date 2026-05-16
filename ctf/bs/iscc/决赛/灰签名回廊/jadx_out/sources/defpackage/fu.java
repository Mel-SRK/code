package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class fu implements du {
    public final float[] a;
    public final float[] b;

    public fu(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            wc.n("Array lengths must match and be nonzero");
            throw null;
        }
        this.a = fArr;
        this.b = fArr2;
    }

    @Override // defpackage.du
    public final float a(float f) {
        return n31.e(f, this.b, this.a);
    }

    @Override // defpackage.du
    public final float b(float f) {
        return n31.e(f, this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fu)) {
            return false;
        }
        fu fuVar = (fu) obj;
        return Arrays.equals(this.a, fuVar.a) && Arrays.equals(this.b, fuVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.a);
        string.getClass();
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.b);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }
}
