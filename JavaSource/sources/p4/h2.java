package p4;

import java.util.Iterator;

/* compiled from: MyApplication */
final class h2 extends e2 {

    /* renamed from: x, reason: collision with root package name */
    private static final Object[] f25383x;

    /* renamed from: y, reason: collision with root package name */
    static final h2 f25384y;

    /* renamed from: s, reason: collision with root package name */
    final transient Object[] f25385s;

    /* renamed from: t, reason: collision with root package name */
    private final transient int f25386t;

    /* renamed from: u, reason: collision with root package name */
    final transient Object[] f25387u;

    /* renamed from: v, reason: collision with root package name */
    private final transient int f25388v;

    /* renamed from: w, reason: collision with root package name */
    private final transient int f25389w;

    static {
        Object[] objArr = new Object[0];
        f25383x = objArr;
        f25384y = new h2(objArr, 0, objArr, 0, 0);
    }

    h2(Object[] objArr, int i7, Object[] objArr2, int i8, int i9) {
        this.f25385s = objArr;
        this.f25386t = i7;
        this.f25387u = objArr2;
        this.f25388v = i8;
        this.f25389w = i9;
    }

    @Override // p4.a2
    final int c(Object[] objArr, int i7) {
        Object[] objArr2 = this.f25385s;
        int i8 = this.f25389w;
        System.arraycopy(objArr2, 0, objArr, 0, i8);
        return i8;
    }

    @Override // p4.a2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f25387u;
            if (objArr.length != 0) {
                int a8 = z1.a(obj.hashCode());
                while (true) {
                    int i7 = a8 & this.f25388v;
                    Object obj2 = objArr[i7];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    a8 = i7 + 1;
                }
            }
        }
        return false;
    }

    @Override // p4.a2
    final int e() {
        return this.f25389w;
    }

    @Override // p4.a2
    final int g() {
        return 0;
    }

    @Override // p4.a2
    final Object[] h() {
        return this.f25385s;
    }

    @Override // p4.e2, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f25386t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return j().listIterator(0);
    }

    @Override // p4.e2
    final d2 k() {
        return d2.j(this.f25385s, this.f25389w);
    }

    @Override // p4.e2
    final boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f25389w;
    }
}
