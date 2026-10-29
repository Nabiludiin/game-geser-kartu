package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class du0 {

    /* renamed from: a, reason: collision with root package name */
    private String f7304a;

    /* renamed from: b, reason: collision with root package name */
    private h35 f7305b;

    /* renamed from: c, reason: collision with root package name */
    private i75 f7306c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f7307d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f7308e = new AtomicBoolean(false);

    du0(pt0 pt0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f7307d = scheduledExecutorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void e() {
        try {
            String i7 = c1.h.a("GET_VARIATIONS_HEADER") ? c1.g.i() : null;
            if (i7 != null && !i7.isEmpty()) {
                this.f7304a = i7;
                byte[] decode = Base64.decode(i7, 10);
                this.f7305b = h35.d0(decode, ez4.b());
                if (((Boolean) s2.b0.c().d(uy.O9)).booleanValue()) {
                    this.f7306c = i75.d0(decode, ez4.b());
                }
                if (((Boolean) s2.b0.c().d(uy.M9)).booleanValue()) {
                    if (((Boolean) s2.b0.c().d(uy.L9)).booleanValue()) {
                        this.f7307d.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.cu0
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                du0.this.e();
                            }
                        }, ((Integer) s2.b0.c().d(uy.N9)).intValue(), TimeUnit.MINUTES);
                    }
                }
            }
        } catch (e05 e8) {
            e = e8;
            r2.t.l().j(e, "ChromeVariations");
        } catch (IllegalArgumentException e9) {
            e = e9;
            r2.t.l().j(e, "ChromeVariations");
        }
    }

    public final void a() {
        if (((Boolean) s2.b0.c().d(uy.L9)).booleanValue() && !this.f7308e.getAndSet(true)) {
            e();
        }
    }

    public final String b() {
        i75 i75Var = this.f7306c;
        if (i75Var != null) {
            return Base64.encodeToString(i75Var.e(), 10);
        }
        return null;
    }

    public final String c() {
        return this.f7304a;
    }

    public final h35 d() {
        return this.f7305b;
    }
}
