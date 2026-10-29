package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.accessibility.u;
import androidx.core.view.accessibility.w;
import androidx.core.view.e0;
import androidx.core.view.v;
import androidx.core.view.x;
import androidx.core.view.y;
import java.util.ArrayList;

/* compiled from: MyApplication */
public class NestedScrollView extends FrameLayout implements x {
    private static final float R = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final a S = new a();
    private static final int[] T = {R.attr.fillViewport};
    private boolean A;
    private VelocityTracker B;
    private boolean C;
    private boolean D;
    private int E;
    private int F;
    private int G;
    private int H;
    private final int[] I;
    private final int[] J;
    private int K;
    private int L;
    private d M;
    private final y N;
    private final v O;
    private float P;
    private c Q;

    /* renamed from: q, reason: collision with root package name */
    private final float f1953q;

    /* renamed from: r, reason: collision with root package name */
    private long f1954r;

    /* renamed from: s, reason: collision with root package name */
    private final Rect f1955s;

    /* renamed from: t, reason: collision with root package name */
    private OverScroller f1956t;

    /* renamed from: u, reason: collision with root package name */
    public EdgeEffect f1957u;

    /* renamed from: v, reason: collision with root package name */
    public EdgeEffect f1958v;

    /* renamed from: w, reason: collision with root package name */
    private int f1959w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f1960x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f1961y;

    /* renamed from: z, reason: collision with root package name */
    private View f1962z;

    /* compiled from: MyApplication */
    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            w.a(accessibilityEvent, nestedScrollView.getScrollX());
            w.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void g(View view, u uVar) {
            int scrollRange;
            super.g(view, uVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            uVar.I(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            uVar.M(true);
            if (nestedScrollView.getScrollY() > 0) {
                uVar.a(u.a.f1841q);
                uVar.a(u.a.B);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                uVar.a(u.a.f1840p);
                uVar.a(u.a.D);
            }
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i7, Bundle bundle) {
            if (super.j(view, i7, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i7 != 4096) {
                if (i7 == 8192 || i7 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.V(0, max, true);
                    return true;
                }
                if (i7 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.V(0, min, true);
            return true;
        }
    }

    /* compiled from: MyApplication */
    static class b {
        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* compiled from: MyApplication */
    public interface c {
        void a(NestedScrollView nestedScrollView, int i7, int i8, int i9, int i10);
    }

    /* compiled from: MyApplication */
    static class d extends View.BaseSavedState {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: q, reason: collision with root package name */
        public int f1963q;

        /* compiled from: MyApplication */
        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i7) {
                return new d[i7];
            }
        }

        d(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1963q + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f1963q);
        }

        d(Parcel parcel) {
            super(parcel);
            this.f1963q = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, y.a.f27468c);
    }

    private void A() {
        this.f1956t = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.E = viewConfiguration.getScaledTouchSlop();
        this.F = viewConfiguration.getScaledMinimumFlingVelocity();
        this.G = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void B() {
        if (this.B == null) {
            this.B = VelocityTracker.obtain();
        }
    }

    private void C(int i7, int i8) {
        this.f1959w = i7;
        this.H = i8;
        W(2, 0);
    }

    private boolean D(View view) {
        return !F(view, 0, getHeight());
    }

    private static boolean E(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && E((View) parent, view2);
    }

    private boolean F(View view, int i7, int i8) {
        view.getDrawingRect(this.f1955s);
        offsetDescendantRectToMyCoords(view, this.f1955s);
        return this.f1955s.bottom + i7 >= getScrollY() && this.f1955s.top - i7 <= getScrollY() + i8;
    }

    private void G(int i7, int i8, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.O.d(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    private void H(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.H) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f1959w = (int) motionEvent.getY(i7);
            this.H = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.B;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void K() {
        VelocityTracker velocityTracker = this.B;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.B = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int L(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f1957u
            float r0 = androidx.core.widget.e.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f1957u
            float r4 = -r4
            float r4 = androidx.core.widget.e.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f1957u
            float r5 = androidx.core.widget.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f1957u
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f1958v
            float r0 = androidx.core.widget.e.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f1958v
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.e.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f1958v
            float r5 = androidx.core.widget.e.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f1958v
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.L(int, float):int");
    }

    private void M(boolean z7) {
        if (z7) {
            W(2, 1);
        } else {
            Y(1);
        }
        this.L = getScrollY();
        e0.H(this);
    }

    private boolean N(int i7, int i8, int i9) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = height + scrollY;
        boolean z7 = false;
        boolean z8 = i7 == 33;
        View t7 = t(z8, i8, i9);
        if (t7 == null) {
            t7 = this;
        }
        if (i8 < scrollY || i9 > i10) {
            O(z8 ? i8 - scrollY : i9 - i10, 0, 1, true);
            z7 = true;
        }
        if (t7 != findFocus()) {
            t7.requestFocus(i7);
        }
        return z7;
    }

    private int O(int i7, int i8, int i9, boolean z7) {
        int i10;
        int i11;
        if (i9 == 1) {
            W(2, i9);
        }
        boolean z8 = false;
        if (h(0, i7, this.J, this.I, i9)) {
            int i12 = i7 - this.J[1];
            i11 = this.I[1];
            i10 = i12;
        } else {
            i10 = i7;
            i11 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z9 = c() && !z7;
        int i13 = i10;
        boolean z10 = I(0, i10, 0, scrollY, 0, scrollRange, 0, 0, true) && !x(i9);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.J;
        iArr[1] = 0;
        i(0, scrollY2, 0, i13 - scrollY2, this.I, i9, iArr);
        int i14 = i11 + this.I[1];
        int i15 = i13 - this.J[1];
        int i16 = scrollY + i15;
        if (i16 < 0) {
            if (z9) {
                e.d(this.f1957u, (-i15) / getHeight(), i8 / getWidth());
                if (!this.f1958v.isFinished()) {
                    this.f1958v.onRelease();
                }
            }
        } else if (i16 > scrollRange && z9) {
            e.d(this.f1958v, i15 / getHeight(), 1.0f - (i8 / getWidth()));
            if (!this.f1957u.isFinished()) {
                this.f1957u.onRelease();
            }
        }
        if (this.f1957u.isFinished() && this.f1958v.isFinished()) {
            z8 = z10;
        } else {
            e0.H(this);
        }
        if (z8 && i9 == 0) {
            this.B.clear();
        }
        if (i9 == 1) {
            Y(i9);
            this.f1957u.onRelease();
            this.f1958v.onRelease();
        }
        return i14;
    }

    private void P(View view) {
        view.getDrawingRect(this.f1955s);
        offsetDescendantRectToMyCoords(view, this.f1955s);
        int f8 = f(this.f1955s);
        if (f8 != 0) {
            scrollBy(0, f8);
        }
    }

    private boolean Q(Rect rect, boolean z7) {
        int f8 = f(rect);
        boolean z8 = f8 != 0;
        if (z8) {
            if (z7) {
                scrollBy(0, f8);
                return z8;
            }
            S(0, f8);
        }
        return z8;
    }

    private boolean R(EdgeEffect edgeEffect, int i7) {
        if (i7 > 0) {
            return true;
        }
        return w(-i7) < e.b(edgeEffect) * ((float) getHeight());
    }

    private void T(int i7, int i8, int i9, boolean z7) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1954r > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f1956t.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i8 + scrollY, Math.max(0, height - height2))) - scrollY, i9);
            M(z7);
        } else {
            if (!this.f1956t.isFinished()) {
                a();
            }
            scrollBy(i7, i8);
        }
        this.f1954r = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean X(MotionEvent motionEvent) {
        boolean z7;
        if (e.b(this.f1957u) != 0.0f) {
            e.d(this.f1957u, 0.0f, motionEvent.getX() / getWidth());
            z7 = true;
        } else {
            z7 = false;
        }
        if (e.b(this.f1958v) == 0.0f) {
            return z7;
        }
        e.d(this.f1958v, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void a() {
        this.f1956t.abortAnimation();
        Y(1);
    }

    private boolean c() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    private boolean d() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private static int e(int i7, int i8, int i9) {
        if (i8 >= i9 || i7 < 0) {
            return 0;
        }
        return i8 + i7 > i9 ? i9 - i8 : i7;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.P == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.P = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.P;
    }

    private void p(int i7) {
        if (i7 != 0) {
            if (this.D) {
                S(0, i7);
            } else {
                scrollBy(0, i7);
            }
        }
    }

    private boolean q(int i7) {
        if (e.b(this.f1957u) != 0.0f) {
            if (R(this.f1957u, i7)) {
                this.f1957u.onAbsorb(i7);
                return true;
            }
            u(-i7);
            return true;
        }
        if (e.b(this.f1958v) == 0.0f) {
            return false;
        }
        int i8 = -i7;
        if (R(this.f1958v, i8)) {
            this.f1958v.onAbsorb(i8);
            return true;
        }
        u(i8);
        return true;
    }

    private void r() {
        this.H = -1;
        this.A = false;
        K();
        Y(0);
        this.f1957u.onRelease();
        this.f1958v.onRelease();
    }

    private View t(boolean z7, int i7, int i8) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z8 = false;
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = focusables.get(i9);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i7 < bottom && top < i8) {
                boolean z9 = i7 < top && bottom < i8;
                if (view == null) {
                    view = view2;
                    z8 = z9;
                } else {
                    boolean z10 = (z7 && top < view.getTop()) || (!z7 && bottom > view.getBottom());
                    if (z8) {
                        if (z9) {
                            if (!z10) {
                            }
                            view = view2;
                        }
                    } else if (z9) {
                        view = view2;
                        z8 = true;
                    } else {
                        if (!z10) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    private float w(int i7) {
        double log = Math.log((Math.abs(i7) * 0.35f) / (this.f1953q * 0.015f));
        float f8 = R;
        return (float) (this.f1953q * 0.015f * Math.exp((f8 / (f8 - 1.0d)) * log));
    }

    private boolean y(int i7, int i8) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i8 >= childAt.getTop() - scrollY && i8 < childAt.getBottom() - scrollY && i7 >= childAt.getLeft() && i7 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    private void z() {
        VelocityTracker velocityTracker = this.B;
        if (velocityTracker == null) {
            this.B = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    boolean I(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z7) {
        boolean z8;
        boolean z9;
        int i15;
        int overScrollMode = getOverScrollMode();
        boolean z10 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z11 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z12 = overScrollMode == 0 || (overScrollMode == 1 && z10);
        boolean z13 = overScrollMode == 0 || (overScrollMode == 1 && z11);
        int i16 = i9 + i7;
        int i17 = !z12 ? 0 : i13;
        int i18 = i10 + i8;
        int i19 = !z13 ? 0 : i14;
        int i20 = -i17;
        int i21 = i17 + i11;
        int i22 = -i19;
        int i23 = i19 + i12;
        if (i16 > i21) {
            i16 = i21;
            z8 = true;
        } else if (i16 < i20) {
            z8 = true;
            i16 = i20;
        } else {
            z8 = false;
        }
        if (i18 > i23) {
            i18 = i23;
            z9 = true;
        } else if (i18 < i22) {
            z9 = true;
            i18 = i22;
        } else {
            z9 = false;
        }
        if (!z9 || x(1)) {
            i15 = i16;
        } else {
            int i24 = i16;
            this.f1956t.springBack(i24, i18, 0, 0, 0, getScrollRange());
            i15 = i24;
        }
        onOverScrolled(i15, i18, z8, z9);
        return z8 || z9;
    }

    public boolean J(int i7) {
        boolean z7 = i7 == 130;
        int height = getHeight();
        if (z7) {
            this.f1955s.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f1955s;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f1955s.top = getScrollY() - height;
            Rect rect2 = this.f1955s;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f1955s;
        int i8 = rect3.top;
        int i9 = height + i8;
        rect3.bottom = i9;
        return N(i7, i8, i9);
    }

    public final void S(int i7, int i8) {
        T(i7, i8, 250, false);
    }

    void U(int i7, int i8, int i9, boolean z7) {
        T(i7 - getScrollX(), i8 - getScrollY(), i9, z7);
    }

    void V(int i7, int i8, boolean z7) {
        U(i7, i8, 250, z7);
    }

    public boolean W(int i7, int i8) {
        return this.O.m(i7, i8);
    }

    public void Y(int i7) {
        this.O.n(i7);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean b(int i7) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i7);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !F(findNextFocus, maxScrollAmount, getHeight())) {
            if (i7 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i7 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i7 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            O(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f1955s);
            offsetDescendantRectToMyCoords(findNextFocus, this.f1955s);
            O(f(this.f1955s), 0, 1, true);
            findNextFocus.requestFocus(i7);
        }
        if (findFocus != null && findFocus.isFocused() && D(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i7;
        if (this.f1956t.isFinished()) {
            return;
        }
        this.f1956t.computeScrollOffset();
        int currY = this.f1956t.getCurrY();
        int g8 = g(currY - this.L);
        this.L = currY;
        int[] iArr = this.J;
        iArr[1] = 0;
        h(0, g8, iArr, null, 1);
        int i8 = g8 - this.J[1];
        int scrollRange = getScrollRange();
        if (i8 != 0) {
            int scrollY = getScrollY();
            I(0, i8, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i7 = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i9 = i8 - scrollY2;
            int[] iArr2 = this.J;
            iArr2[1] = 0;
            i(0, scrollY2, 0, i9, this.I, 1, iArr2);
            i8 = i9 - this.J[1];
        } else {
            i7 = scrollRange;
        }
        if (i8 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i7 > 0)) {
                if (i8 < 0) {
                    if (this.f1957u.isFinished()) {
                        this.f1957u.onAbsorb((int) this.f1956t.getCurrVelocity());
                    }
                } else if (this.f1958v.isFinished()) {
                    this.f1958v.onAbsorb((int) this.f1956t.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f1956t.isFinished()) {
            Y(1);
        } else {
            e0.H(this);
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f8, float f9, boolean z7) {
        return this.O.a(f8, f9, z7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f8, float f9) {
        return this.O.b(f8, f9);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return h(i7, i8, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.O.e(i7, i8, i9, i10, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i7;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i8 = 0;
        if (!this.f1957u.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i7 = getPaddingLeft();
            } else {
                i7 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i7, min);
            this.f1957u.setSize(width, height);
            if (this.f1957u.draw(canvas)) {
                e0.H(this);
            }
            canvas.restoreToCount(save);
        }
        if (this.f1958v.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i8 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i8 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f1958v.setSize(width2, height2);
        if (this.f1958v.draw(canvas)) {
            e0.H(this);
        }
        canvas.restoreToCount(save2);
    }

    protected int f(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i8 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i7 - verticalFadingEdgeLength : i7;
        int i9 = rect.bottom;
        if (i9 > i8 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i8, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i9 >= i8) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i8 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    int g(int i7) {
        int height = getHeight();
        if (i7 > 0 && e.b(this.f1957u) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * e.d(this.f1957u, ((-i7) * 4.0f) / height, 0.5f));
            if (round != i7) {
                this.f1957u.finish();
            }
            return i7 - round;
        }
        if (i7 >= 0 || e.b(this.f1958v) == 0.0f) {
            return i7;
        }
        float f8 = height;
        int round2 = Math.round((f8 / 4.0f) * e.d(this.f1958v, (i7 * 4.0f) / f8, 0.5f));
        if (round2 != i7) {
            this.f1958v.finish();
        }
        return i7 - round2;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.N.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public boolean h(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return this.O.c(i7, i8, iArr, iArr2, i9);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return x(0);
    }

    public void i(int i7, int i8, int i9, int i10, int[] iArr, int i11, int[] iArr2) {
        this.O.d(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.O.j();
    }

    @Override // androidx.core.view.x
    public void j(View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        G(i10, i11, iArr);
    }

    @Override // androidx.core.view.w
    public void k(View view, int i7, int i8, int i9, int i10, int i11) {
        G(i10, i11, null);
    }

    @Override // androidx.core.view.w
    public boolean l(View view, View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    @Override // androidx.core.view.w
    public void m(View view, View view2, int i7, int i8) {
        this.N.c(view, view2, i7, i8);
        W(2, i8);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i7, int i8) {
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.w
    public void n(View view, int i7) {
        this.N.d(view, i7);
        Y(i7);
    }

    @Override // androidx.core.view.w
    public void o(View view, int i7, int i8, int[] iArr, int i9) {
        h(i7, i8, iArr, null, i9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1961y = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i7;
        float f8;
        if (motionEvent.getAction() != 8 || this.A) {
            return false;
        }
        if (androidx.core.view.u.a(motionEvent, 2)) {
            f8 = motionEvent.getAxisValue(9);
            i7 = (int) motionEvent.getX();
        } else if (androidx.core.view.u.a(motionEvent, 4194304)) {
            float axisValue = motionEvent.getAxisValue(26);
            i7 = getWidth() / 2;
            f8 = axisValue;
        } else {
            i7 = 0;
            f8 = 0.0f;
        }
        if (f8 == 0.0f) {
            return false;
        }
        O(-((int) (f8 * getVerticalScrollFactorCompat())), i7, 1, androidx.core.view.u.a(motionEvent, 8194));
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z7 = true;
        if (action == 2 && this.A) {
            return true;
        }
        int i7 = action & 255;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 == 2) {
                    int i8 = this.H;
                    if (i8 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i8);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i8 + " in onInterceptTouchEvent");
                        } else {
                            int y7 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y7 - this.f1959w) > this.E && (2 & getNestedScrollAxes()) == 0) {
                                this.A = true;
                                this.f1959w = y7;
                                B();
                                this.B.addMovement(motionEvent);
                                this.K = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 6) {
                        H(motionEvent);
                    }
                }
            }
            this.A = false;
            this.H = -1;
            K();
            if (this.f1956t.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                e0.H(this);
            }
            Y(0);
        } else {
            int y8 = (int) motionEvent.getY();
            if (y((int) motionEvent.getX(), y8)) {
                this.f1959w = y8;
                this.H = motionEvent.getPointerId(0);
                z();
                this.B.addMovement(motionEvent);
                this.f1956t.computeScrollOffset();
                if (!X(motionEvent) && this.f1956t.isFinished()) {
                    z7 = false;
                }
                this.A = z7;
                W(2, 0);
            } else {
                if (!X(motionEvent) && this.f1956t.isFinished()) {
                    z7 = false;
                }
                this.A = z7;
                K();
            }
        }
        return this.A;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        super.onLayout(z7, i7, i8, i9, i10);
        int i11 = 0;
        this.f1960x = false;
        View view = this.f1962z;
        if (view != null && E(view, this)) {
            P(this.f1962z);
        }
        this.f1962z = null;
        if (!this.f1961y) {
            if (this.M != null) {
                scrollTo(getScrollX(), this.M.f1963q);
                this.M = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i11 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int e8 = e(scrollY, paddingTop, i11);
            if (e8 != scrollY) {
                scrollTo(getScrollX(), e8);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1961y = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        if (this.C && View.MeasureSpec.getMode(i8) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z7) {
        if (z7) {
            return false;
        }
        dispatchNestedFling(0.0f, f9, true);
        u((int) f9);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return dispatchNestedPreFling(f8, f9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        o(view, i7, i8, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        G(i10, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i7) {
        m(view, view2, i7, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i7, int i8, boolean z7, boolean z8) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i7, Rect rect) {
        if (i7 == 2) {
            i7 = 130;
        } else if (i7 == 1) {
            i7 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i7) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i7);
        if (findNextFocus == null || D(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i7, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.M = dVar;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        dVar.f1963q = getScrollY();
        return dVar;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i7, int i8, int i9, int i10) {
        super.onScrollChanged(i7, i8, i9, i10);
        c cVar = this.Q;
        if (cVar != null) {
            cVar.a(this, i7, i8, i9, i10);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !F(findFocus, 0, i10)) {
            return;
        }
        findFocus.getDrawingRect(this.f1955s);
        offsetDescendantRectToMyCoords(findFocus, this.f1955s);
        p(f(this.f1955s));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i7) {
        return l(view, view2, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        B();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.K = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.K);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.B;
                velocityTracker.computeCurrentVelocity(1000, this.G);
                int yVelocity = (int) velocityTracker.getYVelocity(this.H);
                if (Math.abs(yVelocity) >= this.F) {
                    if (!q(yVelocity)) {
                        int i7 = -yVelocity;
                        float f8 = i7;
                        if (!dispatchNestedPreFling(0.0f, f8)) {
                            dispatchNestedFling(0.0f, f8, true);
                            u(i7);
                        }
                    }
                } else if (this.f1956t.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    e0.H(this);
                }
                r();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.H);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.H + " in onTouchEvent");
                } else {
                    int y7 = (int) motionEvent.getY(findPointerIndex);
                    int i8 = this.f1959w - y7;
                    int L = i8 - L(i8, motionEvent.getX(findPointerIndex));
                    if (!this.A && Math.abs(L) > this.E) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.A = true;
                        L = L > 0 ? L - this.E : L + this.E;
                    }
                    if (this.A) {
                        int O = O(L, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f1959w = y7 - O;
                        this.K += O;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.A && getChildCount() > 0 && this.f1956t.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    e0.H(this);
                }
                r();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1959w = (int) motionEvent.getY(actionIndex);
                this.H = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                H(motionEvent);
                this.f1959w = (int) motionEvent.getY(motionEvent.findPointerIndex(this.H));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.A && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f1956t.isFinished()) {
                a();
            }
            C((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.B;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f1960x) {
            this.f1962z = view2;
        } else {
            P(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z7) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return Q(rect, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z7) {
        if (z7) {
            K();
        }
        super.requestDisallowInterceptTouchEvent(z7);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f1960x = true;
        super.requestLayout();
    }

    public boolean s(KeyEvent keyEvent) {
        this.f1955s.setEmpty();
        if (d()) {
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return !keyEvent.isAltPressed() ? b(33) : v(33);
                }
                if (keyCode == 20) {
                    return !keyEvent.isAltPressed() ? b(130) : v(130);
                }
                if (keyCode == 62) {
                    J(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
            }
            return false;
        }
        if (isFocused() && keyEvent.getKeyCode() != 4) {
            View findFocus = findFocus();
            if (findFocus == this) {
                findFocus = null;
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
            if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i7, int i8) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int e8 = e(i7, width, width2);
            int e9 = e(i8, height, height2);
            if (e8 == getScrollX() && e9 == getScrollY()) {
                return;
            }
            super.scrollTo(e8, e9);
        }
    }

    public void setFillViewport(boolean z7) {
        if (z7 != this.C) {
            this.C = z7;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z7) {
        this.O.k(z7);
    }

    public void setOnScrollChangeListener(c cVar) {
        this.Q = cVar;
    }

    public void setSmoothScrollingEnabled(boolean z7) {
        this.D = z7;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i7) {
        return W(i7, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Y(0);
    }

    public void u(int i7) {
        if (getChildCount() > 0) {
            this.f1956t.fling(getScrollX(), getScrollY(), 0, i7, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            M(true);
        }
    }

    public boolean v(int i7) {
        int childCount;
        boolean z7 = i7 == 130;
        int height = getHeight();
        Rect rect = this.f1955s;
        rect.top = 0;
        rect.bottom = height;
        if (z7 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f1955s.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f1955s;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f1955s;
        return N(i7, rect3.top, rect3.bottom);
    }

    public boolean x(int i7) {
        return this.O.i(i7);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f1955s = new Rect();
        this.f1960x = true;
        this.f1961y = false;
        this.f1962z = null;
        this.A = false;
        this.D = true;
        this.H = -1;
        this.I = new int[2];
        this.J = new int[2];
        this.f1957u = e.a(context, attributeSet);
        this.f1958v = e.a(context, attributeSet);
        this.f1953q = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        A();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T, i7, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.N = new y(this);
        this.O = new v(this);
        setNestedScrollingEnabled(true);
        e0.N(this, S);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7) {
        if (getChildCount() <= 0) {
            super.addView(view, i7);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
