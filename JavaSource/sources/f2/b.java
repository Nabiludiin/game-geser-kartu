package f2;

import java.util.Map;

/* compiled from: MyApplication */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final i2.a f23641a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f23642b;

    b(i2.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f23641a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f23642b = map;
    }

    @Override // f2.f
    i2.a e() {
        return this.f23641a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f23641a.equals(fVar.e()) && this.f23642b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // f2.f
    Map h() {
        return this.f23642b;
    }

    public int hashCode() {
        return ((this.f23641a.hashCode() ^ 1000003) * 1000003) ^ this.f23642b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f23641a + ", values=" + this.f23642b + "}";
    }
}
