package m3;

import l3.a;

/* compiled from: MyApplication */
public abstract class q {

    /* renamed from: a, reason: collision with root package name */
    private final k3.d[] f24840a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24841b;

    /* renamed from: c, reason: collision with root package name */
    private final int f24842c;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private o f24843a;

        /* renamed from: c, reason: collision with root package name */
        private k3.d[] f24845c;

        /* renamed from: b, reason: collision with root package name */
        private boolean f24844b = true;

        /* renamed from: d, reason: collision with root package name */
        private int f24846d = 0;

        /* synthetic */ a(a1 a1Var) {
        }

        public q a() {
            p3.o.b(this.f24843a != null, "execute parameter required");
            return new z0(this, this.f24845c, this.f24844b, this.f24846d);
        }

        public a b(o oVar) {
            this.f24843a = oVar;
            return this;
        }

        public a c(boolean z7) {
            this.f24844b = z7;
            return this;
        }

        public a d(k3.d... dVarArr) {
            this.f24845c = dVarArr;
            return this;
        }

        public a e(int i7) {
            this.f24846d = i7;
            return this;
        }
    }

    protected q(k3.d[] dVarArr, boolean z7, int i7) {
        this.f24840a = dVarArr;
        boolean z8 = false;
        if (dVarArr != null && z7) {
            z8 = true;
        }
        this.f24841b = z8;
        this.f24842c = i7;
    }

    public static a a() {
        return new a(null);
    }

    protected abstract void b(a.b bVar, w4.j jVar);

    public boolean c() {
        return this.f24841b;
    }

    public final int d() {
        return this.f24842c;
    }

    public final k3.d[] e() {
        return this.f24840a;
    }
}
