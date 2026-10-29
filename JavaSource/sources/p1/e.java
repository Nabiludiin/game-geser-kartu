package p1;

/* compiled from: MyApplication */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private String f25074a;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f25075a;

        /* synthetic */ a(u uVar) {
        }

        public e a() {
            String str = this.f25075a;
            if (str == null) {
                throw new IllegalArgumentException("Purchase token must be set");
            }
            e eVar = new e(null);
            eVar.f25074a = str;
            return eVar;
        }

        public a b(String str) {
            this.f25075a = str;
            return this;
        }
    }

    /* synthetic */ e(u uVar) {
    }

    public static a b() {
        return new a(null);
    }

    public String a() {
        return this.f25074a;
    }
}
