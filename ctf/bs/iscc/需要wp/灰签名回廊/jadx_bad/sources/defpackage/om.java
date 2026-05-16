package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class om extends RuntimeException {
    public final List d;

    public om(List list) {
        this.d = list;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        n40 n40Var = new n40(10);
        List list = this.d;
        list.getClass();
        wj0 wj0Var = new wj0(list);
        if (wj0Var.a() > 0) {
            ((hf) wj0Var.get(0)).getClass();
            throw null;
        }
        n40Var.f();
        n40Var.f = true;
        if (n40Var.e <= 0) {
            n40Var = n40.g;
        }
        n40Var.getClass();
        wj0 wj0Var2 = new wj0(n40Var);
        int iA = wj0Var2.a();
        for (int i = 0; i < iA; i++) {
            sb.append("\tat " + ((String) wj0Var2.get(i)));
            sb.append('\n');
        }
        return sb.toString();
    }
}
