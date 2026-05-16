package com.example.gnd.security;

import android.content.Context;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import defpackage.f00;
import defpackage.f6;
import defpackage.ft0;
import defpackage.kc;
import defpackage.mb;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class SecureValidator {
    public static volatile long c;
    public final Context a;
    public final int[] b;

    static {
        System.loadLibrary("native-verify");
        c = 1597463007L;
    }

    public SecureValidator(Context context) {
        context.getClass();
        this.a = context;
        this.b = new int[]{88, 66, 82, 82, 106};
    }

    public static byte[] a(byte[] bArr) {
        byte[] bArr2 = {83, 66, 49, 81, 84, 73, 105};
        ArrayList arrayList = new ArrayList(7);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i2 < 7) {
            arrayList.add(Byte.valueOf((byte) (bArr[i3 % 4] ^ bArr2[i2])));
            i2++;
            i3++;
        }
        byte[] bArr3 = new byte[arrayList.size()];
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            bArr3[i] = ((Number) obj).byteValue();
            i++;
        }
        return bArr3;
    }

    public static boolean b(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = str.getBytes(mb.a);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArrDigest) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) "");
            }
            sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        sb.append((CharSequence) "");
        return sb.toString().equals("e0264b0931510ace2cfa21f781112143b3e58376e1b35b94b52ada765c6b23fb");
    }

    private final native long nativeComputeChainToken(int i, long j, byte[] bArr);

    private final native int nativeGetMagicNumber();

    private final native byte[] nativeVerifyPart1(byte[] bArr, byte[] bArr2);

    private final native boolean nativeVerifyPart2(byte[] bArr, byte[] bArr2);

    private final native boolean nativeVerifyPart3(byte[] bArr, byte[] bArr2);

    private final native boolean nativeVerifyPart4(byte[] bArr, byte[] bArr2, long j);

    public final boolean c(String str) {
        byte[] bArrDigest;
        String string;
        BufferedReader bufferedReader;
        String lowerCase;
        str.getClass();
        c = 1597463007L;
        int[] iArr = this.b;
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Character.valueOf((char) (i ^ 17)));
        }
        String strAv = kc.av(arrayList, "", null, null, null, 62);
        if (str.length() > 6 && str.startsWith(strAv) && str.endsWith("}")) {
            String strSubstring = str.substring(5, str.length() - 1);
            if (!f6.b && !f6.c && !f6.a()) {
                try {
                    bufferedReader = new BufferedReader(new FileReader(new File("/proc/self/maps")));
                } catch (Exception unused) {
                }
                do {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            if (!b(str)) {
                                Context context = this.a;
                                try {
                                    Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                                    Signature signature = (signatureArr == null || signatureArr.length == 0) ? null : signatureArr[0];
                                    bArrDigest = signature != null ? MessageDigest.getInstance("SHA-256").digest(signature.toByteArray()) : new byte[32];
                                    bArrDigest.getClass();
                                } catch (Exception unused2) {
                                    bArrDigest = new byte[32];
                                }
                                try {
                                    Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.example.gnd.secret.provider/keys/fragment"), null, null, null, null);
                                    if (cursorQuery != null) {
                                        try {
                                            string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("data")) : null;
                                            cursorQuery.close();
                                        } finally {
                                        }
                                    } else {
                                        string = null;
                                    }
                                } catch (Exception unused3) {
                                    string = context.getSharedPreferences("key_cache", 0).getString("fragment2", null);
                                }
                                String string2 = context.getSharedPreferences("key_cache", 0).getString("fragment3", null);
                                String string3 = context.getSharedPreferences("key_cache", 0).getString("fragment4", null);
                                if (bArrDigest.length != 0 && string != null && string.length() != 0 && string2 != null && string2.length() != 0 && string3 != null && string3.length() != 0) {
                                    try {
                                        if (strSubstring.length() != nativeGetMagicNumber() * 2) {
                                            return false;
                                        }
                                        String strSubstring2 = strSubstring.substring(0, 7);
                                        String strSubstring3 = strSubstring.substring(7, 12);
                                        String strSubstring4 = strSubstring.substring(12, 17);
                                        String strSubstring5 = strSubstring.substring(17);
                                        Charset charset = mb.a;
                                        byte[] bytes = strSubstring2.getBytes(charset);
                                        bytes.getClass();
                                        byte[] bArrNativeVerifyPart1 = nativeVerifyPart1(bytes, bArrDigest);
                                        if (!Arrays.equals(bArrNativeVerifyPart1, a(bArrDigest))) {
                                            return false;
                                        }
                                        c = nativeComputeChainToken(1, c, bArrNativeVerifyPart1);
                                        byte[] bArrR = f00.r(string);
                                        byte[] bytes2 = strSubstring3.getBytes(charset);
                                        bytes2.getClass();
                                        if (!nativeVerifyPart2(bytes2, bArrR)) {
                                            return false;
                                        }
                                        c = nativeComputeChainToken(2, c, bArrR);
                                        byte[] bArrR2 = f00.r(string2);
                                        byte[] bytes3 = strSubstring4.getBytes(charset);
                                        bytes3.getClass();
                                        if (!nativeVerifyPart3(bytes3, bArrR2)) {
                                            return false;
                                        }
                                        c = nativeComputeChainToken(3, c, bArrR2);
                                        byte[] bArrR3 = f00.r(string3);
                                        byte[] bytes4 = strSubstring5.getBytes(charset);
                                        bytes4.getClass();
                                        if (nativeVerifyPart4(bytes4, bArrR3, c)) {
                                            return b(str);
                                        }
                                        return false;
                                    } catch (Exception unused4) {
                                        return false;
                                    }
                                }
                            }
                            return true;
                        }
                        lowerCase = line.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (ft0.k(lowerCase, "substrate") || ft0.k(lowerCase, "xhook") || ft0.k(lowerCase, "sandhook") || ft0.k(lowerCase, "edxposed")) {
                            break;
                        }
                    } finally {
                    }
                } while (!ft0.k(lowerCase, "lsposed"));
                bufferedReader.close();
            }
            if (str.equals("ISCC{F4k3_Fl4g_N0t_R34l}") || b(str)) {
                return true;
            }
        }
        return false;
    }
}
