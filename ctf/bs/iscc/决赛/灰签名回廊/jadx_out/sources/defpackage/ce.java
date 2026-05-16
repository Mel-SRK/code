package defpackage;

import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ce implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ MainActivity e;

    public /* synthetic */ ce(MainActivity mainActivity, int i) {
        this.d = i;
        this.e = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                oe.d(this.e);
                break;
            default:
                this.e.invalidateMenu();
                break;
        }
    }
}
