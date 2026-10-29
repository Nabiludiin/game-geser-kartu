package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class wp extends bq {

    /* renamed from: h, reason: collision with root package name */
    private static volatile Long f18366h;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f18367i = new Object();

    public wp(ko koVar, String str, String str2, ak akVar, int i7, int i8) {
        super(koVar, "VYNLVwJcUVwKHNYqtTAMU2Cbdf8xQvz3Fr3MGMTI+Feinwv11ysZpnAq/2AMk2I1", "XCAdtiyR5t8AMQ7u4CMXLD5NJ9dD+Tw+KRPDn9OS+vQ=", akVar, i7, 33);
    }

    @Override // com.google.android.gms.internal.ads.bq
    protected final void a() {
        if (f18366h == null) {
            synchronized (f18367i) {
                try {
                    if (f18366h == null) {
                        f18366h = (Long) this.f5899e.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        ak akVar = this.f5898d;
        synchronized (akVar) {
            akVar.G0(f18366h.longValue());
        }
    }
}
