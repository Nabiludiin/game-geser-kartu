package t6;

import f6.a0;

/* compiled from: MyApplication */
public class a implements Iterable {

    /* renamed from: t, reason: collision with root package name */
    public static final C0135a f26443t = new C0135a(null);

    /* renamed from: q, reason: collision with root package name */
    private final int f26444q;

    /* renamed from: r, reason: collision with root package name */
    private final int f26445r;

    /* renamed from: s, reason: collision with root package name */
    private final int f26446s;

    /* compiled from: MyApplication */
    /* renamed from: t6.a$a, reason: collision with other inner class name */
    public static final class C0135a {
        public /* synthetic */ C0135a(q6.e eVar) {
            this();
        }

        public final a a(int i7, int i8, int i9) {
            return new a(i7, i8, i9);
        }

        private C0135a() {
        }
    }

    public a(int i7, int i8, int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i9 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f26444q = i7;
        this.f26445r = k6.c.b(i7, i8, i9);
        this.f26446s = i9;
    }

    public final int c() {
        return this.f26444q;
    }

    public final int e() {
        return this.f26445r;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f26444q == aVar.f26444q && this.f26445r == aVar.f26445r && this.f26446s == aVar.f26446s;
    }

    public final int g() {
        return this.f26446s;
    }

    @Override // java.lang.Iterable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public a0 iterator() {
        return new b(this.f26444q, this.f26445r, this.f26446s);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f26444q * 31) + this.f26445r) * 31) + this.f26446s;
    }

    public boolean isEmpty() {
        return this.f26446s > 0 ? this.f26444q > this.f26445r : this.f26444q < this.f26445r;
    }

    public String toString() {
        StringBuilder sb;
        int i7;
        if (this.f26446s > 0) {
            sb = new StringBuilder();
            sb.append(this.f26444q);
            sb.append("..");
            sb.append(this.f26445r);
            sb.append(" step ");
            i7 = this.f26446s;
        } else {
            sb = new StringBuilder();
            sb.append(this.f26444q);
            sb.append(" downTo ");
            sb.append(this.f26445r);
            sb.append(" step ");
            i7 = -this.f26446s;
        }
        sb.append(i7);
        return sb.toString();
    }
}
