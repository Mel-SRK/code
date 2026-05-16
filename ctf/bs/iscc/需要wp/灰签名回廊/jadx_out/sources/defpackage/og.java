package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class og {
    public static final xs0 a = new xs0(u1.p);
    public static final xs0 b = new xs0(u1.q);
    public static final xs0 c = new xs0(u1.s);
    public static final xs0 d = new xs0(u1.r);
    public static final xs0 e = new xs0(u1.u);
    public static final xs0 f = new xs0(u1.t);
    public static final xs0 g = new xs0(u1.aa);
    public static final xs0 h = new xs0(u1.w);
    public static final xs0 i = new xs0(u1.x);
    public static final xs0 j = new xs0(u1.z);
    public static final xs0 k = new xs0(u1.y);
    public static final xs0 l = new xs0(u1.ab);
    public static final xs0 m = new xs0(u1.ac);
    public static final xs0 n = new xs0(u1.ad);
    public static final xs0 o = new xs0(u1.ah);
    public static final xs0 p = new xs0(u1.ag);
    public static final xs0 q = new xs0(u1.ai);
    public static final xs0 r = new xs0(ng.f);
    public static final xs0 s = new xs0(ng.g);
    public static final xs0 t = new xs0(ng.h);
    public static final xs0 u = new xs0(u1.ae);
    public static final qg v = new qg(u1.af);

    static {
        e00.ad(u1.v);
    }

    public static final void a(b1 b1Var, c5 c5Var, gv gvVar, vf vfVar, int i2) {
        vfVar.aw(1925803616);
        int i3 = (vfVar.f(b1Var) ? 4 : 2) | i2 | (vfVar.f(c5Var) ? 32 : 16) | (vfVar.h(gvVar) ? 256 : 128);
        if (vfVar.an(i3 & 1, (i3 & 147) != 146)) {
            ci0 ci0VarA = a.a(b1Var.getAccessibilityManager());
            ci0 ci0VarA2 = b.a(b1Var.getAutofill());
            ci0 ci0VarA3 = d.a(b1Var.getAutofillManager());
            ci0 ci0VarA4 = c.a(b1Var.getAutofillTree());
            ci0 ci0VarA5 = e.a(b1Var.getClipboardManager());
            ci0 ci0VarA6 = f.a(b1Var.getClipboard());
            ci0 ci0VarA7 = h.a(b1Var.getDensity());
            ci0 ci0VarA8 = i.a(b1Var.getFocusOwner());
            ci0 ci0VarA9 = j.a(b1Var.getFontLoader());
            ci0VarA9.f = false;
            ci0 ci0VarA10 = k.a(b1Var.getFontFamilyResolver());
            ci0VarA10.f = false;
            az0.b(new ci0[]{ci0VarA, ci0VarA2, ci0VarA3, ci0VarA4, ci0VarA5, ci0VarA6, ci0VarA7, ci0VarA8, ci0VarA9, ci0VarA10, l.a(b1Var.getHapticFeedBack()), m.a(b1Var.getInputModeManager()), n.a(b1Var.getLayoutDirection()), o.a(b1Var.getTextInputService()), p.a(b1Var.getSoftwareKeyboardController()), q.a(b1Var.getTextToolbar()), r.a(c5Var), s.a(b1Var.getViewConfiguration()), t.a(b1Var.getWindowInfo()), u.a(b1Var.getPointerIconService()), g.a(b1Var.getGraphicsContext())}, gvVar, vfVar, ((i3 >> 3) & 112) | 8);
        } else {
            vfVar.aq();
        }
        hi0 hi0VarS = vfVar.s();
        if (hi0VarS != null) {
            hi0VarS.d = new x1(b1Var, c5Var, gvVar, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
