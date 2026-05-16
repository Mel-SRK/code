package defpackage;

import android.view.inputmethod.CursorAnchorInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class hk {
    public static final CursorAnchorInfo.Builder a(CursorAnchorInfo.Builder builder, ri0 ri0Var) {
        return builder.setEditorBoundsInfo(av.h().setEditorBounds(pk.bf(ri0Var)).setHandwritingBounds(pk.bf(ri0Var)).build());
    }
}
