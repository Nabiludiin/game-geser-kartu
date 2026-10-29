package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CheckedTextView;

/* compiled from: MyApplication */
class i {

    /* renamed from: a, reason: collision with root package name */
    private final CheckedTextView f739a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f740b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f741c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f742d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f743e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f744f;

    i(CheckedTextView checkedTextView) {
        this.f739a = checkedTextView;
    }

    void a() {
        Drawable a8 = androidx.core.widget.c.a(this.f739a);
        if (a8 != null) {
            if (this.f742d || this.f743e) {
                Drawable mutate = androidx.core.graphics.drawable.a.p(a8).mutate();
                if (this.f742d) {
                    androidx.core.graphics.drawable.a.n(mutate, this.f740b);
                }
                if (this.f743e) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f741c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f739a.getDrawableState());
                }
                this.f739a.setCheckMarkDrawable(mutate);
            }
        }
    }

    ColorStateList b() {
        return this.f740b;
    }

    PorterDuff.Mode c() {
        return this.f741c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0057, B:11:0x005f, B:12:0x0068, B:14:0x0070, B:21:0x003c, B:23:0x0044, B:25:0x004a), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0057, B:11:0x005f, B:12:0x0068, B:14:0x0070, B:21:0x003c, B:23:0x0044, B:25:0x004a), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void d(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CheckedTextView r0 = r10.f739a
            android.content.Context r0 = r0.getContext()
            int[] r3 = f.j.P0
            r8 = 0
            androidx.appcompat.widget.r1 r9 = androidx.appcompat.widget.r1.u(r0, r11, r3, r12, r8)
            android.widget.CheckedTextView r1 = r10.f739a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r9.q()
            r7 = 0
            r4 = r11
            r6 = r12
            androidx.core.view.e0.L(r1, r2, r3, r4, r5, r6, r7)
            int r11 = f.j.R0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.r(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L3c
            int r11 = r9.m(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L3c
            android.widget.CheckedTextView r12 = r10.f739a     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.graphics.drawable.Drawable r11 = h.a.b(r0, r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            goto L57
        L39:
            r0 = move-exception
            r11 = r0
            goto L83
        L3c:
            int r11 = f.j.Q0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.r(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L57
            int r11 = r9.m(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L57
            android.widget.CheckedTextView r12 = r10.f739a     // Catch: java.lang.Throwable -> L39
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39
            android.graphics.drawable.Drawable r11 = h.a.b(r0, r11)     // Catch: java.lang.Throwable -> L39
            r12.setCheckMarkDrawable(r11)     // Catch: java.lang.Throwable -> L39
        L57:
            int r11 = f.j.S0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.r(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L68
            android.widget.CheckedTextView r12 = r10.f739a     // Catch: java.lang.Throwable -> L39
            android.content.res.ColorStateList r11 = r9.c(r11)     // Catch: java.lang.Throwable -> L39
            androidx.core.widget.c.b(r12, r11)     // Catch: java.lang.Throwable -> L39
        L68:
            int r11 = f.j.T0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.r(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L7f
            android.widget.CheckedTextView r12 = r10.f739a     // Catch: java.lang.Throwable -> L39
            r0 = -1
            int r11 = r9.j(r11, r0)     // Catch: java.lang.Throwable -> L39
            r0 = 0
            android.graphics.PorterDuff$Mode r11 = androidx.appcompat.widget.u0.d(r11, r0)     // Catch: java.lang.Throwable -> L39
            androidx.core.widget.c.c(r12, r11)     // Catch: java.lang.Throwable -> L39
        L7f:
            r9.v()
            return
        L83:
            r9.v()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.d(android.util.AttributeSet, int):void");
    }

    void e() {
        if (this.f744f) {
            this.f744f = false;
        } else {
            this.f744f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f740b = colorStateList;
        this.f742d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f741c = mode;
        this.f743e = true;
        a();
    }
}
