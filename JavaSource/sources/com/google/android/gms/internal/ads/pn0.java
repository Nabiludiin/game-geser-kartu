package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashMap;

/* compiled from: MyApplication */
public final class pn0 extends FrameLayout implements fn0 {
    private boolean A;
    private long B;
    private long C;
    private String D;
    private String[] E;
    private Bitmap F;
    private final ImageView G;
    private boolean H;

    /* renamed from: q, reason: collision with root package name */
    private final bo0 f13932q;

    /* renamed from: r, reason: collision with root package name */
    private final FrameLayout f13933r;

    /* renamed from: s, reason: collision with root package name */
    private final View f13934s;

    /* renamed from: t, reason: collision with root package name */
    private final kz f13935t;

    /* renamed from: u, reason: collision with root package name */
    final do0 f13936u;

    /* renamed from: v, reason: collision with root package name */
    private final long f13937v;

    /* renamed from: w, reason: collision with root package name */
    private final gn0 f13938w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f13939x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f13940y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f13941z;

    public pn0(Context context, bo0 bo0Var, int i7, boolean z7, kz kzVar, ao0 ao0Var, rx1 rx1Var) {
        super(context);
        gn0 en0Var;
        kz kzVar2;
        gn0 gn0Var;
        this.f13932q = bo0Var;
        this.f13935t = kzVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.f13933r = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        p3.o.m(bo0Var.l());
        hn0 hn0Var = bo0Var.l().f25782a;
        co0 co0Var = new co0(context, bo0Var.p(), bo0Var.n(), kzVar, bo0Var.j());
        if (i7 == 3) {
            gn0Var = new br0(context, co0Var);
            kzVar2 = kzVar;
        } else {
            if (i7 == 2) {
                en0Var = new uo0(context, co0Var, bo0Var, z7, hn0.a(bo0Var), ao0Var, rx1Var);
                kzVar2 = kzVar;
            } else {
                kzVar2 = kzVar;
                en0Var = new en0(context, bo0Var, z7, hn0.a(bo0Var), ao0Var, new co0(context, bo0Var.p(), bo0Var.n(), kzVar, bo0Var.j()), rx1Var);
            }
            gn0Var = en0Var;
        }
        this.f13938w = gn0Var;
        View view = new View(context);
        this.f13934s = view;
        view.setBackgroundColor(0);
        frameLayout.addView(gn0Var, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) s2.b0.c().d(uy.f17046a0)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) s2.b0.c().d(uy.X)).booleanValue()) {
            o();
        }
        this.G = new ImageView(context);
        this.f13937v = ((Long) s2.b0.c().d(uy.f17064c0)).longValue();
        boolean booleanValue = ((Boolean) s2.b0.c().d(uy.Z)).booleanValue();
        this.A = booleanValue;
        if (kzVar2 != null) {
            kzVar2.d("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.f13936u = new do0(this);
        gn0Var.i(this);
    }

    private final boolean u() {
        return this.G.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void t(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer x7 = x();
        if (x7 != null) {
            hashMap.put("playerId", x7.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.f13932q.B("onVideoEvent", hashMap);
    }

    private final void w() {
        bo0 bo0Var = this.f13932q;
        if (bo0Var.i() == null || !this.f13940y || this.f13941z) {
            return;
        }
        bo0Var.i().getWindow().clearFlags(128);
        this.f13940y = false;
    }

    public final void A(String str, String[] strArr) {
        this.D = str;
        this.E = strArr;
    }

    public final void B(float f8, float f9) {
        gn0 gn0Var = this.f13938w;
        if (gn0Var != null) {
            gn0Var.r(f8, f9);
        }
    }

    public final void C(Integer num) {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        if (TextUtils.isEmpty(this.D)) {
            t("no_src", new String[0]);
        } else {
            gn0Var.z(this.D, this.E, num);
        }
    }

    public final void D() {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.n();
    }

    public final void E() {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.l();
    }

    public final void F(int i7) {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.q(i7);
    }

    public final void G() {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.f9030r.a(true);
        gn0Var.m();
    }

    public final void H() {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.f9030r.a(false);
        gn0Var.m();
    }

    public final void I(float f8) {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.f9030r.b(f8);
        gn0Var.m();
    }

    public final void J(int i7) {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.A(i7);
    }

    public final void K(int i7) {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.B(i7);
    }

    public final void L(int i7) {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.a(i7);
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void a() {
        this.f13936u.b();
        v2.f2.f26746l.post(new in0(this));
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void b() {
        gn0 gn0Var = this.f13938w;
        if (gn0Var != null && this.C == 0) {
            t("canplaythrough", "duration", String.valueOf(gn0Var.o() / 1000.0f), "videoWidth", String.valueOf(gn0Var.s()), "videoHeight", String.valueOf(gn0Var.t()));
        }
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void c() {
        if (((Boolean) s2.b0.c().d(uy.f17128j2)).booleanValue()) {
            this.f13936u.a();
        }
        t("ended", new String[0]);
        w();
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void d() {
        if (((Boolean) s2.b0.c().d(uy.f17128j2)).booleanValue()) {
            this.f13936u.b();
        }
        bo0 bo0Var = this.f13932q;
        if (bo0Var.i() != null && !this.f13940y) {
            boolean z7 = (bo0Var.i().getWindow().getAttributes().flags & 128) != 0;
            this.f13941z = z7;
            if (!z7) {
                bo0Var.i().getWindow().addFlags(128);
                this.f13940y = true;
            }
        }
        this.f13939x = true;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void e(int i7, int i8) {
        if (this.A) {
            ly lyVar = uy.f17055b0;
            int max = Math.max(i7 / ((Integer) s2.b0.c().d(lyVar)).intValue(), 1);
            int max2 = Math.max(i8 / ((Integer) s2.b0.c().d(lyVar)).intValue(), 1);
            Bitmap bitmap = this.F;
            if (bitmap != null && bitmap.getWidth() == max && this.F.getHeight() == max2) {
                return;
            }
            this.F = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.H = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void f(String str, String str2) {
        t("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    public final void finalize() {
        try {
            this.f13936u.a();
            final gn0 gn0Var = this.f13938w;
            if (gn0Var != null) {
                cm0.f6505f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.mn0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        gn0.this.k();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void g() {
        if (this.H && this.F != null && !u()) {
            ImageView imageView = this.G;
            imageView.setImageBitmap(this.F);
            imageView.invalidate();
            FrameLayout frameLayout = this.f13933r;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.f13936u.a();
        this.C = this.B;
        v2.f2.f26746l.post(new kn0(this));
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void h() {
        t("pause", new String[0]);
        w();
        this.f13939x = false;
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void i(String str, String str2) {
        t("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void j() {
        if (this.f13939x && u()) {
            this.f13933r.removeView(this.G);
        }
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null || this.F == null) {
            return;
        }
        long b8 = r2.t.o().b();
        if (gn0Var.getBitmap(this.F) != null) {
            this.H = true;
        }
        long b9 = r2.t.o().b() - b8;
        if (v2.n1.m()) {
            StringBuilder sb = new StringBuilder(String.valueOf(b9).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(b9);
            sb.append("ms");
            v2.n1.k(sb.toString());
        }
        if (b9 > this.f13937v) {
            w2.p.f("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.A = false;
            this.F = null;
            kz kzVar = this.f13935t;
            if (kzVar != null) {
                kzVar.d("spinner_jank", Long.toString(b9));
            }
        }
    }

    public final void k(int i7) {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.d(i7);
    }

    @Override // com.google.android.gms.internal.ads.fn0
    public final void l() {
        this.f13934s.setVisibility(4);
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.nn0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                pn0.this.s();
            }
        });
    }

    public final void m(int i7) {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.g(i7);
    }

    public final void n(MotionEvent motionEvent) {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        gn0Var.dispatchTouchEvent(motionEvent);
    }

    public final void o() {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        TextView textView = new TextView(gn0Var.getContext());
        Resources h8 = r2.t.l().h();
        textView.setText(String.valueOf(h8 == null ? "AdMob - " : h8.getString(p2.d.f25111u)).concat(gn0Var.h()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.f13933r;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z7) {
        super.onWindowFocusChanged(z7);
        if (z7) {
            this.f13936u.b();
        } else {
            this.f13936u.a();
            this.C = this.B;
        }
        v2.f2.f26746l.post(new Runnable() { // from class: com.google.android.gms.internal.ads.on0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                pn0.this.r(z7);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.fn0
    public final void onWindowVisibilityChanged(int i7) {
        boolean z7;
        super.onWindowVisibilityChanged(i7);
        if (i7 == 0) {
            this.f13936u.b();
            z7 = true;
        } else {
            this.f13936u.a();
            this.C = this.B;
            z7 = false;
        }
        v2.f2.f26746l.post(new ln0(this, z7));
    }

    public final void p() {
        this.f13936u.a();
        gn0 gn0Var = this.f13938w;
        if (gn0Var != null) {
            gn0Var.k();
        }
        w();
    }

    final void q() {
        gn0 gn0Var = this.f13938w;
        if (gn0Var == null) {
            return;
        }
        long p7 = gn0Var.p();
        if (this.B == p7 || p7 <= 0) {
            return;
        }
        float f8 = p7 / 1000.0f;
        if (((Boolean) s2.b0.c().d(uy.f17111h2)).booleanValue()) {
            t("timeupdate", "time", String.valueOf(f8), "totalBytes", String.valueOf(gn0Var.w()), "qoeCachedBytes", String.valueOf(gn0Var.v()), "qoeLoadedBytes", String.valueOf(gn0Var.u()), "droppedFrames", String.valueOf(gn0Var.x()), "reportTime", String.valueOf(r2.t.o().a()));
        } else {
            t("timeupdate", "time", String.valueOf(f8));
        }
        this.B = p7;
    }

    final /* synthetic */ void r(boolean z7) {
        t("windowFocusChanged", "hasWindowFocus", String.valueOf(z7));
    }

    final /* synthetic */ void s() {
        t("firstFrameRendered", new String[0]);
    }

    public final Integer x() {
        gn0 gn0Var = this.f13938w;
        if (gn0Var != null) {
            return gn0Var.y();
        }
        return null;
    }

    public final void y(int i7) {
        if (((Boolean) s2.b0.c().d(uy.f17046a0)).booleanValue()) {
            this.f13933r.setBackgroundColor(i7);
            this.f13934s.setBackgroundColor(i7);
        }
    }

    public final void z(int i7, int i8, int i9, int i10) {
        if (v2.n1.m()) {
            int length = String.valueOf(i7).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i8).length() + 3 + String.valueOf(i9).length() + 3 + String.valueOf(i10).length());
            sb.append("Set video bounds to x:");
            sb.append(i7);
            sb.append(";y:");
            sb.append(i8);
            sb.append(";w:");
            sb.append(i9);
            sb.append(";h:");
            sb.append(i10);
            v2.n1.k(sb.toString());
        }
        if (i9 == 0 || i10 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i9, i10);
        layoutParams.setMargins(i7, i8, 0, 0);
        this.f13933r.setLayoutParams(layoutParams);
        requestLayout();
    }
}
