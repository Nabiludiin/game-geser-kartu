package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* compiled from: MyApplication */
public abstract /* synthetic */ class f54 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j7, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j7, obj2, obj3)) {
            if (unsafe.getObject(obj, j7) != obj2) {
                return false;
            }
        }
        return true;
    }
}
