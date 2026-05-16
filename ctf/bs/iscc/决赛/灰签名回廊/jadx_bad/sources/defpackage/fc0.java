package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class fc0 extends tc0 {
    public static final fc0 c = new fc0(1, 0, 2);

    @Override // defpackage.tc0
    public final void a(tv tvVar, p6 p6Var, vq0 vq0Var, da0 da0Var, uc0 uc0Var) {
        int[] iArr;
        Il il;
        int iC;
        int iC2 = tvVar.c(0);
        if (vq0Var.n != 0) {
            xf.c("Cannot move a group while inserting");
        }
        if (iC2 < 0) {
            xf.c("Parameter offset is out of bounds");
        }
        if (iC2 == 0) {
            return;
        }
        int i = vq0Var.t;
        int i2 = vq0Var.v;
        int i3 = vq0Var.u;
        int i4 = i;
        while (true) {
            iArr = vq0Var.b;
            if (iC2 <= 0) {
                break;
            }
            i4 += iArr[(vq0Var.q(i4) * 5) + 3];
            if (i4 > i3) {
                xf.c("Parameter offset is out of bounds");
            }
            iC2--;
        }
        int i5 = iArr[(vq0Var.q(i4) * 5) + 3];
        int iG = vq0Var.g(vq0Var.b, vq0Var.q(vq0Var.t));
        int iG2 = vq0Var.g(vq0Var.b, vq0Var.q(i4));
        int i6 = i4 + i5;
        int iG3 = vq0Var.g(vq0Var.b, vq0Var.q(i6));
        int i7 = iG3 - iG2;
        vq0Var.v(i7, Math.max(vq0Var.t - 1, 0));
        vq0Var.u(i5);
        int[] iArr2 = vq0Var.b;
        int iQ = vq0Var.q(i6) * 5;
        h7.as(iArr2, iArr2, vq0Var.q(i) * 5, iQ, (i5 * 5) + iQ);
        if (i7 > 0) {
            Object[] objArr = vq0Var.c;
            int iH = vq0Var.h(iG2 + i7);
            System.arraycopy(objArr, iH, objArr, iG, vq0Var.h(iG3 + i7) - iH);
        }
        int i8 = iG2 + i7;
        int i9 = i8 - iG;
        int i10 = vq0Var.k;
        int i11 = vq0Var.l;
        int length = vq0Var.c.length;
        int i12 = vq0Var.m;
        int i13 = i + i5;
        int i14 = i;
        while (i14 < i13) {
            int iQ2 = vq0Var.q(i14);
            int i15 = i9;
            int[] iArr3 = iArr2;
            iArr3[(iQ2 * 5) + 4] = vq0.i(vq0.i(vq0Var.g(iArr2, iQ2) - i15, i12 < iQ2 ? 0 : i10, i11, length), vq0Var.k, vq0Var.l, vq0Var.c.length);
            i14++;
            i9 = i15;
            iArr2 = iArr3;
            i10 = i10;
        }
        int i16 = i6 + i5;
        int iO = vq0Var.o();
        int iA = uq0.a(vq0Var.d, i6, iO);
        ArrayList arrayList = new ArrayList();
        if (iA >= 0) {
            while (iA < vq0Var.d.size() && (iC = vq0Var.c((il = (Il) vq0Var.d.get(iA)))) >= i6 && iC < i16) {
                arrayList.add(il);
            }
        }
        int i17 = i - i6;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            Il il2 = (Il) arrayList.get(i18);
            int iC3 = vq0Var.c(il2) + i17;
            if (iC3 >= vq0Var.g) {
                il2.a = -(iO - iC3);
            } else {
                il2.a = iC3;
            }
            vq0Var.d.add(uq0.a(vq0Var.d, iC3, iO), il2);
        }
        if (vq0Var.ag(i6, i5)) {
            xf.c("Unexpectedly removed anchors");
        }
        vq0Var.m(i2, vq0Var.u, i);
        if (i7 > 0) {
            vq0Var.ah(i8, i7, i6 - 1);
        }
    }
}
