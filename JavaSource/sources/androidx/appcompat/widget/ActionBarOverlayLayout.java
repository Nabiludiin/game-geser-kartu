package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.j;
import androidx.core.view.p0;

/* compiled from: MyApplication */
public class ActionBarOverlayLayout extends ViewGroup implements s0, androidx.core.view.w, androidx.core.view.x {
    static final int[] V = {f.a.f23309b, R.attr.windowContentOverlay};
    boolean A;
    private int B;
    private int C;
    private final Rect D;
    private final Rect E;
    private final Rect F;
    private final Rect G;
    private final Rect H;
    private final Rect I;
    private final Rect J;
    private androidx.core.view.p0 K;
    private androidx.core.view.p0 L;
    private androidx.core.view.p0 M;
    private androidx.core.view.p0 N;
    private d O;
    private OverScroller P;
    ViewPropertyAnimator Q;
    final AnimatorListenerAdapter R;
    private final Runnable S;
    private final Runnable T;
    private final androidx.core.view.y U;

    /* renamed from: q, reason: collision with root package name */
    private int f547q;

    /* renamed from: r, reason: collision with root package name */
    private int f548r;

    /* renamed from: s, reason: collision with root package name */
    private ContentFrameLayout f549s;

    /* renamed from: t, reason: collision with root package name */
    ActionBarContainer f550t;

    /* renamed from: u, reason: collision with root package name */
    private t0 f551u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f552v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f553w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f554x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f555y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f556z;

    /* compiled from: MyApplication */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.Q = null;
            actionBarOverlayLayout.A = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.Q = null;
            actionBarOverlayLayout.A = false;
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.Q = actionBarOverlayLayout.f550t.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.R);
        }
    }

    /* compiled from: MyApplication */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.u();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.Q = actionBarOverlayLayout.f550t.animate().translationY(-ActionBarOverlayLayout.this.f550t.getHeight()).setListener(ActionBarOverlayLayout.this.R);
        }
    }

    /* compiled from: MyApplication */
    public interface d {
        void a();

        void b();

        void c(boolean z7);

        void d();

        void e();

        void onWindowVisibilityChanged(int i7);
    }

    /* compiled from: MyApplication */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i7, int i8) {
            super(i7, i8);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f548r = 0;
        this.D = new Rect();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new Rect();
        this.H = new Rect();
        this.I = new Rect();
        this.J = new Rect();
        androidx.core.view.p0 p0Var = androidx.core.view.p0.f1910b;
        this.K = p0Var;
        this.L = p0Var;
        this.M = p0Var;
        this.N = p0Var;
        this.R = new a();
        this.S = new b();
        this.T = new c();
        v(context);
        this.U = new androidx.core.view.y(this);
    }

    private void A() {
        u();
        this.S.run();
    }

    private boolean B(float f8) {
        this.P.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.P.getFinalY() > this.f550t.getHeight();
    }

    private void p() {
        u();
        this.T.run();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean q(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            return r0
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.q(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private t0 t(View view) {
        if (view instanceof t0) {
            return (t0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void v(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(V);
        this.f547q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f552v = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f553w = context.getApplicationInfo().targetSdkVersion < 19;
        this.P = new OverScroller(context);
    }

    private void x() {
        u();
        postDelayed(this.T, 600L);
    }

    private void y() {
        u();
        postDelayed(this.S, 600L);
    }

    @Override // androidx.appcompat.widget.s0
    public void a(Menu menu, j.a aVar) {
        z();
        this.f551u.a(menu, aVar);
    }

    @Override // androidx.appcompat.widget.s0
    public boolean b() {
        z();
        return this.f551u.b();
    }

    @Override // androidx.appcompat.widget.s0
    public void c() {
        z();
        this.f551u.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.s0
    public boolean d() {
        z();
        return this.f551u.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f552v == null || this.f553w) {
            return;
        }
        int bottom = this.f550t.getVisibility() == 0 ? (int) (this.f550t.getBottom() + this.f550t.getTranslationY() + 0.5f) : 0;
        this.f552v.setBounds(0, bottom, getWidth(), this.f552v.getIntrinsicHeight() + bottom);
        this.f552v.draw(canvas);
    }

    @Override // androidx.appcompat.widget.s0
    public boolean e() {
        z();
        return this.f551u.e();
    }

    @Override // androidx.appcompat.widget.s0
    public boolean f() {
        z();
        return this.f551u.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.s0
    public boolean g() {
        z();
        return this.f551u.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f550t;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.U.a();
    }

    public CharSequence getTitle() {
        z();
        return this.f551u.getTitle();
    }

    @Override // androidx.appcompat.widget.s0
    public void h(int i7) {
        z();
        if (i7 == 2) {
            this.f551u.r();
        } else if (i7 == 5) {
            this.f551u.s();
        } else {
            if (i7 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.appcompat.widget.s0
    public void i() {
        z();
        this.f551u.h();
    }

    @Override // androidx.core.view.x
    public void j(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        k(view, i7, i8, i9, i10, i11);
    }

    @Override // androidx.core.view.w
    public void k(View view, int i7, int i8, int i9, int i10, int i11) {
        if (i11 == 0) {
            onNestedScroll(view, i7, i8, i9, i10);
        }
    }

    @Override // androidx.core.view.w
    public boolean l(View view, View view2, int i7, int i8) {
        return i8 == 0 && onStartNestedScroll(view, view2, i7);
    }

    @Override // androidx.core.view.w
    public void m(View view, View view2, int i7, int i8) {
        if (i8 == 0) {
            onNestedScrollAccepted(view, view2, i7);
        }
    }

    @Override // androidx.core.view.w
    public void n(View view, int i7) {
        if (i7 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.w
    public void o(View view, int i7, int i8, int[] iArr, int i9) {
        if (i9 == 0) {
            onNestedPreScroll(view, i7, i8, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        z();
        androidx.core.view.p0 v7 = androidx.core.view.p0.v(windowInsets, this);
        boolean q7 = q(this.f550t, new Rect(v7.i(), v7.k(), v7.j(), v7.h()), true, true, false, true);
        androidx.core.view.e0.d(this, v7, this.D);
        Rect rect = this.D;
        androidx.core.view.p0 l7 = v7.l(rect.left, rect.top, rect.right, rect.bottom);
        this.K = l7;
        boolean z7 = true;
        if (!this.L.equals(l7)) {
            this.L = this.K;
            q7 = true;
        }
        if (this.E.equals(this.D)) {
            z7 = q7;
        } else {
            this.E.set(this.D);
        }
        if (z7) {
            requestLayout();
        }
        return v7.a().c().b().t();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v(getContext());
        androidx.core.view.e0.K(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i12, i13, measuredWidth + i12, measuredHeight + i13);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        int measuredHeight;
        z();
        measureChildWithMargins(this.f550t, i7, 0, i8, 0);
        e eVar = (e) this.f550t.getLayoutParams();
        int max = Math.max(0, this.f550t.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f550t.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f550t.getMeasuredState());
        boolean z7 = (androidx.core.view.e0.x(this) & 256) != 0;
        if (z7) {
            measuredHeight = this.f547q;
            if (this.f555y && this.f550t.getTabContainer() != null) {
                measuredHeight += this.f547q;
            }
        } else {
            measuredHeight = this.f550t.getVisibility() != 8 ? this.f550t.getMeasuredHeight() : 0;
        }
        this.F.set(this.D);
        androidx.core.view.p0 p0Var = this.K;
        this.M = p0Var;
        if (this.f554x || z7) {
            this.M = new p0.b(this.M).c(androidx.core.graphics.f.b(p0Var.i(), this.M.k() + measuredHeight, this.M.j(), this.M.h())).a();
        } else {
            Rect rect = this.F;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.M = p0Var.l(0, measuredHeight, 0, 0);
        }
        q(this.f549s, this.F, true, true, true, true);
        if (!this.N.equals(this.M)) {
            androidx.core.view.p0 p0Var2 = this.M;
            this.N = p0Var2;
            androidx.core.view.e0.e(this.f549s, p0Var2);
        }
        measureChildWithMargins(this.f549s, i7, 0, i8, 0);
        e eVar2 = (e) this.f549s.getLayoutParams();
        int max3 = Math.max(max, this.f549s.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f549s.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f549s.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z7) {
        if (!this.f556z || !z7) {
            return false;
        }
        if (B(f9)) {
            p();
        } else {
            A();
        }
        this.A = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.B + i8;
        this.B = i11;
        setActionBarHideOffset(i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        this.U.b(view, view2, i7);
        this.B = getActionBarHideOffset();
        u();
        d dVar = this.O;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        if ((i7 & 2) == 0 || this.f550t.getVisibility() != 0) {
            return false;
        }
        return this.f556z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f556z && !this.A) {
            if (this.B <= this.f550t.getHeight()) {
                y();
            } else {
                x();
            }
        }
        d dVar = this.O;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i7) {
        super.onWindowSystemUiVisibilityChanged(i7);
        z();
        int i8 = this.C ^ i7;
        this.C = i7;
        boolean z7 = (i7 & 4) == 0;
        boolean z8 = (i7 & 256) != 0;
        d dVar = this.O;
        if (dVar != null) {
            dVar.c(!z8);
            if (z7 || !z8) {
                this.O.a();
            } else {
                this.O.d();
            }
        }
        if ((i8 & 256) == 0 || this.O == null) {
            return;
        }
        androidx.core.view.e0.K(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i7) {
        super.onWindowVisibilityChanged(i7);
        this.f548r = i7;
        d dVar = this.O;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setActionBarHideOffset(int i7) {
        u();
        this.f550t.setTranslationY(-Math.max(0, Math.min(i7, this.f550t.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.O = dVar;
        if (getWindowToken() != null) {
            this.O.onWindowVisibilityChanged(this.f548r);
            int i7 = this.C;
            if (i7 != 0) {
                onWindowSystemUiVisibilityChanged(i7);
                androidx.core.view.e0.K(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z7) {
        this.f555y = z7;
    }

    public void setHideOnContentScrollEnabled(boolean z7) {
        if (z7 != this.f556z) {
            this.f556z = z7;
            if (z7) {
                return;
            }
            u();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i7) {
        z();
        this.f551u.setIcon(i7);
    }

    public void setLogo(int i7) {
        z();
        this.f551u.l(i7);
    }

    public void setOverlayMode(boolean z7) {
        this.f554x = z7;
        this.f553w = z7 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    @Override // androidx.appcompat.widget.s0
    public void setWindowCallback(Window.Callback callback) {
        z();
        this.f551u.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.s0
    public void setWindowTitle(CharSequence charSequence) {
        z();
        this.f551u.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    void u() {
        removeCallbacks(this.S);
        removeCallbacks(this.T);
        ViewPropertyAnimator viewPropertyAnimator = this.Q;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean w() {
        return this.f554x;
    }

    void z() {
        if (this.f549s == null) {
            this.f549s = (ContentFrameLayout) findViewById(f.f.f23383b);
            this.f550t = (ActionBarContainer) findViewById(f.f.f23384c);
            this.f551u = t(findViewById(f.f.f23382a));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        z();
        this.f551u.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z7) {
    }

    public void setUiOptions(int i7) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
    }
}
