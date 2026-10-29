package z6;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: MyApplication */
public abstract /* synthetic */ class g {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i7, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i7, obj, obj2)) {
            if (atomicReferenceArray.get(i7) != obj) {
                return false;
            }
        }
        return true;
    }
}
