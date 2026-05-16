package defpackage;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class p10 extends i70 implements o10 {
    public cv r;
    public cv s;

    @Override // defpackage.o10
    public final boolean al(KeyEvent keyEvent) {
        cv cvVar = this.r;
        if (cvVar != null) {
            return ((Boolean) cvVar.g(new l10(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.o10
    public final boolean j(KeyEvent keyEvent) {
        cv cvVar = this.s;
        if (cvVar != null) {
            return ((Boolean) cvVar.g(new l10(keyEvent))).booleanValue();
        }
        return false;
    }
}
