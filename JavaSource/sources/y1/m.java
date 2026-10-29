package y1;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
class m implements Executor {

    /* renamed from: q, reason: collision with root package name */
    private final Executor f27609q;

    /* compiled from: MyApplication */
    static class a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        private final Runnable f27610q;

        a(Runnable runnable) {
            this.f27610q = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f27610q.run();
            } catch (Exception e8) {
                c2.a.d("Executor", "Background execution failure.", e8);
            }
        }
    }

    m(Executor executor) {
        this.f27609q = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f27609q.execute(new a(runnable));
    }
}
