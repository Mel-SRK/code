package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r3 implements iv {
    public final /* synthetic */ s3 d;

    @Override // defpackage.iv
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        s3 s3Var = this.d;
        nz0 nz0VarB = ((rt) s3Var.e).b((fu0) obj, (iu) obj2, ((gu) obj3).a, ((hu) obj4).a);
        if (nz0VarB instanceof nz0) {
            Object obj5 = nz0VarB.d;
            obj5.getClass();
            return (Typeface) obj5;
        }
        o6 o6Var = new o6(nz0VarB, s3Var.j);
        s3Var.j = o6Var;
        Object obj6 = o6Var.c;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
