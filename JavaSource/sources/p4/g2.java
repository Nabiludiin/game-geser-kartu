package p4;

import java.util.Objects;

/* compiled from: MyApplication */
final class g2 extends d2 {

    /* renamed from: v, reason: collision with root package name */
    static final d2 f25367v = new g2(new Object[0], 0);

    /* renamed from: t, reason: collision with root package name */
    final transient Object[] f25368t;

    /* renamed from: u, reason: collision with root package name */
    private final transient int f25369u;

    g2(Object[] objArr, int i7) {
        this.f25368t = objArr;
        this.f25369u = i7;
    }

    @Override // p4.d2, p4.a2
    final int c(Object[] objArr, int i7) {
        Object[] objArr2 = this.f25368t;
        int i8 = this.f25369u;
        System.arraycopy(objArr2, 0, objArr, 0, i8);
        return i8;
    }

    @Override // p4.a2
    final int e() {
        return this.f25369u;
    }

    @Override // p4.a2
    final int g() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        v1.a(i7, this.f25369u, "index");
        Object obj = this.f25368t[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // p4.a2
    final Object[] h() {
        return this.f25368t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25369u;
    }
}
