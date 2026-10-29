package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: MyApplication */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    private boolean f533q;

    /* renamed from: r, reason: collision with root package name */
    private View f534r;

    /* renamed from: s, reason: collision with root package name */
    private View f535s;

    /* renamed from: t, reason: collision with root package name */
    private View f536t;

    /* renamed from: u, reason: collision with root package name */
    Drawable f537u;

    /* renamed from: v, reason: collision with root package name */
    Drawable f538v;

    /* renamed from: w, reason: collision with root package name */
    Drawable f539w;

    /* renamed from: x, reason: collision with root package name */
    boolean f540x;

    /* renamed from: y, reason: collision with root package name */
    boolean f541y;

    /* renamed from: z, reason: collision with root package name */
    private int f542z;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        androidx.core.view.e0.Q(this, new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f23444a);
        this.f537u = obtainStyledAttributes.getDrawable(f.j.f23449b);
        this.f538v = obtainStyledAttributes.getDrawable(f.j.f23459d);
        this.f542z = obtainStyledAttributes.getDimensionPixelSize(f.j.f23489j, -1);
        boolean z7 = true;
        if (getId() == f.f.H) {
            this.f540x = true;
            this.f539w = obtainStyledAttributes.getDrawable(f.j.f23454c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f540x ? this.f537u != null || this.f538v != null : this.f539w != null) {
            z7 = false;
        }
        setWillNotDraw(z7);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f537u;
        if (drawable != null && drawable.isStateful()) {
            this.f537u.setState(getDrawableState());
        }
        Drawable drawable2 = this.f538v;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f538v.setState(getDrawableState());
        }
        Drawable drawable3 = this.f539w;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f539w.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f534r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f537u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f538v;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f539w;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f535s = findViewById(f.f.f23382a);
        this.f536t = findViewById(f.f.f23387f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f533q || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        Drawable drawable;
        super.onLayout(z7, i7, i8, i9, i10);
        View view = this.f534r;
        boolean z8 = true;
        boolean z9 = false;
        boolean z10 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i11 = layoutParams.bottomMargin;
            view.layout(i7, measuredHeight2 - i11, i9, measuredHeight - i11);
        }
        if (this.f540x) {
            Drawable drawable2 = this.f539w;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z8 = z9;
        } else {
            if (this.f537u != null) {
                if (this.f535s.getVisibility() == 0) {
                    this.f537u.setBounds(this.f535s.getLeft(), this.f535s.getTop(), this.f535s.getRight(), this.f535s.getBottom());
                } else {
                    View view2 = this.f536t;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f537u.setBounds(0, 0, 0, 0);
                    } else {
                        this.f537u.setBounds(this.f536t.getLeft(), this.f536t.getTop(), this.f536t.getRight(), this.f536t.getBottom());
                    }
                }
                z9 = true;
            }
            this.f541y = z10;
            if (z10 && (drawable = this.f538v) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z8 = z9;
        }
        if (z8) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i7, int i8) {
        int i9;
        if (this.f535s == null && View.MeasureSpec.getMode(i8) == Integer.MIN_VALUE && (i9 = this.f542z) >= 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i9, View.MeasureSpec.getSize(i8)), Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
        if (this.f535s == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i8);
        View view = this.f534r;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f535s) ? a(this.f535s) : !b(this.f536t) ? a(this.f536t) : 0) + a(this.f534r), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i8) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f537u;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f537u);
        }
        this.f537u = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f535s;
            if (view != null) {
                this.f537u.setBounds(view.getLeft(), this.f535s.getTop(), this.f535s.getRight(), this.f535s.getBottom());
            }
        }
        boolean z7 = false;
        if (!this.f540x ? !(this.f537u != null || this.f538v != null) : this.f539w == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f539w;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f539w);
        }
        this.f539w = drawable;
        boolean z7 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f540x && (drawable2 = this.f539w) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f540x ? !(this.f537u != null || this.f538v != null) : this.f539w == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f538v;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f538v);
        }
        this.f538v = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f541y && (drawable2 = this.f538v) != null) {
                drawable2.setBounds(this.f534r.getLeft(), this.f534r.getTop(), this.f534r.getRight(), this.f534r.getBottom());
            }
        }
        boolean z7 = false;
        if (!this.f540x ? !(this.f537u != null || this.f538v != null) : this.f539w == null) {
            z7 = true;
        }
        setWillNotDraw(z7);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(j1 j1Var) {
        View view = this.f534r;
        if (view != null) {
            removeView(view);
        }
        this.f534r = j1Var;
    }

    public void setTransitioning(boolean z7) {
        this.f533q = z7;
        setDescendantFocusability(z7 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        boolean z7 = i7 == 0;
        Drawable drawable = this.f537u;
        if (drawable != null) {
            drawable.setVisible(z7, false);
        }
        Drawable drawable2 = this.f538v;
        if (drawable2 != null) {
            drawable2.setVisible(z7, false);
        }
        Drawable drawable3 = this.f539w;
        if (drawable3 != null) {
            drawable3.setVisible(z7, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f537u && !this.f540x) {
            return true;
        }
        if (drawable == this.f538v && this.f541y) {
            return true;
        }
        return (drawable == this.f539w && this.f540x) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i7) {
        if (i7 != 0) {
            return super.startActionModeForChild(view, callback, i7);
        }
        return null;
    }
}
