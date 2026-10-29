package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;

/* compiled from: MyApplication */
class c extends androidx.appcompat.view.menu.a implements b.a {
    d A;
    private Drawable B;
    private boolean C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private final SparseBooleanArray N;
    e O;
    a P;
    RunnableC0009c Q;
    private b R;
    final f S;
    int T;

    /* compiled from: MyApplication */
    private class a extends androidx.appcompat.view.menu.i {
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, f.a.f23316i);
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = c.this.A;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) c.this).f413y : view2);
            }
            j(c.this.S);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            c cVar = c.this;
            cVar.P = null;
            cVar.T = 0;
            super.e();
        }
    }

    /* compiled from: MyApplication */
    private class b extends ActionMenuItemView.b {
        b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public l.e a() {
            a aVar = c.this.P;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    private class RunnableC0009c implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private e f681q;

        public RunnableC0009c(e eVar) {
            this.f681q = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f407s != null) {
                ((androidx.appcompat.view.menu.a) c.this).f407s.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).f413y;
            if (view != null && view.getWindowToken() != null && this.f681q.m()) {
                c.this.O = this.f681q;
            }
            c.this.Q = null;
        }
    }

    /* compiled from: MyApplication */
    private class d extends AppCompatImageView implements ActionMenuView.a {

        /* compiled from: MyApplication */
        class a extends x0 {

            /* renamed from: z, reason: collision with root package name */
            final /* synthetic */ c f684z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                this.f684z = cVar;
            }

            @Override // androidx.appcompat.widget.x0
            public l.e b() {
                e eVar = c.this.O;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.x0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.x0
            public boolean d() {
                c cVar = c.this;
                if (cVar.Q != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, f.a.f23315h);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            v1.a(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i7, int i8, int i9, int i10) {
            boolean frame = super.setFrame(i7, i8, i9, i10);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.k(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* compiled from: MyApplication */
    private class e extends androidx.appcompat.view.menu.i {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z7) {
            super(context, eVar, view, z7, f.a.f23316i);
            h(8388613);
            j(c.this.S);
        }

        @Override // androidx.appcompat.view.menu.i
        protected void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f407s != null) {
                ((androidx.appcompat.view.menu.a) c.this).f407s.close();
            }
            c.this.O = null;
            super.e();
        }
    }

    /* compiled from: MyApplication */
    private class f implements j.a {
        f() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z7) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m7 = c.this.m();
            if (m7 != null) {
                m7.b(eVar, z7);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).f407s) {
                return false;
            }
            c.this.T = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m7 = c.this.m();
            if (m7 != null) {
                return m7.c(eVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, f.g.f23410c, f.g.f23409b);
        this.N = new SparseBooleanArray();
        this.S = new f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f413y;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.A;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.C) {
            return this.B;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        RunnableC0009c runnableC0009c = this.Q;
        if (runnableC0009c != null && (obj = this.f413y) != null) {
            ((View) obj).removeCallbacks(runnableC0009c);
            this.Q = null;
            return true;
        }
        e eVar = this.O;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.P;
        if (aVar == null) {
            return false;
        }
        aVar.b();
        return true;
    }

    public boolean D() {
        return this.Q != null || E();
    }

    public boolean E() {
        e eVar = this.O;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.I) {
            this.H = k.a.b(this.f406r).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f407s;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z7) {
        this.L = z7;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f413y = actionMenuView;
        actionMenuView.b(this.f407s);
    }

    public void I(Drawable drawable) {
        d dVar = this.A;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.C = true;
            this.B = drawable;
        }
    }

    public void J(boolean z7) {
        this.D = z7;
        this.E = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.D || E() || (eVar = this.f407s) == null || this.f413y == null || this.Q != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0009c runnableC0009c = new RunnableC0009c(new e(this.f406r, this.f407s, this.A, true));
        this.Q = runnableC0009c;
        ((View) this.f413y).post(runnableC0009c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z7) {
        y();
        super.b(eVar, z7);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void c(boolean z7) {
        super.c(z7);
        ((View) this.f413y).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f407s;
        boolean z8 = false;
        if (eVar != null) {
            ArrayList s7 = eVar.s();
            int size = s7.size();
            for (int i7 = 0; i7 < size; i7++) {
                androidx.core.view.b b8 = ((androidx.appcompat.view.menu.g) s7.get(i7)).b();
                if (b8 != null) {
                    b8.h(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f407s;
        ArrayList z9 = eVar2 != null ? eVar2.z() : null;
        if (this.D && z9 != null) {
            int size2 = z9.size();
            if (size2 == 1) {
                z8 = !((androidx.appcompat.view.menu.g) z9.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z8 = true;
            }
        }
        if (z8) {
            if (this.A == null) {
                this.A = new d(this.f405q);
            }
            ViewGroup viewGroup = (ViewGroup) this.A.getParent();
            if (viewGroup != this.f413y) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.A);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f413y;
                actionMenuView.addView(this.A, actionMenuView.B());
            }
        } else {
            d dVar = this.A;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f413y;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.A);
                }
            }
        }
        ((ActionMenuView) this.f413y).setOverflowReserved(this.D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.j
    public boolean d() {
        ArrayList arrayList;
        int i7;
        int i8;
        int i9;
        boolean z7;
        int i10;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f407s;
        View view = null;
        ?? r32 = 0;
        if (eVar != null) {
            arrayList = eVar.E();
            i7 = arrayList.size();
        } else {
            arrayList = null;
            i7 = 0;
        }
        int i11 = cVar.H;
        int i12 = cVar.G;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.f413y;
        boolean z8 = false;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i7; i15++) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) arrayList.get(i15);
            if (gVar.o()) {
                i13++;
            } else if (gVar.n()) {
                i14++;
            } else {
                z8 = true;
            }
            if (cVar.L && gVar.isActionViewExpanded()) {
                i11 = 0;
            }
        }
        if (cVar.D && (z8 || i14 + i13 > i11)) {
            i11--;
        }
        int i16 = i11 - i13;
        SparseBooleanArray sparseBooleanArray = cVar.N;
        sparseBooleanArray.clear();
        if (cVar.J) {
            int i17 = cVar.M;
            i9 = i12 / i17;
            i8 = i17 + ((i12 % i17) / i9);
        } else {
            i8 = 0;
            i9 = 0;
        }
        int i18 = 0;
        int i19 = 0;
        while (i18 < i7) {
            androidx.appcompat.view.menu.g gVar2 = (androidx.appcompat.view.menu.g) arrayList.get(i18);
            if (gVar2.o()) {
                View n7 = cVar.n(gVar2, view, viewGroup);
                if (cVar.J) {
                    i9 -= ActionMenuView.H(n7, i8, i9, makeMeasureSpec, r32);
                } else {
                    n7.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n7.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z7 = r32;
                i10 = i7;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z9 = sparseBooleanArray.get(groupId2);
                boolean z10 = (i16 > 0 || z9) && i12 > 0 && (!cVar.J || i9 > 0);
                boolean z11 = z10;
                i10 = i7;
                if (z10) {
                    View n8 = cVar.n(gVar2, null, viewGroup);
                    if (cVar.J) {
                        int H = ActionMenuView.H(n8, i8, i9, makeMeasureSpec, 0);
                        i9 -= H;
                        if (H == 0) {
                            z11 = false;
                        }
                    } else {
                        n8.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z12 = z11;
                    int measuredWidth2 = n8.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z10 = z12 & (!cVar.J ? i12 + i19 <= 0 : i12 < 0);
                }
                if (z10 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z9) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i20 = 0; i20 < i18; i20++) {
                        androidx.appcompat.view.menu.g gVar3 = (androidx.appcompat.view.menu.g) arrayList.get(i20);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i16++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z10) {
                    i16--;
                }
                gVar2.u(z10);
                z7 = false;
            } else {
                z7 = r32;
                i10 = i7;
                gVar2.u(z7);
            }
            i18++;
            r32 = z7;
            i7 = i10;
            view = null;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void h(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f413y);
        if (this.R == null) {
            this.R = new b();
        }
        actionMenuItemView.setPopupCallback(this.R);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        k.a b8 = k.a.b(context);
        if (!this.E) {
            this.D = b8.f();
        }
        if (!this.K) {
            this.F = b8.c();
        }
        if (!this.I) {
            this.H = b8.d();
        }
        int i7 = this.F;
        if (this.D) {
            if (this.A == null) {
                d dVar = new d(this.f405q);
                this.A = dVar;
                if (this.C) {
                    dVar.setImageDrawable(this.B);
                    this.B = null;
                    this.C = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i7 -= this.A.getMeasuredWidth();
        } else {
            this.A = null;
        }
        this.G = i7;
        this.M = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean k(androidx.appcompat.view.menu.m mVar) {
        boolean z7 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.e0() != this.f407s) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.e0();
        }
        View z8 = z(mVar2.getItem());
        if (z8 == null) {
            return false;
        }
        this.T = mVar.getItem().getItemId();
        int size = mVar.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                z7 = true;
                break;
            }
            i7++;
        }
        a aVar = new a(this.f406r, mVar, z8);
        this.P = aVar;
        aVar.g(z7);
        this.P.k();
        super.k(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i7) {
        if (viewGroup.getChildAt(i7) == this.A) {
            return false;
        }
        return super.l(viewGroup, i7);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.f413y;
        androidx.appcompat.view.menu.k o7 = super.o(viewGroup);
        if (kVar != o7) {
            ((ActionMenuView) o7).setPresenter(this);
        }
        return o7;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i7, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
