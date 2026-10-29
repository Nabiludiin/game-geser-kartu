package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.core.content.res.h;

/* compiled from: MyApplication */
public class r1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f857a;

    /* renamed from: b, reason: collision with root package name */
    private final TypedArray f858b;

    /* renamed from: c, reason: collision with root package name */
    private TypedValue f859c;

    private r1(Context context, TypedArray typedArray) {
        this.f857a = context;
        this.f858b = typedArray;
    }

    public static r1 s(Context context, int i7, int[] iArr) {
        return new r1(context, context.obtainStyledAttributes(i7, iArr));
    }

    public static r1 t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new r1(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static r1 u(Context context, AttributeSet attributeSet, int[] iArr, int i7, int i8) {
        return new r1(context, context.obtainStyledAttributes(attributeSet, iArr, i7, i8));
    }

    public boolean a(int i7, boolean z7) {
        return this.f858b.getBoolean(i7, z7);
    }

    public int b(int i7, int i8) {
        return this.f858b.getColor(i7, i8);
    }

    public ColorStateList c(int i7) {
        int resourceId;
        ColorStateList a8;
        return (!this.f858b.hasValue(i7) || (resourceId = this.f858b.getResourceId(i7, 0)) == 0 || (a8 = h.a.a(this.f857a, resourceId)) == null) ? this.f858b.getColorStateList(i7) : a8;
    }

    public int d(int i7, int i8) {
        return this.f858b.getDimensionPixelOffset(i7, i8);
    }

    public int e(int i7, int i8) {
        return this.f858b.getDimensionPixelSize(i7, i8);
    }

    public Drawable f(int i7) {
        int resourceId;
        return (!this.f858b.hasValue(i7) || (resourceId = this.f858b.getResourceId(i7, 0)) == 0) ? this.f858b.getDrawable(i7) : h.a.b(this.f857a, resourceId);
    }

    public Drawable g(int i7) {
        int resourceId;
        if (!this.f858b.hasValue(i7) || (resourceId = this.f858b.getResourceId(i7, 0)) == 0) {
            return null;
        }
        return k.b().d(this.f857a, resourceId, true);
    }

    public float h(int i7, float f8) {
        return this.f858b.getFloat(i7, f8);
    }

    public Typeface i(int i7, int i8, h.e eVar) {
        int resourceId = this.f858b.getResourceId(i7, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f859c == null) {
            this.f859c = new TypedValue();
        }
        return androidx.core.content.res.h.f(this.f857a, resourceId, this.f859c, i8, eVar);
    }

    public int j(int i7, int i8) {
        return this.f858b.getInt(i7, i8);
    }

    public int k(int i7, int i8) {
        return this.f858b.getInteger(i7, i8);
    }

    public int l(int i7, int i8) {
        return this.f858b.getLayoutDimension(i7, i8);
    }

    public int m(int i7, int i8) {
        return this.f858b.getResourceId(i7, i8);
    }

    public String n(int i7) {
        return this.f858b.getString(i7);
    }

    public CharSequence o(int i7) {
        return this.f858b.getText(i7);
    }

    public CharSequence[] p(int i7) {
        return this.f858b.getTextArray(i7);
    }

    public TypedArray q() {
        return this.f858b;
    }

    public boolean r(int i7) {
        return this.f858b.hasValue(i7);
    }

    public void v() {
        this.f858b.recycle();
    }
}
