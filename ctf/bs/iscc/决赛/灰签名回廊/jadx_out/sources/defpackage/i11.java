package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface i11 {
    default float a() {
        return Float.MAX_VALUE;
    }

    long b();

    long c();

    float d();

    default float e() {
        return 2.0f;
    }

    default float f() {
        return 16.0f;
    }

    default long g() {
        float f = 48;
        return i60.d(f, f);
    }
}
