package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: MyApplication */
public class CardView extends FrameLayout {

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f1053x = {R.attr.colorBackground};

    /* renamed from: y, reason: collision with root package name */
    private static final c f1054y;

    /* renamed from: q, reason: collision with root package name */
    private boolean f1055q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f1056r;

    /* renamed from: s, reason: collision with root package name */
    int f1057s;

    /* renamed from: t, reason: collision with root package name */
    int f1058t;

    /* renamed from: u, reason: collision with root package name */
    final Rect f1059u;

    /* renamed from: v, reason: collision with root package name */
    final Rect f1060v;

    /* renamed from: w, reason: collision with root package name */
    private final b f1061w;

    /* compiled from: MyApplication */
    class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f1062a;

        a() {
        }

        @Override // androidx.cardview.widget.b
        public void a(Drawable drawable) {
            this.f1062a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.b
        public boolean b() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.b
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // androidx.cardview.widget.b
        public Drawable d() {
            return this.f1062a;
        }

        @Override // androidx.cardview.widget.b
        public View e() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.b
        public void f(int i7, int i8, int i9, int i10) {
            CardView.this.f1060v.set(i7, i8, i9, i10);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1059u;
            CardView.super.setPadding(i7 + rect.left, i8 + rect.top, i9 + rect.right, i10 + rect.bottom);
        }
    }

    static {
        androidx.cardview.widget.a aVar = new androidx.cardview.widget.a();
        f1054y = aVar;
        aVar.i();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, q.a.f25557a);
    }

    public ColorStateList getCardBackgroundColor() {
        return f1054y.h(this.f1061w);
    }

    public float getCardElevation() {
        return f1054y.c(this.f1061w);
    }

    public int getContentPaddingBottom() {
        return this.f1059u.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1059u.left;
    }

    public int getContentPaddingRight() {
        return this.f1059u.right;
    }

    public int getContentPaddingTop() {
        return this.f1059u.top;
    }

    public float getMaxCardElevation() {
        return f1054y.g(this.f1061w);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1056r;
    }

    public float getRadius() {
        return f1054y.d(this.f1061w);
    }

    public boolean getUseCompatPadding() {
        return this.f1055q;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i7, int i8) {
        if (f1054y instanceof androidx.cardview.widget.a) {
            super.onMeasure(i7, i8);
            return;
        }
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i7 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.k(this.f1061w)), View.MeasureSpec.getSize(i7)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i8);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i8 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.j(this.f1061w)), View.MeasureSpec.getSize(i8)), mode2);
        }
        super.onMeasure(i7, i8);
    }

    public void setCardBackgroundColor(int i7) {
        f1054y.m(this.f1061w, ColorStateList.valueOf(i7));
    }

    public void setCardElevation(float f8) {
        f1054y.f(this.f1061w, f8);
    }

    public void setMaxCardElevation(float f8) {
        f1054y.n(this.f1061w, f8);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i7) {
        this.f1058t = i7;
        super.setMinimumHeight(i7);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i7) {
        this.f1057s = i7;
        super.setMinimumWidth(i7);
    }

    public void setPreventCornerOverlap(boolean z7) {
        if (z7 != this.f1056r) {
            this.f1056r = z7;
            f1054y.l(this.f1061w);
        }
    }

    public void setRadius(float f8) {
        f1054y.b(this.f1061w, f8);
    }

    public void setUseCompatPadding(boolean z7) {
        if (this.f1055q != z7) {
            this.f1055q = z7;
            f1054y.e(this.f1061w);
        }
    }

    public CardView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1059u = rect;
        this.f1060v = new Rect();
        a aVar = new a();
        this.f1061w = aVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, q.d.f25561a, i7, q.c.f25560a);
        int i8 = q.d.f25564d;
        if (obtainStyledAttributes.hasValue(i8)) {
            valueOf = obtainStyledAttributes.getColorStateList(i8);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1053x);
            int color = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            valueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(q.b.f25559b) : getResources().getColor(q.b.f25558a));
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(q.d.f25565e, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(q.d.f25566f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(q.d.f25567g, 0.0f);
        this.f1055q = obtainStyledAttributes.getBoolean(q.d.f25569i, false);
        this.f1056r = obtainStyledAttributes.getBoolean(q.d.f25568h, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(q.d.f25570j, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(q.d.f25572l, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(q.d.f25574n, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(q.d.f25573m, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(q.d.f25571k, dimensionPixelSize);
        float f8 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1057s = obtainStyledAttributes.getDimensionPixelSize(q.d.f25562b, 0);
        this.f1058t = obtainStyledAttributes.getDimensionPixelSize(q.d.f25563c, 0);
        obtainStyledAttributes.recycle();
        f1054y.a(aVar, context, colorStateList, dimension, dimension2, f8);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f1054y.m(this.f1061w, colorStateList);
    }

    @Override // android.view.View
    public void setPadding(int i7, int i8, int i9, int i10) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i7, int i8, int i9, int i10) {
    }
}
