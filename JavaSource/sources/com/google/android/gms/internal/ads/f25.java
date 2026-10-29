package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: MyApplication */
abstract class f25 {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f7989a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f7990b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f7991c;

    /* renamed from: d, reason: collision with root package name */
    private static final e25 f7992d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f7993e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f7994f;

    /* renamed from: g, reason: collision with root package name */
    static final long f7995g;

    /* renamed from: h, reason: collision with root package name */
    private static final long f7996h;

    /* renamed from: i, reason: collision with root package name */
    static final boolean f7997i;

    /* JADX WARN: Removed duplicated region for block: B:15:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    static {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.f25.<clinit>():void");
    }

    static long A(ByteBuffer byteBuffer) {
        e25 e25Var = f7992d;
        return e25Var.f7405a.getLong(byteBuffer, f7996h);
    }

    static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new b25());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean C(Class cls) {
        int i7 = dy4.f7358a;
        try {
            Class cls2 = f7990b;
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

    static /* synthetic */ boolean F(Object obj, long j7) {
        return ((byte) ((f7992d.f7405a.getInt(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ boolean G(Object obj, long j7) {
        return ((byte) ((f7992d.f7405a.getInt(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void b(Throwable th) {
        Logger.getLogger(f25.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int c(Class cls) {
        if (f7994f) {
            return f7992d.f7405a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int d(Class cls) {
        if (f7994f) {
            return f7992d.f7405a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field e() {
        int i7 = dy4.f7358a;
        Field f8 = f(Buffer.class, "effectiveDirectAddress");
        if (f8 != null) {
            return f8;
        }
        Field f9 = f(Buffer.class, "address");
        if (f9 == null || f9.getType() != Long.TYPE) {
            return null;
        }
        return f9;
    }

    private static Field f(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(Object obj, long j7, byte b8) {
        Unsafe unsafe = f7992d.f7405a;
        long j8 = (-4) & j7;
        int i7 = unsafe.getInt(obj, j8);
        int i8 = ((~((int) j7)) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b8) << i8) | (i7 & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(Object obj, long j7, byte b8) {
        Unsafe unsafe = f7992d.f7405a;
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b8) << i7) | (unsafe.getInt(obj, j8) & (~(255 << i7))));
    }

    static boolean i() {
        return f7994f;
    }

    static boolean j() {
        return f7993e;
    }

    static Object k(Class cls) {
        try {
            return f7989a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    static int l(Object obj, long j7) {
        return f7992d.f7405a.getInt(obj, j7);
    }

    static void m(Object obj, long j7, int i7) {
        f7992d.f7405a.putInt(obj, j7, i7);
    }

    static long n(Object obj, long j7) {
        return f7992d.f7405a.getLong(obj, j7);
    }

    static void o(Object obj, long j7, long j8) {
        f7992d.f7405a.putLong(obj, j7, j8);
    }

    static boolean p(Object obj, long j7) {
        return f7992d.b(obj, j7);
    }

    static void q(Object obj, long j7, boolean z7) {
        f7992d.c(obj, j7, z7);
    }

    static float r(Object obj, long j7) {
        return f7992d.d(obj, j7);
    }

    static void s(Object obj, long j7, float f8) {
        f7992d.e(obj, j7, f8);
    }

    static double t(Object obj, long j7) {
        return f7992d.f(obj, j7);
    }

    static void u(Object obj, long j7, double d8) {
        f7992d.g(obj, j7, d8);
    }

    static Object v(Object obj, long j7) {
        return f7992d.f7405a.getObject(obj, j7);
    }

    static void w(Object obj, long j7, Object obj2) {
        f7992d.f7405a.putObject(obj, j7, obj2);
    }

    static void x(byte[] bArr, long j7, byte b8) {
        f7992d.a(bArr, f7995g + j7, b8);
    }

    static void y(long j7, byte[] bArr, long j8, long j9) {
        f7992d.i(j7, bArr, j8, j9);
    }

    static byte z(long j7) {
        return f7992d.h(j7);
    }
}
