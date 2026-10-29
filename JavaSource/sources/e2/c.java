package e2;

import f2.x;
import h2.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import y1.o;
import y1.t;
import z1.m;

/* compiled from: MyApplication */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f23207f = Logger.getLogger(t.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f23208a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f23209b;

    /* renamed from: c, reason: collision with root package name */
    private final z1.e f23210c;

    /* renamed from: d, reason: collision with root package name */
    private final g2.d f23211d;

    /* renamed from: e, reason: collision with root package name */
    private final h2.b f23212e;

    public c(Executor executor, z1.e eVar, x xVar, g2.d dVar, h2.b bVar) {
        this.f23209b = executor;
        this.f23210c = eVar;
        this.f23208a = xVar;
        this.f23211d = dVar;
        this.f23212e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, o oVar, y1.i iVar) {
        cVar.f23211d.G0(oVar, iVar);
        cVar.f23208a.a(oVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final o oVar, w1.h hVar, y1.i iVar) {
        cVar.getClass();
        try {
            m a8 = cVar.f23210c.a(oVar.b());
            if (a8 == null) {
                String format = String.format("Transport backend '%s' is not registered", oVar.b());
                f23207f.warning(format);
                hVar.a(new IllegalArgumentException(format));
            } else {
                final y1.i a9 = a8.a(iVar);
                cVar.f23212e.a(new b.a() { // from class: e2.b
                    @Override // h2.b.a
                    public final Object a() {
                        return c.b(c.this, oVar, a9);
                    }
                });
                hVar.a(null);
            }
        } catch (Exception e8) {
            f23207f.warning("Error scheduling event " + e8.getMessage());
            hVar.a(e8);
        }
    }

    @Override // e2.e
    public void a(final o oVar, final y1.i iVar, final w1.h hVar) {
        this.f23209b.execute(new Runnable() { // from class: e2.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(c.this, oVar, hVar, iVar);
            }
        });
    }
}
