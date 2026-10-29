package m1;

/* compiled from: MyApplication */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public String f24681a;

    /* renamed from: b, reason: collision with root package name */
    public Long f24682b;

    public d(String str, boolean z7) {
        this(str, z7 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f24681a.equals(dVar.f24681a)) {
            return false;
        }
        Long l7 = this.f24682b;
        Long l8 = dVar.f24682b;
        return l7 != null ? l7.equals(l8) : l8 == null;
    }

    public int hashCode() {
        int hashCode = this.f24681a.hashCode() * 31;
        Long l7 = this.f24682b;
        return hashCode + (l7 != null ? l7.hashCode() : 0);
    }

    public d(String str, long j7) {
        this.f24681a = str;
        this.f24682b = Long.valueOf(j7);
    }
}
