package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class zy {
    public final /* synthetic */ int a;
    public final tx b;
    public final tx c;
    public final tx d;
    public final tx e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public zy(zy[] zyVarArr) {
        this.a = 0;
        this.f = zyVarArr;
        int length = zyVarArr.length;
        tx[] txVarArr = new tx[length];
        for (int i = 0; i < length; i++) {
            txVarArr[i] = ((zy[]) this.f)[i].b();
        }
        this.b = new tx(new w01(txVarArr, 0), 1);
        int length2 = ((zy[]) this.f).length;
        tx[] txVarArr2 = new tx[length2];
        for (int i2 = 0; i2 < length2; i2++) {
            txVarArr2[i2] = ((zy[]) this.f)[i2].d();
        }
        this.c = new tx(new sx(txVarArr2, 0), 0);
        int length3 = ((zy[]) this.f).length;
        tx[] txVarArr3 = new tx[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            txVarArr3[i3] = ((zy[]) this.f)[i3].c();
        }
        this.d = new tx(new w01(txVarArr3, 1), 1);
        int length4 = ((zy[]) this.f).length;
        tx[] txVarArr4 = new tx[length4];
        for (int i4 = 0; i4 < length4; i4++) {
            txVarArr4[i4] = ((zy[]) this.f)[i4].a();
        }
        this.e = new tx(new sx(txVarArr4, 1), 0);
    }

    public final tx a() {
        switch (this.a) {
        }
        return this.e;
    }

    public final tx b() {
        switch (this.a) {
        }
        return this.b;
    }

    public final tx c() {
        switch (this.a) {
        }
        return this.d;
    }

    public final tx d() {
        switch (this.a) {
        }
        return this.c;
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                zy[] zyVarArr = (zy[]) this.f;
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i = 0;
                for (zy zyVar : zyVarArr) {
                    i++;
                    if (i > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    jo0.c(sb, zyVar, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                return "RectRulers(" + ((String) this.f) + ')';
        }
    }

    public zy(String str) {
        this.a = 1;
        this.f = str;
        this.b = new tx(null, 1);
        this.c = new tx(null, 0);
        this.d = new tx(null, 1);
        this.e = new tx(null, 0);
    }
}
