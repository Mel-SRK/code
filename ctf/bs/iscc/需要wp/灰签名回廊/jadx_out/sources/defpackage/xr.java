package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class xr extends ActionMode.Callback2 {
    public final xu0 a;

    public xr(xu0 xu0Var) {
        this.a = xu0Var;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        xu0 xu0Var = this.a;
        xu0Var.getClass();
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            cj cjVar = xu0Var.c;
            if (cjVar != null) {
                cjVar.a();
            }
        } else if (itemId == 1) {
            cj cjVar2 = xu0Var.d;
            if (cjVar2 != null) {
                cjVar2.a();
            }
        } else if (itemId == 2) {
            cj cjVar3 = xu0Var.e;
            if (cjVar3 != null) {
                cjVar3.a();
            }
        } else if (itemId == 3) {
            cj cjVar4 = xu0Var.f;
            if (cjVar4 != null) {
                cjVar4.a();
            }
        } else if (itemId != 4) {
            return false;
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        xu0 xu0Var = this.a;
        xu0Var.getClass();
        if (menu == null) {
            wc.n("onCreateActionMode requires a non-null menu");
            return false;
        }
        if (actionMode == null) {
            wc.n("onCreateActionMode requires a non-null mode");
            return false;
        }
        if (xu0Var.c != null) {
            xu0.a(menu, x60.f);
        }
        if (xu0Var.d != null) {
            xu0.a(menu, x60.g);
        }
        if (xu0Var.e != null) {
            xu0.a(menu, x60.h);
        }
        if (xu0Var.f == null) {
            return true;
        }
        xu0.a(menu, x60.i);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.a.a();
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        ri0 ri0Var = this.a.b;
        if (rect != null) {
            rect.set((int) ri0Var.a, (int) ri0Var.b, (int) ri0Var.c, (int) ri0Var.d);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        xu0 xu0Var = this.a;
        xu0Var.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        xu0.b(menu, x60.f, xu0Var.c);
        xu0.b(menu, x60.g, xu0Var.d);
        xu0.b(menu, x60.h, xu0Var.e);
        xu0.b(menu, x60.i, xu0Var.f);
        xu0.b(menu, x60.j, null);
        return true;
    }
}
