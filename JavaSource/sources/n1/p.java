package n1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import e1.s;
import java.util.UUID;

/* compiled from: MyApplication */
public class p implements e1.f {

    /* renamed from: d, reason: collision with root package name */
    private static final String f24969d = e1.j.f("WMFgUpdater");

    /* renamed from: a, reason: collision with root package name */
    private final o1.a f24970a;

    /* renamed from: b, reason: collision with root package name */
    final l1.a f24971b;

    /* renamed from: c, reason: collision with root package name */
    final m1.q f24972c;

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f24973q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ UUID f24974r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ e1.e f24975s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ Context f24976t;

        a(androidx.work.impl.utils.futures.c cVar, UUID uuid, e1.e eVar, Context context) {
            this.f24973q = cVar;
            this.f24974r = uuid;
            this.f24975s = eVar;
            this.f24976t = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!this.f24973q.isCancelled()) {
                    String uuid = this.f24974r.toString();
                    s l7 = p.this.f24972c.l(uuid);
                    if (l7 == null || l7.c()) {
                        throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    p.this.f24971b.b(uuid, this.f24975s);
                    this.f24976t.startService(androidx.work.impl.foreground.a.a(this.f24976t, uuid, this.f24975s));
                }
                this.f24973q.q(null);
            } catch (Throwable th) {
                this.f24973q.r(th);
            }
        }
    }

    public p(WorkDatabase workDatabase, l1.a aVar, o1.a aVar2) {
        this.f24971b = aVar;
        this.f24970a = aVar2;
        this.f24972c = workDatabase.B();
    }

    @Override // e1.f
    public a5.d a(Context context, UUID uuid, e1.e eVar) {
        androidx.work.impl.utils.futures.c u7 = androidx.work.impl.utils.futures.c.u();
        this.f24970a.b(new a(u7, uuid, eVar, context));
        return u7;
    }
}
