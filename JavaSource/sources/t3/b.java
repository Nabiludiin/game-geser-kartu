package t3;

import android.os.Process;

/* compiled from: MyApplication */
final class b implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f26396q;

    public b(Runnable runnable, int i7) {
        this.f26396q = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(0);
        this.f26396q.run();
    }
}
