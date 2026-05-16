package defpackage;

import java.text.BreakIterator;

/* JADX INFO: loaded from: classes.dex */
public final class hw extends i60 {
    public final BreakIterator q;

    public hw(CharSequence charSequence) {
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(charSequence.toString());
        this.q = characterInstance;
    }

    @Override // defpackage.i60
    public final int aq(int i) {
        return this.q.following(i);
    }

    @Override // defpackage.i60
    public final int au(int i) {
        return this.q.preceding(i);
    }
}
