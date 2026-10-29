package com.google.android.gms.internal.ads;

import android.util.Base64;

/* compiled from: MyApplication */
final /* synthetic */ class ts2 implements w54 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ ts2 f16350a = new ts2();

    private /* synthetic */ ts2() {
    }

    @Override // com.google.android.gms.internal.ads.w54
    public final /* synthetic */ a5.d d(Object obj) {
        androidx.privacysandbox.ads.adservices.topics.i iVar = (androidx.privacysandbox.ads.adservices.topics.i) obj;
        if (iVar == null) {
            return p64.a(new vs2("", 1, null));
        }
        m35 d02 = n35.d0();
        for (androidx.privacysandbox.ads.adservices.topics.v vVar : iVar.a()) {
            k35 d03 = l35.d0();
            d03.E(vVar.c());
            d03.F(vVar.a());
            d03.G(vVar.b());
            d02.E((l35) d03.A());
        }
        return p64.a(new vs2(Base64.encodeToString(((n35) d02.A()).e(), 1), 1, null));
    }
}
