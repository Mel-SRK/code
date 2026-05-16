package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cr0 implements Iterable, d10 {
    public static final cr0 h = new cr0(0, 0, 0, null);
    public final long d;
    public final long e;
    public final long f;
    public final long[] g;

    public cr0(long j, long j2, long j3, long[] jArr) {
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = jArr;
    }

    public final cr0 a(cr0 cr0Var) {
        cr0 cr0VarB;
        long j;
        long[] jArr;
        cr0 cr0Var2 = h;
        if (cr0Var == cr0Var2) {
            return this;
        }
        if (this == cr0Var2) {
            return cr0Var2;
        }
        long j2 = cr0Var.f;
        long j3 = cr0Var.f;
        long[] jArr2 = cr0Var.g;
        long j4 = cr0Var.e;
        long j5 = cr0Var.d;
        long j6 = this.f;
        if (j2 == j6 && jArr2 == (jArr = this.g)) {
            return new cr0(this.d & (~j5), this.e & (~j4), j6, jArr);
        }
        if (jArr2 != null) {
            cr0VarB = this;
            for (long j7 : jArr2) {
                cr0VarB = cr0VarB.b(j7);
            }
        } else {
            cr0VarB = this;
        }
        long j8 = 0;
        if (j4 != 0) {
            int i = 0;
            while (i < 64) {
                if (((1 << i) & j4) != j8) {
                    j = j8;
                    cr0VarB = cr0VarB.b(((long) i) + j3);
                } else {
                    j = j8;
                }
                i++;
                j8 = j;
            }
        }
        long j9 = j8;
        if (j5 != j9) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j5) != j9) {
                    cr0VarB = cr0VarB.b(((long) i2) + j3 + ((long) 64));
                }
            }
        }
        return cr0VarB;
    }

    public final cr0 b(long j) {
        long[] jArr;
        int iA;
        long[] jArr2;
        long j2 = j - this.f;
        long j3 = 0;
        if (f00.n(j2, j3) >= 0 && f00.n(j2, 64) < 0) {
            long j4 = 1 << ((int) j2);
            long j5 = this.e;
            if ((j5 & j4) != 0) {
                return new cr0(this.d, j5 & (~j4), this.f, this.g);
            }
        } else if (f00.n(j2, 64) >= 0 && f00.n(j2, 128) < 0) {
            long j6 = 1 << (((int) j2) - 64);
            long j7 = this.d;
            if ((j7 & j6) != 0) {
                return new cr0(j7 & (~j6), this.e, this.f, this.g);
            }
        } else if (f00.n(j2, j3) < 0 && (jArr = this.g) != null && (iA = wn0.a(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (iA > 0) {
                    h7.at(jArr, jArr3, 0, 0, iA);
                }
                if (iA < i) {
                    h7.at(jArr, jArr3, iA, iA + 1, length);
                }
                jArr2 = jArr3;
            }
            return new cr0(this.d, this.e, this.f, jArr2);
        }
        return this;
    }

    public final boolean c(long j) {
        long[] jArr;
        long j2 = j - this.f;
        long j3 = 0;
        return (f00.n(j2, j3) < 0 || f00.n(j2, (long) 64) >= 0) ? (f00.n(j2, (long) 64) < 0 || f00.n(j2, (long) 128) >= 0) ? f00.n(j2, j3) <= 0 && (jArr = this.g) != null && wn0.a(jArr, j) >= 0 : ((1 << (((int) j2) - 64)) & this.d) != 0 : ((1 << ((int) j2)) & this.e) != 0;
    }

    public final cr0 d(cr0 cr0Var) {
        cr0 cr0VarE;
        cr0 cr0VarE2;
        long[] jArr;
        cr0 cr0Var2 = h;
        if (cr0Var == cr0Var2) {
            return this;
        }
        if (this == cr0Var2) {
            return cr0Var;
        }
        long j = cr0Var.f;
        long j2 = cr0Var.f;
        long[] jArr2 = cr0Var.g;
        long j3 = cr0Var.e;
        long j4 = cr0Var.d;
        long j5 = this.f;
        long j6 = this.e;
        long j7 = this.d;
        if (j == j5 && jArr2 == (jArr = this.g)) {
            return new cr0(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = this.g;
        if (jArr3 != null) {
            if (jArr2 != null) {
                cr0VarE = this;
                for (long j8 : jArr2) {
                    cr0VarE = cr0VarE.e(j8);
                }
            } else {
                cr0VarE = this;
            }
            if (j3 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j3) != 0) {
                        cr0VarE = cr0VarE.e(((long) i2) + j2);
                    }
                }
            }
            if (j4 != 0) {
                while (i < 64) {
                    if (((1 << i) & j4) != 0) {
                        cr0VarE = cr0VarE.e(((long) i) + j2 + ((long) 64));
                    }
                    i++;
                }
            }
            return cr0VarE;
        }
        if (jArr3 != null) {
            cr0VarE2 = cr0Var;
            for (long j9 : jArr3) {
                cr0VarE2 = cr0VarE2.e(j9);
            }
        } else {
            cr0VarE2 = cr0Var;
        }
        long j10 = this.f;
        if (j6 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j6) != 0) {
                    cr0VarE2 = cr0VarE2.e(((long) i3) + j10);
                }
            }
        }
        if (j7 != 0) {
            while (i < 64) {
                if (((1 << i) & j7) != 0) {
                    cr0VarE2 = cr0VarE2.e(((long) i) + j10 + ((long) 64));
                }
                i++;
            }
        }
        return cr0VarE2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cr0 e(long j) {
        long[] jArr;
        long j2;
        long[] jArr2;
        long[] jArr3;
        long[] jArr4;
        long j3 = this.f;
        long j4 = j - j3;
        long j5 = 0;
        int iN = f00.n(j4, j5);
        long j6 = this.e;
        int i = 64;
        long j7 = 0;
        if (iN < 0 || f00.n(j4, 64) >= 0) {
            long j8 = 64;
            int iN2 = f00.n(j4, j8);
            long j9 = this.d;
            if (iN2 < 0 || f00.n(j4, 128) >= 0) {
                long j10 = 128;
                int iN3 = f00.n(j4, j10);
                long[] jArr5 = this.g;
                if (iN3 < 0) {
                    if (jArr5 == null) {
                        return new cr0(this.d, this.e, this.f, new long[]{j});
                    }
                    int iA = wn0.a(jArr5, j);
                    if (iA < 0) {
                        int i2 = -(iA + 1);
                        int length = jArr5.length;
                        long[] jArr6 = new long[length + 1];
                        h7.at(jArr5, jArr6, 0, 0, i2);
                        h7.at(jArr5, jArr6, i2 + 1, i2, length);
                        jArr6[i2] = j;
                        return new cr0(this.d, this.e, this.f, jArr6);
                    }
                } else if (!c(j)) {
                    long j11 = 1;
                    long j12 = ((j + j11) / j8) * j8;
                    if (f00.n(j12, j5) < 0) {
                        j12 = (Long.MAX_VALUE - j10) + j11;
                    }
                    long j13 = j3;
                    long j14 = j9;
                    bu buVar = null;
                    while (true) {
                        if (f00.n(j13, j12) >= 0) {
                            jArr = jArr5;
                            j2 = j13;
                            j7 = j6;
                            break;
                        }
                        if (j6 != 0) {
                            if (buVar == null) {
                                buVar = new bu(jArr5);
                            }
                            int i3 = 0;
                            while (i3 < i) {
                                if ((j6 & (1 << i3)) != 0) {
                                    jArr4 = jArr5;
                                    ((h80) buVar.e).a(((long) i3) + j13);
                                } else {
                                    jArr4 = jArr5;
                                }
                                i3++;
                                jArr5 = jArr4;
                                i = 64;
                            }
                        }
                        long[] jArr7 = jArr5;
                        if (j14 == 0) {
                            j2 = j12;
                            jArr = jArr7;
                            break;
                        }
                        j13 += j8;
                        jArr5 = jArr7;
                        j6 = j14;
                        i = 64;
                        j14 = 0;
                    }
                    if (buVar == null) {
                        jArr2 = jArr;
                    } else {
                        h80 h80Var = (h80) buVar.e;
                        int i4 = h80Var.b;
                        if (i4 == 0) {
                            jArr3 = null;
                        } else {
                            long[] jArr8 = new long[i4];
                            long[] jArr9 = h80Var.a;
                            for (int i5 = 0; i5 < i4; i5++) {
                                jArr8[i5] = jArr9[i5];
                            }
                            jArr3 = jArr8;
                        }
                        if (jArr3 != null) {
                            jArr2 = jArr3;
                        }
                    }
                    return new cr0(j14, j7, j2, jArr2).e(j);
                }
            } else {
                long j15 = 1 << (((int) j4) - 64);
                if ((j9 & j15) == 0) {
                    return new cr0(j9 | j15, this.e, this.f, this.g);
                }
            }
        } else {
            long j16 = 1 << ((int) j4);
            if ((j6 & j16) == 0) {
                return new cr0(this.d, j6 | j16, this.f, this.g);
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return bo0.l(new br0(this, null));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(lc.an(this));
        Iterator it = iterator();
        while (true) {
            op0 op0Var = (op0) it;
            if (!op0Var.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) op0Var.next()).longValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            i++;
            if (i > 1) {
                sb2.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) obj.toString());
            }
        }
        sb2.append((CharSequence) "");
        sb.append(sb2.toString());
        sb.append(']');
        return sb.toString();
    }
}
