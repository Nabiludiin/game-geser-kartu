package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* compiled from: MyApplication */
final class g9 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ y f22175q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ w9 f22176r;

    g9(w9 w9Var, y yVar) {
        this.f22175q = yVar;
        Objects.requireNonNull(w9Var);
        this.f22176r = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.f22176r;
        w6 w6Var = w9Var.f22928a;
        d6 x7 = w6Var.x();
        w6 w6Var2 = x7.f22928a;
        x7.h();
        y u7 = x7.u();
        y yVar = this.f22175q;
        if (!d8.u(yVar.b(), u7.b())) {
            w6Var.a().u().b("Lower precedence consent source ignored, proposed source", Integer.valueOf(yVar.b()));
            return;
        }
        SharedPreferences.Editor edit = x7.p().edit();
        edit.putString("dma_consent_settings", yVar.e());
        edit.apply();
        w6Var.a().w().b("Setting DMA consent(FE)", yVar);
        w6 w6Var3 = w9Var.f22928a;
        if (w6Var3.J().D()) {
            w6Var3.J().a0();
        } else {
            w6Var3.J().Y(false);
        }
    }
}
