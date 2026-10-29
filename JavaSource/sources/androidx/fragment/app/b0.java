package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.c;
import androidx.core.view.e0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    private final ViewGroup f2160a;

    /* renamed from: b, reason: collision with root package name */
    final ArrayList f2161b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f2162c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    boolean f2163d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f2164e = false;

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ d f2165q;

        a(d dVar) {
            this.f2165q = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b0.this.f2161b.contains(this.f2165q)) {
                this.f2165q.e().c(this.f2165q.f().X);
            }
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ d f2167q;

        b(d dVar) {
            this.f2167q = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b0.this.f2161b.remove(this.f2167q);
            b0.this.f2162c.remove(this.f2167q);
        }
    }

    /* compiled from: MyApplication */
    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2169a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f2170b;

        static {
            int[] iArr = new int[e.b.values().length];
            f2170b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2170b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2170b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f2169a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2169a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2169a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2169a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* compiled from: MyApplication */
    private static class d extends e {

        /* renamed from: h, reason: collision with root package name */
        private final t f2171h;

        d(e.c cVar, e.b bVar, t tVar, androidx.core.os.c cVar2) {
            super(cVar, bVar, tVar.k(), cVar2);
            this.f2171h = tVar;
        }

        @Override // androidx.fragment.app.b0.e
        public void c() {
            super.c();
            this.f2171h.m();
        }

        @Override // androidx.fragment.app.b0.e
        void l() {
            if (g() == e.b.ADDING) {
                Fragment k7 = this.f2171h.k();
                View findFocus = k7.X.findFocus();
                if (findFocus != null) {
                    k7.u1(findFocus);
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + k7);
                    }
                }
                View m12 = f().m1();
                if (m12.getParent() == null) {
                    this.f2171h.b();
                    m12.setAlpha(0.0f);
                }
                if (m12.getAlpha() == 0.0f && m12.getVisibility() == 0) {
                    m12.setVisibility(4);
                }
                m12.setAlpha(k7.J());
            }
        }
    }

    /* compiled from: MyApplication */
    static class e {

        /* renamed from: a, reason: collision with root package name */
        private c f2172a;

        /* renamed from: b, reason: collision with root package name */
        private b f2173b;

        /* renamed from: c, reason: collision with root package name */
        private final Fragment f2174c;

        /* renamed from: d, reason: collision with root package name */
        private final List f2175d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        private final HashSet f2176e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        private boolean f2177f = false;

        /* renamed from: g, reason: collision with root package name */
        private boolean f2178g = false;

        /* compiled from: MyApplication */
        class a implements c.b {
            a() {
            }

            @Override // androidx.core.os.c.b
            public void onCancel() {
                e.this.b();
            }
        }

        /* compiled from: MyApplication */
        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        /* compiled from: MyApplication */
        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c d(int i7) {
                if (i7 == 0) {
                    return VISIBLE;
                }
                if (i7 == 4) {
                    return INVISIBLE;
                }
                if (i7 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i7);
            }

            static c j(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : d(view.getVisibility());
            }

            void c(View view) {
                int i7 = c.f2169a[ordinal()];
                if (i7 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (n.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i7 == 2) {
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                if (i7 == 3) {
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    view.setVisibility(8);
                    return;
                }
                if (i7 != 4) {
                    return;
                }
                if (n.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                }
                view.setVisibility(4);
            }
        }

        e(c cVar, b bVar, Fragment fragment, androidx.core.os.c cVar2) {
            this.f2172a = cVar;
            this.f2173b = bVar;
            this.f2174c = fragment;
            cVar2.c(new a());
        }

        final void a(Runnable runnable) {
            this.f2175d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f2177f = true;
            if (this.f2176e.isEmpty()) {
                c();
                return;
            }
            ArrayList arrayList = new ArrayList(this.f2176e);
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                ((androidx.core.os.c) obj).a();
            }
        }

        public void c() {
            if (this.f2178g) {
                return;
            }
            if (n.D0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f2178g = true;
            Iterator it = this.f2175d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void d(androidx.core.os.c cVar) {
            if (this.f2176e.remove(cVar) && this.f2176e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f2172a;
        }

        public final Fragment f() {
            return this.f2174c;
        }

        b g() {
            return this.f2173b;
        }

        final boolean h() {
            return this.f2177f;
        }

        final boolean i() {
            return this.f2178g;
        }

        public final void j(androidx.core.os.c cVar) {
            l();
            this.f2176e.add(cVar);
        }

        final void k(c cVar, b bVar) {
            int i7 = c.f2170b[bVar.ordinal()];
            if (i7 == 1) {
                if (this.f2172a == c.REMOVED) {
                    if (n.D0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2174c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f2173b + " to ADDING.");
                    }
                    this.f2172a = c.VISIBLE;
                    this.f2173b = b.ADDING;
                    return;
                }
                return;
            }
            if (i7 == 2) {
                if (n.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2174c + " mFinalState = " + this.f2172a + " -> REMOVED. mLifecycleImpact  = " + this.f2173b + " to REMOVING.");
                }
                this.f2172a = c.REMOVED;
                this.f2173b = b.REMOVING;
                return;
            }
            if (i7 == 3 && this.f2172a != c.REMOVED) {
                if (n.D0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f2174c + " mFinalState = " + this.f2172a + " -> " + cVar + ". ");
                }
                this.f2172a = cVar;
            }
        }

        abstract void l();

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f2172a + "} {mLifecycleImpact = " + this.f2173b + "} {mFragment = " + this.f2174c + "}";
        }
    }

    b0(ViewGroup viewGroup) {
        this.f2160a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, t tVar) {
        synchronized (this.f2161b) {
            try {
                androidx.core.os.c cVar2 = new androidx.core.os.c();
                e h8 = h(tVar.k());
                if (h8 != null) {
                    h8.k(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, tVar, cVar2);
                this.f2161b.add(dVar);
                dVar.a(new a(dVar));
                dVar.a(new b(dVar));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private e h(Fragment fragment) {
        ArrayList arrayList = this.f2161b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e eVar = (e) obj;
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        ArrayList arrayList = this.f2162c;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e eVar = (e) obj;
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    static b0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.w0());
    }

    static b0 o(ViewGroup viewGroup, c0 c0Var) {
        int i7 = k0.b.f24335b;
        Object tag = viewGroup.getTag(i7);
        if (tag instanceof b0) {
            return (b0) tag;
        }
        b0 a8 = c0Var.a(viewGroup);
        viewGroup.setTag(i7, a8);
        return a8;
    }

    private void q() {
        ArrayList arrayList = this.f2161b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e eVar = (e) obj;
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.d(eVar.f().m1().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, t tVar) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + tVar.k());
        }
        a(cVar, e.b.ADDING, tVar);
    }

    void c(t tVar) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + tVar.k());
        }
        a(e.c.GONE, e.b.NONE, tVar);
    }

    void d(t tVar) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + tVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, tVar);
    }

    void e(t tVar) {
        if (n.D0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + tVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, tVar);
    }

    abstract void f(List list, boolean z7);

    void g() {
        if (this.f2164e) {
            return;
        }
        if (!e0.A(this.f2160a)) {
            j();
            this.f2163d = false;
            return;
        }
        synchronized (this.f2161b) {
            try {
                if (!this.f2161b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f2162c);
                    this.f2162c.clear();
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        e eVar = (e) obj;
                        if (n.D0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                        }
                        eVar.b();
                        if (!eVar.i()) {
                            this.f2162c.add(eVar);
                        }
                    }
                    q();
                    ArrayList arrayList2 = new ArrayList(this.f2161b);
                    this.f2161b.clear();
                    this.f2162c.addAll(arrayList2);
                    int size2 = arrayList2.size();
                    int i8 = 0;
                    while (i8 < size2) {
                        Object obj2 = arrayList2.get(i8);
                        i8++;
                        ((e) obj2).l();
                    }
                    f(arrayList2, this.f2163d);
                    this.f2163d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void j() {
        String str;
        String str2;
        boolean A = e0.A(this.f2160a);
        synchronized (this.f2161b) {
            try {
                q();
                ArrayList arrayList = this.f2161b;
                int size = arrayList.size();
                int i7 = 0;
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    ((e) obj).l();
                }
                ArrayList arrayList2 = new ArrayList(this.f2162c);
                int size2 = arrayList2.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj2 = arrayList2.get(i9);
                    i9++;
                    e eVar = (e) obj2;
                    if (n.D0(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (A) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f2160a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(eVar);
                        Log.v("FragmentManager", sb.toString());
                    }
                    eVar.b();
                }
                ArrayList arrayList3 = new ArrayList(this.f2161b);
                int size3 = arrayList3.size();
                while (i7 < size3) {
                    Object obj3 = arrayList3.get(i7);
                    i7++;
                    e eVar2 = (e) obj3;
                    if (n.D0(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (A) {
                            str = "";
                        } else {
                            str = "Container " + this.f2160a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(eVar2);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    eVar2.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void k() {
        if (this.f2164e) {
            this.f2164e = false;
            g();
        }
    }

    e.b l(t tVar) {
        e h8 = h(tVar.k());
        e.b g8 = h8 != null ? h8.g() : null;
        e i7 = i(tVar.k());
        return (i7 == null || !(g8 == null || g8 == e.b.NONE)) ? g8 : i7.g();
    }

    public ViewGroup m() {
        return this.f2160a;
    }

    void p() {
        synchronized (this.f2161b) {
            try {
                q();
                this.f2164e = false;
                int size = this.f2161b.size() - 1;
                while (true) {
                    if (size < 0) {
                        break;
                    }
                    e eVar = (e) this.f2161b.get(size);
                    e.c j7 = e.c.j(eVar.f().X);
                    e.c e8 = eVar.e();
                    e.c cVar = e.c.VISIBLE;
                    if (e8 == cVar && j7 != cVar) {
                        this.f2164e = eVar.f().a0();
                        break;
                    }
                    size--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void r(boolean z7) {
        this.f2163d = z7;
    }
}
