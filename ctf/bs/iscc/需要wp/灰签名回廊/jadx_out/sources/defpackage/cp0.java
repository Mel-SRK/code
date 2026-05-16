package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cp0 {
    public final String a;
    public final gv b;
    public final boolean c;

    public cp0(String str, gv gvVar) {
        this.a = str;
        this.b = gvVar;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ cp0(String str) {
        this(str, dp0.g);
    }

    public cp0(String str, int i) {
        this(str);
        this.c = true;
    }

    public cp0(String str, boolean z, gv gvVar) {
        this(str, gvVar);
        this.c = z;
    }
}
