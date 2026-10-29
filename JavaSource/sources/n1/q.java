package n1;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import e1.s;
import java.util.UUID;

/* compiled from: MyApplication */
public class q implements e1.o {

    /* renamed from: c, reason: collision with root package name */
    static final String f24978c = e1.j.f("WorkProgressUpdater");

    /* renamed from: a, reason: collision with root package name */
    final WorkDatabase f24979a;

    /* renamed from: b, reason: collision with root package name */
    final o1.a f24980b;

    /* compiled from: MyApplication */
    class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ UUID f24981q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ androidx.work.b f24982r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ androidx.work.impl.utils.futures.c f24983s;

        a(UUID uuid, androidx.work.b bVar, androidx.work.impl.utils.futures.c cVar) {
            this.f24981q = uuid;
            this.f24982r = bVar;
            this.f24983s = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m1.p m7;
            String uuid = this.f24981q.toString();
            e1.j c8 = e1.j.c();
            String str = q.f24978c;
            c8.a(str, String.format("Updating progress for %s (%s)", this.f24981q, this.f24982r), new Throwable[0]);
            q.this.f24979a.c();
            try {
                m7 = q.this.f24979a.B().m(uuid);
            } finally {
                try {
                } finally {
                }
            }
            if (m7 == null) {
                throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            }
            if (m7.f24710b == s.RUNNING) {
                q.this.f24979a.A().b(new m1.m(uuid, this.f24982r));
            } else {
                e1.j.c().h(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", uuid), new Throwable[0]);
            }
            this.f24983s.q(null);
            q.this.f24979a.r();
        }
    }

    public q(WorkDatabase workDatabase, o1.a aVar) {
        this.f24979a = workDatabase;
        this.f24980b = aVar;
    }

    @Override // e1.o
    public a5.d a(Context context, UUID uuid, androidx.work.b bVar) {
        androidx.work.impl.utils.futures.c u7 = androidx.work.impl.utils.futures.c.u();
        this.f24980b.b(new a(uuid, bVar, u7));
        return u7;
    }
}
