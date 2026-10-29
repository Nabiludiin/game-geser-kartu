package z4;

import java.util.Objects;

/* compiled from: MyApplication */
class t extends i {

    /* renamed from: u, reason: collision with root package name */
    static final i f27878u = new t(new Object[0], 0);

    /* renamed from: s, reason: collision with root package name */
    final transient Object[] f27879s;

    /* renamed from: t, reason: collision with root package name */
    private final transient int f27880t;

    t(Object[] objArr, int i7) {
        this.f27879s = objArr;
        this.f27880t = i7;
    }

    @Override // z4.i, z4.h
    int c(Object[] objArr, int i7) {
        System.arraycopy(this.f27879s, 0, objArr, i7, this.f27880t);
        return i7 + this.f27880t;
    }

    @Override // z4.h
    Object[] e() {
        return this.f27879s;
    }

    @Override // z4.h
    int g() {
        return this.f27880t;
    }

    @Override // java.util.List
    public Object get(int i7) {
        y4.h.f(i7, this.f27880t);
        Object obj = this.f27879s[i7];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // z4.h
    int h() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f27880t;
    }
}
