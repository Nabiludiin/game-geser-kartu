package r;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: MyApplication */
public class a extends h implements Map {

    /* renamed from: x, reason: collision with root package name */
    g f25713x;

    /* compiled from: MyApplication */
    /* renamed from: r.a$a, reason: collision with other inner class name */
    class C0124a extends g {
        C0124a() {
        }

        @Override // r.g
        protected void a() {
            a.this.clear();
        }

        @Override // r.g
        protected Object b(int i7, int i8) {
            return a.this.f25766r[(i7 << 1) + i8];
        }

        @Override // r.g
        protected Map c() {
            return a.this;
        }

        @Override // r.g
        protected int d() {
            return a.this.f25767s;
        }

        @Override // r.g
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // r.g
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // r.g
        protected void g(Object obj, Object obj2) {
            a.this.put(obj, obj2);
        }

        @Override // r.g
        protected void h(int i7) {
            a.this.k(i7);
        }

        @Override // r.g
        protected Object i(int i7, Object obj) {
            return a.this.l(i7, obj);
        }
    }

    public a() {
    }

    private g n() {
        if (this.f25713x == null) {
            this.f25713x = new C0124a();
        }
        return this.f25713x;
    }

    @Override // java.util.Map
    public Set entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return n().m();
    }

    public boolean o(Collection collection) {
        return g.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(this.f25767s + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return n().n();
    }

    public a(int i7) {
        super(i7);
    }
}
