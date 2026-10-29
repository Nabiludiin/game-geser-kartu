package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* compiled from: MyApplication */
class y extends t {

    /* renamed from: d, reason: collision with root package name */
    private final SeekBar f939d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f940e;

    /* renamed from: f, reason: collision with root package name */
    private ColorStateList f941f;

    /* renamed from: g, reason: collision with root package name */
    private PorterDuff.Mode f942g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f943h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f944i;

    y(SeekBar seekBar) {
        super(seekBar);
        this.f941f = null;
        this.f942g = null;
        this.f943h = false;
        this.f944i = false;
        this.f939d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f940e;
        if (drawable != null) {
            if (this.f943h || this.f944i) {
                Drawable p7 = androidx.core.graphics.drawable.a.p(drawable.mutate());
                this.f940e = p7;
                if (this.f943h) {
                    androidx.core.graphics.drawable.a.n(p7, this.f941f);
                }
                if (this.f944i) {
                    androidx.core.graphics.drawable.a.o(this.f940e, this.f942g);
                }
                if (this.f940e.isStateful()) {
                    this.f940e.setState(this.f939d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.t
    void c(AttributeSet attributeSet, int i7) {
        super.c(attributeSet, i7);
        Context context = this.f939d.getContext();
        int[] iArr = f.j.T;
        r1 u7 = r1.u(context, attributeSet, iArr, i7, 0);
        SeekBar seekBar = this.f939d;
        androidx.core.view.e0.L(seekBar, seekBar.getContext(), iArr, attributeSet, u7.q(), i7, 0);
        Drawable g8 = u7.g(f.j.U);
        if (g8 != null) {
            this.f939d.setThumb(g8);
        }
        j(u7.f(f.j.V));
        int i8 = f.j.X;
        if (u7.r(i8)) {
            this.f942g = u0.d(u7.j(i8, -1), this.f942g);
            this.f944i = true;
        }
        int i9 = f.j.W;
        if (u7.r(i9)) {
            this.f941f = u7.c(i9);
            this.f943h = true;
        }
        u7.v();
        f();
    }

    void g(Canvas canvas) {
        if (this.f940e != null) {
            int max = this.f939d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f940e.getIntrinsicWidth();
                int intrinsicHeight = this.f940e.getIntrinsicHeight();
                int i7 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i8 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f940e.setBounds(-i7, -i8, i7, i8);
                float width = ((this.f939d.getWidth() - this.f939d.getPaddingLeft()) - this.f939d.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(this.f939d.getPaddingLeft(), this.f939d.getHeight() / 2);
                for (int i9 = 0; i9 <= max; i9++) {
                    this.f940e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    void h() {
        Drawable drawable = this.f940e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f939d.getDrawableState())) {
            this.f939d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f940e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f940e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f940e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f939d);
            androidx.core.graphics.drawable.a.l(drawable, androidx.core.view.e0.r(this.f939d));
            if (drawable.isStateful()) {
                drawable.setState(this.f939d.getDrawableState());
            }
            f();
        }
        this.f939d.invalidate();
    }
}
