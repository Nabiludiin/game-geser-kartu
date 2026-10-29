package com.android.billingclient.api;

import android.content.Context;
import com.google.android.gms.internal.play_billing.a8;
import com.google.android.gms.internal.play_billing.b6;
import com.google.android.gms.internal.play_billing.d6;
import com.google.android.gms.internal.play_billing.f6;
import com.google.android.gms.internal.play_billing.i6;
import com.google.android.gms.internal.play_billing.i7;
import com.google.android.gms.internal.play_billing.o7;
import com.google.android.gms.internal.play_billing.q6;
import com.google.android.gms.internal.play_billing.q7;
import com.google.android.gms.internal.play_billing.w7;
import com.google.android.gms.internal.play_billing.x6;
import com.google.android.gms.internal.play_billing.z6;

/* compiled from: MyApplication */
final class o0 implements m0 {

    /* renamed from: b, reason: collision with root package name */
    private z6 f4037b;

    /* renamed from: c, reason: collision with root package name */
    private final p0 f4038c;

    o0(Context context, z6 z6Var) {
        this.f4038c = new p0(context);
        this.f4037b = z6Var;
    }

    private final void l(d6 d6Var, z6 z6Var) {
        if (d6Var == null) {
            return;
        }
        try {
            o7 H = q7.H();
            H.s(z6Var);
            H.p(d6Var);
            this.f4038c.a((q7) H.l());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    private final void m(i6 i6Var, z6 z6Var) {
        if (i6Var == null) {
            return;
        }
        try {
            o7 H = q7.H();
            H.s(z6Var);
            H.q(i6Var);
            this.f4038c.a((q7) H.l());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.m0
    public final void a(d6 d6Var, int i7, long j7, boolean z7) {
        z6 z6Var;
        try {
            x6 x6Var = (x6) this.f4037b.o();
            x6Var.r(i7);
            this.f4037b = (z6) x6Var.l();
            b6 b6Var = (b6) d6Var.o();
            i7 i7Var = (i7) d6Var.C().o();
            i7Var.p(z7);
            b6Var.r(i7Var);
            d6 d6Var2 = (d6) b6Var.l();
            if (j7 == 0) {
                z6Var = this.f4037b;
            } else {
                x6 x6Var2 = (x6) this.f4037b.o();
                x6Var2.v(j7);
                z6Var = (z6) x6Var2.l();
            }
            l(d6Var2, z6Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.m0
    public final void b(d6 d6Var) {
        try {
            l(d6Var, this.f4037b);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.m0
    public final void c(q6 q6Var) {
        try {
            o7 H = q7.H();
            H.s(this.f4037b);
            H.r(q6Var);
            this.f4038c.a((q7) H.l());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.m0
    public final void d(i6 i6Var, int i7) {
        try {
            x6 x6Var = (x6) this.f4037b.o();
            x6Var.r(i7);
            this.f4037b = (z6) x6Var.l();
            h(i6Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.m0
    public final void e(w7 w7Var) {
        try {
            p0 p0Var = this.f4038c;
            o7 H = q7.H();
            H.s(this.f4037b);
            H.v(w7Var);
            p0Var.a((q7) H.l());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.m0
    public final void f(i6 i6Var, long j7, boolean z7) {
        z6 z6Var;
        try {
            f6 f6Var = (f6) i6Var.o();
            i7 i7Var = (i7) i6Var.B().o();
            i7Var.p(z7);
            f6Var.q(i7Var);
            i6 i6Var2 = (i6) f6Var.l();
            if (j7 == 0) {
                z6Var = this.f4037b;
            } else {
                x6 x6Var = (x6) this.f4037b.o();
                x6Var.v(j7);
                z6Var = (z6) x6Var.l();
            }
            m(i6Var2, z6Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.m0
    public final void g(d6 d6Var, long j7, boolean z7) {
        z6 z6Var;
        try {
            b6 b6Var = (b6) d6Var.o();
            i7 i7Var = (i7) d6Var.C().o();
            i7Var.p(z7);
            b6Var.r(i7Var);
            d6 d6Var2 = (d6) b6Var.l();
            if (j7 == 0) {
                z6Var = this.f4037b;
            } else {
                x6 x6Var = (x6) this.f4037b.o();
                x6Var.v(j7);
                z6Var = (z6) x6Var.l();
            }
            l(d6Var2, z6Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.m0
    public final void h(i6 i6Var) {
        try {
            m(i6Var, this.f4037b);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.m0
    public final void i(a8 a8Var) {
        if (a8Var == null) {
            return;
        }
        try {
            o7 H = q7.H();
            H.s(this.f4037b);
            H.w(a8Var);
            this.f4038c.a((q7) H.l());
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.m0
    public final void j(d6 d6Var, int i7, long j7) {
        try {
            x6 x6Var = (x6) this.f4037b.o();
            x6Var.r(i7);
            z6 z6Var = (z6) x6Var.l();
            this.f4037b = z6Var;
            if (j7 != 0) {
                x6 x6Var2 = (x6) z6Var.o();
                x6Var2.v(j7);
                z6Var = (z6) x6Var2.l();
            }
            l(d6Var, z6Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.m0
    public final void k(d6 d6Var, int i7) {
        try {
            x6 x6Var = (x6) this.f4037b.o();
            x6Var.r(i7);
            this.f4037b = (z6) x6Var.l();
            b(d6Var);
        } catch (Throwable th) {
            com.google.android.gms.internal.play_billing.q0.m("BillingLogger", "Unable to log.", th);
        }
    }
}
