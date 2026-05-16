package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.example.gnd.MainActivity;
import com.example.gnd.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class oe extends ne implements u11, jx, em0 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final he Companion = new he();
    private t11 _viewModelStore;
    private final br activityResultRegistry;
    private int contentLayoutId;
    private final oh contextAwareHelper = new oh();
    private final x20 defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final x20 fullyDrawnReporter$delegate;
    private final w60 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final x20 onBackPressedDispatcher$delegate;
    private final x20 onBackPressedInput$delegate;
    private final CopyOnWriteArrayList<fh> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<fh> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<fh> onNewIntentListeners;
    private final CopyOnWriteArrayList<fh> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<fh> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final ke reportFullyDrawnExecutor;
    private final cm0 savedStateRegistryController;

    public oe() {
        am0 am0Var;
        final MainActivity mainActivity = (MainActivity) this;
        this.menuHostHelper = new w60(new ce(mainActivity, 1));
        dm0 dm0Var = new dm0(mainActivity, new zd(mainActivity, 6));
        this.savedStateRegistryController = new cm0(dm0Var);
        this.reportFullyDrawnExecutor = new le(mainActivity);
        this.fullyDrawnReporter$delegate = new au0(new zd(mainActivity, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new me();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput$delegate = new au0(new zd(mainActivity, 3));
        if (getLifecycle() == null) {
            wc.q("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
            throw null;
        }
        final int i = 0;
        getLifecycle().a(new s30() { // from class: ee
            @Override // defpackage.s30
            public final void d(u30 u30Var, n30 n30Var) {
                Window window;
                View viewPeekDecorView;
                switch (i) {
                    case 0:
                        if (n30Var == n30.ON_STOP && (window = mainActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        oe.c(mainActivity, u30Var, n30Var);
                        break;
                }
            }
        });
        final int i2 = 1;
        getLifecycle().a(new s30() { // from class: ee
            @Override // defpackage.s30
            public final void d(u30 u30Var, n30 n30Var) {
                Window window;
                View viewPeekDecorView;
                switch (i2) {
                    case 0:
                        if (n30Var == n30.ON_STOP && (window = mainActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        oe.c(mainActivity, u30Var, n30Var);
                        break;
                }
            }
        });
        getLifecycle().a(new qi0(mainActivity, i2));
        dm0Var.a();
        o30 o30Var = ((w30) getLifecycle()).c;
        if (o30Var != o30.e && o30Var != o30.f) {
            wc.n("Failed requirement.");
            throw null;
        }
        dm0 dm0Var2 = getSavedStateRegistry().a;
        synchronized (dm0Var2.c) {
            Iterator it = dm0Var2.d.entrySet().iterator();
            do {
                am0Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                am0 am0Var2 = (am0) entry.getValue();
                if (f00.h(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    am0Var = am0Var2;
                }
            } while (am0Var == null);
        }
        if (am0Var == null) {
            xl0 xl0Var = new xl0(getSavedStateRegistry(), mainActivity);
            getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider", xl0Var);
            getLifecycle().a(new yf(1, xl0Var));
        }
        getSavedStateRegistry().b(ACTIVITY_RESULT_TAG, new fe(0, mainActivity));
        addOnContextAvailableListener(new ge(mainActivity));
        this.defaultViewModelProviderFactory$delegate = new au0(new zd(mainActivity, 4));
        this.onBackPressedDispatcher$delegate = new au0(new zd(mainActivity, 0));
    }

    public static Bundle a(MainActivity mainActivity) {
        Bundle bundle = new Bundle();
        br brVar = ((oe) mainActivity).activityResultRegistry;
        brVar.getClass();
        LinkedHashMap linkedHashMap = brVar.b;
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(brVar.c));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(brVar.f));
        return bundle;
    }

    public static final void access$ensureViewModelStore(oe oeVar) {
        if (oeVar._viewModelStore == null) {
            je jeVar = (je) oeVar.getLastNonConfigurationInstance();
            if (jeVar != null) {
                oeVar._viewModelStore = jeVar.b;
            }
            if (oeVar._viewModelStore == null) {
                oeVar._viewModelStore = new t11();
            }
        }
    }

    public static ou b(MainActivity mainActivity) {
        return new ou(((oe) mainActivity).reportFullyDrawnExecutor, new zd(mainActivity, 1));
    }

    public static void c(MainActivity mainActivity, u30 u30Var, n30 n30Var) {
        if (n30Var == n30.ON_DESTROY) {
            ((oe) mainActivity).contextAwareHelper.b = null;
            if (!mainActivity.isChangingConfigurations()) {
                LinkedHashMap linkedHashMap = mainActivity.getViewModelStore().a;
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((o11) it.next()).a();
                }
                linkedHashMap.clear();
            }
            le leVar = (le) ((oe) mainActivity).reportFullyDrawnExecutor;
            MainActivity mainActivity2 = leVar.g;
            mainActivity2.getWindow().getDecorView().removeCallbacks(leVar);
            mainActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(leVar);
        }
    }

    public static void d(MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e) {
            if (!f00.h(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e;
            }
        } catch (NullPointerException e2) {
            if (!f00.h(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e2;
            }
        }
    }

    public static void e(MainActivity mainActivity, oe oeVar) {
        oeVar.getClass();
        Bundle bundleA = mainActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            br brVar = ((oe) mainActivity).activityResultRegistry;
            LinkedHashMap linkedHashMap = brVar.b;
            LinkedHashMap linkedHashMap2 = brVar.a;
            Bundle bundle = brVar.f;
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                brVar.c.addAll(stringArrayList2);
            }
            Bundle bundle2 = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            int size = stringArrayList.size();
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                if (linkedHashMap.containsKey(str)) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle.containsKey(str)) {
                        az0.o(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i);
                num2.getClass();
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i);
                str2.getClass();
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                brVar.b.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ke keVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((le) keVar).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(y60 y60Var, u30 u30Var) {
        y60Var.getClass();
        u30Var.getClass();
        w60 w60Var = this.menuHostHelper;
        w60Var.b.add(null);
        w60Var.a.run();
        p30 lifecycle = u30Var.getLifecycle();
        HashMap map = w60Var.c;
        v60 v60Var = (v60) map.remove(y60Var);
        if (v60Var != null) {
            v60Var.a.b(v60Var.b);
            v60Var.b = null;
        }
        map.put(y60Var, new v60(lifecycle, new u60(0, w60Var)));
    }

    public final void addOnConfigurationChangedListener(fh fhVar) {
        fhVar.getClass();
        this.onConfigurationChangedListeners.add(fhVar);
    }

    public final void addOnContextAvailableListener(jb0 jb0Var) {
        jb0Var.getClass();
        oh ohVar = this.contextAwareHelper;
        ohVar.getClass();
        oe oeVar = ohVar.b;
        if (oeVar != null) {
            e(((ge) jb0Var).a, oeVar);
        }
        ohVar.a.add(jb0Var);
    }

    public final void addOnMultiWindowModeChangedListener(fh fhVar) {
        fhVar.getClass();
        this.onMultiWindowModeChangedListeners.add(fhVar);
    }

    public final void addOnNewIntentListener(fh fhVar) {
        fhVar.getClass();
        this.onNewIntentListeners.add(fhVar);
    }

    public final void addOnPictureInPictureModeChangedListener(fh fhVar) {
        fhVar.getClass();
        this.onPictureInPictureModeChangedListeners.add(fhVar);
    }

    public final void addOnTrimMemoryListener(fh fhVar) {
        fhVar.getClass();
        this.onTrimMemoryListeners.add(fhVar);
    }

    public final void addOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.add(runnable);
    }

    public final br getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // defpackage.jx
    public fk getDefaultViewModelCreationExtras() {
        ek ekVar = ek.b;
        ekVar.getClass();
        LinkedHashMap linkedHashMap = ekVar.a;
        linkedHashMap.getClass();
        b80 b80Var = new b80();
        b80Var.a.putAll(linkedHashMap);
        Application application = getApplication();
        LinkedHashMap linkedHashMap2 = b80Var.a;
        if (application != null) {
            linkedHashMap2.put(q11.d, getApplication());
        }
        linkedHashMap2.put(i60.l, this);
        linkedHashMap2.put(i60.m, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            linkedHashMap2.put(i60.n, extras);
        }
        return b80Var;
    }

    public r11 getDefaultViewModelProviderFactory() {
        return (r11) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public ou getFullyDrawnReporter() {
        return (ou) this.fullyDrawnReporter$delegate.getValue();
    }

    @hm
    public Object getLastCustomNonConfigurationInstance() {
        je jeVar = (je) getLastNonConfigurationInstance();
        if (jeVar != null) {
            return jeVar.a;
        }
        return null;
    }

    @Override // defpackage.ne, defpackage.u30
    public p30 getLifecycle() {
        return super.getLifecycle();
    }

    public k90 getNavigationEventDispatcher() {
        return ((hb0) getOnBackPressedDispatcher().b.getValue()).c;
    }

    public final ib0 getOnBackPressedDispatcher() {
        return (ib0) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // defpackage.em0
    public final bm0 getSavedStateRegistry() {
        return this.savedStateRegistryController.b;
    }

    @Override // defpackage.u11
    public t11 getViewModelStore() {
        if (getApplication() == null) {
            wc.q("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
            return null;
        }
        if (this._viewModelStore == null) {
            je jeVar = (je) getLastNonConfigurationInstance();
            if (jeVar != null) {
                this._viewModelStore = jeVar.b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new t11();
            }
        }
        t11 t11Var = this._viewModelStore;
        t11Var.getClass();
        return t11Var;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        View decorView2 = getWindow().getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        decorView5.getClass();
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        decorView6.getClass();
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @hm
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.activityResultRegistry.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    @hm
    public void onBackPressed() {
        ((qm) this.onBackPressedInput$delegate.getValue()).a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        super.onConfigurationChanged(configuration);
        Iterator<fh> it = this.onConfigurationChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // defpackage.ne, android.app.Activity
    public void onCreate(Bundle bundle) {
        dm0 dm0Var = this.savedStateRegistryController.a;
        MainActivity mainActivity = dm0Var.a;
        if (!dm0Var.e) {
            dm0Var.a();
        }
        if (((w30) mainActivity.getLifecycle()).c.compareTo(o30.g) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + ((w30) mainActivity.getLifecycle()).c).toString());
        }
        if (dm0Var.g) {
            wc.q("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundleAc = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            bundleAc = m10.ac("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
        }
        dm0Var.f = bundleAc;
        dm0Var.g = true;
        oh ohVar = this.contextAwareHelper;
        ohVar.getClass();
        ohVar.b = this;
        Iterator it = ohVar.a.iterator();
        while (it.hasNext()) {
            e(((ge) ((jb0) it.next())).a, this);
        }
        super.onCreate(bundle);
        int i = lj0.e;
        jj0.b(this);
        int i2 = this.contentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        w60 w60Var = this.menuHostHelper;
        getMenuInflater();
        Iterator it = w60Var.b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        wc.c();
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        menuItem.getClass();
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = this.menuHostHelper.b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        wc.c();
        return false;
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<fh> it = this.onMultiWindowModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new n31(24));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        Iterator<fh> it = this.onNewIntentListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        menu.getClass();
        Iterator it = this.menuHostHelper.b.iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i, menu);
        } else {
            it.next().getClass();
            wc.c();
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        configuration.getClass();
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<fh> it = this.onPictureInPictureModeChangedListeners.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().accept(new n31(29));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        menu.getClass();
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = this.menuHostHelper.b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        wc.c();
        return false;
    }

    @Override // android.app.Activity
    @hm
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        strArr.getClass();
        iArr.getClass();
        if (this.activityResultRegistry.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @hm
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        je jeVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        t11 t11Var = this._viewModelStore;
        if (t11Var == null && (jeVar = (je) getLastNonConfigurationInstance()) != null) {
            t11Var = jeVar.b;
        }
        if (t11Var == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        je jeVar2 = new je();
        jeVar2.a = objOnRetainCustomNonConfigurationInstance;
        jeVar2.b = t11Var;
        return jeVar2;
    }

    @Override // defpackage.ne, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        if (getLifecycle() instanceof w30) {
            p30 lifecycle = getLifecycle();
            lifecycle.getClass();
            w30 w30Var = (w30) lifecycle;
            o30 o30Var = o30.f;
            w30Var.d("setCurrentState");
            w30Var.f(o30Var);
        }
        super.onSaveInstanceState(bundle);
        cm0 cm0Var = this.savedStateRegistryController;
        cm0Var.getClass();
        dm0 dm0Var = cm0Var.a;
        Bundle bundleQ = az0.q((ae0[]) Arrays.copyOf(new ae0[0], 0));
        Bundle bundle2 = dm0Var.f;
        if (bundle2 != null) {
            bundleQ.putAll(bundle2);
        }
        synchronized (dm0Var.c) {
            for (Map.Entry entry : dm0Var.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((am0) entry.getValue()).a();
                str.getClass();
                bundleQ.putBundle(str, bundleA);
            }
        }
        if (bundleQ.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleQ);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator<fh> it = this.onTrimMemoryListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.b;
    }

    public final <I, O> bp registerForActivityResult(bo boVar, bn bnVar) {
        throw null;
    }

    public void removeMenuProvider(y60 y60Var) {
        y60Var.getClass();
        this.menuHostHelper.a();
    }

    public final void removeOnConfigurationChangedListener(fh fhVar) {
        fhVar.getClass();
        this.onConfigurationChangedListeners.remove(fhVar);
    }

    public final void removeOnContextAvailableListener(jb0 jb0Var) {
        jb0Var.getClass();
        oh ohVar = this.contextAwareHelper;
        ohVar.getClass();
        ohVar.a.remove(jb0Var);
    }

    public final void removeOnMultiWindowModeChangedListener(fh fhVar) {
        fhVar.getClass();
        this.onMultiWindowModeChangedListeners.remove(fhVar);
    }

    public final void removeOnNewIntentListener(fh fhVar) {
        fhVar.getClass();
        this.onNewIntentListeners.remove(fhVar);
    }

    public final void removeOnPictureInPictureModeChangedListener(fh fhVar) {
        fhVar.getClass();
        this.onPictureInPictureModeChangedListeners.remove(fhVar);
    }

    public final void removeOnTrimMemoryListener(fh fhVar) {
        fhVar.getClass();
        this.onTrimMemoryListeners.remove(fhVar);
    }

    public final void removeOnUserLeaveHintListener(Runnable runnable) {
        runnable.getClass();
        this.onUserLeaveHintListeners.remove(runnable);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (jo0.g()) {
                jo0.d("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            ou fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.a) {
                try {
                    fullyDrawnReporter.b = true;
                    ArrayList arrayList = fullyDrawnReporter.c;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        ((pu) obj).a();
                    }
                    fullyDrawnReporter.c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        initializeViewTreeOwners();
        ke keVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((le) keVar).a(decorView);
        super.setContentView(i);
    }

    @Override // android.app.Activity
    @hm
    public void startActivityForResult(Intent intent, int i) {
        intent.getClass();
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @hm
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final <I, O> bp registerForActivityResult(bo boVar, br brVar, bn bnVar) {
        throw null;
    }

    @Override // android.app.Activity
    @hm
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        intent.getClass();
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @hm
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        intentSender.getClass();
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        ke keVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((le) keVar).a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        ke keVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        ((le) keVar).a(decorView);
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @hm
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<fh> it = this.onMultiWindowModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new n31(24));
        }
    }

    @Override // android.app.Activity
    @hm
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<fh> it = this.onPictureInPictureModeChangedListeners.iterator();
        it.getClass();
        while (it.hasNext()) {
            it.next().accept(new n31(29));
        }
    }

    public void addMenuProvider(y60 y60Var) {
        y60Var.getClass();
        w60 w60Var = this.menuHostHelper;
        w60Var.b.add(null);
        w60Var.a.run();
    }

    public void addMenuProvider(y60 y60Var, u30 u30Var, o30 o30Var) {
        y60Var.getClass();
        u30Var.getClass();
        o30Var.getClass();
        w60 w60Var = this.menuHostHelper;
        w60Var.getClass();
        p30 lifecycle = u30Var.getLifecycle();
        HashMap map = w60Var.c;
        v60 v60Var = (v60) map.remove(y60Var);
        if (v60Var != null) {
            v60Var.a.b(v60Var.b);
            v60Var.b = null;
        }
        map.put(y60Var, new v60(lifecycle, new de(1, w60Var, o30Var)));
    }
}
