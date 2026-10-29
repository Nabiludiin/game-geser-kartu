package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MyApplication */
public final class uz extends androidx.browser.customtabs.e {

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f17271b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    private Context f17272c;

    /* renamed from: d, reason: collision with root package name */
    private rx1 f17273d;

    /* renamed from: e, reason: collision with root package name */
    private androidx.browser.customtabs.f f17274e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.browser.customtabs.c f17275f;

    private final void h(Context context) {
        String c8;
        if (this.f17275f != null || context == null || (c8 = androidx.browser.customtabs.c.c(context, null)) == null || c8.equals(context.getPackageName())) {
            return;
        }
        androidx.browser.customtabs.c.a(context, c8, this);
    }

    @Override // androidx.browser.customtabs.e
    public final void a(ComponentName componentName, androidx.browser.customtabs.c cVar) {
        this.f17275f = cVar;
        cVar.g(0L);
        this.f17274e = cVar.e(new rz(this));
    }

    public final void c(Context context, rx1 rx1Var) {
        if (this.f17271b.getAndSet(true)) {
            return;
        }
        this.f17272c = context;
        this.f17273d = rx1Var;
        h(context);
    }

    public final androidx.browser.customtabs.f d() {
        if (this.f17274e == null) {
            cm0.f6500a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.tz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    uz.this.f();
                }
            });
        }
        return this.f17274e;
    }

    public final void e(final int i7) {
        if (!((Boolean) s2.b0.c().d(uy.f17114h5)).booleanValue() || this.f17273d == null) {
            return;
        }
        cm0.f6500a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.sz
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                uz.this.g(i7);
            }
        });
    }

    final /* synthetic */ void f() {
        h(this.f17272c);
    }

    final /* synthetic */ void g(int i7) {
        rx1 rx1Var = this.f17273d;
        if (rx1Var != null) {
            qx1 a8 = rx1Var.a();
            a8.c("action", "cct_nav");
            a8.c("cct_navs", String.valueOf(i7));
            a8.d();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f17275f = null;
        this.f17274e = null;
    }
}
