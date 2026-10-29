package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.g;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public abstract class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.k, androidx.lifecycle.z, androidx.savedstate.c {

    /* renamed from: q0, reason: collision with root package name */
    static final Object f2086q0 = new Object();
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    boolean G;
    int H;
    n I;
    k J;
    Fragment L;
    int M;
    int N;
    String O;
    boolean P;
    boolean Q;
    boolean R;
    boolean S;
    boolean T;
    private boolean V;
    ViewGroup W;
    View X;
    boolean Y;

    /* renamed from: a0, reason: collision with root package name */
    e f2087a0;

    /* renamed from: c0, reason: collision with root package name */
    boolean f2089c0;

    /* renamed from: d0, reason: collision with root package name */
    boolean f2090d0;

    /* renamed from: e0, reason: collision with root package name */
    float f2091e0;

    /* renamed from: f0, reason: collision with root package name */
    LayoutInflater f2092f0;

    /* renamed from: g0, reason: collision with root package name */
    boolean f2093g0;

    /* renamed from: i0, reason: collision with root package name */
    androidx.lifecycle.l f2095i0;

    /* renamed from: j0, reason: collision with root package name */
    z f2096j0;

    /* renamed from: l0, reason: collision with root package name */
    x.a f2098l0;

    /* renamed from: m0, reason: collision with root package name */
    androidx.savedstate.b f2099m0;

    /* renamed from: n0, reason: collision with root package name */
    private int f2100n0;

    /* renamed from: r, reason: collision with root package name */
    Bundle f2104r;

    /* renamed from: s, reason: collision with root package name */
    SparseArray f2105s;

    /* renamed from: t, reason: collision with root package name */
    Bundle f2106t;

    /* renamed from: u, reason: collision with root package name */
    Boolean f2107u;

    /* renamed from: w, reason: collision with root package name */
    Bundle f2109w;

    /* renamed from: x, reason: collision with root package name */
    Fragment f2110x;

    /* renamed from: z, reason: collision with root package name */
    int f2112z;

    /* renamed from: q, reason: collision with root package name */
    int f2103q = -1;

    /* renamed from: v, reason: collision with root package name */
    String f2108v = UUID.randomUUID().toString();

    /* renamed from: y, reason: collision with root package name */
    String f2111y = null;
    private Boolean A = null;
    n K = new o();
    boolean U = true;
    boolean Z = true;

    /* renamed from: b0, reason: collision with root package name */
    Runnable f2088b0 = new a();

    /* renamed from: h0, reason: collision with root package name */
    g.c f2094h0 = g.c.RESUMED;

    /* renamed from: k0, reason: collision with root package name */
    androidx.lifecycle.p f2097k0 = new androidx.lifecycle.p();

    /* renamed from: o0, reason: collision with root package name */
    private final AtomicInteger f2101o0 = new AtomicInteger();

    /* renamed from: p0, reason: collision with root package name */
    private final ArrayList f2102p0 = new ArrayList();

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.C1();
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.e(false);
        }
    }

    /* compiled from: MyApplication */
    class c implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ b0 f2116q;

        c(b0 b0Var) {
            this.f2116q = b0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2116q.g();
        }
    }

    /* compiled from: MyApplication */
    class d extends androidx.fragment.app.g {
        d() {
        }

        @Override // androidx.fragment.app.g
        public View d(int i7) {
            View view = Fragment.this.X;
            if (view != null) {
                return view.findViewById(i7);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.g
        public boolean f() {
            return Fragment.this.X != null;
        }
    }

    /* compiled from: MyApplication */
    static class e {

        /* renamed from: a, reason: collision with root package name */
        View f2119a;

        /* renamed from: b, reason: collision with root package name */
        Animator f2120b;

        /* renamed from: c, reason: collision with root package name */
        boolean f2121c;

        /* renamed from: d, reason: collision with root package name */
        int f2122d;

        /* renamed from: e, reason: collision with root package name */
        int f2123e;

        /* renamed from: f, reason: collision with root package name */
        int f2124f;

        /* renamed from: g, reason: collision with root package name */
        int f2125g;

        /* renamed from: h, reason: collision with root package name */
        int f2126h;

        /* renamed from: i, reason: collision with root package name */
        ArrayList f2127i;

        /* renamed from: j, reason: collision with root package name */
        ArrayList f2128j;

        /* renamed from: k, reason: collision with root package name */
        Object f2129k = null;

        /* renamed from: l, reason: collision with root package name */
        Object f2130l;

        /* renamed from: m, reason: collision with root package name */
        Object f2131m;

        /* renamed from: n, reason: collision with root package name */
        Object f2132n;

        /* renamed from: o, reason: collision with root package name */
        Object f2133o;

        /* renamed from: p, reason: collision with root package name */
        Object f2134p;

        /* renamed from: q, reason: collision with root package name */
        Boolean f2135q;

        /* renamed from: r, reason: collision with root package name */
        Boolean f2136r;

        /* renamed from: s, reason: collision with root package name */
        float f2137s;

        /* renamed from: t, reason: collision with root package name */
        View f2138t;

        /* renamed from: u, reason: collision with root package name */
        boolean f2139u;

        /* renamed from: v, reason: collision with root package name */
        g f2140v;

        /* renamed from: w, reason: collision with root package name */
        boolean f2141w;

        e() {
            Object obj = Fragment.f2086q0;
            this.f2130l = obj;
            this.f2131m = null;
            this.f2132n = obj;
            this.f2133o = null;
            this.f2134p = obj;
            this.f2137s = 1.0f;
            this.f2138t = null;
        }
    }

    /* compiled from: MyApplication */
    public static class f extends RuntimeException {
        public f(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* compiled from: MyApplication */
    interface g {
        void a();

        void b();
    }

    public Fragment() {
        U();
    }

    private int C() {
        g.c cVar = this.f2094h0;
        return (cVar == g.c.INITIALIZED || this.L == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.L.C());
    }

    private void U() {
        this.f2095i0 = new androidx.lifecycle.l(this);
        this.f2099m0 = androidx.savedstate.b.a(this);
        this.f2098l0 = null;
    }

    public static Fragment W(Context context, String str, Bundle bundle) {
        try {
            Fragment fragment = (Fragment) j.d(context.getClassLoader(), str).getConstructor(null).newInstance(null);
            if (bundle == null) {
                return fragment;
            }
            bundle.setClassLoader(fragment.getClass().getClassLoader());
            fragment.t1(bundle);
            return fragment;
        } catch (IllegalAccessException e8) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (InstantiationException e9) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e9);
        } catch (NoSuchMethodException e10) {
            throw new f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e10);
        } catch (InvocationTargetException e11) {
            throw new f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e11);
        }
    }

    private e i() {
        if (this.f2087a0 == null) {
            this.f2087a0 = new e();
        }
        return this.f2087a0;
    }

    private void o1() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.X != null) {
            p1(this.f2104r);
        }
        this.f2104r = null;
    }

    public final Object A() {
        k kVar = this.J;
        if (kVar == null) {
            return null;
        }
        return kVar.l();
    }

    void A1(ArrayList arrayList, ArrayList arrayList2) {
        i();
        e eVar = this.f2087a0;
        eVar.f2127i = arrayList;
        eVar.f2128j = arrayList2;
    }

    public LayoutInflater B(Bundle bundle) {
        k kVar = this.J;
        if (kVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater m7 = kVar.m();
        androidx.core.view.q.a(m7, this.K.s0());
        return m7;
    }

    public void B0() {
        this.V = true;
    }

    public void B1(Intent intent, int i7, Bundle bundle) {
        if (this.J != null) {
            F().J0(this, intent, i7, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void C1() {
        if (this.f2087a0 == null || !i().f2139u) {
            return;
        }
        if (this.J == null) {
            i().f2139u = false;
        } else if (Looper.myLooper() != this.J.k().getLooper()) {
            this.J.k().postAtFrontOfQueue(new b());
        } else {
            e(true);
        }
    }

    int D() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2126h;
    }

    public final Fragment E() {
        return this.L;
    }

    public final n F() {
        n nVar = this.I;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean G() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return false;
        }
        return eVar.f2121c;
    }

    public void G0() {
        this.V = true;
    }

    int H() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2124f;
    }

    int I() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2125g;
    }

    public void I0() {
        this.V = true;
    }

    float J() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.f2137s;
    }

    public void J0() {
        this.V = true;
    }

    public Object K() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2132n;
        return obj == f2086q0 ? x() : obj;
    }

    public final Resources L() {
        return l1().getResources();
    }

    public void L0(Bundle bundle) {
        this.V = true;
    }

    public Object M() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2130l;
        return obj == f2086q0 ? u() : obj;
    }

    void M0(Bundle bundle) {
        this.K.P0();
        this.f2103q = 3;
        this.V = false;
        f0(bundle);
        if (this.V) {
            o1();
            this.K.x();
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public Object N() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return null;
        }
        return eVar.f2133o;
    }

    void N0() {
        Iterator it = this.f2102p0.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f2102p0.clear();
        this.K.j(this.J, f(), this);
        this.f2103q = 0;
        this.V = false;
        i0(this.J.i());
        if (this.V) {
            this.I.H(this);
            this.K.y();
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    public Object O() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.f2134p;
        return obj == f2086q0 ? N() : obj;
    }

    void O0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.K.z(configuration);
    }

    ArrayList P() {
        ArrayList arrayList;
        e eVar = this.f2087a0;
        return (eVar == null || (arrayList = eVar.f2127i) == null) ? new ArrayList() : arrayList;
    }

    boolean P0(MenuItem menuItem) {
        if (this.P) {
            return false;
        }
        if (k0(menuItem)) {
            return true;
        }
        return this.K.A(menuItem);
    }

    ArrayList Q() {
        ArrayList arrayList;
        e eVar = this.f2087a0;
        return (eVar == null || (arrayList = eVar.f2128j) == null) ? new ArrayList() : arrayList;
    }

    void Q0(Bundle bundle) {
        this.K.P0();
        this.f2103q = 1;
        this.V = false;
        this.f2095i0.a(new androidx.lifecycle.i() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.i
            public void c(androidx.lifecycle.k kVar, g.b bVar) {
                View view;
                if (bVar != g.b.ON_STOP || (view = Fragment.this.X) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.f2099m0.c(bundle);
        l0(bundle);
        this.f2093g0 = true;
        if (this.V) {
            this.f2095i0.h(g.b.ON_CREATE);
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public final Fragment R() {
        String str;
        Fragment fragment = this.f2110x;
        if (fragment != null) {
            return fragment;
        }
        n nVar = this.I;
        if (nVar == null || (str = this.f2111y) == null) {
            return null;
        }
        return nVar.e0(str);
    }

    boolean R0(Menu menu, MenuInflater menuInflater) {
        boolean z7 = false;
        if (this.P) {
            return false;
        }
        if (this.T && this.U) {
            o0(menu, menuInflater);
            z7 = true;
        }
        return this.K.C(menu, menuInflater) | z7;
    }

    public View S() {
        return this.X;
    }

    void S0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.K.P0();
        this.G = true;
        this.f2096j0 = new z(this, h());
        View p02 = p0(layoutInflater, viewGroup, bundle);
        this.X = p02;
        if (p02 == null) {
            if (this.f2096j0.d()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f2096j0 = null;
        } else {
            this.f2096j0.b();
            androidx.lifecycle.a0.a(this.X, this.f2096j0);
            androidx.lifecycle.b0.a(this.X, this.f2096j0);
            androidx.savedstate.d.a(this.X, this.f2096j0);
            this.f2097k0.j(this.f2096j0);
        }
    }

    public LiveData T() {
        return this.f2097k0;
    }

    void T0() {
        this.K.D();
        this.f2095i0.h(g.b.ON_DESTROY);
        this.f2103q = 0;
        this.V = false;
        this.f2093g0 = false;
        q0();
        if (this.V) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void U0() {
        this.K.E();
        if (this.X != null && this.f2096j0.t().b().c(g.c.CREATED)) {
            this.f2096j0.a(g.b.ON_DESTROY);
        }
        this.f2103q = 1;
        this.V = false;
        s0();
        if (this.V) {
            androidx.loader.app.a.b(this).c();
            this.G = false;
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void V() {
        U();
        this.f2108v = UUID.randomUUID().toString();
        this.B = false;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.H = 0;
        this.I = null;
        this.K = new o();
        this.J = null;
        this.M = 0;
        this.N = 0;
        this.O = null;
        this.P = false;
        this.Q = false;
    }

    void V0() {
        this.f2103q = -1;
        this.V = false;
        t0();
        this.f2092f0 = null;
        if (this.V) {
            if (this.K.C0()) {
                return;
            }
            this.K.D();
            this.K = new o();
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater W0(Bundle bundle) {
        LayoutInflater u02 = u0(bundle);
        this.f2092f0 = u02;
        return u02;
    }

    boolean X() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return false;
        }
        return eVar.f2141w;
    }

    void X0() {
        onLowMemory();
        this.K.F();
    }

    final boolean Y() {
        return this.H > 0;
    }

    void Y0(boolean z7) {
        y0(z7);
        this.K.G(z7);
    }

    public final boolean Z() {
        if (!this.U) {
            return false;
        }
        n nVar = this.I;
        return nVar == null || nVar.F0(this.L);
    }

    boolean Z0(MenuItem menuItem) {
        if (this.P) {
            return false;
        }
        if (this.T && this.U && z0(menuItem)) {
            return true;
        }
        return this.K.I(menuItem);
    }

    boolean a0() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return false;
        }
        return eVar.f2139u;
    }

    void a1(Menu menu) {
        if (this.P) {
            return;
        }
        if (this.T && this.U) {
            A0(menu);
        }
        this.K.J(menu);
    }

    public final boolean b0() {
        return this.C;
    }

    void b1() {
        this.K.L();
        if (this.X != null) {
            this.f2096j0.a(g.b.ON_PAUSE);
        }
        this.f2095i0.h(g.b.ON_PAUSE);
        this.f2103q = 6;
        this.V = false;
        B0();
        if (this.V) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onPause()");
    }

    final boolean c0() {
        Fragment E = E();
        if (E != null) {
            return E.b0() || E.c0();
        }
        return false;
    }

    void c1(boolean z7) {
        C0(z7);
        this.K.M(z7);
    }

    public final boolean d0() {
        n nVar = this.I;
        if (nVar == null) {
            return false;
        }
        return nVar.I0();
    }

    boolean d1(Menu menu) {
        boolean z7 = false;
        if (this.P) {
            return false;
        }
        if (this.T && this.U) {
            D0(menu);
            z7 = true;
        }
        return this.K.N(menu) | z7;
    }

    void e(boolean z7) {
        ViewGroup viewGroup;
        n nVar;
        e eVar = this.f2087a0;
        g gVar = null;
        if (eVar != null) {
            eVar.f2139u = false;
            g gVar2 = eVar.f2140v;
            eVar.f2140v = null;
            gVar = gVar2;
        }
        if (gVar != null) {
            gVar.b();
            return;
        }
        if (!n.P || this.X == null || (viewGroup = this.W) == null || (nVar = this.I) == null) {
            return;
        }
        b0 n7 = b0.n(viewGroup, nVar);
        n7.p();
        if (z7) {
            this.J.k().post(new c(n7));
        } else {
            n7.g();
        }
    }

    void e0() {
        this.K.P0();
    }

    void e1() {
        boolean G0 = this.I.G0(this);
        Boolean bool = this.A;
        if (bool == null || bool.booleanValue() != G0) {
            this.A = Boolean.valueOf(G0);
            E0(G0);
            this.K.O();
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    androidx.fragment.app.g f() {
        return new d();
    }

    public void f0(Bundle bundle) {
        this.V = true;
    }

    void f1() {
        this.K.P0();
        this.K.Z(true);
        this.f2103q = 7;
        this.V = false;
        G0();
        if (!this.V) {
            throw new d0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.l lVar = this.f2095i0;
        g.b bVar = g.b.ON_RESUME;
        lVar.h(bVar);
        if (this.X != null) {
            this.f2096j0.a(bVar);
        }
        this.K.P();
    }

    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.M));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.N));
        printWriter.print(" mTag=");
        printWriter.println(this.O);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2103q);
        printWriter.print(" mWho=");
        printWriter.print(this.f2108v);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.B);
        printWriter.print(" mRemoving=");
        printWriter.print(this.C);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.D);
        printWriter.print(" mInLayout=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.P);
        printWriter.print(" mDetached=");
        printWriter.print(this.Q);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.U);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.T);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.R);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.Z);
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.J);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.L);
        }
        if (this.f2109w != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2109w);
        }
        if (this.f2104r != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2104r);
        }
        if (this.f2105s != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2105s);
        }
        if (this.f2106t != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2106t);
        }
        Fragment R = R();
        if (R != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(R);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2112z);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(G());
        if (s() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(s());
        }
        if (w() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(w());
        }
        if (H() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(H());
        }
        if (I() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(I());
        }
        if (this.W != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.W);
        }
        if (this.X != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.X);
        }
        if (o() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(o());
        }
        if (r() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.K + ":");
        this.K.V(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public void g0(int i7, int i8, Intent intent) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i7 + " resultCode: " + i8 + " data: " + intent);
        }
    }

    void g1(Bundle bundle) {
        H0(bundle);
        this.f2099m0.d(bundle);
        Parcelable d12 = this.K.d1();
        if (d12 != null) {
            bundle.putParcelable("android:support:fragments", d12);
        }
    }

    @Override // androidx.lifecycle.z
    public androidx.lifecycle.y h() {
        if (this.I == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (C() != g.c.INITIALIZED.ordinal()) {
            return this.I.y0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    public void h0(Activity activity) {
        this.V = true;
    }

    void h1() {
        this.K.P0();
        this.K.Z(true);
        this.f2103q = 5;
        this.V = false;
        I0();
        if (!this.V) {
            throw new d0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.l lVar = this.f2095i0;
        g.b bVar = g.b.ON_START;
        lVar.h(bVar);
        if (this.X != null) {
            this.f2096j0.a(bVar);
        }
        this.K.Q();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void i0(Context context) {
        this.V = true;
        k kVar = this.J;
        Activity g8 = kVar == null ? null : kVar.g();
        if (g8 != null) {
            this.V = false;
            h0(g8);
        }
    }

    void i1() {
        this.K.S();
        if (this.X != null) {
            this.f2096j0.a(g.b.ON_STOP);
        }
        this.f2095i0.h(g.b.ON_STOP);
        this.f2103q = 4;
        this.V = false;
        J0();
        if (this.V) {
            return;
        }
        throw new d0("Fragment " + this + " did not call through to super.onStop()");
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry j() {
        return this.f2099m0.b();
    }

    void j1() {
        K0(this.X, this.f2104r);
        this.K.T();
    }

    Fragment k(String str) {
        return str.equals(this.f2108v) ? this : this.K.h0(str);
    }

    public boolean k0(MenuItem menuItem) {
        return false;
    }

    public final androidx.fragment.app.e k1() {
        androidx.fragment.app.e l7 = l();
        if (l7 != null) {
            return l7;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final androidx.fragment.app.e l() {
        k kVar = this.J;
        if (kVar == null) {
            return null;
        }
        return (androidx.fragment.app.e) kVar.g();
    }

    public void l0(Bundle bundle) {
        this.V = true;
        n1(bundle);
        if (this.K.H0(1)) {
            return;
        }
        this.K.B();
    }

    public final Context l1() {
        Context r7 = r();
        if (r7 != null) {
            return r7;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public boolean m() {
        Boolean bool;
        e eVar = this.f2087a0;
        if (eVar == null || (bool = eVar.f2136r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animation m0(int i7, boolean z7, int i8) {
        return null;
    }

    public final View m1() {
        View S = S();
        if (S != null) {
            return S;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public boolean n() {
        Boolean bool;
        e eVar = this.f2087a0;
        if (eVar == null || (bool = eVar.f2135q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public Animator n0(int i7, boolean z7, int i8) {
        return null;
    }

    void n1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.K.b1(parcelable);
        this.K.B();
    }

    View o() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return null;
        }
        return eVar.f2119a;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.V = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        k1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.V = true;
    }

    Animator p() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return null;
        }
        return eVar.f2120b;
    }

    public View p0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i7 = this.f2100n0;
        if (i7 != 0) {
            return layoutInflater.inflate(i7, viewGroup, false);
        }
        return null;
    }

    final void p1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f2105s;
        if (sparseArray != null) {
            this.X.restoreHierarchyState(sparseArray);
            this.f2105s = null;
        }
        if (this.X != null) {
            this.f2096j0.e(this.f2106t);
            this.f2106t = null;
        }
        this.V = false;
        L0(bundle);
        if (this.V) {
            if (this.X != null) {
                this.f2096j0.a(g.b.ON_CREATE);
            }
        } else {
            throw new d0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public final n q() {
        if (this.J != null) {
            return this.K;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public void q0() {
        this.V = true;
    }

    void q1(View view) {
        i().f2119a = view;
    }

    public Context r() {
        k kVar = this.J;
        if (kVar == null) {
            return null;
        }
        return kVar.i();
    }

    void r1(int i7, int i8, int i9, int i10) {
        if (this.f2087a0 == null && i7 == 0 && i8 == 0 && i9 == 0 && i10 == 0) {
            return;
        }
        i().f2122d = i7;
        i().f2123e = i8;
        i().f2124f = i9;
        i().f2125g = i10;
    }

    int s() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2122d;
    }

    public void s0() {
        this.V = true;
    }

    void s1(Animator animator) {
        i().f2120b = animator;
    }

    public void startActivityForResult(Intent intent, int i7) {
        B1(intent, i7, null);
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.g t() {
        return this.f2095i0;
    }

    public void t0() {
        this.V = true;
    }

    public void t1(Bundle bundle) {
        if (this.I != null && d0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f2109w = bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.f2108v);
        if (this.M != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.M));
        }
        if (this.O != null) {
            sb.append(" tag=");
            sb.append(this.O);
        }
        sb.append(")");
        return sb.toString();
    }

    public Object u() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return null;
        }
        return eVar.f2129k;
    }

    public LayoutInflater u0(Bundle bundle) {
        return B(bundle);
    }

    void u1(View view) {
        i().f2138t = view;
    }

    androidx.core.app.o v() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return null;
        }
        eVar.getClass();
        return null;
    }

    void v1(boolean z7) {
        i().f2141w = z7;
    }

    int w() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return 0;
        }
        return eVar.f2123e;
    }

    public void w0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.V = true;
    }

    void w1(int i7) {
        if (this.f2087a0 == null && i7 == 0) {
            return;
        }
        i();
        this.f2087a0.f2126h = i7;
    }

    public Object x() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return null;
        }
        return eVar.f2131m;
    }

    public void x0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.V = true;
        k kVar = this.J;
        Activity g8 = kVar == null ? null : kVar.g();
        if (g8 != null) {
            this.V = false;
            w0(g8, attributeSet, bundle);
        }
    }

    void x1(g gVar) {
        i();
        e eVar = this.f2087a0;
        g gVar2 = eVar.f2140v;
        if (gVar == gVar2) {
            return;
        }
        if (gVar != null && gVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (eVar.f2139u) {
            eVar.f2140v = gVar;
        }
        if (gVar != null) {
            gVar.a();
        }
    }

    androidx.core.app.o y() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return null;
        }
        eVar.getClass();
        return null;
    }

    void y1(boolean z7) {
        if (this.f2087a0 == null) {
            return;
        }
        i().f2121c = z7;
    }

    View z() {
        e eVar = this.f2087a0;
        if (eVar == null) {
            return null;
        }
        return eVar.f2138t;
    }

    public boolean z0(MenuItem menuItem) {
        return false;
    }

    void z1(float f8) {
        i().f2137s = f8;
    }

    public void r0() {
    }

    public void A0(Menu menu) {
    }

    public void C0(boolean z7) {
    }

    public void D0(Menu menu) {
    }

    public void E0(boolean z7) {
    }

    public void H0(Bundle bundle) {
    }

    public void j0(Fragment fragment) {
    }

    public void v0(boolean z7) {
    }

    public void y0(boolean z7) {
    }

    public void K0(View view, Bundle bundle) {
    }

    public void o0(Menu menu, MenuInflater menuInflater) {
    }

    public void F0(int i7, String[] strArr, int[] iArr) {
    }
}
