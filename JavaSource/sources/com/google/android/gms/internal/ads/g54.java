package com.google.android.gms.internal.ads;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: MyApplication */
final class g54 extends c54 {

    /* renamed from: a, reason: collision with root package name */
    static final Unsafe f8651a;

    /* renamed from: b, reason: collision with root package name */
    static final long f8652b;

    /* renamed from: c, reason: collision with root package name */
    static final long f8653c;

    /* renamed from: d, reason: collision with root package name */
    static final long f8654d;

    /* renamed from: e, reason: collision with root package name */
    static final long f8655e;

    /* renamed from: f, reason: collision with root package name */
    static final long f8656f;

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(j54.f10348a);
            }
            try {
                f8653c = unsafe.objectFieldOffset(i54.class.getDeclaredField("s"));
                f8652b = unsafe.objectFieldOffset(i54.class.getDeclaredField("r"));
                f8654d = unsafe.objectFieldOffset(i54.class.getDeclaredField("q"));
                f8655e = unsafe.objectFieldOffset(h54.class.getDeclaredField("a"));
                f8656f = unsafe.objectFieldOffset(h54.class.getDeclaredField("b"));
                f8651a = unsafe;
            } catch (NoSuchFieldException e8) {
                throw new RuntimeException(e8);
            }
        } catch (PrivilegedActionException e9) {
            throw new RuntimeException("Could not initialize intrinsics", e9.getCause());
        }
    }

    /* synthetic */ g54(byte[] bArr) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.c54
    public final void a(h54 h54Var, Thread thread) {
        f8651a.putObject(h54Var, f8655e, thread);
    }

    @Override // com.google.android.gms.internal.ads.c54
    final void b(h54 h54Var, h54 h54Var2) {
        f8651a.putObject(h54Var, f8656f, h54Var2);
    }

    @Override // com.google.android.gms.internal.ads.c54
    final boolean c(i54 i54Var, h54 h54Var, h54 h54Var2) {
        return f54.a(f8651a, i54Var, f8653c, h54Var, h54Var2);
    }

    @Override // com.google.android.gms.internal.ads.c54
    final boolean d(i54 i54Var, y44 y44Var, y44 y44Var2) {
        return f54.a(f8651a, i54Var, f8652b, y44Var, y44Var2);
    }

    @Override // com.google.android.gms.internal.ads.c54
    final h54 e(i54 i54Var, h54 h54Var) {
        h54 h54Var2;
        do {
            h54Var2 = i54Var.f9843s;
            if (h54Var == h54Var2) {
                break;
            }
        } while (!c(i54Var, h54Var2, h54Var));
        return h54Var2;
    }

    @Override // com.google.android.gms.internal.ads.c54
    final y44 f(i54 i54Var, y44 y44Var) {
        y44 y44Var2;
        do {
            y44Var2 = i54Var.f9842r;
            if (y44Var == y44Var2) {
                break;
            }
        } while (!d(i54Var, y44Var2, y44Var));
        return y44Var2;
    }

    @Override // com.google.android.gms.internal.ads.c54
    final boolean g(i54 i54Var, Object obj, Object obj2) {
        return f54.a(f8651a, i54Var, f8654d, obj, obj2);
    }
}
