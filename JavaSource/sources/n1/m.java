package n1;

import androidx.work.impl.WorkDatabase;
import e1.s;

/* compiled from: MyApplication */
public class m implements Runnable {

    /* renamed from: t, reason: collision with root package name */
    private static final String f24952t = e1.j.f("StopWorkRunnable");

    /* renamed from: q, reason: collision with root package name */
    private final f1.j f24953q;

    /* renamed from: r, reason: collision with root package name */
    private final String f24954r;

    /* renamed from: s, reason: collision with root package name */
    private final boolean f24955s;

    public m(f1.j jVar, String str, boolean z7) {
        this.f24953q = jVar;
        this.f24954r = str;
        this.f24955s = z7;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean o7;
        WorkDatabase o8 = this.f24953q.o();
        f1.d m7 = this.f24953q.m();
        m1.q B = o8.B();
        o8.c();
        try {
            boolean h8 = m7.h(this.f24954r);
            if (this.f24955s) {
                o7 = this.f24953q.m().n(this.f24954r);
            } else {
                if (!h8 && B.l(this.f24954r) == s.RUNNING) {
                    B.o(s.ENQUEUED, this.f24954r);
                }
                o7 = this.f24953q.m().o(this.f24954r);
            }
            e1.j.c().a(f24952t, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f24954r, Boolean.valueOf(o7)), new Throwable[0]);
            o8.r();
            o8.g();
        } catch (Throwable th) {
            o8.g();
            throw th;
        }
    }
}
