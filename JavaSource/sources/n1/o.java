package n1;

import android.content.Context;
import androidx.work.ListenableWorker;

/* compiled from: MyApplication */
public class o implements Runnable {

    /* renamed from: w, reason: collision with root package name */
    static final String f24958w = e1.j.f("WorkForegroundRunnable");

    /* renamed from: q, reason: collision with root package name */
    final androidx.work.impl.utils.futures.c f24959q = androidx.work.impl.utils.futures.c.u();

    /* renamed from: r, reason: collision with root package name */
    final Context f24960r;

    /* renamed from: s, reason: collision with root package name */
    final m1.p f24961s;

    /* renamed from: t, reason: collision with root package name */
    final ListenableWorker f24962t;

    /* renamed from: u, reason: collision with root package name */
    final e1.f f24963u;

    /* renamed from: v, reason: collision with root package name */
    final o1.a f24964v;

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f24965q;

        a(androidx.work.impl.utils.futures.c cVar) {
            this.f24965q = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f24965q.s(o.this.f24962t.getForegroundInfoAsync());
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f24967q;

        b(androidx.work.impl.utils.futures.c cVar) {
            this.f24967q = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e1.e eVar = (e1.e) this.f24967q.get();
                if (eVar == null) {
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", o.this.f24961s.f24711c));
                }
                e1.j.c().a(o.f24958w, String.format("Updating notification for %s", o.this.f24961s.f24711c), new Throwable[0]);
                o.this.f24962t.setRunInForeground(true);
                o oVar = o.this;
                oVar.f24959q.s(oVar.f24963u.a(oVar.f24960r, oVar.f24962t.getId(), eVar));
            } catch (Throwable th) {
                o.this.f24959q.r(th);
            }
        }
    }

    public o(Context context, m1.p pVar, ListenableWorker listenableWorker, e1.f fVar, o1.a aVar) {
        this.f24960r = context;
        this.f24961s = pVar;
        this.f24962t = listenableWorker;
        this.f24963u = fVar;
        this.f24964v = aVar;
    }

    public a5.d a() {
        return this.f24959q;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f24961s.f24725q || androidx.core.os.b.c()) {
            this.f24959q.q(null);
            return;
        }
        androidx.work.impl.utils.futures.c u7 = androidx.work.impl.utils.futures.c.u();
        this.f24964v.a().execute(new a(u7));
        u7.c(new b(u7), this.f24964v.a());
    }
}
