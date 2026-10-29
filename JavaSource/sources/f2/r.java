package f2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b2.c;
import h2.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import z1.g;

/* compiled from: MyApplication */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private final Context f23685a;

    /* renamed from: b, reason: collision with root package name */
    private final z1.e f23686b;

    /* renamed from: c, reason: collision with root package name */
    private final g2.d f23687c;

    /* renamed from: d, reason: collision with root package name */
    private final x f23688d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f23689e;

    /* renamed from: f, reason: collision with root package name */
    private final h2.b f23690f;

    /* renamed from: g, reason: collision with root package name */
    private final i2.a f23691g;

    /* renamed from: h, reason: collision with root package name */
    private final i2.a f23692h;

    /* renamed from: i, reason: collision with root package name */
    private final g2.c f23693i;

    public r(Context context, z1.e eVar, g2.d dVar, x xVar, Executor executor, h2.b bVar, i2.a aVar, i2.a aVar2, g2.c cVar) {
        this.f23685a = context;
        this.f23686b = eVar;
        this.f23687c = dVar;
        this.f23688d = xVar;
        this.f23689e = executor;
        this.f23690f = bVar;
        this.f23691g = aVar;
        this.f23692h = aVar2;
        this.f23693i = cVar;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, y1.o oVar, long j7) {
        rVar.f23687c.E0(iterable);
        rVar.f23687c.L0(oVar, rVar.f23691g.a() + j7);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f23693i.c();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f23687c.A(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, y1.o oVar, int i7) {
        rVar.f23688d.a(oVar, i7 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, y1.o oVar, long j7) {
        rVar.f23687c.L0(oVar, rVar.f23691g.a() + j7);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            rVar.f23693i.e(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final y1.o oVar, final int i7, Runnable runnable) {
        rVar.getClass();
        try {
            try {
                h2.b bVar = rVar.f23690f;
                final g2.d dVar = rVar.f23687c;
                Objects.requireNonNull(dVar);
                bVar.a(new b.a() { // from class: f2.i
                    @Override // h2.b.a
                    public final Object a() {
                        return Integer.valueOf(g2.d.this.y());
                    }
                });
                if (rVar.k()) {
                    rVar.l(oVar, i7);
                } else {
                    rVar.f23690f.a(new b.a() { // from class: f2.j
                        @Override // h2.b.a
                        public final Object a() {
                            return r.f(r.this, oVar, i7);
                        }
                    });
                }
                runnable.run();
            } catch (h2.a unused) {
                rVar.f23688d.a(oVar, i7 + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public y1.i j(z1.m mVar) {
        h2.b bVar = this.f23690f;
        final g2.c cVar = this.f23693i;
        Objects.requireNonNull(cVar);
        return mVar.a(y1.i.a().i(this.f23691g.a()).k(this.f23692h.a()).j("GDT_CLIENT_METRICS").h(new y1.h(w1.b.b("proto"), ((b2.a) bVar.a(new b.a() { // from class: f2.h
            @Override // h2.b.a
            public final Object a() {
                return g2.c.this.g();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f23685a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public z1.g l(final y1.o oVar, int i7) {
        z1.g b8;
        z1.m a8 = this.f23686b.a(oVar.b());
        z1.g e8 = z1.g.e(0L);
        final long j7 = 0;
        while (((Boolean) this.f23690f.a(new b.a() { // from class: f2.k
            @Override // h2.b.a
            public final Object a() {
                Boolean valueOf;
                valueOf = Boolean.valueOf(r.this.f23687c.k0(oVar));
                return valueOf;
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f23690f.a(new b.a() { // from class: f2.l
                @Override // h2.b.a
                public final Object a() {
                    Iterable u02;
                    u02 = r.this.f23687c.u0(oVar);
                    return u02;
                }
            });
            if (!iterable.iterator().hasNext()) {
                return e8;
            }
            if (a8 == null) {
                c2.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                b8 = z1.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((g2.k) it.next()).b());
                }
                if (oVar.e()) {
                    arrayList.add(j(a8));
                }
                b8 = a8.b(z1.f.a().b(arrayList).c(oVar.c()).a());
            }
            e8 = b8;
            if (e8.c() == g.a.TRANSIENT_ERROR) {
                final y1.o oVar2 = oVar;
                this.f23690f.a(new b.a() { // from class: f2.m
                    @Override // h2.b.a
                    public final Object a() {
                        return r.b(r.this, iterable, oVar2, j7);
                    }
                });
                this.f23688d.b(oVar2, i7 + 1, true);
                return e8;
            }
            y1.o oVar3 = oVar;
            this.f23690f.a(new b.a() { // from class: f2.n
                @Override // h2.b.a
                public final Object a() {
                    return r.e(r.this, iterable);
                }
            });
            if (e8.c() == g.a.OK) {
                long max = Math.max(j7, e8.b());
                if (oVar3.e()) {
                    this.f23690f.a(new b.a() { // from class: f2.o
                        @Override // h2.b.a
                        public final Object a() {
                            return r.c(r.this);
                        }
                    });
                }
                j7 = max;
            } else if (e8.c() == g.a.INVALID_PAYLOAD) {
                final HashMap hashMap = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String j8 = ((g2.k) it2.next()).b().j();
                    if (hashMap.containsKey(j8)) {
                        hashMap.put(j8, Integer.valueOf(((Integer) hashMap.get(j8)).intValue() + 1));
                    } else {
                        hashMap.put(j8, 1);
                    }
                }
                this.f23690f.a(new b.a() { // from class: f2.p
                    @Override // h2.b.a
                    public final Object a() {
                        return r.h(r.this, hashMap);
                    }
                });
            }
            oVar = oVar3;
        }
        final y1.o oVar4 = oVar;
        this.f23690f.a(new b.a() { // from class: f2.q
            @Override // h2.b.a
            public final Object a() {
                return r.g(r.this, oVar4, j7);
            }
        });
        return e8;
    }

    public void m(final y1.o oVar, final int i7, final Runnable runnable) {
        this.f23689e.execute(new Runnable() { // from class: f2.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(r.this, oVar, i7, runnable);
            }
        });
    }
}
