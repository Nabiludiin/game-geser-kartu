package p4;

import java.util.List;

/* compiled from: MyApplication */
final class c2 extends d2 {

    /* renamed from: t, reason: collision with root package name */
    final transient int f25315t;

    /* renamed from: u, reason: collision with root package name */
    final transient int f25316u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ d2 f25317v;

    c2(d2 d2Var, int i7, int i8) {
        this.f25317v = d2Var;
        this.f25315t = i7;
        this.f25316u = i8;
    }

    @Override // p4.a2
    final int e() {
        return this.f25317v.g() + this.f25315t + this.f25316u;
    }

    @Override // p4.a2
    final int g() {
        return this.f25317v.g() + this.f25315t;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        v1.a(i7, this.f25316u, "index");
        return this.f25317v.get(i7 + this.f25315t);
    }

    @Override // p4.a2
    final Object[] h() {
        return this.f25317v.h();
    }

    @Override // p4.d2
    /* renamed from: i */
    public final d2 subList(int i7, int i8) {
        v1.c(i7, i8, this.f25316u);
        int i9 = this.f25315t;
        return this.f25317v.subList(i7 + i9, i8 + i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f25316u;
    }

    @Override // p4.d2, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i7, int i8) {
        return subList(i7, i8);
    }
}
