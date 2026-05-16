package defpackage;

import android.view.inputmethod.EditorInfo;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class qp {
    public static final qp a = new qp();

    public final void a(EditorInfo editorInfo) {
        editorInfo.setSupportedHandwritingGestures(f00.z(d3.l(), d3.z(), d3.v(), d3.x(), d3.ab(), d3.ac(), d3.ad()));
        Class[] clsArr = {d3.l(), d3.z(), d3.v(), d3.x()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(f00.aa(4));
        for (int i = 0; i < 4; i++) {
            linkedHashSet.add(clsArr[i]);
        }
        editorInfo.setSupportedHandwritingGesturePreviews(linkedHashSet);
    }
}
