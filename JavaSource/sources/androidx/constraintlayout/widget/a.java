package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: MyApplication */
public class a extends c {
    private int A;
    private v.a B;

    /* renamed from: z, reason: collision with root package name */
    private int f1178z;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    private void n(v.e eVar, int i7, boolean z7) {
        this.A = i7;
        if (z7) {
            int i8 = this.f1178z;
            if (i8 == 5) {
                this.A = 1;
            } else if (i8 == 6) {
                this.A = 0;
            }
        } else {
            int i9 = this.f1178z;
            if (i9 == 5) {
                this.A = 0;
            } else if (i9 == 6) {
                this.A = 1;
            }
        }
        if (eVar instanceof v.a) {
            ((v.a) eVar).w1(this.A);
        }
    }

    @Override // androidx.constraintlayout.widget.c
    protected void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.B = new v.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, h.f1442n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i7 = 0; i7 < indexCount; i7++) {
                int index = obtainStyledAttributes.getIndex(i7);
                if (index == h.f1498u1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == h.f1490t1) {
                    this.B.v1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == h.f1506v1) {
                    this.B.x1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1200t = this.B;
        m();
    }

    public boolean getAllowsGoneWidget() {
        return this.B.q1();
    }

    public int getMargin() {
        return this.B.s1();
    }

    public int getType() {
        return this.f1178z;
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(v.e eVar, boolean z7) {
        n(eVar, this.f1178z, z7);
    }

    public void setAllowsGoneWidget(boolean z7) {
        this.B.v1(z7);
    }

    public void setDpMargin(int i7) {
        this.B.x1((int) ((i7 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i7) {
        this.B.x1(i7);
    }

    public void setType(int i7) {
        this.f1178z = i7;
    }
}
