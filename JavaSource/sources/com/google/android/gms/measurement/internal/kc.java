package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: MyApplication */
final class kc {

    /* renamed from: a, reason: collision with root package name */
    protected long f22304a;

    /* renamed from: b, reason: collision with root package name */
    protected long f22305b;

    /* renamed from: c, reason: collision with root package name */
    private final x f22306c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ mc f22307d;

    public kc(mc mcVar) {
        Objects.requireNonNull(mcVar);
        this.f22307d = mcVar;
        this.f22306c = new ic(this, mcVar.f22928a);
        long b8 = mcVar.f22928a.f().b();
        this.f22304a = b8;
        this.f22305b = b8;
    }

    final void a(long j7) {
        this.f22307d.h();
        this.f22306c.d();
        this.f22304a = j7;
        this.f22305b = j7;
    }

    final void b(long j7) {
        this.f22306c.d();
    }

    final void c() {
        this.f22306c.d();
        long b8 = this.f22307d.f22928a.f().b();
        this.f22304a = b8;
        this.f22305b = b8;
    }

    public final boolean d(boolean z7, boolean z8, long j7) {
        mc mcVar = this.f22307d;
        mcVar.h();
        mcVar.j();
        if (mcVar.f22928a.g()) {
            w6 w6Var = mcVar.f22928a;
            w6Var.x().f22037q.b(w6Var.f().a());
        }
        long j8 = j7 - this.f22304a;
        if (!z7 && j8 < 1000) {
            mcVar.f22928a.a().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j8));
            return false;
        }
        if (!z8) {
            j8 = j7 - this.f22305b;
            this.f22305b = j7;
        }
        w6 w6Var2 = mcVar.f22928a;
        w6Var2.a().w().b("Recording user engagement, ms", Long.valueOf(j8));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j8);
        boolean z9 = !w6Var2.w().N();
        w6 w6Var3 = mcVar.f22928a;
        yd.k0(w6Var3.I().q(z9), bundle, true);
        if (!z8) {
            w6Var3.B().t("auto", "_e", bundle);
        }
        this.f22304a = j7;
        x xVar = this.f22306c;
        xVar.d();
        xVar.b(((Long) c5.f21980r0.b(null)).longValue());
        return true;
    }
}
