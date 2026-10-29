package i;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.g1;
import androidx.core.content.res.k;
import i.b;
import i.d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r.i;

/* compiled from: MyApplication */
public class a extends i.d {
    private c E;
    private g F;
    private int G;
    private int H;
    private boolean I;

    /* compiled from: MyApplication */
    private static class b extends g {

        /* renamed from: a, reason: collision with root package name */
        private final Animatable f24109a;

        b(Animatable animatable) {
            super();
            this.f24109a = animatable;
        }

        @Override // i.a.g
        public void c() {
            this.f24109a.start();
        }

        @Override // i.a.g
        public void d() {
            this.f24109a.stop();
        }
    }

    /* compiled from: MyApplication */
    static class c extends d.a {
        r.e K;
        i L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
            } else {
                this.K = new r.e();
                this.L = new i();
            }
        }

        private static long D(int i7, int i8) {
            return i8 | (i7 << 32);
        }

        int B(int[] iArr, Drawable drawable, int i7) {
            int z7 = super.z(iArr, drawable);
            this.L.m(z7, Integer.valueOf(i7));
            return z7;
        }

        int C(int i7, int i8, Drawable drawable, boolean z7) {
            int a8 = super.a(drawable);
            long D = D(i7, i8);
            long j7 = z7 ? 8589934592L : 0L;
            long j8 = a8;
            this.K.a(D, Long.valueOf(j8 | j7));
            if (z7) {
                this.K.a(D(i8, i7), Long.valueOf(4294967296L | j8 | j7));
            }
            return a8;
        }

        int E(int i7) {
            if (i7 < 0) {
                return 0;
            }
            return ((Integer) this.L.k(i7, 0)).intValue();
        }

        int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        int G(int i7, int i8) {
            return (int) ((Long) this.K.k(D(i7, i8), -1L)).longValue();
        }

        boolean H(int i7, int i8) {
            return (((Long) this.K.k(D(i7, i8), -1L)).longValue() & 4294967296L) != 0;
        }

        boolean I(int i7, int i8) {
            return (((Long) this.K.k(D(i7, i8), -1L)).longValue() & 8589934592L) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // i.d.a, i.b.d
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* compiled from: MyApplication */
    private static class d extends g {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.b f24110a;

        d(androidx.vectordrawable.graphics.drawable.b bVar) {
            super();
            this.f24110a = bVar;
        }

        @Override // i.a.g
        public void c() {
            this.f24110a.start();
        }

        @Override // i.a.g
        public void d() {
            this.f24110a.stop();
        }
    }

    /* compiled from: MyApplication */
    private static class e extends g {

        /* renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f24111a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f24112b;

        e(AnimationDrawable animationDrawable, boolean z7, boolean z8) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i7 = z7 ? numberOfFrames - 1 : 0;
            int i8 = z7 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z7);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i7, i8);
            j.b.a(ofInt, true);
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f24112b = z8;
            this.f24111a = ofInt;
        }

        @Override // i.a.g
        public boolean a() {
            return this.f24112b;
        }

        @Override // i.a.g
        public void b() {
            this.f24111a.reverse();
        }

        @Override // i.a.g
        public void c() {
            this.f24111a.start();
        }

        @Override // i.a.g
        public void d() {
            this.f24111a.cancel();
        }
    }

    /* compiled from: MyApplication */
    private static class f implements TimeInterpolator {

        /* renamed from: a, reason: collision with root package name */
        private int[] f24113a;

        /* renamed from: b, reason: collision with root package name */
        private int f24114b;

        /* renamed from: c, reason: collision with root package name */
        private int f24115c;

        f(AnimationDrawable animationDrawable, boolean z7) {
            b(animationDrawable, z7);
        }

        int a() {
            return this.f24115c;
        }

        int b(AnimationDrawable animationDrawable, boolean z7) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f24114b = numberOfFrames;
            int[] iArr = this.f24113a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f24113a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f24113a;
            int i7 = 0;
            for (int i8 = 0; i8 < numberOfFrames; i8++) {
                int duration = animationDrawable.getDuration(z7 ? (numberOfFrames - i8) - 1 : i8);
                iArr2[i8] = duration;
                i7 += duration;
            }
            this.f24115c = i7;
            return i7;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f8) {
            int i7 = (int) ((f8 * this.f24115c) + 0.5f);
            int i8 = this.f24114b;
            int[] iArr = this.f24113a;
            int i9 = 0;
            while (i9 < i8) {
                int i10 = iArr[i9];
                if (i7 < i10) {
                    break;
                }
                i7 -= i10;
                i9++;
            }
            return (i9 / i8) + (i9 < i8 ? i7 / this.f24115c : 0.0f);
        }
    }

    public a() {
        this(null, null);
    }

    public static a l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.m(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void o() {
        onStateChange(getState());
    }

    private int p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k7 = k.k(resources, theme, attributeSet, j.e.f24198h);
        int resourceId = k7.getResourceId(j.e.f24199i, 0);
        int resourceId2 = k7.getResourceId(j.e.f24200j, -1);
        Drawable j7 = resourceId2 > 0 ? g1.h().j(context, resourceId2) : null;
        k7.recycle();
        int[] j8 = j(attributeSet);
        if (j7 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j7 = xmlPullParser.getName().equals("vector") ? androidx.vectordrawable.graphics.drawable.g.c(resources, xmlPullParser, attributeSet, theme) : j.c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (j7 != null) {
            return this.E.B(j8, j7, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k7 = k.k(resources, theme, attributeSet, j.e.f24201k);
        int resourceId = k7.getResourceId(j.e.f24204n, -1);
        int resourceId2 = k7.getResourceId(j.e.f24203m, -1);
        int resourceId3 = k7.getResourceId(j.e.f24202l, -1);
        Drawable j7 = resourceId3 > 0 ? g1.h().j(context, resourceId3) : null;
        boolean z7 = k7.getBoolean(j.e.f24205o, false);
        k7.recycle();
        if (j7 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            j7 = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.b.a(context, resources, xmlPullParser, attributeSet, theme) : j.c.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (j7 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.E.C(resourceId, resourceId2, j7, z7);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private boolean r(int i7) {
        int c8;
        int G;
        g bVar;
        g gVar = this.F;
        if (gVar == null) {
            c8 = c();
        } else {
            if (i7 == this.G) {
                return true;
            }
            if (i7 == this.H && gVar.a()) {
                gVar.b();
                this.G = this.H;
                this.H = i7;
                return true;
            }
            c8 = this.G;
            gVar.d();
        }
        this.F = null;
        this.H = -1;
        this.G = -1;
        c cVar = this.E;
        int E = cVar.E(c8);
        int E2 = cVar.E(i7);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.b)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.b) current);
        }
        bVar.c();
        this.F = bVar;
        this.H = c8;
        this.G = i7;
        return true;
    }

    private void s(TypedArray typedArray) {
        c cVar = this.E;
        cVar.f24131d |= j.c.b(typedArray);
        cVar.x(typedArray.getBoolean(j.e.f24194d, cVar.f24136i));
        cVar.t(typedArray.getBoolean(j.e.f24195e, cVar.f24139l));
        cVar.u(typedArray.getInt(j.e.f24196f, cVar.A));
        cVar.v(typedArray.getInt(j.e.f24197g, cVar.B));
        setDither(typedArray.getBoolean(j.e.f24192b, cVar.f24151x));
    }

    @Override // i.d, i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getHotspotBounds(Rect rect) {
        super.getHotspotBounds(rect);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void getOutline(Outline outline) {
        super.getOutline(outline);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // i.d, i.b
    void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.E = (c) dVar;
        }
    }

    @Override // i.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.F;
        if (gVar != null) {
            gVar.d();
            this.F = null;
            g(this.G);
            this.G = -1;
            this.H = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i.b
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.E, this, null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k7 = k.k(resources, theme, attributeSet, j.e.f24191a);
        setVisible(k7.getBoolean(j.e.f24193c, true), true);
        s(k7);
        i(resources);
        k7.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    @Override // i.d, i.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.I && super.mutate() == this) {
            this.E.r();
            this.I = true;
        }
        return this;
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean onLayoutDirectionChanged(int i7) {
        return super.onLayoutDirectionChanged(i7);
    }

    @Override // i.d, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int F = this.E.F(iArr);
        boolean z7 = F != c() && (r(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? current.setState(iArr) | z7 : z7;
    }

    @Override // i.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        super.scheduleDrawable(drawable, runnable, j7);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(int i7) {
        super.setAlpha(i7);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z7) {
        super.setAutoMirrored(z7);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setDither(boolean z7) {
        super.setDither(z7);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f8, float f9) {
        super.setHotspot(f8, f9);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i7, int i8, int i9, int i10) {
        super.setHotspotBounds(i7, i8, i9, i10);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintList(ColorStateList colorStateList) {
        super.setTintList(colorStateList);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setTintMode(PorterDuff.Mode mode) {
        super.setTintMode(mode);
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        g gVar = this.F;
        if (gVar != null && (visible || z8)) {
            if (z7) {
                gVar.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    @Override // i.b, android.graphics.drawable.Drawable.Callback
    public /* bridge */ /* synthetic */ void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        super.unscheduleDrawable(drawable, runnable);
    }

    a(c cVar, Resources resources) {
        super(null);
        this.G = -1;
        this.H = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* compiled from: MyApplication */
    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public abstract void c();

        public abstract void d();

        public void b() {
        }
    }
}
