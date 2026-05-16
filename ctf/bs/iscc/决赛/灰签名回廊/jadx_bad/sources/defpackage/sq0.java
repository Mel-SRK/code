package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class sq0 implements Iterable, d10 {
    public int e;
    public int g;
    public int h;
    public boolean j;
    public int k;
    public HashMap m;
    public e80 n;
    public int[] d = new int[0];
    public Object[] f = new Object[0];
    public final Object i = new Object();
    public ArrayList l = new ArrayList();

    public final int a(Il il) {
        if (this.j) {
            xf.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!il.a()) {
            dh0.a("Anchor refers to a group that was removed");
        }
        return il.a;
    }

    public final void b() {
        this.m = new HashMap();
    }

    public final rq0 c() {
        if (this.j) {
            wc.q("Cannot read while a writer is pending");
            return null;
        }
        this.h++;
        return new rq0(this);
    }

    public final vq0 d() {
        if (this.j) {
            xf.c("Cannot start a writer when another writer is pending");
        }
        if (this.h > 0) {
            xf.c("Cannot start a writer when a reader is pending");
        }
        this.j = true;
        this.k++;
        return new vq0(this);
    }

    public final boolean e(Il il) {
        int iD;
        return il.a() && (iD = uq0.d(this.l, il.a, this.e)) >= 0 && f00.h(this.l.get(iD), il);
    }

    public final uw f(int i) {
        int i2;
        ArrayList arrayList;
        int iD;
        HashMap map = this.m;
        if (map != null) {
            if (this.j) {
                xf.c("use active SlotWriter to crate an anchor for location instead");
            }
            Il il = (i < 0 || i >= (i2 = this.e) || (iD = uq0.d((arrayList = this.l), i, i2)) < 0) ? null : (Il) arrayList.get(iD);
            if (il != null) {
                return (uw) map.get(il);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new tw(this, 0, this.e);
    }
}
