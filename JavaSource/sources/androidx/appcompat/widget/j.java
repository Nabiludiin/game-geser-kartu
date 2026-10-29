package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* compiled from: MyApplication */
class j {

    /* renamed from: a, reason: collision with root package name */
    private final CompoundButton f753a;

    /* renamed from: b, reason: collision with root package name */
    private ColorStateList f754b = null;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f755c = null;

    /* renamed from: d, reason: collision with root package name */
    private boolean f756d = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f757e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f758f;

    j(CompoundButton compoundButton) {
        this.f753a = compoundButton;
    }

    void a() {
        Drawable a8 = androidx.core.widget.d.a(this.f753a);
        if (a8 != null) {
            if (this.f756d || this.f757e) {
                Drawable mutate = androidx.core.graphics.drawable.a.p(a8).mutate();
                if (this.f756d) {
                    androidx.core.graphics.drawable.a.n(mutate, this.f754b);
                }
                if (this.f757e) {
                    androidx.core.graphics.drawable.a.o(mutate, this.f755c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(this.f753a.getDrawableState());
                }
                this.f753a.setButtonDrawable(mutate);
            }
        }
    }

    ColorStateList c() {
        return this.f754b;
    }

    PorterDuff.Mode d() {
        return this.f755c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005f A[Catch: all -> 0x0039, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0057, B:11:0x005f, B:12:0x0068, B:14:0x0070, B:21:0x003c, B:23:0x0044, B:25:0x004a), top: B:2:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #1 {all -> 0x0039, blocks: (B:3:0x001d, B:5:0x0025, B:8:0x002b, B:9:0x0057, B:11:0x005f, B:12:0x0068, B:14:0x0070, B:21:0x003c, B:23:0x0044, B:25:0x004a), top: B:2:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void e(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            android.widget.CompoundButton r0 = r10.f753a
            android.content.Context r0 = r0.getContext()
            int[] r3 = f.j.U0
            r8 = 0
            androidx.appcompat.widget.r1 r9 = androidx.appcompat.widget.r1.u(r0, r11, r3, r12, r8)
            android.widget.CompoundButton r1 = r10.f753a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r9.q()
            r7 = 0
            r4 = r11
            r6 = r12
            androidx.core.view.e0.L(r1, r2, r3, r4, r5, r6, r7)
            int r11 = f.j.W0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.r(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L3c
            int r11 = r9.m(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L3c
            android.widget.CompoundButton r12 = r10.f753a     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            android.graphics.drawable.Drawable r11 = h.a.b(r0, r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L39 android.content.res.Resources.NotFoundException -> L3c
            goto L57
        L39:
            r0 = move-exception
            r11 = r0
            goto L83
        L3c:
            int r11 = f.j.V0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.r(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L57
            int r11 = r9.m(r11, r8)     // Catch: java.lang.Throwable -> L39
            if (r11 == 0) goto L57
            android.widget.CompoundButton r12 = r10.f753a     // Catch: java.lang.Throwable -> L39
            android.content.Context r0 = r12.getContext()     // Catch: java.lang.Throwable -> L39
            android.graphics.drawable.Drawable r11 = h.a.b(r0, r11)     // Catch: java.lang.Throwable -> L39
            r12.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L39
        L57:
            int r11 = f.j.X0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.r(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L68
            android.widget.CompoundButton r12 = r10.f753a     // Catch: java.lang.Throwable -> L39
            android.content.res.ColorStateList r11 = r9.c(r11)     // Catch: java.lang.Throwable -> L39
            androidx.core.widget.d.b(r12, r11)     // Catch: java.lang.Throwable -> L39
        L68:
            int r11 = f.j.Y0     // Catch: java.lang.Throwable -> L39
            boolean r12 = r9.r(r11)     // Catch: java.lang.Throwable -> L39
            if (r12 == 0) goto L7f
            android.widget.CompoundButton r12 = r10.f753a     // Catch: java.lang.Throwable -> L39
            r0 = -1
            int r11 = r9.j(r11, r0)     // Catch: java.lang.Throwable -> L39
            r0 = 0
            android.graphics.PorterDuff$Mode r11 = androidx.appcompat.widget.u0.d(r11, r0)     // Catch: java.lang.Throwable -> L39
            androidx.core.widget.d.c(r12, r11)     // Catch: java.lang.Throwable -> L39
        L7f:
            r9.v()
            return
        L83:
            r9.v()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.e(android.util.AttributeSet, int):void");
    }

    void f() {
        if (this.f758f) {
            this.f758f = false;
        } else {
            this.f758f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f754b = colorStateList;
        this.f756d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f755c = mode;
        this.f757e = true;
        a();
    }

    int b(int i7) {
        return i7;
    }
}
