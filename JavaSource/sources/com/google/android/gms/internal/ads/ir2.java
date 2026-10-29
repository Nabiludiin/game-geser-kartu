package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class ir2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10149a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10150b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10151c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10152d;

    /* renamed from: e, reason: collision with root package name */
    public final Long f10153e;

    public ir2(String str, String str2, String str3, String str4, Long l7) {
        this.f10149a = str;
        this.f10150b = str2;
        this.f10151c = str3;
        this.f10152d = str4;
        this.f10153e = l7;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        m13.e(((x81) obj).f18665b, "fbs_aeid", this.f10151c);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        m13.e(bundle, "gmp_app_id", this.f10149a);
        m13.e(bundle, "fbs_aiid", this.f10150b);
        m13.e(bundle, "fbs_aeid", this.f10151c);
        m13.e(bundle, "apm_id_origin", this.f10152d);
        Long l7 = this.f10153e;
        if (l7 != null) {
            bundle.putLong("sai_timeout", l7.longValue());
        }
    }
}
