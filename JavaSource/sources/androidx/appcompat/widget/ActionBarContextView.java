package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: MyApplication */
public class ActionBarContextView extends androidx.appcompat.widget.a {
    private View A;
    private View B;
    private View C;
    private LinearLayout D;
    private TextView E;
    private TextView F;
    private int G;
    private int H;
    private boolean I;
    private int J;

    /* renamed from: y, reason: collision with root package name */
    private CharSequence f543y;

    /* renamed from: z, reason: collision with root package name */
    private CharSequence f544z;

    /* compiled from: MyApplication */
    class a implements View.OnClickListener {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ k.b f545q;

        a(k.b bVar) {
            this.f545q = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f545q.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    private void i() {
        if (this.D == null) {
            LayoutInflater.from(getContext()).inflate(f.g.f23408a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.D = linearLayout;
            this.E = (TextView) linearLayout.findViewById(f.f.f23386e);
            this.F = (TextView) this.D.findViewById(f.f.f23385d);
            if (this.G != 0) {
                this.E.setTextAppearance(getContext(), this.G);
            }
            if (this.H != 0) {
                this.F.setTextAppearance(getContext(), this.H);
            }
        }
        this.E.setText(this.f543y);
        this.F.setText(this.f544z);
        boolean isEmpty = TextUtils.isEmpty(this.f543y);
        boolean isEmpty2 = TextUtils.isEmpty(this.f544z);
        this.F.setVisibility(!isEmpty2 ? 0 : 8);
        this.D.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.D.getParent() == null) {
            addView(this.D);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ androidx.core.view.k0 f(int i7, long j7) {
        return super.f(i7, j7);
    }

    public void g() {
        if (this.A == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f544z;
    }

    public CharSequence getTitle() {
        return this.f543y;
    }

    public void h(k.b bVar) {
        View view = this.A;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.J, (ViewGroup) this, false);
            this.A = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.A);
        }
        View findViewById = this.A.findViewById(f.f.f23390i);
        this.B = findViewById;
        findViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) bVar.e();
        c cVar = this.f670t;
        if (cVar != null) {
            cVar.y();
        }
        c cVar2 = new c(getContext());
        this.f670t = cVar2;
        cVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f670t, this.f668r);
        ActionMenuView actionMenuView = (ActionMenuView) this.f670t.o(this);
        this.f669s = actionMenuView;
        androidx.core.view.e0.Q(actionMenuView, null);
        addView(this.f669s, layoutParams);
    }

    public boolean j() {
        return this.I;
    }

    public void k() {
        removeAllViews();
        this.C = null;
        this.f669s = null;
        this.f670t = null;
        View view = this.B;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        c cVar = this.f670t;
        if (cVar != null) {
            return cVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c cVar = this.f670t;
        if (cVar != null) {
            cVar.B();
            this.f670t.C();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        boolean b8 = z1.b(this);
        int paddingRight = b8 ? (i9 - i7) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i10 - i8) - getPaddingTop()) - getPaddingBottom();
        View view = this.A;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A.getLayoutParams();
            int i11 = b8 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i12 = b8 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int d8 = androidx.appcompat.widget.a.d(paddingRight, i11, b8);
            paddingRight = androidx.appcompat.widget.a.d(d8 + e(this.A, d8, paddingTop, paddingTop2, b8), i12, b8);
        }
        int i13 = paddingRight;
        LinearLayout linearLayout = this.D;
        if (linearLayout != null && this.C == null && linearLayout.getVisibility() != 8) {
            i13 += e(this.D, i13, paddingTop, paddingTop2, b8);
        }
        View view2 = this.C;
        if (view2 != null) {
            e(view2, i13, paddingTop, paddingTop2, b8);
        }
        int paddingLeft = b8 ? getPaddingLeft() : (i9 - i7) - getPaddingRight();
        ActionMenuView actionMenuView = this.f669s;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !b8);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        if (View.MeasureSpec.getMode(i7) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i8) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i7);
        int i9 = this.f671u;
        if (i9 <= 0) {
            i9 = View.MeasureSpec.getSize(i8);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i10 = i9 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE);
        View view = this.A;
        if (view != null) {
            int c8 = c(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.A.getLayoutParams();
            paddingLeft = c8 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f669s;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f669s, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.D;
        if (linearLayout != null && this.C == null) {
            if (this.I) {
                this.D.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.D.getMeasuredWidth();
                boolean z7 = measuredWidth <= paddingLeft;
                if (z7) {
                    paddingLeft -= measuredWidth;
                }
                this.D.setVisibility(z7 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.C;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                i10 = Math.min(i13, i10);
            }
            this.C.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(i10, i14));
        }
        if (this.f671u > 0) {
            setMeasuredDimension(size, i9);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i7) {
        this.f671u = i7;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.C;
        if (view2 != null) {
            removeView(view2);
        }
        this.C = view;
        if (view != null && (linearLayout = this.D) != null) {
            removeView(linearLayout);
            this.D = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f544z = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f543y = charSequence;
        i();
        androidx.core.view.e0.P(this, charSequence);
    }

    public void setTitleOptional(boolean z7) {
        if (z7 != this.I) {
            requestLayout();
        }
        this.I = z7;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i7) {
        super.setVisibility(i7);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, f.a.f23314g);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        r1 u7 = r1.u(context, attributeSet, f.j.f23564y, i7, 0);
        androidx.core.view.e0.Q(this, u7.f(f.j.f23569z));
        this.G = u7.m(f.j.D, 0);
        this.H = u7.m(f.j.C, 0);
        this.f671u = u7.l(f.j.B, 0);
        this.J = u7.m(f.j.A, f.g.f23411d);
        u7.v();
    }
}
