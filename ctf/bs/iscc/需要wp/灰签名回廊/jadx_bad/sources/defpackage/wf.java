package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wf implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ wf(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return f00.m(((o00) obj).b, ((o00) obj2).b);
            case 1:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                q80 q80Var = dt.d;
                Object objG = q80Var.g(view);
                objG.getClass();
                Rect rect = (Rect) objG;
                Object objG2 = q80Var.g(view2);
                objG2.getClass();
                Rect rect2 = (Rect) objG2;
                int i = rect.top - rect2.top;
                return i == 0 ? rect.bottom - rect2.bottom : i;
            case 2:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                q80 q80Var2 = dt.d;
                Object objG3 = q80Var2.g(view3);
                objG3.getClass();
                Rect rect3 = (Rect) objG3;
                Object objG4 = q80Var2.g(view4);
                objG4.getClass();
                Rect rect4 = (Rect) objG4;
                int i2 = rect3.left - rect4.left;
                return i2 == 0 ? (rect3.right - rect4.right) * dt.c : dt.c * i2;
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i3 = 0; i3 < bArr.length; i3++) {
                    byte b = bArr[i3];
                    byte b2 = bArr2[i3];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 4:
                ae0 ae0Var = (ae0) obj;
                ae0 ae0Var2 = (ae0) obj2;
                return (((Number) ae0Var.e).intValue() - ((Number) ae0Var.d).intValue()) - (((Number) ae0Var2.e).intValue() - ((Number) ae0Var2.d).intValue());
            default:
                s20 s20Var = (s20) obj;
                s20 s20Var2 = (s20) obj2;
                float f = s20Var.ah.o.ag;
                float f2 = s20Var2.ah.o.ag;
                return f == f2 ? f00.m(s20Var.r(), s20Var2.r()) : Float.compare(f, f2);
        }
    }
}
