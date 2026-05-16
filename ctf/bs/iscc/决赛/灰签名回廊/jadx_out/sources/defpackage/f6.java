package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class f6 {
    public static boolean a;
    public static boolean b;
    public static boolean c;
    public static final int[] d;
    public static final List e;

    static {
        f00.z("frida", "frida-server", "frida-agent", "gdb", "android_server", "ida");
        d = new int[]{27042, 27043};
        e = f00.z("de.robv.android.xposed.XposedBridge", "de.robv.android.xposed.XposedHelpers");
    }

    public static boolean a() {
        String lowerCase;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("/proc/self/maps")));
            do {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        bufferedReader.close();
                        return false;
                    }
                    lowerCase = line.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (ft0.k(lowerCase, "frida") || ft0.k(lowerCase, "gadget")) {
                        break;
                    }
                } finally {
                }
            } while (!ft0.k(lowerCase, "agent"));
            bufferedReader.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
