package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final /* synthetic */ class az0 implements w54 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ az0 f5407a = new az0();

    private /* synthetic */ az0() {
    }

    @Override // com.google.android.gms.internal.ads.w54
    public final /* synthetic */ a5.d d(Object obj) {
        Throwable th = (Throwable) obj;
        if (((Boolean) s2.b0.c().d(uy.wb)).booleanValue()) {
            r2.t.l().k(th, "GetTopicsApiWithRecordObservationActionHandlerUnsampled");
        } else {
            r2.t.l().j(th, "GetTopicsApiWithRecordObservationActionHandler");
        }
        return p64.a(new androidx.privacysandbox.ads.adservices.topics.i(w04.m()));
    }
}
