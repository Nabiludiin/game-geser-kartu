package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: MyApplication */
public final class c0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: q, reason: collision with root package name */
    private final View f1858q;

    /* renamed from: r, reason: collision with root package name */
    private ViewTreeObserver f1859r;

    /* renamed from: s, reason: collision with root package name */
    private final Runnable f1860s;

    private c0(View view, Runnable runnable) {
        this.f1858q = view;
        this.f1859r = view.getViewTreeObserver();
        this.f1860s = runnable;
    }

    public static c0 a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        c0 c0Var = new c0(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(c0Var);
        view.addOnAttachStateChangeListener(c0Var);
        return c0Var;
    }

    public void b() {
        if (this.f1859r.isAlive()) {
            this.f1859r.removeOnPreDrawListener(this);
        } else {
            this.f1858q.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f1858q.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f1860s.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f1859r = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
