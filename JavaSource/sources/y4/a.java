package y4;

/* compiled from: MyApplication */
final class a extends g {

    /* renamed from: q, reason: collision with root package name */
    static final a f27718q = new a();

    private a() {
    }

    static g e() {
        return f27718q;
    }

    @Override // y4.g
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // y4.g
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
