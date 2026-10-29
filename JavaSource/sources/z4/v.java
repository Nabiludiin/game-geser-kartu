package z4;

/* compiled from: MyApplication */
final class v extends k {

    /* renamed from: x, reason: collision with root package name */
    private static final Object[] f27895x;

    /* renamed from: y, reason: collision with root package name */
    static final v f27896y;

    /* renamed from: s, reason: collision with root package name */
    final transient Object[] f27897s;

    /* renamed from: t, reason: collision with root package name */
    private final transient int f27898t;

    /* renamed from: u, reason: collision with root package name */
    final transient Object[] f27899u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f27900v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f27901w;

    static {
        Object[] objArr = new Object[0];
        f27895x = objArr;
        f27896y = new v(objArr, 0, objArr, 0, 0);
    }

    v(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f27897s = objArr;
        this.f27898t = i7;
        this.f27899u = objArr2;
        this.f27900v = i8;
        this.f27901w = i9;
    }

    @Override // z4.h
    int c(Object[] objArr, int i7) {
        System.arraycopy(this.f27897s, 0, objArr, i7, this.f27901w);
        return i7 + this.f27901w;
    }

    @Override // z4.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f27899u;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int b8 = g.b(obj);
        while (true) {
            int i7 = b8 & this.f27900v;
            Object obj2 = objArr[i7];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b8 = i7 + 1;
        }
    }

    @Override // z4.h
    Object[] e() {
        return this.f27897s;
    }

    @Override // z4.h
    int g() {
        return this.f27901w;
    }

    @Override // z4.h
    int h() {
        return 0;
    }

    @Override // z4.k, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f27898t;
    }

    @Override // z4.k
    i l() {
        return i.j(this.f27897s, this.f27901w);
    }

    @Override // z4.k
    boolean m() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public z iterator() {
        return i().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f27901w;
    }
}
