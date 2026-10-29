package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.core.os.c;
import androidx.fragment.app.w;

/* compiled from: MyApplication */
abstract class f {

    /* compiled from: MyApplication */
    class a implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f2249a;

        a(Fragment fragment) {
            this.f2249a = fragment;
        }

        @Override // androidx.core.os.c.b
        public void onCancel() {
            if (this.f2249a.o() != null) {
                View o7 = this.f2249a.o();
                this.f2249a.q1(null);
                o7.clearAnimation();
            }
            this.f2249a.s1(null);
        }
    }

    /* compiled from: MyApplication */
    class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2255a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2256b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f2257c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ w.g f2258d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f2259e;

        c(ViewGroup viewGroup, View view, Fragment fragment, w.g gVar, androidx.core.os.c cVar) {
            this.f2255a = viewGroup;
            this.f2256b = view;
            this.f2257c = fragment;
            this.f2258d = gVar;
            this.f2259e = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2255a.endViewTransition(this.f2256b);
            Animator p7 = this.f2257c.p();
            this.f2257c.s1(null);
            if (p7 == null || this.f2255a.indexOfChild(this.f2256b) >= 0) {
                return;
            }
            this.f2258d.a(this.f2257c, this.f2259e);
        }
    }

    static void a(Fragment fragment, d dVar, w.g gVar) {
        View view = fragment.X;
        ViewGroup viewGroup = fragment.W;
        viewGroup.startViewTransition(view);
        androidx.core.os.c cVar = new androidx.core.os.c();
        cVar.c(new a(fragment));
        gVar.b(fragment, cVar);
        if (dVar.f2260a != null) {
            e eVar = new e(dVar.f2260a, viewGroup, view);
            fragment.q1(fragment.X);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, cVar));
            fragment.X.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f2261b;
        fragment.s1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, cVar));
        animator.setTarget(fragment.X);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z7, boolean z8) {
        return z8 ? z7 ? fragment.H() : fragment.I() : z7 ? fragment.s() : fragment.w();
    }

    static d c(Context context, Fragment fragment, boolean z7, boolean z8) {
        int D = fragment.D();
        int b8 = b(fragment, z7, z8);
        fragment.r1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.W;
        if (viewGroup != null) {
            int i7 = k0.b.f24336c;
            if (viewGroup.getTag(i7) != null) {
                fragment.W.setTag(i7, null);
            }
        }
        ViewGroup viewGroup2 = fragment.W;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation m02 = fragment.m0(D, z7, b8);
        if (m02 != null) {
            return new d(m02);
        }
        Animator n02 = fragment.n0(D, z7, b8);
        if (n02 != null) {
            return new d(n02);
        }
        if (b8 == 0 && D != 0) {
            b8 = d(D, z7);
        }
        if (b8 != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(b8));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, b8);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                } catch (Resources.NotFoundException e8) {
                    throw e8;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, b8);
                if (loadAnimator != null) {
                    return new d(loadAnimator);
                }
            } catch (RuntimeException e9) {
                if (equals) {
                    throw e9;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, b8);
                if (loadAnimation2 != null) {
                    return new d(loadAnimation2);
                }
            }
        }
        return null;
    }

    private static int d(int i7, boolean z7) {
        if (i7 == 4097) {
            return z7 ? k0.a.f24332e : k0.a.f24333f;
        }
        if (i7 == 4099) {
            return z7 ? k0.a.f24330c : k0.a.f24331d;
        }
        if (i7 != 8194) {
            return -1;
        }
        return z7 ? k0.a.f24328a : k0.a.f24329b;
    }

    /* compiled from: MyApplication */
    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final Animation f2260a;

        /* renamed from: b, reason: collision with root package name */
        public final Animator f2261b;

        d(Animation animation) {
            this.f2260a = animation;
            this.f2261b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        d(Animator animator) {
            this.f2260a = null;
            this.f2261b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: MyApplication */
    static class e extends AnimationSet implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private final ViewGroup f2262q;

        /* renamed from: r, reason: collision with root package name */
        private final View f2263r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f2264s;

        /* renamed from: t, reason: collision with root package name */
        private boolean f2265t;

        /* renamed from: u, reason: collision with root package name */
        private boolean f2266u;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2266u = true;
            this.f2262q = viewGroup;
            this.f2263r = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation) {
            this.f2266u = true;
            if (this.f2264s) {
                return !this.f2265t;
            }
            if (!super.getTransformation(j7, transformation)) {
                this.f2264s = true;
                androidx.core.view.c0.a(this.f2262q, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2264s || !this.f2266u) {
                this.f2262q.endViewTransition(this.f2263r);
                this.f2265t = true;
            } else {
                this.f2266u = false;
                this.f2262q.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j7, Transformation transformation, float f8) {
            this.f2266u = true;
            if (this.f2264s) {
                return !this.f2265t;
            }
            if (!super.getTransformation(j7, transformation, f8)) {
                this.f2264s = true;
                androidx.core.view.c0.a(this.f2262q, this);
            }
            return true;
        }
    }

    /* compiled from: MyApplication */
    class b implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2250a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f2251b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ w.g f2252c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f2253d;

        /* compiled from: MyApplication */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f2251b.o() != null) {
                    b.this.f2251b.q1(null);
                    b bVar = b.this;
                    bVar.f2252c.a(bVar.f2251b, bVar.f2253d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, w.g gVar, androidx.core.os.c cVar) {
            this.f2250a = viewGroup;
            this.f2251b = fragment;
            this.f2252c = gVar;
            this.f2253d = cVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2250a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
