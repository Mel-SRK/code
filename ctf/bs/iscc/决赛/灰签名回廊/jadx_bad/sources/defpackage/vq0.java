package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class vq0 {
    public final sq0 a;
    public int[] b;
    public Object[] c;
    public ArrayList d;
    public HashMap e;
    public e80 f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final xz p;
    public final xz q;
    public final xz r;
    public e80 s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public d80 x;

    public vq0(sq0 sq0Var) {
        this.a = sq0Var;
        int[] iArr = sq0Var.d;
        this.b = iArr;
        Object[] objArr = sq0Var.f;
        this.c = objArr;
        this.d = sq0Var.l;
        this.e = sq0Var.m;
        this.f = sq0Var.n;
        int i = sq0Var.e;
        this.g = i;
        this.h = (iArr.length / 5) - i;
        int i2 = sq0Var.g;
        this.k = i2;
        this.l = objArr.length - i2;
        this.m = i;
        this.p = new xz();
        this.q = new xz();
        this.r = new xz();
        this.u = i;
        this.v = -1;
    }

    public static int i(int i, int i2, int i3, int i4) {
        return i > i2 ? -(((i4 - i3) - i) + 1) : i;
    }

    public static void x(vq0 vq0Var) {
        int i = vq0Var.v;
        int iQ = vq0Var.q(i);
        int[] iArr = vq0Var.b;
        int i2 = (iQ * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) != 0) {
            return;
        }
        int i4 = (i3 & (-134217729)) | 134217728;
        iArr[i2] = i4;
        if ((67108864 & i4) != 0) {
            return;
        }
        vq0Var.ar(vq0Var.ac(iArr, i));
    }

    public final void a(int i) {
        if (i < 0) {
            xf.c("Cannot seek backwards");
        }
        if (this.n > 0) {
            dh0.b("Cannot call seek() while inserting");
        }
        if (i == 0) {
            return;
        }
        int i2 = this.t + i;
        if (i2 < this.v || i2 > this.u) {
            xf.c("Cannot seek outside the current group (" + this.v + '-' + this.u + ')');
        }
        this.t = i2;
        int iG = g(this.b, q(i2));
        this.i = iG;
        this.j = iG;
    }

    public final void aa(int i, int i2) {
        int i3 = this.l;
        int i4 = this.k;
        int i5 = this.m;
        if (i4 != i) {
            Object[] objArr = this.c;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
        }
        int iMin = Math.min(i2 + 1, o());
        if (i5 != iMin) {
            int length = this.c.length - i3;
            if (iMin < i5) {
                int iQ = q(iMin);
                int iQ2 = q(i5);
                int i7 = this.g;
                while (iQ < iQ2) {
                    int i8 = (iQ * 5) + 4;
                    int i9 = this.b[i8];
                    if (i9 < 0) {
                        xf.c("Unexpected anchor value, expected a positive anchor");
                    }
                    this.b[i8] = -((length - i9) + 1);
                    iQ++;
                    if (iQ == i7) {
                        iQ += this.h;
                    }
                }
            } else {
                int iQ3 = q(i5);
                int iQ4 = q(iMin);
                while (iQ3 < iQ4) {
                    int i10 = (iQ3 * 5) + 4;
                    int i11 = this.b[i10];
                    if (i11 >= 0) {
                        xf.c("Unexpected anchor value, expected a negative anchor");
                    }
                    this.b[i10] = i11 + length + 1;
                    iQ3++;
                    if (iQ3 == this.g) {
                        iQ3 += this.h;
                    }
                }
            }
            this.m = iMin;
        }
        this.k = i;
    }

    public final Object ab(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        if ((iArr[(iQ * 5) + 1] & 1073741824) != 0) {
            return this.c[h(g(iArr, iQ))];
        }
        return null;
    }

    public final int ac(int[] iArr, int i) {
        int i2 = iArr[(q(i) * 5) + 2];
        return i2 > -2 ? i2 : (o() + i2) - (-2);
    }

    public final Object ad(Object obj) {
        if (this.n > 0) {
            v(1, this.v);
        }
        Object[] objArr = this.c;
        int i = this.i;
        this.i = i + 1;
        Object obj2 = objArr[h(i)];
        if (this.i > this.j) {
            xf.c("Writing to an invalid slot");
        }
        this.c[h(this.i - 1)] = obj;
        return obj2;
    }

    public final void ae() {
        int i;
        d80 d80Var = this.x;
        if (d80Var != null) {
            while (d80Var.b != 0) {
                int iAe = f00.ae(d80Var);
                int iQ = q(iAe);
                int iS = iAe + 1;
                int iS2 = s(iAe) + iAe;
                while (true) {
                    if (iS >= iS2) {
                        i = 0;
                        break;
                    } else {
                        if ((this.b[(q(iS) * 5) + 1] & 201326592) != 0) {
                            i = 1;
                            break;
                        }
                        iS += s(iS);
                    }
                }
                int[] iArr = this.b;
                int i2 = (iQ * 5) + 1;
                int i3 = iArr[i2];
                if (((67108864 & i3) != 0 ? 1 : 0) != i) {
                    iArr[i2] = (i << 26) | ((-67108865) & i3);
                    int iAc = ac(iArr, iAe);
                    if (iAc >= 0) {
                        f00.g(d80Var, iAc);
                    }
                }
            }
        }
    }

    public final boolean af() {
        if (this.n != 0) {
            xf.c("Cannot remove group while inserting");
        }
        int i = this.t;
        int i2 = this.i;
        int iG = g(this.b, q(i));
        int iAj = aj();
        am(this.v);
        d80 d80Var = this.x;
        if (d80Var != null) {
            while (true) {
                int i3 = d80Var.b;
                if (i3 == 0) {
                    break;
                }
                if (i3 == 0) {
                    throw new NoSuchElementException("IntList is empty.");
                }
                if (d80Var.a[0] < i) {
                    break;
                }
                f00.ae(d80Var);
            }
        }
        boolean zAg = ag(i, this.t - i);
        ah(iG, this.i - iG, i - 1);
        this.t = i;
        this.i = i2;
        this.o -= iAj;
        return zAg;
    }

    public final boolean ag(int i, int i2) {
        if (i2 > 0) {
            ArrayList arrayList = this.d;
            z(i);
            if (!arrayList.isEmpty()) {
                HashMap map = this.e;
                int i3 = i + i2;
                int iA = uq0.a(this.d, i3, n() - this.h);
                if (iA >= this.d.size()) {
                    iA--;
                }
                int i4 = iA + 1;
                int i5 = 0;
                while (iA >= 0) {
                    Il il = (Il) this.d.get(iA);
                    int iC = c(il);
                    if (iC < i) {
                        break;
                    }
                    if (iC < i3) {
                        il.a = Integer.MIN_VALUE;
                        if (map != null) {
                        }
                        if (i5 == 0) {
                            i5 = iA + 1;
                        }
                        i4 = iA;
                    }
                    iA--;
                }
                z = i4 < i5;
                if (z) {
                    this.d.subList(i4, i5).clear();
                }
            }
            this.g = i;
            this.h += i2;
            int i6 = this.m;
            if (i6 > i) {
                this.m = Math.max(i, i6 - i2);
            }
            int i7 = this.u;
            if (i7 >= this.g) {
                this.u = i7 - i2;
            }
            int i8 = this.v;
            if (i8 >= 0 && (this.b[(q(i8) * 5) + 1] & 67108864) != 0) {
                ar(i8);
            }
        }
        return z;
    }

    public final void ah(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.l;
            int i5 = i + i2;
            aa(i5, i3);
            this.k = i;
            this.l = i4 + i2;
            Arrays.fill(this.c, i, i5, (Object) null);
            int i6 = this.j;
            if (i6 >= i) {
                this.j = i6 - i2;
            }
        }
    }

    public final Object ai(int i, int i2, Object obj) {
        int iAl = al(this.b, q(i));
        int iG = g(this.b, q(i + 1));
        int i3 = iAl + i2;
        if (i3 < iAl || i3 >= iG) {
            xf.c("Write to an invalid slot index " + i2 + " for group " + i);
        }
        int iH = h(i3);
        Object[] objArr = this.c;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    public final int aj() {
        int iQ = q(this.t);
        int i = this.t;
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 3] + i;
        this.t = i3;
        this.i = g(iArr, q(i3));
        int i4 = this.b[i2 + 1];
        if ((1073741824 & i4) != 0) {
            return 1;
        }
        return i4 & 67108863;
    }

    public final void ak() {
        int i = this.u;
        this.t = i;
        this.i = g(this.b, q(i));
    }

    public final int al(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int iB = uq0.b(iArr, i);
        return iB < 0 ? (this.c.length - this.l) + iB + 1 : iB;
    }

    public final uw am(int i) {
        Il ilAp;
        HashMap map = this.e;
        if (map == null || (ilAp = ap(i)) == null) {
            return null;
        }
        return (uw) map.get(ilAp);
    }

    public final void an() {
        if (this.n != 0) {
            xf.c("Key must be supplied when inserting");
        }
        n31 n31Var = nf.a;
        ao(0, n31Var, false, n31Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void ao(int i, Object obj, boolean z, Object obj2) {
        int i2;
        int i3 = this.v;
        Object[] objArr = this.n > 0;
        this.r.c(this.o);
        n31 n31Var = nf.a;
        if (objArr == true) {
            int i4 = this.t;
            int iG = g(this.b, q(i4));
            u(1);
            this.i = iG;
            this.j = iG;
            int iQ = q(i4);
            int i5 = obj != n31Var ? 1 : 0;
            int i6 = (z || obj2 == n31Var) ? 0 : 1;
            int i7 = i(iG, this.k, this.l, this.c.length);
            if (i7 >= 0 && this.m < i4) {
                i7 = -(((this.c.length - this.l) - i7) + 1);
            }
            int[] iArr = this.b;
            int i8 = this.v;
            int i9 = iQ * 5;
            iArr[i9] = i;
            iArr[i9 + 1] = ((z ? 1 : 0) << 30) | (i5 << 29) | (i6 << 28);
            iArr[i9 + 2] = i8;
            iArr[i9 + 3] = 0;
            iArr[i9 + 4] = i7;
            int i10 = (z ? 1 : 0) + i5 + i6;
            if (i10 > 0) {
                v(i10, i4);
                Object[] objArr2 = this.c;
                int i11 = this.i;
                if (z) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                if (i5 != 0) {
                    objArr2[i11] = obj;
                    i11++;
                }
                if (i6 != 0) {
                    objArr2[i11] = obj2;
                    i11++;
                }
                this.i = i11;
            }
            this.o = 0;
            i2 = i4 + 1;
            this.v = i4;
            this.t = i2;
            if (i3 >= 0) {
                am(i3);
            }
        } else {
            this.p.c(i3);
            this.q.c((n() - this.h) - this.u);
            int i12 = this.t;
            int iQ2 = q(i12);
            if (!f00.h(obj2, n31Var)) {
                if (z) {
                    as(this.t, obj2);
                } else {
                    aq(obj2);
                }
            }
            this.i = al(this.b, iQ2);
            this.j = g(this.b, q(this.t + 1));
            int[] iArr2 = this.b;
            int i13 = iQ2 * 5;
            this.o = iArr2[i13 + 1] & 67108863;
            this.v = i12;
            this.t = i12 + 1;
            i2 = i12 + iArr2[i13 + 3];
        }
        this.u = i2;
    }

    public final Il ap(int i) {
        ArrayList arrayList;
        int iD;
        if (i < 0 || i >= o() || (iD = uq0.d((arrayList = this.d), i, o())) < 0) {
            return null;
        }
        return (Il) arrayList.get(iD);
    }

    public final void aq(Object obj) {
        int iQ = q(this.t);
        int i = (iQ * 5) + 1;
        if ((this.b[i] & 268435456) == 0) {
            xf.c("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.c;
        int[] iArr = this.b;
        objArr[h(Integer.bitCount(iArr[i] >> 29) + g(iArr, iQ))] = obj;
    }

    public final void ar(int i) {
        if (i >= 0) {
            d80 d80Var = this.x;
            if (d80Var == null) {
                d80Var = new d80();
                this.x = d80Var;
            }
            f00.g(d80Var, i);
        }
    }

    public final void as(int i, Object obj) {
        int iQ = q(i);
        int[] iArr = this.b;
        if (iQ >= iArr.length || (iArr[(iQ * 5) + 1] & 1073741824) == 0) {
            xf.c("Updating the node of a group at " + i + " that was not created with as a node group");
        }
        this.c[h(g(this.b, iQ))] = obj;
    }

    public final Il b(int i) {
        ArrayList arrayList = this.d;
        int iD = uq0.d(arrayList, i, o());
        if (iD >= 0) {
            return (Il) arrayList.get(iD);
        }
        if (i > this.g) {
            i = -(o() - i);
        }
        Il il = new Il(i);
        arrayList.add(-(iD + 1), il);
        return il;
    }

    public final int c(Il il) {
        int i = il.a;
        return i < 0 ? o() + i : i;
    }

    public final void d() {
        int i = this.n;
        this.n = i + 1;
        if (i == 0) {
            this.q.c((n() - this.h) - this.u);
        }
    }

    public final void e(boolean z) {
        this.w = true;
        if (z && this.p.b == 0) {
            z(o());
            aa(this.c.length - this.l, this.g);
            int i = this.k;
            Arrays.fill(this.c, i, this.l + i, (Object) null);
            ae();
        }
        int[] iArr = this.b;
        int i2 = this.g;
        Object[] objArr = this.c;
        int i3 = this.k;
        ArrayList arrayList = this.d;
        HashMap map = this.e;
        e80 e80Var = this.f;
        sq0 sq0Var = this.a;
        if (!sq0Var.j) {
            dh0.a("Unexpected writer close()");
        }
        sq0Var.j = false;
        sq0Var.d = iArr;
        sq0Var.e = i2;
        sq0Var.f = objArr;
        sq0Var.g = i3;
        sq0Var.l = arrayList;
        sq0Var.m = map;
        sq0Var.n = e80Var;
    }

    public final int f(int i) {
        return g(this.b, q(i));
    }

    public final int g(int[] iArr, int i) {
        if (i >= n()) {
            return this.c.length - this.l;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.c.length - this.l) + i2 + 1 : i2;
    }

    public final int h(int i) {
        return (this.l * (i < this.k ? 0 : 1)) + i;
    }

    public final void j() {
        m80 m80Var;
        boolean z = this.n > 0;
        int i = this.t;
        int i2 = this.u;
        int i3 = this.v;
        int iQ = q(i3);
        int i4 = this.o;
        int i5 = i - i3;
        int i6 = iQ * 5;
        int i7 = i6 + 1;
        boolean z2 = (this.b[i7] & 1073741824) != 0;
        xz xzVar = this.r;
        if (z) {
            e80 e80Var = this.s;
            if (e80Var != null && (m80Var = (m80) e80Var.b(i3)) != null) {
                Object[] objArr = m80Var.a;
                int i8 = m80Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    ad(objArr[i9]);
                }
            }
            int[] iArr = this.b;
            iArr[i6 + 3] = i5;
            uq0.c(iArr, iQ, i4);
            int iB = xzVar.b();
            if (z2) {
                i4 = 1;
            }
            this.o = iB + i4;
            int iAc = ac(this.b, i3);
            this.v = iAc;
            int iO = iAc < 0 ? o() : q(iAc + 1);
            int iG = iO >= 0 ? g(this.b, iO) : 0;
            this.i = iG;
            this.j = iG;
            return;
        }
        if (i != i2) {
            xf.c("Expected to be at the end of a group");
        }
        int[] iArr2 = this.b;
        int i10 = i6 + 3;
        int i11 = iArr2[i10];
        int i12 = iArr2[i7] & 67108863;
        iArr2[i10] = i5;
        uq0.c(iArr2, iQ, i4);
        int iB2 = this.p.b();
        this.u = (n() - this.h) - this.q.b();
        this.v = iB2;
        int iAc2 = ac(this.b, i3);
        int iB3 = xzVar.b();
        this.o = iB3;
        if (iAc2 == iB2) {
            this.o = iB3 + (z2 ? 0 : i4 - i12);
            return;
        }
        int i13 = i5 - i11;
        int i14 = z2 ? 0 : i4 - i12;
        if (i13 != 0 || i14 != 0) {
            while (iAc2 != 0 && iAc2 != iB2 && (i14 != 0 || i13 != 0)) {
                int iQ2 = q(iAc2);
                if (i13 != 0) {
                    int[] iArr3 = this.b;
                    int i15 = (iQ2 * 5) + 3;
                    iArr3[i15] = iArr3[i15] + i13;
                }
                if (i14 != 0) {
                    int[] iArr4 = this.b;
                    uq0.c(iArr4, iQ2, (iArr4[(iQ2 * 5) + 1] & 67108863) + i14);
                }
                int[] iArr5 = this.b;
                if ((iArr5[(iQ2 * 5) + 1] & 1073741824) != 0) {
                    i14 = 0;
                }
                iAc2 = ac(iArr5, iAc2);
            }
        }
        this.o += i14;
    }

    public final void k() {
        if (this.n <= 0) {
            dh0.b("Unbalanced begin/end insert");
        }
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            if (this.r.b != this.p.b) {
                xf.c("startGroup/endGroup mismatch while inserting");
            }
            this.u = (n() - this.h) - this.q.b();
        }
    }

    public final void l(int i) {
        boolean z = false;
        if (!(this.n <= 0)) {
            xf.c("Cannot call ensureStarted() while inserting");
        }
        int i2 = this.v;
        if (i2 != i) {
            if (i >= i2 && i < this.u) {
                z = true;
            }
            if (!z) {
                xf.c("Started group at " + i + " must be a subgroup of the group at " + i2);
            }
            int i3 = this.t;
            int i4 = this.i;
            int i5 = this.j;
            this.t = i;
            an();
            this.t = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public final void m(int i, int i2, int i3) {
        if (i >= this.g) {
            i = -((o() - i) + 2);
        }
        while (i3 < i2) {
            this.b[(q(i3) * 5) + 2] = i;
            int i4 = this.b[(q(i3) * 5) + 3] + i3;
            m(i3, i4, i3 + 1);
            i3 = i4;
        }
    }

    public final int n() {
        return this.b.length / 5;
    }

    public final int o() {
        return n() - this.h;
    }

    public final Object p(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = (iQ * 5) + 1;
        if ((iArr[i2] & 268435456) == 0) {
            return nf.a;
        }
        return this.c[Integer.bitCount(iArr[i2] >> 29) + g(iArr, iQ)];
    }

    public final int q(int i) {
        return (this.h * (i < this.g ? 0 : 1)) + i;
    }

    public final Object r(int i) {
        int iQ = q(i);
        int[] iArr = this.b;
        int i2 = iQ * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.c[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final int s(int i) {
        return this.b[(q(i) * 5) + 3];
    }

    public final boolean t(int i, int i2) {
        int iN;
        int iS;
        if (i2 == this.v) {
            iN = this.u;
        } else {
            xz xzVar = this.p;
            if (i2 > xzVar.a(0)) {
                iS = s(i2);
            } else {
                int[] iArr = xzVar.a;
                int iMin = Math.min(iArr.length, xzVar.b);
                int i3 = 0;
                while (true) {
                    if (i3 >= iMin) {
                        i3 = -1;
                        break;
                    }
                    if (iArr[i3] == i2) {
                        break;
                    }
                    i3++;
                }
                if (i3 < 0) {
                    iS = s(i2);
                } else {
                    iN = (n() - this.h) - this.q.a[i3];
                }
            }
            iN = iS + i2;
        }
        return i > i2 && i < iN;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.t + " end=" + this.u + " size = " + o() + " gap=" + this.g + '-' + (this.g + this.h) + ')';
    }

    public final void u(int i) {
        if (i > 0) {
            int i2 = this.t;
            z(i2);
            int i3 = this.g;
            int i4 = this.h;
            int[] iArr = this.b;
            int length = iArr.length / 5;
            int i5 = length - i4;
            if (i4 < i) {
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[iMax * 5];
                int i6 = iMax - i5;
                h7.as(iArr, iArr2, 0, 0, i3 * 5);
                h7.as(iArr, iArr2, (i3 + i6) * 5, (i4 + i3) * 5, length * 5);
                this.b = iArr2;
                i4 = i6;
            }
            int i7 = this.u;
            if (i7 >= i3) {
                this.u = i7 + i;
            }
            int i8 = i3 + i;
            this.g = i8;
            this.h = i4 - i;
            int i9 = i(i5 > 0 ? f(i2 + i) : 0, this.m >= i3 ? this.k : 0, this.l, this.c.length);
            for (int i10 = i3; i10 < i8; i10++) {
                this.b[(i10 * 5) + 4] = i9;
            }
            int i11 = this.m;
            if (i11 >= i3) {
                this.m = i11 + i;
            }
        }
    }

    public final void v(int i, int i2) {
        if (i > 0) {
            aa(this.i, i2);
            int i3 = this.k;
            int i4 = this.l;
            if (i4 < i) {
                Object[] objArr = this.c;
                int length = objArr.length;
                int i5 = length - i4;
                int iMax = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i6 = 0; i6 < iMax; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = iMax - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.c = objArr2;
                i4 = i7;
            }
            int i9 = this.j;
            if (i9 >= i3) {
                this.j = i9 + i;
            }
            this.k = i3 + i;
            this.l = i4 - i;
        }
    }

    public final boolean w(int i) {
        return (this.b[(q(i) * 5) + 1] & 1073741824) != 0;
    }

    public final void y(sq0 sq0Var, int i) {
        if (this.n <= 0) {
            xf.c("Check failed");
        }
        if (i == 0 && this.t == 0 && this.a.e == 0) {
            int[] iArr = sq0Var.d;
            int i2 = iArr[(i * 5) + 3];
            int i3 = sq0Var.e;
            if (i2 == i3) {
                int[] iArr2 = this.b;
                Object[] objArr = this.c;
                ArrayList arrayList = this.d;
                HashMap map = this.e;
                e80 e80Var = this.f;
                Object[] objArr2 = sq0Var.f;
                int i4 = sq0Var.g;
                HashMap map2 = sq0Var.m;
                e80 e80Var2 = sq0Var.n;
                this.b = iArr;
                this.c = objArr2;
                this.d = sq0Var.l;
                this.g = i3;
                this.h = (iArr.length / 5) - i3;
                this.k = i4;
                this.l = objArr2.length - i4;
                this.m = i3;
                this.e = map2;
                this.f = e80Var2;
                sq0Var.d = iArr2;
                sq0Var.e = 0;
                sq0Var.f = objArr;
                sq0Var.g = 0;
                sq0Var.l = arrayList;
                sq0Var.m = map;
                sq0Var.n = e80Var;
                return;
            }
        }
        vq0 vq0VarD = sq0Var.d();
        try {
            qo0.l(vq0VarD, i, this, true, true, false);
            vq0VarD.e(true);
        } catch (Throwable th) {
            vq0VarD.e(false);
            throw th;
        }
    }

    public final void z(int i) {
        Il il;
        int i2;
        Il il2;
        int i3;
        int i4;
        int i5 = this.h;
        int i6 = this.g;
        if (i6 != i) {
            if (!this.d.isEmpty()) {
                int iN = n() - this.h;
                ArrayList arrayList = this.d;
                if (i6 < i) {
                    for (int iA = uq0.a(arrayList, i6, iN); iA < this.d.size() && (i3 = (il2 = (Il) this.d.get(iA)).a) < 0 && (i4 = i3 + iN) < i; iA++) {
                        il2.a = i4;
                    }
                } else {
                    for (int iA2 = uq0.a(arrayList, i, iN); iA2 < this.d.size() && (i2 = (il = (Il) this.d.get(iA2)).a) >= 0; iA2++) {
                        il.a = -(iN - i2);
                    }
                }
            }
            if (i5 > 0) {
                int[] iArr = this.b;
                int i7 = i * 5;
                int i8 = i5 * 5;
                int i9 = i6 * 5;
                if (i < i6) {
                    h7.as(iArr, iArr, i8 + i7, i7, i9);
                } else {
                    h7.as(iArr, iArr, i9, i9 + i8, i7 + i8);
                }
            }
            if (i < i6) {
                i6 = i + i5;
            }
            int iN2 = n();
            if (i6 >= iN2) {
                xf.c("Check failed");
            }
            while (i6 < iN2) {
                int i10 = (i6 * 5) + 2;
                int i11 = this.b[i10];
                int iO = i11 > -2 ? i11 : (o() + i11) - (-2);
                if (iO >= i) {
                    iO = -((o() - iO) - (-2));
                }
                if (iO != i11) {
                    this.b[i10] = iO;
                }
                i6++;
                if (i6 == i) {
                    i6 += i5;
                }
            }
        }
        this.g = i;
    }
}
