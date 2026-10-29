package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* compiled from: MyApplication */
public final class ir implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    private static final long F = ((Long) s2.b0.c().d(uy.E1)).longValue();
    private final DisplayMetrics D;
    private final Rect E;

    /* renamed from: q, reason: collision with root package name */
    private final Context f10137q;

    /* renamed from: r, reason: collision with root package name */
    private Application f10138r;

    /* renamed from: s, reason: collision with root package name */
    private final WindowManager f10139s;

    /* renamed from: t, reason: collision with root package name */
    private final PowerManager f10140t;

    /* renamed from: u, reason: collision with root package name */
    private final KeyguardManager f10141u;

    /* renamed from: v, reason: collision with root package name */
    BroadcastReceiver f10142v;

    /* renamed from: w, reason: collision with root package name */
    private WeakReference f10143w;

    /* renamed from: x, reason: collision with root package name */
    final WeakReference f10144x;

    /* renamed from: y, reason: collision with root package name */
    private vr f10145y;

    /* renamed from: z, reason: collision with root package name */
    private final v2.w0 f10146z = new v2.w0(F);
    private boolean A = false;
    private int B = -1;
    private final HashSet C = new HashSet();

    public ir(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f10137q = applicationContext;
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        this.f10139s = windowManager;
        this.f10140t = (PowerManager) applicationContext.getSystemService("power");
        this.f10141u = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            this.f10138r = (Application) applicationContext;
            this.f10145y = new vr((Application) applicationContext, this);
        }
        this.D = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.E = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.f10144x;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.f10144x = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final void h() {
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.hr
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                ir.this.f();
            }
        });
    }

    private final void i(Activity activity, int i7) {
        Window window;
        WeakReference weakReference = this.f10144x;
        if (weakReference == null || (window = activity.getWindow()) == null) {
            return;
        }
        View peekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || peekDecorView == null || view.getRootView() != peekDecorView.getRootView()) {
            return;
        }
        this.B = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0156, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0131, code lost:
    
        if (r9 == 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
    
        r3 = 1;
        r13 = true;
        r14 = true;
        r9 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void j(int r35) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ir.j(int):void");
    }

    private final int k(int i7) {
        return (int) (i7 / this.D.density);
    }

    private final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f10143w = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f10142v == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f10142v = new er(this);
            r2.t.a().b(this.f10137q, this.f10142v, intentFilter);
        }
        Application application = this.f10138r;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.f10145y);
            } catch (Exception e8) {
                int i7 = v2.n1.f26802b;
                w2.p.d("Error registering activity lifecycle callbacks.", e8);
            }
        }
    }

    private final void m(View view) {
        try {
            WeakReference weakReference = this.f10143w;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f10143w = null;
            }
        } catch (Exception e8) {
            int i7 = v2.n1.f26802b;
            w2.p.d("Error while unregistering listeners from the last ViewTreeObserver.", e8);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e9) {
            int i8 = v2.n1.f26802b;
            w2.p.d("Error while unregistering listeners from the ViewTreeObserver.", e9);
        }
        if (this.f10142v != null) {
            try {
                r2.t.a().c(this.f10137q, this.f10142v);
            } catch (IllegalStateException e10) {
                int i9 = v2.n1.f26802b;
                w2.p.d("Failed trying to unregister the receiver", e10);
            } catch (Exception e11) {
                r2.t.l().i(e11, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f10142v = null;
        }
        Application application = this.f10138r;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.f10145y);
            } catch (Exception e12) {
                int i10 = v2.n1.f26802b;
                w2.p.d("Error registering activity lifecycle callbacks.", e12);
            }
        }
    }

    public final void a(gr grVar) {
        this.C.add(grVar);
        j(3);
    }

    public final void b(gr grVar) {
        this.C.remove(grVar);
    }

    final Rect c(Rect rect) {
        return new Rect(k(rect.left), k(rect.top), k(rect.right), k(rect.bottom));
    }

    public final void d(long j7) {
        this.f10146z.b(j7);
    }

    public final void e() {
        this.f10146z.b(F);
    }

    final /* synthetic */ void f() {
        j(3);
    }

    final /* synthetic */ void g(int i7) {
        j(3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        h();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        h();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.B = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.B = -1;
        j(3);
        h();
        m(view);
    }
}
