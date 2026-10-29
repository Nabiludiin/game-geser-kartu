package com.google.android.gms.measurement.internal;

import android.os.Handler;
import android.os.Looper;

/* compiled from: MyApplication */
public final class mc extends e5 {

    /* renamed from: c, reason: collision with root package name */
    private Handler f22374c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f22375d;

    /* renamed from: e, reason: collision with root package name */
    protected final lc f22376e;

    /* renamed from: f, reason: collision with root package name */
    protected final kc f22377f;

    /* renamed from: g, reason: collision with root package name */
    protected final hc f22378g;

    mc(w6 w6Var) {
        super(w6Var);
        this.f22375d = true;
        this.f22376e = new lc(this);
        this.f22377f = new kc(this);
        this.f22378g = new hc(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f22374c == null) {
            this.f22374c = new com.google.android.gms.internal.measurement.r1(Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.e5
    protected final boolean m() {
        return false;
    }

    final void o(boolean z7) {
        h();
        this.f22375d = z7;
    }

    final boolean p() {
        h();
        return this.f22375d;
    }

    final /* synthetic */ void r(long j7) {
        h();
        q();
        w6 w6Var = this.f22928a;
        w6Var.a().w().b("Activity resumed, time", Long.valueOf(j7));
        if (w6Var.w().H(null, c5.V0)) {
            if (w6Var.w().N() || this.f22375d) {
                this.f22377f.a(j7);
            }
        } else if (w6Var.w().N() || w6Var.x().f22040t.a()) {
            this.f22377f.a(j7);
        }
        this.f22378g.a();
        lc lcVar = this.f22376e;
        mc mcVar = lcVar.f22338a;
        mcVar.h();
        if (mcVar.f22928a.g()) {
            lcVar.b(mcVar.f22928a.f().a(), false);
        }
    }

    final /* synthetic */ void s(long j7) {
        h();
        q();
        w6 w6Var = this.f22928a;
        w6Var.a().w().b("Activity paused, time", Long.valueOf(j7));
        this.f22378g.b(j7);
        if (w6Var.w().N()) {
            this.f22377f.b(j7);
        }
    }

    final /* synthetic */ Handler t() {
        return this.f22374c;
    }
}
