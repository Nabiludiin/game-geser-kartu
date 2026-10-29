package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.f;
import androidx.lifecycle.a0;
import androidx.lifecycle.b0;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.l;
import androidx.lifecycle.u;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.savedstate.SavedStateRegistry;
import e.a;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public abstract class ComponentActivity extends f implements k, z, androidx.savedstate.c, androidx.activity.c, androidx.activity.result.d {

    /* renamed from: v, reason: collision with root package name */
    private y f104v;

    /* renamed from: x, reason: collision with root package name */
    private int f106x;

    /* renamed from: s, reason: collision with root package name */
    final d.a f101s = new d.a();

    /* renamed from: t, reason: collision with root package name */
    private final l f102t = new l(this);

    /* renamed from: u, reason: collision with root package name */
    final androidx.savedstate.b f103u = androidx.savedstate.b.a(this);

    /* renamed from: w, reason: collision with root package name */
    private final OnBackPressedDispatcher f105w = new OnBackPressedDispatcher(new a());

    /* renamed from: y, reason: collision with root package name */
    private final AtomicInteger f107y = new AtomicInteger();

    /* renamed from: z, reason: collision with root package name */
    private final ActivityResultRegistry f108z = new b();

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e8) {
                if (!TextUtils.equals(e8.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e8;
                }
            }
        }
    }

    /* compiled from: MyApplication */
    class b extends ActivityResultRegistry {

        /* compiled from: MyApplication */
        class a implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f114q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ a.C0083a f115r;

            a(int i7, a.C0083a c0083a) {
                this.f114q = i7;
                this.f115r = c0083a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f114q, this.f115r.a());
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: androidx.activity.ComponentActivity$b$b, reason: collision with other inner class name */
        class RunnableC0002b implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ int f117q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ IntentSender.SendIntentException f118r;

            RunnableC0002b(int i7, IntentSender.SendIntentException sendIntentException) {
                this.f117q = i7;
                this.f118r = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f117q, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f118r));
            }
        }

        b() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public void f(int i7, e.a aVar, Object obj, androidx.core.app.c cVar) {
            Bundle bundle;
            int i8;
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0083a b8 = aVar.b(componentActivity, obj);
            if (b8 != null) {
                new Handler(Looper.getMainLooper()).post(new a(i7, b8));
                return;
            }
            Intent a8 = aVar.a(componentActivity, obj);
            if (a8.getExtras() != null && a8.getExtras().getClassLoader() == null) {
                a8.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (a8.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = a8.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                a8.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundle = null;
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a8.getAction())) {
                String[] stringArrayExtra = a8.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.b.o(componentActivity, stringArrayExtra, i7);
                return;
            }
            if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a8.getAction())) {
                androidx.core.app.b.p(componentActivity, a8, i7, bundle2);
                return;
            }
            androidx.activity.result.e eVar = (androidx.activity.result.e) a8.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i8 = i7;
            } catch (IntentSender.SendIntentException e8) {
                e = e8;
                i8 = i7;
            }
            try {
                androidx.core.app.b.q(componentActivity, eVar.v(), i8, eVar.a(), eVar.f(), eVar.i(), 0, bundle2);
            } catch (IntentSender.SendIntentException e9) {
                e = e9;
                new Handler(Looper.getMainLooper()).post(new RunnableC0002b(i8, e));
            }
        }
    }

    /* compiled from: MyApplication */
    class c implements SavedStateRegistry.b {
        c() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.f108z.h(bundle);
            return bundle;
        }
    }

    /* compiled from: MyApplication */
    class d implements d.b {
        d() {
        }

        @Override // d.b
        public void a(Context context) {
            Bundle a8 = ComponentActivity.this.j().a("android:support:activity-result");
            if (a8 != null) {
                ComponentActivity.this.f108z.g(a8);
            }
        }
    }

    /* compiled from: MyApplication */
    static final class e {

        /* renamed from: a, reason: collision with root package name */
        Object f122a;

        /* renamed from: b, reason: collision with root package name */
        y f123b;

        e() {
        }
    }

    public ComponentActivity() {
        if (t() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i7 = Build.VERSION.SDK_INT;
        t().a(new i() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.i
            public void c(k kVar, g.b bVar) {
                if (bVar == g.b.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        t().a(new i() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.i
            public void c(k kVar, g.b bVar) {
                if (bVar == g.b.ON_DESTROY) {
                    ComponentActivity.this.f101s.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.h().a();
                }
            }
        });
        t().a(new i() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.i
            public void c(k kVar, g.b bVar) {
                ComponentActivity.this.x();
                ComponentActivity.this.t().c(this);
            }
        });
        if (i7 <= 23) {
            t().a(new ImmLeaksCleaner(this));
        }
        j().d("android:support:activity-result", new c());
        w(new d());
    }

    private void y() {
        a0.a(getWindow().getDecorView(), this);
        b0.a(getWindow().getDecorView(), this);
        androidx.savedstate.d.a(getWindow().getDecorView(), this);
    }

    public final androidx.activity.result.c A(e.a aVar, androidx.activity.result.b bVar) {
        return B(aVar, this.f108z, bVar);
    }

    public final androidx.activity.result.c B(e.a aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b bVar) {
        return activityResultRegistry.i("activity_rq#" + this.f107y.getAndIncrement(), this, aVar, bVar);
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher c() {
        return this.f105w;
    }

    @Override // androidx.activity.result.d
    public final ActivityResultRegistry e() {
        return this.f108z;
    }

    @Override // androidx.lifecycle.z
    public y h() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        x();
        return this.f104v;
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry j() {
        return this.f103u.b();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i7, int i8, Intent intent) {
        if (this.f108z.b(i7, i8, intent)) {
            return;
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f105w.c();
    }

    @Override // androidx.core.app.f, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f103u.c(bundle);
        this.f101s.c(this);
        super.onCreate(bundle);
        u.g(this);
        int i7 = this.f106x;
        if (i7 != 0) {
            setContentView(i7);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        if (this.f108z.b(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i7, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object z7 = z();
        y yVar = this.f104v;
        if (yVar == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            yVar = eVar.f123b;
        }
        if (yVar == null && z7 == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f122a = z7;
        eVar2.f123b = yVar;
        return eVar2;
    }

    @Override // androidx.core.app.f, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        g t7 = t();
        if (t7 instanceof l) {
            ((l) t7).o(g.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f103u.d(bundle);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (a1.b.d()) {
                a1.b.a("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
            a1.b.b();
        } catch (Throwable th) {
            a1.b.b();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i7) {
        y();
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i7) {
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // androidx.lifecycle.k
    public g t() {
        return this.f102t;
    }

    public final void w(d.b bVar) {
        this.f101s.a(bVar);
    }

    void x() {
        if (this.f104v == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.f104v = eVar.f123b;
            }
            if (this.f104v == null) {
                this.f104v = new y();
            }
        }
    }

    public Object z() {
        return null;
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        y();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        super.setContentView(view, layoutParams);
    }
}
