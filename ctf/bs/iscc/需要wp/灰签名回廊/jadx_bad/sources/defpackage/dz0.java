package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.text.PositionedGlyphs;
import android.graphics.text.TextRunShaper;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class dz0 {
    public static final wo0 a;
    public static Paint b;

    static {
        jo0.d("TypefaceCompat static init");
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            a = new jz0();
        } else if (i >= 29) {
            a = new iz0();
        } else if (i >= 28) {
            a = new hz0();
        } else if (i >= 26) {
            a = new gz0();
        } else {
            Method method = fz0.c;
            if (method == null) {
                Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
            }
            if (method != null) {
                a = new fz0();
            } else {
                a = new ez0();
            }
        }
        new bu(11);
        b = null;
        Trace.endSection();
    }

    public static Font a(Typeface typeface) {
        if (b == null) {
            b = new Paint();
        }
        b.setTextSize(10.0f);
        b.setTypeface(typeface);
        PositionedGlyphs positionedGlyphsShapeTextRun = TextRunShaper.shapeTextRun((CharSequence) " ", 0, 1, 0, 1, 0.0f, 0.0f, false, b);
        if (positionedGlyphsShapeTextRun.glyphCount() == 0) {
            return null;
        }
        return positionedGlyphsShapeTextRun.getFont(0);
    }
}
