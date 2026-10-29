package v2;

/* compiled from: MyApplication */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f26740a;

    /* renamed from: b, reason: collision with root package name */
    public final double f26741b;

    /* renamed from: c, reason: collision with root package name */
    public final double f26742c;

    /* renamed from: d, reason: collision with root package name */
    public final double f26743d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26744e;

    public f0(String str, double d8, double d9, double d10, int i7) {
        this.f26740a = str;
        this.f26742c = d8;
        this.f26741b = d9;
        this.f26743d = d10;
        this.f26744e = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p3.n.a(this.f26740a, f0Var.f26740a) && this.f26741b == f0Var.f26741b && this.f26742c == f0Var.f26742c && this.f26744e == f0Var.f26744e && Double.compare(this.f26743d, f0Var.f26743d) == 0;
    }

    public final int hashCode() {
        return p3.n.b(this.f26740a, Double.valueOf(this.f26741b), Double.valueOf(this.f26742c), Double.valueOf(this.f26743d), Integer.valueOf(this.f26744e));
    }

    public final String toString() {
        return p3.n.c(this).a("name", this.f26740a).a("minBound", Double.valueOf(this.f26742c)).a("maxBound", Double.valueOf(this.f26741b)).a("percent", Double.valueOf(this.f26743d)).a("count", Integer.valueOf(this.f26744e)).toString();
    }
}
