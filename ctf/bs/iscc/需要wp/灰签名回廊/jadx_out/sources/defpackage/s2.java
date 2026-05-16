package defpackage;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import defpackage.i70;

/* JADX INFO: loaded from: classes.dex */
public final class s2 implements View.OnDragListener, qn {
    public final sn a;
    public final g7 b;
    public final AndroidDragAndDropManager$modifier$1 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public s2() {
        sn snVar = new sn();
        snVar.t = 0L;
        this.a = snVar;
        this.b = new g7();
        this.c = new n70() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
            public final boolean equals(Object obj) {
                return obj == this;
            }

            @Override // defpackage.n70
            public final i70 f() {
                return this.a.a;
            }

            @Override // defpackage.n70
            public final /* bridge */ /* synthetic */ void g(i70 i70Var) {
            }

            public final int hashCode() {
                return this.a.a.hashCode();
            }
        };
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        bu buVar = new bu(6, dragEvent);
        int action = dragEvent.getAction();
        ry0 ry0Var = ry0.d;
        g7 g7Var = this.b;
        sn snVar = this.a;
        switch (action) {
            case 1:
                ti0 ti0Var = new ti0();
                rn rnVar = new rn(buVar, snVar, ti0Var);
                if (rnVar.g(snVar) == ry0Var) {
                    lI.n(snVar, rnVar);
                }
                boolean z = ti0Var.d;
                g7Var.getClass();
                b7 b7Var = new b7(g7Var);
                while (b7Var.hasNext()) {
                    ((sn) b7Var.next()).bz();
                }
                break;
            case 2:
                snVar.bx(buVar);
                break;
            case 4:
                l1 l1Var = new l1(11, buVar);
                if (l1Var.g(snVar) == ry0Var) {
                    lI.n(snVar, l1Var);
                }
                g7Var.clear();
                break;
            case 5:
                snVar.bv();
                break;
            case 6:
                snVar.bw();
                break;
        }
        return false;
    }
}
