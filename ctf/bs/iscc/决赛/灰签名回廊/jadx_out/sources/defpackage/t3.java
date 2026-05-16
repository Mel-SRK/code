package defpackage;

import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class t3 {
    public final Path a;
    public RectF b;
    public float[] c;

    public t3(Path path) {
        this.a = path;
    }

    public static void a(t3 t3Var, yk0 yk0Var) {
        if (t3Var.b == null) {
            t3Var.b = new RectF();
        }
        RectF rectF = t3Var.b;
        rectF.getClass();
        float f = yk0Var.a;
        long j = yk0Var.h;
        long j2 = yk0Var.g;
        long j3 = yk0Var.f;
        long j4 = yk0Var.e;
        rectF.set(f, yk0Var.b, yk0Var.c, yk0Var.d);
        if (t3Var.c == null) {
            t3Var.c = new float[8];
        }
        float[] fArr = t3Var.c;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = t3Var.a;
        RectF rectF2 = t3Var.b;
        rectF2.getClass();
        float[] fArr2 = t3Var.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final ri0 b() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new ri0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final boolean c(t3 t3Var, t3 t3Var2, int i) {
        Path.Op op = i == 0 ? Path.Op.DIFFERENCE : i == 1 ? Path.Op.INTERSECT : i == 4 ? Path.Op.REVERSE_DIFFERENCE : i == 2 ? Path.Op.UNION : Path.Op.XOR;
        if (!(t3Var instanceof t3)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path path = t3Var.a;
        if (t3Var2 instanceof t3) {
            return this.a.op(path, t3Var2.a, op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
