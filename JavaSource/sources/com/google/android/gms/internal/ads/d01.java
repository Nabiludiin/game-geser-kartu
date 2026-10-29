package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.InputEvent;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class d01 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6880a;

    /* renamed from: b, reason: collision with root package name */
    private final v2.p1 f6881b;

    /* renamed from: c, reason: collision with root package name */
    private final ga2 f6882c;

    /* renamed from: d, reason: collision with root package name */
    private final pu1 f6883d;

    /* renamed from: e, reason: collision with root package name */
    private final z64 f6884e;

    /* renamed from: f, reason: collision with root package name */
    private final Executor f6885f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f6886g;

    /* renamed from: h, reason: collision with root package name */
    cg0 f6887h;

    /* renamed from: i, reason: collision with root package name */
    cg0 f6888i;

    d01(Context context, v2.p1 p1Var, ga2 ga2Var, pu1 pu1Var, z64 z64Var, z64 z64Var2, ScheduledExecutorService scheduledExecutorService) {
        this.f6880a = context;
        this.f6881b = p1Var;
        this.f6882c = ga2Var;
        this.f6883d = pu1Var;
        this.f6884e = z64Var;
        this.f6885f = z64Var2;
        this.f6886g = scheduledExecutorService;
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) s2.b0.c().d(uy.jb));
    }

    private final a5.d k(final String str, final InputEvent inputEvent, Random random) {
        try {
            if (!str.contains((CharSequence) s2.b0.c().d(uy.jb)) || this.f6881b.H()) {
                return p64.a(str);
            }
            final Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter((String) s2.b0.c().d(uy.kb), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (inputEvent != null) {
                return (h64) p64.h((h64) p64.j(h64.C(this.f6882c.a()), new w54() { // from class: com.google.android.gms.internal.ads.wz0
                    @Override // com.google.android.gms.internal.ads.w54
                    public final /* synthetic */ a5.d d(Object obj) {
                        return d01.this.e(buildUpon, str, inputEvent, (Integer) obj);
                    }
                }, this.f6885f), Throwable.class, new w54() { // from class: com.google.android.gms.internal.ads.xz0
                    @Override // com.google.android.gms.internal.ads.w54
                    public final /* synthetic */ a5.d d(Object obj) {
                        return d01.this.f(buildUpon, (Throwable) obj);
                    }
                }, this.f6884e);
            }
            buildUpon.appendQueryParameter((String) s2.b0.c().d(uy.lb), "11");
            return p64.a(buildUpon.toString());
        } catch (Exception e8) {
            return p64.c(e8);
        }
    }

    public final void a(String str, x73 x73Var, Random random, w2.w wVar) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        p64.r(p64.i(k(str, this.f6883d.b(), random), ((Integer) s2.b0.c().d(uy.pb)).intValue(), TimeUnit.MILLISECONDS, this.f6886g), new vz0(this, x73Var, str, wVar), this.f6884e);
    }

    public final a5.d b(final String str, Random random) {
        return TextUtils.isEmpty(str) ? p64.a(str) : p64.h(k(str, this.f6883d.b(), random), Throwable.class, new w54() { // from class: com.google.android.gms.internal.ads.c01
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return d01.this.d(str, (Throwable) obj);
            }
        }, this.f6884e);
    }

    final /* synthetic */ a5.d d(String str, final Throwable th) {
        this.f6884e.H0(new Runnable() { // from class: com.google.android.gms.internal.ads.b01
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                d01.this.h(th);
            }
        });
        return p64.a(str);
    }

    final /* synthetic */ a5.d e(final Uri.Builder builder, String str, InputEvent inputEvent, Integer num) {
        if (num.intValue() != 1) {
            builder.appendQueryParameter((String) s2.b0.c().d(uy.lb), "10");
            return p64.a(builder.toString());
        }
        Uri.Builder buildUpon = builder.build().buildUpon();
        buildUpon.appendQueryParameter((String) s2.b0.c().d(uy.mb), "1");
        buildUpon.appendQueryParameter((String) s2.b0.c().d(uy.lb), "12");
        if (str.contains((CharSequence) s2.b0.c().d(uy.nb))) {
            buildUpon.authority((String) s2.b0.c().d(uy.ob));
        }
        return (h64) p64.j(h64.C(this.f6882c.b(buildUpon.build(), inputEvent)), new w54() { // from class: com.google.android.gms.internal.ads.zz0
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                String str2 = (String) s2.b0.c().d(uy.lb);
                Uri.Builder builder2 = builder;
                builder2.appendQueryParameter(str2, "12");
                return p64.a(builder2.toString());
            }
        }, this.f6885f);
    }

    final /* synthetic */ a5.d f(Uri.Builder builder, final Throwable th) {
        this.f6884e.H0(new Runnable() { // from class: com.google.android.gms.internal.ads.a01
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                d01.this.g(th);
            }
        });
        builder.appendQueryParameter((String) s2.b0.c().d(uy.lb), "9");
        return p64.a(builder.toString());
    }

    final /* synthetic */ void g(Throwable th) {
        if (((Boolean) s2.b0.c().d(uy.qb)).booleanValue()) {
            cg0 e8 = ag0.e(this.f6880a);
            this.f6888i = e8;
            e8.a(th, "AttributionReporting");
        } else {
            cg0 c8 = ag0.c(this.f6880a);
            this.f6887h = c8;
            c8.a(th, "AttributionReportingSampled");
        }
    }

    final /* synthetic */ void h(Throwable th) {
        if (((Boolean) s2.b0.c().d(uy.qb)).booleanValue()) {
            cg0 e8 = ag0.e(this.f6880a);
            this.f6888i = e8;
            e8.a(th, "AttributionReporting.getUpdatedUrlAndRegisterSource");
        } else {
            cg0 c8 = ag0.c(this.f6880a);
            this.f6887h = c8;
            c8.a(th, "AttributionReportingSampled.getUpdatedUrlAndRegisterSource");
        }
    }

    final /* synthetic */ Context i() {
        return this.f6880a;
    }

    final /* synthetic */ z64 j() {
        return this.f6884e;
    }
}
