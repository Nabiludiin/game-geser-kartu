package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: MyApplication */
public final class uo0 extends gn0 implements TextureView.SurfaceTextureListener, rn0 {
    private String[] A;
    private boolean B;
    private int C;
    private zn0 D;
    private final boolean E;
    private boolean F;
    private boolean G;
    private int H;
    private int I;
    private float J;

    /* renamed from: s, reason: collision with root package name */
    private final bo0 f16849s;

    /* renamed from: t, reason: collision with root package name */
    private final co0 f16850t;

    /* renamed from: u, reason: collision with root package name */
    private final ao0 f16851u;

    /* renamed from: v, reason: collision with root package name */
    private final rx1 f16852v;

    /* renamed from: w, reason: collision with root package name */
    private fn0 f16853w;

    /* renamed from: x, reason: collision with root package name */
    private Surface f16854x;

    /* renamed from: y, reason: collision with root package name */
    private sn0 f16855y;

    /* renamed from: z, reason: collision with root package name */
    private String f16856z;

    public uo0(Context context, co0 co0Var, bo0 bo0Var, boolean z7, boolean z8, ao0 ao0Var, rx1 rx1Var) {
        super(context);
        this.C = 1;
        this.f16849s = bo0Var;
        this.f16850t = co0Var;
        this.E = z7;
        this.f16851u = ao0Var;
        co0Var.a(this);
        this.f16852v = rx1Var;
    }

    private final boolean T() {
        sn0 sn0Var = this.f16855y;
        return (sn0Var == null || !sn0Var.s() || this.B) ? false : true;
    }

    private final boolean U() {
        return T() && this.C != 1;
    }

    private final void V(boolean z7, Integer num) {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null && !z7) {
            sn0Var.L(num);
            return;
        }
        if (this.f16856z == null || this.f16854x == null) {
            return;
        }
        if (z7) {
            if (!T()) {
                int i7 = v2.n1.f26802b;
                w2.p.f("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                sn0Var.S();
                W();
            }
        }
        if (this.f16856z.startsWith("cache:")) {
            qp0 D0 = this.f16849s.D0(this.f16856z);
            if (D0 instanceof zp0) {
                sn0 x7 = ((zp0) D0).x();
                this.f16855y = x7;
                x7.L(num);
                if (!this.f16855y.s()) {
                    int i8 = v2.n1.f26802b;
                    w2.p.f("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(D0 instanceof wp0)) {
                    String valueOf = String.valueOf(this.f16856z);
                    int i9 = v2.n1.f26802b;
                    w2.p.f("Stream cache miss: ".concat(valueOf));
                    return;
                }
                wp0 wp0Var = (wp0) D0;
                String D = D();
                ByteBuffer A = wp0Var.A();
                boolean z8 = wp0Var.z();
                String y7 = wp0Var.y();
                if (y7 == null) {
                    int i10 = v2.n1.f26802b;
                    w2.p.f("Stream cache URL is null.");
                    return;
                } else {
                    sn0 C = C(num);
                    this.f16855y = C;
                    C.N(new Uri[]{Uri.parse(y7)}, D, A, z8);
                }
            }
        } else {
            this.f16855y = C(num);
            String D2 = D();
            Uri[] uriArr = new Uri[this.A.length];
            int i11 = 0;
            while (true) {
                String[] strArr = this.A;
                if (i11 >= strArr.length) {
                    break;
                }
                uriArr[i11] = Uri.parse(strArr[i11]);
                i11++;
            }
            this.f16855y.M(uriArr, D2);
        }
        this.f16855y.O(this);
        X(this.f16854x, false);
        if (this.f16855y.s()) {
            int t7 = this.f16855y.t();
            this.C = t7;
            if (t7 == 3) {
                Y();
            }
        }
    }

    private final void W() {
        if (this.f16855y != null) {
            X(null, true);
            sn0 sn0Var = this.f16855y;
            if (sn0Var != null) {
                sn0Var.O(null);
                this.f16855y.P();
                this.f16855y = null;
            }
            this.C = 1;
            this.B = false;
            this.F = false;
            this.G = false;
        }
    }

    private final void X(Surface surface, boolean z7) {
        sn0 sn0Var = this.f16855y;
        if (sn0Var == null) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Trying to set surface before player is initialized.");
            return;
        }
        try {
            sn0Var.Q(surface, z7);
        } catch (IOException e8) {
            int i8 = v2.n1.f26802b;
            w2.p.g("", e8);
        }
    }

    private final void Y() {
        if (this.F) {
            return;
        }
        this.F = true;
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.go0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uo0.this.F();
            }
        });
        m();
        this.f16850t.b();
        if (this.G) {
            l();
        }
    }

    private static String Z(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 1 + length + 1 + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void a0() {
        b0(this.H, this.I);
    }

    private final void b0(int i7, int i8) {
        float f8 = i8 > 0 ? i7 / i8 : 1.0f;
        if (this.J != f8) {
            this.J = f8;
            requestLayout();
        }
    }

    private final void c0() {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            sn0Var.D(true);
        }
    }

    private final void d0() {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            sn0Var.D(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void A(int i7) {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            sn0Var.w(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void B(int i7) {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            sn0Var.x(i7);
        }
    }

    final sn0 C(Integer num) {
        ao0 ao0Var = this.f16851u;
        bo0 bo0Var = this.f16849s;
        uq0 uq0Var = new uq0(bo0Var.getContext(), ao0Var, bo0Var, num);
        int i7 = v2.n1.f26802b;
        w2.p.e("ExoPlayerAdapter initialized.");
        return uq0Var;
    }

    final String D() {
        bo0 bo0Var = this.f16849s;
        return r2.t.g().Q(bo0Var.getContext(), bo0Var.p().f27051q);
    }

    final /* synthetic */ void E() {
        float c8 = this.f9030r.c();
        sn0 sn0Var = this.f16855y;
        if (sn0Var == null) {
            int i7 = v2.n1.f26802b;
            w2.p.f("Trying to set volume before player is initialized.");
            return;
        }
        try {
            sn0Var.R(c8, false);
        } catch (IOException e8) {
            int i8 = v2.n1.f26802b;
            w2.p.g("", e8);
        }
    }

    final /* synthetic */ void F() {
        fn0 fn0Var = this.f16853w;
        if (fn0Var != null) {
            fn0Var.b();
        }
    }

    final /* synthetic */ void G() {
        fn0 fn0Var = this.f16853w;
        if (fn0Var != null) {
            fn0Var.c();
        }
    }

    final /* synthetic */ void H(String str) {
        fn0 fn0Var = this.f16853w;
        if (fn0Var != null) {
            fn0Var.i("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void I() {
        fn0 fn0Var = this.f16853w;
        if (fn0Var != null) {
            fn0Var.d();
        }
    }

    final /* synthetic */ void J() {
        fn0 fn0Var = this.f16853w;
        if (fn0Var != null) {
            fn0Var.h();
        }
    }

    final /* synthetic */ void K() {
        fn0 fn0Var = this.f16853w;
        if (fn0Var != null) {
            fn0Var.a();
        }
    }

    final /* synthetic */ void L(int i7, int i8) {
        fn0 fn0Var = this.f16853w;
        if (fn0Var != null) {
            fn0Var.e(i7, i8);
        }
    }

    final /* synthetic */ void M() {
        fn0 fn0Var = this.f16853w;
        if (fn0Var != null) {
            fn0Var.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void N(int i7) {
        if (this.C != i7) {
            this.C = i7;
            if (i7 == 3) {
                Y();
                return;
            }
            if (i7 != 4) {
                return;
            }
            if (this.f16851u.f5169a) {
                d0();
            }
            this.f16850t.f();
            this.f9030r.e();
            v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.jo0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    uo0.this.G();
                }
            });
        }
    }

    final /* synthetic */ void O(int i7) {
        fn0 fn0Var = this.f16853w;
        if (fn0Var != null) {
            fn0Var.onWindowVisibilityChanged(i7);
        }
    }

    final /* synthetic */ void P(boolean z7, long j7) {
        this.f16849s.b1(z7, j7);
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void Q() {
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.io0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uo0.this.S();
            }
        });
    }

    final /* synthetic */ void R(String str) {
        fn0 fn0Var = this.f16853w;
        if (fn0Var != null) {
            fn0Var.f("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void S() {
        fn0 fn0Var = this.f16853w;
        if (fn0Var != null) {
            fn0Var.l();
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void a(int i7) {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            sn0Var.U(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void b(String str, Exception exc) {
        final String Z = Z("onLoadException", exc);
        String concat = "ExoPlayerAdapter exception: ".concat(Z);
        int i7 = v2.n1.f26802b;
        w2.p.f(concat);
        r2.t.l().j(exc, "AdExoPlayerView.onException");
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ho0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uo0.this.R(Z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void c(int i7, int i8) {
        this.H = i7;
        this.I = i8;
        a0();
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void d(int i7) {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            sn0Var.V(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void e(String str, Exception exc) {
        final String Z = Z(str, exc);
        String concat = "ExoPlayerAdapter error: ".concat(Z);
        int i7 = v2.n1.f26802b;
        w2.p.f(concat);
        this.B = true;
        if (this.f16851u.f5169a) {
            d0();
        }
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.lo0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uo0.this.H(Z);
            }
        });
        r2.t.l().j(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.rn0
    public final void f(final boolean z7, final long j7) {
        if (this.f16849s != null) {
            cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.so0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    uo0.this.P(z7, j7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void g(int i7) {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            sn0Var.r(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final String h() {
        return "ExoPlayer/2".concat(true != this.E ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void i(fn0 fn0Var) {
        this.f16853w = fn0Var;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void j(String str) {
        if (str != null) {
            z(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void k() {
        if (T()) {
            this.f16855y.S();
            W();
        }
        co0 co0Var = this.f16850t;
        co0Var.f();
        this.f9030r.e();
        co0Var.c();
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void l() {
        if (!U()) {
            this.G = true;
            return;
        }
        if (this.f16851u.f5169a) {
            c0();
        }
        this.f16855y.v(true);
        this.f16850t.e();
        this.f9030r.d();
        this.f9029q.a();
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.mo0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uo0.this.I();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.gn0, com.google.android.gms.internal.ads.eo0
    public final void m() {
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.to0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uo0.this.E();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void n() {
        if (U()) {
            if (this.f16851u.f5169a) {
                d0();
            }
            this.f16855y.v(false);
            this.f16850t.f();
            this.f9030r.e();
            v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.no0
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    uo0.this.J();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int o() {
        if (U()) {
            return (int) this.f16855y.y();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    protected final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f8 = this.J;
        if (f8 != 0.0f && this.D == null) {
            float f9 = measuredWidth;
            float f10 = f9 / measuredHeight;
            if (f8 > f10) {
                measuredHeight = (int) (f9 / f8);
            }
            if (f8 < f10) {
                measuredWidth = (int) (measuredHeight * f8);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zn0 zn0Var = this.D;
        if (zn0Var != null) {
            zn0Var.c(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        rx1 rx1Var;
        if (this.E) {
            if (((Boolean) s2.b0.c().d(uy.oe)).booleanValue() && (rx1Var = this.f16852v) != null) {
                qx1 a8 = rx1Var.a();
                a8.c("action", "svp_aepv");
                a8.d();
            }
            zn0 zn0Var = new zn0(getContext());
            this.D = zn0Var;
            zn0Var.b(surfaceTexture, i7, i8);
            zn0 zn0Var2 = this.D;
            zn0Var2.start();
            SurfaceTexture e8 = zn0Var2.e();
            if (e8 != null) {
                surfaceTexture = e8;
            } else {
                this.D.d();
                this.D = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f16854x = surface;
        if (this.f16855y == null) {
            V(false, null);
        } else {
            X(surface, true);
            if (!this.f16851u.f5169a) {
                c0();
            }
        }
        if (this.H == 0 || this.I == 0) {
            b0(i7, i8);
        } else {
            a0();
        }
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.oo0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uo0.this.K();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        n();
        zn0 zn0Var = this.D;
        if (zn0Var != null) {
            zn0Var.d();
            this.D = null;
        }
        if (this.f16855y != null) {
            d0();
            Surface surface = this.f16854x;
            if (surface != null) {
                surface.release();
            }
            this.f16854x = null;
            X(null, true);
        }
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.qo0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uo0.this.M();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i7, final int i8) {
        zn0 zn0Var = this.D;
        if (zn0Var != null) {
            zn0Var.c(i7, i8);
        }
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.po0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uo0.this.L(i7, i8);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f16850t.d(this);
        this.f9029q.b(surfaceTexture, this.f16853w);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i7) {
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 46);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i7);
        v2.n1.k(sb.toString());
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ro0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uo0.this.O(i7);
            }
        });
        super.onWindowVisibilityChanged(i7);
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int p() {
        if (U()) {
            return (int) this.f16855y.u();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void q(int i7) {
        if (U()) {
            this.f16855y.T(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void r(float f8, float f9) {
        zn0 zn0Var = this.D;
        if (zn0Var != null) {
            zn0Var.f(f8, f9);
        }
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int s() {
        return this.H;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int t() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final long u() {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            return sn0Var.z();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final long v() {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            return sn0Var.A();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final long w() {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            return sn0Var.B();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final int x() {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            return sn0Var.C();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final Integer y() {
        sn0 sn0Var = this.f16855y;
        if (sn0Var != null) {
            return sn0Var.K();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.gn0
    public final void z(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.A = new String[]{str};
        } else {
            this.A = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f16856z;
        boolean z7 = false;
        if (this.f16851u.f5179k && str2 != null && !str.equals(str2) && this.C == 4) {
            z7 = true;
        }
        this.f16856z = str;
        V(z7, num);
    }
}
