package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
final class io2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f10104a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10105b;

    /* renamed from: c, reason: collision with root package name */
    private final Bundle f10106c;

    /* synthetic */ io2(String str, String str2, Bundle bundle, byte[] bArr) {
        this.f10104a = str;
        this.f10105b = str2;
        this.f10106c = bundle;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public /* synthetic */ void b(Object obj) {
        vr2.a(this, obj);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        bundle.putString("consent_string", this.f10104a);
        bundle.putString("fc_consent", this.f10105b);
        Bundle bundle2 = this.f10106c;
        if (bundle2 != null) {
            bundle.putBundle("iab_consent_info", bundle2);
        }
    }
}
