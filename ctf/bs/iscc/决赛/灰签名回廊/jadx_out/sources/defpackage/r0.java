package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 extends rv implements pu {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.l = i4;
    }

    @Override // defpackage.pu
    public final Object a() {
        ContentCaptureSession contentCaptureSessionA;
        da0 da0Var;
        char c;
        char c2;
        switch (this.l) {
            case 0:
                View view = (View) this.e;
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    ax.e(view);
                }
                if (i < 29 || (contentCaptureSessionA = ih.a(view)) == null) {
                    return null;
                }
                return new cz(contentCaptureSessionA, view);
            default:
                rs rsVar = (rs) this.e;
                r80 r80Var = rsVar.c;
                r80 r80Var2 = rsVar.d;
                us usVar = rsVar.a;
                gt gtVar = usVar.h;
                et etVar = et.g;
                if (gtVar == null) {
                    Object[] objArr = r80Var2.b;
                    long[] jArr = r80Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        char c3 = 7;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << c3) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                int i4 = 0;
                                while (i4 < i3) {
                                    if ((j & 255) < 128) {
                                        c2 = c3;
                                        ((ms) objArr[(i2 << 3) + i4]).am(etVar);
                                    } else {
                                        c2 = c3;
                                    }
                                    j >>= 8;
                                    i4++;
                                    c3 = c2;
                                }
                                c = c3;
                                if (i3 == 8) {
                                }
                            } else {
                                c = c3;
                            }
                            if (i2 != length) {
                                i2++;
                                c3 = c;
                            }
                        }
                    }
                } else if (gtVar.q) {
                    if (r80Var.c(gtVar)) {
                        gtVar.bz();
                    }
                    et etVarBx = gtVar.bx();
                    if (!gtVar.d.q) {
                        sy.b("visitAncestors called on an unattached node");
                    }
                    i70 i70Var = gtVar.d;
                    s20 s20VarAy = pk.ay(gtVar);
                    int i5 = 0;
                    while (s20VarAy != null) {
                        if ((((i70) s20VarAy.ag.j).g & 5120) != 0) {
                            while (i70Var != null) {
                                int i6 = i70Var.f;
                                if ((i6 & 5120) != 0) {
                                    if ((i6 & 1024) != 0) {
                                        i5++;
                                    }
                                    if ((i70Var instanceof ms) && r80Var2.c(i70Var)) {
                                        if (i5 <= 1) {
                                            ((ms) i70Var).am(etVarBx);
                                        } else {
                                            ((ms) i70Var).am(et.e);
                                        }
                                        r80Var2.k(i70Var);
                                    }
                                }
                                i70Var = i70Var.h;
                            }
                        }
                        s20VarAy = s20VarAy.q();
                        i70Var = (s20VarAy == null || (da0Var = s20VarAy.ag) == null) ? null : (hu0) da0Var.i;
                    }
                    Object[] objArr2 = r80Var2.b;
                    long[] jArr2 = r80Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i7 = 0;
                        while (true) {
                            long j2 = jArr2[i7];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i8 = 8 - ((~(i7 - length2)) >>> 31);
                                for (int i9 = 0; i9 < i8; i9++) {
                                    if ((j2 & 255) < 128) {
                                        ((ms) objArr2[(i7 << 3) + i9]).am(etVar);
                                    }
                                    j2 >>= 8;
                                }
                                if (i8 == 8) {
                                }
                            }
                            if (i7 != length2) {
                                i7++;
                            }
                        }
                    }
                }
                if (usVar.h == null || usVar.c.bx() == etVar) {
                    usVar.c();
                }
                r80Var.b();
                r80Var2.b();
                rsVar.e = false;
                return wz0.a;
        }
    }
}
