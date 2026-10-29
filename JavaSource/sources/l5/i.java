package l5;

/* compiled from: MyApplication */
class i implements i5.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f24659a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24660b = false;

    /* renamed from: c, reason: collision with root package name */
    private i5.c f24661c;

    /* renamed from: d, reason: collision with root package name */
    private final f f24662d;

    i(f fVar) {
        this.f24662d = fVar;
    }

    private void a() {
        if (this.f24659a) {
            throw new i5.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f24659a = true;
    }

    @Override // i5.g
    public i5.g b(String str) {
        a();
        this.f24662d.f(this.f24661c, str, this.f24660b);
        return this;
    }

    @Override // i5.g
    public i5.g c(boolean z7) {
        a();
        this.f24662d.k(this.f24661c, z7, this.f24660b);
        return this;
    }

    void d(i5.c cVar, boolean z7) {
        this.f24659a = false;
        this.f24661c = cVar;
        this.f24660b = z7;
    }
}
