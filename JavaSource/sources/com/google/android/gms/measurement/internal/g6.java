package com.google.android.gms.measurement.internal;

/* compiled from: MyApplication */
public final class g6 {

    /* renamed from: a, reason: collision with root package name */
    final w6 f22169a;

    g6(pd pdVar) {
        this.f22169a = pdVar.g0();
    }

    final boolean a() {
        try {
            w6 w6Var = this.f22169a;
            u3.d a8 = u3.e.a(w6Var.e());
            if (a8 != null) {
                return a8.f("com.android.vending", 128).versionCode >= 80837300;
            }
            w6Var.a().w().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e8) {
            this.f22169a.a().w().b("Failed to retrieve Play Store version for Install Referrer", e8);
            return false;
        }
    }
}
