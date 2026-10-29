package m1;

/* compiled from: MyApplication */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f24686a;

    /* renamed from: b, reason: collision with root package name */
    public final int f24687b;

    public g(String str, int i7) {
        this.f24686a = str;
        this.f24687b = i7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f24687b != gVar.f24687b) {
            return false;
        }
        return this.f24686a.equals(gVar.f24686a);
    }

    public int hashCode() {
        return (this.f24686a.hashCode() * 31) + this.f24687b;
    }
}
