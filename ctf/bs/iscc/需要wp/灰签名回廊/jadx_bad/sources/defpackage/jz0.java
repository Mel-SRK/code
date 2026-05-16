package defpackage;

import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jz0 extends iz0 {
    @Override // defpackage.iz0
    public final Font m(ku kuVar) {
        Font fontA;
        Uri uri = kuVar.a;
        boolean zEquals = Objects.equals(uri.getScheme(), "systemfont");
        String str = kuVar.e;
        String authority = zEquals ? uri.getAuthority() : null;
        if (authority != null) {
            Typeface typefaceCreate = Typeface.create(authority, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                typefaceCreate = null;
            }
            if (typefaceCreate != null && (fontA = dz0.a(typefaceCreate)) != null) {
                if (TextUtils.isEmpty(str)) {
                    return fontA;
                }
                try {
                    return new Font.Builder(fontA).setFontVariationSettings(str).build();
                } catch (IOException unused) {
                    Log.e("TypefaceCompatApi31Impl", "Failed to clone Font instance. Fall back to provider font.");
                    return null;
                }
            }
        }
        return null;
    }
}
