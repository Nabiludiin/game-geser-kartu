package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class kq2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f11201a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f11202b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11203c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11204d;

    /* renamed from: e, reason: collision with root package name */
    private final String f11205e;

    /* renamed from: f, reason: collision with root package name */
    private final String f11206f;

    public kq2(String str, Integer num, String str2, String str3, String str4, String str5) {
        this.f11201a = str;
        this.f11202b = num;
        this.f11203c = str2;
        this.f11204d = str3;
        this.f11205e = str4;
        this.f11206f = str5;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Bundle bundle = ((x81) obj).f18665b;
        m13.e(bundle, "pn", this.f11201a);
        m13.e(bundle, "dl", this.f11204d);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        m13.e(bundle, "pn", this.f11201a);
        m13.h(bundle, "vc", this.f11202b);
        m13.e(bundle, "vnm", this.f11203c);
        m13.e(bundle, "dl", this.f11204d);
        m13.e(bundle, "ins_pn", this.f11205e);
        m13.e(bundle, "ini_pn", this.f11206f);
    }
}
