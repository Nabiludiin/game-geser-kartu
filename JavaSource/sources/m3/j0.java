package m3;

/* compiled from: MyApplication */
final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final b f24815a;

    /* renamed from: b, reason: collision with root package name */
    private final k3.d f24816b;

    /* synthetic */ j0(b bVar, k3.d dVar, i0 i0Var) {
        this.f24815a = bVar;
        this.f24816b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof j0)) {
            j0 j0Var = (j0) obj;
            if (p3.n.a(this.f24815a, j0Var.f24815a) && p3.n.a(this.f24816b, j0Var.f24816b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return p3.n.b(this.f24815a, this.f24816b);
    }

    public final String toString() {
        return p3.n.c(this).a("key", this.f24815a).a("feature", this.f24816b).toString();
    }
}
