package androidx.privacysandbox.ads.adservices.topics;

/* compiled from: MyApplication */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private final long f2588a;

    /* renamed from: b, reason: collision with root package name */
    private final long f2589b;

    /* renamed from: c, reason: collision with root package name */
    private final int f2590c;

    public v(long j7, long j8, int i7) {
        this.f2588a = j7;
        this.f2589b = j8;
        this.f2590c = i7;
    }

    public final long a() {
        return this.f2589b;
    }

    public final long b() {
        return this.f2588a;
    }

    public final int c() {
        return this.f2590c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f2588a == vVar.f2588a && this.f2589b == vVar.f2589b && this.f2590c == vVar.f2590c;
    }

    public int hashCode() {
        return (((u.a(this.f2588a) * 31) + u.a(this.f2589b)) * 31) + this.f2590c;
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f2588a + ", ModelVersion=" + this.f2589b + ", TopicCode=" + this.f2590c + " }");
    }
}
