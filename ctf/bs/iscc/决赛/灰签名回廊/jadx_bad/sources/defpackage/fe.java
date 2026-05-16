package defpackage;

import android.os.Bundle;
import com.example.gnd.MainActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fe implements am0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fe(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x019d  */
    @Override // defpackage.am0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bundle a() {
        long j;
        char c;
        long j2;
        long j3;
        Map map;
        long[] jArr;
        int i;
        long[] jArr2;
        int i2;
        long j4;
        Map mapSingletonMap;
        ae0[] ae0VarArr;
        switch (this.a) {
            case 0:
                return oe.a((MainActivity) this.b);
            case 1:
                sl0 sl0Var = (sl0) this.b;
                q80 q80Var = sl0Var.a;
                if (q80Var == null && sl0Var.b == null) {
                    map = sq.d;
                } else {
                    int i3 = 0;
                    int i4 = q80Var != null ? q80Var.e : 0;
                    q80 q80Var2 = sl0Var.b;
                    HashMap map2 = new HashMap(i4 + (q80Var2 != null ? q80Var2.e : 0));
                    long j5 = -9187201950435737472L;
                    int i5 = 8;
                    if (q80Var != null) {
                        Object[] objArr = q80Var.b;
                        Object[] objArr2 = q80Var.c;
                        long[] jArr3 = q80Var.a;
                        int length = jArr3.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            c = 7;
                            j2 = 128;
                            while (true) {
                                long j6 = jArr3[i6];
                                j3 = 255;
                                if ((((~j6) << 7) & j6 & j5) != j5) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j6 & 255) < 128) {
                                            int i9 = (i6 << 3) + i8;
                                            j4 = j5;
                                            map2.put((String) objArr[i9], (List) objArr2[i9]);
                                        } else {
                                            j4 = j5;
                                        }
                                        j6 >>= 8;
                                        i8++;
                                        j5 = j4;
                                    }
                                    j = j5;
                                    if (i7 == 8) {
                                    }
                                } else {
                                    j = j5;
                                }
                                if (i6 != length) {
                                    i6++;
                                    j5 = j;
                                }
                            }
                        } else {
                            j = -9187201950435737472L;
                            c = 7;
                            j2 = 128;
                            j3 = 255;
                        }
                        q80 q80Var3 = sl0Var.b;
                        if (q80Var3 != null) {
                            Object[] objArr3 = q80Var3.b;
                            Object[] objArr4 = q80Var3.c;
                            long[] jArr4 = q80Var3.a;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr4[i10];
                                    if ((((~j7) << c) & j7 & j) != j) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        int i12 = i3;
                                        while (i12 < i11) {
                                            if ((j7 & j3) < j2) {
                                                int i13 = (i10 << 3) + i12;
                                                Object obj = objArr3[i13];
                                                List list = (List) objArr4[i13];
                                                String str = (String) obj;
                                                i2 = i5;
                                                if (list.size() == 1) {
                                                    Object objA = ((pu) list.get(i3)).a();
                                                    if (objA != null) {
                                                        if (!d41.j(objA)) {
                                                            throw new IllegalStateException(m10.v(objA).toString());
                                                        }
                                                        map2.put(str, f00.i(objA));
                                                    }
                                                    jArr2 = jArr4;
                                                } else {
                                                    int size = list.size();
                                                    ArrayList arrayList = new ArrayList(size);
                                                    while (i3 < size) {
                                                        long[] jArr5 = jArr4;
                                                        Object objA2 = ((pu) list.get(i3)).a();
                                                        if (objA2 != null && !d41.j(objA2)) {
                                                            throw new IllegalStateException(m10.v(objA2).toString());
                                                        }
                                                        arrayList.add(objA2);
                                                        i3++;
                                                        jArr4 = jArr5;
                                                    }
                                                    jArr2 = jArr4;
                                                    map2.put(str, arrayList);
                                                }
                                            } else {
                                                jArr2 = jArr4;
                                                i2 = i5;
                                            }
                                            j7 >>= i2;
                                            i12++;
                                            i5 = i2;
                                            jArr4 = jArr2;
                                            i3 = 0;
                                        }
                                        jArr = jArr4;
                                        i = i5;
                                        if (i11 == i) {
                                        }
                                    } else {
                                        jArr = jArr4;
                                        i = i5;
                                    }
                                    if (i10 != length2) {
                                        i10++;
                                        i5 = i;
                                        jArr4 = jArr;
                                        i3 = 0;
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                }
                Bundle bundle = new Bundle();
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    bundle.putParcelableArrayList(str2, list2 instanceof ArrayList ? (ArrayList) list2 : new ArrayList<>(list2));
                }
                return bundle;
            default:
                g20 g20Var = (g20) this.b;
                LinkedHashMap linkedHashMap = (LinkedHashMap) g20Var.d;
                linkedHashMap.getClass();
                int size2 = linkedHashMap.size();
                Map mapSingletonMap2 = sq.d;
                if (size2 == 0) {
                    mapSingletonMap = mapSingletonMap2;
                } else if (size2 != 1) {
                    mapSingletonMap = new LinkedHashMap(linkedHashMap);
                } else {
                    Map.Entry entry2 = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                    mapSingletonMap = Collections.singletonMap(entry2.getKey(), entry2.getValue());
                    mapSingletonMap.getClass();
                }
                for (Map.Entry entry3 : mapSingletonMap.entrySet()) {
                    g20Var.j(((ps0) entry3.getValue()).getValue(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) g20Var.a;
                linkedHashMap2.getClass();
                int size3 = linkedHashMap2.size();
                if (size3 != 0) {
                    if (size3 != 1) {
                        mapSingletonMap2 = new LinkedHashMap(linkedHashMap2);
                    } else {
                        Map.Entry entry4 = (Map.Entry) linkedHashMap2.entrySet().iterator().next();
                        mapSingletonMap2 = Collections.singletonMap(entry4.getKey(), entry4.getValue());
                        mapSingletonMap2.getClass();
                    }
                }
                for (Map.Entry entry5 : mapSingletonMap2.entrySet()) {
                    g20Var.j(((am0) entry5.getValue()).a(), (String) entry5.getKey());
                }
                LinkedHashMap linkedHashMap3 = (LinkedHashMap) g20Var.b;
                if (linkedHashMap3.isEmpty()) {
                    ae0VarArr = new ae0[0];
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap3.size());
                    for (Map.Entry entry6 : linkedHashMap3.entrySet()) {
                        arrayList2.add(new ae0((String) entry6.getKey(), entry6.getValue()));
                    }
                    ae0VarArr = (ae0[]) arrayList2.toArray(new ae0[0]);
                }
                return az0.q((ae0[]) Arrays.copyOf(ae0VarArr, ae0VarArr.length));
        }
    }
}
