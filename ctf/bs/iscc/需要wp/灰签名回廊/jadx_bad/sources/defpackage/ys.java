package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ys {
    public static final ys b = new ys();
    public static final ys c = new ys();
    public static final ys d = new ys();
    public final a90 a = new a90(new zs[16]);

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0046, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(cv cvVar) {
        if (this == b) {
            wc.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (this == c) {
            wc.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        a90 a90Var = this.a;
        int i = a90Var.f;
        if (i == 0) {
            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        Object[] objArr = a90Var.d;
        boolean z = false;
        for (int i2 = 0; i2 < i; i2++) {
            i70 i70Var = (i70) ((zs) objArr[i2]);
            if (!i70Var.d.q) {
                sy.b("visitChildren called on an unattached node");
            }
            a90 a90Var2 = new a90(new i70[16]);
            i70 i70Var2 = i70Var.d;
            i70 i70Var3 = i70Var2.i;
            if (i70Var3 == null) {
                pk.j(a90Var2, i70Var2);
            } else {
                a90Var2.b(i70Var3);
            }
            while (true) {
                int i3 = a90Var2.f;
                if (i3 != 0) {
                    i70 i70VarM = (i70) a90Var2.j(i3 - 1);
                    if ((i70VarM.g & 1024) == 0) {
                        pk.j(a90Var2, i70VarM);
                    } else {
                        while (true) {
                            if (i70VarM == null) {
                                break;
                            }
                            if ((i70VarM.f & 1024) != 0) {
                                a90 a90Var3 = null;
                                while (i70VarM != null) {
                                    if (i70VarM instanceof gt) {
                                        gt gtVar = (gt) i70VarM;
                                        if (gtVar.bv().a ? ((Boolean) cvVar.g(gtVar)).booleanValue() : q6.f(gtVar, 7, cvVar)) {
                                            z = true;
                                            break;
                                        }
                                    } else if (((i70VarM.f & 1024) != 0) && (i70VarM instanceof rl)) {
                                        int i4 = 0;
                                        for (i70 i70Var4 = ((rl) i70VarM).s; i70Var4 != null; i70Var4 = i70Var4.i) {
                                            if ((i70Var4.f & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    i70VarM = i70Var4;
                                                } else {
                                                    if (a90Var3 == null) {
                                                        a90Var3 = new a90(new i70[16]);
                                                    }
                                                    if (i70VarM != null) {
                                                        a90Var3.b(i70VarM);
                                                        i70VarM = null;
                                                    }
                                                    a90Var3.b(i70Var4);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    i70VarM = pk.m(a90Var3);
                                }
                            } else {
                                i70VarM = i70VarM.i;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }
}
