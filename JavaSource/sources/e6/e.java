package e6;

/* compiled from: MyApplication */
public final class e implements Comparable {

    /* renamed from: u, reason: collision with root package name */
    public static final a f23238u = new a(null);

    /* renamed from: v, reason: collision with root package name */
    public static final e f23239v = f.a();

    /* renamed from: q, reason: collision with root package name */
    private final int f23240q;

    /* renamed from: r, reason: collision with root package name */
    private final int f23241r;

    /* renamed from: s, reason: collision with root package name */
    private final int f23242s;

    /* renamed from: t, reason: collision with root package name */
    private final int f23243t;

    /* compiled from: MyApplication */
    public static final class a {
        public /* synthetic */ a(q6.e eVar) {
            this();
        }

        private a() {
        }
    }

    public e(int i7, int i8, int i9) {
        this.f23240q = i7;
        this.f23241r = i8;
        this.f23242s = i9;
        this.f23243t = d(i7, i8, i9);
    }

    private final int d(int i7, int i8, int i9) {
        if (i7 >= 0 && i7 < 256 && i8 >= 0 && i8 < 256 && i9 >= 0 && i9 < 256) {
            return (i7 << 16) + (i8 << 8) + i9;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i7 + '.' + i8 + '.' + i9).toString());
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(e eVar) {
        q6.i.e(eVar, "other");
        return this.f23243t - eVar.f23243t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        e eVar = obj instanceof e ? (e) obj : null;
        return eVar != null && this.f23243t == eVar.f23243t;
    }

    public int hashCode() {
        return this.f23243t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f23240q);
        sb.append('.');
        sb.append(this.f23241r);
        sb.append('.');
        sb.append(this.f23242s);
        return sb.toString();
    }
}
