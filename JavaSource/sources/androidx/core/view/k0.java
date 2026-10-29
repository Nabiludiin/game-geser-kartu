package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f1898a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f1899b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f1900c = null;

    /* renamed from: d, reason: collision with root package name */
    int f1901d = -1;

    /* compiled from: MyApplication */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l0 f1902a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1903b;

        a(l0 l0Var, View view) {
            this.f1902a = l0Var;
            this.f1903b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1902a.a(this.f1903b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1902a.b(this.f1903b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1902a.c(this.f1903b);
        }
    }

    /* compiled from: MyApplication */
    static class b {
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    k0(View view) {
        this.f1898a = new WeakReference(view);
    }

    private void h(View view, l0 l0Var) {
        if (l0Var != null) {
            view.animate().setListener(new a(l0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public k0 b(float f8) {
        View view = (View) this.f1898a.get();
        if (view != null) {
            view.animate().alpha(f8);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f1898a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f1898a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public k0 e(long j7) {
        View view = (View) this.f1898a.get();
        if (view != null) {
            view.animate().setDuration(j7);
        }
        return this;
    }

    public k0 f(Interpolator interpolator) {
        View view = (View) this.f1898a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public k0 g(l0 l0Var) {
        View view = (View) this.f1898a.get();
        if (view != null) {
            h(view, l0Var);
        }
        return this;
    }

    public k0 i(long j7) {
        View view = (View) this.f1898a.get();
        if (view != null) {
            view.animate().setStartDelay(j7);
        }
        return this;
    }

    public k0 j(final n0 n0Var) {
        final View view = (View) this.f1898a.get();
        if (view != null) {
            b.a(view.animate(), n0Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.j0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    n0.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f1898a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public k0 l(float f8) {
        View view = (View) this.f1898a.get();
        if (view != null) {
            view.animate().translationY(f8);
        }
        return this;
    }
}
