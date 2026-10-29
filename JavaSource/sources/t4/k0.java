package t4;

/* compiled from: MyApplication */
public enum k0 {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* renamed from: q, reason: collision with root package name */
    private final int f26414q;

    k0(int i7) {
        this.f26414q = i7;
    }

    public static k0 c(int i7) {
        for (k0 k0Var : values()) {
            if (k0Var.f26414q == i7) {
                return k0Var;
            }
        }
        return UNKNOWN;
    }

    public final int a() {
        return this.f26414q;
    }
}
