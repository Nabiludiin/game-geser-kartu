package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.e0;

/* compiled from: MyApplication */
public abstract class a implements View.OnTouchListener {
    private static final int H = ViewConfiguration.getTapTimeout();
    private boolean B;
    boolean C;
    boolean D;
    boolean E;
    private boolean F;
    private boolean G;

    /* renamed from: s, reason: collision with root package name */
    final View f1966s;

    /* renamed from: t, reason: collision with root package name */
    private Runnable f1967t;

    /* renamed from: w, reason: collision with root package name */
    private int f1970w;

    /* renamed from: x, reason: collision with root package name */
    private int f1971x;

    /* renamed from: q, reason: collision with root package name */
    final C0033a f1964q = new C0033a();

    /* renamed from: r, reason: collision with root package name */
    private final Interpolator f1965r = new AccelerateInterpolator();

    /* renamed from: u, reason: collision with root package name */
    private float[] f1968u = {0.0f, 0.0f};

    /* renamed from: v, reason: collision with root package name */
    private float[] f1969v = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: y, reason: collision with root package name */
    private float[] f1972y = {0.0f, 0.0f};

    /* renamed from: z, reason: collision with root package name */
    private float[] f1973z = {0.0f, 0.0f};
    private float[] A = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* compiled from: MyApplication */
    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0033a {

        /* renamed from: a, reason: collision with root package name */
        private int f1974a;

        /* renamed from: b, reason: collision with root package name */
        private int f1975b;

        /* renamed from: c, reason: collision with root package name */
        private float f1976c;

        /* renamed from: d, reason: collision with root package name */
        private float f1977d;

        /* renamed from: j, reason: collision with root package name */
        private float f1983j;

        /* renamed from: k, reason: collision with root package name */
        private int f1984k;

        /* renamed from: e, reason: collision with root package name */
        private long f1978e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f1982i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f1979f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f1980g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f1981h = 0;

        C0033a() {
        }

        private float e(long j7) {
            if (j7 < this.f1978e) {
                return 0.0f;
            }
            long j8 = this.f1982i;
            if (j8 < 0 || j7 < j8) {
                return a.e((j7 - r0) / this.f1974a, 0.0f, 1.0f) * 0.5f;
            }
            float f8 = this.f1983j;
            return (1.0f - f8) + (f8 * a.e((j7 - j8) / this.f1984k, 0.0f, 1.0f));
        }

        private float g(float f8) {
            return ((-4.0f) * f8 * f8) + (f8 * 4.0f);
        }

        public void a() {
            if (this.f1979f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g8 = g(e(currentAnimationTimeMillis));
            long j7 = currentAnimationTimeMillis - this.f1979f;
            this.f1979f = currentAnimationTimeMillis;
            float f8 = j7 * g8;
            this.f1980g = (int) (this.f1976c * f8);
            this.f1981h = (int) (f8 * this.f1977d);
        }

        public int b() {
            return this.f1980g;
        }

        public int c() {
            return this.f1981h;
        }

        public int d() {
            float f8 = this.f1976c;
            return (int) (f8 / Math.abs(f8));
        }

        public int f() {
            float f8 = this.f1977d;
            return (int) (f8 / Math.abs(f8));
        }

        public boolean h() {
            return this.f1982i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1982i + ((long) this.f1984k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1984k = a.f((int) (currentAnimationTimeMillis - this.f1978e), 0, this.f1975b);
            this.f1983j = e(currentAnimationTimeMillis);
            this.f1982i = currentAnimationTimeMillis;
        }

        public void j(int i7) {
            this.f1975b = i7;
        }

        public void k(int i7) {
            this.f1974a = i7;
        }

        public void l(float f8, float f9) {
            this.f1976c = f8;
            this.f1977d = f9;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1978e = currentAnimationTimeMillis;
            this.f1982i = -1L;
            this.f1979f = currentAnimationTimeMillis;
            this.f1983j = 0.5f;
            this.f1980g = 0;
            this.f1981h = 0;
        }
    }

    /* compiled from: MyApplication */
    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.E) {
                if (aVar.C) {
                    aVar.C = false;
                    aVar.f1964q.m();
                }
                C0033a c0033a = a.this.f1964q;
                if (c0033a.h() || !a.this.C()) {
                    a.this.E = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.D) {
                    aVar2.D = false;
                    aVar2.c();
                }
                c0033a.a();
                a.this.p(c0033a.b(), c0033a.c());
                e0.I(a.this.f1966s, this);
            }
        }
    }

    public a(View view) {
        this.f1966s = view;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = (int) ((1575.0f * f8) + 0.5f);
        w(f9, f9);
        float f10 = (int) ((f8 * 315.0f) + 0.5f);
        x(f10, f10);
        t(1);
        v(Float.MAX_VALUE, Float.MAX_VALUE);
        A(0.2f, 0.2f);
        B(1.0f, 1.0f);
        r(H);
        z(500);
        y(500);
    }

    private void D() {
        int i7;
        if (this.f1967t == null) {
            this.f1967t = new b();
        }
        this.E = true;
        this.C = true;
        if (this.B || (i7 = this.f1971x) <= 0) {
            this.f1967t.run();
        } else {
            e0.J(this.f1966s, this.f1967t, i7);
        }
        this.B = true;
    }

    private float d(int i7, float f8, float f9, float f10) {
        float j7 = j(this.f1968u[i7], f9, this.f1969v[i7], f8);
        if (j7 == 0.0f) {
            return 0.0f;
        }
        float f11 = this.f1972y[i7];
        float f12 = this.f1973z[i7];
        float f13 = this.A[i7];
        float f14 = f11 * f10;
        return j7 > 0.0f ? e(j7 * f14, f12, f13) : -e((-j7) * f14, f12, f13);
    }

    static float e(float f8, float f9, float f10) {
        return f8 > f10 ? f10 : f8 < f9 ? f9 : f8;
    }

    static int f(int i7, int i8, int i9) {
        return i7 > i9 ? i9 : i7 < i8 ? i8 : i7;
    }

    private float h(float f8, float f9) {
        if (f9 == 0.0f) {
            return 0.0f;
        }
        int i7 = this.f1970w;
        if (i7 == 0 || i7 == 1) {
            if (f8 < f9) {
                if (f8 >= 0.0f) {
                    return 1.0f - (f8 / f9);
                }
                if (this.E && i7 == 1) {
                    return 1.0f;
                }
            }
        } else if (i7 == 2 && f8 < 0.0f) {
            return f8 / (-f9);
        }
        return 0.0f;
    }

    private float j(float f8, float f9, float f10, float f11) {
        float interpolation;
        float e8 = e(f8 * f9, 0.0f, f10);
        float h8 = h(f9 - f11, e8) - h(f11, e8);
        if (h8 < 0.0f) {
            interpolation = -this.f1965r.getInterpolation(-h8);
        } else {
            if (h8 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1965r.getInterpolation(h8);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void n() {
        if (this.C) {
            this.E = false;
        } else {
            this.f1964q.i();
        }
    }

    public a A(float f8, float f9) {
        float[] fArr = this.f1968u;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    public a B(float f8, float f9) {
        float[] fArr = this.f1972y;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    boolean C() {
        C0033a c0033a = this.f1964q;
        int f8 = c0033a.f();
        int d8 = c0033a.d();
        if (f8 == 0 || !b(f8)) {
            return d8 != 0 && a(d8);
        }
        return true;
    }

    public abstract boolean a(int i7);

    public abstract boolean b(int i7);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1966s.onTouchEvent(obtain);
        obtain.recycle();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.F
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.n()
            goto L58
        L1a:
            r5.D = r2
            r5.B = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1966s
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1966s
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f1964q
            r7.l(r0, r6)
            boolean r6 = r5.E
            if (r6 != 0) goto L58
            boolean r6 = r5.C()
            if (r6 == 0) goto L58
            r5.D()
        L58:
            boolean r6 = r5.G
            if (r6 == 0) goto L61
            boolean r6 = r5.E
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract void p(int i7, int i8);

    public a r(int i7) {
        this.f1971x = i7;
        return this;
    }

    public a t(int i7) {
        this.f1970w = i7;
        return this;
    }

    public a u(boolean z7) {
        if (this.F && !z7) {
            n();
        }
        this.F = z7;
        return this;
    }

    public a v(float f8, float f9) {
        float[] fArr = this.f1969v;
        fArr[0] = f8;
        fArr[1] = f9;
        return this;
    }

    public a w(float f8, float f9) {
        float[] fArr = this.A;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    public a x(float f8, float f9) {
        float[] fArr = this.f1973z;
        fArr[0] = f8 / 1000.0f;
        fArr[1] = f9 / 1000.0f;
        return this;
    }

    public a y(int i7) {
        this.f1964q.j(i7);
        return this;
    }

    public a z(int i7) {
        this.f1964q.k(i7);
        return this;
    }
}
