package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.g1;

/* compiled from: MyApplication */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    private static final PorterDuff.Mode f759b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    private static k f760c;

    /* renamed from: a, reason: collision with root package name */
    private g1 f761a;

    /* compiled from: MyApplication */
    class a implements g1.f {

        /* renamed from: a, reason: collision with root package name */
        private final int[] f762a = {f.e.R, f.e.P, f.e.f23356a};

        /* renamed from: b, reason: collision with root package name */
        private final int[] f763b = {f.e.f23370o, f.e.B, f.e.f23375t, f.e.f23371p, f.e.f23372q, f.e.f23374s, f.e.f23373r};

        /* renamed from: c, reason: collision with root package name */
        private final int[] f764c = {f.e.O, f.e.Q, f.e.f23366k, f.e.K, f.e.L, f.e.M, f.e.N};

        /* renamed from: d, reason: collision with root package name */
        private final int[] f765d = {f.e.f23378w, f.e.f23364i, f.e.f23377v};

        /* renamed from: e, reason: collision with root package name */
        private final int[] f766e = {f.e.J, f.e.S};

        /* renamed from: f, reason: collision with root package name */
        private final int[] f767f = {f.e.f23358c, f.e.f23362g, f.e.f23359d, f.e.f23363h};

        a() {
        }

        private boolean f(int[] iArr, int i7) {
            for (int i8 : iArr) {
                if (i8 == i7) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i7) {
            int c8 = n1.c(context, f.a.f23327t);
            return new ColorStateList(new int[][]{n1.f810b, n1.f813e, n1.f811c, n1.f817i}, new int[]{n1.b(context, f.a.f23325r), androidx.core.graphics.a.c(c8, i7), androidx.core.graphics.a.c(c8, i7), i7});
        }

        private ColorStateList i(Context context) {
            return h(context, n1.c(context, f.a.f23324q));
        }

        private ColorStateList j(Context context) {
            return h(context, n1.c(context, f.a.f23325r));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i7 = f.a.f23329v;
            ColorStateList e8 = n1.e(context, i7);
            if (e8 == null || !e8.isStateful()) {
                iArr[0] = n1.f810b;
                iArr2[0] = n1.b(context, i7);
                iArr[1] = n1.f814f;
                iArr2[1] = n1.c(context, f.a.f23326s);
                iArr[2] = n1.f817i;
                iArr2[2] = n1.c(context, i7);
            } else {
                int[] iArr3 = n1.f810b;
                iArr[0] = iArr3;
                iArr2[0] = e8.getColorForState(iArr3, 0);
                iArr[1] = n1.f814f;
                iArr2[1] = n1.c(context, f.a.f23326s);
                iArr[2] = n1.f817i;
                iArr2[2] = e8.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(g1 g1Var, Context context, int i7) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i7);
            Drawable j7 = g1Var.j(context, f.e.F);
            Drawable j8 = g1Var.j(context, f.e.G);
            if ((j7 instanceof BitmapDrawable) && j7.getIntrinsicWidth() == dimensionPixelSize && j7.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) j7;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                j7.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j7.draw(canvas);
                bitmapDrawable = new BitmapDrawable(createBitmap);
                bitmapDrawable2 = new BitmapDrawable(createBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((j8 instanceof BitmapDrawable) && j8.getIntrinsicWidth() == dimensionPixelSize && j8.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) j8;
            } else {
                Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap2);
                j8.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                j8.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(createBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i7, PorterDuff.Mode mode) {
            if (u0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = k.f759b;
            }
            drawable.setColorFilter(k.e(i7, mode));
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x006b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0050  */
        @Override // androidx.appcompat.widget.g1.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.k.a()
                int[] r1 = r6.f762a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = f.a.f23328u
            L11:
                r1 = r0
                r5 = r2
            L13:
                r0 = r4
                goto L4e
            L15:
                int[] r1 = r6.f764c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = f.a.f23326s
                goto L11
            L20:
                int[] r1 = r6.f765d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r0 = r4
                r8 = r5
            L30:
                r5 = r2
                goto L4e
            L32:
                int r1 = f.e.f23376u
                if (r8 != r1) goto L45
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r5 = r0
                r0 = r8
                r8 = r1
                r1 = r5
                goto L30
            L45:
                int r1 = f.e.f23367l
                if (r8 != r1) goto L4a
                goto L2d
            L4a:
                r1 = r0
                r8 = r3
                r5 = r8
                goto L13
            L4e:
                if (r5 == 0) goto L6b
                boolean r3 = androidx.appcompat.widget.u0.a(r9)
                if (r3 == 0) goto L5a
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L5a:
                int r7 = androidx.appcompat.widget.n1.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.k.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L6a
                r9.setAlpha(r0)
            L6a:
                return r2
            L6b:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.k.a.a(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // androidx.appcompat.widget.g1.f
        public PorterDuff.Mode b(int i7) {
            if (i7 == f.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.g1.f
        public Drawable c(g1 g1Var, Context context, int i7) {
            if (i7 == f.e.f23365j) {
                return new LayerDrawable(new Drawable[]{g1Var.j(context, f.e.f23364i), g1Var.j(context, f.e.f23366k)});
            }
            if (i7 == f.e.f23380y) {
                return l(g1Var, context, f.d.f23349g);
            }
            if (i7 == f.e.f23379x) {
                return l(g1Var, context, f.d.f23350h);
            }
            if (i7 == f.e.f23381z) {
                return l(g1Var, context, f.d.f23351i);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.g1.f
        public ColorStateList d(Context context, int i7) {
            if (i7 == f.e.f23368m) {
                return h.a.a(context, f.c.f23339e);
            }
            if (i7 == f.e.I) {
                return h.a.a(context, f.c.f23342h);
            }
            if (i7 == f.e.H) {
                return k(context);
            }
            if (i7 == f.e.f23361f) {
                return j(context);
            }
            if (i7 == f.e.f23357b) {
                return g(context);
            }
            if (i7 == f.e.f23360e) {
                return i(context);
            }
            if (i7 == f.e.D || i7 == f.e.E) {
                return h.a.a(context, f.c.f23341g);
            }
            if (f(this.f763b, i7)) {
                return n1.e(context, f.a.f23328u);
            }
            if (f(this.f766e, i7)) {
                return h.a.a(context, f.c.f23338d);
            }
            if (f(this.f767f, i7)) {
                return h.a.a(context, f.c.f23337c);
            }
            if (i7 == f.e.A) {
                return h.a.a(context, f.c.f23340f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.g1.f
        public boolean e(Context context, int i7, Drawable drawable) {
            if (i7 == f.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i8 = f.a.f23328u;
                m(findDrawableByLayerId, n1.c(context, i8), k.f759b);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), n1.c(context, i8), k.f759b);
                m(layerDrawable.findDrawableByLayerId(R.id.progress), n1.c(context, f.a.f23326s), k.f759b);
                return true;
            }
            if (i7 != f.e.f23380y && i7 != f.e.f23379x && i7 != f.e.f23381z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            m(layerDrawable2.findDrawableByLayerId(R.id.background), n1.b(context, f.a.f23328u), k.f759b);
            Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i9 = f.a.f23326s;
            m(findDrawableByLayerId2, n1.c(context, i9), k.f759b);
            m(layerDrawable2.findDrawableByLayerId(R.id.progress), n1.c(context, i9), k.f759b);
            return true;
        }
    }

    public static synchronized k b() {
        k kVar;
        synchronized (k.class) {
            try {
                if (f760c == null) {
                    h();
                }
                kVar = f760c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }

    public static synchronized PorterDuffColorFilter e(int i7, PorterDuff.Mode mode) {
        PorterDuffColorFilter l7;
        synchronized (k.class) {
            l7 = g1.l(i7, mode);
        }
        return l7;
    }

    public static synchronized void h() {
        synchronized (k.class) {
            if (f760c == null) {
                k kVar = new k();
                f760c = kVar;
                kVar.f761a = g1.h();
                f760c.f761a.u(new a());
            }
        }
    }

    static void i(Drawable drawable, p1 p1Var, int[] iArr) {
        g1.w(drawable, p1Var, iArr);
    }

    public synchronized Drawable c(Context context, int i7) {
        return this.f761a.j(context, i7);
    }

    synchronized Drawable d(Context context, int i7, boolean z7) {
        return this.f761a.k(context, i7, z7);
    }

    synchronized ColorStateList f(Context context, int i7) {
        return this.f761a.m(context, i7);
    }

    public synchronized void g(Context context) {
        this.f761a.s(context);
    }
}
