package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
abstract class tm0 {

    /* renamed from: q, reason: collision with root package name */
    private final WeakReference f16249q;

    public tm0(View view) {
        this.f16249q = new WeakReference(view);
    }

    protected abstract void a(ViewTreeObserver viewTreeObserver);

    protected abstract void b(ViewTreeObserver viewTreeObserver);

    public final void c() {
        ViewTreeObserver e8 = e();
        if (e8 != null) {
            a(e8);
        }
    }

    public final void d() {
        ViewTreeObserver e8 = e();
        if (e8 != null) {
            b(e8);
        }
    }

    protected final ViewTreeObserver e() {
        ViewTreeObserver viewTreeObserver;
        View view = (View) this.f16249q.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }
}
