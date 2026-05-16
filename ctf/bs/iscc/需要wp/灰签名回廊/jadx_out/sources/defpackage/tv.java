package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tv {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public int d;
    public Object e;

    public tv(int i, int i2, int i3, zw0 zw0Var) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = zw0Var;
    }

    public xn0 a(int i) {
        return new xn0(jo0.f((zw0) this.e, i), i, 1L);
    }

    public int b() {
        return this.d - this.c;
    }

    public int c(int i) {
        return ((vc0) this.e).m[this.c + i];
    }

    public Object d(int i) {
        return ((vc0) this.e).o[this.d + i];
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "";
            case 1:
            default:
                return super.toString();
            case 2:
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                int i = this.b;
                sb.append(i);
                sb.append('-');
                zw0 zw0Var = (zw0) this.e;
                sb.append(jo0.f(zw0Var, i));
                sb.append(',');
                int i2 = this.c;
                sb.append(i2);
                sb.append('-');
                sb.append(jo0.f(zw0Var, i2));
                sb.append("), prevOffset=");
                return n5.h(sb, this.d, ')');
        }
    }

    public tv(vc0 vc0Var) {
        this.e = vc0Var;
    }

    public /* synthetic */ tv() {
    }
}
