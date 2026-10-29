package androidx.appcompat.app;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.r1;
import androidx.appcompat.widget.s0;
import androidx.appcompat.widget.y1;
import androidx.appcompat.widget.z1;
import androidx.core.content.res.h;
import androidx.core.view.e0;
import androidx.core.view.k0;
import androidx.core.view.m0;
import androidx.core.view.p;
import androidx.core.view.p0;
import androidx.core.view.z;
import androidx.lifecycle.g;
import java.util.List;
import k.b;
import k.f;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: MyApplication */
class e extends androidx.appcompat.app.d implements e.a, LayoutInflater.Factory2 {

    /* renamed from: r0, reason: collision with root package name */
    private static final r.h f250r0 = new r.h();

    /* renamed from: s0, reason: collision with root package name */
    private static final boolean f251s0 = false;

    /* renamed from: t0, reason: collision with root package name */
    private static final int[] f252t0 = {R.attr.windowBackground};

    /* renamed from: u0, reason: collision with root package name */
    private static final boolean f253u0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: v0, reason: collision with root package name */
    private static final boolean f254v0 = true;
    private CharSequence A;
    private s0 B;
    private f C;
    private s D;
    k.b E;
    ActionBarContextView F;
    PopupWindow G;
    Runnable H;
    k0 I;
    private boolean J;
    private boolean K;
    ViewGroup L;
    private TextView M;
    private View N;
    private boolean O;
    private boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    boolean U;
    private boolean V;
    private r[] W;
    private r X;
    private boolean Y;
    private boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    private boolean f255a0;

    /* renamed from: b0, reason: collision with root package name */
    boolean f256b0;

    /* renamed from: c0, reason: collision with root package name */
    private Configuration f257c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f258d0;

    /* renamed from: e0, reason: collision with root package name */
    private int f259e0;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f260f0;

    /* renamed from: g0, reason: collision with root package name */
    private boolean f261g0;

    /* renamed from: h0, reason: collision with root package name */
    private n f262h0;

    /* renamed from: i0, reason: collision with root package name */
    private n f263i0;

    /* renamed from: j0, reason: collision with root package name */
    boolean f264j0;

    /* renamed from: k0, reason: collision with root package name */
    int f265k0;

    /* renamed from: l0, reason: collision with root package name */
    private final Runnable f266l0;

    /* renamed from: m0, reason: collision with root package name */
    private boolean f267m0;

    /* renamed from: n0, reason: collision with root package name */
    private Rect f268n0;

    /* renamed from: o0, reason: collision with root package name */
    private Rect f269o0;

    /* renamed from: p0, reason: collision with root package name */
    private androidx.appcompat.app.f f270p0;

    /* renamed from: q0, reason: collision with root package name */
    private androidx.appcompat.app.g f271q0;

    /* renamed from: t, reason: collision with root package name */
    final Object f272t;

    /* renamed from: u, reason: collision with root package name */
    final Context f273u;

    /* renamed from: v, reason: collision with root package name */
    Window f274v;

    /* renamed from: w, reason: collision with root package name */
    private l f275w;

    /* renamed from: x, reason: collision with root package name */
    final g.a f276x;

    /* renamed from: y, reason: collision with root package name */
    androidx.appcompat.app.a f277y;

    /* renamed from: z, reason: collision with root package name */
    MenuInflater f278z;

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            if ((eVar.f265k0 & 1) != 0) {
                eVar.U(0);
            }
            e eVar2 = e.this;
            if ((eVar2.f265k0 & 4096) != 0) {
                eVar2.U(108);
            }
            e eVar3 = e.this;
            eVar3.f264j0 = false;
            eVar3.f265k0 = 0;
        }
    }

    /* compiled from: MyApplication */
    class b implements z {
        b() {
        }

        @Override // androidx.core.view.z
        public p0 a(View view, p0 p0Var) {
            int k7 = p0Var.k();
            int L0 = e.this.L0(p0Var, null);
            if (k7 != L0) {
                p0Var = p0Var.o(p0Var.i(), L0, p0Var.j(), p0Var.h());
            }
            return e0.E(view, p0Var);
        }
    }

    /* compiled from: MyApplication */
    class d implements Runnable {

        /* compiled from: MyApplication */
        class a extends m0 {
            a() {
            }

            @Override // androidx.core.view.l0
            public void b(View view) {
                e.this.F.setAlpha(1.0f);
                e.this.I.g(null);
                e.this.I = null;
            }

            @Override // androidx.core.view.m0, androidx.core.view.l0
            public void c(View view) {
                e.this.F.setVisibility(0);
            }
        }

        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e eVar = e.this;
            eVar.G.showAtLocation(eVar.F, 55, 0, 0);
            e.this.V();
            if (!e.this.D0()) {
                e.this.F.setAlpha(1.0f);
                e.this.F.setVisibility(0);
            } else {
                e.this.F.setAlpha(0.0f);
                e eVar2 = e.this;
                eVar2.I = e0.c(eVar2.F).b(1.0f);
                e.this.I.g(new a());
            }
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.appcompat.app.e$e, reason: collision with other inner class name */
    class C0006e extends m0 {
        C0006e() {
        }

        @Override // androidx.core.view.l0
        public void b(View view) {
            e.this.F.setAlpha(1.0f);
            e.this.I.g(null);
            e.this.I = null;
        }

        @Override // androidx.core.view.m0, androidx.core.view.l0
        public void c(View view) {
            e.this.F.setVisibility(0);
            if (e.this.F.getParent() instanceof View) {
                e0.K((View) e.this.F.getParent());
            }
        }
    }

    /* compiled from: MyApplication */
    private final class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z7) {
            e.this.L(eVar);
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback f02 = e.this.f0();
            if (f02 == null) {
                return true;
            }
            f02.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* compiled from: MyApplication */
    class g implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private b.a f286a;

        /* compiled from: MyApplication */
        class a extends m0 {
            a() {
            }

            @Override // androidx.core.view.l0
            public void b(View view) {
                e.this.F.setVisibility(8);
                e eVar = e.this;
                PopupWindow popupWindow = eVar.G;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (eVar.F.getParent() instanceof View) {
                    e0.K((View) e.this.F.getParent());
                }
                e.this.F.k();
                e.this.I.g(null);
                e eVar2 = e.this;
                eVar2.I = null;
                e0.K(eVar2.L);
            }
        }

        public g(b.a aVar) {
            this.f286a = aVar;
        }

        @Override // k.b.a
        public boolean a(k.b bVar, MenuItem menuItem) {
            return this.f286a.a(bVar, menuItem);
        }

        @Override // k.b.a
        public boolean b(k.b bVar, Menu menu) {
            return this.f286a.b(bVar, menu);
        }

        @Override // k.b.a
        public boolean c(k.b bVar, Menu menu) {
            e0.K(e.this.L);
            return this.f286a.c(bVar, menu);
        }

        @Override // k.b.a
        public void d(k.b bVar) {
            this.f286a.d(bVar);
            e eVar = e.this;
            if (eVar.G != null) {
                eVar.f274v.getDecorView().removeCallbacks(e.this.H);
            }
            e eVar2 = e.this;
            if (eVar2.F != null) {
                eVar2.V();
                e eVar3 = e.this;
                eVar3.I = e0.c(eVar3.F).b(0.0f);
                e.this.I.g(new a());
            }
            e eVar4 = e.this;
            g.a aVar = eVar4.f276x;
            if (aVar != null) {
                aVar.d(eVar4.E);
            }
            e eVar5 = e.this;
            eVar5.E = null;
            e0.K(eVar5.L);
        }
    }

    /* compiled from: MyApplication */
    static class h {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i7 = configuration.densityDpi;
            int i8 = configuration2.densityDpi;
            if (i7 != i8) {
                configuration3.densityDpi = i8;
            }
        }
    }

    /* compiled from: MyApplication */
    static class i {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    /* compiled from: MyApplication */
    static class j {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales;
            LocaleList locales2;
            boolean equals;
            locales = configuration.getLocales();
            locales2 = configuration2.getLocales();
            equals = locales.equals(locales2);
            if (equals) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    /* compiled from: MyApplication */
    static class k {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            int i13;
            int i14;
            i7 = configuration.colorMode;
            int i15 = i7 & 3;
            i8 = configuration2.colorMode;
            if (i15 != (i8 & 3)) {
                i13 = configuration3.colorMode;
                i14 = configuration2.colorMode;
                configuration3.colorMode = i13 | (i14 & 3);
            }
            i9 = configuration.colorMode;
            int i16 = i9 & 12;
            i10 = configuration2.colorMode;
            if (i16 != (i10 & 12)) {
                i11 = configuration3.colorMode;
                i12 = configuration2.colorMode;
                configuration3.colorMode = i11 | (i12 & 12);
            }
        }
    }

    /* compiled from: MyApplication */
    class l extends k.k {
        l(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            f.a aVar = new f.a(e.this.f273u, callback);
            k.b F0 = e.this.F0(aVar);
            if (F0 != null) {
                return aVar.e(F0);
            }
            return null;
        }

        @Override // k.k, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // k.k, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || e.this.r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // k.k, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i7, Menu menu) {
            if (i7 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i7, menu);
            }
            return false;
        }

        @Override // k.k, android.view.Window.Callback
        public View onCreatePanelView(int i7) {
            return super.onCreatePanelView(i7);
        }

        @Override // k.k, android.view.Window.Callback
        public boolean onMenuOpened(int i7, Menu menu) {
            super.onMenuOpened(i7, menu);
            e.this.u0(i7);
            return true;
        }

        @Override // k.k, android.view.Window.Callback
        public void onPanelClosed(int i7, Menu menu) {
            super.onPanelClosed(i7, menu);
            e.this.v0(i7);
        }

        @Override // k.k, android.view.Window.Callback
        public boolean onPreparePanel(int i7, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i7 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i7, view, menu);
            if (eVar != null) {
                eVar.a0(false);
            }
            return onPreparePanel;
        }

        @Override // k.k, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i7) {
            androidx.appcompat.view.menu.e eVar;
            r d02 = e.this.d0(0, true);
            if (d02 == null || (eVar = d02.f307j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i7);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i7);
            }
        }

        @Override // android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // k.k, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i7) {
            return (e.this.m0() && i7 == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i7);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }
    }

    /* compiled from: MyApplication */
    private class m extends n {

        /* renamed from: c, reason: collision with root package name */
        private final PowerManager f290c;

        m(Context context) {
            super();
            this.f290c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.e.n
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.n
        public int c() {
            return i.a(this.f290c) ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.n
        public void d() {
            e.this.F();
        }
    }

    /* compiled from: MyApplication */
    abstract class n {

        /* renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f292a;

        /* compiled from: MyApplication */
        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                n.this.d();
            }
        }

        n() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f292a;
            if (broadcastReceiver != null) {
                try {
                    e.this.f273u.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f292a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter b8 = b();
            if (b8 == null || b8.countActions() == 0) {
                return;
            }
            if (this.f292a == null) {
                this.f292a = new a();
            }
            e.this.f273u.registerReceiver(this.f292a, b8);
        }
    }

    /* compiled from: MyApplication */
    private class o extends n {

        /* renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.j f295c;

        o(androidx.appcompat.app.j jVar) {
            super();
            this.f295c = jVar;
        }

        @Override // androidx.appcompat.app.e.n
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.e.n
        public int c() {
            return this.f295c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.e.n
        public void d() {
            e.this.F();
        }
    }

    /* compiled from: MyApplication */
    private static class p {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* compiled from: MyApplication */
    private class q extends ContentFrameLayout {
        public q(Context context) {
            super(context);
        }

        private boolean b(int i7, int i8) {
            return i7 < -5 || i8 < -5 || i7 > getWidth() + 5 || i8 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return e.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            e.this.N(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i7) {
            setBackgroundDrawable(h.a.b(getContext(), i7));
        }
    }

    /* compiled from: MyApplication */
    protected static final class r {

        /* renamed from: a, reason: collision with root package name */
        int f298a;

        /* renamed from: b, reason: collision with root package name */
        int f299b;

        /* renamed from: c, reason: collision with root package name */
        int f300c;

        /* renamed from: d, reason: collision with root package name */
        int f301d;

        /* renamed from: e, reason: collision with root package name */
        int f302e;

        /* renamed from: f, reason: collision with root package name */
        int f303f;

        /* renamed from: g, reason: collision with root package name */
        ViewGroup f304g;

        /* renamed from: h, reason: collision with root package name */
        View f305h;

        /* renamed from: i, reason: collision with root package name */
        View f306i;

        /* renamed from: j, reason: collision with root package name */
        androidx.appcompat.view.menu.e f307j;

        /* renamed from: k, reason: collision with root package name */
        androidx.appcompat.view.menu.c f308k;

        /* renamed from: l, reason: collision with root package name */
        Context f309l;

        /* renamed from: m, reason: collision with root package name */
        boolean f310m;

        /* renamed from: n, reason: collision with root package name */
        boolean f311n;

        /* renamed from: o, reason: collision with root package name */
        boolean f312o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f313p;

        /* renamed from: q, reason: collision with root package name */
        boolean f314q = false;

        /* renamed from: r, reason: collision with root package name */
        boolean f315r;

        /* renamed from: s, reason: collision with root package name */
        Bundle f316s;

        r(int i7) {
            this.f298a = i7;
        }

        androidx.appcompat.view.menu.k a(j.a aVar) {
            if (this.f307j == null) {
                return null;
            }
            if (this.f308k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f309l, f.g.f23417j);
                this.f308k = cVar;
                cVar.g(aVar);
                this.f307j.b(this.f308k);
            }
            return this.f308k.h(this.f304g);
        }

        public boolean b() {
            if (this.f305h == null) {
                return false;
            }
            return this.f306i != null || this.f308k.a().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f307j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f308k);
            }
            this.f307j = eVar;
            if (eVar == null || (cVar = this.f308k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme newTheme = context.getResources().newTheme();
            newTheme.setTo(context.getTheme());
            newTheme.resolveAttribute(f.a.f23308a, typedValue, true);
            int i7 = typedValue.resourceId;
            if (i7 != 0) {
                newTheme.applyStyle(i7, true);
            }
            newTheme.resolveAttribute(f.a.B, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                newTheme.applyStyle(i8, true);
            } else {
                newTheme.applyStyle(f.i.f23441b, true);
            }
            k.d dVar = new k.d(context, 0);
            dVar.getTheme().setTo(newTheme);
            this.f309l = dVar;
            TypedArray obtainStyledAttributes = dVar.obtainStyledAttributes(f.j.f23565y0);
            this.f299b = obtainStyledAttributes.getResourceId(f.j.B0, 0);
            this.f303f = obtainStyledAttributes.getResourceId(f.j.A0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: MyApplication */
    private final class s implements j.a {
        s() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z7) {
            androidx.appcompat.view.menu.e D = eVar.D();
            boolean z8 = D != eVar;
            e eVar2 = e.this;
            if (z8) {
                eVar = D;
            }
            r Y = eVar2.Y(eVar);
            if (Y != null) {
                if (!z8) {
                    e.this.O(Y, z7);
                } else {
                    e.this.K(Y.f298a, Y, D);
                    e.this.O(Y, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback f02;
            if (eVar != eVar.D()) {
                return true;
            }
            e eVar2 = e.this;
            if (!eVar2.Q || (f02 = eVar2.f0()) == null || e.this.f256b0) {
                return true;
            }
            f02.onMenuOpened(108, eVar);
            return true;
        }
    }

    e(Activity activity, g.a aVar) {
        this(activity, null, aVar, activity);
    }

    private boolean A0(r rVar, KeyEvent keyEvent) {
        s0 s0Var;
        s0 s0Var2;
        s0 s0Var3;
        if (this.f256b0) {
            return false;
        }
        if (rVar.f310m) {
            return true;
        }
        r rVar2 = this.X;
        if (rVar2 != null && rVar2 != rVar) {
            O(rVar2, false);
        }
        Window.Callback f02 = f0();
        if (f02 != null) {
            rVar.f306i = f02.onCreatePanelView(rVar.f298a);
        }
        int i7 = rVar.f298a;
        boolean z7 = i7 == 0 || i7 == 108;
        if (z7 && (s0Var3 = this.B) != null) {
            s0Var3.c();
        }
        if (rVar.f306i == null) {
            if (z7) {
                y0();
            }
            androidx.appcompat.view.menu.e eVar = rVar.f307j;
            if (eVar == null || rVar.f315r) {
                if (eVar == null && (!j0(rVar) || rVar.f307j == null)) {
                    return false;
                }
                if (z7 && this.B != null) {
                    if (this.C == null) {
                        this.C = new f();
                    }
                    this.B.a(rVar.f307j, this.C);
                }
                rVar.f307j.d0();
                if (!f02.onCreatePanelMenu(rVar.f298a, rVar.f307j)) {
                    rVar.c(null);
                    if (z7 && (s0Var = this.B) != null) {
                        s0Var.a(null, this.C);
                    }
                    return false;
                }
                rVar.f315r = false;
            }
            rVar.f307j.d0();
            Bundle bundle = rVar.f316s;
            if (bundle != null) {
                rVar.f307j.P(bundle);
                rVar.f316s = null;
            }
            if (!f02.onPreparePanel(0, rVar.f306i, rVar.f307j)) {
                if (z7 && (s0Var2 = this.B) != null) {
                    s0Var2.a(null, this.C);
                }
                rVar.f307j.c0();
                return false;
            }
            boolean z8 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            rVar.f313p = z8;
            rVar.f307j.setQwertyMode(z8);
            rVar.f307j.c0();
        }
        rVar.f310m = true;
        rVar.f311n = false;
        this.X = rVar;
        return true;
    }

    private void B0(boolean z7) {
        s0 s0Var = this.B;
        if (s0Var == null || !s0Var.d() || (ViewConfiguration.get(this.f273u).hasPermanentMenuKey() && !this.B.e())) {
            r d02 = d0(0, true);
            d02.f314q = true;
            O(d02, false);
            x0(d02, null);
            return;
        }
        Window.Callback f02 = f0();
        if (this.B.b() && z7) {
            this.B.f();
            if (this.f256b0) {
                return;
            }
            f02.onPanelClosed(108, d0(0, true).f307j);
            return;
        }
        if (f02 == null || this.f256b0) {
            return;
        }
        if (this.f264j0 && (this.f265k0 & 1) != 0) {
            this.f274v.getDecorView().removeCallbacks(this.f266l0);
            this.f266l0.run();
        }
        r d03 = d0(0, true);
        androidx.appcompat.view.menu.e eVar = d03.f307j;
        if (eVar == null || d03.f315r || !f02.onPreparePanel(0, d03.f306i, eVar)) {
            return;
        }
        f02.onMenuOpened(108, d03.f307j);
        this.B.g();
    }

    private int C0(int i7) {
        if (i7 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i7 != 9) {
            return i7;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f274v.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || e0.A((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean G(boolean z7) {
        if (this.f256b0) {
            return false;
        }
        int J = J();
        boolean J0 = J0(n0(this.f273u, J), z7);
        if (J == 0) {
            c0(this.f273u).e();
        } else {
            n nVar = this.f262h0;
            if (nVar != null) {
                nVar.a();
            }
        }
        if (J == 3) {
            b0(this.f273u).e();
            return J0;
        }
        n nVar2 = this.f263i0;
        if (nVar2 != null) {
            nVar2.a();
        }
        return J0;
    }

    private void H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.L.findViewById(R.id.content);
        View decorView = this.f274v.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray obtainStyledAttributes = this.f273u.obtainStyledAttributes(f.j.f23565y0);
        obtainStyledAttributes.getValue(f.j.K0, contentFrameLayout.getMinWidthMajor());
        obtainStyledAttributes.getValue(f.j.L0, contentFrameLayout.getMinWidthMinor());
        int i7 = f.j.I0;
        if (obtainStyledAttributes.hasValue(i7)) {
            obtainStyledAttributes.getValue(i7, contentFrameLayout.getFixedWidthMajor());
        }
        int i8 = f.j.J0;
        if (obtainStyledAttributes.hasValue(i8)) {
            obtainStyledAttributes.getValue(i8, contentFrameLayout.getFixedWidthMinor());
        }
        int i9 = f.j.G0;
        if (obtainStyledAttributes.hasValue(i9)) {
            obtainStyledAttributes.getValue(i9, contentFrameLayout.getFixedHeightMajor());
        }
        int i10 = f.j.H0;
        if (obtainStyledAttributes.hasValue(i10)) {
            obtainStyledAttributes.getValue(i10, contentFrameLayout.getFixedHeightMinor());
        }
        obtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void H0() {
        if (this.K) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void I(Window window) {
        if (this.f274v != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof l) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        l lVar = new l(callback);
        this.f275w = lVar;
        window.setCallback(lVar);
        r1 t7 = r1.t(this.f273u, null, f252t0);
        Drawable g8 = t7.g(0);
        if (g8 != null) {
            window.setBackgroundDrawable(g8);
        }
        t7.v();
        this.f274v = window;
    }

    private androidx.appcompat.app.c I0() {
        for (Context context = this.f273u; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) context;
            }
            if (!(context instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private int J() {
        int i7 = this.f258d0;
        return i7 != -100 ? i7 : androidx.appcompat.app.d.j();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean J0(int r7, boolean r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f273u
            r1 = 0
            android.content.res.Configuration r0 = r6.P(r0, r7, r1)
            boolean r2 = r6.l0()
            android.content.res.Configuration r3 = r6.f257c0
            if (r3 != 0) goto L19
            android.content.Context r3 = r6.f273u
            android.content.res.Resources r3 = r3.getResources()
            android.content.res.Configuration r3 = r3.getConfiguration()
        L19:
            int r3 = r3.uiMode
            r3 = r3 & 48
            int r0 = r0.uiMode
            r0 = r0 & 48
            r4 = 1
            if (r3 == r0) goto L4b
            if (r8 == 0) goto L4b
            if (r2 != 0) goto L4b
            boolean r8 = r6.Z
            if (r8 == 0) goto L4b
            boolean r8 = androidx.appcompat.app.e.f253u0
            if (r8 != 0) goto L34
            boolean r8 = r6.f255a0
            if (r8 == 0) goto L4b
        L34:
            java.lang.Object r8 = r6.f272t
            boolean r5 = r8 instanceof android.app.Activity
            if (r5 == 0) goto L4b
            android.app.Activity r8 = (android.app.Activity) r8
            boolean r8 = r8.isChild()
            if (r8 != 0) goto L4b
            java.lang.Object r8 = r6.f272t
            android.app.Activity r8 = (android.app.Activity) r8
            androidx.core.app.b.n(r8)
            r8 = r4
            goto L4c
        L4b:
            r8 = 0
        L4c:
            if (r8 != 0) goto L54
            if (r3 == r0) goto L54
            r6.K0(r0, r2, r1)
            goto L55
        L54:
            r4 = r8
        L55:
            if (r4 == 0) goto L62
            java.lang.Object r8 = r6.f272t
            boolean r0 = r8 instanceof androidx.appcompat.app.c
            if (r0 == 0) goto L62
            androidx.appcompat.app.c r8 = (androidx.appcompat.app.c) r8
            r8.Q(r7)
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.J0(int, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(int i7, boolean z7, Configuration configuration) {
        Resources resources = this.f273u.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i7 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        if (Build.VERSION.SDK_INT < 26) {
            androidx.appcompat.app.h.a(resources);
        }
        int i8 = this.f259e0;
        if (i8 != 0) {
            this.f273u.setTheme(i8);
            this.f273u.getTheme().applyStyle(this.f259e0, true);
        }
        if (z7) {
            Object obj = this.f272t;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.k) {
                    if (((androidx.lifecycle.k) activity).t().b().c(g.c.CREATED)) {
                        activity.onConfigurationChanged(configuration2);
                    }
                } else {
                    if (!this.f255a0 || this.f256b0) {
                        return;
                    }
                    activity.onConfigurationChanged(configuration2);
                }
            }
        }
    }

    private void M() {
        n nVar = this.f262h0;
        if (nVar != null) {
            nVar.a();
        }
        n nVar2 = this.f263i0;
        if (nVar2 != null) {
            nVar2.a();
        }
    }

    private void M0(View view) {
        view.setBackgroundColor((e0.x(view) & 8192) != 0 ? androidx.core.content.a.c(this.f273u, f.c.f23336b) : androidx.core.content.a.c(this.f273u, f.c.f23335a));
    }

    private Configuration P(Context context, int i7, Configuration configuration) {
        int i8 = i7 != 1 ? i7 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i8 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup Q() {
        ViewGroup viewGroup;
        TypedArray obtainStyledAttributes = this.f273u.obtainStyledAttributes(f.j.f23565y0);
        int i7 = f.j.D0;
        if (!obtainStyledAttributes.hasValue(i7)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(f.j.M0, false)) {
            z(1);
        } else if (obtainStyledAttributes.getBoolean(i7, false)) {
            z(108);
        }
        if (obtainStyledAttributes.getBoolean(f.j.E0, false)) {
            z(109);
        }
        if (obtainStyledAttributes.getBoolean(f.j.F0, false)) {
            z(10);
        }
        this.T = obtainStyledAttributes.getBoolean(f.j.f23570z0, false);
        obtainStyledAttributes.recycle();
        X();
        this.f274v.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f273u);
        if (this.U) {
            viewGroup = this.S ? (ViewGroup) from.inflate(f.g.f23422o, (ViewGroup) null) : (ViewGroup) from.inflate(f.g.f23421n, (ViewGroup) null);
        } else if (this.T) {
            viewGroup = (ViewGroup) from.inflate(f.g.f23413f, (ViewGroup) null);
            this.R = false;
            this.Q = false;
        } else if (this.Q) {
            TypedValue typedValue = new TypedValue();
            this.f273u.getTheme().resolveAttribute(f.a.f23311d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new k.d(this.f273u, typedValue.resourceId) : this.f273u).inflate(f.g.f23423p, (ViewGroup) null);
            s0 s0Var = (s0) viewGroup.findViewById(f.f.f23397p);
            this.B = s0Var;
            s0Var.setWindowCallback(f0());
            if (this.R) {
                this.B.h(109);
            }
            if (this.O) {
                this.B.h(2);
            }
            if (this.P) {
                this.B.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Q + ", windowActionBarOverlay: " + this.R + ", android:windowIsFloating: " + this.T + ", windowActionModeOverlay: " + this.S + ", windowNoTitle: " + this.U + " }");
        }
        e0.V(viewGroup, new b());
        if (this.B == null) {
            this.M = (TextView) viewGroup.findViewById(f.f.M);
        }
        z1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(f.f.f23383b);
        ViewGroup viewGroup2 = (ViewGroup) this.f274v.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f274v.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    private void W() {
        if (this.K) {
            return;
        }
        this.L = Q();
        CharSequence e02 = e0();
        if (!TextUtils.isEmpty(e02)) {
            s0 s0Var = this.B;
            if (s0Var != null) {
                s0Var.setWindowTitle(e02);
            } else if (y0() != null) {
                y0().s(e02);
            } else {
                TextView textView = this.M;
                if (textView != null) {
                    textView.setText(e02);
                }
            }
        }
        H();
        w0(this.L);
        this.K = true;
        r d02 = d0(0, false);
        if (this.f256b0) {
            return;
        }
        if (d02 == null || d02.f307j == null) {
            k0(108);
        }
    }

    private void X() {
        if (this.f274v == null) {
            Object obj = this.f272t;
            if (obj instanceof Activity) {
                I(((Activity) obj).getWindow());
            }
        }
        if (this.f274v == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f8 = configuration.fontScale;
            float f9 = configuration2.fontScale;
            if (f8 != f9) {
                configuration3.fontScale = f9;
            }
            int i7 = configuration.mcc;
            int i8 = configuration2.mcc;
            if (i7 != i8) {
                configuration3.mcc = i8;
            }
            int i9 = configuration.mnc;
            int i10 = configuration2.mnc;
            if (i9 != i10) {
                configuration3.mnc = i10;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 24) {
                j.a(configuration, configuration2, configuration3);
            } else if (!androidx.core.util.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i12 = configuration.touchscreen;
            int i13 = configuration2.touchscreen;
            if (i12 != i13) {
                configuration3.touchscreen = i13;
            }
            int i14 = configuration.keyboard;
            int i15 = configuration2.keyboard;
            if (i14 != i15) {
                configuration3.keyboard = i15;
            }
            int i16 = configuration.keyboardHidden;
            int i17 = configuration2.keyboardHidden;
            if (i16 != i17) {
                configuration3.keyboardHidden = i17;
            }
            int i18 = configuration.navigation;
            int i19 = configuration2.navigation;
            if (i18 != i19) {
                configuration3.navigation = i19;
            }
            int i20 = configuration.navigationHidden;
            int i21 = configuration2.navigationHidden;
            if (i20 != i21) {
                configuration3.navigationHidden = i21;
            }
            int i22 = configuration.orientation;
            int i23 = configuration2.orientation;
            if (i22 != i23) {
                configuration3.orientation = i23;
            }
            int i24 = configuration.screenLayout & 15;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 15)) {
                configuration3.screenLayout |= i25 & 15;
            }
            int i26 = configuration.screenLayout & 192;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 192)) {
                configuration3.screenLayout |= i27 & 192;
            }
            int i28 = configuration.screenLayout & 48;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 48)) {
                configuration3.screenLayout |= i29 & 48;
            }
            int i30 = configuration.screenLayout & 768;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 768)) {
                configuration3.screenLayout |= i31 & 768;
            }
            if (i11 >= 26) {
                k.a(configuration, configuration2, configuration3);
            }
            int i32 = configuration.uiMode & 15;
            int i33 = configuration2.uiMode;
            if (i32 != (i33 & 15)) {
                configuration3.uiMode |= i33 & 15;
            }
            int i34 = configuration.uiMode & 48;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 48)) {
                configuration3.uiMode |= i35 & 48;
            }
            int i36 = configuration.screenWidthDp;
            int i37 = configuration2.screenWidthDp;
            if (i36 != i37) {
                configuration3.screenWidthDp = i37;
            }
            int i38 = configuration.screenHeightDp;
            int i39 = configuration2.screenHeightDp;
            if (i38 != i39) {
                configuration3.screenHeightDp = i39;
            }
            int i40 = configuration.smallestScreenWidthDp;
            int i41 = configuration2.smallestScreenWidthDp;
            if (i40 != i41) {
                configuration3.smallestScreenWidthDp = i41;
            }
            h.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    private n b0(Context context) {
        if (this.f263i0 == null) {
            this.f263i0 = new m(context);
        }
        return this.f263i0;
    }

    private n c0(Context context) {
        if (this.f262h0 == null) {
            this.f262h0 = new o(androidx.appcompat.app.j.a(context));
        }
        return this.f262h0;
    }

    private void g0() {
        W();
        if (this.Q && this.f277y == null) {
            Object obj = this.f272t;
            if (obj instanceof Activity) {
                this.f277y = new androidx.appcompat.app.k((Activity) this.f272t, this.R);
            } else if (obj instanceof Dialog) {
                this.f277y = new androidx.appcompat.app.k((Dialog) this.f272t);
            }
            androidx.appcompat.app.a aVar = this.f277y;
            if (aVar != null) {
                aVar.q(this.f267m0);
            }
        }
    }

    private boolean h0(r rVar) {
        View view = rVar.f306i;
        if (view != null) {
            rVar.f305h = view;
            return true;
        }
        if (rVar.f307j == null) {
            return false;
        }
        if (this.D == null) {
            this.D = new s();
        }
        View view2 = (View) rVar.a(this.D);
        rVar.f305h = view2;
        return view2 != null;
    }

    private boolean i0(r rVar) {
        rVar.d(a0());
        rVar.f304g = new q(rVar.f309l);
        rVar.f300c = 81;
        return true;
    }

    private boolean j0(r rVar) {
        Resources.Theme theme;
        Context context = this.f273u;
        int i7 = rVar.f298a;
        if ((i7 == 0 || i7 == 108) && this.B != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme2 = context.getTheme();
            theme2.resolveAttribute(f.a.f23311d, typedValue, true);
            if (typedValue.resourceId != 0) {
                theme = context.getResources().newTheme();
                theme.setTo(theme2);
                theme.applyStyle(typedValue.resourceId, true);
                theme.resolveAttribute(f.a.f23312e, typedValue, true);
            } else {
                theme2.resolveAttribute(f.a.f23312e, typedValue, true);
                theme = null;
            }
            if (typedValue.resourceId != 0) {
                if (theme == null) {
                    theme = context.getResources().newTheme();
                    theme.setTo(theme2);
                }
                theme.applyStyle(typedValue.resourceId, true);
            }
            if (theme != null) {
                k.d dVar = new k.d(context, 0);
                dVar.getTheme().setTo(theme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        rVar.c(eVar);
        return true;
    }

    private void k0(int i7) {
        this.f265k0 = (1 << i7) | this.f265k0;
        if (this.f264j0) {
            return;
        }
        e0.I(this.f274v.getDecorView(), this.f266l0);
        this.f264j0 = true;
    }

    private boolean l0() {
        if (!this.f261g0 && (this.f272t instanceof Activity)) {
            PackageManager packageManager = this.f273u.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i7 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.f273u, this.f272t.getClass()), i7 >= 29 ? 269221888 : i7 >= 24 ? 786432 : 0);
                this.f260f0 = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.f260f0 = false;
            }
        }
        this.f261g0 = true;
        return this.f260f0;
    }

    private boolean q0(int i7, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        r d02 = d0(i7, true);
        if (d02.f312o) {
            return false;
        }
        return A0(d02, keyEvent);
    }

    private boolean t0(int i7, KeyEvent keyEvent) {
        boolean z7;
        s0 s0Var;
        if (this.E != null) {
            return false;
        }
        boolean z8 = true;
        r d02 = d0(i7, true);
        if (i7 != 0 || (s0Var = this.B) == null || !s0Var.d() || ViewConfiguration.get(this.f273u).hasPermanentMenuKey()) {
            boolean z9 = d02.f312o;
            if (z9 || d02.f311n) {
                O(d02, true);
                z8 = z9;
            } else {
                if (d02.f310m) {
                    if (d02.f315r) {
                        d02.f310m = false;
                        z7 = A0(d02, keyEvent);
                    } else {
                        z7 = true;
                    }
                    if (z7) {
                        x0(d02, keyEvent);
                    }
                }
                z8 = false;
            }
        } else if (this.B.b()) {
            z8 = this.B.f();
        } else {
            if (!this.f256b0 && A0(d02, keyEvent)) {
                z8 = this.B.g();
            }
            z8 = false;
        }
        if (z8) {
            AudioManager audioManager = (AudioManager) this.f273u.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return z8;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return z8;
    }

    private void x0(r rVar, KeyEvent keyEvent) {
        int i7;
        ViewGroup.LayoutParams layoutParams;
        if (rVar.f312o || this.f256b0) {
            return;
        }
        if (rVar.f298a == 0 && (this.f273u.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback f02 = f0();
        if (f02 != null && !f02.onMenuOpened(rVar.f298a, rVar.f307j)) {
            O(rVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f273u.getSystemService("window");
        if (windowManager != null && A0(rVar, keyEvent)) {
            ViewGroup viewGroup = rVar.f304g;
            if (viewGroup == null || rVar.f314q) {
                if (viewGroup == null) {
                    if (!i0(rVar) || rVar.f304g == null) {
                        return;
                    }
                } else if (rVar.f314q && viewGroup.getChildCount() > 0) {
                    rVar.f304g.removeAllViews();
                }
                if (!h0(rVar) || !rVar.b()) {
                    rVar.f314q = true;
                    return;
                }
                ViewGroup.LayoutParams layoutParams2 = rVar.f305h.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                rVar.f304g.setBackgroundResource(rVar.f299b);
                ViewParent parent = rVar.f305h.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(rVar.f305h);
                }
                rVar.f304g.addView(rVar.f305h, layoutParams2);
                if (!rVar.f305h.hasFocus()) {
                    rVar.f305h.requestFocus();
                }
            } else {
                View view = rVar.f306i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i7 = -1;
                    rVar.f311n = false;
                    WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i7, -2, rVar.f301d, rVar.f302e, 1002, 8519680, -3);
                    layoutParams3.gravity = rVar.f300c;
                    layoutParams3.windowAnimations = rVar.f303f;
                    windowManager.addView(rVar.f304g, layoutParams3);
                    rVar.f312o = true;
                }
            }
            i7 = -2;
            rVar.f311n = false;
            WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i7, -2, rVar.f301d, rVar.f302e, 1002, 8519680, -3);
            layoutParams32.gravity = rVar.f300c;
            layoutParams32.windowAnimations = rVar.f303f;
            windowManager.addView(rVar.f304g, layoutParams32);
            rVar.f312o = true;
        }
    }

    private boolean z0(r rVar, int i7, KeyEvent keyEvent, int i8) {
        androidx.appcompat.view.menu.e eVar;
        boolean z7 = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((rVar.f310m || A0(rVar, keyEvent)) && (eVar = rVar.f307j) != null) {
            z7 = eVar.performShortcut(i7, keyEvent, i8);
        }
        if (z7 && (i8 & 1) == 0 && this.B == null) {
            O(rVar, true);
        }
        return z7;
    }

    @Override // androidx.appcompat.app.d
    public void A(int i7) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.L.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f273u).inflate(i7, viewGroup);
        this.f275w.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.d
    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.L.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f275w.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.d
    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.L.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f275w.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.d
    public void D(int i7) {
        this.f259e0 = i7;
    }

    final boolean D0() {
        ViewGroup viewGroup;
        return this.K && (viewGroup = this.L) != null && e0.B(viewGroup);
    }

    @Override // androidx.appcompat.app.d
    public final void E(CharSequence charSequence) {
        this.A = charSequence;
        s0 s0Var = this.B;
        if (s0Var != null) {
            s0Var.setWindowTitle(charSequence);
            return;
        }
        if (y0() != null) {
            y0().s(charSequence);
            return;
        }
        TextView textView = this.M;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean F() {
        return G(true);
    }

    public k.b F0(b.a aVar) {
        g.a aVar2;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        k.b bVar = this.E;
        if (bVar != null) {
            bVar.c();
        }
        g gVar = new g(aVar);
        androidx.appcompat.app.a m7 = m();
        if (m7 != null) {
            k.b t7 = m7.t(gVar);
            this.E = t7;
            if (t7 != null && (aVar2 = this.f276x) != null) {
                aVar2.r(t7);
            }
        }
        if (this.E == null) {
            this.E = G0(gVar);
        }
        return this.E;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    k.b G0(k.b.a r8) {
        /*
            Method dump skipped, instructions count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.G0(k.b$a):k.b");
    }

    void K(int i7, r rVar, Menu menu) {
        if (menu == null) {
            if (rVar == null && i7 >= 0) {
                r[] rVarArr = this.W;
                if (i7 < rVarArr.length) {
                    rVar = rVarArr[i7];
                }
            }
            if (rVar != null) {
                menu = rVar.f307j;
            }
        }
        if ((rVar == null || rVar.f312o) && !this.f256b0) {
            this.f275w.a().onPanelClosed(i7, menu);
        }
    }

    void L(androidx.appcompat.view.menu.e eVar) {
        if (this.V) {
            return;
        }
        this.V = true;
        this.B.i();
        Window.Callback f02 = f0();
        if (f02 != null && !this.f256b0) {
            f02.onPanelClosed(108, eVar);
        }
        this.V = false;
    }

    final int L0(p0 p0Var, Rect rect) {
        boolean z7;
        boolean z8;
        int k7 = p0Var != null ? p0Var.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.F;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z7 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.F.getLayoutParams();
            if (this.F.isShown()) {
                if (this.f268n0 == null) {
                    this.f268n0 = new Rect();
                    this.f269o0 = new Rect();
                }
                Rect rect2 = this.f268n0;
                Rect rect3 = this.f269o0;
                if (p0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(p0Var.i(), p0Var.k(), p0Var.j(), p0Var.h());
                }
                z1.a(this.L, rect2, rect3);
                int i7 = rect2.top;
                int i8 = rect2.left;
                int i9 = rect2.right;
                p0 u7 = e0.u(this.L);
                int i10 = u7 == null ? 0 : u7.i();
                int j7 = u7 == null ? 0 : u7.j();
                if (marginLayoutParams.topMargin == i7 && marginLayoutParams.leftMargin == i8 && marginLayoutParams.rightMargin == i9) {
                    z8 = false;
                } else {
                    marginLayoutParams.topMargin = i7;
                    marginLayoutParams.leftMargin = i8;
                    marginLayoutParams.rightMargin = i9;
                    z8 = true;
                }
                if (i7 <= 0 || this.N != null) {
                    View view = this.N;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i11 = marginLayoutParams2.height;
                        int i12 = marginLayoutParams.topMargin;
                        if (i11 != i12 || marginLayoutParams2.leftMargin != i10 || marginLayoutParams2.rightMargin != j7) {
                            marginLayoutParams2.height = i12;
                            marginLayoutParams2.leftMargin = i10;
                            marginLayoutParams2.rightMargin = j7;
                            this.N.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f273u);
                    this.N = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i10;
                    layoutParams.rightMargin = j7;
                    this.L.addView(this.N, -1, layoutParams);
                }
                View view3 = this.N;
                r5 = view3 != null;
                if (r5 && view3.getVisibility() != 0) {
                    M0(this.N);
                }
                if (!this.S && r5) {
                    k7 = 0;
                }
                z7 = r5;
                r5 = z8;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z7 = false;
            } else {
                z7 = false;
                r5 = false;
            }
            if (r5) {
                this.F.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.N;
        if (view4 != null) {
            view4.setVisibility(z7 ? 0 : 8);
        }
        return k7;
    }

    void N(int i7) {
        O(d0(i7, true), true);
    }

    void O(r rVar, boolean z7) {
        ViewGroup viewGroup;
        s0 s0Var;
        if (z7 && rVar.f298a == 0 && (s0Var = this.B) != null && s0Var.b()) {
            L(rVar.f307j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f273u.getSystemService("window");
        if (windowManager != null && rVar.f312o && (viewGroup = rVar.f304g) != null) {
            windowManager.removeView(viewGroup);
            if (z7) {
                K(rVar.f298a, rVar, null);
            }
        }
        rVar.f310m = false;
        rVar.f311n = false;
        rVar.f312o = false;
        rVar.f305h = null;
        rVar.f314q = true;
        if (this.X == rVar) {
            this.X = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z7;
        if (this.f270p0 == null) {
            String string = this.f273u.obtainStyledAttributes(f.j.f23565y0).getString(f.j.C0);
            if (string == null) {
                this.f270p0 = new androidx.appcompat.app.f();
            } else {
                try {
                    this.f270p0 = (androidx.appcompat.app.f) this.f273u.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f270p0 = new androidx.appcompat.app.f();
                }
            }
        }
        boolean z8 = f251s0;
        boolean z9 = false;
        if (z8) {
            if (this.f271q0 == null) {
                this.f271q0 = new androidx.appcompat.app.g();
            }
            if (this.f271q0.a(attributeSet)) {
                z7 = true;
                return this.f270p0.r(view, str, context, attributeSet, z7, z8, true, y1.c());
            }
            if (!(attributeSet instanceof XmlPullParser)) {
                z9 = E0((ViewParent) view);
            } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                z9 = true;
            }
        }
        z7 = z9;
        return this.f270p0.r(view, str, context, attributeSet, z7, z8, true, y1.c());
    }

    void S() {
        androidx.appcompat.view.menu.e eVar;
        s0 s0Var = this.B;
        if (s0Var != null) {
            s0Var.i();
        }
        if (this.G != null) {
            this.f274v.getDecorView().removeCallbacks(this.H);
            if (this.G.isShowing()) {
                try {
                    this.G.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.G = null;
        }
        V();
        r d02 = d0(0, false);
        if (d02 == null || (eVar = d02.f307j) == null) {
            return;
        }
        eVar.close();
    }

    boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f272t;
        if (((obj instanceof p.a) || (obj instanceof g.g)) && (decorView = this.f274v.getDecorView()) != null && androidx.core.view.p.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f275w.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? p0(keyCode, keyEvent) : s0(keyCode, keyEvent);
    }

    void U(int i7) {
        r d02;
        r d03 = d0(i7, true);
        if (d03.f307j != null) {
            Bundle bundle = new Bundle();
            d03.f307j.Q(bundle);
            if (bundle.size() > 0) {
                d03.f316s = bundle;
            }
            d03.f307j.d0();
            d03.f307j.clear();
        }
        d03.f315r = true;
        d03.f314q = true;
        if ((i7 != 108 && i7 != 0) || this.B == null || (d02 = d0(0, false)) == null) {
            return;
        }
        d02.f310m = false;
        A0(d02, null);
    }

    void V() {
        k0 k0Var = this.I;
        if (k0Var != null) {
            k0Var.c();
        }
    }

    r Y(Menu menu) {
        r[] rVarArr = this.W;
        int length = rVarArr != null ? rVarArr.length : 0;
        for (int i7 = 0; i7 < length; i7++) {
            r rVar = rVarArr[i7];
            if (rVar != null && rVar.f307j == menu) {
                return rVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        r Y;
        Window.Callback f02 = f0();
        if (f02 == null || this.f256b0 || (Y = Y(eVar.D())) == null) {
            return false;
        }
        return f02.onMenuItemSelected(Y.f298a, menuItem);
    }

    final Context a0() {
        androidx.appcompat.app.a m7 = m();
        Context j7 = m7 != null ? m7.j() : null;
        return j7 == null ? this.f273u : j7;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        B0(true);
    }

    @Override // androidx.appcompat.app.d
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.L.findViewById(R.id.content)).addView(view, layoutParams);
        this.f275w.a().onContentChanged();
    }

    protected r d0(int i7, boolean z7) {
        r[] rVarArr = this.W;
        if (rVarArr == null || rVarArr.length <= i7) {
            r[] rVarArr2 = new r[i7 + 1];
            if (rVarArr != null) {
                System.arraycopy(rVarArr, 0, rVarArr2, 0, rVarArr.length);
            }
            this.W = rVarArr2;
            rVarArr = rVarArr2;
        }
        r rVar = rVarArr[i7];
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(i7);
        rVarArr[i7] = rVar2;
        return rVar2;
    }

    final CharSequence e0() {
        Object obj = this.f272t;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.A;
    }

    @Override // androidx.appcompat.app.d
    public Context f(Context context) {
        this.Z = true;
        int n02 = n0(context, J());
        if (f254v0 && (context instanceof ContextThemeWrapper)) {
            try {
                p.a((ContextThemeWrapper) context, P(context, n02, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof k.d) {
            try {
                ((k.d) context).a(P(context, n02, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f253u0) {
            return super.f(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = h.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration P = P(context, n02, configuration2.equals(configuration3) ? null : Z(configuration2, configuration3));
        k.d dVar = new k.d(context, f.i.f23442c);
        dVar.a(P);
        try {
            if (context.getTheme() != null) {
                h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.f(dVar);
    }

    final Window.Callback f0() {
        return this.f274v.getCallback();
    }

    @Override // androidx.appcompat.app.d
    public View i(int i7) {
        W();
        return this.f274v.findViewById(i7);
    }

    @Override // androidx.appcompat.app.d
    public int k() {
        return this.f258d0;
    }

    @Override // androidx.appcompat.app.d
    public MenuInflater l() {
        if (this.f278z == null) {
            g0();
            androidx.appcompat.app.a aVar = this.f277y;
            this.f278z = new k.g(aVar != null ? aVar.j() : this.f273u);
        }
        return this.f278z;
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.app.a m() {
        g0();
        return this.f277y;
    }

    public boolean m0() {
        return this.J;
    }

    @Override // androidx.appcompat.app.d
    public void n() {
        LayoutInflater from = LayoutInflater.from(this.f273u);
        if (from.getFactory() == null) {
            androidx.core.view.q.a(from, this);
        } else {
            if (from.getFactory2() instanceof e) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    int n0(Context context, int i7) {
        if (i7 == -100) {
            return -1;
        }
        if (i7 != -1) {
            if (i7 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return c0(context).c();
            }
            if (i7 != 1 && i7 != 2) {
                if (i7 == 3) {
                    return b0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i7;
    }

    @Override // androidx.appcompat.app.d
    public void o() {
        if (y0() == null || m().k()) {
            return;
        }
        k0(0);
    }

    boolean o0() {
        k.b bVar = this.E;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a m7 = m();
        return m7 != null && m7.g();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.d
    public void p(Configuration configuration) {
        androidx.appcompat.app.a m7;
        if (this.Q && this.K && (m7 = m()) != null) {
            m7.l(configuration);
        }
        androidx.appcompat.widget.k.b().g(this.f273u);
        this.f257c0 = new Configuration(this.f273u.getResources().getConfiguration());
        G(false);
    }

    boolean p0(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            this.Y = (keyEvent.getFlags() & 128) != 0;
        } else if (i7 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public void q(Bundle bundle) {
        String str;
        this.Z = true;
        G(false);
        X();
        Object obj = this.f272t;
        if (obj instanceof Activity) {
            try {
                str = androidx.core.app.g.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                androidx.appcompat.app.a y02 = y0();
                if (y02 == null) {
                    this.f267m0 = true;
                } else {
                    y02.q(true);
                }
            }
            androidx.appcompat.app.d.c(this);
        }
        this.f257c0 = new Configuration(this.f273u.getResources().getConfiguration());
        this.f255a0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    @Override // androidx.appcompat.app.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f272t
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            androidx.appcompat.app.d.x(r3)
        L9:
            boolean r0 = r3.f264j0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f274v
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f266l0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f256b0 = r0
            int r0 = r3.f258d0
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f272t
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            r.h r0 = androidx.appcompat.app.e.f250r0
            java.lang.Object r1 = r3.f272t
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f258d0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            r.h r0 = androidx.appcompat.app.e.f250r0
            java.lang.Object r1 = r3.f272t
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            androidx.appcompat.app.a r0 = r3.f277y
            if (r0 == 0) goto L5b
            r0.m()
        L5b:
            r3.M()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.e.r():void");
    }

    boolean r0(int i7, KeyEvent keyEvent) {
        androidx.appcompat.app.a m7 = m();
        if (m7 != null && m7.n(i7, keyEvent)) {
            return true;
        }
        r rVar = this.X;
        if (rVar != null && z0(rVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            r rVar2 = this.X;
            if (rVar2 != null) {
                rVar2.f311n = true;
            }
            return true;
        }
        if (this.X == null) {
            r d02 = d0(0, true);
            A0(d02, keyEvent);
            boolean z02 = z0(d02, keyEvent.getKeyCode(), keyEvent, 1);
            d02.f310m = false;
            if (z02) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public void s(Bundle bundle) {
        W();
    }

    boolean s0(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            boolean z7 = this.Y;
            this.Y = false;
            r d02 = d0(0, false);
            if (d02 != null && d02.f312o) {
                if (!z7) {
                    O(d02, true);
                }
                return true;
            }
            if (o0()) {
                return true;
            }
        } else if (i7 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.d
    public void t() {
        androidx.appcompat.app.a m7 = m();
        if (m7 != null) {
            m7.r(true);
        }
    }

    void u0(int i7) {
        androidx.appcompat.app.a m7;
        if (i7 != 108 || (m7 = m()) == null) {
            return;
        }
        m7.h(true);
    }

    @Override // androidx.appcompat.app.d
    public void v() {
        F();
    }

    void v0(int i7) {
        if (i7 == 108) {
            androidx.appcompat.app.a m7 = m();
            if (m7 != null) {
                m7.h(false);
                return;
            }
            return;
        }
        if (i7 == 0) {
            r d02 = d0(i7, true);
            if (d02.f312o) {
                O(d02, false);
            }
        }
    }

    @Override // androidx.appcompat.app.d
    public void w() {
        androidx.appcompat.app.a m7 = m();
        if (m7 != null) {
            m7.r(false);
        }
    }

    final androidx.appcompat.app.a y0() {
        return this.f277y;
    }

    @Override // androidx.appcompat.app.d
    public boolean z(int i7) {
        int C0 = C0(i7);
        if (this.U && C0 == 108) {
            return false;
        }
        if (this.Q && C0 == 1) {
            this.Q = false;
        }
        if (C0 == 1) {
            H0();
            this.U = true;
            return true;
        }
        if (C0 == 2) {
            H0();
            this.O = true;
            return true;
        }
        if (C0 == 5) {
            H0();
            this.P = true;
            return true;
        }
        if (C0 == 10) {
            H0();
            this.S = true;
            return true;
        }
        if (C0 == 108) {
            H0();
            this.Q = true;
            return true;
        }
        if (C0 != 109) {
            return this.f274v.requestFeature(C0);
        }
        H0();
        this.R = true;
        return true;
    }

    e(Dialog dialog, g.a aVar) {
        this(dialog.getContext(), dialog.getWindow(), aVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    private e(Context context, Window window, g.a aVar, Object obj) {
        androidx.appcompat.app.c I0;
        this.I = null;
        this.J = true;
        this.f258d0 = -100;
        this.f266l0 = new a();
        this.f273u = context;
        this.f276x = aVar;
        this.f272t = obj;
        if (this.f258d0 == -100 && (obj instanceof Dialog) && (I0 = I0()) != null) {
            this.f258d0 = I0.L().k();
        }
        if (this.f258d0 == -100) {
            r.h hVar = f250r0;
            Integer num = (Integer) hVar.get(obj.getClass().getName());
            if (num != null) {
                this.f258d0 = num.intValue();
                hVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            I(window);
        }
        androidx.appcompat.widget.k.h();
    }

    /* compiled from: MyApplication */
    class c implements ContentFrameLayout.a {
        c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            e.this.S();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // androidx.appcompat.app.d
    public void u(Bundle bundle) {
    }

    void w0(ViewGroup viewGroup) {
    }
}
