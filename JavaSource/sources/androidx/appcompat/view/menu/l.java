package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.f1;
import androidx.core.view.e0;

/* compiled from: MyApplication */
final class l extends h implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, j, View.OnKeyListener {
    private static final int L = f.g.f23420m;
    private PopupWindow.OnDismissListener B;
    private View C;
    View D;
    private j.a E;
    ViewTreeObserver F;
    private boolean G;
    private boolean H;
    private int I;
    private boolean K;

    /* renamed from: r, reason: collision with root package name */
    private final Context f522r;

    /* renamed from: s, reason: collision with root package name */
    private final e f523s;

    /* renamed from: t, reason: collision with root package name */
    private final d f524t;

    /* renamed from: u, reason: collision with root package name */
    private final boolean f525u;

    /* renamed from: v, reason: collision with root package name */
    private final int f526v;

    /* renamed from: w, reason: collision with root package name */
    private final int f527w;

    /* renamed from: x, reason: collision with root package name */
    private final int f528x;

    /* renamed from: y, reason: collision with root package name */
    final f1 f529y;

    /* renamed from: z, reason: collision with root package name */
    final ViewTreeObserver.OnGlobalLayoutListener f530z = new a();
    private final View.OnAttachStateChangeListener A = new b();
    private int J = 0;

    /* compiled from: MyApplication */
    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!l.this.a() || l.this.f529y.x()) {
                return;
            }
            View view = l.this.D;
            if (view == null || !view.isShown()) {
                l.this.dismiss();
            } else {
                l.this.f529y.h();
            }
        }
    }

    public l(Context context, e eVar, View view, int i7, int i8, boolean z7) {
        this.f522r = context;
        this.f523s = eVar;
        this.f525u = z7;
        this.f524t = new d(eVar, LayoutInflater.from(context), z7, L);
        this.f527w = i7;
        this.f528x = i8;
        Resources resources = context.getResources();
        this.f526v = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(f.d.f23344b));
        this.C = view;
        this.f529y = new f1(context, null, i7, i8);
        eVar.c(this, context);
    }

    private boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.G || (view = this.C) == null) {
            return false;
        }
        this.D = view;
        this.f529y.G(this);
        this.f529y.H(this);
        this.f529y.F(true);
        View view2 = this.D;
        boolean z7 = this.F == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.F = viewTreeObserver;
        if (z7) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f530z);
        }
        view2.addOnAttachStateChangeListener(this.A);
        this.f529y.z(view2);
        this.f529y.C(this.J);
        if (!this.H) {
            this.I = h.o(this.f524t, null, this.f522r, this.f526v);
            this.H = true;
        }
        this.f529y.B(this.I);
        this.f529y.E(2);
        this.f529y.D(n());
        this.f529y.h();
        ListView j7 = this.f529y.j();
        j7.setOnKeyListener(this);
        if (this.K && this.f523s.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f522r).inflate(f.g.f23419l, (ViewGroup) j7, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f523s.x());
            }
            frameLayout.setEnabled(false);
            j7.addHeaderView(frameLayout, null, false);
        }
        this.f529y.p(this.f524t);
        this.f529y.h();
        return true;
    }

    @Override // l.e
    public boolean a() {
        return !this.G && this.f529y.a();
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(e eVar, boolean z7) {
        if (eVar != this.f523s) {
            return;
        }
        dismiss();
        j.a aVar = this.E;
        if (aVar != null) {
            aVar.b(eVar, z7);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void c(boolean z7) {
        this.H = false;
        d dVar = this.f524t;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean d() {
        return false;
    }

    @Override // l.e
    public void dismiss() {
        if (a()) {
            this.f529y.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public void g(j.a aVar) {
        this.E = aVar;
    }

    @Override // l.e
    public void h() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // l.e
    public ListView j() {
        return this.f529y.j();
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean k(m mVar) {
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.f522r, mVar, this.D, this.f525u, this.f527w, this.f528x);
            iVar.j(this.E);
            iVar.g(h.x(mVar));
            iVar.i(this.B);
            this.B = null;
            this.f523s.e(false);
            int b8 = this.f529y.b();
            int o7 = this.f529y.o();
            if ((Gravity.getAbsoluteGravity(this.J, e0.r(this.C)) & 7) == 5) {
                b8 += this.C.getWidth();
            }
            if (iVar.n(b8, o7)) {
                j.a aVar = this.E;
                if (aVar == null) {
                    return true;
                }
                aVar.c(mVar);
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.G = true;
        this.f523s.close();
        ViewTreeObserver viewTreeObserver = this.F;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.F = this.D.getViewTreeObserver();
            }
            this.F.removeGlobalOnLayoutListener(this.f530z);
            this.F = null;
        }
        this.D.removeOnAttachStateChangeListener(this.A);
        PopupWindow.OnDismissListener onDismissListener = this.B;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.C = view;
    }

    @Override // androidx.appcompat.view.menu.h
    public void r(boolean z7) {
        this.f524t.d(z7);
    }

    @Override // androidx.appcompat.view.menu.h
    public void s(int i7) {
        this.J = i7;
    }

    @Override // androidx.appcompat.view.menu.h
    public void t(int i7) {
        this.f529y.d(i7);
    }

    @Override // androidx.appcompat.view.menu.h
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.h
    public void v(boolean z7) {
        this.K = z7;
    }

    @Override // androidx.appcompat.view.menu.h
    public void w(int i7) {
        this.f529y.l(i7);
    }

    /* compiled from: MyApplication */
    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = l.this.F;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    l.this.F = view.getViewTreeObserver();
                }
                l lVar = l.this;
                lVar.F.removeGlobalOnLayoutListener(lVar.f530z);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // androidx.appcompat.view.menu.h
    public void l(e eVar) {
    }
}
