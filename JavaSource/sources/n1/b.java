package n1;

import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import e1.m;
import java.util.List;

/* compiled from: MyApplication */
public class b implements Runnable {

    /* renamed from: s, reason: collision with root package name */
    private static final String f24936s = e1.j.f("EnqueueRunnable");

    /* renamed from: q, reason: collision with root package name */
    private final f1.g f24937q;

    /* renamed from: r, reason: collision with root package name */
    private final f1.c f24938r = new f1.c();

    public b(f1.g gVar) {
        this.f24937q = gVar;
    }

    private static boolean b(f1.g gVar) {
        boolean c8 = c(gVar.g(), gVar.f(), (String[]) f1.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return c8;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean c(f1.j r16, java.util.List r17, java.lang.String[] r18, java.lang.String r19, e1.d r20) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n1.b.c(f1.j, java.util.List, java.lang.String[], java.lang.String, e1.d):boolean");
    }

    private static boolean e(f1.g gVar) {
        List<f1.g> e8 = gVar.e();
        boolean z7 = false;
        if (e8 != null) {
            boolean z8 = false;
            for (f1.g gVar2 : e8) {
                if (gVar2.j()) {
                    e1.j.c().h(f24936s, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                } else {
                    z8 |= e(gVar2);
                }
            }
            z7 = z8;
        }
        return b(gVar) | z7;
    }

    private static void g(m1.p pVar) {
        e1.b bVar = pVar.f24718j;
        String str = pVar.f24711c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.f() || bVar.i()) {
            b.a aVar = new b.a();
            aVar.c(pVar.f24713e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f24711c = ConstraintTrackingWorker.class.getName();
            pVar.f24713e = aVar.a();
        }
    }

    public boolean a() {
        WorkDatabase o7 = this.f24937q.g().o();
        o7.c();
        try {
            boolean e8 = e(this.f24937q);
            o7.r();
            return e8;
        } finally {
            o7.g();
        }
    }

    public e1.m d() {
        return this.f24938r;
    }

    public void f() {
        f1.j g8 = this.f24937q.g();
        f1.f.b(g8.i(), g8.o(), g8.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f24937q.h()) {
                throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f24937q));
            }
            if (a()) {
                g.a(this.f24937q.g().h(), RescheduleReceiver.class, true);
                f();
            }
            this.f24938r.a(e1.m.f23177a);
        } catch (Throwable th) {
            this.f24938r.a(new m.b.a(th));
        }
    }
}
