package p4;

/* compiled from: MyApplication */
public final class o2 implements n2 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f25487a;

    private o2(Object obj) {
        this.f25487a = obj;
    }

    public static n2 b(Object obj) {
        if (obj != null) {
            return new o2(obj);
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // p4.r2
    public final Object a() {
        return this.f25487a;
    }
}
