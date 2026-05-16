package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class jq implements hq {
    public final /* synthetic */ int d;
    public final String e;

    public /* synthetic */ jq(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // defpackage.hq
    public boolean i(CharSequence charSequence, int i, int i2, kz0 kz0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.e)) {
            return true;
        }
        kz0Var.c = (kz0Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.d) {
            case 1:
                return "<" + this.e + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.hq
    public Object a() {
        return this;
    }
}
