package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.e0;
import androidx.fragment.app.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: MyApplication */
abstract class w {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f2396a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b, reason: collision with root package name */
    static final y f2397b = new x();

    /* renamed from: c, reason: collision with root package name */
    static final y f2398c = w();

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ g f2399q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Fragment f2400r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f2401s;

        a(g gVar, Fragment fragment, androidx.core.os.c cVar) {
            this.f2399q = gVar;
            this.f2400r = fragment;
            this.f2401s = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2399q.a(this.f2400r, this.f2401s);
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ArrayList f2402q;

        b(ArrayList arrayList) {
            this.f2402q = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.A(this.f2402q, 4);
        }
    }

    /* compiled from: MyApplication */
    class c implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ g f2403q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Fragment f2404r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ androidx.core.os.c f2405s;

        c(g gVar, Fragment fragment, androidx.core.os.c cVar) {
            this.f2403q = gVar;
            this.f2404r = fragment;
            this.f2405s = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2403q.a(this.f2404r, this.f2405s);
        }
    }

    /* compiled from: MyApplication */
    class d implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Object f2406q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ y f2407r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ View f2408s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Fragment f2409t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ArrayList f2410u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ ArrayList f2411v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ ArrayList f2412w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Object f2413x;

        d(Object obj, y yVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2406q = obj;
            this.f2407r = yVar;
            this.f2408s = view;
            this.f2409t = fragment;
            this.f2410u = arrayList;
            this.f2411v = arrayList2;
            this.f2412w = arrayList3;
            this.f2413x = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f2406q;
            if (obj != null) {
                this.f2407r.p(obj, this.f2408s);
                this.f2411v.addAll(w.k(this.f2407r, this.f2406q, this.f2409t, this.f2410u, this.f2408s));
            }
            if (this.f2412w != null) {
                if (this.f2413x != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f2408s);
                    this.f2407r.q(this.f2413x, this.f2412w, arrayList);
                }
                this.f2412w.clear();
                this.f2412w.add(this.f2408s);
            }
        }
    }

    /* compiled from: MyApplication */
    class e implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Fragment f2414q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Fragment f2415r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f2416s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.a f2417t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ View f2418u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ y f2419v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ Rect f2420w;

        e(Fragment fragment, Fragment fragment2, boolean z7, r.a aVar, View view, y yVar, Rect rect) {
            this.f2414q = fragment;
            this.f2415r = fragment2;
            this.f2416s = z7;
            this.f2417t = aVar;
            this.f2418u = view;
            this.f2419v = yVar;
            this.f2420w = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.f(this.f2414q, this.f2415r, this.f2416s, this.f2417t, false);
            View view = this.f2418u;
            if (view != null) {
                this.f2419v.k(view, this.f2420w);
            }
        }
    }

    /* compiled from: MyApplication */
    class f implements Runnable {
        final /* synthetic */ Object A;
        final /* synthetic */ Rect B;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ y f2421q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ r.a f2422r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Object f2423s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ h f2424t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ArrayList f2425u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ View f2426v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ Fragment f2427w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Fragment f2428x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ boolean f2429y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ ArrayList f2430z;

        f(y yVar, r.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z7, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2421q = yVar;
            this.f2422r = aVar;
            this.f2423s = obj;
            this.f2424t = hVar;
            this.f2425u = arrayList;
            this.f2426v = view;
            this.f2427w = fragment;
            this.f2428x = fragment2;
            this.f2429y = z7;
            this.f2430z = arrayList2;
            this.A = obj2;
            this.B = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            r.a h8 = w.h(this.f2421q, this.f2422r, this.f2423s, this.f2424t);
            if (h8 != null) {
                this.f2425u.addAll(h8.values());
                this.f2425u.add(this.f2426v);
            }
            w.f(this.f2427w, this.f2428x, this.f2429y, h8, false);
            Object obj = this.f2423s;
            if (obj != null) {
                this.f2421q.A(obj, this.f2430z, this.f2425u);
                View s7 = w.s(h8, this.f2424t, this.A, this.f2429y);
                if (s7 != null) {
                    this.f2421q.k(s7, this.B);
                }
            }
        }
    }

    /* compiled from: MyApplication */
    interface g {
        void a(Fragment fragment, androidx.core.os.c cVar);

        void b(Fragment fragment, androidx.core.os.c cVar);
    }

    /* compiled from: MyApplication */
    static class h {

        /* renamed from: a, reason: collision with root package name */
        public Fragment f2431a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f2432b;

        /* renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f2433c;

        /* renamed from: d, reason: collision with root package name */
        public Fragment f2434d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2435e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f2436f;

        h() {
        }
    }

    static void A(ArrayList arrayList, int i7) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i7);
        }
    }

    static void B(Context context, androidx.fragment.app.g gVar, ArrayList arrayList, ArrayList arrayList2, int i7, int i8, boolean z7, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i9 = i7; i9 < i8; i9++) {
            androidx.fragment.app.a aVar = (androidx.fragment.app.a) arrayList.get(i9);
            if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                e(aVar, sparseArray, z7);
            } else {
                c(aVar, sparseArray, z7);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                int keyAt = sparseArray.keyAt(i10);
                r.a d8 = d(keyAt, arrayList, arrayList2, i7, i8);
                h hVar = (h) sparseArray.valueAt(i10);
                if (gVar.f() && (viewGroup = (ViewGroup) gVar.d(keyAt)) != null) {
                    if (z7) {
                        o(viewGroup, hVar, view, d8, gVar2);
                    } else {
                        n(viewGroup, hVar, view, d8, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList arrayList, r.a aVar, Collection collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.m(size);
            if (collection.contains(e0.w(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x003b, code lost:
    
        if (r0.B != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x003d, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0055, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0092, code lost:
    
        if (r0.P == false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void b(androidx.fragment.app.a r8, androidx.fragment.app.v.a r9, android.util.SparseArray r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.w.b(androidx.fragment.app.a, androidx.fragment.app.v$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray sparseArray, boolean z7) {
        int size = aVar.f2371c.size();
        for (int i7 = 0; i7 < size; i7++) {
            b(aVar, (v.a) aVar.f2371c.get(i7), sparseArray, false, z7);
        }
    }

    private static r.a d(int i7, ArrayList arrayList, ArrayList arrayList2, int i8, int i9) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        r.a aVar = new r.a();
        for (int i10 = i9 - 1; i10 >= i8; i10--) {
            androidx.fragment.app.a aVar2 = (androidx.fragment.app.a) arrayList.get(i10);
            if (aVar2.u(i7)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i10)).booleanValue();
                ArrayList arrayList5 = aVar2.f2384p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f2384p;
                        arrayList4 = aVar2.f2385q;
                    } else {
                        ArrayList arrayList6 = aVar2.f2384p;
                        arrayList3 = aVar2.f2385q;
                        arrayList4 = arrayList6;
                    }
                    for (int i11 = 0; i11 < size; i11++) {
                        String str = (String) arrayList4.get(i11);
                        String str2 = (String) arrayList3.get(i11);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray sparseArray, boolean z7) {
        if (aVar.f2145t.m0().f()) {
            for (int size = aVar.f2371c.size() - 1; size >= 0; size--) {
                b(aVar, (v.a) aVar.f2371c.get(size), sparseArray, true, z7);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z7, r.a aVar, boolean z8) {
        if (z7) {
            fragment2.v();
        } else {
            fragment.v();
        }
    }

    private static boolean g(y yVar, List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!yVar.e(list.get(i7))) {
                return false;
            }
        }
        return true;
    }

    static r.a h(y yVar, r.a aVar, Object obj, h hVar) {
        ArrayList arrayList;
        Fragment fragment = hVar.f2431a;
        View S = fragment.S();
        if (aVar.isEmpty() || obj == null || S == null) {
            aVar.clear();
            return null;
        }
        r.a aVar2 = new r.a();
        yVar.j(aVar2, S);
        androidx.fragment.app.a aVar3 = hVar.f2433c;
        if (hVar.f2432b) {
            fragment.y();
            arrayList = aVar3.f2384p;
        } else {
            fragment.v();
            arrayList = aVar3.f2385q;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
            aVar2.o(aVar.values());
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static r.a i(y yVar, r.a aVar, Object obj, h hVar) {
        ArrayList arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f2434d;
        r.a aVar2 = new r.a();
        yVar.j(aVar2, fragment.m1());
        androidx.fragment.app.a aVar3 = hVar.f2436f;
        if (hVar.f2435e) {
            fragment.v();
            arrayList = aVar3.f2385q;
        } else {
            fragment.y();
            arrayList = aVar3.f2384p;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
        }
        aVar.o(aVar2.keySet());
        return aVar2;
    }

    private static y j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object x7 = fragment.x();
            if (x7 != null) {
                arrayList.add(x7);
            }
            Object M = fragment.M();
            if (M != null) {
                arrayList.add(M);
            }
            Object O = fragment.O();
            if (O != null) {
                arrayList.add(O);
            }
        }
        if (fragment2 != null) {
            Object u7 = fragment2.u();
            if (u7 != null) {
                arrayList.add(u7);
            }
            Object K = fragment2.K();
            if (K != null) {
                arrayList.add(K);
            }
            Object N = fragment2.N();
            if (N != null) {
                arrayList.add(N);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        y yVar = f2397b;
        if (yVar != null && g(yVar, arrayList)) {
            return yVar;
        }
        y yVar2 = f2398c;
        if (yVar2 != null && g(yVar2, arrayList)) {
            return yVar2;
        }
        if (yVar == null && yVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList k(y yVar, Object obj, Fragment fragment, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View S = fragment.S();
        if (S != null) {
            yVar.f(arrayList2, S);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (!arrayList2.isEmpty()) {
            arrayList2.add(view);
            yVar.b(obj, arrayList2);
        }
        return arrayList2;
    }

    private static Object l(y yVar, ViewGroup viewGroup, View view, r.a aVar, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        View view2;
        Object obj3;
        Fragment fragment = hVar.f2431a;
        Fragment fragment2 = hVar.f2434d;
        Rect rect = null;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z7 = hVar.f2432b;
        Object t7 = aVar.isEmpty() ? null : t(yVar, fragment, fragment2, z7);
        r.a i7 = i(yVar, aVar, t7, hVar);
        if (aVar.isEmpty()) {
            t7 = null;
        } else {
            arrayList.addAll(i7.values());
        }
        if (obj == null && obj2 == null && t7 == null) {
            return null;
        }
        f(fragment, fragment2, z7, i7, true);
        if (t7 != null) {
            Rect rect2 = new Rect();
            view2 = view;
            yVar.z(t7, view2, arrayList);
            Object obj4 = t7;
            z(yVar, obj4, obj2, i7, hVar.f2435e, hVar.f2436f);
            obj3 = obj4;
            if (obj != null) {
                yVar.u(obj, rect2);
            }
            rect = rect2;
        } else {
            view2 = view;
            obj3 = t7;
        }
        androidx.core.view.c0.a(viewGroup, new f(yVar, aVar, obj3, hVar, arrayList2, view2, fragment, fragment2, z7, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(y yVar, ViewGroup viewGroup, View view, r.a aVar, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Rect rect;
        Fragment fragment = hVar.f2431a;
        Fragment fragment2 = hVar.f2434d;
        if (fragment != null) {
            fragment.m1().setVisibility(0);
        }
        View view2 = null;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z7 = hVar.f2432b;
        Object t7 = aVar.isEmpty() ? null : t(yVar, fragment, fragment2, z7);
        r.a i7 = i(yVar, aVar, t7, hVar);
        r.a h8 = h(yVar, aVar, t7, hVar);
        if (aVar.isEmpty()) {
            if (i7 != null) {
                i7.clear();
            }
            if (h8 != null) {
                h8.clear();
            }
            t7 = null;
        } else {
            a(arrayList, i7, aVar.keySet());
            a(arrayList2, h8, aVar.values());
        }
        if (obj == null && obj2 == null && t7 == null) {
            return null;
        }
        f(fragment, fragment2, z7, i7, true);
        if (t7 != null) {
            arrayList2.add(view);
            yVar.z(t7, view, arrayList);
            z(yVar, t7, obj2, i7, hVar.f2435e, hVar.f2436f);
            Rect rect2 = new Rect();
            View s7 = s(h8, hVar, obj, z7);
            if (s7 != null) {
                yVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = s7;
        } else {
            rect = null;
        }
        androidx.core.view.c0.a(viewGroup, new e(fragment, fragment2, z7, h8, view2, yVar, rect));
        return t7;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, r.a aVar, g gVar) {
        Fragment fragment = hVar.f2431a;
        Fragment fragment2 = hVar.f2434d;
        y j7 = j(fragment2, fragment);
        if (j7 == null) {
            return;
        }
        boolean z7 = hVar.f2432b;
        boolean z8 = hVar.f2435e;
        Object q7 = q(j7, fragment, z7);
        Object r7 = r(j7, fragment2, z8);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object l7 = l(j7, viewGroup, view, aVar, hVar, arrayList, arrayList2, q7, r7);
        if (q7 == null && l7 == null && r7 == null) {
            return;
        }
        ArrayList k7 = k(j7, r7, fragment2, arrayList, view);
        if (k7 == null || k7.isEmpty()) {
            r7 = null;
        }
        Object obj = r7;
        j7.a(q7, view);
        Object u7 = u(j7, q7, obj, l7, fragment, hVar.f2432b);
        if (fragment2 != null && k7 != null && (k7.size() > 0 || arrayList.size() > 0)) {
            androidx.core.os.c cVar = new androidx.core.os.c();
            gVar.b(fragment2, cVar);
            j7.w(fragment2, u7, cVar, new c(gVar, fragment2, cVar));
        }
        if (u7 != null) {
            ArrayList arrayList3 = new ArrayList();
            j7.t(u7, q7, arrayList3, obj, k7, l7, arrayList2);
            y(j7, viewGroup, fragment, view, arrayList2, q7, arrayList3, obj, k7);
            j7.x(viewGroup, arrayList2, aVar);
            j7.c(viewGroup, u7);
            j7.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, r.a aVar, g gVar) {
        Fragment fragment = hVar.f2431a;
        Fragment fragment2 = hVar.f2434d;
        y j7 = j(fragment2, fragment);
        if (j7 == null) {
            return;
        }
        boolean z7 = hVar.f2432b;
        boolean z8 = hVar.f2435e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object q7 = q(j7, fragment, z7);
        Object r7 = r(j7, fragment2, z8);
        Object m7 = m(j7, viewGroup, view, aVar, hVar, arrayList2, arrayList, q7, r7);
        if (q7 == null && m7 == null && r7 == null) {
            return;
        }
        ArrayList k7 = k(j7, r7, fragment2, arrayList2, view);
        ArrayList k8 = k(j7, q7, fragment, arrayList, view);
        A(k8, 4);
        Object u7 = u(j7, q7, r7, m7, fragment, z7);
        if (fragment2 != null && k7 != null && (k7.size() > 0 || arrayList2.size() > 0)) {
            androidx.core.os.c cVar = new androidx.core.os.c();
            gVar.b(fragment2, cVar);
            j7.w(fragment2, u7, cVar, new a(gVar, fragment2, cVar));
        }
        if (u7 != null) {
            v(j7, r7, fragment2, k7);
            ArrayList o7 = j7.o(arrayList);
            j7.t(u7, q7, k8, r7, k7, m7, arrayList);
            j7.c(viewGroup, u7);
            j7.y(viewGroup, arrayList2, arrayList, o7, aVar);
            A(k8, 0);
            j7.A(m7, arrayList2, arrayList);
        }
    }

    private static h p(h hVar, SparseArray sparseArray, int i7) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i7, hVar2);
        return hVar2;
    }

    private static Object q(y yVar, Fragment fragment, boolean z7) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z7 ? fragment.K() : fragment.u());
    }

    private static Object r(y yVar, Fragment fragment, boolean z7) {
        if (fragment == null) {
            return null;
        }
        return yVar.g(z7 ? fragment.M() : fragment.x());
    }

    static View s(r.a aVar, h hVar, Object obj, boolean z7) {
        ArrayList arrayList;
        androidx.fragment.app.a aVar2 = hVar.f2433c;
        if (obj == null || aVar == null || (arrayList = aVar2.f2384p) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) aVar.get(z7 ? (String) aVar2.f2384p.get(0) : (String) aVar2.f2385q.get(0));
    }

    private static Object t(y yVar, Fragment fragment, Fragment fragment2, boolean z7) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return yVar.B(yVar.g(z7 ? fragment2.O() : fragment.N()));
    }

    private static Object u(y yVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z7) {
        return (obj == null || obj2 == null || fragment == null) ? true : z7 ? fragment.n() : fragment.m() ? yVar.n(obj2, obj, obj3) : yVar.m(obj2, obj, obj3);
    }

    private static void v(y yVar, Object obj, Fragment fragment, ArrayList arrayList) {
        if (fragment != null && obj != null && fragment.B && fragment.P && fragment.f2090d0) {
            fragment.v1(true);
            yVar.r(obj, fragment.S(), arrayList);
            androidx.core.view.c0.a(fragment.W, new b(arrayList));
        }
    }

    private static y w() {
        try {
            return (y) Class.forName("androidx.transition.FragmentTransitionSupport").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    static void x(r.a aVar, r.a aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void y(y yVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList arrayList, Object obj, ArrayList arrayList2, Object obj2, ArrayList arrayList3) {
        androidx.core.view.c0.a(viewGroup, new d(obj, yVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(y yVar, Object obj, Object obj2, r.a aVar, boolean z7, androidx.fragment.app.a aVar2) {
        ArrayList arrayList = aVar2.f2384p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = (View) aVar.get(z7 ? (String) aVar2.f2385q.get(0) : (String) aVar2.f2384p.get(0));
        yVar.v(obj, view);
        if (obj2 != null) {
            yVar.v(obj2, view);
        }
    }
}
