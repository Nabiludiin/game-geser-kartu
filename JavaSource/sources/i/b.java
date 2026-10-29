package i;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;

/* compiled from: MyApplication */
abstract class b extends Drawable implements Drawable.Callback {
    private long A;
    private c B;

    /* renamed from: q, reason: collision with root package name */
    private d f24116q;

    /* renamed from: r, reason: collision with root package name */
    private Rect f24117r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable f24118s;

    /* renamed from: t, reason: collision with root package name */
    private Drawable f24119t;

    /* renamed from: v, reason: collision with root package name */
    private boolean f24121v;

    /* renamed from: x, reason: collision with root package name */
    private boolean f24123x;

    /* renamed from: y, reason: collision with root package name */
    private Runnable f24124y;

    /* renamed from: z, reason: collision with root package name */
    private long f24125z;

    /* renamed from: u, reason: collision with root package name */
    private int f24120u = 255;

    /* renamed from: w, reason: collision with root package name */
    private int f24122w = -1;

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: i.b$b, reason: collision with other inner class name */
    private static class C0101b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* compiled from: MyApplication */
    static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a, reason: collision with root package name */
        final b f24128a;

        /* renamed from: b, reason: collision with root package name */
        Resources f24129b;

        /* renamed from: c, reason: collision with root package name */
        int f24130c;

        /* renamed from: d, reason: collision with root package name */
        int f24131d;

        /* renamed from: e, reason: collision with root package name */
        int f24132e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray f24133f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f24134g;

        /* renamed from: h, reason: collision with root package name */
        int f24135h;

        /* renamed from: i, reason: collision with root package name */
        boolean f24136i;

        /* renamed from: j, reason: collision with root package name */
        boolean f24137j;

        /* renamed from: k, reason: collision with root package name */
        Rect f24138k;

        /* renamed from: l, reason: collision with root package name */
        boolean f24139l;

        /* renamed from: m, reason: collision with root package name */
        boolean f24140m;

        /* renamed from: n, reason: collision with root package name */
        int f24141n;

        /* renamed from: o, reason: collision with root package name */
        int f24142o;

        /* renamed from: p, reason: collision with root package name */
        int f24143p;

        /* renamed from: q, reason: collision with root package name */
        int f24144q;

        /* renamed from: r, reason: collision with root package name */
        boolean f24145r;

        /* renamed from: s, reason: collision with root package name */
        int f24146s;

        /* renamed from: t, reason: collision with root package name */
        boolean f24147t;

        /* renamed from: u, reason: collision with root package name */
        boolean f24148u;

        /* renamed from: v, reason: collision with root package name */
        boolean f24149v;

        /* renamed from: w, reason: collision with root package name */
        boolean f24150w;

        /* renamed from: x, reason: collision with root package name */
        boolean f24151x;

        /* renamed from: y, reason: collision with root package name */
        boolean f24152y;

        /* renamed from: z, reason: collision with root package name */
        int f24153z;

        d(d dVar, b bVar, Resources resources) {
            this.f24136i = false;
            this.f24139l = false;
            this.f24151x = true;
            this.A = 0;
            this.B = 0;
            this.f24128a = bVar;
            this.f24129b = resources != null ? resources : dVar != null ? dVar.f24129b : null;
            int f8 = b.f(resources, dVar != null ? dVar.f24130c : 0);
            this.f24130c = f8;
            if (dVar == null) {
                this.f24134g = new Drawable[10];
                this.f24135h = 0;
                return;
            }
            this.f24131d = dVar.f24131d;
            this.f24132e = dVar.f24132e;
            this.f24149v = true;
            this.f24150w = true;
            this.f24136i = dVar.f24136i;
            this.f24139l = dVar.f24139l;
            this.f24151x = dVar.f24151x;
            this.f24152y = dVar.f24152y;
            this.f24153z = dVar.f24153z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f24130c == f8) {
                if (dVar.f24137j) {
                    this.f24138k = dVar.f24138k != null ? new Rect(dVar.f24138k) : null;
                    this.f24137j = true;
                }
                if (dVar.f24140m) {
                    this.f24141n = dVar.f24141n;
                    this.f24142o = dVar.f24142o;
                    this.f24143p = dVar.f24143p;
                    this.f24144q = dVar.f24144q;
                    this.f24140m = true;
                }
            }
            if (dVar.f24145r) {
                this.f24146s = dVar.f24146s;
                this.f24145r = true;
            }
            if (dVar.f24147t) {
                this.f24148u = dVar.f24148u;
                this.f24147t = true;
            }
            Drawable[] drawableArr = dVar.f24134g;
            this.f24134g = new Drawable[drawableArr.length];
            this.f24135h = dVar.f24135h;
            SparseArray sparseArray = dVar.f24133f;
            if (sparseArray != null) {
                this.f24133f = sparseArray.clone();
            } else {
                this.f24133f = new SparseArray(this.f24135h);
            }
            int i7 = this.f24135h;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f24133f.put(i8, constantState);
                    } else {
                        this.f24134g[i8] = drawableArr[i8];
                    }
                }
            }
        }

        private void e() {
            SparseArray sparseArray = this.f24133f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    this.f24134g[this.f24133f.keyAt(i7)] = s(((Drawable.ConstantState) this.f24133f.valueAt(i7)).newDrawable(this.f24129b));
                }
                this.f24133f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            androidx.core.graphics.drawable.a.l(drawable, this.f24153z);
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f24128a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i7 = this.f24135h;
            if (i7 >= this.f24134g.length) {
                o(i7, i7 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f24128a);
            this.f24134g[i7] = drawable;
            this.f24135h++;
            this.f24132e = drawable.getChangingConfigurations() | this.f24132e;
            p();
            this.f24138k = null;
            this.f24137j = false;
            this.f24140m = false;
            this.f24149v = false;
            return i7;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i7 = this.f24135h;
                Drawable[] drawableArr = this.f24134g;
                for (int i8 = 0; i8 < i7; i8++) {
                    Drawable drawable = drawableArr[i8];
                    if (drawable != null && androidx.core.graphics.drawable.a.b(drawable)) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i8], theme);
                        this.f24132e |= drawableArr[i8].getChangingConfigurations();
                    }
                }
                y(C0101b.c(theme));
            }
        }

        public boolean c() {
            if (this.f24149v) {
                return this.f24150w;
            }
            e();
            this.f24149v = true;
            int i7 = this.f24135h;
            Drawable[] drawableArr = this.f24134g;
            for (int i8 = 0; i8 < i7; i8++) {
                if (drawableArr[i8].getConstantState() == null) {
                    this.f24150w = false;
                    return false;
                }
            }
            this.f24150w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i7 = this.f24135h;
            Drawable[] drawableArr = this.f24134g;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f24133f.get(i8);
                    if (constantState != null && C0101b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f24140m = true;
            e();
            int i7 = this.f24135h;
            Drawable[] drawableArr = this.f24134g;
            this.f24142o = -1;
            this.f24141n = -1;
            this.f24144q = 0;
            this.f24143p = 0;
            for (int i8 = 0; i8 < i7; i8++) {
                Drawable drawable = drawableArr[i8];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f24141n) {
                    this.f24141n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f24142o) {
                    this.f24142o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f24143p) {
                    this.f24143p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f24144q) {
                    this.f24144q = minimumHeight;
                }
            }
        }

        final int f() {
            return this.f24134g.length;
        }

        public final Drawable g(int i7) {
            int indexOfKey;
            Drawable drawable = this.f24134g[i7];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f24133f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i7)) < 0) {
                return null;
            }
            Drawable s7 = s(((Drawable.ConstantState) this.f24133f.valueAt(indexOfKey)).newDrawable(this.f24129b));
            this.f24134g[i7] = s7;
            this.f24133f.removeAt(indexOfKey);
            if (this.f24133f.size() == 0) {
                this.f24133f = null;
            }
            return s7;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f24131d | this.f24132e;
        }

        public final int h() {
            return this.f24135h;
        }

        public final int i() {
            if (!this.f24140m) {
                d();
            }
            return this.f24142o;
        }

        public final int j() {
            if (!this.f24140m) {
                d();
            }
            return this.f24144q;
        }

        public final int k() {
            if (!this.f24140m) {
                d();
            }
            return this.f24143p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f24136i) {
                return null;
            }
            Rect rect2 = this.f24138k;
            if (rect2 != null || this.f24137j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i7 = this.f24135h;
            Drawable[] drawableArr = this.f24134g;
            for (int i8 = 0; i8 < i7; i8++) {
                if (drawableArr[i8].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i9 = rect3.left;
                    if (i9 > rect.left) {
                        rect.left = i9;
                    }
                    int i10 = rect3.top;
                    if (i10 > rect.top) {
                        rect.top = i10;
                    }
                    int i11 = rect3.right;
                    if (i11 > rect.right) {
                        rect.right = i11;
                    }
                    int i12 = rect3.bottom;
                    if (i12 > rect.bottom) {
                        rect.bottom = i12;
                    }
                }
            }
            this.f24137j = true;
            this.f24138k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f24140m) {
                d();
            }
            return this.f24141n;
        }

        public final int n() {
            if (this.f24145r) {
                return this.f24146s;
            }
            e();
            int i7 = this.f24135h;
            Drawable[] drawableArr = this.f24134g;
            int opacity = i7 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i8 = 1; i8 < i7; i8++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i8].getOpacity());
            }
            this.f24146s = opacity;
            this.f24145r = true;
            return opacity;
        }

        public void o(int i7, int i8) {
            Drawable[] drawableArr = new Drawable[i8];
            Drawable[] drawableArr2 = this.f24134g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i7);
            }
            this.f24134g = drawableArr;
        }

        void p() {
            this.f24145r = false;
            this.f24147t = false;
        }

        public final boolean q() {
            return this.f24139l;
        }

        abstract void r();

        public final void t(boolean z7) {
            this.f24139l = z7;
        }

        public final void u(int i7) {
            this.A = i7;
        }

        public final void v(int i7) {
            this.B = i7;
        }

        final boolean w(int i7, int i8) {
            int i9 = this.f24135h;
            Drawable[] drawableArr = this.f24134g;
            boolean z7 = false;
            for (int i10 = 0; i10 < i9; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    boolean l7 = androidx.core.graphics.drawable.a.l(drawable, i7);
                    if (i10 == i8) {
                        z7 = l7;
                    }
                }
            }
            this.f24153z = i7;
            return z7;
        }

        public final void x(boolean z7) {
            this.f24136i = z7;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f24129b = resources;
                int f8 = b.f(resources, this.f24130c);
                int i7 = this.f24130c;
                this.f24130c = f8;
                if (i7 != f8) {
                    this.f24140m = false;
                    this.f24137j = false;
                }
            }
        }
    }

    b() {
    }

    private void d(Drawable drawable) {
        if (this.B == null) {
            this.B = new c();
        }
        drawable.setCallback(this.B.b(drawable.getCallback()));
        try {
            if (this.f24116q.A <= 0 && this.f24121v) {
                drawable.setAlpha(this.f24120u);
            }
            d dVar = this.f24116q;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.n(drawable, dVar.F);
                }
                d dVar2 = this.f24116q;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f24116q.f24151x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            androidx.core.graphics.drawable.a.l(drawable, androidx.core.graphics.drawable.a.e(this));
            androidx.core.graphics.drawable.a.i(drawable, this.f24116q.C);
            Rect rect = this.f24117r;
            if (rect != null) {
                androidx.core.graphics.drawable.a.k(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.B.a());
        } catch (Throwable th) {
            drawable.setCallback(this.B.a());
            throw th;
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.e(this) == 1;
    }

    static int f(Resources resources, int i7) {
        if (resources != null) {
            i7 = resources.getDisplayMetrics().densityDpi;
        }
        if (i7 == 0) {
            return 160;
        }
        return i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f24121v = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f24118s
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f24125z
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f24120u
            r3.setAlpha(r9)
            r13.f24125z = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            i.b$d r10 = r13.f24116q
            int r10 = r10.A
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f24120u
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f24125z = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f24119t
            if (r9 == 0) goto L61
            long r10 = r13.A
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f24119t = r0
            r13.A = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            i.b$d r4 = r13.f24116q
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f24120u
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.A = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f24124y
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f24116q.b(theme);
    }

    abstract d b();

    int c() {
        return this.f24122w;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f24116q.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f24118s;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f24119t;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f24122w
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            i.b$d r0 = r9.f24116q
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f24119t
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f24118s
            if (r0 == 0) goto L29
            r9.f24119t = r0
            i.b$d r0 = r9.f24116q
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.A = r0
            goto L35
        L29:
            r9.f24119t = r4
            r9.A = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f24118s
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            i.b$d r0 = r9.f24116q
            int r1 = r0.f24135h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f24118s = r0
            r9.f24122w = r10
            if (r0 == 0) goto L5a
            i.b$d r10 = r9.f24116q
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f24125z = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f24118s = r4
            r10 = -1
            r9.f24122w = r10
        L5a:
            long r0 = r9.f24125z
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.A
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L79
        L67:
            java.lang.Runnable r10 = r9.f24124y
            if (r10 != 0) goto L73
            i.b$a r10 = new i.b$a
            r10.<init>()
            r9.f24124y = r10
            goto L76
        L73:
            r9.unscheduleSelf(r10)
        L76:
            r9.a(r0)
        L79:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24120u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f24116q.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f24116q.c()) {
            return null;
        }
        this.f24116q.f24131d = getChangingConfigurations();
        return this.f24116q;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f24118s;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f24117r;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f24116q.q()) {
            return this.f24116q.i();
        }
        Drawable drawable = this.f24118s;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f24116q.q()) {
            return this.f24116q.m();
        }
        Drawable drawable = this.f24118s;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f24116q.q()) {
            return this.f24116q.j();
        }
        Drawable drawable = this.f24118s;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f24116q.q()) {
            return this.f24116q.k();
        }
        Drawable drawable = this.f24118s;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f24118s;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f24116q.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f24118s;
        if (drawable != null) {
            C0101b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l7 = this.f24116q.l();
        if (l7 != null) {
            rect.set(l7);
            padding = (l7.right | ((l7.left | l7.top) | l7.bottom)) != 0;
        } else {
            Drawable drawable = this.f24118s;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i7 = rect.left;
            rect.left = rect.right;
            rect.right = i7;
        }
        return padding;
    }

    void h(d dVar) {
        this.f24116q = dVar;
        int i7 = this.f24122w;
        if (i7 >= 0) {
            Drawable g8 = dVar.g(i7);
            this.f24118s = g8;
            if (g8 != null) {
                d(g8);
            }
        }
        this.f24119t = null;
    }

    final void i(Resources resources) {
        this.f24116q.y(resources);
    }

    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f24116q;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f24118s || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f24116q.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z7;
        Drawable drawable = this.f24119t;
        boolean z8 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f24119t = null;
            z7 = true;
        } else {
            z7 = false;
        }
        Drawable drawable2 = this.f24118s;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f24121v) {
                this.f24118s.setAlpha(this.f24120u);
            }
        }
        if (this.A != 0) {
            this.A = 0L;
            z7 = true;
        }
        if (this.f24125z != 0) {
            this.f24125z = 0L;
        } else {
            z8 = z7;
        }
        if (z8) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f24123x && super.mutate() == this) {
            d b8 = b();
            b8.r();
            h(b8);
            this.f24123x = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f24119t;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f24118s;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i7) {
        return this.f24116q.w(i7, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i7) {
        Drawable drawable = this.f24119t;
        if (drawable != null) {
            return drawable.setLevel(i7);
        }
        Drawable drawable2 = this.f24118s;
        if (drawable2 != null) {
            return drawable2.setLevel(i7);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
        if (drawable != this.f24118s || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i7) {
        if (this.f24121v && this.f24120u == i7) {
            return;
        }
        this.f24121v = true;
        this.f24120u = i7;
        Drawable drawable = this.f24118s;
        if (drawable != null) {
            if (this.f24125z == 0) {
                drawable.setAlpha(i7);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z7) {
        d dVar = this.f24116q;
        if (dVar.C != z7) {
            dVar.C = z7;
            Drawable drawable = this.f24118s;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.i(drawable, z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f24116q;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f24118s;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z7) {
        d dVar = this.f24116q;
        if (dVar.f24151x != z7) {
            dVar.f24151x = z7;
            Drawable drawable = this.f24118s;
            if (drawable != null) {
                drawable.setDither(z7);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f8, float f9) {
        Drawable drawable = this.f24118s;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, f8, f9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i7, int i8, int i9, int i10) {
        Rect rect = this.f24117r;
        if (rect == null) {
            this.f24117r = new Rect(i7, i8, i9, i10);
        } else {
            rect.set(i7, i8, i9, i10);
        }
        Drawable drawable = this.f24118s;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, i7, i8, i9, i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f24116q;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.n(this.f24118s, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f24116q;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.o(this.f24118s, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z7, boolean z8) {
        boolean visible = super.setVisible(z7, z8);
        Drawable drawable = this.f24119t;
        if (drawable != null) {
            drawable.setVisible(z7, z8);
        }
        Drawable drawable2 = this.f24118s;
        if (drawable2 != null) {
            drawable2.setVisible(z7, z8);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f24118s || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }

    /* compiled from: MyApplication */
    static class c implements Drawable.Callback {

        /* renamed from: q, reason: collision with root package name */
        private Drawable.Callback f24127q;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f24127q;
            this.f24127q = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f24127q = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j7) {
            Drawable.Callback callback = this.f24127q;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j7);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f24127q;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }
    }
}
