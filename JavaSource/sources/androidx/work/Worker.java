package androidx.work;

import a5.d;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.c;

/* compiled from: MyApplication */
public abstract class Worker extends ListenableWorker {

    /* renamed from: v, reason: collision with root package name */
    c f2952v;

    /* compiled from: MyApplication */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Worker.this.f2952v.q(Worker.this.doWork());
            } catch (Throwable th) {
                Worker.this.f2952v.r(th);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ListenableWorker.a doWork();

    @Override // androidx.work.ListenableWorker
    public final d startWork() {
        this.f2952v = c.u();
        getBackgroundExecutor().execute(new a());
        return this.f2952v;
    }
}
