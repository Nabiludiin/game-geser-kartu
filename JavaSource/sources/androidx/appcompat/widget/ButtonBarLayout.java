package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: MyApplication */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: q, reason: collision with root package name */
    private boolean f571q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f572r;

    /* renamed from: s, reason: collision with root package name */
    private int f573s;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f573s = -1;
        int[] iArr = f.j.N0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        androidx.core.view.e0.L(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f571q = obtainStyledAttributes.getBoolean(f.j.O0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f571q);
        }
    }

    private int a(int i7) {
        int childCount = getChildCount();
        while (i7 < childCount) {
            if (getChildAt(i7).getVisibility() == 0) {
                return i7;
            }
            i7++;
        }
        return -1;
    }

    private boolean b() {
        return this.f572r;
    }

    private void setStacked(boolean z7) {
        if (this.f572r != z7) {
            if (!z7 || this.f571q) {
                this.f572r = z7;
                setOrientation(z7 ? 1 : 0);
                setGravity(z7 ? 8388613 : 80);
                View findViewById = findViewById(f.f.G);
                if (findViewById != null) {
                    findViewById.setVisibility(z7 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        int i9;
        boolean z7;
        int size = View.MeasureSpec.getSize(i7);
        int i10 = 0;
        if (this.f571q) {
            if (size > this.f573s && b()) {
                setStacked(false);
            }
            this.f573s = size;
        }
        if (b() || View.MeasureSpec.getMode(i7) != 1073741824) {
            i9 = i7;
            z7 = false;
        } else {
            i9 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z7 = true;
        }
        super.onMeasure(i9, i8);
        if (this.f571q && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z7 = true;
        }
        if (z7) {
            super.onMeasure(i7, i8);
        }
        int a8 = a(0);
        if (a8 >= 0) {
            View childAt = getChildAt(a8);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int a9 = a(a8 + 1);
                if (a9 >= 0) {
                    paddingTop += getChildAt(a9).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i10 = paddingTop;
            } else {
                i10 = paddingTop + getPaddingBottom();
            }
        }
        if (androidx.core.view.e0.s(this) != i10) {
            setMinimumHeight(i10);
            if (i8 == 0) {
                super.onMeasure(i7, i8);
            }
        }
    }

    public void setAllowStacking(boolean z7) {
        if (this.f571q != z7) {
            this.f571q = z7;
            if (!z7 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
