package e1;

/* compiled from: MyApplication */
public interface m {

    /* renamed from: a, reason: collision with root package name */
    public static final b.c f23177a;

    /* renamed from: b, reason: collision with root package name */
    public static final b.C0085b f23178b;

    /* compiled from: MyApplication */
    public static abstract class b {

        /* compiled from: MyApplication */
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            private final Throwable f23179a;

            public a(Throwable th) {
                this.f23179a = th;
            }

            public Throwable a() {
                return this.f23179a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f23179a.getMessage());
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: e1.m$b$b, reason: collision with other inner class name */
        public static final class C0085b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0085b() {
            }
        }

        /* compiled from: MyApplication */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }

    static {
        f23177a = new b.c();
        f23178b = new b.C0085b();
    }
}
