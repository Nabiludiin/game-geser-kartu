package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.f;
import androidx.fragment.app.v;
import androidx.fragment.app.w;
import androidx.lifecycle.g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MyApplication */
public abstract class n {
    private static boolean O = false;
    static boolean P = true;
    private androidx.activity.result.c A;
    private androidx.activity.result.c B;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private ArrayList I;
    private ArrayList J;
    private ArrayList K;
    private ArrayList L;
    private q M;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2284b;

    /* renamed from: d, reason: collision with root package name */
    ArrayList f2286d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f2287e;

    /* renamed from: g, reason: collision with root package name */
    private OnBackPressedDispatcher f2289g;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList f2294l;

    /* renamed from: r, reason: collision with root package name */
    private androidx.fragment.app.k f2300r;

    /* renamed from: s, reason: collision with root package name */
    private androidx.fragment.app.g f2301s;

    /* renamed from: t, reason: collision with root package name */
    private Fragment f2302t;

    /* renamed from: u, reason: collision with root package name */
    Fragment f2303u;

    /* renamed from: z, reason: collision with root package name */
    private androidx.activity.result.c f2308z;

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f2283a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final u f2285c = new u();

    /* renamed from: f, reason: collision with root package name */
    private final androidx.fragment.app.l f2288f = new androidx.fragment.app.l(this);

    /* renamed from: h, reason: collision with root package name */
    private final androidx.activity.b f2290h = new c(false);

    /* renamed from: i, reason: collision with root package name */
    private final AtomicInteger f2291i = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private final Map f2292j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k, reason: collision with root package name */
    private final Map f2293k = Collections.synchronizedMap(new HashMap());

    /* renamed from: m, reason: collision with root package name */
    private Map f2295m = Collections.synchronizedMap(new HashMap());

    /* renamed from: n, reason: collision with root package name */
    private final w.g f2296n = new d();

    /* renamed from: o, reason: collision with root package name */
    private final androidx.fragment.app.m f2297o = new androidx.fragment.app.m(this);

    /* renamed from: p, reason: collision with root package name */
    private final CopyOnWriteArrayList f2298p = new CopyOnWriteArrayList();

    /* renamed from: q, reason: collision with root package name */
    int f2299q = -1;

    /* renamed from: v, reason: collision with root package name */
    private androidx.fragment.app.j f2304v = null;

    /* renamed from: w, reason: collision with root package name */
    private androidx.fragment.app.j f2305w = new e();

    /* renamed from: x, reason: collision with root package name */
    private c0 f2306x = null;

    /* renamed from: y, reason: collision with root package name */
    private c0 f2307y = new f();
    ArrayDeque C = new ArrayDeque();
    private Runnable N = new g();

    /* compiled from: MyApplication */
    class a implements androidx.activity.result.b {
        a() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            l lVar = (l) n.this.C.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = lVar.f2323q;
            int i7 = lVar.f2324r;
            Fragment i8 = n.this.f2285c.i(str);
            if (i8 != null) {
                i8.g0(i7, aVar.f(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: MyApplication */
    class b implements androidx.activity.result.b {
        b() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                iArr[i7] = ((Boolean) arrayList.get(i7)).booleanValue() ? 0 : -1;
            }
            l lVar = (l) n.this.C.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No permissions were requested for " + this);
                return;
            }
            String str = lVar.f2323q;
            int i8 = lVar.f2324r;
            Fragment i9 = n.this.f2285c.i(str);
            if (i9 != null) {
                i9.F0(i8, strArr, iArr);
                return;
            }
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: MyApplication */
    class c extends androidx.activity.b {
        c(boolean z7) {
            super(z7);
        }

        @Override // androidx.activity.b
        public void b() {
            n.this.z0();
        }
    }

    /* compiled from: MyApplication */
    class d implements w.g {
        d() {
        }

        @Override // androidx.fragment.app.w.g
        public void a(Fragment fragment, androidx.core.os.c cVar) {
            if (cVar.b()) {
                return;
            }
            n.this.X0(fragment, cVar);
        }

        @Override // androidx.fragment.app.w.g
        public void b(Fragment fragment, androidx.core.os.c cVar) {
            n.this.f(fragment, cVar);
        }
    }

    /* compiled from: MyApplication */
    class e extends androidx.fragment.app.j {
        e() {
        }

        @Override // androidx.fragment.app.j
        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.r0().b(n.this.r0().i(), str, null);
        }
    }

    /* compiled from: MyApplication */
    class f implements c0 {
        f() {
        }

        @Override // androidx.fragment.app.c0
        public b0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.c(viewGroup);
        }
    }

    /* compiled from: MyApplication */
    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.Z(true);
        }
    }

    /* compiled from: MyApplication */
    class h extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2316a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2317b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f2318c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f2316a = viewGroup;
            this.f2317b = view;
            this.f2318c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2316a.endViewTransition(this.f2317b);
            animator.removeListener(this);
            Fragment fragment = this.f2318c;
            View view = fragment.X;
            if (view == null || !fragment.P) {
                return;
            }
            view.setVisibility(8);
        }
    }

    /* compiled from: MyApplication */
    class i implements r {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f2320q;

        i(Fragment fragment) {
            this.f2320q = fragment;
        }

        @Override // androidx.fragment.app.r
        public void a(n nVar, Fragment fragment) {
            this.f2320q.j0(fragment);
        }
    }

    /* compiled from: MyApplication */
    class j implements androidx.activity.result.b {
        j() {
        }

        @Override // androidx.activity.result.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            l lVar = (l) n.this.C.pollFirst();
            if (lVar == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = lVar.f2323q;
            int i7 = lVar.f2324r;
            Fragment i8 = n.this.f2285c.i(str);
            if (i8 != null) {
                i8.g0(i7, aVar.f(), aVar.a());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* compiled from: MyApplication */
    static class k extends e.a {
        k() {
        }

        @Override // e.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, androidx.activity.result.e eVar) {
            Bundle bundleExtra;
            Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
            Intent a8 = eVar.a();
            if (a8 != null && (bundleExtra = a8.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                a8.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                if (a8.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    eVar = new e.b(eVar.v()).b(null).c(eVar.i(), eVar.f()).a();
                }
            }
            intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", eVar);
            if (n.D0(2)) {
                Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }

        @Override // e.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a c(int i7, Intent intent) {
            return new androidx.activity.result.a(i7, intent);
        }
    }

    /* compiled from: MyApplication */
    interface m {
        boolean a(ArrayList arrayList, ArrayList arrayList2);
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.fragment.app.n$n, reason: collision with other inner class name */
    private class C0039n implements m {

        /* renamed from: a, reason: collision with root package name */
        final String f2325a;

        /* renamed from: b, reason: collision with root package name */
        final int f2326b;

        /* renamed from: c, reason: collision with root package name */
        final int f2327c;

        C0039n(String str, int i7, int i8) {
            this.f2325a = str;
            this.f2326b = i7;
            this.f2327c = i8;
        }

        @Override // androidx.fragment.app.n.m
        public boolean a(ArrayList arrayList, ArrayList arrayList2) {
            Fragment fragment = n.this.f2303u;
            if (fragment == null || this.f2326b >= 0 || this.f2325a != null || !fragment.q().T0()) {
                return n.this.V0(arrayList, arrayList2, this.f2325a, this.f2326b, this.f2327c);
            }
            return false;
        }
    }

    /* compiled from: MyApplication */
    static class o implements Fragment.g {

        /* renamed from: a, reason: collision with root package name */
        final boolean f2329a;

        /* renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f2330b;

        /* renamed from: c, reason: collision with root package name */
        private int f2331c;

        o(androidx.fragment.app.a aVar, boolean z7) {
            this.f2329a = z7;
            this.f2330b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.g
        public void a() {
            this.f2331c++;
        }

        @Override // androidx.fragment.app.Fragment.g
        public void b() {
            int i7 = this.f2331c - 1;
            this.f2331c = i7;
            if (i7 != 0) {
                return;
            }
            this.f2330b.f2145t.e1();
        }

        void c() {
            androidx.fragment.app.a aVar = this.f2330b;
            aVar.f2145t.s(aVar, this.f2329a, false, false);
        }

        void d() {
            boolean z7 = this.f2331c > 0;
            for (Fragment fragment : this.f2330b.f2145t.q0()) {
                fragment.x1(null);
                if (z7 && fragment.a0()) {
                    fragment.C1();
                }
            }
            androidx.fragment.app.a aVar = this.f2330b;
            aVar.f2145t.s(aVar, this.f2329a, !z7, true);
        }

        public boolean e() {
            return this.f2331c == 0;
        }
    }

    static boolean D0(int i7) {
        return O || Log.isLoggable("FragmentManager", i7);
    }

    private boolean E0(Fragment fragment) {
        return (fragment.T && fragment.U) || fragment.K.n();
    }

    private void K(Fragment fragment) {
        if (fragment == null || !fragment.equals(e0(fragment.f2108v))) {
            return;
        }
        fragment.e1();
    }

    private void K0(r.b bVar) {
        int size = bVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            Fragment fragment = (Fragment) bVar.l(i7);
            if (!fragment.B) {
                View m12 = fragment.m1();
                fragment.f2091e0 = m12.getAlpha();
                m12.setAlpha(0.0f);
            }
        }
    }

    private void R(int i7) {
        try {
            this.f2284b = true;
            this.f2285c.d(i7);
            M0(i7, false);
            if (P) {
                Iterator it = q().iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).j();
                }
            }
            this.f2284b = false;
            Z(true);
        } catch (Throwable th) {
            this.f2284b = false;
            throw th;
        }
    }

    private void U() {
        if (this.H) {
            this.H = false;
            k1();
        }
    }

    private boolean U0(String str, int i7, int i8) {
        Z(false);
        Y(true);
        Fragment fragment = this.f2303u;
        if (fragment != null && i7 < 0 && str == null && fragment.q().T0()) {
            return true;
        }
        boolean V0 = V0(this.I, this.J, str, i7, i8);
        if (V0) {
            this.f2284b = true;
            try {
                Z0(this.I, this.J);
            } finally {
                p();
            }
        }
        l1();
        U();
        this.f2285c.b();
        return V0;
    }

    private void W() {
        if (P) {
            Iterator it = q().iterator();
            while (it.hasNext()) {
                ((b0) it.next()).j();
            }
        } else {
            if (this.f2295m.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f2295m.keySet()) {
                m(fragment);
                N0(fragment);
            }
        }
    }

    private int W0(ArrayList arrayList, ArrayList arrayList2, int i7, int i8, r.b bVar) {
        int i9 = i8;
        for (int i10 = i8 - 1; i10 >= i7; i10--) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i10);
            boolean booleanValue = ((Boolean) arrayList2.get(i10)).booleanValue();
            if (aVar.x() && !aVar.v(arrayList, i10 + 1, i8)) {
                if (this.L == null) {
                    this.L = new ArrayList();
                }
                o oVar = new o(aVar, booleanValue);
                this.L.add(oVar);
                aVar.z(oVar);
                if (booleanValue) {
                    aVar.q();
                } else {
                    aVar.r(false);
                }
                i9--;
                if (i10 != i9) {
                    arrayList.remove(i10);
                    arrayList.add(i9, aVar);
                }
                d(bVar);
            }
        }
        return i9;
    }

    private void Y(boolean z7) {
        if (this.f2284b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2300r == null) {
            if (!this.G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f2300r.k().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z7) {
            o();
        }
        if (this.I == null) {
            this.I = new ArrayList();
            this.J = new ArrayList();
        }
        this.f2284b = true;
        try {
            d0(null, null);
        } finally {
            this.f2284b = false;
        }
    }

    private void Z0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        d0(arrayList, arrayList2);
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            if (!((androidx.fragment.app.a) arrayList.get(i7)).f2386r) {
                if (i8 != i7) {
                    c0(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i8 < size && ((Boolean) arrayList2.get(i8)).booleanValue() && !((androidx.fragment.app.a) arrayList.get(i8)).f2386r) {
                        i8++;
                    }
                }
                c0(arrayList, arrayList2, i7, i8);
                i7 = i8 - 1;
            }
            i7++;
        }
        if (i8 != size) {
            c0(arrayList, arrayList2, i8, size);
        }
    }

    private void a1() {
        ArrayList arrayList = this.f2294l;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f2294l.get(0));
        throw null;
    }

    private static void b0(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        while (i7 < i8) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i7);
            if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                aVar.m(-1);
                aVar.r(i7 == i8 + (-1));
            } else {
                aVar.m(1);
                aVar.q();
            }
            i7++;
        }
    }

    private void c0(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        int i9;
        ArrayList arrayList3 = arrayList2;
        int i10 = i7;
        int i11 = i8;
        boolean z7 = ((androidx.fragment.app.a) arrayList.get(i10)).f2386r;
        ArrayList arrayList4 = this.K;
        if (arrayList4 == null) {
            this.K = new ArrayList();
        } else {
            arrayList4.clear();
        }
        this.K.addAll(this.f2285c.n());
        Fragment v02 = v0();
        boolean z8 = false;
        for (int i12 = i10; i12 < i11; i12++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i12);
            v02 = !((Boolean) arrayList3.get(i12)).booleanValue() ? aVar.s(this.K, v02) : aVar.A(this.K, v02);
            z8 = z8 || aVar.f2377i;
        }
        this.K.clear();
        if (!z7 && this.f2299q >= 1) {
            if (P) {
                for (int i13 = i10; i13 < i11; i13++) {
                    ArrayList arrayList5 = ((androidx.fragment.app.a) arrayList.get(i13)).f2371c;
                    int size = arrayList5.size();
                    int i14 = 0;
                    while (i14 < size) {
                        Object obj = arrayList5.get(i14);
                        i14++;
                        Fragment fragment = ((v.a) obj).f2389b;
                        if (fragment != null && fragment.I != null) {
                            this.f2285c.p(u(fragment));
                        }
                    }
                }
            } else {
                w.B(this.f2300r.i(), this.f2301s, arrayList, arrayList3, i10, i11, false, this.f2296n);
            }
        }
        b0(arrayList, arrayList2, i7, i8);
        if (P) {
            boolean booleanValue = ((Boolean) arrayList3.get(i11 - 1)).booleanValue();
            for (int i15 = i10; i15 < i11; i15++) {
                androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i15);
                if (booleanValue) {
                    for (int size2 = aVar2.f2371c.size() - 1; size2 >= 0; size2--) {
                        Fragment fragment2 = ((v.a) aVar2.f2371c.get(size2)).f2389b;
                        if (fragment2 != null) {
                            u(fragment2).m();
                        }
                    }
                } else {
                    ArrayList arrayList6 = aVar2.f2371c;
                    int size3 = arrayList6.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        Object obj2 = arrayList6.get(i16);
                        i16++;
                        Fragment fragment3 = ((v.a) obj2).f2389b;
                        if (fragment3 != null) {
                            u(fragment3).m();
                        }
                    }
                }
            }
            M0(this.f2299q, true);
            for (b0 b0Var : r(arrayList, i10, i11)) {
                b0Var.r(booleanValue);
                b0Var.p();
                b0Var.g();
            }
            i9 = i11;
        } else {
            if (z7) {
                r.b bVar = new r.b();
                d(bVar);
                int W0 = W0(arrayList, arrayList3, i10, i8, bVar);
                i9 = i8;
                i10 = i10;
                K0(bVar);
                i11 = W0;
            } else {
                i9 = i11;
            }
            if (i11 == i10 || !z7) {
                arrayList3 = arrayList2;
            } else {
                if (this.f2299q >= 1) {
                    arrayList3 = arrayList2;
                    w.B(this.f2300r.i(), this.f2301s, arrayList, arrayList3, i10, i11, true, this.f2296n);
                } else {
                    arrayList3 = arrayList2;
                }
                M0(this.f2299q, true);
            }
        }
        for (int i17 = i7; i17 < i9; i17++) {
            androidx.fragment.app.a aVar3 = (androidx.fragment.app.a) arrayList.get(i17);
            if (((Boolean) arrayList3.get(i17)).booleanValue() && aVar3.f2147v >= 0) {
                aVar3.f2147v = -1;
            }
            aVar3.y();
        }
        if (z8) {
            a1();
        }
    }

    static int c1(int i7) {
        if (i7 == 4097) {
            return 8194;
        }
        if (i7 != 4099) {
            return i7 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void d(r.b bVar) {
        int i7 = this.f2299q;
        if (i7 < 1) {
            return;
        }
        int min = Math.min(i7, 5);
        for (Fragment fragment : this.f2285c.n()) {
            if (fragment.f2103q < min) {
                O0(fragment, min);
                if (fragment.X != null && !fragment.P && fragment.f2089c0) {
                    bVar.add(fragment);
                }
            }
        }
    }

    private void d0(ArrayList arrayList, ArrayList arrayList2) {
        int indexOf;
        int indexOf2;
        ArrayList arrayList3 = this.L;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i7 = 0;
        while (i7 < size) {
            o oVar = (o) this.L.get(i7);
            if (arrayList != null && !oVar.f2329a && (indexOf2 = arrayList.indexOf(oVar.f2330b)) != -1 && arrayList2 != null && ((Boolean) arrayList2.get(indexOf2)).booleanValue()) {
                this.L.remove(i7);
                i7--;
                size--;
                oVar.c();
            } else if (oVar.e() || (arrayList != null && oVar.f2330b.v(arrayList, 0, arrayList.size()))) {
                this.L.remove(i7);
                i7--;
                size--;
                if (arrayList == null || oVar.f2329a || (indexOf = arrayList.indexOf(oVar.f2330b)) == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf)).booleanValue()) {
                    oVar.d();
                } else {
                    oVar.c();
                }
            }
            i7++;
        }
    }

    private void i0() {
        if (P) {
            Iterator it = q().iterator();
            while (it.hasNext()) {
                ((b0) it.next()).k();
            }
        } else if (this.L != null) {
            while (!this.L.isEmpty()) {
                ((o) this.L.remove(0)).d();
            }
        }
    }

    private void i1(Fragment fragment) {
        ViewGroup n02 = n0(fragment);
        if (n02 == null || fragment.s() + fragment.w() + fragment.H() + fragment.I() <= 0) {
            return;
        }
        int i7 = k0.b.f24336c;
        if (n02.getTag(i7) == null) {
            n02.setTag(i7, fragment);
        }
        ((Fragment) n02.getTag(i7)).y1(fragment.G());
    }

    private boolean j0(ArrayList arrayList, ArrayList arrayList2) {
        synchronized (this.f2283a) {
            try {
                if (this.f2283a.isEmpty()) {
                    return false;
                }
                int size = this.f2283a.size();
                boolean z7 = false;
                for (int i7 = 0; i7 < size; i7++) {
                    z7 |= ((m) this.f2283a.get(i7)).a(arrayList, arrayList2);
                }
                this.f2283a.clear();
                this.f2300r.k().removeCallbacks(this.N);
                return z7;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void k1() {
        Iterator it = this.f2285c.k().iterator();
        while (it.hasNext()) {
            R0((t) it.next());
        }
    }

    private q l0(Fragment fragment) {
        return this.M.h(fragment);
    }

    private void l1() {
        synchronized (this.f2283a) {
            try {
                if (this.f2283a.isEmpty()) {
                    this.f2290h.f(k0() > 0 && G0(this.f2302t));
                } else {
                    this.f2290h.f(true);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void m(Fragment fragment) {
        HashSet hashSet = (HashSet) this.f2295m.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((androidx.core.os.c) it.next()).a();
            }
            hashSet.clear();
            v(fragment);
            this.f2295m.remove(fragment);
        }
    }

    private ViewGroup n0(Fragment fragment) {
        ViewGroup viewGroup = fragment.W;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.N > 0 && this.f2301s.f()) {
            View d8 = this.f2301s.d(fragment.N);
            if (d8 instanceof ViewGroup) {
                return (ViewGroup) d8;
            }
        }
        return null;
    }

    private void o() {
        if (I0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private void p() {
        this.f2284b = false;
        this.J.clear();
        this.I.clear();
    }

    private Set q() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f2285c.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((t) it.next()).k().W;
            if (viewGroup != null) {
                hashSet.add(b0.o(viewGroup, w0()));
            }
        }
        return hashSet;
    }

    private Set r(ArrayList arrayList, int i7, int i8) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i7 < i8) {
            ArrayList arrayList2 = ((androidx.fragment.app.a) arrayList.get(i7)).f2371c;
            int size = arrayList2.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList2.get(i9);
                i9++;
                Fragment fragment = ((v.a) obj).f2389b;
                if (fragment != null && (viewGroup = fragment.W) != null) {
                    hashSet.add(b0.n(viewGroup, this));
                }
            }
            i7++;
        }
        return hashSet;
    }

    private void t(Fragment fragment) {
        Animator animator;
        if (fragment.X != null) {
            f.d c8 = androidx.fragment.app.f.c(this.f2300r.i(), fragment, !fragment.P, fragment.G());
            if (c8 == null || (animator = c8.f2261b) == null) {
                if (c8 != null) {
                    fragment.X.startAnimation(c8.f2260a);
                    c8.f2260a.start();
                }
                fragment.X.setVisibility((!fragment.P || fragment.X()) ? 0 : 8);
                if (fragment.X()) {
                    fragment.v1(false);
                }
            } else {
                animator.setTarget(fragment.X);
                if (!fragment.P) {
                    fragment.X.setVisibility(0);
                } else if (fragment.X()) {
                    fragment.v1(false);
                } else {
                    ViewGroup viewGroup = fragment.W;
                    View view = fragment.X;
                    viewGroup.startViewTransition(view);
                    c8.f2261b.addListener(new h(viewGroup, view, fragment));
                }
                c8.f2261b.start();
            }
        }
        B0(fragment);
        fragment.f2090d0 = false;
        fragment.v0(fragment.P);
    }

    private void v(Fragment fragment) {
        fragment.U0();
        this.f2297o.n(fragment, false);
        fragment.W = null;
        fragment.X = null;
        fragment.f2096j0 = null;
        fragment.f2097k0.j(null);
        fragment.E = false;
    }

    static Fragment x0(View view) {
        Object tag = view.getTag(k0.b.f24334a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    boolean A(MenuItem menuItem) {
        if (this.f2299q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2285c.n()) {
            if (fragment != null && fragment.P0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void A0(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.P) {
            return;
        }
        fragment.P = true;
        fragment.f2090d0 = true ^ fragment.f2090d0;
        i1(fragment);
    }

    void B() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        R(1);
    }

    void B0(Fragment fragment) {
        if (fragment.B && E0(fragment)) {
            this.D = true;
        }
    }

    boolean C(Menu menu, MenuInflater menuInflater) {
        if (this.f2299q < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z7 = false;
        for (Fragment fragment : this.f2285c.n()) {
            if (fragment != null && F0(fragment) && fragment.R0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(fragment);
                z7 = true;
            }
        }
        if (this.f2287e != null) {
            for (int i7 = 0; i7 < this.f2287e.size(); i7++) {
                Fragment fragment2 = (Fragment) this.f2287e.get(i7);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.r0();
                }
            }
        }
        this.f2287e = arrayList;
        return z7;
    }

    public boolean C0() {
        return this.G;
    }

    void D() {
        this.G = true;
        Z(true);
        W();
        R(-1);
        this.f2300r = null;
        this.f2301s = null;
        this.f2302t = null;
        if (this.f2289g != null) {
            this.f2290h.d();
            this.f2289g = null;
        }
        androidx.activity.result.c cVar = this.f2308z;
        if (cVar != null) {
            cVar.c();
            this.A.c();
            this.B.c();
        }
    }

    void E() {
        R(1);
    }

    void F() {
        for (Fragment fragment : this.f2285c.n()) {
            if (fragment != null) {
                fragment.X0();
            }
        }
    }

    boolean F0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.Z();
    }

    void G(boolean z7) {
        for (Fragment fragment : this.f2285c.n()) {
            if (fragment != null) {
                fragment.Y0(z7);
            }
        }
    }

    boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.I;
        return fragment.equals(nVar.v0()) && G0(nVar.f2302t);
    }

    void H(Fragment fragment) {
        Iterator it = this.f2298p.iterator();
        while (it.hasNext()) {
            ((r) it.next()).a(this, fragment);
        }
    }

    boolean H0(int i7) {
        return this.f2299q >= i7;
    }

    boolean I(MenuItem menuItem) {
        if (this.f2299q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2285c.n()) {
            if (fragment != null && fragment.Z0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean I0() {
        return this.E || this.F;
    }

    void J(Menu menu) {
        if (this.f2299q < 1) {
            return;
        }
        for (Fragment fragment : this.f2285c.n()) {
            if (fragment != null) {
                fragment.a1(menu);
            }
        }
    }

    void J0(Fragment fragment, Intent intent, int i7, Bundle bundle) {
        if (this.f2308z == null) {
            this.f2300r.o(fragment, intent, i7, bundle);
            return;
        }
        this.C.addLast(new l(fragment.f2108v, i7));
        if (intent != null && bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        this.f2308z.a(intent);
    }

    void L() {
        R(5);
    }

    void L0(Fragment fragment) {
        if (!this.f2285c.c(fragment.f2108v)) {
            if (D0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.f2299q + "since it is not added to " + this);
                return;
            }
            return;
        }
        N0(fragment);
        View view = fragment.X;
        if (view != null && fragment.f2089c0 && fragment.W != null) {
            float f8 = fragment.f2091e0;
            if (f8 > 0.0f) {
                view.setAlpha(f8);
            }
            fragment.f2091e0 = 0.0f;
            fragment.f2089c0 = false;
            f.d c8 = androidx.fragment.app.f.c(this.f2300r.i(), fragment, true, fragment.G());
            if (c8 != null) {
                Animation animation = c8.f2260a;
                if (animation != null) {
                    fragment.X.startAnimation(animation);
                } else {
                    c8.f2261b.setTarget(fragment.X);
                    c8.f2261b.start();
                }
            }
        }
        if (fragment.f2090d0) {
            t(fragment);
        }
    }

    void M(boolean z7) {
        for (Fragment fragment : this.f2285c.n()) {
            if (fragment != null) {
                fragment.c1(z7);
            }
        }
    }

    void M0(int i7, boolean z7) {
        androidx.fragment.app.k kVar;
        if (this.f2300r == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z7 || i7 != this.f2299q) {
            this.f2299q = i7;
            if (P) {
                this.f2285c.r();
            } else {
                Iterator it = this.f2285c.n().iterator();
                while (it.hasNext()) {
                    L0((Fragment) it.next());
                }
                for (t tVar : this.f2285c.k()) {
                    Fragment k7 = tVar.k();
                    if (!k7.f2089c0) {
                        L0(k7);
                    }
                    if (k7.C && !k7.Y()) {
                        this.f2285c.q(tVar);
                    }
                }
            }
            k1();
            if (this.D && (kVar = this.f2300r) != null && this.f2299q == 7) {
                kVar.p();
                this.D = false;
            }
        }
    }

    boolean N(Menu menu) {
        boolean z7 = false;
        if (this.f2299q < 1) {
            return false;
        }
        for (Fragment fragment : this.f2285c.n()) {
            if (fragment != null && F0(fragment) && fragment.d1(menu)) {
                z7 = true;
            }
        }
        return z7;
    }

    void N0(Fragment fragment) {
        O0(fragment, this.f2299q);
    }

    void O() {
        l1();
        K(this.f2303u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r2 != 5) goto L102;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void O0(androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.O0(androidx.fragment.app.Fragment, int):void");
    }

    void P() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        R(7);
    }

    void P0() {
        if (this.f2300r == null) {
            return;
        }
        this.E = false;
        this.F = false;
        this.M.n(false);
        for (Fragment fragment : this.f2285c.n()) {
            if (fragment != null) {
                fragment.e0();
            }
        }
    }

    void Q() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        R(5);
    }

    void Q0(androidx.fragment.app.h hVar) {
        View view;
        for (t tVar : this.f2285c.k()) {
            Fragment k7 = tVar.k();
            if (k7.N == hVar.getId() && (view = k7.X) != null && view.getParent() == null) {
                k7.W = hVar;
                tVar.b();
            }
        }
    }

    void R0(t tVar) {
        Fragment k7 = tVar.k();
        if (k7.Y) {
            if (this.f2284b) {
                this.H = true;
                return;
            }
            k7.Y = false;
            if (P) {
                tVar.m();
            } else {
                N0(k7);
            }
        }
    }

    void S() {
        this.F = true;
        this.M.n(true);
        R(4);
    }

    public void S0(int i7, int i8) {
        if (i7 >= 0) {
            X(new C0039n(null, i7, i8), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i7);
    }

    void T() {
        R(2);
    }

    public boolean T0() {
        return U0(null, -1, 0);
    }

    public void V(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f2285c.e(str, fileDescriptor, printWriter, strArr);
        ArrayList arrayList = this.f2287e;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i7 = 0; i7 < size2; i7++) {
                Fragment fragment = (Fragment) this.f2287e.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList arrayList2 = this.f2286d;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i8 = 0; i8 < size; i8++) {
                androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f2286d.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.o(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f2291i.get());
        synchronized (this.f2283a) {
            try {
                int size3 = this.f2283a.size();
                if (size3 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i9 = 0; i9 < size3; i9++) {
                        m mVar = (m) this.f2283a.get(i9);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i9);
                        printWriter.print(": ");
                        printWriter.println(mVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2300r);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2301s);
        if (this.f2302t != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2302t);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2299q);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.E);
        printWriter.print(" mStopped=");
        printWriter.print(this.F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.G);
        if (this.D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.D);
        }
    }

    boolean V0(ArrayList arrayList, ArrayList arrayList2, String str, int i7, int i8) {
        int i9;
        ArrayList arrayList3 = this.f2286d;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i7 < 0 && (i8 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f2286d.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i7 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = (androidx.fragment.app.a) this.f2286d.get(size2);
                    if ((str != null && str.equals(aVar.t())) || (i7 >= 0 && i7 == aVar.f2147v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i8 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) this.f2286d.get(size2);
                        if (str == null || !str.equals(aVar2.t())) {
                            if (i7 < 0 || i7 != aVar2.f2147v) {
                                break;
                            }
                        }
                    }
                }
                i9 = size2;
            } else {
                i9 = -1;
            }
            if (i9 == this.f2286d.size() - 1) {
                return false;
            }
            for (int size3 = this.f2286d.size() - 1; size3 > i9; size3--) {
                arrayList.add(this.f2286d.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    void X(m mVar, boolean z7) {
        if (!z7) {
            if (this.f2300r == null) {
                if (!this.G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            o();
        }
        synchronized (this.f2283a) {
            try {
                if (this.f2300r == null) {
                    if (!z7) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f2283a.add(mVar);
                    e1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void X0(Fragment fragment, androidx.core.os.c cVar) {
        HashSet hashSet = (HashSet) this.f2295m.get(fragment);
        if (hashSet != null && hashSet.remove(cVar) && hashSet.isEmpty()) {
            this.f2295m.remove(fragment);
            if (fragment.f2103q < 5) {
                v(fragment);
                N0(fragment);
            }
        }
    }

    void Y0(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.H);
        }
        boolean Y = fragment.Y();
        if (fragment.Q && Y) {
            return;
        }
        this.f2285c.s(fragment);
        if (E0(fragment)) {
            this.D = true;
        }
        fragment.C = true;
        i1(fragment);
    }

    boolean Z(boolean z7) {
        Y(z7);
        boolean z8 = false;
        while (j0(this.I, this.J)) {
            z8 = true;
            this.f2284b = true;
            try {
                Z0(this.I, this.J);
            } finally {
                p();
            }
        }
        l1();
        U();
        this.f2285c.b();
        return z8;
    }

    void a0(m mVar, boolean z7) {
        if (z7 && (this.f2300r == null || this.G)) {
            return;
        }
        Y(z7);
        if (mVar.a(this.I, this.J)) {
            this.f2284b = true;
            try {
                Z0(this.I, this.J);
            } finally {
                p();
            }
        }
        l1();
        U();
        this.f2285c.b();
    }

    void b1(Parcelable parcelable) {
        t tVar;
        if (parcelable == null) {
            return;
        }
        p pVar = (p) parcelable;
        if (pVar.f2332q == null) {
            return;
        }
        this.f2285c.t();
        ArrayList arrayList = pVar.f2332q;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s sVar = (s) obj;
            if (sVar != null) {
                Fragment g8 = this.M.g(sVar.f2349r);
                if (g8 != null) {
                    if (D0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + g8);
                    }
                    tVar = new t(this.f2297o, this.f2285c, g8, sVar);
                } else {
                    tVar = new t(this.f2297o, this.f2285c, this.f2300r.i().getClassLoader(), o0(), sVar);
                }
                Fragment k7 = tVar.k();
                k7.I = this;
                if (D0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + k7.f2108v + "): " + k7);
                }
                tVar.o(this.f2300r.i().getClassLoader());
                this.f2285c.p(tVar);
                tVar.t(this.f2299q);
            }
        }
        for (Fragment fragment : this.M.j()) {
            if (!this.f2285c.c(fragment.f2108v)) {
                if (D0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + pVar.f2332q);
                }
                this.M.m(fragment);
                fragment.I = this;
                t tVar2 = new t(this.f2297o, this.f2285c, fragment);
                tVar2.t(1);
                tVar2.m();
                fragment.C = true;
                tVar2.m();
            }
        }
        this.f2285c.u(pVar.f2333r);
        if (pVar.f2334s != null) {
            this.f2286d = new ArrayList(pVar.f2334s.length);
            int i8 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = pVar.f2334s;
                if (i8 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a a8 = bVarArr[i8].a(this);
                if (D0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i8 + " (index " + a8.f2147v + "): " + a8);
                    PrintWriter printWriter = new PrintWriter(new a0("FragmentManager"));
                    a8.p("  ", printWriter, false);
                    printWriter.close();
                }
                this.f2286d.add(a8);
                i8++;
            }
        } else {
            this.f2286d = null;
        }
        this.f2291i.set(pVar.f2335t);
        String str = pVar.f2336u;
        if (str != null) {
            Fragment e02 = e0(str);
            this.f2303u = e02;
            K(e02);
        }
        ArrayList arrayList2 = pVar.f2337v;
        if (arrayList2 != null) {
            for (int i9 = 0; i9 < arrayList2.size(); i9++) {
                Bundle bundle = (Bundle) pVar.f2338w.get(i9);
                bundle.setClassLoader(this.f2300r.i().getClassLoader());
                this.f2292j.put(arrayList2.get(i9), bundle);
            }
        }
        this.C = new ArrayDeque(pVar.f2339x);
    }

    Parcelable d1() {
        int size;
        i0();
        W();
        Z(true);
        this.E = true;
        this.M.n(true);
        ArrayList v7 = this.f2285c.v();
        androidx.fragment.app.b[] bVarArr = null;
        if (v7.isEmpty()) {
            if (D0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList w7 = this.f2285c.w();
        ArrayList arrayList = this.f2286d;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i7 = 0; i7 < size; i7++) {
                bVarArr[i7] = new androidx.fragment.app.b((androidx.fragment.app.a) this.f2286d.get(i7));
                if (D0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i7 + ": " + this.f2286d.get(i7));
                }
            }
        }
        p pVar = new p();
        pVar.f2332q = v7;
        pVar.f2333r = w7;
        pVar.f2334s = bVarArr;
        pVar.f2335t = this.f2291i.get();
        Fragment fragment = this.f2303u;
        if (fragment != null) {
            pVar.f2336u = fragment.f2108v;
        }
        pVar.f2337v.addAll(this.f2292j.keySet());
        pVar.f2338w.addAll(this.f2292j.values());
        pVar.f2339x = new ArrayList(this.C);
        return pVar;
    }

    void e(androidx.fragment.app.a aVar) {
        if (this.f2286d == null) {
            this.f2286d = new ArrayList();
        }
        this.f2286d.add(aVar);
    }

    Fragment e0(String str) {
        return this.f2285c.f(str);
    }

    void e1() {
        synchronized (this.f2283a) {
            try {
                ArrayList arrayList = this.L;
                boolean z7 = (arrayList == null || arrayList.isEmpty()) ? false : true;
                boolean z8 = this.f2283a.size() == 1;
                if (z7 || z8) {
                    this.f2300r.k().removeCallbacks(this.N);
                    this.f2300r.k().post(this.N);
                    l1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void f(Fragment fragment, androidx.core.os.c cVar) {
        if (this.f2295m.get(fragment) == null) {
            this.f2295m.put(fragment, new HashSet());
        }
        ((HashSet) this.f2295m.get(fragment)).add(cVar);
    }

    public Fragment f0(int i7) {
        return this.f2285c.g(i7);
    }

    void f1(Fragment fragment, boolean z7) {
        ViewGroup n02 = n0(fragment);
        if (n02 == null || !(n02 instanceof androidx.fragment.app.h)) {
            return;
        }
        ((androidx.fragment.app.h) n02).setDrawDisappearingViewsLast(!z7);
    }

    t g(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        t u7 = u(fragment);
        fragment.I = this;
        this.f2285c.p(u7);
        if (!fragment.Q) {
            this.f2285c.a(fragment);
            fragment.C = false;
            if (fragment.X == null) {
                fragment.f2090d0 = false;
            }
            if (E0(fragment)) {
                this.D = true;
            }
        }
        return u7;
    }

    public Fragment g0(String str) {
        return this.f2285c.h(str);
    }

    void g1(Fragment fragment, g.c cVar) {
        if (fragment.equals(e0(fragment.f2108v)) && (fragment.J == null || fragment.I == this)) {
            fragment.f2094h0 = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void h(r rVar) {
        this.f2298p.add(rVar);
    }

    Fragment h0(String str) {
        return this.f2285c.i(str);
    }

    void h1(Fragment fragment) {
        if (fragment == null || (fragment.equals(e0(fragment.f2108v)) && (fragment.J == null || fragment.I == this))) {
            Fragment fragment2 = this.f2303u;
            this.f2303u = fragment;
            K(fragment2);
            K(this.f2303u);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    int i() {
        return this.f2291i.getAndIncrement();
    }

    /* JADX WARN: Multi-variable type inference failed */
    void j(androidx.fragment.app.k kVar, androidx.fragment.app.g gVar, Fragment fragment) {
        String str;
        if (this.f2300r != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2300r = kVar;
        this.f2301s = gVar;
        this.f2302t = fragment;
        if (fragment != null) {
            h(new i(fragment));
        } else if (kVar instanceof r) {
            h((r) kVar);
        }
        if (this.f2302t != null) {
            l1();
        }
        if (kVar instanceof androidx.activity.c) {
            androidx.activity.c cVar = (androidx.activity.c) kVar;
            OnBackPressedDispatcher c8 = cVar.c();
            this.f2289g = c8;
            androidx.lifecycle.k kVar2 = cVar;
            if (fragment != null) {
                kVar2 = fragment;
            }
            c8.a(kVar2, this.f2290h);
        }
        if (fragment != null) {
            this.M = fragment.I.l0(fragment);
        } else if (kVar instanceof androidx.lifecycle.z) {
            this.M = q.i(((androidx.lifecycle.z) kVar).h());
        } else {
            this.M = new q(false);
        }
        this.M.n(I0());
        this.f2285c.x(this.M);
        Object obj = this.f2300r;
        if (obj instanceof androidx.activity.result.d) {
            ActivityResultRegistry e8 = ((androidx.activity.result.d) obj).e();
            if (fragment != null) {
                str = fragment.f2108v + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f2308z = e8.j(str2 + "StartActivityForResult", new e.c(), new j());
            this.A = e8.j(str2 + "StartIntentSenderForResult", new k(), new a());
            this.B = e8.j(str2 + "RequestPermissions", new e.b(), new b());
        }
    }

    void j1(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.P) {
            fragment.P = false;
            fragment.f2090d0 = !fragment.f2090d0;
        }
    }

    void k(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.Q) {
            fragment.Q = false;
            if (fragment.B) {
                return;
            }
            this.f2285c.a(fragment);
            if (D0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (E0(fragment)) {
                this.D = true;
            }
        }
    }

    public int k0() {
        ArrayList arrayList = this.f2286d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public v l() {
        return new androidx.fragment.app.a(this);
    }

    androidx.fragment.app.g m0() {
        return this.f2301s;
    }

    boolean n() {
        boolean z7 = false;
        for (Fragment fragment : this.f2285c.l()) {
            if (fragment != null) {
                z7 = E0(fragment);
            }
            if (z7) {
                return true;
            }
        }
        return false;
    }

    public androidx.fragment.app.j o0() {
        androidx.fragment.app.j jVar = this.f2304v;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.f2302t;
        return fragment != null ? fragment.I.o0() : this.f2305w;
    }

    u p0() {
        return this.f2285c;
    }

    public List q0() {
        return this.f2285c.n();
    }

    androidx.fragment.app.k r0() {
        return this.f2300r;
    }

    void s(androidx.fragment.app.a aVar, boolean z7, boolean z8, boolean z9) {
        if (z7) {
            aVar.r(z9);
        } else {
            aVar.q();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z7));
        if (z8 && this.f2299q >= 1) {
            w.B(this.f2300r.i(), this.f2301s, arrayList, arrayList2, 0, 1, true, this.f2296n);
        }
        if (z9) {
            M0(this.f2299q, true);
        }
        for (Fragment fragment : this.f2285c.l()) {
            if (fragment != null && fragment.X != null && fragment.f2089c0 && aVar.u(fragment.N)) {
                float f8 = fragment.f2091e0;
                if (f8 > 0.0f) {
                    fragment.X.setAlpha(f8);
                }
                if (z9) {
                    fragment.f2091e0 = 0.0f;
                } else {
                    fragment.f2091e0 = -1.0f;
                    fragment.f2089c0 = false;
                }
            }
        }
    }

    LayoutInflater.Factory2 s0() {
        return this.f2288f;
    }

    androidx.fragment.app.m t0() {
        return this.f2297o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f2302t;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f2302t)));
            sb.append("}");
        } else {
            androidx.fragment.app.k kVar = this.f2300r;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f2300r)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    t u(Fragment fragment) {
        t m7 = this.f2285c.m(fragment.f2108v);
        if (m7 != null) {
            return m7;
        }
        t tVar = new t(this.f2297o, this.f2285c, fragment);
        tVar.o(this.f2300r.i().getClassLoader());
        tVar.t(this.f2299q);
        return tVar;
    }

    Fragment u0() {
        return this.f2302t;
    }

    public Fragment v0() {
        return this.f2303u;
    }

    void w(Fragment fragment) {
        if (D0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.Q) {
            return;
        }
        fragment.Q = true;
        if (fragment.B) {
            if (D0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f2285c.s(fragment);
            if (E0(fragment)) {
                this.D = true;
            }
            i1(fragment);
        }
    }

    c0 w0() {
        c0 c0Var = this.f2306x;
        if (c0Var != null) {
            return c0Var;
        }
        Fragment fragment = this.f2302t;
        return fragment != null ? fragment.I.w0() : this.f2307y;
    }

    void x() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        R(4);
    }

    void y() {
        this.E = false;
        this.F = false;
        this.M.n(false);
        R(0);
    }

    androidx.lifecycle.y y0(Fragment fragment) {
        return this.M.k(fragment);
    }

    void z(Configuration configuration) {
        for (Fragment fragment : this.f2285c.n()) {
            if (fragment != null) {
                fragment.O0(configuration);
            }
        }
    }

    void z0() {
        Z(true);
        if (this.f2290h.c()) {
            T0();
        } else {
            this.f2289g.c();
        }
    }

    /* compiled from: MyApplication */
    static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        String f2323q;

        /* renamed from: r, reason: collision with root package name */
        int f2324r;

        /* compiled from: MyApplication */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l[] newArray(int i7) {
                return new l[i7];
            }
        }

        l(String str, int i7) {
            this.f2323q = str;
            this.f2324r = i7;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f2323q);
            parcel.writeInt(this.f2324r);
        }

        l(Parcel parcel) {
            this.f2323q = parcel.readString();
            this.f2324r = parcel.readInt();
        }
    }
}
