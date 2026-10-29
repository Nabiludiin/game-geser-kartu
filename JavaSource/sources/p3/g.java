package p3;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import l3.a;
import l3.f;

/* compiled from: MyApplication */
public abstract class g extends c implements a.f, f0 {
    private final d F;
    private final Set G;
    private final Account H;

    protected g(Context context, Looper looper, int i7, d dVar, f.b bVar, f.c cVar) {
        this(context, looper, i7, dVar, (m3.e) bVar, (m3.n) cVar);
    }

    private final Set q0(Set set) {
        Set p02 = p0(set);
        Iterator it = p02.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return p02;
    }

    @Override // p3.c
    protected Executor B() {
        return null;
    }

    @Override // p3.c
    protected final Set H() {
        return this.G;
    }

    public Set c() {
        return t() ? this.G : Collections.EMPTY_SET;
    }

    protected final d o0() {
        return this.F;
    }

    @Override // p3.c
    public final Account z() {
        return this.H;
    }

    protected g(Context context, Looper looper, int i7, d dVar, m3.e eVar, m3.n nVar) {
        this(context, looper, h.a(context), k3.g.p(), i7, dVar, (m3.e) o.m(eVar), (m3.n) o.m(nVar));
    }

    protected g(Context context, Looper looper, h hVar, k3.g gVar, int i7, d dVar, m3.e eVar, m3.n nVar) {
        super(context, looper, hVar, gVar, i7, eVar == null ? null : new d0(eVar), nVar != null ? new e0(nVar) : null, dVar.j());
        this.F = dVar;
        this.H = dVar.a();
        this.G = q0(dVar.c());
    }

    protected Set p0(Set set) {
        return set;
    }
}
