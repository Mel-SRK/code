package defpackage;

import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class qa0 extends pa0 {
    @Override // defpackage.pa0, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.commitContent(inputContentInfo, i, bundle);
        }
        return false;
    }
}
