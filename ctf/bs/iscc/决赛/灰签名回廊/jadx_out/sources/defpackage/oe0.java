package defpackage;

import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class oe0 {
    public final /* synthetic */ int a = 0;
    public int b;
    public int c;
    public CharSequence d;
    public Object e;

    public oe0(CharSequence charSequence, int i, Locale locale) {
        this.d = charSequence;
        if (charSequence.length() < 0) {
            ty.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            ty.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new lb(charSequence, i));
    }

    public void a(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        ty.a("Invalid offset: " + i + ". Valid range is [" + i2 + " , " + i3 + ']');
    }

    public int b() {
        tv tvVar = (tv) this.e;
        String str = (String) this.d;
        if (tvVar == null) {
            return str.length();
        }
        return (tvVar.b - tvVar.b()) + (str.length() - (this.c - this.b));
    }

    public boolean c(int i) {
        CharSequence charSequence = this.d;
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!yp.d()) {
                    return false;
                }
                yp ypVarA = yp.a();
                if (ypVarA.c() != 1 || ypVarA.b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean d(int i) {
        int i2 = this.b + 1;
        if (i > this.c || i2 > i) {
            return false;
        }
        return bo0.k(Character.codePointBefore(this.d, i));
    }

    public boolean e(int i) {
        a(i);
        if (!((BreakIterator) this.e).isBoundary(i)) {
            return false;
        }
        if (g(i) && g(i - 1) && g(i + 1)) {
            return false;
        }
        return i <= 0 || i >= this.d.length() - 1 || !(f(i) || f(i + 1));
    }

    public boolean f(int i) {
        CharSequence charSequence = this.d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (f00.h(unicodeBlockOf, unicodeBlock) && f00.h(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return f00.h(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && f00.h(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    public boolean g(int i) {
        CharSequence charSequence = this.d;
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!yp.d()) {
                return false;
            }
            yp ypVarA = yp.a();
            if (ypVarA.c() != 1 || ypVarA.b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i) {
        int i2 = this.b;
        if (i >= this.c || i2 > i) {
            return false;
        }
        return bo0.k(Character.codePointAt(this.d, i));
    }

    public int i(int i) {
        a(i);
        int iFollowing = ((BreakIterator) this.e).following(i);
        return (g(iFollowing + (-1)) && g(iFollowing) && !f(iFollowing)) ? i(iFollowing) : iFollowing;
    }

    public int j(int i) {
        a(i);
        int iPreceding = ((BreakIterator) this.e).preceding(i);
        return (g(iPreceding) && c(iPreceding) && !f(iPreceding)) ? j(iPreceding) : iPreceding;
    }

    public void k(int i, int i2, String str) {
        if (i > i2) {
            ty.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            ty.a("start must be non-negative, but was " + i);
        }
        tv tvVar = (tv) this.e;
        if (tvVar == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - iMin;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = iMax - iMin2;
            int i5 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            tv tvVar2 = new tv();
            tvVar2.b = iMax;
            tvVar2.e = cArr;
            tvVar2.c = length;
            tvVar2.d = i4;
            this.e = tvVar2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 < 0 || i8 > tvVar.b - tvVar.b()) {
            this.d = toString();
            this.e = null;
            this.b = -1;
            this.c = -1;
            k(i, i2, str);
            return;
        }
        int length2 = str.length() - (i8 - i7);
        if (length2 > tvVar.b()) {
            int iB = length2 - tvVar.b();
            int i9 = tvVar.b;
            do {
                i9 *= 2;
            } while (i9 - tvVar.b < iB);
            char[] cArr2 = new char[i9];
            h7.ar((char[]) tvVar.e, cArr2, 0, 0, tvVar.c);
            int i10 = tvVar.b;
            int i11 = tvVar.d;
            int i12 = i10 - i11;
            int i13 = i9 - i12;
            h7.ar((char[]) tvVar.e, cArr2, i13, i11, i12 + i11);
            tvVar.e = cArr2;
            tvVar.b = i9;
            tvVar.d = i13;
        }
        int i14 = tvVar.c;
        if (i7 < i14 && i8 <= i14) {
            int i15 = i14 - i8;
            char[] cArr3 = (char[]) tvVar.e;
            h7.ar(cArr3, cArr3, tvVar.d - i15, i8, i14);
            tvVar.c = i7;
            tvVar.d -= i15;
        } else if (i7 >= i14 || i8 < i14) {
            int iB2 = tvVar.b() + i7;
            int iB3 = tvVar.b() + i8;
            int i16 = tvVar.d;
            char[] cArr4 = (char[]) tvVar.e;
            h7.ar(cArr4, cArr4, tvVar.c, i16, iB2);
            tvVar.c += iB2 - i16;
            tvVar.d = iB3;
        } else {
            tvVar.d = tvVar.b() + i8;
            tvVar.c = i7;
        }
        str.getChars(0, str.length(), (char[]) tvVar.e, tvVar.c);
        tvVar.c = str.length() + tvVar.c;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                tv tvVar = (tv) this.e;
                String str = (String) this.d;
                if (tvVar == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.b);
                sb.append((char[]) tvVar.e, 0, tvVar.c);
                char[] cArr = (char[]) tvVar.e;
                int i = tvVar.d;
                sb.append(cArr, i, tvVar.b - i);
                String str2 = (String) this.d;
                sb.append((CharSequence) str2, this.c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ oe0() {
    }
}
