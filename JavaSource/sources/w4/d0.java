package w4;

import java.util.concurrent.Executor;

/* compiled from: MyApplication */
final class d0 implements Executor {
    d0() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
