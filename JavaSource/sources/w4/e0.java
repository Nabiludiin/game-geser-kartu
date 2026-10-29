package w4;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class e0 implements Executor {

    /* renamed from: q, reason: collision with root package name */
    private final Handler f27113q = new r4.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f27113q.post(runnable);
    }
}
