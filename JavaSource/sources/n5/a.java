package n5;

import java.util.List;

/* compiled from: MyApplication */
final class a extends r {

    /* renamed from: a, reason: collision with root package name */
    private final String f25027a;

    /* renamed from: b, reason: collision with root package name */
    private final List f25028b;

    a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f25027a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f25028b = list;
    }

    @Override // n5.r
    public List b() {
        return this.f25028b;
    }

    @Override // n5.r
    public String c() {
        return this.f25027a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f25027a.equals(rVar.c()) && this.f25028b.equals(rVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f25027a.hashCode() ^ 1000003) * 1000003) ^ this.f25028b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f25027a + ", usedDates=" + this.f25028b + "}";
    }
}
