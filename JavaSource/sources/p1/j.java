package p1;

/* compiled from: MyApplication */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f25076a;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f25077a;

        /* synthetic */ a(a0 a0Var) {
        }

        public j a() {
            if (this.f25077a != null) {
                return new j(this, null);
            }
            throw new IllegalArgumentException("Product type must be set");
        }

        public a b(String str) {
            this.f25077a = str;
            return this;
        }
    }

    /* synthetic */ j(a aVar, a0 a0Var) {
        this.f25076a = aVar.f25077a;
    }

    public static a a() {
        return new a(null);
    }

    public final String b() {
        return this.f25076a;
    }
}
