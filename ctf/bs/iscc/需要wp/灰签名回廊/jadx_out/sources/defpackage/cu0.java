package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class cu0 extends d21 {
    public final HashMap f;
    public final /* synthetic */ du0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu0(du0 du0Var) {
        super(0);
        this.g = du0Var;
        this.f = new HashMap();
    }

    @Override // defpackage.d21
    public final void b(m21 m21Var) {
        ArrayList arrayList = this.g.b;
        if ((m21Var.a.d() & 519) != 0) {
            this.f.remove(m21Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                yh0 yh0Var = (yh0) arrayList.get(size);
                int i = yh0Var.e;
                boolean z = i > 0;
                int i2 = i - 1;
                yh0Var.e = i2;
                if (z && i2 == 0) {
                    yh0Var.c();
                }
            }
        }
    }

    @Override // defpackage.d21
    public final void c(m21 m21Var) {
        ArrayList arrayList = this.g.b;
        if ((m21Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((yh0) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.d21
    public final e31 d(e31 e31Var, List list) {
        ArrayList arrayList = this.g.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            m21 m21Var = (m21) list.get(size);
            Integer num = (Integer) this.f.get(m21Var);
            if (num != null) {
                int iIntValue = num.intValue();
                float fA = m21Var.a.a();
                if ((iIntValue & 1) != 0) {
                    rectF.left = fA;
                }
                if ((iIntValue & 2) != 0) {
                    rectF.top = fA;
                }
                if ((iIntValue & 4) != 0) {
                    rectF.right = fA;
                }
                if ((iIntValue & 8) != 0) {
                    rectF.bottom = fA;
                }
                i |= iIntValue;
            }
        }
        iz izVarB = iz.b(e31Var.a.f(519), e31Var.a.f(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            yh0 yh0Var = (yh0) arrayList.get(size2);
            iz izVar = yh0Var.d;
            ArrayList arrayList2 = yh0Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                xc xcVar = (xc) arrayList2.get(size3);
                int i2 = xcVar.a;
                if ((i2 & i) != 0) {
                    xh0 xh0Var = xcVar.b;
                    if (!xh0Var.d) {
                        xh0Var.d = true;
                        f1 f1Var = xh0Var.i;
                        if (f1Var != null) {
                            ((View) f1Var.f).setVisibility(0);
                        }
                    }
                    if (i2 == 1) {
                        int i3 = izVar.a;
                        if (i3 > 0) {
                            xcVar.b(izVarB.a / i3);
                        }
                        xcVar.a(rectF.left);
                    } else if (i2 == 2) {
                        int i4 = izVar.b;
                        if (i4 > 0) {
                            xcVar.b(izVarB.b / i4);
                        }
                        xcVar.a(rectF.top);
                    } else if (i2 == 4) {
                        int i5 = izVar.c;
                        if (i5 > 0) {
                            xcVar.b(izVarB.c / i5);
                        }
                        xcVar.a(rectF.right);
                    } else if (i2 == 8) {
                        int i6 = izVar.d;
                        if (i6 > 0) {
                            xcVar.b(izVarB.d / i6);
                        }
                        xcVar.a(rectF.bottom);
                    }
                }
            }
        }
        return e31Var;
    }

    @Override // defpackage.d21
    public final f1 e(m21 m21Var, f1 f1Var) {
        if ((m21Var.a.d() & 519) != 0) {
            iz izVar = (iz) f1Var.f;
            iz izVar2 = (iz) f1Var.e;
            int i = izVar.a != izVar2.a ? 1 : 0;
            if (izVar.b != izVar2.b) {
                i |= 2;
            }
            if (izVar.c != izVar2.c) {
                i |= 4;
            }
            if (izVar.d != izVar2.d) {
                i |= 8;
            }
            this.f.put(m21Var, Integer.valueOf(i));
        }
        return f1Var;
    }
}
