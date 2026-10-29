package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.InputEvent;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
final class sq3 implements kq3 {

    /* renamed from: a, reason: collision with root package name */
    private final ge3 f15755a;

    /* renamed from: b, reason: collision with root package name */
    private final as3 f15756b;

    /* renamed from: c, reason: collision with root package name */
    private final at3 f15757c;

    /* renamed from: d, reason: collision with root package name */
    private final File f15758d;

    /* renamed from: e, reason: collision with root package name */
    private final nu3 f15759e;

    /* renamed from: f, reason: collision with root package name */
    private final ExecutorService f15760f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f15761g = new AtomicReference("3.-1");

    sq3(ge3 ge3Var, as3 as3Var, at3 at3Var, nu3 nu3Var, ExecutorService executorService, File file) {
        this.f15755a = ge3Var;
        this.f15756b = as3Var;
        this.f15757c = at3Var;
        this.f15759e = nu3Var;
        this.f15758d = file;
        this.f15760f = executorService;
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final String a() {
        return (String) this.f15761g.get();
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final a5.d b() {
        return (h64) p64.k((h64) p64.g(h64.C(this.f15756b.a()), Throwable.class, rq3.f15156a, g74.a()), new hx3() { // from class: com.google.android.gms.internal.ads.mq3
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                sq3.this.h((xk3) obj);
                return null;
            }
        }, this.f15760f);
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final a5.d c(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return p64.d(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.pq3

            /* renamed from: b, reason: collision with root package name */
            private final /* synthetic */ Context f14018b;

            /* renamed from: c, reason: collision with root package name */
            private final /* synthetic */ String f14019c;

            /* renamed from: d, reason: collision with root package name */
            private final /* synthetic */ View f14020d;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return sq3.this.k(this.f14018b, this.f14019c, this.f14020d, null);
            }
        }, this.f15760f);
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final a5.d d(final Context context) {
        return p64.d(new Callable() { // from class: com.google.android.gms.internal.ads.nq3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return sq3.this.i(context);
            }
        }, this.f15760f);
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final a5.d e(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return p64.d(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.oq3

            /* renamed from: b, reason: collision with root package name */
            private final /* synthetic */ Context f13445b;

            /* renamed from: c, reason: collision with root package name */
            private final /* synthetic */ View f13446c;

            /* renamed from: d, reason: collision with root package name */
            private final /* synthetic */ Activity f13447d;

            {
                this.f13446c = view;
                this.f13447d = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return sq3.this.j(this.f13445b, null, this.f13446c, this.f13447d);
            }
        }, this.f15760f);
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final int f() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final void g(InputEvent inputEvent) {
        oc3 b8 = this.f15755a.b();
        if (b8 == null) {
            this.f15759e.b(15004);
        } else if (inputEvent instanceof MotionEvent) {
            try {
                b8.c(null, (MotionEvent) inputEvent);
            } catch (fe3 e8) {
                this.f15759e.d(15005, e8);
            }
        }
    }

    final /* synthetic */ Void h(final xk3 xk3Var) {
        if (!this.f15757c.b(xk3Var) || xk3Var == null) {
            this.f15759e.b(15003);
            throw new lq3(1);
        }
        as3 as3Var = this.f15756b;
        File f8 = as3Var.f();
        if (Build.VERSION.SDK_INT >= 34) {
            f8.setReadOnly();
        }
        final wd3 wd3Var = new wd3(xk3Var.d0(), f8, as3Var.c(), this.f15758d);
        this.f15759e.f(15002, new Runnable() { // from class: com.google.android.gms.internal.ads.qq3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                sq3.this.l(wd3Var, xk3Var);
            }
        });
        return null;
    }

    final /* synthetic */ String i(Context context) {
        oc3 b8 = this.f15755a.b();
        if (b8 == null) {
            this.f15759e.b(15004);
            return "";
        }
        String a8 = b8.a(context, null);
        if (a8 != null) {
            return a8;
        }
        this.f15759e.b(15006);
        return "";
    }

    final /* synthetic */ String j(Context context, String str, View view, Activity activity) {
        oc3 b8 = this.f15755a.b();
        if (b8 == null) {
            this.f15759e.b(15004);
            return "";
        }
        String d8 = b8.d(context, null, view, activity);
        if (d8 != null) {
            return d8;
        }
        this.f15759e.b(15007);
        return "";
    }

    final /* synthetic */ String k(Context context, String str, View view, Activity activity) {
        oc3 b8 = this.f15755a.b();
        if (b8 == null) {
            this.f15759e.b(15004);
            return "";
        }
        String b9 = b8.b(context, null, str, view, null);
        if (b9 != null) {
            return b9;
        }
        this.f15759e.b(15008);
        return "";
    }

    final /* synthetic */ void l(wd3 wd3Var, xk3 xk3Var) {
        if (!this.f15755a.a(wd3Var)) {
            throw new lq3(2);
        }
        this.f15761g.set("2.".concat(String.valueOf(xk3Var.d0().d0())));
    }
}
