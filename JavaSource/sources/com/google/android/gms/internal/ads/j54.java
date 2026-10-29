package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: MyApplication */
final /* synthetic */ class j54 implements PrivilegedExceptionAction {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ j54 f10348a = new j54();

    private /* synthetic */ j54() {
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ Object run() {
        Unsafe unsafe = g54.f8651a;
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        throw new NoSuchFieldError("the Unsafe");
    }
}
