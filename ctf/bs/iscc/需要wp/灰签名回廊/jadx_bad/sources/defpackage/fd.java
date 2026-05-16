package defpackage;

import android.graphics.ColorSpace;
import android.os.Build;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.autofill.AutofillId;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public abstract class fd {
    public static final ColorSpace a(dd ddVar) {
        ColorSpace colorSpace;
        if (f00.h(ddVar, gd.e)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (f00.h(ddVar, gd.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (f00.h(ddVar, gd.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (f00.h(ddVar, gd.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (f00.h(ddVar, gd.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (f00.h(ddVar, gd.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (f00.h(ddVar, gd.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (f00.h(ddVar, gd.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (f00.h(ddVar, gd.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (f00.h(ddVar, gd.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (f00.h(ddVar, gd.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (f00.h(ddVar, gd.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (f00.h(ddVar, gd.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (f00.h(ddVar, gd.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (f00.h(ddVar, gd.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (f00.h(ddVar, gd.n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            if (Build.VERSION.SDK_INT >= 34) {
                ColorSpace colorSpace2 = f00.h(ddVar, gd.v) ? ColorSpace.get(ColorSpace.Named.BT2020_HLG) : f00.h(ddVar, gd.w) ? ColorSpace.get(ColorSpace.Named.BT2020_PQ) : null;
                if (colorSpace2 != null) {
                    return colorSpace2;
                }
            }
            if (ddVar instanceof bk0) {
                String str = ddVar.a;
                bk0 bk0Var = (bk0) ddVar;
                float[] fArrA = bk0Var.d.a();
                hy0 hy0Var = bk0Var.g;
                ColorSpace.Rgb.TransferParameters transferParameters = hy0Var != null ? new ColorSpace.Rgb.TransferParameters(hy0Var.b, hy0Var.c, hy0Var.d, hy0Var.e, hy0Var.f, hy0Var.g, hy0Var.a) : null;
                if (transferParameters != null) {
                    return new ColorSpace.Rgb(str, bk0Var.h, fArrA, transferParameters);
                }
                float[] fArr = bk0Var.h;
                final ak0 ak0Var = bk0Var.l;
                final int i = 0;
                DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: ed
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        switch (i) {
                        }
                        return ((Number) ak0Var.g(Double.valueOf(d))).doubleValue();
                    }
                };
                final ak0 ak0Var2 = bk0Var.o;
                final int i2 = 1;
                return new ColorSpace.Rgb(str, fArr, fArrA, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: ed
                    @Override // java.util.function.DoubleUnaryOperator
                    public final double applyAsDouble(double d) {
                        switch (i2) {
                        }
                        return ((Number) ak0Var2.g(Double.valueOf(d))).doubleValue();
                    }
                }, bk0Var.e, bk0Var.f);
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        return colorSpace;
    }

    public static AutofillId b(View view) {
        return view.getAutofillId();
    }

    public static float c(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHorizontalScrollFactor();
    }

    public static float d(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledVerticalScrollFactor();
    }
}
