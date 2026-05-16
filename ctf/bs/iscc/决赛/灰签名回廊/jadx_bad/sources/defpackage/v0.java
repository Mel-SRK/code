package defpackage;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public final class v0 extends x10 implements cv {
    public final /* synthetic */ int e;
    public final /* synthetic */ b1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(b1 b1Var, int i) {
        super(1);
        this.e = i;
        this.f = b1Var;
    }

    @Override // defpackage.cv
    public final Object g(Object obj) {
        ls lsVar;
        switch (this.e) {
            case 0:
                KeyEvent keyEvent = ((l10) obj).a;
                long jAa = m10.aa(keyEvent);
                if (k10.a(jAa, k10.c)) {
                    lsVar = new ls(2);
                } else if (k10.a(jAa, k10.d)) {
                    lsVar = new ls(1);
                } else if (k10.a(jAa, k10.j)) {
                    lsVar = new ls(keyEvent.isShiftPressed() ? 2 : 1);
                } else {
                    lsVar = k10.a(jAa, k10.h) ? new ls(4) : k10.a(jAa, k10.g) ? new ls(3) : (k10.a(jAa, k10.e) || k10.a(jAa, k10.m)) ? new ls(5) : (k10.a(jAa, k10.f) || k10.a(jAa, k10.n)) ? new ls(6) : (k10.a(jAa, k10.i) || k10.a(jAa, k10.k) || k10.a(jAa, k10.o)) ? new ls(7) : (k10.a(jAa, k10.b) || k10.a(jAa, k10.l)) ? new ls(8) : null;
                }
                if (lsVar != null) {
                    int i = lsVar.a;
                    if (m10.ad(keyEvent) == 2) {
                        Integer numAj = az0.aj(i);
                        b1 b1Var = this.f;
                        ri0 embeddedViewFocusRect = b1Var.getEmbeddedViewFocusRect();
                        Boolean boolE = ((us) b1Var.getFocusOwner()).e(i, embeddedViewFocusRect, new u0(lsVar, 1));
                        if (boolE != null ? boolE.booleanValue() : true) {
                            return Boolean.TRUE;
                        }
                        if (!(i == 1 || i == 2)) {
                            return Boolean.FALSE;
                        }
                        if (numAj != null) {
                            int iIntValue = numAj.intValue();
                            Object obj2 = os.f.get();
                            obj2.getClass();
                            os osVar = (os) obj2;
                            View viewB = b1Var;
                            while (true) {
                                if (viewB != null) {
                                    View rootView = b1Var.getRootView();
                                    rootView.getClass();
                                    viewB = osVar.b((ViewGroup) rootView, viewB, iIntValue);
                                    if (viewB != null) {
                                        if (!viewB.equals(b1Var)) {
                                            for (ViewParent parent = viewB.getParent(); parent != null; parent = parent.getParent()) {
                                                if (parent == b1Var) {
                                                }
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    viewB = null;
                                }
                            }
                            if (f00.h(viewB, b1Var)) {
                                viewB = null;
                            }
                            if (viewB != null) {
                                Rect rectBe = embeddedViewFocusRect != null ? pk.be(embeddedViewFocusRect) : null;
                                if (rectBe == null) {
                                    wc.q("Invalid rect");
                                    return null;
                                }
                                View rootView2 = b1Var.getRootView();
                                rootView2.getClass();
                                ViewGroup viewGroup = (ViewGroup) rootView2;
                                viewGroup.offsetDescendantRectToMyCoords(b1Var, rectBe);
                                viewGroup.offsetRectIntoDescendantCoords(viewB, rectBe);
                                if (az0.ab(viewB, numAj, rectBe)) {
                                    return Boolean.TRUE;
                                }
                            }
                        }
                        if (!((us) b1Var.getFocusOwner()).b(i, false, false)) {
                            return Boolean.TRUE;
                        }
                        Boolean boolE2 = ((us) b1Var.getFocusOwner()).e(i, null, new u0(lsVar, 0));
                        return Boolean.valueOf(boolE2 != null ? boolE2.booleanValue() : true);
                    }
                }
                return Boolean.FALSE;
            case 1:
                pu puVar = (pu) obj;
                b1 b1Var2 = this.f;
                Handler handler = b1Var2.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    puVar.a();
                } else {
                    Handler handler2 = b1Var2.getHandler();
                    if (handler2 != null) {
                        handler2.post(new bs(puVar, 1));
                    }
                }
                return wz0.a;
            default:
                b1 b1Var3 = this.f;
                return new w3(b1Var3, b1Var3.getTextInputService(), (xj) obj);
        }
    }
}
