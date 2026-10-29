package androidx.work.impl.workers;

import a5.d;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import e1.j;
import i1.c;
import java.util.Collections;
import java.util.List;
import m1.p;

/* compiled from: MyApplication */
public class ConstraintTrackingWorker extends ListenableWorker implements c {
    private static final String A = j.f("ConstraintTrkngWrkr");

    /* renamed from: v, reason: collision with root package name */
    private WorkerParameters f3126v;

    /* renamed from: w, reason: collision with root package name */
    final Object f3127w;

    /* renamed from: x, reason: collision with root package name */
    volatile boolean f3128x;

    /* renamed from: y, reason: collision with root package name */
    androidx.work.impl.utils.futures.c f3129y;

    /* renamed from: z, reason: collision with root package name */
    private ListenableWorker f3130z;

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.e();
        }
    }

    /* compiled from: MyApplication */
    class b implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ d f3132q;

        b(d dVar) {
            this.f3132q = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.f3127w) {
                try {
                    if (ConstraintTrackingWorker.this.f3128x) {
                        ConstraintTrackingWorker.this.d();
                    } else {
                        ConstraintTrackingWorker.this.f3129y.s(this.f3132q);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f3126v = workerParameters;
        this.f3127w = new Object();
        this.f3128x = false;
        this.f3129y = androidx.work.impl.utils.futures.c.u();
    }

    public WorkDatabase a() {
        return f1.j.k(getApplicationContext()).o();
    }

    @Override // i1.c
    public void b(List list) {
        j.c().a(A, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f3127w) {
            this.f3128x = true;
        }
    }

    void c() {
        this.f3129y.q(ListenableWorker.a.a());
    }

    void d() {
        this.f3129y.q(ListenableWorker.a.b());
    }

    void e() {
        String i7 = getInputData().i("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(i7)) {
            j.c().b(A, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        ListenableWorker b8 = getWorkerFactory().b(getApplicationContext(), i7, this.f3126v);
        this.f3130z = b8;
        if (b8 == null) {
            j.c().a(A, "No worker to delegate to.", new Throwable[0]);
            c();
            return;
        }
        p m7 = a().B().m(getId().toString());
        if (m7 == null) {
            c();
            return;
        }
        i1.d dVar = new i1.d(getApplicationContext(), getTaskExecutor(), this);
        dVar.d(Collections.singletonList(m7));
        if (!dVar.c(getId().toString())) {
            j.c().a(A, String.format("Constraints not met for delegate %s. Requesting retry.", i7), new Throwable[0]);
            d();
            return;
        }
        j.c().a(A, String.format("Constraints met for delegate %s", i7), new Throwable[0]);
        try {
            d startWork = this.f3130z.startWork();
            startWork.c(new b(startWork), getBackgroundExecutor());
        } catch (Throwable th) {
            j c8 = j.c();
            String str = A;
            c8.a(str, String.format("Delegated worker %s threw exception in startWork.", i7), th);
            synchronized (this.f3127w) {
                try {
                    if (this.f3128x) {
                        j.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        d();
                    } else {
                        c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // androidx.work.ListenableWorker
    public o1.a getTaskExecutor() {
        return f1.j.k(getApplicationContext()).p();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f3130z;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f3130z;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f3130z.stop();
    }

    @Override // androidx.work.ListenableWorker
    public d startWork() {
        getBackgroundExecutor().execute(new a());
        return this.f3129y;
    }

    @Override // i1.c
    public void f(List list) {
    }
}
