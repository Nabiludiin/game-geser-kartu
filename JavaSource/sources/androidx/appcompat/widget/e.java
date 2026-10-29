package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: MyApplication */
class e {

    /* renamed from: a, reason: collision with root package name */
    private final View f708a;

    /* renamed from: d, reason: collision with root package name */
    private p1 f711d;

    /* renamed from: e, reason: collision with root package name */
    private p1 f712e;

    /* renamed from: f, reason: collision with root package name */
    private p1 f713f;

    /* renamed from: c, reason: collision with root package name */
    private int f710c = -1;

    /* renamed from: b, reason: collision with root package name */
    private final k f709b = k.b();

    e(View view) {
        this.f708a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f713f == null) {
            this.f713f = new p1();
        }
        p1 p1Var = this.f713f;
        p1Var.a();
        ColorStateList n7 = androidx.core.view.e0.n(this.f708a);
        if (n7 != null) {
            p1Var.f843d = true;
            p1Var.f840a = n7;
        }
        PorterDuff.Mode o7 = androidx.core.view.e0.o(this.f708a);
        if (o7 != null) {
            p1Var.f842c = true;
            p1Var.f841b = o7;
        }
        if (!p1Var.f843d && !p1Var.f842c) {
            return false;
        }
        k.i(drawable, p1Var, this.f708a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f711d != null;
    }

    void b() {
        Drawable background = this.f708a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            p1 p1Var = this.f712e;
            if (p1Var != null) {
                k.i(background, p1Var, this.f708a.getDrawableState());
                return;
            }
            p1 p1Var2 = this.f711d;
            if (p1Var2 != null) {
                k.i(background, p1Var2, this.f708a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        p1 p1Var = this.f712e;
        if (p1Var != null) {
            return p1Var.f840a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        p1 p1Var = this.f712e;
        if (p1Var != null) {
            return p1Var.f841b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i7) {
        Context context = this.f708a.getContext();
        int[] iArr = f.j.f23553v3;
        r1 u7 = r1.u(context, attributeSet, iArr, i7, 0);
        View view = this.f708a;
        androidx.core.view.e0.L(view, view.getContext(), iArr, attributeSet, u7.q(), i7, 0);
        try {
            int i8 = f.j.f23558w3;
            if (u7.r(i8)) {
                this.f710c = u7.m(i8, -1);
                ColorStateList f8 = this.f709b.f(this.f708a.getContext(), this.f710c);
                if (f8 != null) {
                    h(f8);
                }
            }
            int i9 = f.j.f23563x3;
            if (u7.r(i9)) {
                androidx.core.view.e0.R(this.f708a, u7.c(i9));
            }
            int i10 = f.j.f23568y3;
            if (u7.r(i10)) {
                androidx.core.view.e0.S(this.f708a, u0.d(u7.j(i10, -1), null));
            }
            u7.v();
        } catch (Throwable th) {
            u7.v();
            throw th;
        }
    }

    void f(Drawable drawable) {
        this.f710c = -1;
        h(null);
        b();
    }

    void g(int i7) {
        this.f710c = i7;
        k kVar = this.f709b;
        h(kVar != null ? kVar.f(this.f708a.getContext(), i7) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f711d == null) {
                this.f711d = new p1();
            }
            p1 p1Var = this.f711d;
            p1Var.f840a = colorStateList;
            p1Var.f843d = true;
        } else {
            this.f711d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f712e == null) {
            this.f712e = new p1();
        }
        p1 p1Var = this.f712e;
        p1Var.f840a = colorStateList;
        p1Var.f843d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f712e == null) {
            this.f712e = new p1();
        }
        p1 p1Var = this.f712e;
        p1Var.f841b = mode;
        p1Var.f842c = true;
        b();
    }
}
