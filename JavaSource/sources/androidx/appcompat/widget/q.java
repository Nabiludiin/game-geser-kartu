package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: MyApplication */
public class q {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f844a;

    /* renamed from: b, reason: collision with root package name */
    private p1 f845b;

    /* renamed from: c, reason: collision with root package name */
    private p1 f846c;

    /* renamed from: d, reason: collision with root package name */
    private p1 f847d;

    /* renamed from: e, reason: collision with root package name */
    private int f848e = 0;

    public q(ImageView imageView) {
        this.f844a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f847d == null) {
            this.f847d = new p1();
        }
        p1 p1Var = this.f847d;
        p1Var.a();
        ColorStateList a8 = androidx.core.widget.f.a(this.f844a);
        if (a8 != null) {
            p1Var.f843d = true;
            p1Var.f840a = a8;
        }
        PorterDuff.Mode b8 = androidx.core.widget.f.b(this.f844a);
        if (b8 != null) {
            p1Var.f842c = true;
            p1Var.f841b = b8;
        }
        if (!p1Var.f843d && !p1Var.f842c) {
            return false;
        }
        k.i(drawable, p1Var, this.f844a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f845b != null;
    }

    void b() {
        if (this.f844a.getDrawable() != null) {
            this.f844a.getDrawable().setLevel(this.f848e);
        }
    }

    void c() {
        Drawable drawable = this.f844a.getDrawable();
        if (drawable != null) {
            u0.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            p1 p1Var = this.f846c;
            if (p1Var != null) {
                k.i(drawable, p1Var, this.f844a.getDrawableState());
                return;
            }
            p1 p1Var2 = this.f845b;
            if (p1Var2 != null) {
                k.i(drawable, p1Var2, this.f844a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        p1 p1Var = this.f846c;
        if (p1Var != null) {
            return p1Var.f840a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        p1 p1Var = this.f846c;
        if (p1Var != null) {
            return p1Var.f841b;
        }
        return null;
    }

    boolean f() {
        return !(this.f844a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i7) {
        int m7;
        Context context = this.f844a.getContext();
        int[] iArr = f.j.P;
        r1 u7 = r1.u(context, attributeSet, iArr, i7, 0);
        ImageView imageView = this.f844a;
        androidx.core.view.e0.L(imageView, imageView.getContext(), iArr, attributeSet, u7.q(), i7, 0);
        try {
            Drawable drawable = this.f844a.getDrawable();
            if (drawable == null && (m7 = u7.m(f.j.Q, -1)) != -1 && (drawable = h.a.b(this.f844a.getContext(), m7)) != null) {
                this.f844a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                u0.b(drawable);
            }
            int i8 = f.j.R;
            if (u7.r(i8)) {
                androidx.core.widget.f.c(this.f844a, u7.c(i8));
            }
            int i9 = f.j.S;
            if (u7.r(i9)) {
                androidx.core.widget.f.d(this.f844a, u0.d(u7.j(i9, -1), null));
            }
            u7.v();
        } catch (Throwable th) {
            u7.v();
            throw th;
        }
    }

    void h(Drawable drawable) {
        this.f848e = drawable.getLevel();
    }

    public void i(int i7) {
        if (i7 != 0) {
            Drawable b8 = h.a.b(this.f844a.getContext(), i7);
            if (b8 != null) {
                u0.b(b8);
            }
            this.f844a.setImageDrawable(b8);
        } else {
            this.f844a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f846c == null) {
            this.f846c = new p1();
        }
        p1 p1Var = this.f846c;
        p1Var.f840a = colorStateList;
        p1Var.f843d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f846c == null) {
            this.f846c = new p1();
        }
        p1 p1Var = this.f846c;
        p1Var.f841b = mode;
        p1Var.f842c = true;
        c();
    }
}
