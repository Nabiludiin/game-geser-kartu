package i1;

/* compiled from: MyApplication */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private boolean f24161a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24162b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24163c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f24164d;

    public b(boolean z7, boolean z8, boolean z9, boolean z10) {
        this.f24161a = z7;
        this.f24162b = z8;
        this.f24163c = z9;
        this.f24164d = z10;
    }

    public boolean a() {
        return this.f24161a;
    }

    public boolean b() {
        return this.f24163c;
    }

    public boolean c() {
        return this.f24164d;
    }

    public boolean d() {
        return this.f24162b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24161a == bVar.f24161a && this.f24162b == bVar.f24162b && this.f24163c == bVar.f24163c && this.f24164d == bVar.f24164d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r02 = this.f24161a;
        int i7 = r02;
        if (this.f24162b) {
            i7 = r02 + 16;
        }
        int i8 = i7;
        if (this.f24163c) {
            i8 = i7 + 256;
        }
        return this.f24164d ? i8 + 4096 : i8;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f24161a), Boolean.valueOf(this.f24162b), Boolean.valueOf(this.f24163c), Boolean.valueOf(this.f24164d));
    }
}
