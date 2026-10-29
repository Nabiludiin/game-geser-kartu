package g0;

/* compiled from: MyApplication */
final class b extends m {

    /* renamed from: a, reason: collision with root package name */
    private final Object f23811a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23812b;

    public b(Object obj, int i7) {
        super(null);
        this.f23811a = obj;
        this.f23812b = i7;
    }

    public final void a() {
        Object obj = this.f23811a;
        if (!((obj != null ? obj.hashCode() : 0) == this.f23812b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object b() {
        return this.f23811a;
    }
}
