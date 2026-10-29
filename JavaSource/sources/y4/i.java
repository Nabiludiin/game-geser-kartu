package y4;

/* compiled from: MyApplication */
final class i extends g {

    /* renamed from: q, reason: collision with root package name */
    private final Object f27727q;

    i(Object obj) {
        this.f27727q = obj;
    }

    @Override // y4.g
    public Object b() {
        return this.f27727q;
    }

    @Override // y4.g
    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f27727q.equals(((i) obj).f27727q);
        }
        return false;
    }

    public int hashCode() {
        return this.f27727q.hashCode() + 1502476572;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27727q);
        StringBuilder sb = new StringBuilder(valueOf.length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
