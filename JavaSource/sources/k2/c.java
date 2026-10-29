package k2;

/* compiled from: MyApplication */
public enum c {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* renamed from: q, reason: collision with root package name */
    private final int f24388q;

    c(int i7) {
        this.f24388q = i7;
    }

    public static c c(int i7) {
        for (c cVar : values()) {
            if (cVar.d() == i7) {
                return cVar;
            }
        }
        return null;
    }

    public int d() {
        return this.f24388q;
    }
}
