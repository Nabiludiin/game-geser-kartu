package p1;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f25072a;

    /* compiled from: MyApplication */
    /* renamed from: p1.a$a, reason: collision with other inner class name */
    public static final class C0118a {

        /* renamed from: a, reason: collision with root package name */
        private String f25073a;

        /* synthetic */ C0118a(l lVar) {
        }

        public a a() {
            String str = this.f25073a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            a aVar = new a(null);
            aVar.f25072a = str;
            return aVar;
        }

        public C0118a b(String str) {
            this.f25073a = str;
            return this;
        }
    }

    /* synthetic */ a(l lVar) {
    }

    public static C0118a b() {
        return new C0118a(null);
    }

    public String a() {
        return this.f25072a;
    }
}
