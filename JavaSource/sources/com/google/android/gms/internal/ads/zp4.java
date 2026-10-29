package com.google.android.gms.internal.ads;

import java.security.spec.ECParameterSpec;

/* compiled from: MyApplication */
public final class zp4 {

    /* renamed from: c, reason: collision with root package name */
    public static final zp4 f20273c = new zp4("NIST_P256", gg4.f8906a);

    /* renamed from: d, reason: collision with root package name */
    public static final zp4 f20274d = new zp4("NIST_P384", gg4.f8907b);

    /* renamed from: e, reason: collision with root package name */
    public static final zp4 f20275e = new zp4("NIST_P521", gg4.f8908c);

    /* renamed from: a, reason: collision with root package name */
    private final String f20276a;

    /* renamed from: b, reason: collision with root package name */
    private final ECParameterSpec f20277b;

    private zp4(String str, ECParameterSpec eCParameterSpec) {
        this.f20276a = str;
        this.f20277b = eCParameterSpec;
    }

    public final ECParameterSpec a() {
        return this.f20277b;
    }

    public final String toString() {
        return this.f20276a;
    }
}
