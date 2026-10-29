package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.j;

/* compiled from: MyApplication */
public class t1 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    Toolbar f866a;

    /* renamed from: b, reason: collision with root package name */
    private int f867b;

    /* renamed from: c, reason: collision with root package name */
    private View f868c;

    /* renamed from: d, reason: collision with root package name */
    private View f869d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f870e;

    /* renamed from: f, reason: collision with root package name */
    private Drawable f871f;

    /* renamed from: g, reason: collision with root package name */
    private Drawable f872g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f873h;

    /* renamed from: i, reason: collision with root package name */
    CharSequence f874i;

    /* renamed from: j, reason: collision with root package name */
    private CharSequence f875j;

    /* renamed from: k, reason: collision with root package name */
    private CharSequence f876k;

    /* renamed from: l, reason: collision with root package name */
    Window.Callback f877l;

    /* renamed from: m, reason: collision with root package name */
    boolean f878m;

    /* renamed from: n, reason: collision with root package name */
    private c f879n;

    /* renamed from: o, reason: collision with root package name */
    private int f880o;

    /* renamed from: p, reason: collision with root package name */
    private int f881p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f882q;

    /* compiled from: MyApplication */
    class a implements View.OnClickListener {

        /* renamed from: q, reason: collision with root package name */
        final l.a f883q;

        a() {
            this.f883q = new l.a(t1.this.f866a.getContext(), 0, R.id.home, 0, 0, t1.this.f874i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t1 t1Var = t1.this;
            Window.Callback callback = t1Var.f877l;
            if (callback == null || !t1Var.f878m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f883q);
        }
    }

    /* compiled from: MyApplication */
    class b extends androidx.core.view.m0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f885a = false;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f886b;

        b(int i7) {
            this.f886b = i7;
        }

        @Override // androidx.core.view.m0, androidx.core.view.l0
        public void a(View view) {
            this.f885a = true;
        }

        @Override // androidx.core.view.l0
        public void b(View view) {
            if (this.f885a) {
                return;
            }
            t1.this.f866a.setVisibility(this.f886b);
        }

        @Override // androidx.core.view.m0, androidx.core.view.l0
        public void c(View view) {
            t1.this.f866a.setVisibility(0);
        }
    }

    public t1(Toolbar toolbar, boolean z7) {
        this(toolbar, z7, f.h.f23428a, f.e.f23369n);
    }

    private void D(CharSequence charSequence) {
        this.f874i = charSequence;
        if ((this.f867b & 8) != 0) {
            this.f866a.setTitle(charSequence);
            if (this.f873h) {
                androidx.core.view.e0.P(this.f866a.getRootView(), charSequence);
            }
        }
    }

    private void E() {
        if ((this.f867b & 4) != 0) {
            if (TextUtils.isEmpty(this.f876k)) {
                this.f866a.setNavigationContentDescription(this.f881p);
            } else {
                this.f866a.setNavigationContentDescription(this.f876k);
            }
        }
    }

    private void F() {
        if ((this.f867b & 4) == 0) {
            this.f866a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f866a;
        Drawable drawable = this.f872g;
        if (drawable == null) {
            drawable = this.f882q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void G() {
        Drawable drawable;
        int i7 = this.f867b;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) != 0) {
            drawable = this.f871f;
            if (drawable == null) {
                drawable = this.f870e;
            }
        } else {
            drawable = this.f870e;
        }
        this.f866a.setLogo(drawable);
    }

    private int u() {
        if (this.f866a.getNavigationIcon() == null) {
            return 11;
        }
        this.f882q = this.f866a.getNavigationIcon();
        return 15;
    }

    public void A(Drawable drawable) {
        this.f872g = drawable;
        F();
    }

    public void B(CharSequence charSequence) {
        this.f875j = charSequence;
        if ((this.f867b & 8) != 0) {
            this.f866a.setSubtitle(charSequence);
        }
    }

    public void C(CharSequence charSequence) {
        this.f873h = true;
        D(charSequence);
    }

    @Override // androidx.appcompat.widget.t0
    public void a(Menu menu, j.a aVar) {
        if (this.f879n == null) {
            c cVar = new c(this.f866a.getContext());
            this.f879n = cVar;
            cVar.p(f.f.f23388g);
        }
        this.f879n.g(aVar);
        this.f866a.K((androidx.appcompat.view.menu.e) menu, this.f879n);
    }

    @Override // androidx.appcompat.widget.t0
    public boolean b() {
        return this.f866a.B();
    }

    @Override // androidx.appcompat.widget.t0
    public void c() {
        this.f878m = true;
    }

    @Override // androidx.appcompat.widget.t0
    public void collapseActionView() {
        this.f866a.e();
    }

    @Override // androidx.appcompat.widget.t0
    public boolean d() {
        return this.f866a.d();
    }

    @Override // androidx.appcompat.widget.t0
    public boolean e() {
        return this.f866a.A();
    }

    @Override // androidx.appcompat.widget.t0
    public boolean f() {
        return this.f866a.w();
    }

    @Override // androidx.appcompat.widget.t0
    public boolean g() {
        return this.f866a.P();
    }

    @Override // androidx.appcompat.widget.t0
    public Context getContext() {
        return this.f866a.getContext();
    }

    @Override // androidx.appcompat.widget.t0
    public CharSequence getTitle() {
        return this.f866a.getTitle();
    }

    @Override // androidx.appcompat.widget.t0
    public void h() {
        this.f866a.f();
    }

    @Override // androidx.appcompat.widget.t0
    public void i(j1 j1Var) {
        View view = this.f868c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f866a;
            if (parent == toolbar) {
                toolbar.removeView(this.f868c);
            }
        }
        this.f868c = j1Var;
    }

    @Override // androidx.appcompat.widget.t0
    public boolean j() {
        return this.f866a.v();
    }

    @Override // androidx.appcompat.widget.t0
    public void k(int i7) {
        View view;
        int i8 = this.f867b ^ i7;
        this.f867b = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    E();
                }
                F();
            }
            if ((i8 & 3) != 0) {
                G();
            }
            if ((i8 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    this.f866a.setTitle(this.f874i);
                    this.f866a.setSubtitle(this.f875j);
                } else {
                    this.f866a.setTitle((CharSequence) null);
                    this.f866a.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) == 0 || (view = this.f869d) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                this.f866a.addView(view);
            } else {
                this.f866a.removeView(view);
            }
        }
    }

    @Override // androidx.appcompat.widget.t0
    public void l(int i7) {
        x(i7 != 0 ? h.a.b(getContext(), i7) : null);
    }

    @Override // androidx.appcompat.widget.t0
    public int m() {
        return this.f880o;
    }

    @Override // androidx.appcompat.widget.t0
    public androidx.core.view.k0 n(int i7, long j7) {
        return androidx.core.view.e0.c(this.f866a).b(i7 == 0 ? 1.0f : 0.0f).e(j7).g(new b(i7));
    }

    @Override // androidx.appcompat.widget.t0
    public void o(int i7) {
        this.f866a.setVisibility(i7);
    }

    @Override // androidx.appcompat.widget.t0
    public int q() {
        return this.f867b;
    }

    @Override // androidx.appcompat.widget.t0
    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.t0
    public void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.t0
    public void setIcon(int i7) {
        setIcon(i7 != 0 ? h.a.b(getContext(), i7) : null);
    }

    @Override // androidx.appcompat.widget.t0
    public void setWindowCallback(Window.Callback callback) {
        this.f877l = callback;
    }

    @Override // androidx.appcompat.widget.t0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f873h) {
            return;
        }
        D(charSequence);
    }

    @Override // androidx.appcompat.widget.t0
    public void t(boolean z7) {
        this.f866a.setCollapsible(z7);
    }

    public void v(View view) {
        View view2 = this.f869d;
        if (view2 != null && (this.f867b & 16) != 0) {
            this.f866a.removeView(view2);
        }
        this.f869d = view;
        if (view == null || (this.f867b & 16) == 0) {
            return;
        }
        this.f866a.addView(view);
    }

    public void w(int i7) {
        if (i7 == this.f881p) {
            return;
        }
        this.f881p = i7;
        if (TextUtils.isEmpty(this.f866a.getNavigationContentDescription())) {
            y(this.f881p);
        }
    }

    public void x(Drawable drawable) {
        this.f871f = drawable;
        G();
    }

    public void y(int i7) {
        z(i7 == 0 ? null : getContext().getString(i7));
    }

    public void z(CharSequence charSequence) {
        this.f876k = charSequence;
        E();
    }

    public t1(Toolbar toolbar, boolean z7, int i7, int i8) {
        Drawable drawable;
        this.f880o = 0;
        this.f881p = 0;
        this.f866a = toolbar;
        this.f874i = toolbar.getTitle();
        this.f875j = toolbar.getSubtitle();
        this.f873h = this.f874i != null;
        this.f872g = toolbar.getNavigationIcon();
        r1 u7 = r1.u(toolbar.getContext(), null, f.j.f23444a, f.a.f23310c, 0);
        this.f882q = u7.f(f.j.f23499l);
        if (z7) {
            CharSequence o7 = u7.o(f.j.f23529r);
            if (!TextUtils.isEmpty(o7)) {
                C(o7);
            }
            CharSequence o8 = u7.o(f.j.f23519p);
            if (!TextUtils.isEmpty(o8)) {
                B(o8);
            }
            Drawable f8 = u7.f(f.j.f23509n);
            if (f8 != null) {
                x(f8);
            }
            Drawable f9 = u7.f(f.j.f23504m);
            if (f9 != null) {
                setIcon(f9);
            }
            if (this.f872g == null && (drawable = this.f882q) != null) {
                A(drawable);
            }
            k(u7.j(f.j.f23479h, 0));
            int m7 = u7.m(f.j.f23474g, 0);
            if (m7 != 0) {
                v(LayoutInflater.from(this.f866a.getContext()).inflate(m7, (ViewGroup) this.f866a, false));
                k(this.f867b | 16);
            }
            int l7 = u7.l(f.j.f23489j, 0);
            if (l7 > 0) {
                ViewGroup.LayoutParams layoutParams = this.f866a.getLayoutParams();
                layoutParams.height = l7;
                this.f866a.setLayoutParams(layoutParams);
            }
            int d8 = u7.d(f.j.f23469f, -1);
            int d9 = u7.d(f.j.f23464e, -1);
            if (d8 >= 0 || d9 >= 0) {
                this.f866a.J(Math.max(d8, 0), Math.max(d9, 0));
            }
            int m8 = u7.m(f.j.f23534s, 0);
            if (m8 != 0) {
                Toolbar toolbar2 = this.f866a;
                toolbar2.M(toolbar2.getContext(), m8);
            }
            int m9 = u7.m(f.j.f23524q, 0);
            if (m9 != 0) {
                Toolbar toolbar3 = this.f866a;
                toolbar3.L(toolbar3.getContext(), m9);
            }
            int m10 = u7.m(f.j.f23514o, 0);
            if (m10 != 0) {
                this.f866a.setPopupTheme(m10);
            }
        } else {
            this.f867b = u();
        }
        u7.v();
        w(i7);
        this.f876k = this.f866a.getNavigationContentDescription();
        this.f866a.setNavigationOnClickListener(new a());
    }

    @Override // androidx.appcompat.widget.t0
    public void setIcon(Drawable drawable) {
        this.f870e = drawable;
        G();
    }

    @Override // androidx.appcompat.widget.t0
    public void p(boolean z7) {
    }
}
