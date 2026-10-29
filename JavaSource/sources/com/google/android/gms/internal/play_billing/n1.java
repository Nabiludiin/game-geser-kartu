package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.f54;
import sun.misc.Unsafe;

/* compiled from: MyApplication */
public abstract /* synthetic */ class n1 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j7, Object obj2, Object obj3) {
        while (!f54.a(unsafe, obj, j7, obj2, obj3)) {
            if (unsafe.getObject(obj, j7) != obj2) {
                return false;
            }
        }
        return true;
    }
}
