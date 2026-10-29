package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: MyApplication */
abstract class w5 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f21768a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f21769b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f21770c;

    /* renamed from: d, reason: collision with root package name */
    private static final v5 f21771d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f21772e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f21773f;

    /* renamed from: g, reason: collision with root package name */
    static final long f21774g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f21775h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    static {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.w5.<clinit>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean A(Class cls) {
        int i7 = w2.f21766a;
        try {
            Class cls2 = f21769b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean B(Object obj, long j7) {
        return f21771d.g(obj, j7);
    }

    static boolean C() {
        return f21773f;
    }

    static boolean D() {
        return f21772e;
    }

    private static int E(Class cls) {
        if (f21773f) {
            return f21771d.f21761a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f21773f) {
            return f21771d.f21761a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i7 = w2.f21766a;
        Field c8 = c(Buffer.class, "effectiveDirectAddress");
        if (c8 != null) {
            return c8;
        }
        Field c9 = c(Buffer.class, "address");
        if (c9 == null || c9.getType() != Long.TYPE) {
            return null;
        }
        return c9;
    }

    private static Field c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Object obj, long j7, byte b8) {
        Unsafe unsafe = f21771d.f21761a;
        long j8 = (-4) & j7;
        int i7 = unsafe.getInt(obj, j8);
        int i8 = ((~((int) j7)) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b8) << i8) | (i7 & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j7, byte b8) {
        Unsafe unsafe = f21771d.f21761a;
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b8) << i7) | (unsafe.getInt(obj, j8) & (~(255 << i7))));
    }

    static double f(Object obj, long j7) {
        return f21771d.a(obj, j7);
    }

    static float g(Object obj, long j7) {
        return f21771d.b(obj, j7);
    }

    static int h(Object obj, long j7) {
        return f21771d.f21761a.getInt(obj, j7);
    }

    static long i(Object obj, long j7) {
        return f21771d.f21761a.getLong(obj, j7);
    }

    static Object j(Class cls) {
        try {
            return f21768a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    static Object k(Object obj, long j7) {
        return f21771d.f21761a.getObject(obj, j7);
    }

    static Unsafe l() {
        try {
            return (Unsafe) AccessController.doPrivileged(new s5());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void m(Throwable th) {
        Logger.getLogger(w5.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    static void r(Object obj, long j7, boolean z7) {
        f21771d.c(obj, j7, z7);
    }

    static void s(byte[] bArr, long j7, byte b8) {
        f21771d.d(bArr, f21774g + j7, b8);
    }

    static void t(Object obj, long j7, double d8) {
        f21771d.e(obj, j7, d8);
    }

    static void u(Object obj, long j7, float f8) {
        f21771d.f(obj, j7, f8);
    }

    static void v(Object obj, long j7, int i7) {
        f21771d.f21761a.putInt(obj, j7, i7);
    }

    static void w(Object obj, long j7, long j8) {
        f21771d.f21761a.putLong(obj, j7, j8);
    }

    static void x(Object obj, long j7, Object obj2) {
        f21771d.f21761a.putObject(obj, j7, obj2);
    }

    static /* bridge */ /* synthetic */ boolean y(Object obj, long j7) {
        return ((byte) ((f21771d.f21761a.getInt(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean z(Object obj, long j7) {
        return ((byte) ((f21771d.f21761a.getInt(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }
}
