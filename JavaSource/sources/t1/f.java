package t1;

/* compiled from: MyApplication */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private int f26362a;

    /* renamed from: b, reason: collision with root package name */
    private int f26363b;

    public f(int i7, int i8) {
        this.f26362a = i7;
        this.f26363b = i8;
    }

    public int a() {
        return this.f26363b;
    }

    public int b() {
        return this.f26362a;
    }

    public void c(int i7) {
        this.f26363b = i7;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof f) && this.f26362a == ((f) obj).f26362a;
    }
}
