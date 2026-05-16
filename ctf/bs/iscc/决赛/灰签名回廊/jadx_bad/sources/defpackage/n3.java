package defpackage;

import android.graphics.RectF;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n3 implements gv {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ n3(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02cf  */
    /* JADX WARN: Type inference failed for: r0v47, types: [cv, x10] */
    @Override // defpackage.gv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2) {
        boolean zE;
        char c;
        char c2;
        Collection collectionAz;
        Object next;
        ae0 ae0Var;
        Object next2;
        char c3 = 7;
        Object objV = null;
        int i = 0;
        switch (this.d) {
            case 0:
                wc wcVar = (wc) this.e;
                ri0 ri0VarBh = pk.bh((RectF) obj);
                ri0 ri0VarBh2 = pk.bh((RectF) obj2);
                switch (wcVar.a) {
                    case 28:
                        zE = ri0VarBh.e(ri0VarBh2);
                        break;
                    default:
                        long jA = ri0VarBh.a();
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jA & 4294967295L));
                        zE = (fIntBitsToFloat >= ri0VarBh2.a) & (fIntBitsToFloat < ri0VarBh2.c) & (fIntBitsToFloat2 >= ri0VarBh2.b) & (fIntBitsToFloat2 < ri0VarBh2.d);
                        break;
                }
                return Boolean.valueOf(zE);
            case 1:
                da0 da0Var = (da0) this.e;
                ((Integer) obj).getClass();
                if (obj2 instanceof s20) {
                    s20 s20Var = (s20) obj2;
                    r80 r80Var = (r80) da0Var.i;
                    if (r80Var == null) {
                        int i2 = nm0.a;
                        r80Var = new r80();
                        da0Var.i = r80Var;
                    }
                    r80Var.j(s20Var);
                    da0Var.d.b(s20Var);
                }
                if (obj2 instanceof cj0) {
                    da0Var.g((cj0) obj2);
                }
                if (obj2 instanceof hi0) {
                    ((hi0) obj2).c();
                }
                return wz0.a;
            case 2:
                mi0 mi0Var = (mi0) this.e;
                Set set = (Set) obj;
                synchronized (mi0Var.b) {
                    try {
                        if (((ii0) mi0Var.t.getValue()).compareTo(ii0.h) >= 0) {
                            r80 r80Var2 = mi0Var.g;
                            if (set instanceof om0) {
                                r80 r80Var3 = ((om0) set).d;
                                Object[] objArr = r80Var3.b;
                                long[] jArr = r80Var3.a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i3 = 0;
                                    while (true) {
                                        long j = jArr[i3];
                                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                                            for (int i5 = i; i5 < i4; i5++) {
                                                if ((j & 255) < 128) {
                                                    Object obj3 = objArr[(i3 << 3) + i5];
                                                    if (!(obj3 instanceof us0) || ((us0) obj3).e(1)) {
                                                        r80Var2.a(obj3);
                                                    }
                                                }
                                                j >>= 8;
                                            }
                                            if (i4 == 8) {
                                                if (i3 != length) {
                                                    i3++;
                                                    i = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                for (Object obj4 : set) {
                                    if (!(obj4 instanceof us0) || ((us0) obj4).e(1)) {
                                        r80Var2.a(obj4);
                                    }
                                }
                            }
                            objV = mi0Var.v();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                if (objV != null) {
                    ((la) objV).h(wz0.a);
                }
                return wz0.a;
            case 3:
                il0 il0Var = (il0) this.e;
                int iIntValue = ((Integer) obj).intValue();
                nj njVar = (nj) obj2;
                oj key = njVar.getKey();
                nj njVarK = il0Var.h.k(key);
                if (key != bw.ae) {
                    iIntValue = njVar != njVarK ? Integer.MIN_VALUE : iIntValue + 1;
                } else {
                    t00 t00Var = (t00) njVarK;
                    t00 parent = (t00) njVar;
                    while (parent != null) {
                        if (parent != t00Var && (parent instanceof pm0)) {
                            pb pbVar = (pb) a10.e.get((pm0) parent);
                            parent = pbVar != null ? pbVar.getParent() : null;
                        } else {
                            objV = parent;
                            if (objV == t00Var) {
                                throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + objV + ", expected child of " + t00Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                            }
                            if (t00Var != null) {
                            }
                        }
                    }
                    if (objV == t00Var) {
                    }
                }
                return Integer.valueOf(iIntValue);
            case 4:
                o9 o9Var = (o9) this.e;
                Set set2 = (Set) obj;
                if (set2 instanceof om0) {
                    r80 r80Var4 = ((om0) set2).d;
                    Object[] objArr2 = r80Var4.b;
                    long[] jArr2 = r80Var4.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << c3) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                int i8 = 0;
                                while (i8 < i7) {
                                    if ((j2 & 255) < 128) {
                                        Object obj5 = objArr2[(i6 << 3) + i8];
                                        c2 = c3;
                                        if (!(obj5 instanceof us0) || ((us0) obj5).e(4)) {
                                        }
                                    } else {
                                        c2 = c3;
                                    }
                                    j2 >>= 8;
                                    i8++;
                                    c3 = c2;
                                }
                                c = c3;
                                if (i7 == 8) {
                                }
                            } else {
                                c = c3;
                            }
                            if (i6 != length2) {
                                i6++;
                                c3 = c;
                            }
                        }
                    }
                } else {
                    Set set3 = set2;
                    if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                        for (Object obj6 : set3) {
                            if (!(obj6 instanceof us0) || ((us0) obj6).e(4)) {
                                o9Var.u(set2);
                            }
                        }
                    }
                }
                return wz0.a;
            case 5:
                rr0 rr0Var = (rr0) this.e;
                Collection collection = (Set) obj;
                AtomicReference atomicReference = rr0Var.b;
                while (true) {
                    Object obj7 = atomicReference.get();
                    if (obj7 == null) {
                        collectionAz = collection;
                    } else if (obj7 instanceof Set) {
                        collectionAz = f00.z(obj7, collection);
                    } else {
                        if (!(obj7 instanceof List)) {
                            xf.d("Unexpected notification");
                            throw new xd();
                        }
                        collectionAz = kc.az((Collection) obj7, f00.y(collection));
                    }
                    while (!atomicReference.compareAndSet(obj7, collectionAz)) {
                        if (atomicReference.get() != obj7) {
                        }
                        break;
                    }
                    if (rr0Var.b()) {
                        rr0Var.a.g(new t4(6, rr0Var));
                    }
                    return wz0.a;
                }
                break;
            default:
                List list = (List) this.e;
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                charSequence.getClass();
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        wc.n("List has more than one element.");
                        return null;
                    }
                    String str = (String) list.get(0);
                    int iN = ft0.n(charSequence, str, iIntValue2, 4);
                    ae0Var = iN < 0 ? null : new ae0(Integer.valueOf(iN), str);
                } else {
                    if (iIntValue2 < 0) {
                        iIntValue2 = 0;
                    }
                    int i9 = new sz(iIntValue2, charSequence.length(), 1).e;
                    if (charSequence instanceof String) {
                        if (iIntValue2 <= i9) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        String str2 = (String) next2;
                                        if (str2.regionMatches(0, (String) charSequence, iIntValue2, str2.length())) {
                                        }
                                    } else {
                                        next2 = null;
                                    }
                                }
                                String str3 = (String) next2;
                                if (str3 != null) {
                                    ae0Var = new ae0(Integer.valueOf(iIntValue2), str3);
                                } else if (iIntValue2 != i9) {
                                    iIntValue2++;
                                }
                            }
                        }
                    } else if (iIntValue2 <= i9) {
                        while (true) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    String str4 = (String) next;
                                    if (ft0.q(str4, charSequence, iIntValue2, str4.length(), false)) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str5 = (String) next;
                            if (str5 != null) {
                                ae0Var = new ae0(Integer.valueOf(iIntValue2), str5);
                            } else if (iIntValue2 != i9) {
                                iIntValue2++;
                            }
                        }
                    }
                }
                if (ae0Var != null) {
                    return new ae0(ae0Var.d, Integer.valueOf(((String) ae0Var.e).length()));
                }
                return null;
        }
    }
}
