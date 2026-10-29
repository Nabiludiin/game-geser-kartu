package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class co0 {

    /* renamed from: r, reason: collision with root package name */
    private static final boolean f6527r;

    /* renamed from: a, reason: collision with root package name */
    private final Context f6528a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6529b;

    /* renamed from: c, reason: collision with root package name */
    private final w2.a f6530c;

    /* renamed from: d, reason: collision with root package name */
    private final hz f6531d;

    /* renamed from: e, reason: collision with root package name */
    private final kz f6532e;

    /* renamed from: f, reason: collision with root package name */
    private final v2.h0 f6533f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f6534g;

    /* renamed from: h, reason: collision with root package name */
    private final String[] f6535h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f6536i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f6537j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6538k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f6539l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6540m;

    /* renamed from: n, reason: collision with root package name */
    private gn0 f6541n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6542o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6543p;

    /* renamed from: q, reason: collision with root package name */
    private long f6544q;

    static {
        f6527r = s2.z.e().nextInt(100) < ((Integer) s2.b0.c().d(uy.Kd)).intValue();
    }

    public co0(Context context, w2.a aVar, String str, kz kzVar, hz hzVar) {
        v2.g0 g0Var = new v2.g0();
        g0Var.a("min_1", Double.MIN_VALUE, 1.0d);
        g0Var.a("1_5", 1.0d, 5.0d);
        g0Var.a("5_10", 5.0d, 10.0d);
        g0Var.a("10_20", 10.0d, 20.0d);
        g0Var.a("20_30", 20.0d, 30.0d);
        g0Var.a("30_max", 30.0d, Double.MAX_VALUE);
        this.f6533f = g0Var.b();
        this.f6536i = false;
        this.f6537j = false;
        this.f6538k = false;
        this.f6539l = false;
        this.f6544q = -1L;
        this.f6528a = context;
        this.f6530c = aVar;
        this.f6529b = str;
        this.f6532e = kzVar;
        this.f6531d = hzVar;
        String str2 = (String) s2.b0.c().d(uy.V);
        if (str2 == null) {
            this.f6535h = new String[0];
            this.f6534g = new long[0];
            return;
        }
        String[] split = TextUtils.split(str2, ",");
        int length = split.length;
        this.f6535h = new String[length];
        this.f6534g = new long[length];
        for (int i7 = 0; i7 < split.length; i7++) {
            try {
                this.f6534g[i7] = Long.parseLong(split[i7]);
            } catch (NumberFormatException e8) {
                int i8 = v2.n1.f26802b;
                w2.p.g("Unable to parse frame hash target time number.", e8);
                this.f6534g[i7] = -1;
            }
        }
    }

    public final void a(gn0 gn0Var) {
        kz kzVar = this.f6532e;
        cz.a(kzVar, this.f6531d, "vpc2");
        this.f6536i = true;
        kzVar.d("vpn", gn0Var.h());
        this.f6541n = gn0Var;
    }

    public final void b() {
        if (!this.f6536i || this.f6537j) {
            return;
        }
        cz.a(this.f6532e, this.f6531d, "vfr2");
        this.f6537j = true;
    }

    public final void c() {
        if (!f6527r || this.f6542o) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("type", "native-player-metrics");
        bundle.putString("request", this.f6529b);
        bundle.putString("player", this.f6541n.h());
        for (v2.f0 f0Var : this.f6533f.b()) {
            String str = f0Var.f26740a;
            String valueOf = String.valueOf(str);
            bundle.putString("fps_c_".concat(valueOf), Integer.toString(f0Var.f26744e));
            String valueOf2 = String.valueOf(str);
            bundle.putString("fps_p_".concat(valueOf2), Double.toString(f0Var.f26743d));
        }
        int i7 = 0;
        while (true) {
            long[] jArr = this.f6534g;
            if (i7 >= jArr.length) {
                r2.t.g().S(this.f6528a, this.f6530c.f27051q, "gmob-apps", bundle, true);
                this.f6542o = true;
                return;
            }
            String str2 = this.f6535h[i7];
            if (str2 != null) {
                Long valueOf3 = Long.valueOf(jArr[i7]);
                new StringBuilder(valueOf3.toString().length() + 3);
                bundle.putString("fh_".concat(valueOf3.toString()), str2);
            }
            i7++;
        }
    }

    public final void d(gn0 gn0Var) {
        if (this.f6538k && !this.f6539l) {
            if (v2.n1.m() && !this.f6539l) {
                v2.n1.k("VideoMetricsMixin first frame");
            }
            cz.a(this.f6532e, this.f6531d, "vff2");
            this.f6539l = true;
        }
        long c8 = r2.t.o().c();
        if (this.f6540m && this.f6543p && this.f6544q != -1) {
            this.f6533f.a(TimeUnit.SECONDS.toNanos(1L) / (c8 - this.f6544q));
        }
        this.f6543p = this.f6540m;
        this.f6544q = c8;
        long longValue = ((Long) s2.b0.c().d(uy.W)).longValue();
        long p7 = gn0Var.p();
        int i7 = 0;
        while (true) {
            String[] strArr = this.f6535h;
            if (i7 >= strArr.length) {
                return;
            }
            if (strArr[i7] == null && longValue > Math.abs(p7 - this.f6534g[i7])) {
                int i8 = 8;
                Bitmap bitmap = gn0Var.getBitmap(8, 8);
                long j7 = 63;
                long j8 = 0;
                int i9 = 0;
                while (i9 < i8) {
                    int i10 = 0;
                    while (i10 < i8) {
                        int pixel = bitmap.getPixel(i10, i9);
                        j8 |= ((Color.blue(pixel) + Color.red(pixel)) + Color.green(pixel) > 128 ? 1L : 0L) << ((int) j7);
                        j7--;
                        i10++;
                        i8 = 8;
                    }
                    i9++;
                    i8 = 8;
                }
                strArr[i7] = String.format("%016X", Long.valueOf(j8));
                return;
            }
            i7++;
        }
    }

    public final void e() {
        this.f6540m = true;
        if (!this.f6537j || this.f6538k) {
            return;
        }
        cz.a(this.f6532e, this.f6531d, "vfp2");
        this.f6538k = true;
    }

    public final void f() {
        this.f6540m = false;
    }
}
