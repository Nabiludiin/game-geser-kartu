package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.f1;
import androidx.core.view.e0;
import androidx.core.view.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
final class b extends h implements j, View.OnKeyListener, PopupWindow.OnDismissListener {
    private static final int R = f.g.f23412e;
    private View E;
    View F;
    private boolean H;
    private boolean I;
    private int J;
    private int K;
    private boolean M;
    private j.a N;
    ViewTreeObserver O;
    private PopupWindow.OnDismissListener P;
    boolean Q;

    /* renamed from: r, reason: collision with root package name */
    private final Context f415r;

    /* renamed from: s, reason: collision with root package name */
    private final int f416s;

    /* renamed from: t, reason: collision with root package name */
    private final int f417t;

    /* renamed from: u, reason: collision with root package name */
    private final int f418u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f419v;

    /* renamed from: w, reason: collision with root package name */
    final Handler f420w;

    /* renamed from: x, reason: collision with root package name */
    private final List f421x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    final List f422y = new ArrayList();

    /* renamed from: z, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f423z = new a();
    private final View.OnAttachStateChangeListener A = new ViewOnAttachStateChangeListenerC0007b();
    private final d1 B = new c();
    private int C = 0;
    private int D = 0;
    private boolean L = false;
    private int G = D();

    /* compiled from: MyApplication */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f422y.size() <= 0 || ((d) b.this.f422y.get(0)).f431a.x()) {
                return;
            }
            View view = b.this.F;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f422y.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f431a.h();
            }
        }
    }

    /* compiled from: MyApplication */
    class c implements d1 {

        /* compiled from: MyApplication */
        class a implements Runnable {

            /* renamed from: q, reason: collision with root package name */
            final /* synthetic */ d f427q;

            /* renamed from: r, reason: collision with root package name */
            final /* synthetic */ MenuItem f428r;

            /* renamed from: s, reason: collision with root package name */
            final /* synthetic */ e f429s;

            a(d dVar, MenuItem menuItem, e eVar) {
                this.f427q = dVar;
                this.f428r = menuItem;
                this.f429s = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f427q;
                if (dVar != null) {
                    b.this.Q = true;
                    dVar.f432b.e(false);
                    b.this.Q = false;
                }
                if (this.f428r.isEnabled() && this.f428r.hasSubMenu()) {
                    this.f429s.L(this.f428r, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.d1
        public void c(e eVar, MenuItem menuItem) {
            b.this.f420w.removeCallbacksAndMessages(null);
            int size = b.this.f422y.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                } else if (eVar == ((d) b.this.f422y.get(i7)).f432b) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 == -1) {
                return;
            }
            int i8 = i7 + 1;
            b.this.f420w.postAtTime(new a(i8 < b.this.f422y.size() ? (d) b.this.f422y.get(i8) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.d1
        public void f(e eVar, MenuItem menuItem) {
            b.this.f420w.removeCallbacksAndMessages(eVar);
        }
    }

    /* compiled from: MyApplication */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        public final f1 f431a;

        /* renamed from: b, reason: collision with root package name */
        public final e f432b;

        /* renamed from: c, reason: collision with root package name */
        public final int f433c;

        public d(f1 f1Var, e eVar, int i7) {
            this.f431a = f1Var;
            this.f432b = eVar;
            this.f433c = i7;
        }

        public ListView a() {
            return this.f431a.j();
        }
    }

    public b(Context context, View view, int i7, int i8, boolean z7) {
        this.f415r = context;
        this.E = view;
        this.f417t = i7;
        this.f418u = i8;
        this.f419v = z7;
        Resources resources = context.getResources();
        this.f416s = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(f.d.f23344b));
        this.f420w = new Handler();
    }

    private int A(e eVar) {
        int size = this.f422y.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (eVar == ((d) this.f422y.get(i7)).f432b) {
                return i7;
            }
        }
        return -1;
    }

    private MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = eVar.getItem(i7);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int i7;
        int firstVisiblePosition;
        MenuItem B = B(dVar.f432b, eVar);
        if (B == null) {
            return null;
        }
        ListView a8 = dVar.a();
        ListAdapter adapter = a8.getAdapter();
        int i8 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i7 = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            i7 = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i8 >= count) {
                i8 = -1;
                break;
            }
            if (B == dVar2.getItem(i8)) {
                break;
            }
            i8++;
        }
        if (i8 != -1 && (firstVisiblePosition = (i8 + i7) - a8.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a8.getChildCount()) {
            return a8.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return e0.r(this.E) == 1 ? 0 : 1;
    }

    private int E(int i7) {
        List list = this.f422y;
        ListView a8 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a8.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.F.getWindowVisibleDisplayFrame(rect);
        return this.G == 1 ? (iArr[0] + a8.getWidth()) + i7 > rect.right ? 0 : 1 : iArr[0] - i7 < 0 ? 1 : 0;
    }

    private void F(e eVar) {
        d dVar;
        View view;
        int i7;
        int i8;
        int i9;
        LayoutInflater from = LayoutInflater.from(this.f415r);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, from, this.f419v, R);
        if (!a() && this.L) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(h.x(eVar));
        }
        int o7 = h.o(dVar2, null, this.f415r, this.f416s);
        f1 z7 = z();
        z7.p(dVar2);
        z7.B(o7);
        z7.C(this.D);
        if (this.f422y.size() > 0) {
            List list = this.f422y;
            dVar = (d) list.get(list.size() - 1);
            view = C(dVar, eVar);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            z7.Q(false);
            z7.N(null);
            int E = E(o7);
            boolean z8 = E == 1;
            this.G = E;
            if (Build.VERSION.SDK_INT >= 26) {
                z7.z(view);
                i8 = 0;
                i7 = 0;
            } else {
                int[] iArr = new int[2];
                this.E.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.D & 7) == 5) {
                    iArr[0] = iArr[0] + this.E.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i7 = iArr2[0] - iArr[0];
                i8 = iArr2[1] - iArr[1];
            }
            if ((this.D & 5) == 5) {
                if (!z8) {
                    o7 = view.getWidth();
                    i9 = i7 - o7;
                }
                i9 = i7 + o7;
            } else {
                if (z8) {
                    o7 = view.getWidth();
                    i9 = i7 + o7;
                }
                i9 = i7 - o7;
            }
            z7.d(i9);
            z7.I(true);
            z7.l(i8);
        } else {
            if (this.H) {
                z7.d(this.J);
            }
            if (this.I) {
                z7.l(this.K);
            }
            z7.D(n());
        }
        this.f422y.add(new d(z7, eVar, this.G));
        z7.h();
        ListView j7 = z7.j();
        j7.setOnKeyListener(this);
        if (dVar == null && this.M && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(f.g.f23419l, (ViewGroup) j7, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            j7.addHeaderView(frameLayout, null, false);
            z7.h();
        }
    }

    private f1 z() {
        f1 f1Var = new f1(this.f415r, null, this.f417t, this.f418u);
        f1Var.P(this.B);
        f1Var.H(this);
        f1Var.G(this);
        f1Var.z(this.E);
        f1Var.C(this.D);
        f1Var.F(true);
        f1Var.E(2);
        return f1Var;
    }

    @Override // l.e
    public boolean a() {
        return this.f422y.size() > 0 && ((d) this.f422y.get(0)).f431a.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z7) {
        int A = A(eVar);
        if (A < 0) {
            return;
        }
        int i7 = A + 1;
        if (i7 < this.f422y.size()) {
            ((d) this.f422y.get(i7)).f432b.e(false);
        }
        d dVar = (d) this.f422y.remove(A);
        dVar.f432b.O(this);
        if (this.Q) {
            dVar.f431a.O(null);
            dVar.f431a.A(0);
        }
        dVar.f431a.dismiss();
        int size = this.f422y.size();
        if (size > 0) {
            this.G = ((d) this.f422y.get(size - 1)).f433c;
        } else {
            this.G = D();
        }
        if (size != 0) {
            if (z7) {
                ((d) this.f422y.get(0)).f432b.e(false);
                return;
            }
            return;
        }
        dismiss();
        j.a aVar = this.N;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.O;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.O.removeGlobalOnLayoutListener(this.f423z);
            }
            this.O = null;
        }
        this.F.removeOnAttachStateChangeListener(this.A);
        this.P.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(boolean z7) {
        Iterator it = this.f422y.iterator();
        while (it.hasNext()) {
            h.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d() {
        return false;
    }

    @Override // l.e
    public void dismiss() {
        int size = this.f422y.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f422y.toArray(new d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                d dVar = dVarArr[i7];
                if (dVar.f431a.a()) {
                    dVar.f431a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(j.a aVar) {
        this.N = aVar;
    }

    @Override // l.e
    public void h() {
        if (a()) {
            return;
        }
        Iterator it = this.f421x.iterator();
        while (it.hasNext()) {
            F((e) it.next());
        }
        this.f421x.clear();
        View view = this.E;
        this.F = view;
        if (view != null) {
            boolean z7 = this.O == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.O = viewTreeObserver;
            if (z7) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f423z);
            }
            this.F.addOnAttachStateChangeListener(this.A);
        }
    }

    @Override // l.e
    public ListView j() {
        if (this.f422y.isEmpty()) {
            return null;
        }
        return ((d) this.f422y.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        for (d dVar : this.f422y) {
            if (mVar == dVar.f432b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        l(mVar);
        j.a aVar = this.N;
        if (aVar != null) {
            aVar.c(mVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
        eVar.c(this, this.f415r);
        if (a()) {
            F(eVar);
        } else {
            this.f421x.add(eVar);
        }
    }

    @Override // androidx.appcompat.view.menu.h
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f422y.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f422y.get(i7);
            if (!dVar.f431a.a()) {
                break;
            } else {
                i7++;
            }
        }
        if (dVar != null) {
            dVar.f432b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.h
    public void p(View view) {
        if (this.E != view) {
            this.E = view;
            this.D = o.a(this.C, e0.r(view));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z7) {
        this.L = z7;
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i7) {
        if (this.C != i7) {
            this.C = i7;
            this.D = o.a(i7, e0.r(this.E));
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i7) {
        this.H = true;
        this.J = i7;
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.P = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z7) {
        this.M = z7;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i7) {
        this.I = true;
        this.K = i7;
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    class ViewOnAttachStateChangeListenerC0007b implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC0007b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.O;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.O = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.O.removeGlobalOnLayoutListener(bVar.f423z);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
