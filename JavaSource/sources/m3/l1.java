package m3;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public abstract /* synthetic */ class l1 {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
