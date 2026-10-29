package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* compiled from: MyApplication */
final class j1 extends g1 {

    /* renamed from: a, reason: collision with root package name */
    static final Unsafe f21576a;

    /* renamed from: b, reason: collision with root package name */
    static final long f21577b;

    /* renamed from: c, reason: collision with root package name */
    static final long f21578c;

    /* renamed from: d, reason: collision with root package name */
    static final long f21579d;

    /* renamed from: e, reason: collision with root package name */
    static final long f21580e;

    /* renamed from: f, reason: collision with root package name */
    static final long f21581f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (PrivilegedActionException e8) {
                throw new RuntimeException("Could not initialize intrinsics", e8.getCause());
            }
        } catch (SecurityException unused) {
            unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: com.google.android.gms.internal.play_billing.o1
                @Override // java.security.PrivilegedExceptionAction
                public final Object run() {
                    Unsafe unsafe2 = j1.f21576a;
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError("the Unsafe");
                }
            });
        }
        try {
            f21578c = unsafe.objectFieldOffset(l1.class.getDeclaredField("s"));
            f21577b = unsafe.objectFieldOffset(l1.class.getDeclaredField("r"));
            f21579d = unsafe.objectFieldOffset(l1.class.getDeclaredField("q"));
            f21580e = unsafe.objectFieldOffset(k1.class.getDeclaredField("a"));
            f21581f = unsafe.objectFieldOffset(k1.class.getDeclaredField("b"));
            f21576a = unsafe;
        } catch (NoSuchFieldException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* synthetic */ j1(p1 p1Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final d1 a(l1 l1Var, d1 d1Var) {
        d1 d1Var2;
        do {
            d1Var2 = l1Var.f21603r;
            if (d1Var == d1Var2) {
                break;
            }
        } while (!e(l1Var, d1Var2, d1Var));
        return d1Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final k1 b(l1 l1Var, k1 k1Var) {
        k1 k1Var2;
        do {
            k1Var2 = l1Var.f21604s;
            if (k1Var == k1Var2) {
                break;
            }
        } while (!g(l1Var, k1Var2, k1Var));
        return k1Var2;
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final void c(k1 k1Var, k1 k1Var2) {
        f21576a.putObject(k1Var, f21581f, k1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.play_billing.g1
    public final void d(k1 k1Var, Thread thread) {
        f21576a.putObject(k1Var, f21580e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final boolean e(l1 l1Var, d1 d1Var, d1 d1Var2) {
        return n1.a(f21576a, l1Var, f21577b, d1Var, d1Var2);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final boolean f(l1 l1Var, Object obj, Object obj2) {
        return n1.a(f21576a, l1Var, f21579d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.g1
    final boolean g(l1 l1Var, k1 k1Var, k1 k1Var2) {
        return n1.a(f21576a, l1Var, f21578c, k1Var, k1Var2);
    }
}
