package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface l20 extends ql {
    default int aj(j50 j50Var, k60 k60Var, int i) {
        return e(new l00(j50Var, j50Var.getLayoutDirection()), new el(k60Var, ia0.d, ja0.d, 2), eh.b(0, i, 7)).e();
    }

    q60 e(r60 r60Var, k60 k60Var, long j);

    default int f(j50 j50Var, k60 k60Var, int i) {
        return e(new l00(j50Var, j50Var.getLayoutDirection()), new el(k60Var, ia0.e, ja0.d, 2), eh.b(0, i, 7)).e();
    }

    default int n(j50 j50Var, k60 k60Var, int i) {
        return e(new l00(j50Var, j50Var.getLayoutDirection()), new el(k60Var, ia0.e, ja0.e, 2), eh.b(i, 0, 13)).c();
    }

    default int z(j50 j50Var, k60 k60Var, int i) {
        return e(new l00(j50Var, j50Var.getLayoutDirection()), new el(k60Var, ia0.d, ja0.e, 2), eh.b(i, 0, 13)).c();
    }
}
