package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.example.gnd.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class jk0 extends ViewGroup {
    public final int d;
    public final ArrayList e;
    public final ArrayList f;
    public final f1 g;
    public int h;

    public jk0(Context context) {
        super(context);
        this.d = 5;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        this.g = new f1(16);
        setClipChildren(false);
        lk0 lk0Var = new lk0(context);
        addView(lk0Var);
        arrayList.add(lk0Var);
        arrayList2.add(lk0Var);
        this.h = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final lk0 a(kk0 kk0Var) {
        f1 f1Var = this.g;
        LinkedHashMap linkedHashMap = (LinkedHashMap) f1Var.e;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) f1Var.e;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) f1Var.f;
        lk0 lk0Var = (lk0) linkedHashMap.get(kk0Var);
        if (lk0Var != null) {
            return lk0Var;
        }
        ArrayList arrayList = this.f;
        arrayList.getClass();
        lk0 lk0Var2 = (lk0) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (lk0Var2 == null) {
            int i = this.h;
            ArrayList arrayList2 = this.e;
            if (i > f00.v(arrayList2)) {
                lk0Var2 = new lk0(getContext());
                addView(lk0Var2);
                arrayList2.add(lk0Var2);
            } else {
                lk0Var2 = (lk0) arrayList2.get(this.h);
                kk0 kk0Var2 = (kk0) linkedHashMap3.get(lk0Var2);
                if (kk0Var2 != null) {
                    kk0Var2.ay();
                    lk0 lk0Var3 = (lk0) linkedHashMap2.get(kk0Var2);
                    if (lk0Var3 != null) {
                    }
                    linkedHashMap2.remove(kk0Var2);
                    lk0Var2.c();
                }
            }
            int i2 = this.h;
            if (i2 < this.d - 1) {
                this.h = i2 + 1;
            } else {
                this.h = 0;
            }
        }
        linkedHashMap2.put(kk0Var, lk0Var2);
        linkedHashMap3.put(lk0Var2, kk0Var);
        return lk0Var2;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
