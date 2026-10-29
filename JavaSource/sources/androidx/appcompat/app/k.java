package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.t0;
import androidx.core.view.e0;
import androidx.core.view.k0;
import androidx.core.view.l0;
import androidx.core.view.m0;
import androidx.core.view.n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import k.b;

/* compiled from: MyApplication */
public class k extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {
    private static final Interpolator D = new AccelerateInterpolator();
    private static final Interpolator E = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    Context f353a;

    /* renamed from: b, reason: collision with root package name */
    private Context f354b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f355c;

    /* renamed from: d, reason: collision with root package name */
    ActionBarOverlayLayout f356d;

    /* renamed from: e, reason: collision with root package name */
    ActionBarContainer f357e;

    /* renamed from: f, reason: collision with root package name */
    t0 f358f;

    /* renamed from: g, reason: collision with root package name */
    ActionBarContextView f359g;

    /* renamed from: h, reason: collision with root package name */
    View f360h;

    /* renamed from: k, reason: collision with root package name */
    private boolean f363k;

    /* renamed from: l, reason: collision with root package name */
    d f364l;

    /* renamed from: m, reason: collision with root package name */
    k.b f365m;

    /* renamed from: n, reason: collision with root package name */
    b.a f366n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f367o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f369q;

    /* renamed from: t, reason: collision with root package name */
    boolean f372t;

    /* renamed from: u, reason: collision with root package name */
    boolean f373u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f374v;

    /* renamed from: x, reason: collision with root package name */
    k.h f376x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f377y;

    /* renamed from: z, reason: collision with root package name */
    boolean f378z;

    /* renamed from: i, reason: collision with root package name */
    private ArrayList f361i = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    private int f362j = -1;

    /* renamed from: p, reason: collision with root package name */
    private ArrayList f368p = new ArrayList();

    /* renamed from: r, reason: collision with root package name */
    private int f370r = 0;

    /* renamed from: s, reason: collision with root package name */
    boolean f371s = true;

    /* renamed from: w, reason: collision with root package name */
    private boolean f375w = true;
    final l0 A = new a();
    final l0 B = new b();
    final n0 C = new c();

    /* compiled from: MyApplication */
    class a extends m0 {
        a() {
        }

        @Override // androidx.core.view.l0
        public void b(View view) {
            View view2;
            k kVar = k.this;
            if (kVar.f371s && (view2 = kVar.f360h) != null) {
                view2.setTranslationY(0.0f);
                k.this.f357e.setTranslationY(0.0f);
            }
            k.this.f357e.setVisibility(8);
            k.this.f357e.setTransitioning(false);
            k kVar2 = k.this;
            kVar2.f376x = null;
            kVar2.w();
            ActionBarOverlayLayout actionBarOverlayLayout = k.this.f356d;
            if (actionBarOverlayLayout != null) {
                e0.K(actionBarOverlayLayout);
            }
        }
    }

    /* compiled from: MyApplication */
    class b extends m0 {
        b() {
        }

        @Override // androidx.core.view.l0
        public void b(View view) {
            k kVar = k.this;
            kVar.f376x = null;
            kVar.f357e.requestLayout();
        }
    }

    /* compiled from: MyApplication */
    class c implements n0 {
        c() {
        }

        @Override // androidx.core.view.n0
        public void a(View view) {
            ((View) k.this.f357e.getParent()).invalidate();
        }
    }

    /* compiled from: MyApplication */
    public class d extends k.b implements e.a {

        /* renamed from: s, reason: collision with root package name */
        private final Context f382s;

        /* renamed from: t, reason: collision with root package name */
        private final androidx.appcompat.view.menu.e f383t;

        /* renamed from: u, reason: collision with root package name */
        private b.a f384u;

        /* renamed from: v, reason: collision with root package name */
        private WeakReference f385v;

        public d(Context context, b.a aVar) {
            this.f382s = context;
            this.f384u = aVar;
            androidx.appcompat.view.menu.e S = new androidx.appcompat.view.menu.e(context).S(1);
            this.f383t = S;
            S.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            b.a aVar = this.f384u;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f384u == null) {
                return;
            }
            k();
            k.this.f359g.l();
        }

        @Override // k.b
        public void c() {
            k kVar = k.this;
            if (kVar.f364l != this) {
                return;
            }
            if (k.v(kVar.f372t, kVar.f373u, false)) {
                this.f384u.d(this);
            } else {
                k kVar2 = k.this;
                kVar2.f365m = this;
                kVar2.f366n = this.f384u;
            }
            this.f384u = null;
            k.this.u(false);
            k.this.f359g.g();
            k kVar3 = k.this;
            kVar3.f356d.setHideOnContentScrollEnabled(kVar3.f378z);
            k.this.f364l = null;
        }

        @Override // k.b
        public View d() {
            WeakReference weakReference = this.f385v;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // k.b
        public Menu e() {
            return this.f383t;
        }

        @Override // k.b
        public MenuInflater f() {
            return new k.g(this.f382s);
        }

        @Override // k.b
        public CharSequence g() {
            return k.this.f359g.getSubtitle();
        }

        @Override // k.b
        public CharSequence i() {
            return k.this.f359g.getTitle();
        }

        @Override // k.b
        public void k() {
            if (k.this.f364l != this) {
                return;
            }
            this.f383t.d0();
            try {
                this.f384u.c(this, this.f383t);
            } finally {
                this.f383t.c0();
            }
        }

        @Override // k.b
        public boolean l() {
            return k.this.f359g.j();
        }

        @Override // k.b
        public void m(View view) {
            k.this.f359g.setCustomView(view);
            this.f385v = new WeakReference(view);
        }

        @Override // k.b
        public void n(int i7) {
            o(k.this.f353a.getResources().getString(i7));
        }

        @Override // k.b
        public void o(CharSequence charSequence) {
            k.this.f359g.setSubtitle(charSequence);
        }

        @Override // k.b
        public void q(int i7) {
            r(k.this.f353a.getResources().getString(i7));
        }

        @Override // k.b
        public void r(CharSequence charSequence) {
            k.this.f359g.setTitle(charSequence);
        }

        @Override // k.b
        public void s(boolean z7) {
            super.s(z7);
            k.this.f359g.setTitleOptional(z7);
        }

        public boolean t() {
            this.f383t.d0();
            try {
                return this.f384u.b(this, this.f383t);
            } finally {
                this.f383t.c0();
            }
        }
    }

    public k(Activity activity, boolean z7) {
        this.f355c = activity;
        View decorView = activity.getWindow().getDecorView();
        C(decorView);
        if (z7) {
            return;
        }
        this.f360h = decorView.findViewById(R.id.content);
    }

    private void B() {
        if (this.f374v) {
            this.f374v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f356d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            L(false);
        }
    }

    private void C(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.f.f23397p);
        this.f356d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f358f = z(view.findViewById(f.f.f23382a));
        this.f359g = (ActionBarContextView) view.findViewById(f.f.f23387f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.f.f23384c);
        this.f357e = actionBarContainer;
        t0 t0Var = this.f358f;
        if (t0Var == null || this.f359g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f353a = t0Var.getContext();
        boolean z7 = (this.f358f.q() & 4) != 0;
        if (z7) {
            this.f363k = true;
        }
        k.a b8 = k.a.b(this.f353a);
        I(b8.a() || z7);
        G(b8.e());
        TypedArray obtainStyledAttributes = this.f353a.obtainStyledAttributes(null, f.j.f23444a, f.a.f23310c, 0);
        if (obtainStyledAttributes.getBoolean(f.j.f23494k, false)) {
            H(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(f.j.f23484i, 0);
        if (dimensionPixelSize != 0) {
            F(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    private void G(boolean z7) {
        this.f369q = z7;
        if (z7) {
            this.f357e.setTabContainer(null);
            this.f358f.i(null);
        } else {
            this.f358f.i(null);
            this.f357e.setTabContainer(null);
        }
        boolean z8 = false;
        boolean z9 = A() == 2;
        this.f358f.t(!this.f369q && z9);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f356d;
        if (!this.f369q && z9) {
            z8 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z8);
    }

    private boolean J() {
        return e0.B(this.f357e);
    }

    private void K() {
        if (this.f374v) {
            return;
        }
        this.f374v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f356d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        L(false);
    }

    private void L(boolean z7) {
        if (v(this.f372t, this.f373u, this.f374v)) {
            if (this.f375w) {
                return;
            }
            this.f375w = true;
            y(z7);
            return;
        }
        if (this.f375w) {
            this.f375w = false;
            x(z7);
        }
    }

    static boolean v(boolean z7, boolean z8, boolean z9) {
        if (z9) {
            return true;
        }
        return (z7 || z8) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private t0 z(View view) {
        if (view instanceof t0) {
            return (t0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public int A() {
        return this.f358f.m();
    }

    public void D(boolean z7) {
        E(z7 ? 4 : 0, 4);
    }

    public void E(int i7, int i8) {
        int q7 = this.f358f.q();
        if ((i8 & 4) != 0) {
            this.f363k = true;
        }
        this.f358f.k((i7 & i8) | ((~i8) & q7));
    }

    public void F(float f8) {
        e0.T(this.f357e, f8);
    }

    public void H(boolean z7) {
        if (z7 && !this.f356d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f378z = z7;
        this.f356d.setHideOnContentScrollEnabled(z7);
    }

    public void I(boolean z7) {
        this.f358f.p(z7);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f373u) {
            this.f373u = false;
            L(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z7) {
        this.f371s = z7;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f373u) {
            return;
        }
        this.f373u = true;
        L(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        k.h hVar = this.f376x;
        if (hVar != null) {
            hVar.a();
            this.f376x = null;
        }
    }

    @Override // androidx.appcompat.app.a
    public boolean g() {
        t0 t0Var = this.f358f;
        if (t0Var == null || !t0Var.j()) {
            return false;
        }
        this.f358f.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void h(boolean z7) {
        if (z7 == this.f367o) {
            return;
        }
        this.f367o = z7;
        if (this.f368p.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f368p.get(0));
        throw null;
    }

    @Override // androidx.appcompat.app.a
    public int i() {
        return this.f358f.q();
    }

    @Override // androidx.appcompat.app.a
    public Context j() {
        if (this.f354b == null) {
            TypedValue typedValue = new TypedValue();
            this.f353a.getTheme().resolveAttribute(f.a.f23312e, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                this.f354b = new ContextThemeWrapper(this.f353a, i7);
            } else {
                this.f354b = this.f353a;
            }
        }
        return this.f354b;
    }

    @Override // androidx.appcompat.app.a
    public void l(Configuration configuration) {
        G(k.a.b(this.f353a).e());
    }

    @Override // androidx.appcompat.app.a
    public boolean n(int i7, KeyEvent keyEvent) {
        Menu e8;
        d dVar = this.f364l;
        if (dVar == null || (e8 = dVar.e()) == null) {
            return false;
        }
        e8.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return e8.performShortcut(i7, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i7) {
        this.f370r = i7;
    }

    @Override // androidx.appcompat.app.a
    public void q(boolean z7) {
        if (this.f363k) {
            return;
        }
        D(z7);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z7) {
        k.h hVar;
        this.f377y = z7;
        if (z7 || (hVar = this.f376x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void s(CharSequence charSequence) {
        this.f358f.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public k.b t(b.a aVar) {
        d dVar = this.f364l;
        if (dVar != null) {
            dVar.c();
        }
        this.f356d.setHideOnContentScrollEnabled(false);
        this.f359g.k();
        d dVar2 = new d(this.f359g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f364l = dVar2;
        dVar2.k();
        this.f359g.h(dVar2);
        u(true);
        return dVar2;
    }

    public void u(boolean z7) {
        k0 n7;
        k0 f8;
        if (z7) {
            K();
        } else {
            B();
        }
        if (!J()) {
            if (z7) {
                this.f358f.o(4);
                this.f359g.setVisibility(0);
                return;
            } else {
                this.f358f.o(0);
                this.f359g.setVisibility(8);
                return;
            }
        }
        if (z7) {
            f8 = this.f358f.n(4, 100L);
            n7 = this.f359g.f(0, 200L);
        } else {
            n7 = this.f358f.n(0, 200L);
            f8 = this.f359g.f(8, 100L);
        }
        k.h hVar = new k.h();
        hVar.d(f8, n7);
        hVar.h();
    }

    void w() {
        b.a aVar = this.f366n;
        if (aVar != null) {
            aVar.d(this.f365m);
            this.f365m = null;
            this.f366n = null;
        }
    }

    public void x(boolean z7) {
        View view;
        k.h hVar = this.f376x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f370r != 0 || (!this.f377y && !z7)) {
            this.A.b(null);
            return;
        }
        this.f357e.setAlpha(1.0f);
        this.f357e.setTransitioning(true);
        k.h hVar2 = new k.h();
        float f8 = -this.f357e.getHeight();
        if (z7) {
            this.f357e.getLocationInWindow(new int[]{0, 0});
            f8 -= r5[1];
        }
        k0 l7 = e0.c(this.f357e).l(f8);
        l7.j(this.C);
        hVar2.c(l7);
        if (this.f371s && (view = this.f360h) != null) {
            hVar2.c(e0.c(view).l(f8));
        }
        hVar2.f(D);
        hVar2.e(250L);
        hVar2.g(this.A);
        this.f376x = hVar2;
        hVar2.h();
    }

    public void y(boolean z7) {
        View view;
        View view2;
        k.h hVar = this.f376x;
        if (hVar != null) {
            hVar.a();
        }
        this.f357e.setVisibility(0);
        if (this.f370r == 0 && (this.f377y || z7)) {
            this.f357e.setTranslationY(0.0f);
            float f8 = -this.f357e.getHeight();
            if (z7) {
                this.f357e.getLocationInWindow(new int[]{0, 0});
                f8 -= r5[1];
            }
            this.f357e.setTranslationY(f8);
            k.h hVar2 = new k.h();
            k0 l7 = e0.c(this.f357e).l(0.0f);
            l7.j(this.C);
            hVar2.c(l7);
            if (this.f371s && (view2 = this.f360h) != null) {
                view2.setTranslationY(f8);
                hVar2.c(e0.c(this.f360h).l(0.0f));
            }
            hVar2.f(E);
            hVar2.e(250L);
            hVar2.g(this.B);
            this.f376x = hVar2;
            hVar2.h();
        } else {
            this.f357e.setAlpha(1.0f);
            this.f357e.setTranslationY(0.0f);
            if (this.f371s && (view = this.f360h) != null) {
                view.setTranslationY(0.0f);
            }
            this.B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f356d;
        if (actionBarOverlayLayout != null) {
            e0.K(actionBarOverlayLayout);
        }
    }

    public k(Dialog dialog) {
        C(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }
}
