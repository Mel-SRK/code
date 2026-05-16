package defpackage;

import android.os.Build;
import android.os.Debug;
import com.example.gnd.MainActivity;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int d = 0;

    public /* synthetic */ n0() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        BufferedReader bufferedReader;
        String line;
        int i = 0;
        switch (this.d) {
            case 0:
                m80 m80Var = b1.C;
                synchronized (m80Var) {
                    try {
                        int i2 = Build.VERSION.SDK_INT;
                        Object[] objArr = m80Var.a;
                        int i3 = m80Var.b;
                        if (i2 < 30) {
                            while (i < i3) {
                                b1 b1Var = (b1) objArr[i];
                                boolean showLayoutBounds = b1Var.getShowLayoutBounds();
                                Class cls = b1.Oo;
                                b1Var.setShowLayoutBounds(d41.x());
                                if (showLayoutBounds != b1Var.getShowLayoutBounds()) {
                                    b1.m(b1Var.getRoot());
                                }
                                i++;
                            }
                        } else {
                            while (i < i3) {
                                b1.m(((b1) objArr[i]).getRoot());
                                i++;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                boolean z2 = f6.a;
                boolean z3 = 1;
                if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger()) {
                    try {
                        bufferedReader = new BufferedReader(new FileReader(new File("/proc/self/status")));
                    } catch (Exception unused) {
                    }
                    do {
                        try {
                            line = bufferedReader.readLine();
                            if (line == null) {
                                bufferedReader.close();
                            }
                        } finally {
                        }
                    } while (!line.startsWith("TracerPid:"));
                    String str = (String) ft0.s(line, new String[]{":"}).get(1);
                    str.getClass();
                    int length = str.length() - 1;
                    int i4 = 0;
                    boolean z4 = false;
                    while (i4 <= length) {
                        boolean zX = az0.x(str.charAt(!z4 ? i4 : length));
                        if (z4) {
                            if (zX) {
                                length--;
                            } else {
                                if (Integer.parseInt(str.subSequence(i4, length + 1).toString()) == 0) {
                                }
                                bufferedReader.close();
                            }
                        } else if (zX) {
                            i4++;
                        } else {
                            z4 = true;
                        }
                    }
                    if (Integer.parseInt(str.subSequence(i4, length + 1).toString()) == 0) {
                    }
                    bufferedReader.close();
                }
                int[] iArr = f6.d;
                int length2 = iArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 < length2) {
                        int i6 = iArr[i5];
                        try {
                            Socket socket = new Socket();
                            socket.connect(new InetSocketAddress("127.0.0.1", i6), 100);
                            socket.close();
                        } catch (Exception unused2) {
                            i5++;
                        }
                    } else {
                        Iterator it = f00.z("/data/local/tmp/frida-server", "/data/local/tmp/re.frida.server", "/system/lib/frida-agent.so", "/system/lib64/frida-agent.so").iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (new File((String) it.next()).exists()) {
                                }
                            } else if (!f6.a()) {
                                z = false;
                            }
                        }
                    }
                }
                z = true;
                f6.b = z;
                Iterator it2 = f6.e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        try {
                            Class.forName((String) it2.next());
                        } catch (ClassNotFoundException unused3) {
                        }
                    } else {
                        try {
                            throw new Exception("Stack trace check");
                        } catch (Exception e) {
                            StackTraceElement[] stackTrace = e.getStackTrace();
                            stackTrace.getClass();
                            int i7 = 0;
                            while (true) {
                                if (i7 < stackTrace.length) {
                                    int i8 = i7 + 1;
                                    try {
                                        String className = stackTrace[i7].getClassName();
                                        className.getClass();
                                        if (!ft0.k(className, "xposed") && !ft0.k(className, "Xposed") && !ft0.k(className, "de.robv.android.xposed")) {
                                            i7 = i8;
                                        }
                                    } catch (ArrayIndexOutOfBoundsException e2) {
                                        throw new NoSuchElementException(e2.getMessage());
                                    }
                                }
                            }
                            i = 1;
                            z3 = i;
                        }
                    }
                }
                f6.c = z3;
                Iterator it3 = f00.z("/system/bin/su", "/system/xbin/su", "/sbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/system/sd/xbin/su").iterator();
                while (it3.hasNext()) {
                    if (new File((String) it3.next()).exists()) {
                        return;
                    }
                }
                try {
                    Runtime.getRuntime().exec("su");
                    return;
                } catch (Exception unused4) {
                    return;
                }
        }
    }

    public /* synthetic */ n0(MainActivity mainActivity) {
    }
}
