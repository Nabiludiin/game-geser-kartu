package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.savedstate.SavedStateRegistry;

/* compiled from: MyApplication */
class z implements androidx.savedstate.c, androidx.lifecycle.z {

    /* renamed from: q, reason: collision with root package name */
    private final Fragment f2465q;

    /* renamed from: r, reason: collision with root package name */
    private final androidx.lifecycle.y f2466r;

    /* renamed from: s, reason: collision with root package name */
    private androidx.lifecycle.l f2467s = null;

    /* renamed from: t, reason: collision with root package name */
    private androidx.savedstate.b f2468t = null;

    z(Fragment fragment, androidx.lifecycle.y yVar) {
        this.f2465q = fragment;
        this.f2466r = yVar;
    }

    void a(g.b bVar) {
        this.f2467s.h(bVar);
    }

    void b() {
        if (this.f2467s == null) {
            this.f2467s = new androidx.lifecycle.l(this);
            this.f2468t = androidx.savedstate.b.a(this);
        }
    }

    boolean d() {
        return this.f2467s != null;
    }

    void e(Bundle bundle) {
        this.f2468t.c(bundle);
    }

    void f(Bundle bundle) {
        this.f2468t.d(bundle);
    }

    void g(g.c cVar) {
        this.f2467s.o(cVar);
    }

    @Override // androidx.lifecycle.z
    public androidx.lifecycle.y h() {
        b();
        return this.f2466r;
    }

    @Override // androidx.savedstate.c
    public SavedStateRegistry j() {
        b();
        return this.f2468t.b();
    }

    @Override // androidx.lifecycle.k
    public androidx.lifecycle.g t() {
        b();
        return this.f2467s;
    }
}
