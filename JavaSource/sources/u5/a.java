package u5;

/* compiled from: MyApplication */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f26571a;

    /* renamed from: b, reason: collision with root package name */
    private final String f26572b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f26571a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f26572b = str2;
    }

    @Override // u5.f
    public String b() {
        return this.f26571a;
    }

    @Override // u5.f
    public String c() {
        return this.f26572b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f26571a.equals(fVar.b()) && this.f26572b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f26571a.hashCode() ^ 1000003) * 1000003) ^ this.f26572b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f26571a + ", version=" + this.f26572b + "}";
    }
}
