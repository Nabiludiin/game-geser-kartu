package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.core.content.res.k;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: MyApplication */
public class b extends f implements Animatable {

    /* renamed from: r, reason: collision with root package name */
    private C0050b f2848r;

    /* renamed from: s, reason: collision with root package name */
    private Context f2849s;

    /* renamed from: t, reason: collision with root package name */
    private ArgbEvaluator f2850t;

    /* renamed from: u, reason: collision with root package name */
    private Animator.AnimatorListener f2851u;

    /* renamed from: v, reason: collision with root package name */
    ArrayList f2852v;

    /* renamed from: w, reason: collision with root package name */
    final Drawable.Callback f2853w;

    /* compiled from: MyApplication */
    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            b.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
            b.this.scheduleSelf(runnable, j7);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            b.this.unscheduleSelf(runnable);
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: androidx.vectordrawable.graphics.drawable.b$b, reason: collision with other inner class name */
    private static class C0050b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f2855a;

        /* renamed from: b, reason: collision with root package name */
        g f2856b;

        /* renamed from: c, reason: collision with root package name */
        AnimatorSet f2857c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList f2858d;

        /* renamed from: e, reason: collision with root package name */
        r.a f2859e;

        public C0050b(Context context, C0050b c0050b, Drawable.Callback callback, Resources resources) {
            if (c0050b != null) {
                this.f2855a = c0050b.f2855a;
                g gVar = c0050b.f2856b;
                if (gVar != null) {
                    Drawable.ConstantState constantState = gVar.getConstantState();
                    if (resources != null) {
                        this.f2856b = (g) constantState.newDrawable(resources);
                    } else {
                        this.f2856b = (g) constantState.newDrawable();
                    }
                    g gVar2 = (g) this.f2856b.mutate();
                    this.f2856b = gVar2;
                    gVar2.setCallback(callback);
                    this.f2856b.setBounds(c0050b.f2856b.getBounds());
                    this.f2856b.h(false);
                }
                ArrayList arrayList = c0050b.f2858d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f2858d = new ArrayList(size);
                    this.f2859e = new r.a(size);
                    for (int i7 = 0; i7 < size; i7++) {
                        Animator animator = (Animator) c0050b.f2858d.get(i7);
                        Animator clone = animator.clone();
                        String str = (String) c0050b.f2859e.get(animator);
                        clone.setTarget(this.f2856b.d(str));
                        this.f2858d.add(clone);
                        this.f2859e.put(clone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f2857c == null) {
                this.f2857c = new AnimatorSet();
            }
            this.f2857c.playTogether(this.f2858d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2855a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    b() {
        this(null, null, null);
    }

    public static b a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar = new b(context);
        bVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return bVar;
    }

    private void b(String str, Animator animator) {
        animator.setTarget(this.f2848r.f2856b.d(str));
        C0050b c0050b = this.f2848r;
        if (c0050b.f2858d == null) {
            c0050b.f2858d = new ArrayList();
            this.f2848r.f2859e = new r.a();
        }
        this.f2848r.f2858d.add(animator);
        this.f2848r.f2859e.put(animator, str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f2848r.f2856b.draw(canvas);
        if (this.f2848r.f2857c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f2863q;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f2848r.f2856b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f2863q;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f2848r.f2855a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f2863q;
        return drawable != null ? androidx.core.graphics.drawable.a.d(drawable) : this.f2848r.f2856b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f2863q == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new c(this.f2863q.getConstantState());
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f2863q;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f2848r.f2856b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f2863q;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f2848r.f2856b.getIntrinsicWidth();
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
        return drawable != null ? drawable.getOpacity() : this.f2848r.f2856b.getOpacity();
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

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.f(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray k7 = k.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f2840e);
                    int resourceId = k7.getResourceId(0, 0);
                    if (resourceId != 0) {
                        g b8 = g.b(resources, resourceId, theme);
                        b8.h(false);
                        b8.setCallback(this.f2853w);
                        g gVar = this.f2848r.f2856b;
                        if (gVar != null) {
                            gVar.setCallback(null);
                        }
                        this.f2848r.f2856b = b8;
                    }
                    k7.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f2841f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2849s;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        b(string, d.i(context, resourceId2));
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f2848r.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f2863q;
        return drawable != null ? androidx.core.graphics.drawable.a.g(drawable) : this.f2848r.f2856b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f2863q;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f2848r.f2857c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f2863q;
        return drawable != null ? drawable.isStateful() : this.f2848r.f2856b.isStateful();
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
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2848r.f2856b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.f, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i7) {
        Drawable drawable = this.f2863q;
        return drawable != null ? drawable.setLevel(i7) : this.f2848r.f2856b.setLevel(i7);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f2863q;
        return drawable != null ? drawable.setState(iArr) : this.f2848r.f2856b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.setAlpha(i7);
        } else {
            this.f2848r.f2856b.setAlpha(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, z7);
        } else {
            this.f2848r.f2856b.setAutoMirrored(z7);
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
            this.f2848r.f2856b.setTint(i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.n(drawable, colorStateList);
        } else {
            this.f2848r.f2856b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, mode);
        } else {
            this.f2848r.f2856b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            return drawable.setVisible(z7, z8);
        }
        this.f2848r.f2856b.setVisible(z7, z8);
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f2848r.f2857c.isStarted()) {
                return;
            }
            this.f2848r.f2857c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2848r.f2857c.end();
        }
    }

    private b(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f2863q;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2848r.f2856b.setColorFilter(colorFilter);
        }
    }

    /* compiled from: MyApplication */
    private static class c extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f2860a;

        public c(Drawable.ConstantState constantState) {
            this.f2860a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f2860a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f2860a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            b bVar = new b();
            Drawable newDrawable = this.f2860a.newDrawable();
            bVar.f2863q = newDrawable;
            newDrawable.setCallback(bVar.f2853w);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            b bVar = new b();
            Drawable newDrawable = this.f2860a.newDrawable(resources);
            bVar.f2863q = newDrawable;
            newDrawable.setCallback(bVar.f2853w);
            return bVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            b bVar = new b();
            Drawable newDrawable = this.f2860a.newDrawable(resources, theme);
            bVar.f2863q = newDrawable;
            newDrawable.setCallback(bVar.f2853w);
            return bVar;
        }
    }

    private b(Context context, C0050b c0050b, Resources resources) {
        this.f2850t = null;
        this.f2851u = null;
        this.f2852v = null;
        a aVar = new a();
        this.f2853w = aVar;
        this.f2849s = context;
        if (c0050b != null) {
            this.f2848r = c0050b;
        } else {
            this.f2848r = new C0050b(context, c0050b, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
