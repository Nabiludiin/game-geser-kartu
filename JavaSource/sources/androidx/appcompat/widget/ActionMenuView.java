package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.y0;

/* compiled from: MyApplication */
public class ActionMenuView extends y0 implements e.b, androidx.appcompat.view.menu.k {
    private androidx.appcompat.view.menu.e F;
    private Context G;
    private int H;
    private boolean I;
    private androidx.appcompat.widget.c J;
    private j.a K;
    e.a L;
    private boolean M;
    private int N;
    private int O;
    private int P;
    e Q;

    /* compiled from: MyApplication */
    public interface a {
        boolean a();

        boolean b();
    }

    /* compiled from: MyApplication */
    public static class c extends y0.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f560a;

        /* renamed from: b, reason: collision with root package name */
        public int f561b;

        /* renamed from: c, reason: collision with root package name */
        public int f562c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f563d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f564e;

        /* renamed from: f, reason: collision with root package name */
        boolean f565f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f560a = cVar.f560a;
        }

        public c(int i7, int i8) {
            super(i7, i8);
            this.f560a = false;
        }
    }

    /* compiled from: MyApplication */
    private class d implements e.a {
        d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.Q;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            e.a aVar = ActionMenuView.this.L;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* compiled from: MyApplication */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    static int H(View view, int i7, int i8, int i9, int i10) {
        int i11;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9) - i10, View.MeasureSpec.getMode(i9));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z7 = false;
        boolean z8 = actionMenuItemView != null && actionMenuItemView.f();
        if (i8 > 0) {
            i11 = 2;
            if (!z8 || i8 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i8 * i7, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i12 = measuredWidth / i7;
                if (measuredWidth % i7 != 0) {
                    i12++;
                }
                if (!z8 || i12 >= 2) {
                    i11 = i12;
                }
                if (!cVar.f560a && z8) {
                    z7 = true;
                }
                cVar.f563d = z7;
                cVar.f561b = i11;
                view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i11, 1073741824), makeMeasureSpec);
                return i11;
            }
        }
        i11 = 0;
        if (!cVar.f560a) {
            z7 = true;
        }
        cVar.f563d = z7;
        cVar.f561b = i11;
        view.measure(View.MeasureSpec.makeMeasureSpec(i7 * i11, 1073741824), makeMeasureSpec);
        return i11;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    private void I(int i7, int i8) {
        long j7;
        int i9;
        int i10;
        boolean z7;
        boolean z8;
        ?? r32;
        int i11;
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, paddingTop, -2);
        int i12 = size - paddingLeft;
        int i13 = this.O;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = i13 + (i15 / i14);
        int childCount = getChildCount();
        int i17 = 0;
        int i18 = 0;
        boolean z9 = false;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        long j8 = 0;
        while (i18 < childCount) {
            View childAt = getChildAt(i18);
            int i22 = size2;
            if (childAt.getVisibility() == 8) {
                i11 = i16;
            } else {
                boolean z10 = childAt instanceof ActionMenuItemView;
                i19++;
                if (z10) {
                    int i23 = this.P;
                    z8 = z10;
                    r32 = 0;
                    childAt.setPadding(i23, 0, i23, 0);
                } else {
                    z8 = z10;
                    r32 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f565f = r32;
                cVar.f562c = r32;
                cVar.f561b = r32;
                cVar.f563d = r32;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r32;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r32;
                cVar.f564e = z8 && ((ActionMenuItemView) childAt).f();
                int H = H(childAt, i16, cVar.f560a ? 1 : i14, childMeasureSpec, paddingTop);
                i20 = Math.max(i20, H);
                i11 = i16;
                if (cVar.f563d) {
                    i21++;
                }
                if (cVar.f560a) {
                    z9 = true;
                }
                i14 -= H;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (H == 1) {
                    j8 |= 1 << i18;
                }
            }
            i18++;
            size2 = i22;
            i16 = i11;
        }
        int i24 = size2;
        int i25 = i16;
        char c8 = 2;
        boolean z11 = z9 && i19 == 2;
        boolean z12 = false;
        while (i21 > 0 && i14 > 0) {
            int i26 = Integer.MAX_VALUE;
            long j9 = 0;
            char c9 = c8;
            int i27 = 0;
            int i28 = 0;
            j7 = 1;
            while (i28 < childCount) {
                c cVar2 = (c) getChildAt(i28).getLayoutParams();
                boolean z13 = z11;
                if (cVar2.f563d) {
                    int i29 = cVar2.f561b;
                    if (i29 < i26) {
                        j9 = 1 << i28;
                        i26 = i29;
                        i27 = 1;
                    } else if (i29 == i26) {
                        j9 |= 1 << i28;
                        i27++;
                    }
                }
                i28++;
                z11 = z13;
            }
            boolean z14 = z11;
            j8 |= j9;
            if (i27 > i14) {
                break;
            }
            int i30 = i26 + 1;
            int i31 = 0;
            while (i31 < childCount) {
                View childAt2 = getChildAt(i31);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j10 = 1 << i31;
                if ((j9 & j10) == 0) {
                    if (cVar3.f561b == i30) {
                        j8 |= j10;
                    }
                    i10 = i31;
                } else {
                    if (!z14 || !cVar3.f564e) {
                        i10 = i31;
                        z7 = true;
                    } else if (i14 == 1) {
                        int i32 = this.P;
                        z7 = true;
                        i10 = i31;
                        childAt2.setPadding(i32 + i25, 0, i32, 0);
                    } else {
                        i10 = i31;
                        z7 = true;
                    }
                    cVar3.f561b++;
                    cVar3.f565f = z7;
                    i14--;
                }
                i31 = i10 + 1;
            }
            c8 = c9;
            z11 = z14;
            z12 = true;
        }
        j7 = 1;
        boolean z15 = !z9 && i19 == 1;
        if (i14 <= 0 || j8 == 0 || (i14 >= i19 - 1 && !z15 && i20 <= 1)) {
            i9 = 0;
        } else {
            float bitCount = Long.bitCount(j8);
            if (z15) {
                i9 = 0;
            } else {
                if ((j8 & j7) != 0) {
                    i9 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f564e) {
                        bitCount -= 0.5f;
                    }
                } else {
                    i9 = 0;
                }
                int i33 = childCount - 1;
                if ((j8 & (1 << i33)) != 0 && !((c) getChildAt(i33).getLayoutParams()).f564e) {
                    bitCount -= 0.5f;
                }
            }
            int i34 = bitCount > 0.0f ? (int) ((i14 * i25) / bitCount) : i9;
            boolean z16 = z12;
            for (int i35 = i9; i35 < childCount; i35++) {
                if ((j8 & (1 << i35)) != 0) {
                    View childAt3 = getChildAt(i35);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f562c = i34;
                        cVar4.f565f = true;
                        if (i35 == 0 && !cVar4.f564e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i34) / 2;
                        }
                        z16 = true;
                    } else {
                        if (cVar4.f560a) {
                            cVar4.f562c = i34;
                            cVar4.f565f = true;
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i34) / 2;
                            z16 = true;
                        } else {
                            if (i35 != 0) {
                                ((LinearLayout.LayoutParams) cVar4).leftMargin = i34 / 2;
                            }
                            if (i35 != childCount - 1) {
                                ((LinearLayout.LayoutParams) cVar4).rightMargin = i34 / 2;
                            }
                        }
                    }
                }
            }
            z12 = z16;
        }
        if (z12) {
            for (int i36 = i9; i36 < childCount; i36++) {
                View childAt4 = getChildAt(i36);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f565f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f561b * i25) + cVar5.f562c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, mode != 1073741824 ? i17 : i24);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.y0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c B() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f560a = true;
        return generateDefaultLayoutParams;
    }

    protected boolean C(int i7) {
        boolean z7 = false;
        if (i7 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i7 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i7);
        if (i7 < getChildCount() && (childAt instanceof a)) {
            z7 = ((a) childAt).a();
        }
        return (i7 <= 0 || !(childAt2 instanceof a)) ? z7 : ((a) childAt2).b() | z7;
    }

    public boolean D() {
        androidx.appcompat.widget.c cVar = this.J;
        return cVar != null && cVar.B();
    }

    public boolean E() {
        androidx.appcompat.widget.c cVar = this.J;
        return cVar != null && cVar.D();
    }

    public boolean F() {
        androidx.appcompat.widget.c cVar = this.J;
        return cVar != null && cVar.E();
    }

    public boolean G() {
        return this.I;
    }

    public androidx.appcompat.view.menu.e J() {
        return this.F;
    }

    public void K(j.a aVar, e.a aVar2) {
        this.K = aVar;
        this.L = aVar2;
    }

    public boolean L() {
        androidx.appcompat.widget.c cVar = this.J;
        return cVar != null && cVar.K();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(androidx.appcompat.view.menu.g gVar) {
        return this.F.L(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.F = eVar;
    }

    @Override // androidx.appcompat.widget.y0, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.F == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.F = eVar;
            eVar.R(new d());
            androidx.appcompat.widget.c cVar = new androidx.appcompat.widget.c(context);
            this.J = cVar;
            cVar.J(true);
            androidx.appcompat.widget.c cVar2 = this.J;
            j.a aVar = this.K;
            if (aVar == null) {
                aVar = new b();
            }
            cVar2.g(aVar);
            this.F.c(this.J, this.G);
            this.J.H(this);
        }
        return this.F;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.J.A();
    }

    public int getPopupTheme() {
        return this.H;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.c cVar = this.J;
        if (cVar != null) {
            cVar.c(false);
            if (this.J.E()) {
                this.J.B();
                this.J.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
    }

    @Override // androidx.appcompat.widget.y0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        int width;
        int i11;
        if (!this.M) {
            super.onLayout(z7, i7, i8, i9, i10);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i10 - i8) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i9 - i7;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean b8 = z1.b(this);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f560a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (C(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b8) {
                        i11 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i11 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i11 = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(i11, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    C(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int max = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (b8) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f560a) {
                    int i22 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f560a) {
                int i25 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft = i25 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.y0, android.view.View
    protected void onMeasure(int i7, int i8) {
        androidx.appcompat.view.menu.e eVar;
        boolean z7 = this.M;
        boolean z8 = View.MeasureSpec.getMode(i7) == 1073741824;
        this.M = z8;
        if (z7 != z8) {
            this.N = 0;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (this.M && (eVar = this.F) != null && size != this.N) {
            this.N = size;
            eVar.K(true);
        }
        int childCount = getChildCount();
        if (this.M && childCount > 0) {
            I(i7, i8);
            return;
        }
        for (int i9 = 0; i9 < childCount; i9++) {
            c cVar = (c) getChildAt(i9).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i7, i8);
    }

    public void setExpandedActionViewsExclusive(boolean z7) {
        this.J.G(z7);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.Q = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.J.I(drawable);
    }

    public void setOverflowReserved(boolean z7) {
        this.I = z7;
    }

    public void setPopupTheme(int i7) {
        if (this.H != i7) {
            this.H = i7;
            if (i7 == 0) {
                this.G = getContext();
            } else {
                this.G = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.c cVar) {
        this.J = cVar;
        cVar.H(this);
    }

    public void x() {
        androidx.appcompat.widget.c cVar = this.J;
        if (cVar != null) {
            cVar.y();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.y0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.y0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.O = (int) (56.0f * f8);
        this.P = (int) (f8 * 4.0f);
        this.G = context;
        this.H = 0;
    }

    /* compiled from: MyApplication */
    private static class b implements j.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z7) {
        }
    }
}
