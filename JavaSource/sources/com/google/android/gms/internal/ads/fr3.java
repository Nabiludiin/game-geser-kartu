package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
final class fr3 implements kq3 {

    /* renamed from: a, reason: collision with root package name */
    private final at3 f8443a;

    /* renamed from: b, reason: collision with root package name */
    private final as3 f8444b;

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f8445c;

    /* renamed from: d, reason: collision with root package name */
    private final ft3 f8446d;

    /* renamed from: e, reason: collision with root package name */
    private final nu3 f8447e;

    /* renamed from: f, reason: collision with root package name */
    private final Object f8448f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private final String f8449g;

    /* renamed from: h, reason: collision with root package name */
    private final long f8450h;

    /* renamed from: i, reason: collision with root package name */
    private final long f8451i;

    /* renamed from: j, reason: collision with root package name */
    private er3 f8452j;

    fr3(b95 b95Var, at3 at3Var, as3 as3Var, ft3 ft3Var, nu3 nu3Var, li3 li3Var, ExecutorService executorService) {
        this.f8443a = at3Var;
        this.f8444b = as3Var;
        this.f8445c = executorService;
        this.f8446d = ft3Var;
        this.f8447e = nu3Var;
        this.f8449g = li3Var.i0();
        this.f8450h = li3Var.q0();
        this.f8451i = li3Var.p0();
    }

    private final String q(Map map) {
        String b8;
        nu3 nu3Var = this.f8447e;
        try {
            nu3Var.a(20110).a();
            synchronized (this.f8448f) {
                try {
                    er3 er3Var = this.f8452j;
                    if (er3Var == null) {
                        nu3Var.b(20109);
                        b8 = "";
                    } else {
                        b8 = er3Var.b(map);
                    }
                } finally {
                }
            }
            return b8;
        } finally {
        }
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final String a() {
        synchronized (this.f8448f) {
            try {
                er3 er3Var = this.f8452j;
                if (er3Var == null) {
                    return "3.-1";
                }
                return er3Var.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final a5.d b() {
        h64 C = h64.C(this.f8444b.a());
        cr3 cr3Var = cr3.f6588a;
        ExecutorService executorService = this.f8445c;
        return (h64) p64.j((h64) p64.g(C, Throwable.class, cr3Var, executorService), new w54() { // from class: com.google.android.gms.internal.ads.uq3
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return fr3.this.i((xk3) obj);
            }
        }, executorService);
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final a5.d c(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return p64.d(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.xq3

            /* renamed from: b, reason: collision with root package name */
            private final /* synthetic */ Context f18954b;

            /* renamed from: c, reason: collision with root package name */
            private final /* synthetic */ String f18955c;

            /* renamed from: d, reason: collision with root package name */
            private final /* synthetic */ View f18956d;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return fr3.this.l(this.f18954b, this.f18955c, this.f18956d, null);
            }
        }, this.f8445c);
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final a5.d d(final Context context) {
        return p64.d(new Callable() { // from class: com.google.android.gms.internal.ads.vq3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return fr3.this.j(context);
            }
        }, this.f8445c);
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final a5.d e(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return p64.d(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.wq3

            /* renamed from: b, reason: collision with root package name */
            private final /* synthetic */ Context f18382b;

            /* renamed from: c, reason: collision with root package name */
            private final /* synthetic */ View f18383c;

            /* renamed from: d, reason: collision with root package name */
            private final /* synthetic */ Activity f18384d;

            {
                this.f18383c = view;
                this.f18384d = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return fr3.this.k(this.f18382b, null, this.f18383c, this.f18384d);
            }
        }, this.f8445c);
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final int f() {
        return 4;
    }

    @Override // com.google.android.gms.internal.ads.kq3
    public final void g(InputEvent inputEvent) {
        try {
            synchronized (this.f8448f) {
                try {
                    er3 er3Var = this.f8452j;
                    if (er3Var != null) {
                        HashMap hashMap = new HashMap();
                        hashMap.put("evt", inputEvent);
                        er3Var.c(hashMap);
                    } else {
                        this.f8447e.b(20105);
                    }
                } finally {
                }
            }
        } catch (dh | xg e8) {
            this.f8447e.d(20104, e8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void h(java.util.Map r12) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fr3.h(java.util.Map):void");
    }

    final /* synthetic */ a5.d i(xk3 xk3Var) {
        if (this.f8443a.b(xk3Var)) {
            return p64.k(this.f8444b.d(), new hx3() { // from class: com.google.android.gms.internal.ads.yq3
                @Override // com.google.android.gms.internal.ads.hx3
                public final /* synthetic */ Object apply(Object obj) {
                    fr3.this.m((byte[]) obj);
                    return null;
                }
            }, g74.a());
        }
        this.f8447e.b(20103);
        throw new lq3(1);
    }

    final /* synthetic */ String j(final Context context) {
        final HashMap hashMap = new HashMap();
        this.f8447e.f(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zq3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                fr3.this.n(hashMap, context);
            }
        });
        String q7 = q(hashMap);
        hashMap.clear();
        return q7;
    }

    final /* synthetic */ String k(final Context context, String str, final View view, final Activity activity) {
        final HashMap hashMap = new HashMap();
        final String str2 = null;
        this.f8447e.f(20106, new Runnable(hashMap, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.ar3

            /* renamed from: r, reason: collision with root package name */
            private final /* synthetic */ Map f5248r;

            /* renamed from: s, reason: collision with root package name */
            private final /* synthetic */ Context f5249s;

            /* renamed from: t, reason: collision with root package name */
            private final /* synthetic */ View f5250t;

            /* renamed from: u, reason: collision with root package name */
            private final /* synthetic */ Activity f5251u;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                fr3.this.o(this.f5248r, this.f5249s, this.f5250t, this.f5251u, null);
            }
        });
        String q7 = q(hashMap);
        hashMap.clear();
        return q7;
    }

    final /* synthetic */ String l(final Context context, final String str, final View view, Activity activity) {
        final HashMap hashMap = new HashMap();
        final Activity activity2 = null;
        this.f8447e.f(20106, new Runnable(hashMap, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.br3

            /* renamed from: r, reason: collision with root package name */
            private final /* synthetic */ Map f5956r;

            /* renamed from: s, reason: collision with root package name */
            private final /* synthetic */ Context f5957s;

            /* renamed from: t, reason: collision with root package name */
            private final /* synthetic */ View f5958t;

            /* renamed from: u, reason: collision with root package name */
            private final /* synthetic */ String f5959u;

            {
                this.f5959u = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                fr3.this.p(this.f5956r, this.f5957s, this.f5958t, null, this.f5959u);
            }
        });
        String q7 = q(hashMap);
        hashMap.clear();
        return q7;
    }

    final /* synthetic */ Void m(byte[] bArr) {
        zg c8 = ir3.c();
        lu3 a8 = this.f8447e.a(20102);
        try {
            try {
                a8.a();
                synchronized (this.f8448f) {
                    this.f8452j = er3.a(c8, bArr);
                }
                a8.c();
                return null;
            } catch (dh e8) {
                e = e8;
                a8.b(e);
                throw new lq3(2, e);
            } catch (xg e9) {
                e = e9;
                a8.b(e);
                throw new lq3(2, e);
            } catch (Throwable th) {
                a8.b(th);
                throw th;
            }
        } catch (Throwable th2) {
            a8.c();
            throw th2;
        }
    }

    final /* synthetic */ void n(Map map, Context context) {
        map.putAll(this.f8446d.b());
        h(map);
        map.put("f", "q");
        map.put("ctx", context);
    }

    final /* synthetic */ void o(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.f8446d.c(context, view));
        h(map);
        map.put("f", "v");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", activity);
        map.put("bds", null);
    }

    final /* synthetic */ void p(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.f8446d.d());
        h(map);
        map.put("f", "c");
        map.put("ctx", context);
        map.put("view", view);
        map.put("act", null);
        map.put("bds", str);
    }
}
