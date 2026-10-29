package androidx.work.impl;

import android.content.Context;
import androidx.room.g;
import androidx.room.h;
import androidx.work.impl.a;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m1.e;
import m1.k;
import m1.n;
import m1.q;
import m1.t;
import x0.c;

/* compiled from: MyApplication */
public abstract class WorkDatabase extends h {

    /* renamed from: l, reason: collision with root package name */
    private static final long f2995l = TimeUnit.DAYS.toMillis(1);

    /* compiled from: MyApplication */
    class a implements c.InterfaceC0143c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2996a;

        a(Context context) {
            this.f2996a = context;
        }

        @Override // x0.c.InterfaceC0143c
        public c a(c.b bVar) {
            c.b.a a8 = c.b.a(this.f2996a);
            a8.c(bVar.f27202b).b(bVar.f27203c).d(true);
            return new y0.c().a(a8.a());
        }
    }

    /* compiled from: MyApplication */
    class b extends h.b {
        b() {
        }

        @Override // androidx.room.h.b
        public void c(x0.b bVar) {
            super.c(bVar);
            bVar.x();
            try {
                bVar.D(WorkDatabase.w());
                bVar.X();
            } finally {
                bVar.l0();
            }
        }
    }

    public static WorkDatabase s(Context context, Executor executor, boolean z7) {
        h.a a8;
        if (z7) {
            a8 = g.c(context, WorkDatabase.class).c();
        } else {
            a8 = g.a(context, WorkDatabase.class, f1.h.d());
            a8.f(new a(context));
        }
        return (WorkDatabase) a8.g(executor).a(u()).b(androidx.work.impl.a.f3005a).b(new a.h(context, 2, 3)).b(androidx.work.impl.a.f3006b).b(androidx.work.impl.a.f3007c).b(new a.h(context, 5, 6)).b(androidx.work.impl.a.f3008d).b(androidx.work.impl.a.f3009e).b(androidx.work.impl.a.f3010f).b(new a.i(context)).b(new a.h(context, 10, 11)).b(androidx.work.impl.a.f3011g).e().d();
    }

    static h.b u() {
        return new b();
    }

    static long v() {
        return System.currentTimeMillis() - f2995l;
    }

    static String w() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + v() + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }

    public abstract n A();

    public abstract q B();

    public abstract t C();

    public abstract m1.b t();

    public abstract e x();

    public abstract m1.h y();

    public abstract k z();
}
