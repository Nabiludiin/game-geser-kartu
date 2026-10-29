package c6;

/* compiled from: MyApplication */
public enum q {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);


    /* renamed from: q, reason: collision with root package name */
    final int f3663q;

    q(int i7) {
        this.f3663q = i7;
    }

    public static boolean c(int i7) {
        return (i7 & OFFLINE.f3663q) != 0;
    }

    public static boolean d(int i7) {
        return (i7 & NO_CACHE.f3663q) == 0;
    }

    public static boolean j(int i7) {
        return (i7 & NO_STORE.f3663q) == 0;
    }
}
