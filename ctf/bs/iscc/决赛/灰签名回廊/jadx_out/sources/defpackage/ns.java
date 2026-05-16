package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class ns implements Comparator {
    public final q80 a;
    public final r80 b;
    public final q80 c;
    public final l80 d;

    public ns(wc wcVar) {
        long[] jArr = mm0.a;
        this.a = new q80();
        int i = nm0.a;
        this.b = new r80();
        this.c = new q80();
        l80 l80Var = sa0.a;
        this.d = new l80();
    }

    public final void a(ArrayList arrayList, ViewGroup viewGroup) {
        l80 l80Var;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            l80Var = this.d;
            if (i >= size) {
                break;
            }
            l80Var.h(i, (View) arrayList.get(i));
            i++;
        }
        int size2 = arrayList.size() - 1;
        r80 r80Var = this.b;
        q80 q80Var = this.a;
        if (size2 >= 0) {
            while (true) {
                int i2 = size2 - 1;
                View view = (View) arrayList.get(size2);
                int nextFocusForwardId = view.getNextFocusForwardId();
                View viewH = (nextFocusForwardId == 0 || nextFocusForwardId == -1) ? null : m10.h(view, viewGroup, 2);
                if (viewH != null && l80Var.d(viewH) >= 0) {
                    q80Var.l(view, viewH);
                    r80Var.a(viewH);
                }
                if (i2 < 0) {
                    break;
                } else {
                    size2 = i2;
                }
            }
        }
        int size3 = arrayList.size() - 1;
        if (size3 < 0) {
            return;
        }
        while (true) {
            int i3 = size3 - 1;
            View view2 = (View) arrayList.get(size3);
            if (((View) q80Var.g(view2)) != null && !r80Var.c(view2)) {
                View view3 = view2;
                while (view2 != null) {
                    q80 q80Var2 = this.c;
                    View view4 = (View) q80Var2.g(view2);
                    if (view4 != null) {
                        if (view4 == view3) {
                            break;
                        }
                        view2 = view3;
                        view3 = view4;
                    }
                    q80Var2.l(view2, view3);
                    view2 = (View) q80Var.g(view2);
                }
            }
            if (i3 < 0) {
                return;
            } else {
                size3 = i3;
            }
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        q80 q80Var = this.c;
        View view3 = (View) q80Var.g(view);
        View view4 = (View) q80Var.g(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.a.g(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        l80 l80Var = this.d;
        return l80Var.e(view) < l80Var.e(view2) ? -1 : 1;
    }
}
