package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class bg implements ag {

    /* renamed from: a, reason: collision with root package name */
    public static final i9 f20845a;

    static {
        c9 b8 = new c9(x8.a("com.google.android.gms.measurement")).a().b();
        f20845a = b8.d("measurement.tcf.consent_fix", true);
        b8.d("measurement.tcf.client", true);
        b8.d("measurement.tcf.empty_pref_fix", true);
    }

    @Override // com.google.android.gms.internal.measurement.ag
    public final boolean a() {
        return ((Boolean) f20845a.d()).booleanValue();
    }
}
