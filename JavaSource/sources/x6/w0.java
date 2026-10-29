package x6;

/* compiled from: MyApplication */
final class w0 implements h1 {

    /* renamed from: q, reason: collision with root package name */
    private final boolean f27453q;

    public w0(boolean z7) {
        this.f27453q = z7;
    }

    @Override // x6.h1
    public boolean c() {
        return this.f27453q;
    }

    @Override // x6.h1
    public y1 f() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(c() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
