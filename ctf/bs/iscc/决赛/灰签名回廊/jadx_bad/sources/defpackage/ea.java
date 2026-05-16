package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class ea implements c10, Serializable {
    public transient c10 d;
    public final Object e;
    public final Class f;
    public final String g;
    public final String h;
    public final boolean i;

    public ea(Object obj, Class cls, String str, String str2, boolean z) {
        this.e = obj;
        this.f = cls;
        this.g = str;
        this.h = str2;
        this.i = z;
    }

    public abstract c10 d();

    public final rb e() {
        boolean z = this.i;
        Class cls = this.f;
        if (!z) {
            return yi0.a(cls);
        }
        yi0.a.getClass();
        return new ud0(cls);
    }
}
