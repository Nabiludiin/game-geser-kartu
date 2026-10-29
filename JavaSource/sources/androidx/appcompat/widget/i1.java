package androidx.appcompat.widget;

/* compiled from: MyApplication */
class i1 {

    /* renamed from: a, reason: collision with root package name */
    private int f745a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f746b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f747c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    private int f748d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    private int f749e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f750f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f751g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f752h = false;

    i1() {
    }

    public int a() {
        return this.f751g ? this.f745a : this.f746b;
    }

    public int b() {
        return this.f745a;
    }

    public int c() {
        return this.f746b;
    }

    public int d() {
        return this.f751g ? this.f746b : this.f745a;
    }

    public void e(int i7, int i8) {
        this.f752h = false;
        if (i7 != Integer.MIN_VALUE) {
            this.f749e = i7;
            this.f745a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f750f = i8;
            this.f746b = i8;
        }
    }

    public void f(boolean z7) {
        if (z7 == this.f751g) {
            return;
        }
        this.f751g = z7;
        if (!this.f752h) {
            this.f745a = this.f749e;
            this.f746b = this.f750f;
            return;
        }
        if (z7) {
            int i7 = this.f748d;
            if (i7 == Integer.MIN_VALUE) {
                i7 = this.f749e;
            }
            this.f745a = i7;
            int i8 = this.f747c;
            if (i8 == Integer.MIN_VALUE) {
                i8 = this.f750f;
            }
            this.f746b = i8;
            return;
        }
        int i9 = this.f747c;
        if (i9 == Integer.MIN_VALUE) {
            i9 = this.f749e;
        }
        this.f745a = i9;
        int i10 = this.f748d;
        if (i10 == Integer.MIN_VALUE) {
            i10 = this.f750f;
        }
        this.f746b = i10;
    }

    public void g(int i7, int i8) {
        this.f747c = i7;
        this.f748d = i8;
        this.f752h = true;
        if (this.f751g) {
            if (i8 != Integer.MIN_VALUE) {
                this.f745a = i8;
            }
            if (i7 != Integer.MIN_VALUE) {
                this.f746b = i7;
                return;
            }
            return;
        }
        if (i7 != Integer.MIN_VALUE) {
            this.f745a = i7;
        }
        if (i8 != Integer.MIN_VALUE) {
            this.f746b = i8;
        }
    }
}
