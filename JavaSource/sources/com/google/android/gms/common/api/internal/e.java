package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;
import java.util.Set;
import l3.a;

/* compiled from: MyApplication */
public final class e implements m3.z {

    /* renamed from: a, reason: collision with root package name */
    private final x f4456a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4457b = false;

    public e(x xVar) {
        this.f4456a = xVar;
    }

    @Override // m3.z
    public final void b() {
        if (this.f4457b) {
            this.f4457b = false;
            this.f4456a.k(new d(this, this));
        }
    }

    @Override // m3.z
    public final void c(int i7) {
        this.f4456a.j(null);
        this.f4456a.E.c(i7, this.f4457b);
    }

    @Override // m3.z
    public final boolean f() {
        if (this.f4457b) {
            return false;
        }
        Set set = this.f4456a.D.f4520w;
        if (set == null || set.isEmpty()) {
            this.f4456a.j(null);
            return true;
        }
        this.f4457b = true;
        Iterator it = set.iterator();
        if (!it.hasNext()) {
            return false;
        }
        android.support.v4.media.session.b.a(it.next());
        throw null;
    }

    @Override // m3.z
    public final a g(a aVar) {
        try {
            this.f4456a.D.f4521x.a(aVar);
            u uVar = this.f4456a.D;
            a.f fVar = (a.f) uVar.f4512o.get(aVar.t());
            p3.o.n(fVar, "Appropriate Api was not requested.");
            if (fVar.a() || !this.f4456a.f4531w.containsKey(aVar.t())) {
                aVar.v(fVar);
                return aVar;
            }
            aVar.a(new Status(17));
            return aVar;
        } catch (DeadObjectException unused) {
            this.f4456a.k(new c(this, this));
            return aVar;
        }
    }

    @Override // m3.z
    public final void e() {
    }

    @Override // m3.z
    public final void a(Bundle bundle) {
    }

    @Override // m3.z
    public final void d(k3.b bVar, l3.a aVar, boolean z7) {
    }
}
