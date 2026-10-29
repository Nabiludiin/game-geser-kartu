package c6;

/* compiled from: MyApplication */
public enum p {
    NO_CACHE(1),
    NO_STORE(2);


    /* renamed from: q, reason: collision with root package name */
    final int f3658q;

    p(int i7) {
        this.f3658q = i7;
    }

    static boolean c(int i7) {
        return (i7 & NO_CACHE.f3658q) == 0;
    }

    static boolean d(int i7) {
        return (i7 & NO_STORE.f3658q) == 0;
    }
}
