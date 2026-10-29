package y1;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* compiled from: MyApplication */
public class t implements s {

    /* renamed from: e, reason: collision with root package name */
    private static volatile u f27619e;

    /* renamed from: a, reason: collision with root package name */
    private final i2.a f27620a;

    /* renamed from: b, reason: collision with root package name */
    private final i2.a f27621b;

    /* renamed from: c, reason: collision with root package name */
    private final e2.e f27622c;

    /* renamed from: d, reason: collision with root package name */
    private final f2.r f27623d;

    t(i2.a aVar, i2.a aVar2, e2.e eVar, f2.r rVar, f2.v vVar) {
        this.f27620a = aVar;
        this.f27621b = aVar2;
        this.f27622c = eVar;
        this.f27623d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f27620a.a()).k(this.f27621b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f27619e;
        if (uVar != null) {
            return uVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(w1.b.b("proto"));
    }

    public static void f(Context context) {
        if (f27619e == null) {
            synchronized (t.class) {
                try {
                    if (f27619e == null) {
                        f27619e = e.e().a(context).build();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // y1.s
    public void a(n nVar, w1.h hVar) {
        this.f27622c.a(nVar.f().f(nVar.c().c()), b(nVar), hVar);
    }

    public f2.r e() {
        return this.f27623d;
    }

    public w1.g g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
