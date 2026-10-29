package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.g;

/* compiled from: MyApplication */
@Deprecated
class ReflectiveGenericLifecycleObserver implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Object f2493a;

    /* renamed from: b, reason: collision with root package name */
    private final a.C0040a f2494b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2493a = obj;
        this.f2494b = a.f2498c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.i
    public void c(k kVar, g.b bVar) {
        this.f2494b.a(kVar, bVar, this.f2493a);
    }
}
