package defpackage;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class r70 {
    public long a;
    public final SparseLongArray b = new SparseLongArray();
    public final SparseBooleanArray c = new SparseBooleanArray();
    public final ArrayList d = new ArrayList();
    public int e = -1;
    public int f = -1;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f1 a(MotionEvent motionEvent, b1 b1Var) {
        long j;
        int i;
        int i2;
        boolean z;
        boolean z2;
        long jValueAt;
        float f;
        long j2;
        long jS;
        long jAd;
        int toolType;
        int i3;
        int historySize;
        int i4;
        long j3;
        long jFloatToRawIntBits;
        int i5;
        b1 b1Var2 = b1Var;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.b;
        SparseBooleanArray sparseBooleanArray = this.c;
        int i6 = 3;
        if (actionMasked != 3) {
            int i7 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.e || source != this.f) {
                        this.e = toolType2;
                        this.f = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    j = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId) < 0) {
                        long j4 = this.a;
                        this.a = j4 + 1;
                        sparseLongArray.put(pointerId, j4);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else if (actionMasked2 != 9) {
                    j = 1;
                } else {
                    int pointerId2 = motionEvent.getPointerId(0);
                    if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                        long j5 = this.a;
                        j = 1;
                        this.a = j5 + 1;
                        sparseLongArray.put(pointerId2, j5);
                    }
                }
                boolean z3 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
                boolean z4 = actionMasked == 8;
                if (z3) {
                    i = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i = 1;
                }
                int actionIndex2 = actionMasked != i ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                ArrayList arrayList = this.d;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i8 = 0;
                while (i8 < pointerCount) {
                    boolean z5 = (z3 || i8 == actionIndex2 || (z4 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i8);
                    int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (iIndexOfKey >= 0) {
                        z2 = z3;
                        z = z4;
                        jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        z = z4;
                        long j6 = this.a;
                        z2 = z3;
                        this.a = j6 + j;
                        sparseLongArray.put(pointerId3, j6);
                        jValueAt = j6;
                    }
                    float pressure = motionEvent.getPressure(i8);
                    char c = ' ';
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i8))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i8))) << 32);
                    long jA = xa0.a(jFloatToRawIntBits2, 0.0f, i6);
                    if (i8 == 0) {
                        f = 0.0f;
                        jS = (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
                        jAd = b1Var2.ad(jS);
                    } else {
                        f = 0.0f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            jS = (((long) Float.floatToRawIntBits(motionEvent.getRawY(i8))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX(i8))) << 32);
                            jAd = b1Var2.ad(jS);
                        } else {
                            j2 = jFloatToRawIntBits2;
                            jS = b1Var2.s(jFloatToRawIntBits2);
                            toolType = motionEvent.getToolType(i8);
                            if (toolType == 0) {
                                i3 = 0;
                            } else if (toolType == 1) {
                                i3 = 1;
                            } else if (toolType == 2) {
                                i3 = i6;
                            } else if (toolType == i6) {
                                i3 = 2;
                            } else if (toolType == i7) {
                                i3 = i7;
                            }
                            ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                            historySize = motionEvent.getHistorySize();
                            i4 = 0;
                            while (i4 < historySize) {
                                float historicalX = motionEvent.getHistoricalX(i8, i4);
                                float historicalY = motionEvent.getHistoricalY(i8, i4);
                                char c2 = c;
                                if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                                    i5 = actionIndex2;
                                } else {
                                    i5 = actionIndex2;
                                    long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(historicalX)) << c2) | (((long) Float.floatToRawIntBits(historicalY)) & 4294967295L);
                                    arrayList2.add(new lx(motionEvent.getHistoricalEventTime(i4), jFloatToRawIntBits3, jFloatToRawIntBits3));
                                }
                                i4++;
                                actionIndex2 = i5;
                                c = c2;
                            }
                            char c3 = c;
                            int i9 = actionIndex2;
                            if (motionEvent.getActionMasked() != 8) {
                                float axisValue = motionEvent.getAxisValue(10);
                                float f2 = (-motionEvent.getAxisValue(9)) + f;
                                j3 = jS;
                                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(axisValue)) << c3) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                            } else {
                                j3 = jS;
                                jFloatToRawIntBits = 0;
                            }
                            arrayList.add(new rg0(jValueAt, motionEvent.getEventTime(), j3, j2, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i8), false), arrayList2, jFloatToRawIntBits, jA));
                            i8++;
                            b1Var2 = b1Var;
                            actionIndex2 = i9;
                            z4 = z;
                            z3 = z2;
                            i6 = 3;
                            i7 = 4;
                        }
                    }
                    j2 = jAd;
                    toolType = motionEvent.getToolType(i8);
                    if (toolType == 0) {
                    }
                    ArrayList arrayList22 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i4 = 0;
                    while (i4 < historySize) {
                    }
                    char c32 = c;
                    int i92 = actionIndex2;
                    if (motionEvent.getActionMasked() != 8) {
                    }
                    arrayList.add(new rg0(jValueAt, motionEvent.getEventTime(), j3, j2, z5, pressure, i3, sparseBooleanArray.get(motionEvent.getPointerId(i8), false), arrayList22, jFloatToRawIntBits, jA));
                    i8++;
                    b1Var2 = b1Var;
                    actionIndex2 = i92;
                    z4 = z;
                    z3 = z2;
                    i6 = 3;
                    i7 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 == 1 || actionMasked3 == 6) {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i2 = 0;
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                } else {
                    i2 = 0;
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int iKeyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i10 = i2;
                        while (true) {
                            if (i10 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(iKeyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i10) == iKeyAt) {
                                break;
                            }
                            i10++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new f1(14, arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
