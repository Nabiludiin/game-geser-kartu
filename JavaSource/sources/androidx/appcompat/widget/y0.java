package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* compiled from: MyApplication */
public abstract class y0 extends ViewGroup {
    private Drawable A;
    private int B;
    private int C;
    private int D;
    private int E;

    /* renamed from: q, reason: collision with root package name */
    private boolean f945q;

    /* renamed from: r, reason: collision with root package name */
    private int f946r;

    /* renamed from: s, reason: collision with root package name */
    private int f947s;

    /* renamed from: t, reason: collision with root package name */
    private int f948t;

    /* renamed from: u, reason: collision with root package name */
    private int f949u;

    /* renamed from: v, reason: collision with root package name */
    private int f950v;

    /* renamed from: w, reason: collision with root package name */
    private float f951w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f952x;

    /* renamed from: y, reason: collision with root package name */
    private int[] f953y;

    /* renamed from: z, reason: collision with root package name */
    private int[] f954z;

    /* compiled from: MyApplication */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i7, int i8) {
            super(i7, i8);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public y0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void g(int i7, int i8) {
        int i9;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i10 = 0;
        while (i10 < i7) {
            View o7 = o(i10);
            if (o7.getVisibility() != 8) {
                a aVar = (a) o7.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i11 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = o7.getMeasuredWidth();
                    i9 = i8;
                    measureChildWithMargins(o7, i9, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i11;
                    i10++;
                    i8 = i9;
                }
            }
            i9 = i8;
            i10++;
            i8 = i9;
        }
    }

    private void h(int i7, int i8) {
        int i9;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i10 = 0;
        while (i10 < i7) {
            View o7 = o(i10);
            if (o7.getVisibility() != 8) {
                a aVar = (a) o7.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i11 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = o7.getMeasuredHeight();
                    i9 = i8;
                    measureChildWithMargins(o7, makeMeasureSpec, 0, i9, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i11;
                    i10++;
                    i8 = i9;
                }
            }
            i9 = i8;
            i10++;
            i8 = i9;
        }
    }

    private void w(View view, int i7, int i8, int i9, int i10) {
        view.layout(i7, i8, i9 + i7, i10 + i8);
    }

    void c(Canvas canvas) {
        int right;
        int left;
        int i7;
        int virtualChildCount = getVirtualChildCount();
        boolean b8 = z1.b(this);
        for (int i8 = 0; i8 < virtualChildCount; i8++) {
            View o7 = o(i8);
            if (o7 != null && o7.getVisibility() != 8 && p(i8)) {
                a aVar = (a) o7.getLayoutParams();
                f(canvas, b8 ? o7.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (o7.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.B);
            }
        }
        if (p(virtualChildCount)) {
            View o8 = o(virtualChildCount - 1);
            if (o8 != null) {
                a aVar2 = (a) o8.getLayoutParams();
                if (b8) {
                    left = o8.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i7 = this.B;
                    right = left - i7;
                } else {
                    right = o8.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (b8) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i7 = this.B;
                right = left - i7;
            }
            f(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void d(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i7 = 0; i7 < virtualChildCount; i7++) {
            View o7 = o(i7);
            if (o7 != null && o7.getVisibility() != 8 && p(i7)) {
                e(canvas, (o7.getTop() - ((LinearLayout.LayoutParams) ((a) o7.getLayoutParams())).topMargin) - this.C);
            }
        }
        if (p(virtualChildCount)) {
            View o8 = o(virtualChildCount - 1);
            e(canvas, o8 == null ? (getHeight() - getPaddingBottom()) - this.C : o8.getBottom() + ((LinearLayout.LayoutParams) ((a) o8.getLayoutParams())).bottomMargin);
        }
    }

    void e(Canvas canvas, int i7) {
        this.A.setBounds(getPaddingLeft() + this.E, i7, (getWidth() - getPaddingRight()) - this.E, this.C + i7);
        this.A.draw(canvas);
    }

    void f(Canvas canvas, int i7) {
        this.A.setBounds(i7, getPaddingTop() + this.E, this.B + i7, (getHeight() - getPaddingBottom()) - this.E);
        this.A.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i7;
        if (this.f946r < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i8 = this.f946r;
        if (childCount <= i8) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i8);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f946r == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i9 = this.f947s;
        if (this.f948t == 1 && (i7 = this.f949u & 112) != 48) {
            if (i7 == 16) {
                i9 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f950v) / 2;
            } else if (i7 == 80) {
                i9 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f950v;
            }
        }
        return i9 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f946r;
    }

    public Drawable getDividerDrawable() {
        return this.A;
    }

    public int getDividerPadding() {
        return this.E;
    }

    public int getDividerWidth() {
        return this.B;
    }

    public int getGravity() {
        return this.f949u;
    }

    public int getOrientation() {
        return this.f948t;
    }

    public int getShowDividers() {
        return this.D;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f951w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i7 = this.f948t;
        if (i7 == 0) {
            return new a(-2, -2);
        }
        if (i7 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    int l(View view, int i7) {
        return 0;
    }

    int m(View view) {
        return 0;
    }

    int n(View view) {
        return 0;
    }

    View o(int i7) {
        return getChildAt(i7);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.A == null) {
            return;
        }
        if (this.f948t == 1) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        if (this.f948t == 1) {
            r(i7, i8, i9, i10);
        } else {
            q(i7, i8, i9, i10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        if (this.f948t == 1) {
            v(i7, i8);
        } else {
            t(i7, i8);
        }
    }

    protected boolean p(int i7) {
        if (i7 == 0) {
            return (this.D & 1) != 0;
        }
        if (i7 == getChildCount()) {
            return (this.D & 4) != 0;
        }
        if ((this.D & 2) != 0) {
            for (int i8 = i7 - 1; i8 >= 0; i8--) {
                if (getChildAt(i8).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void q(int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y0.q(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void r(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r11.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.f949u
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L35
            r4 = 80
            if (r3 == r4) goto L2a
            int r13 = r11.getPaddingTop()
            goto L41
        L2a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.f950v
            int r13 = r3 - r13
            goto L41
        L35:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.f950v
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r3 + r15
        L41:
            r15 = 0
        L42:
            if (r15 >= r1) goto Lb9
            android.view.View r4 = r11.o(r15)
            r9 = 1
            if (r4 != 0) goto L52
            int r3 = r11.u(r15)
            int r13 = r13 + r3
        L50:
            r3 = r11
            goto Lb7
        L52:
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto L50
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r10 = r3
            androidx.appcompat.widget.y0$a r10 = (androidx.appcompat.widget.y0.a) r10
            int r3 = r10.gravity
            if (r3 >= 0) goto L6e
            r3 = r2
        L6e:
            int r5 = androidx.core.view.e0.r(r11)
            int r3 = androidx.core.view.o.a(r3, r5)
            r3 = r3 & 7
            if (r3 == r9) goto L88
            r5 = 5
            if (r3 == r5) goto L82
            int r3 = r10.leftMargin
            int r3 = r3 + r0
        L80:
            r5 = r3
            goto L93
        L82:
            int r3 = r12 - r7
            int r5 = r10.rightMargin
        L86:
            int r3 = r3 - r5
            goto L80
        L88:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r5 = r10.leftMargin
            int r3 = r3 + r5
            int r5 = r10.rightMargin
            goto L86
        L93:
            boolean r3 = r11.p(r15)
            if (r3 == 0) goto L9c
            int r3 = r11.C
            int r13 = r13 + r3
        L9c:
            int r3 = r10.topMargin
            int r13 = r13 + r3
            int r3 = r11.m(r4)
            int r6 = r13 + r3
            r3 = r11
            r3.w(r4, r5, r6, r7, r8)
            int r5 = r10.bottomMargin
            int r8 = r8 + r5
            int r5 = r11.n(r4)
            int r8 = r8 + r5
            int r13 = r13 + r8
            int r4 = r11.l(r4, r15)
            int r15 = r15 + r4
        Lb7:
            int r15 = r15 + r9
            goto L42
        Lb9:
            r3 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y0.r(int, int, int, int):void");
    }

    void s(View view, int i7, int i8, int i9, int i10, int i11) {
        measureChildWithMargins(view, i8, i9, i10, i11);
    }

    public void setBaselineAligned(boolean z7) {
        this.f945q = z7;
    }

    public void setBaselineAlignedChildIndex(int i7) {
        if (i7 >= 0 && i7 < getChildCount()) {
            this.f946r = i7;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.A) {
            return;
        }
        this.A = drawable;
        if (drawable != null) {
            this.B = drawable.getIntrinsicWidth();
            this.C = drawable.getIntrinsicHeight();
        } else {
            this.B = 0;
            this.C = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i7) {
        this.E = i7;
    }

    public void setGravity(int i7) {
        if (this.f949u != i7) {
            if ((8388615 & i7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            this.f949u = i7;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i7) {
        int i8 = i7 & 8388615;
        int i9 = this.f949u;
        if ((8388615 & i9) != i8) {
            this.f949u = i8 | ((-8388616) & i9);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z7) {
        this.f952x = z7;
    }

    public void setOrientation(int i7) {
        if (this.f948t != i7) {
            this.f948t = i7;
            requestLayout();
        }
    }

    public void setShowDividers(int i7) {
        if (i7 != this.D) {
            requestLayout();
        }
        this.D = i7;
    }

    public void setVerticalGravity(int i7) {
        int i8 = i7 & 112;
        int i9 = this.f949u;
        if ((i9 & 112) != i8) {
            this.f949u = i8 | (i9 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f8) {
        this.f951w = Math.max(0.0f, f8);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x0461  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void t(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y0.t(int, int):void");
    }

    int u(int i7) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void v(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y0.v(int, int):void");
    }

    public y0(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f945q = true;
        this.f946r = -1;
        this.f947s = 0;
        this.f949u = 8388659;
        int[] iArr = f.j.f23446a1;
        r1 u7 = r1.u(context, attributeSet, iArr, i7, 0);
        androidx.core.view.e0.L(this, context, iArr, attributeSet, u7.q(), i7, 0);
        int j7 = u7.j(f.j.f23456c1, -1);
        if (j7 >= 0) {
            setOrientation(j7);
        }
        int j8 = u7.j(f.j.f23451b1, -1);
        if (j8 >= 0) {
            setGravity(j8);
        }
        boolean a8 = u7.a(f.j.f23461d1, true);
        if (!a8) {
            setBaselineAligned(a8);
        }
        this.f951w = u7.h(f.j.f23471f1, -1.0f);
        this.f946r = u7.j(f.j.f23466e1, -1);
        this.f952x = u7.a(f.j.f23486i1, false);
        setDividerDrawable(u7.f(f.j.f23476g1));
        this.D = u7.j(f.j.f23491j1, 0);
        this.E = u7.e(f.j.f23481h1, 0);
        u7.v();
    }
}
