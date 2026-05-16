package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* JADX INFO: loaded from: classes.dex */
public abstract class fi {
    public static final ch0 a;
    public static final rh b;

    static {
        a = new ch0((14 & 1) == 0, tn0.d, true);
        long j = qc.c;
        long j2 = qc.b;
        b = new rh(j, j2, j2, qc.b(j2, 0.38f), qc.b(j2, 0.38f));
    }

    public static final void a(rh rhVar, te teVar, vf vfVar, int i) {
        vf vfVar2;
        vfVar.aw(-921259293);
        int i2 = (vfVar.f(rhVar) ? 4 : 2) | i;
        j70 shadowGraphicsLayerElement = g70.a;
        if (((i2 | (vfVar.f(shadowGraphicsLayerElement) ? 32 : 16)) & 147) == 146 && vfVar.z()) {
            vfVar.aq();
            vfVar2 = vfVar;
        } else {
            float f = vh.d;
            zk0 zk0VarA = al0.a(vh.e);
            float f2 = 0;
            boolean z = Float.compare(f, f2) > 0;
            long j = mw.a;
            if (Float.compare(f, f2) > 0 || z) {
                shadowGraphicsLayerElement = new ShadowGraphicsLayerElement(zk0VarA, z, j, j);
            }
            j70 j70VarD = a.d(a.f(androidx.compose.foundation.a.a(shadowGraphicsLayerElement, rhVar.a, f00.i)), f2, vh.i);
            Object[] objArr = new Object[0];
            f1 f1Var = ym0.i;
            boolean zD = vfVar.d(0);
            Object objAk = vfVar.ak();
            if (zD || objAk == nf.a) {
                objAk = new ng(0, 24);
                vfVar.be(objAk);
            }
            vfVar2 = vfVar;
            j70 j70VarP = m10.p(j70VarD, new d((ym0) m10.aq(objArr, f1Var, (pu) objAk, vfVar2, 0, 4)));
            kd kdVarA = id.a(x6.b, bw.p, vfVar2, 0);
            int iHashCode = Long.hashCode(vfVar2.ar);
            androidx.compose.runtime.internal.a aVarL = vfVar2.l();
            j70 j70VarAn = m10.an(vfVar2, j70VarP);
            kf.b.getClass();
            ng ngVar = jf.b;
            vfVar2.ax();
            if (vfVar2.aq) {
                vfVar2.k(ngVar);
            } else {
                vfVar2.bh();
            }
            jo0.h(vfVar2, jf.e, kdVarA);
            jo0.h(vfVar2, jf.d, aVarL);
            w6 w6Var = jf.f;
            if (vfVar2.aq || !f00.h(vfVar2.ak(), Integer.valueOf(iHashCode))) {
                n5.j(iHashCode, vfVar2, iHashCode, w6Var);
            }
            jo0.h(vfVar2, jf.c, j70VarAn);
            teVar.c(ld.a, vfVar2, 54);
            vfVar2.q(true);
        }
        hi0 hi0VarS = vfVar2.s();
        if (hi0VarS != null) {
            hi0VarS.d = new y1(i, 4, rhVar, teVar);
        }
    }

    public static final void b(String str, boolean z, rh rhVar, j70 j70Var, pu puVar, vf vfVar, int i) {
        int i2;
        vfVar.aw(791018367);
        if ((i & 6) == 0) {
            i2 = (vfVar.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vfVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vfVar.f(rhVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= vfVar.f(j70Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vfVar.h(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= vfVar.h(puVar) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && vfVar.z()) {
            vfVar.aq();
        } else {
            a8 a8Var = vh.f;
            n31 n31Var = x6.a;
            float f = vh.h;
            t6 t6Var = new t6(f);
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objAk = vfVar.ak();
            if (z2 || objAk == nf.a) {
                objAk = new ci(puVar, z);
                vfVar.be(objAk);
            }
            j70 j70VarD = a.d(b.f(m10.p(j70Var, new wb(z, str, (pu) objAk)).c(b.a)), f, 0);
            el0 el0VarA = dl0.a(t6Var, a8Var, vfVar, 54);
            int iHashCode = Long.hashCode(vfVar.ar);
            androidx.compose.runtime.internal.a aVarL = vfVar.l();
            j70 j70VarAn = m10.an(vfVar, j70VarD);
            kf.b.getClass();
            ng ngVar = jf.b;
            vfVar.ax();
            if (vfVar.aq) {
                vfVar.k(ngVar);
            } else {
                vfVar.bh();
            }
            jo0.h(vfVar, jf.e, el0VarA);
            jo0.h(vfVar, jf.d, aVarL);
            w6 w6Var = jf.f;
            if (vfVar.aq || !f00.h(vfVar.ak(), Integer.valueOf(iHashCode))) {
                n5.j(iHashCode, vfVar, iHashCode, w6Var);
            }
            jo0.h(vfVar, jf.c, j70VarAn);
            vfVar.av(554568909);
            vfVar.q(false);
            nx0 nx0Var = new nx0(z ? rhVar.b : rhVar.d, vh.j, vh.k, vh.m, vh.g, vh.l, 16613240);
            if (1.0f <= 0.0d) {
                wc.n("invalid weight 1.0; must be greater than zero");
                return;
            } else {
                d41.f(str, new LayoutWeightElement(1.0f), nx0Var, 0, false, 1, 0, vfVar, (i2 & 14) | 1572864, 440);
                vfVar.q(true);
            }
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new di(str, z, rhVar, j70Var, puVar, i);
        }
    }

    public static final void c(bh0 bh0Var, pu puVar, a2 a2Var, vf vfVar, int i) {
        int i2;
        vfVar.aw(712057293);
        if ((i & 6) == 0) {
            i2 = (vfVar.f(bh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vfVar.h(puVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vfVar.f(g70.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= vfVar.h(a2Var) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && vfVar.z()) {
            vfVar.aq();
        } else {
            Context context = (Context) vfVar.j(d2.b);
            boolean zF = vfVar.f((Configuration) vfVar.j(d2.a)) | vfVar.f(context);
            Object objAk = vfVar.ak();
            if (zF || objAk == nf.a) {
                rh rhVar = b;
                long jB = rhVar.a;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Widget.PopupMenu, new int[]{R.attr.colorBackground});
                int iAv = m10.av(jB);
                int color = typedArrayObtainStyledAttributes.getColor(0, iAv);
                typedArrayObtainStyledAttributes.recycle();
                if (color != iAv) {
                    jB = m10.b(color);
                }
                long j = jB;
                TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(R.style.TextAppearance.Widget.PopupMenu.Large, new int[]{R.attr.textColorPrimary});
                ColorStateList colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(0);
                typedArrayObtainStyledAttributes2.recycle();
                long jB2 = rhVar.b;
                int iAv2 = m10.av(jB2);
                Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iAv2)) : null;
                if (numValueOf != null && numValueOf.intValue() != iAv2) {
                    jB2 = m10.b(numValueOf.intValue());
                }
                long j2 = jB2;
                long jB3 = rhVar.d;
                int iAv3 = m10.av(jB3);
                Integer numValueOf2 = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iAv3)) : null;
                if (numValueOf2 != null && numValueOf2.intValue() != iAv3) {
                    jB3 = m10.b(numValueOf2.intValue());
                }
                long j3 = jB3;
                Object rhVar2 = new rh(j, j2, j2, j3, j3);
                vfVar.be(rhVar2);
                objAk = rhVar2;
            }
            d(bh0Var, puVar, (rh) objAk, a2Var, vfVar, (i2 & 1022) | ((i2 << 3) & 57344));
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new j4(bh0Var, puVar, a2Var, i);
        }
    }

    public static final void d(bh0 bh0Var, pu puVar, rh rhVar, a2 a2Var, vf vfVar, int i) {
        int i2;
        pu puVar2;
        vf vfVar2;
        bh0 bh0Var2;
        vfVar.aw(1447189339);
        if ((i & 6) == 0) {
            i2 = (vfVar.f(bh0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= vfVar.h(puVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= vfVar.f(g70.a) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= vfVar.f(rhVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= vfVar.h(a2Var) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && vfVar.z()) {
            vfVar.aq();
            puVar2 = puVar;
            vfVar2 = vfVar;
            bh0Var2 = bh0Var;
        } else {
            puVar2 = puVar;
            vfVar2 = vfVar;
            g4.a(bh0Var, puVar2, a, t1.aq(795909757, new y1(rhVar, a2Var), vfVar), vfVar2, (i2 & 14) | 3456 | (i2 & 112), 0);
            bh0Var2 = bh0Var;
        }
        hi0 hi0VarS = vfVar2.s();
        if (hi0VarS != null) {
            hi0VarS.d = new ph(bh0Var2, puVar2, rhVar, a2Var, i);
        }
    }
}
