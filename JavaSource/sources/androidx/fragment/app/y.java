package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.e0;
import androidx.core.view.h0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: MyApplication */
public abstract class y {

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f2453q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ ArrayList f2454r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ ArrayList f2455s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ ArrayList f2456t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ ArrayList f2457u;

        a(int i7, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f2453q = i7;
            this.f2454r = arrayList;
            this.f2455s = arrayList2;
            this.f2456t = arrayList3;
            this.f2457u = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i7 = 0; i7 < this.f2453q; i7++) {
                e0.Y((View) this.f2454r.get(i7), (String) this.f2455s.get(i7));
                e0.Y((View) this.f2456t.get(i7), (String) this.f2457u.get(i7));
            }
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ArrayList f2459q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Map f2460r;

        b(ArrayList arrayList, Map map) {
            this.f2459q = arrayList;
            this.f2460r = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2459q.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) this.f2459q.get(i7);
                String w7 = e0.w(view);
                if (w7 != null) {
                    e0.Y(view, y.i(this.f2460r, w7));
                }
            }
        }
    }

    /* compiled from: MyApplication */
    class c implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ ArrayList f2462q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ Map f2463r;

        c(ArrayList arrayList, Map map) {
            this.f2462q = arrayList;
            this.f2463r = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f2462q.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) this.f2462q.get(i7);
                e0.Y(view, (String) this.f2463r.get(e0.w(view)));
            }
        }
    }

    protected static void d(List list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        if (e0.w(view) != null) {
            list.add(view);
        }
        for (int i7 = size; i7 < list.size(); i7++) {
            View view2 = (View) list.get(i7);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = viewGroup.getChildAt(i8);
                    if (!h(list, childAt, size) && e0.w(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    private static boolean h(List list, View view, int i7) {
        for (int i8 = 0; i8 < i7; i8++) {
            if (list.get(i8) == view) {
                return true;
            }
        }
        return false;
    }

    static String i(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    protected static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    void f(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            if (!(view instanceof ViewGroup)) {
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (h0.a(viewGroup)) {
                arrayList.add(viewGroup);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                f(arrayList, viewGroup.getChildAt(i7));
            }
        }
    }

    public abstract Object g(Object obj);

    void j(Map map, View view) {
        if (view.getVisibility() == 0) {
            String w7 = e0.w(view);
            if (w7 != null) {
                map.put(w7, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i7 = 0; i7 < childCount; i7++) {
                    j(map, viewGroup.getChildAt(i7));
                }
            }
        }
    }

    protected void k(View view, Rect rect) {
        if (e0.A(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    ArrayList o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) arrayList.get(i7);
            arrayList2.add(e0.w(view));
            e0.Y(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void r(Object obj, View view, ArrayList arrayList);

    void s(ViewGroup viewGroup, ArrayList arrayList, Map map) {
        androidx.core.view.c0.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public abstract void w(Fragment fragment, Object obj, androidx.core.os.c cVar, Runnable runnable);

    void x(View view, ArrayList arrayList, Map map) {
        androidx.core.view.c0.a(view, new b(arrayList, map));
    }

    void y(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i7 = 0; i7 < size; i7++) {
            View view2 = (View) arrayList.get(i7);
            String w7 = e0.w(view2);
            arrayList4.add(w7);
            if (w7 != null) {
                e0.Y(view2, null);
                String str = (String) map.get(w7);
                int i8 = 0;
                while (true) {
                    if (i8 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i8))) {
                        e0.Y((View) arrayList2.get(i8), w7);
                        break;
                    }
                    i8++;
                }
            }
        }
        androidx.core.view.c0.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList arrayList);
}
