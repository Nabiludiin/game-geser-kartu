package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.e0;
import androidx.core.view.p0;
import java.util.ArrayList;

/* compiled from: MyApplication */
public final class h extends FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    private ArrayList f2267q;

    /* renamed from: r, reason: collision with root package name */
    private ArrayList f2268r;

    /* renamed from: s, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f2269s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f2270t;

    h(Context context, AttributeSet attributeSet, n nVar) {
        super(context, attributeSet);
        String str;
        this.f2270t = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k0.c.f24344h);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(k0.c.f24345i) : classAttribute;
        String string = obtainStyledAttributes.getString(k0.c.f24346j);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment f02 = nVar.f0(id);
        if (classAttribute != null && f02 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment a8 = nVar.o0().a(context.getClassLoader(), classAttribute);
            a8.x0(context, attributeSet, null);
            nVar.l().l(true).c(this, a8, string).h();
        }
        nVar.Q0(this);
    }

    private void a(View view) {
        ArrayList arrayList = this.f2268r;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f2267q == null) {
            this.f2267q = new ArrayList();
        }
        this.f2267q.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (n.x0(view) != null) {
            super.addView(view, i7, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z7) {
        if (n.x0(view) != null) {
            return super.addViewInLayout(view, i7, layoutParams, z7);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        p0 u7 = p0.u(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f2269s;
        p0 u8 = onApplyWindowInsetsListener != null ? p0.u(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : e0.E(this, u7);
        if (!u8.n()) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                e0.e(getChildAt(i7), u8);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f2270t && this.f2267q != null) {
            for (int i7 = 0; i7 < this.f2267q.size(); i7++) {
                super.drawChild(canvas, (View) this.f2267q.get(i7), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j7) {
        ArrayList arrayList;
        if (!this.f2270t || (arrayList = this.f2267q) == null || arrayList.size() <= 0 || !this.f2267q.contains(view)) {
            return super.drawChild(canvas, view, j7);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList arrayList = this.f2268r;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.f2267q;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f2270t = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z7) {
        if (z7) {
            a(view);
        }
        super.removeDetachedView(view, z7);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i7) {
        a(getChildAt(i7));
        super.removeViewAt(i7);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i7, int i8) {
        for (int i9 = i7; i9 < i7 + i8; i9++) {
            a(getChildAt(i9));
        }
        super.removeViews(i7, i8);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i7, int i8) {
        for (int i9 = i7; i9 < i7 + i8; i9++) {
            a(getChildAt(i9));
        }
        super.removeViewsInLayout(i7, i8);
    }

    void setDrawDisappearingViewsLast(boolean z7) {
        this.f2270t = z7;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f2269s = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f2268r == null) {
                this.f2268r = new ArrayList();
            }
            this.f2268r.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }
}
