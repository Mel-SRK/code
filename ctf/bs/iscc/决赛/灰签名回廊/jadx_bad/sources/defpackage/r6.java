package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class r6 implements s6, v6 {
    public final /* synthetic */ int d;
    public final float e;

    public r6(int i) {
        this.d = i;
        switch (i) {
            case 1:
                this.e = 0;
                break;
            case 2:
                this.e = 0;
                break;
            case 3:
                this.e = 0;
                break;
            default:
                this.e = 0;
                break;
        }
    }

    @Override // defpackage.s6, defpackage.v6
    public final float a() {
        switch (this.d) {
        }
        return this.e;
    }

    @Override // defpackage.v6
    public final void b(int i, r60 r60Var, int[] iArr, int[] iArr2) {
        switch (this.d) {
            case 0:
                x6.a(i, iArr, iArr2, false);
                break;
            case 1:
                x6.d(i, iArr, iArr2, false);
                break;
            case 2:
                x6.e(i, iArr, iArr2, false);
                break;
            default:
                x6.f(i, iArr, iArr2, false);
                break;
        }
    }

    @Override // defpackage.s6
    public final void c(r60 r60Var, int i, int[] iArr, e20 e20Var, int[] iArr2) {
        switch (this.d) {
            case 0:
                if (e20Var != e20.d) {
                    x6.a(i, iArr, iArr2, true);
                } else {
                    x6.a(i, iArr, iArr2, false);
                }
                break;
            case 1:
                if (e20Var != e20.d) {
                    x6.d(i, iArr, iArr2, true);
                } else {
                    x6.d(i, iArr, iArr2, false);
                }
                break;
            case 2:
                if (e20Var != e20.d) {
                    x6.e(i, iArr, iArr2, true);
                } else {
                    x6.e(i, iArr, iArr2, false);
                }
                break;
            default:
                if (e20Var != e20.d) {
                    x6.f(i, iArr, iArr2, true);
                } else {
                    x6.f(i, iArr, iArr2, false);
                }
                break;
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                return "Arrangement#Center";
            case 1:
                return "Arrangement#SpaceAround";
            case 2:
                return "Arrangement#SpaceBetween";
            default:
                return "Arrangement#SpaceEvenly";
        }
    }
}
