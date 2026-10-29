package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import androidx.core.content.res.k;
import androidx.core.graphics.h;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: MyApplication */
public class g extends androidx.vectordrawable.graphics.drawable.f {
    static final PorterDuff.Mode A = PorterDuff.Mode.SRC_IN;

    /* renamed from: r, reason: collision with root package name */
    private h f2864r;

    /* renamed from: s, reason: collision with root package name */
    private PorterDuffColorFilter f2865s;

    /* renamed from: t, reason: collision with root package name */
    private ColorFilter f2866t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f2867u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f2868v;

    /* renamed from: w, reason: collision with root package name */
    private Drawable.ConstantState f2869w;

    /* renamed from: x, reason: collision with root package name */
    private final float[] f2870x;

    /* renamed from: y, reason: collision with root package name */
    private final Matrix f2871y;

    /* renamed from: z, reason: collision with root package name */
    private final Rect f2872z;

    /* compiled from: MyApplication */
    private static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2899b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f2898a = androidx.core.graphics.h.d(string2);
            }
            this.f2900c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.j(xmlPullParser, "pathData")) {
                TypedArray k7 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2839d);
                f(k7, xmlPullParser);
                k7.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* compiled from: MyApplication */
    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: MyApplication */
    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f2919a;

        /* renamed from: b, reason: collision with root package name */
        C0051g f2920b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f2921c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f2922d;

        /* renamed from: e, reason: collision with root package name */
        boolean f2923e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f2924f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f2925g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f2926h;

        /* renamed from: i, reason: collision with root package name */
        int f2927i;

        /* renamed from: j, reason: collision with root package name */
        boolean f2928j;

        /* renamed from: k, reason: collision with root package name */
        boolean f2929k;

        /* renamed from: l, reason: collision with root package name */
        Paint f2930l;

        public h(h hVar) {
            this.f2921c = null;
            this.f2922d = g.A;
            if (hVar != null) {
                this.f2919a = hVar.f2919a;
                C0051g c0051g = new C0051g(hVar.f2920b);
                this.f2920b = c0051g;
                if (hVar.f2920b.f2907e != null) {
                    c0051g.f2907e = new Paint(hVar.f2920b.f2907e);
                }
                if (hVar.f2920b.f2906d != null) {
                    this.f2920b.f2906d = new Paint(hVar.f2920b.f2906d);
                }
                this.f2921c = hVar.f2921c;
                this.f2922d = hVar.f2922d;
                this.f2923e = hVar.f2923e;
            }
        }

        public boolean a(int i7, int i8) {
            return i7 == this.f2924f.getWidth() && i8 == this.f2924f.getHeight();
        }

        public boolean b() {
            return !this.f2929k && this.f2925g == this.f2921c && this.f2926h == this.f2922d && this.f2928j == this.f2923e && this.f2927i == this.f2920b.getRootAlpha();
        }

        public void c(int i7, int i8) {
            if (this.f2924f == null || !a(i7, i8)) {
                this.f2924f = Bitmap.createBitmap(i7, i8, Bitmap.Config.ARGB_8888);
                this.f2929k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f2924f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f2930l == null) {
                Paint paint = new Paint();
                this.f2930l = paint;
                paint.setFilterBitmap(true);
            }
            this.f2930l.setAlpha(this.f2920b.getRootAlpha());
            this.f2930l.setColorFilter(colorFilter);
            return this.f2930l;
        }

        public boolean f() {
            return this.f2920b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f2920b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2919a;
        }

        public boolean h(int[] iArr) {
            boolean g8 = this.f2920b.g(iArr);
            this.f2929k |= g8;
            return g8;
        }

        public void i() {
            this.f2925g = this.f2921c;
            this.f2926h = this.f2922d;
            this.f2927i = this.f2920b.getRootAlpha();
            this.f2928j = this.f2923e;
            this.f2929k = false;
        }

        public void j(int i7, int i8) {
            this.f2924f.eraseColor(0);
            this.f2920b.b(new Canvas(this.f2924f), i7, i8, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }

        public h() {
            this.f2921c = null;
            this.f2922d = g.A;
            this.f2920b = new C0051g();
        }
    }

    g() {
        this.f2868v = true;
        this.f2870x = new float[9];
        this.f2871y = new Matrix();
        this.f2872z = new Rect();
        this.f2864r = new h();
    }

    static int a(int i7, float f8) {
        return (i7 & 16777215) | (((int) (Color.alpha(i7) * f8)) << 24);
    }

    public static g b(Resources resources, int i7, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            g gVar = new g();
            gVar.f2863q = androidx.core.content.res.h.d(resources, i7, theme);
            gVar.f2869w = new i(gVar.f2863q.getConstantState());
            return gVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i7);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e8) {
            Log.e("VectorDrawableCompat", "parser error", e8);
            return null;
        } catch (XmlPullParserException e9) {
            Log.e("VectorDrawableCompat", "parser error", e9);
            return null;
        }
    }

    public static g c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = this.f2864r;
        C0051g c0051g = hVar.f2920b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0051g.f2910h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z7 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2886b.add(cVar);
                    if (cVar.getPathName() != null) {
                        c0051g.f2918p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f2919a = cVar.f2901d | hVar.f2919a;
                    z7 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2886b.add(bVar);
                    if (bVar.getPathName() != null) {
                        c0051g.f2918p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f2919a = bVar.f2901d | hVar.f2919a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f2886b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        c0051g.f2918p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f2919a = dVar2.f2895k | hVar.f2919a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z7) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    private static PorterDuff.Mode g(int i7, PorterDuff.Mode mode) {
        if (i7 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i7 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i7 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i7) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f2864r;
        C0051g c0051g = hVar.f2920b;
        hVar.f2922d = g(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c8 = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c8 != null) {
            hVar.f2921c = c8;
        }
        hVar.f2923e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f2923e);
        c0051g.f2913k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, c0051g.f2913k);
        float f8 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, c0051g.f2914l);
        c0051g.f2914l = f8;
        if (c0051g.f2913k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f8 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0051g.f2911i = typedArray.getDimension(3, c0051g.f2911i);
        float dimension = typedArray.getDimension(2, c0051g.f2912j);
        c0051g.f2912j = dimension;
        if (c0051g.f2911i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c0051g.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, c0051g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c0051g.f2916n = string;
            c0051g.f2918p.put(string, c0051g);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2863q;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    Object d(String str) {
        return this.f2864r.f2920b.f2918p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f2872z);
        if (this.f2872z.width() <= 0 || this.f2872z.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f2866t;
        if (colorFilter == null) {
            colorFilter = this.f2865s;
        }
        canvas.getMatrix(this.f2871y);
        this.f2871y.getValues(this.f2870x);
        float abs = Math.abs(this.f2870x[0]);
        float abs2 = Math.abs(this.f2870x[4]);
        float abs3 = Math.abs(this.f2870x[1]);
        float abs4 = Math.abs(this.f2870x[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f2872z.width() * abs));
        int min2 = Math.min(2048, (int) (this.f2872z.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f2872z;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f2872z.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f2872z.offsetTo(0, 0);
        this.f2864r.c(min, min2);
        if (!this.f2868v) {
            this.f2864r.j(min, min2);
        } else if (!this.f2864r.b()) {
            this.f2864r.j(min, min2);
            this.f2864r.i();
        }
        this.f2864r.d(canvas, colorFilter, this.f2872z);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2863q;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2864r.f2920b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2863q;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2864r.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2863q;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2866t;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2863q != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f2863q.getConstantState());
        }
        this.f2864r.f2919a = getChangingConfigurations();
        return this.f2864r;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2863q;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f2864r.f2920b.f2912j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2863q;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f2864r.f2920b.f2911i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    void h(boolean z7) {
        this.f2868v = z7;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2863q;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f2864r.f2923e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f2864r;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f2864r.f2921c;
        return colorStateList != null && colorStateList.isStateful();
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f2867u && super.mutate() == this) {
            this.f2864r = new h(this.f2864r);
            this.f2867u = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z7;
        PorterDuff.Mode mode;
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f2864r;
        ColorStateList colorStateList = hVar.f2921c;
        if (colorStateList == null || (mode = hVar.f2922d) == null) {
            z7 = false;
        } else {
            this.f2865s = j(this.f2865s, colorStateList, mode);
            invalidateSelf();
            z7 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z7;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j7) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j7);
        } else {
            super.scheduleSelf(runnable, j7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else if (this.f2864r.f2920b.getRootAlpha() != i7) {
            this.f2864r.f2920b.setRootAlpha(i7);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z7);
        } else {
            this.f2864r.f2923e = z7;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i7) {
        super.setChangingConfigurations(i7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i7, PorterDuff.Mode mode) {
        super.setColorFilter(i7, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z7) {
        super.setFilterBitmap(z7);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f8, float f9) {
        super.setHotspot(f8, f9);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i7) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.m(drawable, i7);
        } else {
            setTintList(ColorStateList.valueOf(i7));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
            return;
        }
        h hVar = this.f2864r;
        if (hVar.f2921c != colorStateList) {
            hVar.f2921c = colorStateList;
            this.f2865s = j(this.f2865s, colorStateList, hVar.f2922d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
            return;
        }
        h hVar = this.f2864r;
        if (hVar.f2922d != mode) {
            hVar.f2922d = mode;
            this.f2865s = j(this.f2865s, hVar.f2921c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f2863q;
        return drawable != null ? drawable.setVisible(z7, z8) : super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: MyApplication */
    private static class i extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f2931a;

        public i(Drawable.ConstantState constantState) {
            this.f2931a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2931a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2931a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f2863q = (VectorDrawable) this.f2931a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f2863q = (VectorDrawable) this.f2931a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f2863q = (VectorDrawable) this.f2931a.newDrawable(resources, theme);
            return gVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2866t = colorFilter;
            invalidateSelf();
        }
    }

    /* compiled from: MyApplication */
    private static abstract class f extends e {

        /* renamed from: a, reason: collision with root package name */
        protected h.b[] f2898a;

        /* renamed from: b, reason: collision with root package name */
        String f2899b;

        /* renamed from: c, reason: collision with root package name */
        int f2900c;

        /* renamed from: d, reason: collision with root package name */
        int f2901d;

        public f() {
            super();
            this.f2898a = null;
            this.f2900c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            h.b[] bVarArr = this.f2898a;
            if (bVarArr != null) {
                h.b.e(bVarArr, path);
            }
        }

        public h.b[] getPathData() {
            return this.f2898a;
        }

        public String getPathName() {
            return this.f2899b;
        }

        public void setPathData(h.b[] bVarArr) {
            if (androidx.core.graphics.h.b(this.f2898a, bVarArr)) {
                androidx.core.graphics.h.j(this.f2898a, bVarArr);
            } else {
                this.f2898a = androidx.core.graphics.h.f(bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f2898a = null;
            this.f2900c = 0;
            this.f2899b = fVar.f2899b;
            this.f2901d = fVar.f2901d;
            this.f2898a = androidx.core.graphics.h.f(fVar.f2898a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f2864r;
        hVar.f2920b = new C0051g();
        TypedArray k7 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2836a);
        i(k7, xmlPullParser, theme);
        k7.recycle();
        hVar.f2919a = getChangingConfigurations();
        hVar.f2929k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f2865s = j(this.f2865s, hVar.f2921c, hVar.f2922d);
    }

    g(h hVar) {
        this.f2868v = true;
        this.f2870x = new float[9];
        this.f2871y = new Matrix();
        this.f2872z = new Rect();
        this.f2864r = hVar;
        this.f2865s = j(this.f2865s, hVar.f2921c, hVar.f2922d);
    }

    /* compiled from: MyApplication */
    private static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        private int[] f2873e;

        /* renamed from: f, reason: collision with root package name */
        androidx.core.content.res.d f2874f;

        /* renamed from: g, reason: collision with root package name */
        float f2875g;

        /* renamed from: h, reason: collision with root package name */
        androidx.core.content.res.d f2876h;

        /* renamed from: i, reason: collision with root package name */
        float f2877i;

        /* renamed from: j, reason: collision with root package name */
        float f2878j;

        /* renamed from: k, reason: collision with root package name */
        float f2879k;

        /* renamed from: l, reason: collision with root package name */
        float f2880l;

        /* renamed from: m, reason: collision with root package name */
        float f2881m;

        /* renamed from: n, reason: collision with root package name */
        Paint.Cap f2882n;

        /* renamed from: o, reason: collision with root package name */
        Paint.Join f2883o;

        /* renamed from: p, reason: collision with root package name */
        float f2884p;

        c() {
            this.f2875g = 0.0f;
            this.f2877i = 1.0f;
            this.f2878j = 1.0f;
            this.f2879k = 0.0f;
            this.f2880l = 1.0f;
            this.f2881m = 0.0f;
            this.f2882n = Paint.Cap.BUTT;
            this.f2883o = Paint.Join.MITER;
            this.f2884p = 4.0f;
        }

        private Paint.Cap e(int i7, Paint.Cap cap) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        private Paint.Join f(int i7, Paint.Join join) {
            return i7 != 0 ? i7 != 1 ? i7 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f2873e = null;
            if (k.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f2899b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f2898a = androidx.core.graphics.h.d(string2);
                }
                this.f2876h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f2878j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f2878j);
                this.f2882n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f2882n);
                this.f2883o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f2883o);
                this.f2884p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f2884p);
                this.f2874f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f2877i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f2877i);
                this.f2875g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f2875g);
                this.f2880l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f2880l);
                this.f2881m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f2881m);
                this.f2879k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f2879k);
                this.f2900c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f2900c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            return this.f2876h.i() || this.f2874f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            return this.f2874f.j(iArr) | this.f2876h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k7 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2838c);
            h(k7, xmlPullParser, theme);
            k7.recycle();
        }

        float getFillAlpha() {
            return this.f2878j;
        }

        int getFillColor() {
            return this.f2876h.e();
        }

        float getStrokeAlpha() {
            return this.f2877i;
        }

        int getStrokeColor() {
            return this.f2874f.e();
        }

        float getStrokeWidth() {
            return this.f2875g;
        }

        float getTrimPathEnd() {
            return this.f2880l;
        }

        float getTrimPathOffset() {
            return this.f2881m;
        }

        float getTrimPathStart() {
            return this.f2879k;
        }

        void setFillAlpha(float f8) {
            this.f2878j = f8;
        }

        void setFillColor(int i7) {
            this.f2876h.k(i7);
        }

        void setStrokeAlpha(float f8) {
            this.f2877i = f8;
        }

        void setStrokeColor(int i7) {
            this.f2874f.k(i7);
        }

        void setStrokeWidth(float f8) {
            this.f2875g = f8;
        }

        void setTrimPathEnd(float f8) {
            this.f2880l = f8;
        }

        void setTrimPathOffset(float f8) {
            this.f2881m = f8;
        }

        void setTrimPathStart(float f8) {
            this.f2879k = f8;
        }

        c(c cVar) {
            super(cVar);
            this.f2875g = 0.0f;
            this.f2877i = 1.0f;
            this.f2878j = 1.0f;
            this.f2879k = 0.0f;
            this.f2880l = 1.0f;
            this.f2881m = 0.0f;
            this.f2882n = Paint.Cap.BUTT;
            this.f2883o = Paint.Join.MITER;
            this.f2884p = 4.0f;
            this.f2873e = cVar.f2873e;
            this.f2874f = cVar.f2874f;
            this.f2875g = cVar.f2875g;
            this.f2877i = cVar.f2877i;
            this.f2876h = cVar.f2876h;
            this.f2900c = cVar.f2900c;
            this.f2878j = cVar.f2878j;
            this.f2879k = cVar.f2879k;
            this.f2880l = cVar.f2880l;
            this.f2881m = cVar.f2881m;
            this.f2882n = cVar.f2882n;
            this.f2883o = cVar.f2883o;
            this.f2884p = cVar.f2884p;
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.vectordrawable.graphics.drawable.g$g, reason: collision with other inner class name */
    private static class C0051g {

        /* renamed from: q, reason: collision with root package name */
        private static final Matrix f2902q = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f2903a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f2904b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f2905c;

        /* renamed from: d, reason: collision with root package name */
        Paint f2906d;

        /* renamed from: e, reason: collision with root package name */
        Paint f2907e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f2908f;

        /* renamed from: g, reason: collision with root package name */
        private int f2909g;

        /* renamed from: h, reason: collision with root package name */
        final d f2910h;

        /* renamed from: i, reason: collision with root package name */
        float f2911i;

        /* renamed from: j, reason: collision with root package name */
        float f2912j;

        /* renamed from: k, reason: collision with root package name */
        float f2913k;

        /* renamed from: l, reason: collision with root package name */
        float f2914l;

        /* renamed from: m, reason: collision with root package name */
        int f2915m;

        /* renamed from: n, reason: collision with root package name */
        String f2916n;

        /* renamed from: o, reason: collision with root package name */
        Boolean f2917o;

        /* renamed from: p, reason: collision with root package name */
        final r.a f2918p;

        public C0051g() {
            this.f2905c = new Matrix();
            this.f2911i = 0.0f;
            this.f2912j = 0.0f;
            this.f2913k = 0.0f;
            this.f2914l = 0.0f;
            this.f2915m = 255;
            this.f2916n = null;
            this.f2917o = null;
            this.f2918p = new r.a();
            this.f2910h = new d();
            this.f2903a = new Path();
            this.f2904b = new Path();
        }

        private static float a(float f8, float f9, float f10, float f11) {
            return (f8 * f11) - (f9 * f10);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f2885a.set(matrix);
            dVar2.f2885a.preConcat(dVar2.f2894j);
            canvas.save();
            int i9 = 0;
            while (i9 < dVar2.f2886b.size()) {
                e eVar = (e) dVar2.f2886b.get(i9);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f2885a, canvas, i7, i8, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar2, (f) eVar, canvas, i7, i8, colorFilter);
                }
                i9++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            float f8 = i7 / this.f2913k;
            float f9 = i8 / this.f2914l;
            float min = Math.min(f8, f9);
            Matrix matrix = dVar.f2885a;
            this.f2905c.set(matrix);
            this.f2905c.postScale(f8, f9);
            float e8 = e(matrix);
            if (e8 == 0.0f) {
                return;
            }
            fVar.d(this.f2903a);
            Path path = this.f2903a;
            this.f2904b.reset();
            if (fVar.c()) {
                this.f2904b.setFillType(fVar.f2900c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f2904b.addPath(path, this.f2905c);
                canvas.clipPath(this.f2904b);
                return;
            }
            c cVar = (c) fVar;
            float f10 = cVar.f2879k;
            if (f10 != 0.0f || cVar.f2880l != 1.0f) {
                float f11 = cVar.f2881m;
                float f12 = (f10 + f11) % 1.0f;
                float f13 = (cVar.f2880l + f11) % 1.0f;
                if (this.f2908f == null) {
                    this.f2908f = new PathMeasure();
                }
                this.f2908f.setPath(this.f2903a, false);
                float length = this.f2908f.getLength();
                float f14 = f12 * length;
                float f15 = f13 * length;
                path.reset();
                if (f14 > f15) {
                    this.f2908f.getSegment(f14, length, path, true);
                    this.f2908f.getSegment(0.0f, f15, path, true);
                } else {
                    this.f2908f.getSegment(f14, f15, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f2904b.addPath(path, this.f2905c);
            if (cVar.f2876h.l()) {
                androidx.core.content.res.d dVar2 = cVar.f2876h;
                if (this.f2907e == null) {
                    Paint paint = new Paint(1);
                    this.f2907e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f2907e;
                if (dVar2.h()) {
                    Shader f16 = dVar2.f();
                    f16.setLocalMatrix(this.f2905c);
                    paint2.setShader(f16);
                    paint2.setAlpha(Math.round(cVar.f2878j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(g.a(dVar2.e(), cVar.f2878j));
                }
                paint2.setColorFilter(colorFilter);
                this.f2904b.setFillType(cVar.f2900c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f2904b, paint2);
            }
            if (cVar.f2874f.l()) {
                androidx.core.content.res.d dVar3 = cVar.f2874f;
                if (this.f2906d == null) {
                    Paint paint3 = new Paint(1);
                    this.f2906d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f2906d;
                Paint.Join join = cVar.f2883o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f2882n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f2884p);
                if (dVar3.h()) {
                    Shader f17 = dVar3.f();
                    f17.setLocalMatrix(this.f2905c);
                    paint4.setShader(f17);
                    paint4.setAlpha(Math.round(cVar.f2877i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(g.a(dVar3.e(), cVar.f2877i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f2875g * min * e8);
                canvas.drawPath(this.f2904b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot(fArr[0], fArr[1]);
            float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float a8 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max(hypot, hypot2);
            if (max > 0.0f) {
                return Math.abs(a8) / max;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i7, int i8, ColorFilter colorFilter) {
            c(this.f2910h, f2902q, canvas, i7, i8, colorFilter);
        }

        public boolean f() {
            if (this.f2917o == null) {
                this.f2917o = Boolean.valueOf(this.f2910h.a());
            }
            return this.f2917o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f2910h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f2915m;
        }

        public void setAlpha(float f8) {
            setRootAlpha((int) (f8 * 255.0f));
        }

        public void setRootAlpha(int i7) {
            this.f2915m = i7;
        }

        public C0051g(C0051g c0051g) {
            this.f2905c = new Matrix();
            this.f2911i = 0.0f;
            this.f2912j = 0.0f;
            this.f2913k = 0.0f;
            this.f2914l = 0.0f;
            this.f2915m = 255;
            this.f2916n = null;
            this.f2917o = null;
            r.a aVar = new r.a();
            this.f2918p = aVar;
            this.f2910h = new d(c0051g.f2910h, aVar);
            this.f2903a = new Path(c0051g.f2903a);
            this.f2904b = new Path(c0051g.f2904b);
            this.f2911i = c0051g.f2911i;
            this.f2912j = c0051g.f2912j;
            this.f2913k = c0051g.f2913k;
            this.f2914l = c0051g.f2914l;
            this.f2909g = c0051g.f2909g;
            this.f2915m = c0051g.f2915m;
            this.f2916n = c0051g.f2916n;
            String str = c0051g.f2916n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f2917o = c0051g.f2917o;
        }
    }

    /* compiled from: MyApplication */
    private static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f2885a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList f2886b;

        /* renamed from: c, reason: collision with root package name */
        float f2887c;

        /* renamed from: d, reason: collision with root package name */
        private float f2888d;

        /* renamed from: e, reason: collision with root package name */
        private float f2889e;

        /* renamed from: f, reason: collision with root package name */
        private float f2890f;

        /* renamed from: g, reason: collision with root package name */
        private float f2891g;

        /* renamed from: h, reason: collision with root package name */
        private float f2892h;

        /* renamed from: i, reason: collision with root package name */
        private float f2893i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f2894j;

        /* renamed from: k, reason: collision with root package name */
        int f2895k;

        /* renamed from: l, reason: collision with root package name */
        private int[] f2896l;

        /* renamed from: m, reason: collision with root package name */
        private String f2897m;

        public d(d dVar, r.a aVar) {
            super();
            f bVar;
            this.f2885a = new Matrix();
            this.f2886b = new ArrayList();
            this.f2887c = 0.0f;
            this.f2888d = 0.0f;
            this.f2889e = 0.0f;
            this.f2890f = 1.0f;
            this.f2891g = 1.0f;
            this.f2892h = 0.0f;
            this.f2893i = 0.0f;
            Matrix matrix = new Matrix();
            this.f2894j = matrix;
            this.f2897m = null;
            this.f2887c = dVar.f2887c;
            this.f2888d = dVar.f2888d;
            this.f2889e = dVar.f2889e;
            this.f2890f = dVar.f2890f;
            this.f2891g = dVar.f2891g;
            this.f2892h = dVar.f2892h;
            this.f2893i = dVar.f2893i;
            this.f2896l = dVar.f2896l;
            String str = dVar.f2897m;
            this.f2897m = str;
            this.f2895k = dVar.f2895k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f2894j);
            ArrayList arrayList = dVar.f2886b;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Object obj = arrayList.get(i7);
                if (obj instanceof d) {
                    this.f2886b.add(new d((d) obj, aVar));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f2886b.add(bVar);
                    Object obj2 = bVar.f2899b;
                    if (obj2 != null) {
                        aVar.put(obj2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f2894j.reset();
            this.f2894j.postTranslate(-this.f2888d, -this.f2889e);
            this.f2894j.postScale(this.f2890f, this.f2891g);
            this.f2894j.postRotate(this.f2887c, 0.0f, 0.0f);
            this.f2894j.postTranslate(this.f2892h + this.f2888d, this.f2893i + this.f2889e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f2896l = null;
            this.f2887c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f2887c);
            this.f2888d = typedArray.getFloat(1, this.f2888d);
            this.f2889e = typedArray.getFloat(2, this.f2889e);
            this.f2890f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f2890f);
            this.f2891g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f2891g);
            this.f2892h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f2892h);
            this.f2893i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f2893i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f2897m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean a() {
            for (int i7 = 0; i7 < this.f2886b.size(); i7++) {
                if (((e) this.f2886b.get(i7)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.g.e
        public boolean b(int[] iArr) {
            boolean z7 = false;
            for (int i7 = 0; i7 < this.f2886b.size(); i7++) {
                z7 |= ((e) this.f2886b.get(i7)).b(iArr);
            }
            return z7;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k7 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2837b);
            e(k7, xmlPullParser);
            k7.recycle();
        }

        public String getGroupName() {
            return this.f2897m;
        }

        public Matrix getLocalMatrix() {
            return this.f2894j;
        }

        public float getPivotX() {
            return this.f2888d;
        }

        public float getPivotY() {
            return this.f2889e;
        }

        public float getRotation() {
            return this.f2887c;
        }

        public float getScaleX() {
            return this.f2890f;
        }

        public float getScaleY() {
            return this.f2891g;
        }

        public float getTranslateX() {
            return this.f2892h;
        }

        public float getTranslateY() {
            return this.f2893i;
        }

        public void setPivotX(float f8) {
            if (f8 != this.f2888d) {
                this.f2888d = f8;
                d();
            }
        }

        public void setPivotY(float f8) {
            if (f8 != this.f2889e) {
                this.f2889e = f8;
                d();
            }
        }

        public void setRotation(float f8) {
            if (f8 != this.f2887c) {
                this.f2887c = f8;
                d();
            }
        }

        public void setScaleX(float f8) {
            if (f8 != this.f2890f) {
                this.f2890f = f8;
                d();
            }
        }

        public void setScaleY(float f8) {
            if (f8 != this.f2891g) {
                this.f2891g = f8;
                d();
            }
        }

        public void setTranslateX(float f8) {
            if (f8 != this.f2892h) {
                this.f2892h = f8;
                d();
            }
        }

        public void setTranslateY(float f8) {
            if (f8 != this.f2893i) {
                this.f2893i = f8;
                d();
            }
        }

        public d() {
            super();
            this.f2885a = new Matrix();
            this.f2886b = new ArrayList();
            this.f2887c = 0.0f;
            this.f2888d = 0.0f;
            this.f2889e = 0.0f;
            this.f2890f = 1.0f;
            this.f2891g = 1.0f;
            this.f2892h = 0.0f;
            this.f2893i = 0.0f;
            this.f2894j = new Matrix();
            this.f2897m = null;
        }
    }
}
