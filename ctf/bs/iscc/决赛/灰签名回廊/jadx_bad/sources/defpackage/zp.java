package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;

/* JADX INFO: loaded from: classes.dex */
public final class zp implements gl {
    public final /* synthetic */ p30 d;

    public zp(EmojiCompatInitializer emojiCompatInitializer, p30 p30Var) {
        this.d = p30Var;
    }

    @Override // defpackage.gl
    public final void c(u30 u30Var) {
        (Build.VERSION.SDK_INT >= 28 ? tg.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new eq(), 500L);
        this.d.b(this);
    }
}
