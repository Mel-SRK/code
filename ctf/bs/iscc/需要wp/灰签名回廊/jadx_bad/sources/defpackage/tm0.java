package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tm0 implements sd0 {
    public final int d;
    public final List e;
    public Float f = null;
    public Float g = null;
    public qm0 h = null;
    public qm0 i = null;

    public tm0(int i, ArrayList arrayList) {
        this.d = i;
        this.e = arrayList;
    }

    @Override // defpackage.sd0
    public final boolean y() {
        return this.e.contains(this);
    }
}
