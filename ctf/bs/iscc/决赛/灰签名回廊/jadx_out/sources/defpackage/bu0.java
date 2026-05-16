package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bu0 extends View {
    public final /* synthetic */ ViewGroup d;
    public final /* synthetic */ du0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu0(du0 du0Var, Context context, ViewGroup viewGroup) {
        super(context);
        this.e = du0Var;
        this.d = viewGroup;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        du0 du0Var = this.e;
        ArrayList arrayList = du0Var.b;
        Drawable background = this.d.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        if (du0Var.e != color) {
            du0Var.e = color;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((yh0) arrayList.get(size)).b(color);
            }
        }
    }
}
