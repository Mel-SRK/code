package defpackage;

import android.os.Build;
import android.view.MotionEvent;
import com.example.gnd.MainActivity;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ig0 {
    public final Object a;
    public final int b;
    public int c;

    /* JADX WARN: Removed duplicated region for block: B:35:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ig0(List list, f1 f1Var) {
        this.a = list;
        if (Build.VERSION.SDK_INT >= 29) {
            MotionEvent motionEvent = f1Var != null ? (MotionEvent) ((f1) f1Var.f).f : null;
            if (motionEvent != null) {
                motionEvent.getClassification();
            }
        }
        MotionEvent motionEvent2 = f1Var != null ? (MotionEvent) ((f1) f1Var.f).f : null;
        int i = 0;
        this.b = motionEvent2 != null ? motionEvent2.getButtonState() : 0;
        MotionEvent motionEvent3 = f1Var != null ? (MotionEvent) ((f1) f1Var.f).f : null;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        MotionEvent motionEvent4 = f1Var != null ? (MotionEvent) ((f1) f1Var.f).f : null;
        if (motionEvent4 != null) {
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked == 0) {
                i = 1;
            } else if (actionMasked == 1) {
                i = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 7:
                        i = 3;
                        break;
                    case MainActivity.$stable /* 8 */:
                        i = 6;
                        break;
                    case 9:
                        i = 4;
                        break;
                    case 10:
                        i = 5;
                        break;
                }
            }
        } else {
            int size = list.size();
            while (i < size) {
                pg0 pg0Var = (pg0) list.get(i);
                if (d41.m(pg0Var)) {
                    i = 2;
                } else if (d41.k(pg0Var)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.c = i;
    }
}
