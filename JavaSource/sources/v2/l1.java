package v2;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import com.google.android.gms.internal.ads.qm0;

/* compiled from: MyApplication */
public final class l1 {

    /* renamed from: a, reason: collision with root package name */
    private final View f26788a;

    /* renamed from: b, reason: collision with root package name */
    private Activity f26789b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26790c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26791d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26792e;

    /* renamed from: f, reason: collision with root package name */
    private final ViewTreeObserver.OnGlobalLayoutListener f26793f;

    public l1(Activity activity, View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.f26789b = activity;
        this.f26788a = view;
        this.f26793f = onGlobalLayoutListener;
    }

    private final void f() {
        if (this.f26790c) {
            return;
        }
        Activity activity = this.f26789b;
        if (activity != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f26793f;
            ViewTreeObserver h8 = h(activity);
            if (h8 != null) {
                h8.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        View view = this.f26788a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.f26793f;
        r2.t.c();
        qm0.a(view, onGlobalLayoutListener2);
        this.f26790c = true;
    }

    private final void g() {
        Activity activity = this.f26789b;
        if (activity != null && this.f26790c) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f26793f;
            ViewTreeObserver h8 = h(activity);
            if (h8 != null) {
                h8.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.f26790c = false;
        }
    }

    private static ViewTreeObserver h(Activity activity) {
        View decorView;
        Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    public final void a(Activity activity) {
        this.f26789b = activity;
    }

    public final void b() {
        this.f26792e = true;
        if (this.f26791d) {
            f();
        }
    }

    public final void c() {
        this.f26792e = false;
        g();
    }

    public final void d() {
        this.f26791d = true;
        if (this.f26792e) {
            f();
        }
    }

    public final void e() {
        this.f26791d = false;
        g();
    }
}
