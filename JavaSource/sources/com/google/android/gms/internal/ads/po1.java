package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class po1 {

    /* renamed from: k, reason: collision with root package name */
    static final ImageView.ScaleType f13981k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    private final v2.p1 f13982a;

    /* renamed from: b, reason: collision with root package name */
    private final w03 f13983b;

    /* renamed from: c, reason: collision with root package name */
    private final un1 f13984c;

    /* renamed from: d, reason: collision with root package name */
    private final pn1 f13985d;

    /* renamed from: e, reason: collision with root package name */
    private final ep1 f13986e;

    /* renamed from: f, reason: collision with root package name */
    private final mp1 f13987f;

    /* renamed from: g, reason: collision with root package name */
    private final Executor f13988g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f13989h;

    /* renamed from: i, reason: collision with root package name */
    private final z10 f13990i;

    /* renamed from: j, reason: collision with root package name */
    private final mn1 f13991j;

    public po1(v2.p1 p1Var, w03 w03Var, un1 un1Var, pn1 pn1Var, ep1 ep1Var, mp1 mp1Var, Executor executor, Executor executor2, mn1 mn1Var) {
        this.f13982a = p1Var;
        this.f13983b = w03Var;
        this.f13990i = w03Var.f17964j;
        this.f13984c = un1Var;
        this.f13985d = pn1Var;
        this.f13986e = ep1Var;
        this.f13987f = mp1Var;
        this.f13988g = executor;
        this.f13989h = executor2;
        this.f13991j = mn1Var;
    }

    private static void h(RelativeLayout.LayoutParams layoutParams, int i7) {
        if (i7 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i7 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i7 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean i(ViewGroup viewGroup, boolean z7) {
        View j7 = z7 ? this.f13985d.j() : this.f13985d.k();
        if (j7 == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (j7.getParent() instanceof ViewGroup) {
            ((ViewGroup) j7.getParent()).removeView(j7);
        }
        viewGroup.addView(j7, ((Boolean) s2.b0.c().d(uy.f17202s4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void a(final op1 op1Var) {
        this.f13988g.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.oo1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                po1.this.f(op1Var);
            }
        });
    }

    public final void b(op1 op1Var) {
        ep1 ep1Var;
        if (op1Var == null || (ep1Var = this.f13986e) == null || op1Var.C1() == null || !this.f13984c.b()) {
            return;
        }
        try {
            op1Var.C1().addView(ep1Var.a());
        } catch (cs0 e8) {
            v2.n1.l("web view can not be obtained", e8);
        }
    }

    public final void c(op1 op1Var) {
        if (op1Var == null) {
            return;
        }
        Context context = op1Var.q5().getContext();
        if (v2.u0.i(context, this.f13984c.f16840a)) {
            if (!(context instanceof Activity)) {
                int i7 = v2.n1.f26802b;
                w2.p.a("Activity context is needed for policy validator.");
                return;
            }
            mp1 mp1Var = this.f13987f;
            if (mp1Var == null || op1Var.C1() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(mp1Var.a(op1Var.C1(), windowManager), v2.u0.k());
            } catch (cs0 e8) {
                v2.n1.l("web view can not be obtained", e8);
            }
        }
    }

    public final boolean d(ViewGroup viewGroup) {
        return i(viewGroup, true);
    }

    public final boolean e(ViewGroup viewGroup) {
        return i(viewGroup, false);
    }

    final /* synthetic */ void f(op1 op1Var) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        i20 a8;
        Drawable drawable;
        un1 un1Var = this.f13984c;
        if (un1Var.e() || un1Var.c()) {
            String[] strArr = {"1098", "3011"};
            for (int i7 = 0; i7 < 2; i7++) {
                View n02 = op1Var.n0(strArr[i7]);
                if (n02 instanceof ViewGroup) {
                    viewGroup = (ViewGroup) n02;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = op1Var.q5().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        pn1 pn1Var = this.f13985d;
        if (pn1Var.a() != null) {
            view = pn1Var.a();
            z10 z10Var = this.f13990i;
            if (z10Var != null && viewGroup == null) {
                h(layoutParams, z10Var.f19958u);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (pn1Var.m0() instanceof s10) {
            s10 s10Var = (s10) pn1Var.m0();
            if (viewGroup == null) {
                h(layoutParams, s10Var.j());
                viewGroup = null;
            }
            View t10Var = new t10(context, s10Var, layoutParams);
            t10Var.setContentDescription((CharSequence) s2.b0.c().d(uy.f17186q4));
            view = t10Var;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                n2.h hVar = new n2.h(op1Var.q5().getContext());
                hVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                hVar.addView(view);
                FrameLayout C1 = op1Var.C1();
                if (C1 != null) {
                    C1.addView(hVar);
                }
            }
            op1Var.D2(op1Var.o(), view, true);
        }
        w04 w04Var = lo1.E;
        int size = w04Var.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                viewGroup2 = null;
                break;
            }
            View n03 = op1Var.n0((String) w04Var.get(i8));
            i8++;
            if (n03 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) n03;
                break;
            }
        }
        this.f13989h.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.no1
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                po1.this.g(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (i(viewGroup2, true)) {
            if (pn1Var.t() != null) {
                pn1Var.t().M0(new mo1(op1Var, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) s2.b0.c().d(uy.bb)).booleanValue() && i(viewGroup2, false)) {
            if (pn1Var.u() != null) {
                pn1Var.u().M0(new mo1(op1Var, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View q52 = op1Var.q5();
        Context context2 = q52 != null ? q52.getContext() : null;
        if (context2 == null || (a8 = this.f13991j.a()) == null) {
            return;
        }
        try {
            w3.a f8 = a8.f();
            if (f8 == null || (drawable = (Drawable) w3.b.r0(f8)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            w3.a q7 = op1Var.q();
            if (q7 != null) {
                if (((Boolean) s2.b0.c().d(uy.K6)).booleanValue()) {
                    imageView.setScaleType((ImageView.ScaleType) w3.b.r0(q7));
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
            imageView.setScaleType(f13981k);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            int i9 = v2.n1.f26802b;
            w2.p.f("Could not get main image drawable");
        }
    }

    final /* synthetic */ void g(ViewGroup viewGroup) {
        pn1 pn1Var = this.f13985d;
        if (pn1Var.j() != null) {
            boolean z7 = viewGroup != null;
            if (pn1Var.k0() == 2 || pn1Var.k0() == 1) {
                this.f13982a.k(this.f13983b.f17961g, String.valueOf(pn1Var.k0()), z7);
            } else if (pn1Var.k0() == 6) {
                v2.p1 p1Var = this.f13982a;
                String str = this.f13983b.f17961g;
                p1Var.k(str, "2", z7);
                p1Var.k(str, "1", z7);
            }
        }
    }
}
