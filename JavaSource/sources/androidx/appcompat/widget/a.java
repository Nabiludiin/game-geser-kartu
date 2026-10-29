package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: MyApplication */
abstract class a extends ViewGroup {

    /* renamed from: q, reason: collision with root package name */
    protected final C0008a f667q;

    /* renamed from: r, reason: collision with root package name */
    protected final Context f668r;

    /* renamed from: s, reason: collision with root package name */
    protected ActionMenuView f669s;

    /* renamed from: t, reason: collision with root package name */
    protected c f670t;

    /* renamed from: u, reason: collision with root package name */
    protected int f671u;

    /* renamed from: v, reason: collision with root package name */
    protected androidx.core.view.k0 f672v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f673w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f674x;

    /* compiled from: MyApplication */
    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0008a implements androidx.core.view.l0 {

        /* renamed from: a, reason: collision with root package name */
        private boolean f675a = false;

        /* renamed from: b, reason: collision with root package name */
        int f676b;

        protected C0008a() {
        }

        @Override // androidx.core.view.l0
        public void a(View view) {
            this.f675a = true;
        }

        @Override // androidx.core.view.l0
        public void b(View view) {
            if (this.f675a) {
                return;
            }
            a aVar = a.this;
            aVar.f672v = null;
            a.super.setVisibility(this.f676b);
        }

        @Override // androidx.core.view.l0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f675a = false;
        }

        public C0008a d(androidx.core.view.k0 k0Var, int i7) {
            a.this.f672v = k0Var;
            this.f676b = i7;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f667q = new C0008a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(f.a.f23308a, typedValue, true) || typedValue.resourceId == 0) {
            this.f668r = context;
        } else {
            this.f668r = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i7, int i8, boolean z7) {
        return z7 ? i7 - i8 : i7 + i8;
    }

    protected int c(View view, int i7, int i8, int i9) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i7, Integer.MIN_VALUE), i8);
        return Math.max(0, (i7 - view.getMeasuredWidth()) - i9);
    }

    protected int e(View view, int i7, int i8, int i9, boolean z7) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i8 + ((i9 - measuredHeight) / 2);
        if (z7) {
            view.layout(i7 - measuredWidth, i10, i7, measuredHeight + i10);
        } else {
            view.layout(i7, i10, i7 + measuredWidth, measuredHeight + i10);
        }
        return z7 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.k0 f(int i7, long j7) {
        androidx.core.view.k0 k0Var = this.f672v;
        if (k0Var != null) {
            k0Var.c();
        }
        if (i7 != 0) {
            androidx.core.view.k0 b8 = androidx.core.view.e0.c(this).b(0.0f);
            b8.e(j7);
            b8.g(this.f667q.d(b8, i7));
            return b8;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        androidx.core.view.k0 b9 = androidx.core.view.e0.c(this).b(1.0f);
        b9.e(j7);
        b9.g(this.f667q.d(b9, i7));
        return b9;
    }

    public int getAnimatedVisibility() {
        return this.f672v != null ? this.f667q.f676b : getVisibility();
    }

    public int getContentHeight() {
        return this.f671u;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, f.j.f23444a, f.a.f23310c, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(f.j.f23489j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f670t;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f674x = false;
        }
        if (!this.f674x) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f674x = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f674x = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f673w = false;
        }
        if (!this.f673w) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f673w = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f673w = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i7);

    @Override // android.view.View
    public void setVisibility(int i7) {
        if (i7 != getVisibility()) {
            androidx.core.view.k0 k0Var = this.f672v;
            if (k0Var != null) {
                k0Var.c();
            }
            super.setVisibility(i7);
        }
    }
}
