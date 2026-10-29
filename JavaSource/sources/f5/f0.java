package f5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MyApplication */
final class f0 implements e {

    /* renamed from: a, reason: collision with root package name */
    private final Set f23740a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f23741b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f23742c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f23743d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f23744e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f23745f;

    /* renamed from: g, reason: collision with root package name */
    private final e f23746g;

    /* compiled from: MyApplication */
    private static class a implements m5.c {

        /* renamed from: a, reason: collision with root package name */
        private final Set f23747a;

        /* renamed from: b, reason: collision with root package name */
        private final m5.c f23748b;

        public a(Set set, m5.c cVar) {
            this.f23747a = set;
            this.f23748b = cVar;
        }
    }

    f0(c cVar, e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : cVar.g()) {
            if (rVar.d()) {
                if (rVar.f()) {
                    hashSet4.add(rVar.b());
                } else {
                    hashSet.add(rVar.b());
                }
            } else if (rVar.c()) {
                hashSet3.add(rVar.b());
            } else if (rVar.f()) {
                hashSet5.add(rVar.b());
            } else {
                hashSet2.add(rVar.b());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(e0.b(m5.c.class));
        }
        this.f23740a = Collections.unmodifiableSet(hashSet);
        this.f23741b = Collections.unmodifiableSet(hashSet2);
        this.f23742c = Collections.unmodifiableSet(hashSet3);
        this.f23743d = Collections.unmodifiableSet(hashSet4);
        this.f23744e = Collections.unmodifiableSet(hashSet5);
        this.f23745f = cVar.k();
        this.f23746g = eVar;
    }

    @Override // f5.e
    public Object a(Class cls) {
        if (!this.f23740a.contains(e0.b(cls))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object a8 = this.f23746g.a(cls);
        return !cls.equals(m5.c.class) ? a8 : new a(this.f23745f, (m5.c) a8);
    }

    @Override // f5.e
    public Object b(e0 e0Var) {
        if (this.f23740a.contains(e0Var)) {
            return this.f23746g.b(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", e0Var));
    }

    @Override // f5.e
    public o5.b c(e0 e0Var) {
        if (this.f23741b.contains(e0Var)) {
            return this.f23746g.c(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", e0Var));
    }

    @Override // f5.e
    public o5.b d(Class cls) {
        return c(e0.b(cls));
    }

    @Override // f5.e
    public o5.b e(e0 e0Var) {
        if (this.f23744e.contains(e0Var)) {
            return this.f23746g.e(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", e0Var));
    }

    @Override // f5.e
    public Set f(e0 e0Var) {
        if (this.f23743d.contains(e0Var)) {
            return this.f23746g.f(e0Var);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", e0Var));
    }

    @Override // f5.e
    public /* synthetic */ Set g(Class cls) {
        return d.e(this, cls);
    }
}
