package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class mm {
    public final Executor a;
    public final qh0 b;
    public final byte[] c;
    public final File d;
    public final String e;
    public boolean f = false;
    public nm[] g;
    public byte[] h;

    public mm(AssetManager assetManager, Executor executor, qh0 qh0Var, String str, File file) {
        byte[] bArr;
        this.a = executor;
        this.b = qh0Var;
        this.e = str;
        this.d = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = e00.s;
                    break;
                case 26:
                    bArr = e00.r;
                    break;
                case 27:
                    bArr = e00.q;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = e00.p;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = e00.o;
        }
        this.c = bArr;
    }

    public final FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null) {
                return null;
            }
            message.contains("compressed");
            return null;
        }
    }

    public final void b(final int i, final Serializable serializable) {
        this.a.execute(new Runnable() { // from class: lm
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b.d(i, serializable);
            }
        });
    }
}
