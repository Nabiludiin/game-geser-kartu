package f1;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import e1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import m1.p;
import m1.q;
import m1.t;
import n1.o;

/* compiled from: MyApplication */
public class k implements Runnable {
    static final String J = e1.j.f("WorkerWrapper");
    private WorkDatabase A;
    private q B;
    private m1.b C;
    private t D;
    private List E;
    private String F;
    private volatile boolean I;

    /* renamed from: q, reason: collision with root package name */
    Context f23616q;

    /* renamed from: r, reason: collision with root package name */
    private String f23617r;

    /* renamed from: s, reason: collision with root package name */
    private List f23618s;

    /* renamed from: t, reason: collision with root package name */
    private WorkerParameters.a f23619t;

    /* renamed from: u, reason: collision with root package name */
    p f23620u;

    /* renamed from: v, reason: collision with root package name */
    ListenableWorker f23621v;

    /* renamed from: w, reason: collision with root package name */
    o1.a f23622w;

    /* renamed from: y, reason: collision with root package name */
    private androidx.work.a f23624y;

    /* renamed from: z, reason: collision with root package name */
    private l1.a f23625z;

    /* renamed from: x, reason: collision with root package name */
    ListenableWorker.a f23623x = ListenableWorker.a.a();
    androidx.work.impl.utils.futures.c G = androidx.work.impl.utils.futures.c.u();
    a5.d H = null;

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ a5.d f23626q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f23627r;

        a(a5.d dVar, androidx.work.impl.utils.futures.c cVar) {
            this.f23626q = dVar;
            this.f23627r = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f23626q.get();
                e1.j.c().a(k.J, String.format("Starting work for %s", k.this.f23620u.f24711c), new Throwable[0]);
                k kVar = k.this;
                kVar.H = kVar.f23621v.startWork();
                this.f23627r.s(k.this.H);
            } catch (Throwable th) {
                this.f23627r.r(th);
            }
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f23629q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f23630r;

        b(androidx.work.impl.utils.futures.c cVar, String str) {
            this.f23629q = cVar;
            this.f23630r = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    ListenableWorker.a aVar = (ListenableWorker.a) this.f23629q.get();
                    if (aVar == null) {
                        e1.j.c().b(k.J, String.format("%s returned a null result. Treating it as a failure.", k.this.f23620u.f24711c), new Throwable[0]);
                    } else {
                        e1.j.c().a(k.J, String.format("%s returned a %s result.", k.this.f23620u.f24711c, aVar), new Throwable[0]);
                        k.this.f23623x = aVar;
                    }
                    k.this.f();
                } catch (InterruptedException e8) {
                    e = e8;
                    e1.j.c().b(k.J, String.format("%s failed because it threw an exception/error", this.f23630r), e);
                    k.this.f();
                } catch (CancellationException e9) {
                    e1.j.c().d(k.J, String.format("%s was cancelled", this.f23630r), e9);
                    k.this.f();
                } catch (ExecutionException e10) {
                    e = e10;
                    e1.j.c().b(k.J, String.format("%s failed because it threw an exception/error", this.f23630r), e);
                    k.this.f();
                }
            } catch (Throwable th) {
                k.this.f();
                throw th;
            }
        }
    }

    /* compiled from: MyApplication */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        Context f23632a;

        /* renamed from: b, reason: collision with root package name */
        ListenableWorker f23633b;

        /* renamed from: c, reason: collision with root package name */
        l1.a f23634c;

        /* renamed from: d, reason: collision with root package name */
        o1.a f23635d;

        /* renamed from: e, reason: collision with root package name */
        androidx.work.a f23636e;

        /* renamed from: f, reason: collision with root package name */
        WorkDatabase f23637f;

        /* renamed from: g, reason: collision with root package name */
        String f23638g;

        /* renamed from: h, reason: collision with root package name */
        List f23639h;

        /* renamed from: i, reason: collision with root package name */
        WorkerParameters.a f23640i = new WorkerParameters.a();

        public c(Context context, androidx.work.a aVar, o1.a aVar2, l1.a aVar3, WorkDatabase workDatabase, String str) {
            this.f23632a = context.getApplicationContext();
            this.f23635d = aVar2;
            this.f23634c = aVar3;
            this.f23636e = aVar;
            this.f23637f = workDatabase;
            this.f23638g = str;
        }

        public k a() {
            return new k(this);
        }

        public c b(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f23640i = aVar;
            }
            return this;
        }

        public c c(List list) {
            this.f23639h = list;
            return this;
        }
    }

    k(c cVar) {
        this.f23616q = cVar.f23632a;
        this.f23622w = cVar.f23635d;
        this.f23625z = cVar.f23634c;
        this.f23617r = cVar.f23638g;
        this.f23618s = cVar.f23639h;
        this.f23619t = cVar.f23640i;
        this.f23621v = cVar.f23633b;
        this.f23624y = cVar.f23636e;
        WorkDatabase workDatabase = cVar.f23637f;
        this.A = workDatabase;
        this.B = workDatabase.B();
        this.C = this.A.t();
        this.D = this.A.C();
    }

    private String a(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f23617r);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z7 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z7) {
                z7 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void c(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            e1.j.c().d(J, String.format("Worker result SUCCESS for %s", this.F), new Throwable[0]);
            if (this.f23620u.d()) {
                h();
                return;
            } else {
                m();
                return;
            }
        }
        if (aVar instanceof ListenableWorker.a.b) {
            e1.j.c().d(J, String.format("Worker result RETRY for %s", this.F), new Throwable[0]);
            g();
            return;
        }
        e1.j.c().d(J, String.format("Worker result FAILURE for %s", this.F), new Throwable[0]);
        if (this.f23620u.d()) {
            h();
        } else {
            l();
        }
    }

    private void e(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.B.l(str2) != s.CANCELLED) {
                this.B.o(s.FAILED, str2);
            }
            linkedList.addAll(this.C.a(str2));
        }
    }

    private void g() {
        this.A.c();
        try {
            this.B.o(s.ENQUEUED, this.f23617r);
            this.B.s(this.f23617r, System.currentTimeMillis());
            this.B.b(this.f23617r, -1L);
            this.A.r();
        } finally {
            this.A.g();
            i(true);
        }
    }

    private void h() {
        this.A.c();
        try {
            this.B.s(this.f23617r, System.currentTimeMillis());
            this.B.o(s.ENQUEUED, this.f23617r);
            this.B.n(this.f23617r);
            this.B.b(this.f23617r, -1L);
            this.A.r();
        } finally {
            this.A.g();
            i(false);
        }
    }

    private void i(boolean z7) {
        ListenableWorker listenableWorker;
        this.A.c();
        try {
            if (!this.A.B().j()) {
                n1.g.a(this.f23616q, RescheduleReceiver.class, false);
            }
            if (z7) {
                this.B.o(s.ENQUEUED, this.f23617r);
                this.B.b(this.f23617r, -1L);
            }
            if (this.f23620u != null && (listenableWorker = this.f23621v) != null && listenableWorker.isRunInForeground()) {
                this.f23625z.a(this.f23617r);
            }
            this.A.r();
            this.A.g();
            this.G.q(Boolean.valueOf(z7));
        } catch (Throwable th) {
            this.A.g();
            throw th;
        }
    }

    private void j() {
        s l7 = this.B.l(this.f23617r);
        if (l7 == s.RUNNING) {
            e1.j.c().a(J, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f23617r), new Throwable[0]);
            i(true);
        } else {
            e1.j.c().a(J, String.format("Status for %s is %s; not doing any work", this.f23617r, l7), new Throwable[0]);
            i(false);
        }
    }

    private void k() {
        androidx.work.b b8;
        if (n()) {
            return;
        }
        this.A.c();
        try {
            p m7 = this.B.m(this.f23617r);
            this.f23620u = m7;
            if (m7 == null) {
                e1.j.c().b(J, String.format("Didn't find WorkSpec for id %s", this.f23617r), new Throwable[0]);
                i(false);
                this.A.r();
                return;
            }
            if (m7.f24710b != s.ENQUEUED) {
                j();
                this.A.r();
                e1.j.c().a(J, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f23620u.f24711c), new Throwable[0]);
                return;
            }
            if (m7.d() || this.f23620u.c()) {
                long currentTimeMillis = System.currentTimeMillis();
                p pVar = this.f23620u;
                if (pVar.f24722n != 0 && currentTimeMillis < pVar.a()) {
                    e1.j.c().a(J, String.format("Delaying execution for %s because it is being executed before schedule.", this.f23620u.f24711c), new Throwable[0]);
                    i(true);
                    this.A.r();
                    return;
                }
            }
            this.A.r();
            this.A.g();
            if (this.f23620u.d()) {
                b8 = this.f23620u.f24713e;
            } else {
                e1.h b9 = this.f23624y.f().b(this.f23620u.f24712d);
                if (b9 == null) {
                    e1.j.c().b(J, String.format("Could not create Input Merger %s", this.f23620u.f24712d), new Throwable[0]);
                    l();
                    return;
                } else {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f23620u.f24713e);
                    arrayList.addAll(this.B.q(this.f23617r));
                    b8 = b9.b(arrayList);
                }
            }
            WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f23617r), b8, this.E, this.f23619t, this.f23620u.f24719k, this.f23624y.e(), this.f23622w, this.f23624y.m(), new n1.q(this.A, this.f23622w), new n1.p(this.A, this.f23625z, this.f23622w));
            if (this.f23621v == null) {
                this.f23621v = this.f23624y.m().b(this.f23616q, this.f23620u.f24711c, workerParameters);
            }
            ListenableWorker listenableWorker = this.f23621v;
            if (listenableWorker == null) {
                e1.j.c().b(J, String.format("Could not create Worker %s", this.f23620u.f24711c), new Throwable[0]);
                l();
                return;
            }
            if (listenableWorker.isUsed()) {
                e1.j.c().b(J, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f23620u.f24711c), new Throwable[0]);
                l();
                return;
            }
            this.f23621v.setUsed();
            if (!o()) {
                j();
                return;
            }
            if (n()) {
                return;
            }
            androidx.work.impl.utils.futures.c u7 = androidx.work.impl.utils.futures.c.u();
            o oVar = new o(this.f23616q, this.f23620u, this.f23621v, workerParameters.b(), this.f23622w);
            this.f23622w.a().execute(oVar);
            a5.d a8 = oVar.a();
            a8.c(new a(a8, u7), this.f23622w.a());
            u7.c(new b(u7, this.F), this.f23622w.c());
        } finally {
            this.A.g();
        }
    }

    private void m() {
        this.A.c();
        try {
            this.B.o(s.SUCCEEDED, this.f23617r);
            this.B.h(this.f23617r, ((ListenableWorker.a.c) this.f23623x).e());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.C.a(this.f23617r)) {
                if (this.B.l(str) == s.BLOCKED && this.C.b(str)) {
                    e1.j.c().d(J, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.B.o(s.ENQUEUED, str);
                    this.B.s(str, currentTimeMillis);
                }
            }
            this.A.r();
            this.A.g();
            i(false);
        } catch (Throwable th) {
            this.A.g();
            i(false);
            throw th;
        }
    }

    private boolean n() {
        if (!this.I) {
            return false;
        }
        e1.j.c().a(J, String.format("Work interrupted for %s", this.F), new Throwable[0]);
        if (this.B.l(this.f23617r) == null) {
            i(false);
        } else {
            i(!r0.c());
        }
        return true;
    }

    private boolean o() {
        boolean z7;
        this.A.c();
        try {
            if (this.B.l(this.f23617r) == s.ENQUEUED) {
                this.B.o(s.RUNNING, this.f23617r);
                this.B.r(this.f23617r);
                z7 = true;
            } else {
                z7 = false;
            }
            this.A.r();
            this.A.g();
            return z7;
        } catch (Throwable th) {
            this.A.g();
            throw th;
        }
    }

    public a5.d b() {
        return this.G;
    }

    public void d() {
        boolean z7;
        this.I = true;
        n();
        a5.d dVar = this.H;
        if (dVar != null) {
            z7 = dVar.isDone();
            this.H.cancel(true);
        } else {
            z7 = false;
        }
        ListenableWorker listenableWorker = this.f23621v;
        if (listenableWorker == null || z7) {
            e1.j.c().a(J, String.format("WorkSpec %s is already done. Not interrupting.", this.f23620u), new Throwable[0]);
        } else {
            listenableWorker.stop();
        }
    }

    void f() {
        if (!n()) {
            this.A.c();
            try {
                s l7 = this.B.l(this.f23617r);
                this.A.A().a(this.f23617r);
                if (l7 == null) {
                    i(false);
                } else if (l7 == s.RUNNING) {
                    c(this.f23623x);
                } else if (!l7.c()) {
                    g();
                }
                this.A.r();
                this.A.g();
            } catch (Throwable th) {
                this.A.g();
                throw th;
            }
        }
        List list = this.f23618s;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((e) it.next()).d(this.f23617r);
            }
            f.b(this.f23624y, this.A, this.f23618s);
        }
    }

    void l() {
        this.A.c();
        try {
            e(this.f23617r);
            this.B.h(this.f23617r, ((ListenableWorker.a.C0052a) this.f23623x).e());
            this.A.r();
        } finally {
            this.A.g();
            i(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        List b8 = this.D.b(this.f23617r);
        this.E = b8;
        this.F = a(b8);
        k();
    }
}
