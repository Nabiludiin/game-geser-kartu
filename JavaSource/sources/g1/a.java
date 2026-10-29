package g1;

import e1.j;
import e1.q;
import java.util.HashMap;
import java.util.Map;
import m1.p;

/* compiled from: MyApplication */
public class a {

    /* renamed from: d, reason: collision with root package name */
    static final String f23938d = j.f("DelayedWorkTracker");

    /* renamed from: a, reason: collision with root package name */
    final b f23939a;

    /* renamed from: b, reason: collision with root package name */
    private final q f23940b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f23941c = new HashMap();

    /* compiled from: MyApplication */
    /* renamed from: g1.a$a, reason: collision with other inner class name */
    class RunnableC0093a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ p f23942q;

        RunnableC0093a(p pVar) {
            this.f23942q = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.c().a(a.f23938d, String.format("Scheduling work %s", this.f23942q.f24709a), new Throwable[0]);
            a.this.f23939a.e(this.f23942q);
        }
    }

    public a(b bVar, q qVar) {
        this.f23939a = bVar;
        this.f23940b = qVar;
    }

    public void a(p pVar) {
        Runnable runnable = (Runnable) this.f23941c.remove(pVar.f24709a);
        if (runnable != null) {
            this.f23940b.b(runnable);
        }
        RunnableC0093a runnableC0093a = new RunnableC0093a(pVar);
        this.f23941c.put(pVar.f24709a, runnableC0093a);
        this.f23940b.a(pVar.a() - System.currentTimeMillis(), runnableC0093a);
    }

    public void b(String str) {
        Runnable runnable = (Runnable) this.f23941c.remove(str);
        if (runnable != null) {
            this.f23940b.b(runnable);
        }
    }
}
