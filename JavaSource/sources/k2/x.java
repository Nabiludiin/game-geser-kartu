package k2;

import s2.u4;

/* compiled from: MyApplication */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f24450a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24451b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f24452c;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f24453a = true;

        /* renamed from: b, reason: collision with root package name */
        private boolean f24454b = false;

        /* renamed from: c, reason: collision with root package name */
        private boolean f24455c = false;

        public x a() {
            return new x(this, null);
        }

        public a b(boolean z7) {
            this.f24455c = z7;
            return this;
        }

        public a c(boolean z7) {
            this.f24454b = z7;
            return this;
        }

        public a d(boolean z7) {
            this.f24453a = z7;
            return this;
        }

        final /* synthetic */ boolean e() {
            return this.f24453a;
        }

        final /* synthetic */ boolean f() {
            return this.f24454b;
        }

        final /* synthetic */ boolean g() {
            return this.f24455c;
        }
    }

    /* synthetic */ x(a aVar, byte[] bArr) {
        this.f24450a = aVar.e();
        this.f24451b = aVar.f();
        this.f24452c = aVar.g();
    }

    public boolean a() {
        return this.f24452c;
    }

    public boolean b() {
        return this.f24451b;
    }

    public boolean c() {
        return this.f24450a;
    }

    public x(u4 u4Var) {
        this.f24450a = u4Var.f26238q;
        this.f24451b = u4Var.f26239r;
        this.f24452c = u4Var.f26240s;
    }
}
