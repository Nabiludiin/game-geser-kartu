package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.core.os.c;
import androidx.core.view.e0;
import androidx.core.view.h0;
import androidx.fragment.app.b0;
import androidx.fragment.app.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
class c extends b0 {

    /* compiled from: MyApplication */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2189a;

        static {
            int[] iArr = new int[b0.e.c.values().length];
            f2189a = iArr;
            try {
                iArr[b0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2189a[b0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2189a[b0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2189a[b0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ List f2190q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ b0.e f2191r;

        b(List list, b0.e eVar) {
            this.f2190q = list;
            this.f2191r = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2190q.contains(this.f2191r)) {
                this.f2190q.remove(this.f2191r);
                c.this.s(this.f2191r);
            }
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    class C0037c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2193a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2194b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f2195c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0.e f2196d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f2197e;

        C0037c(ViewGroup viewGroup, View view, boolean z7, b0.e eVar, k kVar) {
            this.f2193a = viewGroup;
            this.f2194b = view;
            this.f2195c = z7;
            this.f2196d = eVar;
            this.f2197e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2193a.endViewTransition(this.f2194b);
            if (this.f2195c) {
                this.f2196d.e().c(this.f2194b);
            }
            this.f2197e.a();
        }
    }

    /* compiled from: MyApplication */
    class d implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f2199a;

        d(Animator animator) {
            this.f2199a = animator;
        }

        @Override // androidx.core.os.c.b
        public void onCancel() {
            this.f2199a.end();
        }
    }

    /* compiled from: MyApplication */
    class f implements c.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f2206a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2207b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f2208c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f2206a = view;
            this.f2207b = viewGroup;
            this.f2208c = kVar;
        }

        @Override // androidx.core.os.c.b
        public void onCancel() {
            this.f2206a.clearAnimation();
            this.f2207b.endViewTransition(this.f2206a);
            this.f2208c.a();
        }
    }

    /* compiled from: MyApplication */
    class g implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ b0.e f2210q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ b0.e f2211r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ boolean f2212s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ r.a f2213t;

        g(b0.e eVar, b0.e eVar2, boolean z7, r.a aVar) {
            this.f2210q = eVar;
            this.f2211r = eVar2;
            this.f2212s = z7;
            this.f2213t = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.f(this.f2210q.f(), this.f2211r.f(), this.f2212s, this.f2213t, false);
        }
    }

    /* compiled from: MyApplication */
    class h implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ y f2215q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ View f2216r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Rect f2217s;

        h(y yVar, View view, Rect rect) {
            this.f2215q = yVar;
            this.f2216r = view;
            this.f2217s = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2215q.k(this.f2216r, this.f2217s);
        }
    }

    /* compiled from: MyApplication */
    class i implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ArrayList f2219q;

        i(ArrayList arrayList) {
            this.f2219q = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            w.A(this.f2219q, 4);
        }
    }

    /* compiled from: MyApplication */
    class j implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ m f2221q;

        j(m mVar) {
            this.f2221q = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2221q.a();
        }
    }

    /* compiled from: MyApplication */
    private static class k extends l {

        /* renamed from: c, reason: collision with root package name */
        private boolean f2223c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f2224d;

        /* renamed from: e, reason: collision with root package name */
        private f.d f2225e;

        k(b0.e eVar, androidx.core.os.c cVar, boolean z7) {
            super(eVar, cVar);
            this.f2224d = false;
            this.f2223c = z7;
        }

        f.d e(Context context) {
            if (this.f2224d) {
                return this.f2225e;
            }
            f.d c8 = androidx.fragment.app.f.c(context, b().f(), b().e() == b0.e.c.VISIBLE, this.f2223c);
            this.f2225e = c8;
            this.f2224d = true;
            return c8;
        }
    }

    /* compiled from: MyApplication */
    private static class l {

        /* renamed from: a, reason: collision with root package name */
        private final b0.e f2226a;

        /* renamed from: b, reason: collision with root package name */
        private final androidx.core.os.c f2227b;

        l(b0.e eVar, androidx.core.os.c cVar) {
            this.f2226a = eVar;
            this.f2227b = cVar;
        }

        void a() {
            this.f2226a.d(this.f2227b);
        }

        b0.e b() {
            return this.f2226a;
        }

        androidx.core.os.c c() {
            return this.f2227b;
        }

        boolean d() {
            b0.e.c j7 = b0.e.c.j(this.f2226a.f().X);
            b0.e.c e8 = this.f2226a.e();
            if (j7 == e8) {
                return true;
            }
            b0.e.c cVar = b0.e.c.VISIBLE;
            return (j7 == cVar || e8 == cVar) ? false : true;
        }
    }

    /* compiled from: MyApplication */
    private static class m extends l {

        /* renamed from: c, reason: collision with root package name */
        private final Object f2228c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f2229d;

        /* renamed from: e, reason: collision with root package name */
        private final Object f2230e;

        m(b0.e eVar, androidx.core.os.c cVar, boolean z7, boolean z8) {
            super(eVar, cVar);
            if (eVar.e() == b0.e.c.VISIBLE) {
                this.f2228c = z7 ? eVar.f().K() : eVar.f().u();
                this.f2229d = z7 ? eVar.f().n() : eVar.f().m();
            } else {
                this.f2228c = z7 ? eVar.f().M() : eVar.f().x();
                this.f2229d = true;
            }
            if (!z8) {
                this.f2230e = null;
            } else if (z7) {
                this.f2230e = eVar.f().O();
            } else {
                this.f2230e = eVar.f().N();
            }
        }

        private y f(Object obj) {
            if (obj == null) {
                return null;
            }
            y yVar = w.f2397b;
            if (yVar != null && yVar.e(obj)) {
                return yVar;
            }
            y yVar2 = w.f2398c;
            if (yVar2 != null && yVar2.e(obj)) {
                return yVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        y e() {
            y f8 = f(this.f2228c);
            y f9 = f(this.f2230e);
            if (f8 == null || f9 == null || f8 == f9) {
                return f8 != null ? f8 : f9;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f2228c + " which uses a different Transition  type than its shared element transition " + this.f2230e);
        }

        public Object g() {
            return this.f2230e;
        }

        Object h() {
            return this.f2228c;
        }

        public boolean i() {
            return this.f2230e != null;
        }

        boolean j() {
            return this.f2229d;
        }
    }

    c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List list, List list2, boolean z7, Map map) {
        ViewGroup m7 = m();
        Context context = m7.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i7 = 0;
        boolean z8 = false;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.d()) {
                kVar.a();
            } else {
                f.d e8 = kVar.e(context);
                if (e8 == null) {
                    kVar.a();
                } else {
                    Animator animator = e8.f2261b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        b0.e b8 = kVar.b();
                        Fragment f8 = b8.f();
                        if (Boolean.TRUE.equals(map.get(b8))) {
                            if (n.D0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + f8 + " as this Fragment was involved in a Transition.");
                            }
                            kVar.a();
                        } else {
                            boolean z9 = b8.e() == b0.e.c.GONE;
                            if (z9) {
                                list2.remove(b8);
                            }
                            View view = f8.X;
                            m7.startViewTransition(view);
                            animator.addListener(new C0037c(m7, view, z9, b8, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.c().c(new d(animator));
                            z8 = true;
                        }
                    }
                }
            }
        }
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            k kVar2 = (k) obj;
            b0.e b9 = kVar2.b();
            Fragment f9 = b9.f();
            if (z7) {
                if (n.D0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f9 + " as Animations cannot run alongside Transitions.");
                }
                kVar2.a();
            } else if (z8) {
                if (n.D0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + f9 + " as Animations cannot run alongside Animators.");
                }
                kVar2.a();
            } else {
                View view2 = f9.X;
                Animation animation = (Animation) androidx.core.util.e.f(((f.d) androidx.core.util.e.f(kVar2.e(context))).f2260a);
                if (b9.e() != b0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    m7.startViewTransition(view2);
                    f.e eVar = new f.e(animation, m7, view2);
                    eVar.setAnimationListener(new e(m7, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().c(new f(view2, m7, kVar2));
            }
        }
    }

    private Map x(List list, List list2, boolean z7, b0.e eVar, b0.e eVar2) {
        Object obj;
        ArrayList arrayList;
        Object obj2;
        Object obj3;
        View view;
        View view2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        b0.e eVar3;
        View view3;
        Rect rect;
        ArrayList arrayList4;
        r.a aVar;
        View view4;
        ArrayList arrayList5;
        int i7;
        View view5;
        c cVar = this;
        boolean z8 = z7;
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        y yVar = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.d()) {
                y e8 = mVar.e();
                if (yVar == null) {
                    yVar = e8;
                } else if (e8 != null && yVar != e8) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (yVar == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                hashMap.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
        } else {
            View view6 = new View(cVar.m().getContext());
            Rect rect2 = new Rect();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            r.a aVar2 = new r.a();
            Iterator it3 = list.iterator();
            Object obj4 = null;
            View view7 = null;
            boolean z9 = false;
            while (it3.hasNext()) {
                m mVar3 = (m) it3.next();
                if (!mVar3.i() || eVar == null || eVar2 == null) {
                    view3 = view6;
                    rect = rect2;
                    arrayList4 = arrayList6;
                    aVar = aVar2;
                    view4 = view7;
                    arrayList5 = arrayList7;
                } else {
                    Object B = yVar.B(yVar.g(mVar3.g()));
                    ArrayList P = eVar2.f().P();
                    ArrayList P2 = eVar.f().P();
                    ArrayList Q = eVar.f().Q();
                    int i8 = 0;
                    while (i8 < Q.size()) {
                        int indexOf = P.indexOf(Q.get(i8));
                        Object obj5 = B;
                        if (indexOf != -1) {
                            P.set(indexOf, P2.get(i8));
                        }
                        i8++;
                        B = obj5;
                    }
                    Object obj6 = B;
                    ArrayList Q2 = eVar2.f().Q();
                    if (z8) {
                        eVar.f().v();
                        eVar2.f().y();
                    } else {
                        eVar.f().y();
                        eVar2.f().v();
                    }
                    int size = P.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        aVar2.put((String) P.get(i9), (String) Q2.get(i9));
                    }
                    r.a aVar3 = new r.a();
                    cVar.u(aVar3, eVar.f().X);
                    aVar3.o(P);
                    aVar2.o(aVar3.keySet());
                    r.a aVar4 = new r.a();
                    cVar.u(aVar4, eVar2.f().X);
                    aVar4.o(Q2);
                    aVar4.o(aVar2.values());
                    w.x(aVar2, aVar4);
                    cVar.v(aVar3, aVar2.keySet());
                    cVar.v(aVar4, aVar2.values());
                    if (aVar2.isEmpty()) {
                        arrayList6.clear();
                        arrayList7.clear();
                        view3 = view6;
                        rect = rect2;
                        arrayList4 = arrayList6;
                        aVar = aVar2;
                        arrayList5 = arrayList7;
                        obj4 = null;
                        z8 = z7;
                        arrayList7 = arrayList5;
                        arrayList6 = arrayList4;
                        aVar2 = aVar;
                        view6 = view3;
                        rect2 = rect;
                    } else {
                        w.f(eVar2.f(), eVar.f(), z8, aVar3, true);
                        aVar = aVar2;
                        view4 = view7;
                        cVar = this;
                        androidx.core.view.c0.a(m(), cVar.new g(eVar2, eVar, z8, aVar4));
                        arrayList6.addAll(aVar3.values());
                        if (P.isEmpty()) {
                            i7 = 0;
                        } else {
                            i7 = 0;
                            View view8 = (View) aVar3.get((String) P.get(0));
                            yVar.v(obj6, view8);
                            view4 = view8;
                        }
                        arrayList7.addAll(aVar4.values());
                        if (!Q2.isEmpty() && (view5 = (View) aVar4.get((String) Q2.get(i7))) != null) {
                            androidx.core.view.c0.a(cVar.m(), cVar.new h(yVar, view5, rect2));
                            z9 = true;
                        }
                        yVar.z(obj6, view6, arrayList6);
                        rect = rect2;
                        view3 = view6;
                        yVar.t(obj6, null, null, null, null, obj6, arrayList7);
                        arrayList5 = arrayList7;
                        Boolean bool = Boolean.TRUE;
                        hashMap.put(eVar, bool);
                        hashMap.put(eVar2, bool);
                        arrayList4 = arrayList6;
                        obj4 = obj6;
                    }
                }
                view7 = view4;
                z8 = z7;
                arrayList7 = arrayList5;
                arrayList6 = arrayList4;
                aVar2 = aVar;
                view6 = view3;
                rect2 = rect;
            }
            b0.e eVar4 = eVar;
            b0.e eVar5 = eVar2;
            View view9 = view6;
            Rect rect3 = rect2;
            ArrayList arrayList8 = arrayList6;
            r.a aVar5 = aVar2;
            View view10 = view7;
            ArrayList arrayList9 = arrayList7;
            boolean z10 = false;
            ArrayList arrayList10 = new ArrayList();
            Iterator it4 = list.iterator();
            Object obj7 = null;
            Object obj8 = null;
            while (it4.hasNext()) {
                m mVar4 = (m) it4.next();
                if (mVar4.d()) {
                    hashMap.put(mVar4.b(), Boolean.FALSE);
                    mVar4.a();
                } else {
                    Object g8 = yVar.g(mVar4.h());
                    b0.e b8 = mVar4.b();
                    boolean z11 = (obj4 == null || !(b8 == eVar4 || b8 == eVar5)) ? z10 : true;
                    if (g8 == null) {
                        if (!z11) {
                            hashMap.put(b8, Boolean.FALSE);
                            mVar4.a();
                        }
                        view = view9;
                        arrayList = arrayList8;
                        arrayList3 = arrayList10;
                        view2 = view10;
                        arrayList2 = arrayList9;
                    } else {
                        ArrayList arrayList11 = arrayList10;
                        ArrayList arrayList12 = new ArrayList();
                        cVar.t(arrayList12, b8.f().X);
                        if (z11) {
                            if (b8 == eVar4) {
                                arrayList12.removeAll(arrayList8);
                            } else {
                                arrayList12.removeAll(arrayList9);
                            }
                        }
                        if (arrayList12.isEmpty()) {
                            yVar.a(g8, view9);
                            view = view9;
                            arrayList = arrayList8;
                            obj2 = obj7;
                            obj3 = obj8;
                            eVar3 = b8;
                            view2 = view10;
                            arrayList3 = arrayList11;
                            arrayList2 = arrayList9;
                            obj = g8;
                        } else {
                            yVar.b(g8, arrayList12);
                            ArrayList arrayList13 = arrayList9;
                            obj = g8;
                            arrayList = arrayList8;
                            obj2 = obj7;
                            obj3 = obj8;
                            view = view9;
                            view2 = view10;
                            arrayList2 = arrayList13;
                            arrayList3 = arrayList11;
                            yVar.t(obj, obj, arrayList12, null, null, null, null);
                            if (b8.e() == b0.e.c.GONE) {
                                eVar3 = b8;
                                list2.remove(eVar3);
                                ArrayList arrayList14 = new ArrayList(arrayList12);
                                arrayList14.remove(eVar3.f().X);
                                yVar.r(obj, eVar3.f().X, arrayList14);
                                androidx.core.view.c0.a(cVar.m(), cVar.new i(arrayList12));
                            } else {
                                eVar3 = b8;
                            }
                        }
                        if (eVar3.e() == b0.e.c.VISIBLE) {
                            arrayList3.addAll(arrayList12);
                            if (z9) {
                                yVar.u(obj, rect3);
                            }
                        } else {
                            yVar.v(obj, view2);
                        }
                        hashMap.put(eVar3, Boolean.TRUE);
                        if (mVar4.j()) {
                            obj2 = yVar.n(obj2, obj, null);
                        } else {
                            obj3 = yVar.n(obj3, obj, null);
                        }
                        obj7 = obj2;
                        obj8 = obj3;
                    }
                    eVar4 = eVar;
                    eVar5 = eVar2;
                    arrayList10 = arrayList3;
                    arrayList9 = arrayList2;
                    arrayList8 = arrayList;
                    z10 = false;
                    view10 = view2;
                    view9 = view;
                }
            }
            ArrayList arrayList15 = arrayList9;
            ArrayList arrayList16 = arrayList8;
            ArrayList arrayList17 = arrayList10;
            Object m7 = yVar.m(obj7, obj8, obj4);
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                m mVar5 = (m) it5.next();
                if (!mVar5.d()) {
                    Object h8 = mVar5.h();
                    b0.e b9 = mVar5.b();
                    boolean z12 = obj4 != null && (b9 == eVar || b9 == eVar2);
                    if (h8 != null || z12) {
                        if (e0.B(cVar.m())) {
                            yVar.w(mVar5.b().f(), m7, mVar5.c(), cVar.new j(mVar5));
                        } else {
                            if (n.D0(2)) {
                                Log.v("FragmentManager", "SpecialEffectsController: Container " + cVar.m() + " has not been laid out. Completing operation " + b9);
                            }
                            mVar5.a();
                        }
                    }
                }
            }
            if (e0.B(cVar.m())) {
                w.A(arrayList17, 4);
                ArrayList o7 = yVar.o(arrayList15);
                yVar.c(cVar.m(), m7);
                yVar.y(cVar.m(), arrayList16, arrayList15, o7, aVar5);
                w.A(arrayList17, 0);
                yVar.A(obj4, arrayList16, arrayList15);
                return hashMap;
            }
        }
        return hashMap;
    }

    @Override // androidx.fragment.app.b0
    void f(List list, boolean z7) {
        int i7;
        Iterator it = list.iterator();
        b0.e eVar = null;
        b0.e eVar2 = null;
        while (it.hasNext()) {
            b0.e eVar3 = (b0.e) it.next();
            b0.e.c j7 = b0.e.c.j(eVar3.f().X);
            int i8 = a.f2189a[eVar3.e().ordinal()];
            if (i8 == 1 || i8 == 2 || i8 == 3) {
                if (j7 == b0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i8 == 4 && j7 != b0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        List arrayList = new ArrayList();
        List arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        Iterator it2 = list.iterator();
        while (true) {
            i7 = 0;
            r9 = false;
            boolean z8 = false;
            if (!it2.hasNext()) {
                break;
            }
            b0.e eVar4 = (b0.e) it2.next();
            androidx.core.os.c cVar = new androidx.core.os.c();
            eVar4.j(cVar);
            arrayList.add(new k(eVar4, cVar, z7));
            androidx.core.os.c cVar2 = new androidx.core.os.c();
            eVar4.j(cVar2);
            if (z7) {
                if (eVar4 != eVar) {
                    arrayList2.add(new m(eVar4, cVar2, z7, z8));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z8 = true;
                arrayList2.add(new m(eVar4, cVar2, z7, z8));
                eVar4.a(new b(arrayList3, eVar4));
            } else {
                if (eVar4 != eVar2) {
                    arrayList2.add(new m(eVar4, cVar2, z7, z8));
                    eVar4.a(new b(arrayList3, eVar4));
                }
                z8 = true;
                arrayList2.add(new m(eVar4, cVar2, z7, z8));
                eVar4.a(new b(arrayList3, eVar4));
            }
        }
        Map x7 = x(arrayList2, arrayList3, z7, eVar, eVar2);
        w(arrayList, arrayList3, x7.containsValue(Boolean.TRUE), x7);
        int size = arrayList3.size();
        while (i7 < size) {
            Object obj = arrayList3.get(i7);
            i7++;
            s((b0.e) obj);
        }
        arrayList3.clear();
    }

    void s(b0.e eVar) {
        eVar.e().c(eVar.f().X);
    }

    void t(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (h0.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map map, View view) {
        String w7 = e0.w(view);
        if (w7 != null) {
            map.put(w7, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(r.a aVar, Collection collection) {
        Iterator it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(e0.w((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    /* compiled from: MyApplication */
    class e implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f2201a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2202b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f2203c;

        /* compiled from: MyApplication */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f2201a.endViewTransition(eVar.f2202b);
                e.this.f2203c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f2201a = viewGroup;
            this.f2202b = view;
            this.f2203c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2201a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }
}
