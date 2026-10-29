package z6;

/* compiled from: MyApplication */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b f28033a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    private static final c f28034b = new c();

    /* compiled from: MyApplication */
    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f28035a;

        public a(Throwable th) {
            this.f28035a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && q6.i.a(this.f28035a, ((a) obj).f28035a);
        }

        public int hashCode() {
            Throwable th = this.f28035a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // z6.f.c
        public String toString() {
            return "Closed(" + this.f28035a + ')';
        }
    }

    /* compiled from: MyApplication */
    public static final class b {
        public /* synthetic */ b(q6.e eVar) {
            this();
        }

        public final Object a(Throwable th) {
            return f.b(new a(th));
        }

        public final Object b() {
            return f.b(f.f28034b);
        }

        public final Object c(Object obj) {
            return f.b(obj);
        }

        private b() {
        }
    }

    /* compiled from: MyApplication */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static final Throwable c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f28035a;
        }
        return null;
    }

    public static final Object d(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static final boolean e(Object obj) {
        return obj instanceof a;
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof c);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
