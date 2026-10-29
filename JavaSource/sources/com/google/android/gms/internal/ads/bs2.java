package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class bs2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5974a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f5975b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f5976c;

    /* renamed from: d, reason: collision with root package name */
    private final b63 f5977d;

    /* renamed from: e, reason: collision with root package name */
    private final rx1 f5978e;

    /* renamed from: f, reason: collision with root package name */
    private long f5979f = 0;

    /* renamed from: g, reason: collision with root package name */
    private int f5980g = 0;

    public bs2(Context context, Executor executor, Set set, b63 b63Var, rx1 rx1Var) {
        this.f5974a = context;
        this.f5976c = executor;
        this.f5975b = set;
        this.f5977d = b63Var;
        this.f5978e = rx1Var;
    }

    public final a5.d a(final Object obj, final Bundle bundle, final boolean z7) {
        r53 a8 = q53.a(this.f5974a, 8);
        a8.a();
        Set<yr2> set = this.f5975b;
        final ArrayList arrayList = new ArrayList(set.size());
        List arrayList2 = new ArrayList();
        ly lyVar = uy.Lc;
        if (!((String) s2.b0.c().d(lyVar)).isEmpty()) {
            arrayList2 = Arrays.asList(((String) s2.b0.c().d(lyVar)).split(","));
        }
        this.f5979f = r2.t.o().b();
        final Bundle bundle2 = new Bundle();
        if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue() && bundle != null) {
            long a9 = r2.t.o().a();
            if (obj instanceof x81) {
                bundle.putLong(yw1.CLIENT_SIGNALS_START.c(), a9);
            } else {
                bundle.putLong(yw1.GMS_SIGNALS_START.c(), a9);
            }
        }
        for (final yr2 yr2Var : set) {
            if (!arrayList2.contains(String.valueOf(yr2Var.b()))) {
                final long b8 = r2.t.o().b();
                a5.d a10 = yr2Var.a();
                final Bundle bundle3 = bundle2;
                a10.c(new Runnable() { // from class: com.google.android.gms.internal.ads.zr2
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        bs2.this.b(b8, yr2Var, bundle3);
                    }
                }, cm0.f6506g);
                arrayList.add(a10);
                bundle2 = bundle3;
            }
        }
        a5.d a11 = p64.p(arrayList).a(new Callable() { // from class: com.google.android.gms.internal.ads.as2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Object obj2;
                Bundle bundle4;
                Iterator it = arrayList.iterator();
                while (true) {
                    obj2 = obj;
                    if (!it.hasNext()) {
                        break;
                    }
                    wr2 wr2Var = (wr2) ((a5.d) it.next()).get();
                    if (wr2Var != null) {
                        boolean z8 = z7;
                        wr2Var.d(obj2);
                        if (z8) {
                            wr2Var.b(obj2);
                        }
                    }
                }
                if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue() && (bundle4 = bundle) != null) {
                    Bundle bundle5 = bundle2;
                    long a12 = r2.t.o().a();
                    if (obj2 instanceof x81) {
                        bundle4.putLong(yw1.CLIENT_SIGNALS_END.c(), a12);
                        bundle4.putBundle("client_sig_latency_key", bundle5);
                        return obj2;
                    }
                    bundle4.putLong(yw1.GMS_SIGNALS_END.c(), a12);
                    bundle4.putBundle("gms_sig_latency_key", bundle5);
                }
                return obj2;
            }
        }, this.f5976c);
        if (e63.a()) {
            a63.d(a11, this.f5977d, a8);
        }
        return a11;
    }

    final /* synthetic */ void b(long j7, yr2 yr2Var, Bundle bundle) {
        long b8 = r2.t.o().b() - j7;
        if (((Boolean) y00.f19324a.e()).booleanValue()) {
            String a8 = iy3.a(yr2Var.getClass().getCanonicalName());
            StringBuilder sb = new StringBuilder(a8.length() + 25 + String.valueOf(b8).length());
            sb.append("Signal runtime (ms) : ");
            sb.append(a8);
            sb.append(" = ");
            sb.append(b8);
            v2.n1.k(sb.toString());
        }
        if (((Boolean) s2.b0.c().d(uy.f17224v2)).booleanValue()) {
            if (((Boolean) s2.b0.c().d(uy.B2)).booleanValue()) {
                synchronized (this) {
                    int b9 = yr2Var.b();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(b9).length() + 3);
                    sb2.append("sig");
                    sb2.append(b9);
                    bundle.putLong(sb2.toString(), b8);
                }
            }
        }
        if (((Boolean) s2.b0.c().d(uy.f17208t2)).booleanValue()) {
            qx1 a9 = this.f5978e.a();
            a9.c("action", "lat_ms");
            a9.c("lat_grp", "sig_lat_grp");
            a9.c("lat_id", String.valueOf(yr2Var.b()));
            a9.c("clat_ms", String.valueOf(b8));
            if (((Boolean) s2.b0.c().d(uy.f17216u2)).booleanValue()) {
                synchronized (this) {
                    this.f5980g++;
                }
                a9.c("seq_num", r2.t.l().t().l());
                synchronized (this) {
                    try {
                        if (this.f5980g == this.f5975b.size() && this.f5979f != 0) {
                            this.f5980g = 0;
                            String valueOf = String.valueOf(r2.t.o().b() - this.f5979f);
                            if (yr2Var.b() <= 39 || yr2Var.b() >= 52) {
                                a9.c("lat_clsg", valueOf);
                            } else {
                                a9.c("lat_gmssg", valueOf);
                            }
                        }
                    } finally {
                    }
                }
            }
            a9.h();
        }
    }
}
