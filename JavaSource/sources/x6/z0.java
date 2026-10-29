package x6;

import java.util.concurrent.locks.LockSupport;

/* compiled from: MyApplication */
public abstract class z0 extends x0 {
    protected abstract Thread b0();

    protected final void e0() {
        Thread b02 = b0();
        if (Thread.currentThread() != b02) {
            c.a();
            LockSupport.unpark(b02);
        }
    }
}
