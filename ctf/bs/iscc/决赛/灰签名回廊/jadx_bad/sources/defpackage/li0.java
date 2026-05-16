package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class li0 extends tt0 implements hv {
    public List h;
    public List i;
    public List j;
    public r80 k;
    public r80 l;
    public r80 m;
    public Set n;
    public r80 o;
    public int p;
    public /* synthetic */ o70 q;
    public final /* synthetic */ mi0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li0(mi0 mi0Var, ji jiVar) {
        super(3, jiVar);
        this.r = mi0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(mi0 mi0Var, List list, List list2, List list3, r80 r80Var, r80 r80Var2, r80 r80Var3, r80 r80Var4) {
        char c;
        long j;
        long j2;
        synchronized (mi0Var.b) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    jg jgVar = (jg) list3.get(i);
                    jgVar.a();
                    mi0Var.ac(jgVar);
                }
                list3.clear();
                Object[] objArr = r80Var.b;
                long[] jArr = r80Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    jg jgVar2 = (jg) objArr[(i2 << 3) + i4];
                                    jgVar2.a();
                                    mi0Var.ac(jgVar2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            } else if (i2 == length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                r80Var.b();
                Object[] objArr2 = r80Var2.b;
                long[] jArr2 = r80Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((jg) objArr2[(i5 << 3) + i7]).g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            } else if (i5 == length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                r80Var2.b();
                r80Var3.b();
                Object[] objArr3 = r80Var4.b;
                long[] jArr3 = r80Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    jg jgVar3 = (jg) objArr3[(i8 << 3) + i10];
                                    jgVar3.a();
                                    mi0Var.ac(jgVar3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            } else if (i8 == length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                }
                r80Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void r(List list, mi0 mi0Var) {
        list.clear();
        synchronized (mi0Var.b) {
            try {
                ArrayList arrayList = mi0Var.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((v70) arrayList.get(i));
                }
                mi0Var.j.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.hv
    public final Object c(Object obj, Object obj2, Object obj3) {
        li0 li0Var = new li0(this.r, (ji) obj3);
        li0Var.q = (o70) obj2;
        li0Var.o(wz0.a);
        return yj.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0122 -> B:44:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01c3 -> B:12:0x0093). Please report as a decompilation issue!!! */
    @Override // defpackage.s7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj) {
        o70 o70Var;
        r80 r80Var;
        r80 r80Var2;
        List list;
        Set set;
        final List list2;
        r80 r80Var3;
        List list3;
        r80 r80Var4;
        final List list4;
        final r80 r80Var5;
        final List list5;
        final r80 r80Var6;
        Object objS;
        la laVar;
        yj yjVar;
        o70 o70Var2;
        m80 m80Var;
        li0 li0Var = this;
        yj yjVar2 = yj.d;
        int i = li0Var.p;
        int i2 = 2;
        int i3 = 1;
        if (i == 0) {
            i60.az(obj);
            o70Var = li0Var.q;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i4 = nm0.a;
            r80Var = new r80();
            r80 r80Var7 = new r80();
            r80 r80Var8 = new r80();
            om0 om0Var = new om0(r80Var8);
            r80Var2 = new r80();
            list = arrayList;
            set = om0Var;
            list2 = arrayList2;
            r80Var3 = r80Var8;
            list3 = arrayList3;
            r80Var4 = r80Var7;
            synchronized (li0Var.r.b) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    wc.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r80 r80Var9 = li0Var.o;
                set = li0Var.n;
                r80Var3 = li0Var.m;
                r80Var4 = li0Var.l;
                r80Var = li0Var.k;
                list3 = li0Var.j;
                list2 = li0Var.i;
                list = li0Var.h;
                o70 o70Var3 = li0Var.q;
                i60.az(obj);
                r80Var2 = r80Var9;
                o70Var = o70Var3;
                mi0 mi0Var = li0Var.r;
                synchronized (mi0Var.b) {
                    try {
                        q80 q80Var = mi0Var.k;
                        if ((q80Var.e != 0 ? i3 : 0) != 0) {
                            m80 m80VarB = a80.b(q80Var);
                            mi0Var.k.a();
                            f1 f1Var = mi0Var.l;
                            ((q80) f1Var.e).a();
                            ((q80) f1Var.f).a();
                            mi0Var.n.a();
                            m80Var = new m80(m80VarB.b);
                            Object[] objArr = m80VarB.a;
                            int i5 = m80VarB.b;
                            yjVar = yjVar2;
                            int i6 = 0;
                            while (i6 < i5) {
                                int i7 = i6;
                                v70 v70Var = (v70) objArr[i6];
                                m80Var.a(new ae0(v70Var, mi0Var.m.g(v70Var)));
                                i6 = i7 + 1;
                                o70Var = o70Var;
                            }
                            o70Var2 = o70Var;
                            mi0Var.m.a();
                        } else {
                            yjVar = yjVar2;
                            o70Var2 = o70Var;
                            m80Var = ta0.b;
                            m80Var.getClass();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Object[] objArr2 = m80Var.a;
                int i8 = m80Var.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    ae0 ae0Var = (ae0) objArr2[i9];
                }
                li0Var = this;
                yjVar2 = yjVar;
                o70Var = o70Var2;
                i2 = 2;
                i3 = 1;
                synchronized (li0Var.r.b) {
                }
                mi0 mi0Var2 = li0Var.r;
                li0Var.q = o70Var;
                li0Var.h = list;
                li0Var.i = list2;
                li0Var.j = list3;
                li0Var.k = r80Var;
                li0Var.l = r80Var4;
                li0Var.m = r80Var3;
                li0Var.n = set;
                li0Var.o = r80Var2;
                li0Var.p = i3;
                if (mi0Var2.x()) {
                    objS = wz0.a;
                } else {
                    la laVar2 = new la(i3, f00.x(li0Var));
                    laVar2.t();
                    synchronized (mi0Var2.b) {
                        if (mi0Var2.x()) {
                            laVar = laVar2;
                        } else {
                            mi0Var2.q = laVar2;
                            laVar = null;
                        }
                    }
                    if (laVar != null) {
                        laVar.h(wz0.a);
                    }
                    objS = laVar2.s();
                    if (objS != yj.d) {
                        objS = wz0.a;
                    }
                }
                if (objS != yjVar2) {
                    List list6 = list;
                    r80Var5 = r80Var;
                    r80Var6 = r80Var2;
                    list4 = list3;
                    list5 = list6;
                    final Set set2 = set;
                    final r80 r80Var10 = r80Var4;
                    final r80 r80Var11 = r80Var3;
                    if (mi0.s(li0Var.r)) {
                        List list7 = list4;
                        r80Var2 = r80Var6;
                        r80Var = r80Var5;
                        list = list5;
                        list3 = list7;
                        li0Var = this;
                        r80Var3 = r80Var11;
                        r80Var4 = r80Var10;
                        set = set2;
                        synchronized (li0Var.r.b) {
                        }
                    } else {
                        final mi0 mi0Var3 = li0Var.r;
                        cv cvVar = new cv() { // from class: ki0
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:105:0x0182 A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #6 {all -> 0x00ef, blocks: (B:50:0x00bd, B:61:0x00eb, B:75:0x010b, B:96:0x016c, B:105:0x0182, B:127:0x01dd, B:130:0x01e7, B:134:0x01f0, B:135:0x01f3, B:99:0x0176, B:103:0x017e, B:104:0x0181, B:66:0x00f8, B:73:0x0107, B:74:0x010a, B:65:0x00f2, B:129:0x01e1, B:98:0x0170), top: B:232:0x00bd, outer: #0, inners: #2, #5, #17 }] */
                            /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
                            /* JADX WARN: Removed duplicated region for block: B:222:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:237:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:241:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
                            /* JADX WARN: Removed duplicated region for block: B:94:0x0163  */
                            /* JADX WARN: Type inference failed for: r12v20 */
                            /* JADX WARN: Type inference failed for: r12v21 */
                            /* JADX WARN: Type inference failed for: r12v6 */
                            /* JADX WARN: Type inference failed for: r12v7, types: [int] */
                            /* JADX WARN: Type inference failed for: r12v8 */
                            /* JADX WARN: Type inference failed for: r12v9, types: [int] */
                            /* JADX WARN: Type inference failed for: r5v0, types: [java.util.Collection, java.util.List] */
                            @Override // defpackage.cv
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object g(Object obj2) {
                                boolean zW;
                                Object[] objArr3;
                                xq0 py0Var;
                                xq0 xq0VarJ;
                                boolean z;
                                mi0 mi0Var4 = mi0Var3;
                                r80 r80Var12 = r80Var11;
                                r80 r80Var13 = r80Var6;
                                List list8 = list5;
                                List list9 = list2;
                                r80 r80Var14 = r80Var5;
                                ?? r5 = list4;
                                r80 r80Var15 = r80Var10;
                                Set set3 = set2;
                                long jLongValue = ((Long) obj2).longValue();
                                synchronized (mi0Var4.b) {
                                    zW = mi0Var4.w();
                                }
                                boolean z2 = false;
                                if (zW) {
                                    Trace.beginSection("Recomposer:animation");
                                    try {
                                        mi0Var4.a.c(jLongValue);
                                        synchronized (fr0.c) {
                                            r80 r80Var16 = fr0.j.h;
                                            if (r80Var16 != null) {
                                                z = r80Var16.h();
                                            }
                                        }
                                        if (z) {
                                            fr0.a();
                                        }
                                    } finally {
                                        Trace.endSection();
                                    }
                                }
                                Trace.beginSection("Recomposer:recompose");
                                try {
                                    mi0.s(mi0Var4);
                                    synchronized (mi0Var4.b) {
                                        try {
                                            a90 a90Var = mi0Var4.h;
                                            Object[] objArr4 = a90Var.d;
                                            int i10 = a90Var.f;
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                list8.add((jg) objArr4[i11]);
                                            }
                                            mi0Var4.h.g();
                                        } finally {
                                        }
                                    }
                                    r80Var12.b();
                                    r80Var13.b();
                                    try {
                                        try {
                                            while (true) {
                                                if (list8.isEmpty() && list9.isEmpty()) {
                                                    break;
                                                }
                                                try {
                                                    int size = list8.size();
                                                    for (int i12 = 0; i12 < size; i12++) {
                                                        jg jgVar = (jg) list8.get(i12);
                                                        jg jgVarR = mi0.r(mi0Var4, jgVar, r80Var12);
                                                        if (jgVarR != null) {
                                                            r5.add(jgVarR);
                                                        }
                                                        r80Var13.a(jgVar);
                                                    }
                                                    list8.clear();
                                                    if (r80Var12.h() || mi0Var4.h.f != 0) {
                                                        synchronized (mi0Var4.b) {
                                                            try {
                                                                List listY = mi0Var4.y();
                                                                int size2 = listY.size();
                                                                for (int i13 = 0; i13 < size2; i13++) {
                                                                    jg jgVar2 = (jg) listY.get(i13);
                                                                    if (!r80Var13.c(jgVar2) && jgVar2.r(set3)) {
                                                                        list8.add(jgVar2);
                                                                    }
                                                                }
                                                                a90 a90Var2 = mi0Var4.h;
                                                                int i14 = a90Var2.f;
                                                                int i15 = 0;
                                                                int i16 = 0;
                                                                while (true) {
                                                                    objArr3 = a90Var2.d;
                                                                    if (i15 >= i14) {
                                                                        break;
                                                                    }
                                                                    jg jgVar3 = (jg) objArr3[i15];
                                                                    if (!r80Var13.c(jgVar3) && !list8.contains(jgVar3)) {
                                                                        list8.add(jgVar3);
                                                                        i16++;
                                                                    } else if (i16 > 0) {
                                                                        Object[] objArr5 = a90Var2.d;
                                                                        objArr5[i15 - i16] = objArr5[i15];
                                                                    }
                                                                    i15++;
                                                                }
                                                                int i17 = i14 - i16;
                                                                Arrays.fill(objArr3, i17, i14, (Object) null);
                                                                a90Var2.f = i17;
                                                            } finally {
                                                            }
                                                        }
                                                    }
                                                    if (list8.isEmpty()) {
                                                        try {
                                                            li0.r(list9, mi0Var4);
                                                            while (!list9.isEmpty()) {
                                                                List listAa = mi0Var4.aa(list9, r80Var12);
                                                                r80Var14.getClass();
                                                                Iterator it = listAa.iterator();
                                                                while (it.hasNext()) {
                                                                    r80Var14.j(it.next());
                                                                }
                                                                li0.r(list9, mi0Var4);
                                                            }
                                                        } catch (Throwable th2) {
                                                            mi0Var4.ab(th2, null);
                                                            li0.q(mi0Var4, list8, list9, r5, r80Var14, r80Var15, r80Var12, r80Var13);
                                                        }
                                                    }
                                                    z2 = false;
                                                } catch (Throwable th3) {
                                                    try {
                                                        mi0Var4.ab(th3, null);
                                                        li0.q(mi0Var4, list8, list9, r5, r80Var14, r80Var15, r80Var12, r80Var13);
                                                    } finally {
                                                        list8.clear();
                                                    }
                                                }
                                                return wz0.a;
                                            }
                                            if (!r5.isEmpty()) {
                                                try {
                                                    int size3 = r5.size();
                                                    for (?? r12 = z2; r12 < size3; r12++) {
                                                        r80Var15.a((jg) r5.get(r12));
                                                    }
                                                    int size4 = r5.size();
                                                    for (?? r122 = z2; r122 < size4; r122++) {
                                                        ((jg) r5.get(r122)).d();
                                                    }
                                                    if (r80Var14.h()) {
                                                        if (r80Var15.h()) {
                                                        }
                                                        py0Var.c();
                                                        synchronized (mi0Var4.b) {
                                                        }
                                                    } else {
                                                        try {
                                                            r80Var15.i(r80Var14);
                                                            Object[] objArr6 = r80Var14.b;
                                                            long[] jArr = r80Var14.a;
                                                            int length = jArr.length - 2;
                                                            if (length >= 0) {
                                                                int i18 = 0;
                                                                while (true) {
                                                                    long j = jArr[i18];
                                                                    Object[] objArr7 = objArr6;
                                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i19 = 8 - ((~(i18 - length)) >>> 31);
                                                                        for (int i20 = 0; i20 < i19; i20++) {
                                                                            if ((j & 255) < 128) {
                                                                                ((jg) objArr7[(i18 << 3) + i20]).f();
                                                                            }
                                                                            j >>= 8;
                                                                        }
                                                                        if (i19 != 8) {
                                                                            break;
                                                                        }
                                                                        if (i18 == length) {
                                                                            break;
                                                                        }
                                                                        i18++;
                                                                        objArr6 = objArr7;
                                                                    }
                                                                }
                                                            }
                                                            if (r80Var15.h()) {
                                                                try {
                                                                    Object[] objArr8 = r80Var15.b;
                                                                    long[] jArr2 = r80Var15.a;
                                                                    int length2 = jArr2.length - 2;
                                                                    if (length2 >= 0) {
                                                                        int i21 = 0;
                                                                        while (true) {
                                                                            long j2 = jArr2[i21];
                                                                            Object[] objArr9 = objArr8;
                                                                            long[] jArr3 = jArr2;
                                                                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                int i22 = 8 - ((~(i21 - length2)) >>> 31);
                                                                                for (int i23 = 0; i23 < i22; i23++) {
                                                                                    if ((j2 & 255) < 128) {
                                                                                        ((jg) objArr9[(i21 << 3) + i23]).g();
                                                                                    }
                                                                                    j2 >>= 8;
                                                                                }
                                                                                if (i22 != 8) {
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (i21 == length2) {
                                                                                break;
                                                                            }
                                                                            i21++;
                                                                            objArr8 = objArr9;
                                                                            jArr2 = jArr3;
                                                                        }
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    try {
                                                                        mi0Var4.ab(th4, null);
                                                                        li0.q(mi0Var4, list8, list9, r5, r80Var14, r80Var15, r80Var12, r80Var13);
                                                                        xq0.q(xq0VarJ);
                                                                        return wz0.a;
                                                                    } finally {
                                                                        r80Var15.b();
                                                                    }
                                                                }
                                                            }
                                                            py0Var.c();
                                                            synchronized (mi0Var4.b) {
                                                                mi0Var4.v();
                                                            }
                                                            fr0.k().m();
                                                            r80Var13.b();
                                                            r80Var12.b();
                                                            mi0Var4.p = null;
                                                        } catch (Throwable th5) {
                                                            try {
                                                                mi0Var4.ab(th5, null);
                                                                li0.q(mi0Var4, list8, list9, r5, r80Var14, r80Var15, r80Var12, r80Var13);
                                                                xq0.q(xq0VarJ);
                                                                return wz0.a;
                                                            } finally {
                                                                r80Var14.b();
                                                            }
                                                        }
                                                    }
                                                } catch (Throwable th6) {
                                                    try {
                                                        mi0Var4.ab(th6, null);
                                                        li0.q(mi0Var4, list8, list9, r5, r80Var14, r80Var15, r80Var12, r80Var13);
                                                        return wz0.a;
                                                    } finally {
                                                        r5.clear();
                                                    }
                                                }
                                            } else if (r80Var14.h()) {
                                            }
                                            return wz0.a;
                                        } finally {
                                            xq0.q(xq0VarJ);
                                        }
                                        xq0VarJ = py0Var.j();
                                    } finally {
                                        py0Var.c();
                                    }
                                    xq0 xq0VarK = fr0.k();
                                    py0Var = xq0VarK instanceof v80 ? new py0((v80) xq0VarK, null, null, true, false) : new qy0(xq0VarK, null, true, z2);
                                } catch (Throwable th7) {
                                    throw th7;
                                }
                            }
                        };
                        li0Var.q = o70Var;
                        li0Var.h = list5;
                        li0Var.i = list2;
                        li0Var.j = list4;
                        li0Var.k = r80Var5;
                        li0Var.l = r80Var10;
                        li0Var.m = r80Var11;
                        li0Var.n = set2;
                        li0Var.o = r80Var6;
                        li0Var.p = i2;
                        if (o70Var.m(cvVar, li0Var) != yjVar2) {
                            List list8 = list4;
                            r80Var2 = r80Var6;
                            r80Var = r80Var5;
                            list = list5;
                            list3 = list8;
                            r80Var3 = r80Var11;
                            r80Var4 = r80Var10;
                            set = set2;
                            mi0 mi0Var4 = li0Var.r;
                            synchronized (mi0Var4.b) {
                            }
                        }
                    }
                }
                return yjVar2;
            }
            r80 r80Var12 = li0Var.o;
            set = li0Var.n;
            r80Var3 = li0Var.m;
            r80Var4 = li0Var.l;
            r80 r80Var13 = li0Var.k;
            List list9 = li0Var.j;
            list2 = li0Var.i;
            List list10 = li0Var.h;
            o70 o70Var4 = li0Var.q;
            i60.az(obj);
            r80Var6 = r80Var12;
            o70Var = o70Var4;
            list4 = list9;
            list5 = list10;
            r80Var5 = r80Var13;
            final Set set22 = set;
            final r80 r80Var102 = r80Var4;
            final r80 r80Var112 = r80Var3;
            if (mi0.s(li0Var.r)) {
            }
        }
    }
}
