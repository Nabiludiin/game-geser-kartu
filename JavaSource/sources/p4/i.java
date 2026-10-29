package p4;

import android.app.Application;

/* compiled from: MyApplication */
final class i extends a {

    /* renamed from: b, reason: collision with root package name */
    private final i f25391b = this;

    /* renamed from: c, reason: collision with root package name */
    final q2 f25392c;

    /* renamed from: d, reason: collision with root package name */
    final q2 f25393d;

    /* renamed from: e, reason: collision with root package name */
    final q2 f25394e;

    /* renamed from: f, reason: collision with root package name */
    final q2 f25395f;

    /* renamed from: g, reason: collision with root package name */
    final q2 f25396g;

    /* renamed from: h, reason: collision with root package name */
    final q2 f25397h;

    /* renamed from: i, reason: collision with root package name */
    final q2 f25398i;

    /* renamed from: j, reason: collision with root package name */
    final q2 f25399j;

    /* renamed from: k, reason: collision with root package name */
    final q2 f25400k;

    /* renamed from: l, reason: collision with root package name */
    final q2 f25401l;

    /* renamed from: m, reason: collision with root package name */
    final q2 f25402m;

    /* renamed from: n, reason: collision with root package name */
    final q2 f25403n;

    /* renamed from: o, reason: collision with root package name */
    final q2 f25404o;

    i(Application application) {
        n2 b8 = o2.b(application);
        this.f25392c = b8;
        q2 b9 = m2.b(new s(b8));
        this.f25393d = b9;
        q2 b10 = m2.b(f.f25349a);
        this.f25394e = b10;
        h hVar = new h(this);
        this.f25395f = hVar;
        w wVar = v.f25517a;
        q2 b11 = m2.b(new m0(hVar, wVar));
        this.f25396g = b11;
        e3 e3Var = new e3(b8, b9);
        this.f25397h = e3Var;
        q2 b12 = m2.b(new t2(wVar));
        this.f25398i = b12;
        q2 b13 = m2.b(new o(b8));
        this.f25399j = b13;
        q2 b14 = m2.b(new y2(b8, b13));
        this.f25400k = b14;
        q qVar = new q(b8, b9, b14, wVar);
        this.f25401l = qVar;
        d dVar = new d(b12, qVar, b9);
        this.f25402m = dVar;
        l3 l3Var = new l3(b8, b10, t.f25512a, wVar, b9, b11, e3Var, dVar, b12);
        this.f25403n = l3Var;
        this.f25404o = m2.b(new w2(b9, l3Var, b11));
    }

    @Override // p4.a
    public final v2 b() {
        return (v2) this.f25404o.a();
    }

    @Override // p4.a
    public final l0 c() {
        return (l0) this.f25396g.a();
    }
}
