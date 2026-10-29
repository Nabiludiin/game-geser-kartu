package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class ox3 {
    public static Object a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static mx3 b(Object obj) {
        return new mx3(obj.getClass().getSimpleName(), null);
    }
}
