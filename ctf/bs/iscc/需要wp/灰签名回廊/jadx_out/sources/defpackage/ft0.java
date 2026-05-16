package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class ft0 extends et0 {
    public static boolean j(CharSequence charSequence, char c) {
        charSequence.getClass();
        return m(charSequence, c, 0, 2) >= 0;
    }

    public static boolean k(String str, String str2) {
        return n(str, str2, 0, 2) >= 0;
    }

    public static final int l(CharSequence charSequence, String str, int i, boolean z) {
        String str2;
        boolean z2;
        boolean zRegionMatches;
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        sz szVar = new sz(i, length, 1);
        boolean z3 = charSequence instanceof String;
        int i2 = szVar.e;
        if (!z3) {
            if (i > i2) {
                return -1;
            }
            while (!q(str, charSequence, i, str.length(), z)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i;
        }
        if (i > i2) {
            return -1;
        }
        int i3 = i;
        while (true) {
            String str3 = (String) charSequence;
            int length3 = str.length();
            if (z) {
                str2 = str;
                z2 = z;
                zRegionMatches = str2.regionMatches(z2, 0, str3, i3, length3);
            } else {
                zRegionMatches = str.regionMatches(0, str3, i3, length3);
                str2 = str;
                z2 = z;
            }
            if (zRegionMatches) {
                return i3;
            }
            if (i3 == i2) {
                return -1;
            }
            i3++;
            str = str2;
            z = z2;
        }
    }

    public static int m(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(c, i);
        }
        char[] cArr = {c};
        if (charSequence instanceof String) {
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (cArr[0] != charSequence.charAt(i)) {
            if (i == length) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public static /* synthetic */ int n(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return l(charSequence, str, i, false);
    }

    public static boolean o(String str) {
        str.getClass();
        for (int i = 0; i < str.length(); i++) {
            if (!az0.x(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static final List p(String str) {
        h40 h40Var = new h40(str);
        if (!h40Var.hasNext()) {
            return rq.d;
        }
        Object next = h40Var.next();
        if (!h40Var.hasNext()) {
            return f00.y(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (h40Var.hasNext()) {
            arrayList.add(h40Var.next());
        }
        return arrayList;
    }

    public static final boolean q(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z) {
        char upperCase;
        char upperCase2;
        charSequence.getClass();
        charSequence2.getClass();
        if (i >= 0 && charSequence.length() - i2 >= 0 && i <= charSequence2.length() - i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                char cCharAt = charSequence.charAt(i3);
                char cCharAt2 = charSequence2.charAt(i + i3);
                if (cCharAt == cCharAt2 || (z && ((upperCase = Character.toUpperCase(cCharAt)) == (upperCase2 = Character.toUpperCase(cCharAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                }
            }
            return true;
        }
        return false;
    }

    public static String r() {
        char cCharAt = "H".charAt(0);
        char[] cArr = new char[10];
        for (int i = 0; i < 10; i++) {
            cArr[i] = cCharAt;
        }
        return new String(cArr);
    }

    public static List s(CharSequence charSequence, String[] strArr) {
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                int iL = l(charSequence, str, 0, false);
                if (iL == -1) {
                    return f00.y(charSequence.toString());
                }
                ArrayList arrayList = new ArrayList(10);
                int length = 0;
                do {
                    arrayList.add(charSequence.subSequence(length, iL).toString());
                    length = str.length() + iL;
                    iL = l(charSequence, str, length, false);
                } while (iL != -1);
                arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
                return arrayList;
            }
        }
        List listAsList = Arrays.asList(strArr);
        listAsList.getClass();
        sp0 sp0Var = new sp0(new cm(charSequence, new n3(6, listAsList), 0));
        ArrayList arrayList2 = new ArrayList(lc.an(sp0Var));
        Iterator it = sp0Var.iterator();
        while (true) {
            zl zlVar = (zl) it;
            if (!zlVar.hasNext()) {
                return arrayList2;
            }
            sz szVar = (sz) zlVar.next();
            szVar.getClass();
            arrayList2.add(charSequence.subSequence(szVar.d, szVar.e + 1).toString());
        }
    }

    public static String t(String str, String str2) {
        int iN = n(str, str2, 0, 6);
        return iN == -1 ? str : str.substring(str2.length() + iN, str.length());
    }
}
