package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.e0;
import androidx.fragment.app.b0;
import androidx.lifecycle.g;

/* compiled from: MyApplication */
class t {

    /* renamed from: a, reason: collision with root package name */
    private final m f2358a;

    /* renamed from: b, reason: collision with root package name */
    private final u f2359b;

    /* renamed from: c, reason: collision with root package name */
    private final Fragment f2360c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f2361d = false;

    /* renamed from: e, reason: collision with root package name */
    private int f2362e = -1;

    /* compiled from: MyApplication */
    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2365a;

        static {
            int[] iArr = new int[g.c.values().length];
            f2365a = iArr;
            try {
                iArr[g.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2365a[g.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2365a[g.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2365a[g.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    t(m mVar, u uVar, Fragment fragment) {
        this.f2358a = mVar;
        this.f2359b = uVar;
        this.f2360c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f2360c.X) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f2360c.X) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f2360c.g1(bundle);
        this.f2358a.j(this.f2360c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f2360c.X != null) {
            s();
        }
        if (this.f2360c.f2105s != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f2360c.f2105s);
        }
        if (this.f2360c.f2106t != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f2360c.f2106t);
        }
        if (!this.f2360c.Z) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f2360c.Z);
        }
        return bundle;
    }

    void a() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f2360c);
        }
        Fragment fragment = this.f2360c;
        fragment.M0(fragment.f2104r);
        m mVar = this.f2358a;
        Fragment fragment2 = this.f2360c;
        mVar.a(fragment2, fragment2.f2104r, false);
    }

    void b() {
        int j7 = this.f2359b.j(this.f2360c);
        Fragment fragment = this.f2360c;
        fragment.W.addView(fragment.X, j7);
    }

    void c() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f2360c);
        }
        Fragment fragment = this.f2360c;
        Fragment fragment2 = fragment.f2110x;
        t tVar = null;
        if (fragment2 != null) {
            t m7 = this.f2359b.m(fragment2.f2108v);
            if (m7 == null) {
                throw new IllegalStateException("Fragment " + this.f2360c + " declared target fragment " + this.f2360c.f2110x + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f2360c;
            fragment3.f2111y = fragment3.f2110x.f2108v;
            fragment3.f2110x = null;
            tVar = m7;
        } else {
            String str = fragment.f2111y;
            if (str != null && (tVar = this.f2359b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f2360c + " declared target fragment " + this.f2360c.f2111y + " that does not belong to this FragmentManager!");
            }
        }
        if (tVar != null && (n.P || tVar.k().f2103q < 1)) {
            tVar.m();
        }
        Fragment fragment4 = this.f2360c;
        fragment4.J = fragment4.I.r0();
        Fragment fragment5 = this.f2360c;
        fragment5.L = fragment5.I.u0();
        this.f2358a.g(this.f2360c, false);
        this.f2360c.N0();
        this.f2358a.b(this.f2360c, false);
    }

    int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f2360c;
        if (fragment2.I == null) {
            return fragment2.f2103q;
        }
        int i7 = this.f2362e;
        int i8 = b.f2365a[fragment2.f2094h0.ordinal()];
        if (i8 != 1) {
            i7 = i8 != 2 ? i8 != 3 ? i8 != 4 ? Math.min(i7, -1) : Math.min(i7, 0) : Math.min(i7, 1) : Math.min(i7, 5);
        }
        Fragment fragment3 = this.f2360c;
        if (fragment3.D) {
            if (fragment3.E) {
                i7 = Math.max(this.f2362e, 2);
                View view = this.f2360c.X;
                if (view != null && view.getParent() == null) {
                    i7 = Math.min(i7, 2);
                }
            } else {
                i7 = this.f2362e < 4 ? Math.min(i7, fragment3.f2103q) : Math.min(i7, 1);
            }
        }
        if (!this.f2360c.B) {
            i7 = Math.min(i7, 1);
        }
        b0.e.b l7 = (!n.P || (viewGroup = (fragment = this.f2360c).W) == null) ? null : b0.n(viewGroup, fragment.F()).l(this);
        if (l7 == b0.e.b.ADDING) {
            i7 = Math.min(i7, 6);
        } else if (l7 == b0.e.b.REMOVING) {
            i7 = Math.max(i7, 3);
        } else {
            Fragment fragment4 = this.f2360c;
            if (fragment4.C) {
                i7 = fragment4.Y() ? Math.min(i7, 1) : Math.min(i7, -1);
            }
        }
        Fragment fragment5 = this.f2360c;
        if (fragment5.Y && fragment5.f2103q < 5) {
            i7 = Math.min(i7, 4);
        }
        if (n.D0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i7 + " for " + this.f2360c);
        }
        return i7;
    }

    void e() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f2360c);
        }
        Fragment fragment = this.f2360c;
        if (fragment.f2093g0) {
            fragment.n1(fragment.f2104r);
            this.f2360c.f2103q = 1;
            return;
        }
        this.f2358a.h(fragment, fragment.f2104r, false);
        Fragment fragment2 = this.f2360c;
        fragment2.Q0(fragment2.f2104r);
        m mVar = this.f2358a;
        Fragment fragment3 = this.f2360c;
        mVar.c(fragment3, fragment3.f2104r, false);
    }

    void f() {
        String str;
        if (this.f2360c.D) {
            return;
        }
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2360c);
        }
        Fragment fragment = this.f2360c;
        LayoutInflater W0 = fragment.W0(fragment.f2104r);
        Fragment fragment2 = this.f2360c;
        ViewGroup viewGroup = fragment2.W;
        if (viewGroup == null) {
            int i7 = fragment2.N;
            if (i7 == 0) {
                viewGroup = null;
            } else {
                if (i7 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f2360c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.I.m0().d(this.f2360c.N);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f2360c;
                    if (!fragment3.F) {
                        try {
                            str = fragment3.L().getResourceName(this.f2360c.N);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f2360c.N) + " (" + str + ") for fragment " + this.f2360c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f2360c;
        fragment4.W = viewGroup;
        fragment4.S0(W0, viewGroup, fragment4.f2104r);
        View view = this.f2360c.X;
        if (view != null) {
            boolean z7 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f2360c;
            fragment5.X.setTag(k0.b.f24334a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f2360c;
            if (fragment6.P) {
                fragment6.X.setVisibility(8);
            }
            if (e0.A(this.f2360c.X)) {
                e0.K(this.f2360c.X);
            } else {
                View view2 = this.f2360c.X;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f2360c.j1();
            m mVar = this.f2358a;
            Fragment fragment7 = this.f2360c;
            mVar.m(fragment7, fragment7.X, fragment7.f2104r, false);
            int visibility = this.f2360c.X.getVisibility();
            float alpha = this.f2360c.X.getAlpha();
            if (n.P) {
                this.f2360c.z1(alpha);
                Fragment fragment8 = this.f2360c;
                if (fragment8.W != null && visibility == 0) {
                    View findFocus = fragment8.X.findFocus();
                    if (findFocus != null) {
                        this.f2360c.u1(findFocus);
                        if (n.D0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f2360c);
                        }
                    }
                    this.f2360c.X.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f2360c;
                if (visibility == 0 && fragment9.W != null) {
                    z7 = true;
                }
                fragment9.f2089c0 = z7;
            }
        }
        this.f2360c.f2103q = 2;
    }

    void g() {
        Fragment f8;
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f2360c);
        }
        Fragment fragment = this.f2360c;
        boolean z7 = true;
        boolean z8 = fragment.C && !fragment.Y();
        if (!z8 && !this.f2359b.o().o(this.f2360c)) {
            String str = this.f2360c.f2111y;
            if (str != null && (f8 = this.f2359b.f(str)) != null && f8.R) {
                this.f2360c.f2110x = f8;
            }
            this.f2360c.f2103q = 0;
            return;
        }
        k kVar = this.f2360c.J;
        if (kVar instanceof androidx.lifecycle.z) {
            z7 = this.f2359b.o().l();
        } else if (kVar.i() instanceof Activity) {
            z7 = true ^ ((Activity) kVar.i()).isChangingConfigurations();
        }
        if (z8 || z7) {
            this.f2359b.o().f(this.f2360c);
        }
        this.f2360c.T0();
        this.f2358a.d(this.f2360c, false);
        for (t tVar : this.f2359b.k()) {
            if (tVar != null) {
                Fragment k7 = tVar.k();
                if (this.f2360c.f2108v.equals(k7.f2111y)) {
                    k7.f2110x = this.f2360c;
                    k7.f2111y = null;
                }
            }
        }
        Fragment fragment2 = this.f2360c;
        String str2 = fragment2.f2111y;
        if (str2 != null) {
            fragment2.f2110x = this.f2359b.f(str2);
        }
        this.f2359b.q(this);
    }

    void h() {
        View view;
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f2360c);
        }
        Fragment fragment = this.f2360c;
        ViewGroup viewGroup = fragment.W;
        if (viewGroup != null && (view = fragment.X) != null) {
            viewGroup.removeView(view);
        }
        this.f2360c.U0();
        this.f2358a.n(this.f2360c, false);
        Fragment fragment2 = this.f2360c;
        fragment2.W = null;
        fragment2.X = null;
        fragment2.f2096j0 = null;
        fragment2.f2097k0.j(null);
        this.f2360c.E = false;
    }

    void i() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f2360c);
        }
        this.f2360c.V0();
        this.f2358a.e(this.f2360c, false);
        Fragment fragment = this.f2360c;
        fragment.f2103q = -1;
        fragment.J = null;
        fragment.L = null;
        fragment.I = null;
        if ((!fragment.C || fragment.Y()) && !this.f2359b.o().o(this.f2360c)) {
            return;
        }
        if (n.D0(3)) {
            Log.d("FragmentManager", "initState called for fragment: " + this.f2360c);
        }
        this.f2360c.V();
    }

    void j() {
        Fragment fragment = this.f2360c;
        if (fragment.D && fragment.E && !fragment.G) {
            if (n.D0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f2360c);
            }
            Fragment fragment2 = this.f2360c;
            fragment2.S0(fragment2.W0(fragment2.f2104r), null, this.f2360c.f2104r);
            View view = this.f2360c.X;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f2360c;
                fragment3.X.setTag(k0.b.f24334a, fragment3);
                Fragment fragment4 = this.f2360c;
                if (fragment4.P) {
                    fragment4.X.setVisibility(8);
                }
                this.f2360c.j1();
                m mVar = this.f2358a;
                Fragment fragment5 = this.f2360c;
                mVar.m(fragment5, fragment5.X, fragment5.f2104r, false);
                this.f2360c.f2103q = 2;
            }
        }
    }

    Fragment k() {
        return this.f2360c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f2361d) {
            if (n.D0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f2361d = true;
            while (true) {
                int d8 = d();
                Fragment fragment = this.f2360c;
                int i7 = fragment.f2103q;
                if (d8 == i7) {
                    if (n.P && fragment.f2090d0) {
                        if (fragment.X != null && (viewGroup = fragment.W) != null) {
                            b0 n7 = b0.n(viewGroup, fragment.F());
                            if (this.f2360c.P) {
                                n7.c(this);
                            } else {
                                n7.e(this);
                            }
                        }
                        Fragment fragment2 = this.f2360c;
                        n nVar = fragment2.I;
                        if (nVar != null) {
                            nVar.B0(fragment2);
                        }
                        Fragment fragment3 = this.f2360c;
                        fragment3.f2090d0 = false;
                        fragment3.v0(fragment3.P);
                    }
                    this.f2361d = false;
                    return;
                }
                if (d8 <= i7) {
                    switch (i7 - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            this.f2360c.f2103q = 1;
                            break;
                        case 2:
                            fragment.E = false;
                            fragment.f2103q = 2;
                            break;
                        case 3:
                            if (n.D0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f2360c);
                            }
                            Fragment fragment4 = this.f2360c;
                            if (fragment4.X != null && fragment4.f2105s == null) {
                                s();
                            }
                            Fragment fragment5 = this.f2360c;
                            if (fragment5.X != null && (viewGroup3 = fragment5.W) != null) {
                                b0.n(viewGroup3, fragment5.F()).d(this);
                            }
                            this.f2360c.f2103q = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.f2103q = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i7 + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.X != null && (viewGroup2 = fragment.W) != null) {
                                b0.n(viewGroup2, fragment.F()).b(b0.e.c.d(this.f2360c.X.getVisibility()), this);
                            }
                            this.f2360c.f2103q = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.f2103q = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
            }
        } catch (Throwable th) {
            this.f2361d = false;
            throw th;
        }
    }

    void n() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f2360c);
        }
        this.f2360c.b1();
        this.f2358a.f(this.f2360c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f2360c.f2104r;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f2360c;
        fragment.f2105s = fragment.f2104r.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f2360c;
        fragment2.f2106t = fragment2.f2104r.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f2360c;
        fragment3.f2111y = fragment3.f2104r.getString("android:target_state");
        Fragment fragment4 = this.f2360c;
        if (fragment4.f2111y != null) {
            fragment4.f2112z = fragment4.f2104r.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f2360c;
        Boolean bool = fragment5.f2107u;
        if (bool != null) {
            fragment5.Z = bool.booleanValue();
            this.f2360c.f2107u = null;
        } else {
            fragment5.Z = fragment5.f2104r.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f2360c;
        if (fragment6.Z) {
            return;
        }
        fragment6.Y = true;
    }

    void p() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f2360c);
        }
        View z7 = this.f2360c.z();
        if (z7 != null && l(z7)) {
            boolean requestFocus = z7.requestFocus();
            if (n.D0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(z7);
                sb.append(" ");
                sb.append(requestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f2360c);
                sb.append(" resulting in focused view ");
                sb.append(this.f2360c.X.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f2360c.u1(null);
        this.f2360c.f1();
        this.f2358a.i(this.f2360c, false);
        Fragment fragment = this.f2360c;
        fragment.f2104r = null;
        fragment.f2105s = null;
        fragment.f2106t = null;
    }

    s r() {
        s sVar = new s(this.f2360c);
        Fragment fragment = this.f2360c;
        if (fragment.f2103q <= -1 || sVar.C != null) {
            sVar.C = fragment.f2104r;
            return sVar;
        }
        Bundle q7 = q();
        sVar.C = q7;
        if (this.f2360c.f2111y != null) {
            if (q7 == null) {
                sVar.C = new Bundle();
            }
            sVar.C.putString("android:target_state", this.f2360c.f2111y);
            int i7 = this.f2360c.f2112z;
            if (i7 != 0) {
                sVar.C.putInt("android:target_req_state", i7);
            }
        }
        return sVar;
    }

    void s() {
        if (this.f2360c.X == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f2360c.X.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f2360c.f2105s = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f2360c.f2096j0.f(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f2360c.f2106t = bundle;
    }

    void t(int i7) {
        this.f2362e = i7;
    }

    void u() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f2360c);
        }
        this.f2360c.h1();
        this.f2358a.k(this.f2360c, false);
    }

    void v() {
        if (n.D0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f2360c);
        }
        this.f2360c.i1();
        this.f2358a.l(this.f2360c, false);
    }

    t(m mVar, u uVar, ClassLoader classLoader, j jVar, s sVar) {
        this.f2358a = mVar;
        this.f2359b = uVar;
        Fragment a8 = jVar.a(classLoader, sVar.f2348q);
        this.f2360c = a8;
        Bundle bundle = sVar.f2357z;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a8.t1(sVar.f2357z);
        a8.f2108v = sVar.f2349r;
        a8.D = sVar.f2350s;
        a8.F = true;
        a8.M = sVar.f2351t;
        a8.N = sVar.f2352u;
        a8.O = sVar.f2353v;
        a8.R = sVar.f2354w;
        a8.C = sVar.f2355x;
        a8.Q = sVar.f2356y;
        a8.P = sVar.A;
        a8.f2094h0 = g.c.values()[sVar.B];
        Bundle bundle2 = sVar.C;
        if (bundle2 != null) {
            a8.f2104r = bundle2;
        } else {
            a8.f2104r = new Bundle();
        }
        if (n.D0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a8);
        }
    }

    /* compiled from: MyApplication */
    class a implements View.OnAttachStateChangeListener {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ View f2363q;

        a(View view) {
            this.f2363q = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f2363q.removeOnAttachStateChangeListener(this);
            e0.K(this.f2363q);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    t(m mVar, u uVar, Fragment fragment, s sVar) {
        this.f2358a = mVar;
        this.f2359b = uVar;
        this.f2360c = fragment;
        fragment.f2105s = null;
        fragment.f2106t = null;
        fragment.H = 0;
        fragment.E = false;
        fragment.B = false;
        Fragment fragment2 = fragment.f2110x;
        fragment.f2111y = fragment2 != null ? fragment2.f2108v : null;
        fragment.f2110x = null;
        Bundle bundle = sVar.C;
        if (bundle != null) {
            fragment.f2104r = bundle;
        } else {
            fragment.f2104r = new Bundle();
        }
    }
}
