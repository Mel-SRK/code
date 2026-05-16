package defpackage;

import android.util.LongSparseArray;
import com.example.gnd.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f2(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                e00.s((h2) this.e, (LongSparseArray) this.f);
                break;
            default:
                MainActivity mainActivity = (MainActivity) this.e;
                mainActivity.getLifecycle().a(new de(0, (ib0) this.f, mainActivity));
                break;
        }
    }
}
