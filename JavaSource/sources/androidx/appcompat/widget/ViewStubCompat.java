package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
public final class ViewStubCompat extends View {

    /* renamed from: q, reason: collision with root package name */
    private int f663q;

    /* renamed from: r, reason: collision with root package name */
    private int f664r;

    /* renamed from: s, reason: collision with root package name */
    private WeakReference f665s;

    /* renamed from: t, reason: collision with root package name */
    private LayoutInflater f666t;

    /* compiled from: MyApplication */
    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f663q == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflater = this.f666t;
        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(getContext());
        }
        View inflate = layoutInflater.inflate(this.f663q, viewGroup, false);
        int i7 = this.f664r;
        if (i7 != -1) {
            inflate.setId(i7);
        }
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(inflate, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(inflate, indexOfChild);
        }
        this.f665s = new WeakReference(inflate);
        return inflate;
    }

    public int getInflatedId() {
        return this.f664r;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f666t;
    }

    public int getLayoutResource() {
        return this.f663q;
    }

    @Override // android.view.View
    protected void onMeasure(int i7, int i8) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i7) {
        this.f664r = i7;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f666t = layoutInflater;
    }

    public void setLayoutResource(int i7) {
        this.f663q = i7;
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        WeakReference weakReference = this.f665s;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i7);
            return;
        }
        super.setVisibility(i7);
        if (i7 == 0 || i7 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f663q = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.j.f23573z3, i7, 0);
        this.f664r = obtainStyledAttributes.getResourceId(f.j.C3, -1);
        this.f663q = obtainStyledAttributes.getResourceId(f.j.B3, 0);
        setId(obtainStyledAttributes.getResourceId(f.j.A3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public void setOnInflateListener(a aVar) {
    }
}
