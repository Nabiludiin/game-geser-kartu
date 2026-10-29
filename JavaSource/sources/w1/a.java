package w1;

/* compiled from: MyApplication */
final class a extends c {

    /* renamed from: a, reason: collision with root package name */
    private final Integer f27043a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f27044b;

    /* renamed from: c, reason: collision with root package name */
    private final d f27045c;

    a(Integer num, Object obj, d dVar) {
        this.f27043a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f27044b = obj;
        if (dVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f27045c = dVar;
    }

    @Override // w1.c
    public Integer a() {
        return this.f27043a;
    }

    @Override // w1.c
    public Object b() {
        return this.f27044b;
    }

    @Override // w1.c
    public d c() {
        return this.f27045c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f27043a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f27044b.equals(cVar.b()) && this.f27045c.equals(cVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f27043a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f27044b.hashCode()) * 1000003) ^ this.f27045c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.f27043a + ", payload=" + this.f27044b + ", priority=" + this.f27045c + "}";
    }
}
