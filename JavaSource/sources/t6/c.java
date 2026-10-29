package t6;

/* compiled from: MyApplication */
public final class c extends t6.a {

    /* renamed from: u, reason: collision with root package name */
    public static final a f26451u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    private static final c f26452v = new c(1, 0);

    /* compiled from: MyApplication */
    public static final class a {
        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        private a() {
        }
    }

    public c(int i7, int i8) {
        super(i7, i8, 1);
    }

    @Override // t6.a
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return c() == cVar.c() && e() == cVar.e();
    }

    @Override // t6.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (c() * 31) + e();
    }

    @Override // t6.a
    public boolean isEmpty() {
        return c() > e();
    }

    @Override // t6.a
    public String toString() {
        return c() + ".." + e();
    }
}
