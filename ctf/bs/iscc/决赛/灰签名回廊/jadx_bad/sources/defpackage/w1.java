package defpackage;

import com.example.gnd.R;

/* JADX INFO: loaded from: classes.dex */
public final class w1 implements cn {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cn
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fn) obj).b.a();
                break;
            case 1:
                zg0 zg0Var = (zg0) obj;
                a41 a41Var = zg0Var.f;
                if (a41Var != null) {
                    a41Var.e();
                }
                zg0Var.f = null;
                zg0Var.requestLayout();
                zg0Var.setTag(R.id.view_tree_lifecycle_owner, null);
                zg0Var.q.removeViewImmediate(zg0Var);
                break;
            case 2:
                ((cw0) obj).k();
                break;
            default:
                ny0 ny0Var = (ny0) obj;
                ny0Var.e();
                ny0Var.a.getClass();
                break;
        }
    }
}
