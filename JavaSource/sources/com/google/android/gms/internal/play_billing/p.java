package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
enum p {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final m0 G;

    /* renamed from: q, reason: collision with root package name */
    private final int f21705q;

    static {
        l0 l0Var = new l0();
        for (p pVar : values()) {
            l0Var.a(Integer.valueOf(pVar.f21705q), pVar);
        }
        G = l0Var.b();
    }

    p(int i7) {
        this.f21705q = i7;
    }

    static p c(int i7) {
        m0 m0Var = G;
        Integer valueOf = Integer.valueOf(i7);
        return !m0Var.containsKey(valueOf) ? RESPONSE_CODE_UNSPECIFIED : (p) m0Var.get(valueOf);
    }
}
