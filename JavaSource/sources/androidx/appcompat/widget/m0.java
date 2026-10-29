package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.h;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
class m0 {

    /* renamed from: a, reason: collision with root package name */
    private final TextView f775a;

    /* renamed from: b, reason: collision with root package name */
    private p1 f776b;

    /* renamed from: c, reason: collision with root package name */
    private p1 f777c;

    /* renamed from: d, reason: collision with root package name */
    private p1 f778d;

    /* renamed from: e, reason: collision with root package name */
    private p1 f779e;

    /* renamed from: f, reason: collision with root package name */
    private p1 f780f;

    /* renamed from: g, reason: collision with root package name */
    private p1 f781g;

    /* renamed from: h, reason: collision with root package name */
    private p1 f782h;

    /* renamed from: i, reason: collision with root package name */
    private final o0 f783i;

    /* renamed from: j, reason: collision with root package name */
    private int f784j = 0;

    /* renamed from: k, reason: collision with root package name */
    private int f785k = -1;

    /* renamed from: l, reason: collision with root package name */
    private Typeface f786l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f787m;

    /* compiled from: MyApplication */
    class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ TextView f792q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Typeface f793r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f794s;

        b(TextView textView, Typeface typeface, int i7) {
            this.f792q = textView;
            this.f793r = typeface;
            this.f794s = i7;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f792q.setTypeface(this.f793r, this.f794s);
        }
    }

    m0(TextView textView) {
        this.f775a = textView;
        this.f783i = new o0(textView);
    }

    private void B(int i7, float f8) {
        this.f783i.u(i7, f8);
    }

    private void C(Context context, r1 r1Var) {
        String n7;
        Typeface create;
        Typeface create2;
        this.f784j = r1Var.j(f.j.H2, this.f784j);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28) {
            int j7 = r1Var.j(f.j.J2, -1);
            this.f785k = j7;
            if (j7 != -1) {
                this.f784j &= 2;
            }
        }
        int i8 = f.j.I2;
        if (!r1Var.r(i8) && !r1Var.r(f.j.K2)) {
            int i9 = f.j.G2;
            if (r1Var.r(i9)) {
                this.f787m = false;
                int j8 = r1Var.j(i9, 1);
                if (j8 == 1) {
                    this.f786l = Typeface.SANS_SERIF;
                    return;
                } else if (j8 == 2) {
                    this.f786l = Typeface.SERIF;
                    return;
                } else {
                    if (j8 != 3) {
                        return;
                    }
                    this.f786l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f786l = null;
        int i10 = f.j.K2;
        if (r1Var.r(i10)) {
            i8 = i10;
        }
        int i11 = this.f785k;
        int i12 = this.f784j;
        if (!context.isRestricted()) {
            try {
                Typeface i13 = r1Var.i(i8, this.f784j, new a(i11, i12, new WeakReference(this.f775a)));
                if (i13 != null) {
                    if (i7 < 28 || this.f785k == -1) {
                        this.f786l = i13;
                    } else {
                        create2 = Typeface.create(Typeface.create(i13, 0), this.f785k, (this.f784j & 2) != 0);
                        this.f786l = create2;
                    }
                }
                this.f787m = this.f786l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f786l != null || (n7 = r1Var.n(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f785k == -1) {
            this.f786l = Typeface.create(n7, this.f784j);
        } else {
            create = Typeface.create(Typeface.create(n7, 0), this.f785k, (this.f784j & 2) != 0);
            this.f786l = create;
        }
    }

    private void a(Drawable drawable, p1 p1Var) {
        if (drawable == null || p1Var == null) {
            return;
        }
        k.i(drawable, p1Var, this.f775a.getDrawableState());
    }

    private static p1 d(Context context, k kVar, int i7) {
        ColorStateList f8 = kVar.f(context, i7);
        if (f8 == null) {
            return null;
        }
        p1 p1Var = new p1();
        p1Var.f843d = true;
        p1Var.f840a = f8;
        return p1Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f775a.getCompoundDrawablesRelative();
            TextView textView = this.f775a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f775a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f775a;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f775a.getCompoundDrawables();
        TextView textView3 = this.f775a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        p1 p1Var = this.f782h;
        this.f776b = p1Var;
        this.f777c = p1Var;
        this.f778d = p1Var;
        this.f779e = p1Var;
        this.f780f = p1Var;
        this.f781g = p1Var;
    }

    void A(int i7, float f8) {
        if (androidx.core.widget.b.f1986a || l()) {
            return;
        }
        B(i7, f8);
    }

    void b() {
        if (this.f776b != null || this.f777c != null || this.f778d != null || this.f779e != null) {
            Drawable[] compoundDrawables = this.f775a.getCompoundDrawables();
            a(compoundDrawables[0], this.f776b);
            a(compoundDrawables[1], this.f777c);
            a(compoundDrawables[2], this.f778d);
            a(compoundDrawables[3], this.f779e);
        }
        if (this.f780f == null && this.f781g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f775a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f780f);
        a(compoundDrawablesRelative[2], this.f781g);
    }

    void c() {
        this.f783i.a();
    }

    int e() {
        return this.f783i.g();
    }

    int f() {
        return this.f783i.h();
    }

    int g() {
        return this.f783i.i();
    }

    int[] h() {
        return this.f783i.j();
    }

    int i() {
        return this.f783i.k();
    }

    ColorStateList j() {
        p1 p1Var = this.f782h;
        if (p1Var != null) {
            return p1Var.f840a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        p1 p1Var = this.f782h;
        if (p1Var != null) {
            return p1Var.f841b;
        }
        return null;
    }

    boolean l() {
        return this.f783i.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.m0.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f787m) {
            this.f786l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (androidx.core.view.e0.A(textView)) {
                    textView.post(new b(textView, typeface, this.f784j));
                } else {
                    textView.setTypeface(typeface, this.f784j);
                }
            }
        }
    }

    void o(boolean z7, int i7, int i8, int i9, int i10) {
        if (androidx.core.widget.b.f1986a) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i7) {
        String n7;
        r1 s7 = r1.s(context, i7, f.j.E2);
        int i8 = f.j.M2;
        if (s7.r(i8)) {
            s(s7.a(i8, false));
        }
        int i9 = Build.VERSION.SDK_INT;
        int i10 = f.j.F2;
        if (s7.r(i10) && s7.e(i10, -1) == 0) {
            this.f775a.setTextSize(0, 0.0f);
        }
        C(context, s7);
        if (i9 >= 26) {
            int i11 = f.j.L2;
            if (s7.r(i11) && (n7 = s7.n(i11)) != null) {
                this.f775a.setFontVariationSettings(n7);
            }
        }
        s7.v();
        Typeface typeface = this.f786l;
        if (typeface != null) {
            this.f775a.setTypeface(typeface, this.f784j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        c0.c.f(editorInfo, textView.getText());
    }

    void s(boolean z7) {
        this.f775a.setAllCaps(z7);
    }

    void t(int i7, int i8, int i9, int i10) {
        this.f783i.q(i7, i8, i9, i10);
    }

    void u(int[] iArr, int i7) {
        this.f783i.r(iArr, i7);
    }

    void v(int i7) {
        this.f783i.s(i7);
    }

    void w(ColorStateList colorStateList) {
        if (this.f782h == null) {
            this.f782h = new p1();
        }
        p1 p1Var = this.f782h;
        p1Var.f840a = colorStateList;
        p1Var.f843d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f782h == null) {
            this.f782h = new p1();
        }
        p1 p1Var = this.f782h;
        p1Var.f841b = mode;
        p1Var.f842c = mode != null;
        z();
    }

    /* compiled from: MyApplication */
    class a extends h.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f788a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f789b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f790c;

        a(int i7, int i8, WeakReference weakReference) {
            this.f788a = i7;
            this.f789b = i8;
            this.f790c = weakReference;
        }

        @Override // androidx.core.content.res.h.e
        public void g(Typeface typeface) {
            int i7;
            if (Build.VERSION.SDK_INT >= 28 && (i7 = this.f788a) != -1) {
                typeface = Typeface.create(typeface, i7, (this.f789b & 2) != 0);
            }
            m0.this.n(this.f790c, typeface);
        }

        @Override // androidx.core.content.res.h.e
        public void f(int i7) {
        }
    }
}
