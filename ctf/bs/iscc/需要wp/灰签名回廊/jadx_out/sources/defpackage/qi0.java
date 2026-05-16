package defpackage;

import android.os.Bundle;
import com.example.gnd.MainActivity;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class qi0 implements s30 {
    public final /* synthetic */ int d;
    public final MainActivity e;

    public /* synthetic */ qi0(MainActivity mainActivity, int i) {
        this.d = i;
        this.e = mainActivity;
    }

    @Override // defpackage.s30
    public final void d(u30 u30Var, n30 n30Var) {
        switch (this.d) {
            case 0:
                if (n30Var != n30.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                u30Var.getLifecycle().b(this);
                MainActivity mainActivity = this.e;
                Bundle bundleA = mainActivity.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    wc.q("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i = 0;
                while (i < size) {
                    String str = stringArrayList.get(i);
                    i++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, qi0.class.getClassLoader()).asSubclass(zl0.class);
                        clsAsSubclass.getClass();
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                objNewInstance.getClass();
                                t11 viewModelStore = mainActivity.getViewModelStore();
                                bm0 savedStateRegistry = mainActivity.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.a;
                                for (String str3 : new HashSet(linkedHashMap.keySet())) {
                                    str3.getClass();
                                    o11 o11Var = (o11) linkedHashMap.get(str3);
                                    if (o11Var != null) {
                                        m10.k(o11Var, savedStateRegistry, mainActivity.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.c();
                                }
                            } catch (Exception e) {
                                wc.k("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException("Class " + str2 + " wasn't found", e3);
                    }
                }
                return;
            default:
                MainActivity mainActivity2 = this.e;
                oe.access$ensureViewModelStore(mainActivity2);
                mainActivity2.getLifecycle().b(this);
                return;
        }
    }
}
