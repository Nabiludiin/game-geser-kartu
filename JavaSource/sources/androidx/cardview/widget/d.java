package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* compiled from: MyApplication */
class d extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f1064a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f1066c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f1067d;

    /* renamed from: e, reason: collision with root package name */
    private float f1068e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f1071h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f1072i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f1073j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1069f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1070g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f1074k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f1065b = new Paint(5);

    d(ColorStateList colorStateList, float f8) {
        this.f1064a = f8;
        e(colorStateList);
        this.f1066c = new RectF();
        this.f1067d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1071h = colorStateList;
        this.f1065b.setColor(colorStateList.getColorForState(getState(), this.f1071h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1066c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1067d.set(rect);
        if (this.f1069f) {
            this.f1067d.inset((int) Math.ceil(e.a(this.f1068e, this.f1064a, this.f1070g)), (int) Math.ceil(e.b(this.f1068e, this.f1064a, this.f1070g)));
            this.f1066c.set(this.f1067d);
        }
    }

    public ColorStateList b() {
        return this.f1071h;
    }

    float c() {
        return this.f1068e;
    }

    public float d() {
        return this.f1064a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z7;
        Paint paint = this.f1065b;
        if (this.f1072i == null || paint.getColorFilter() != null) {
            z7 = false;
        } else {
            paint.setColorFilter(this.f1072i);
            z7 = true;
        }
        RectF rectF = this.f1066c;
        float f8 = this.f1064a;
        canvas.drawRoundRect(rectF, f8, f8, paint);
        if (z7) {
            paint.setColorFilter(null);
        }
    }

    public void f(ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f8, boolean z7, boolean z8) {
        if (f8 == this.f1068e && this.f1069f == z7 && this.f1070g == z8) {
            return;
        }
        this.f1068e = f8;
        this.f1069f = z7;
        this.f1070g = z8;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1067d, this.f1064a);
    }

    void h(float f8) {
        if (f8 == this.f1064a) {
            return;
        }
        this.f1064a = f8;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1073j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f1071h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1071h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z7 = colorForState != this.f1065b.getColor();
        if (z7) {
            this.f1065b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1073j;
        if (colorStateList2 == null || (mode = this.f1074k) == null) {
            return z7;
        }
        this.f1072i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        this.f1065b.setAlpha(i7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1065b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1073j = colorStateList;
        this.f1072i = a(colorStateList, this.f1074k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1074k = mode;
        this.f1072i = a(this.f1073j, mode);
        invalidateSelf();
    }
}
