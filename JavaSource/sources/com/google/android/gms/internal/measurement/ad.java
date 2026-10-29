package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: MyApplication */
abstract class ad {

    /* renamed from: a, reason: collision with root package name */
    private static final Unsafe f20816a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f20817b;

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f20818c;

    /* renamed from: d, reason: collision with root package name */
    private static final zc f20819d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f20820e;

    /* renamed from: f, reason: collision with root package name */
    private static final boolean f20821f;

    /* renamed from: g, reason: collision with root package name */
    static final long f20822g;

    /* renamed from: h, reason: collision with root package name */
    static final boolean f20823h;

    /* JADX WARN: Removed duplicated region for block: B:15:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    static {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.ad.<clinit>():void");
    }

    static /* synthetic */ boolean A(Object obj, long j7) {
        return ((byte) ((f20819d.f21465a.getInt(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3))) & 255)) != 0;
    }

    static /* synthetic */ void D(Throwable th) {
        Logger.getLogger(ad.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    private static int E(Class cls) {
        if (f20821f) {
            return f20819d.f21465a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int a(Class cls) {
        if (f20821f) {
            return f20819d.f21465a.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field b() {
        int i7 = q9.f21249a;
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
        Unsafe unsafe = f20819d.f21465a;
        long j8 = (-4) & j7;
        int i7 = unsafe.getInt(obj, j8);
        int i8 = ((~((int) j7)) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b8) << i8) | (i7 & (~(255 << i8))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(Object obj, long j7, byte b8) {
        Unsafe unsafe = f20819d.f21465a;
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        unsafe.putInt(obj, j8, ((255 & b8) << i7) | (unsafe.getInt(obj, j8) & (~(255 << i7))));
    }

    static boolean f() {
        return f20821f;
    }

    static boolean g() {
        return f20820e;
    }

    static Object h(Class cls) {
        try {
            return f20816a.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    static int i(Object obj, long j7) {
        return f20819d.f21465a.getInt(obj, j7);
    }

    static void j(Object obj, long j7, int i7) {
        f20819d.f21465a.putInt(obj, j7, i7);
    }

    static long k(Object obj, long j7) {
        return f20819d.f21465a.getLong(obj, j7);
    }

    static void l(Object obj, long j7, long j8) {
        f20819d.f21465a.putLong(obj, j7, j8);
    }

    static boolean m(Object obj, long j7) {
        return f20819d.b(obj, j7);
    }

    static void n(Object obj, long j7, boolean z7) {
        f20819d.c(obj, j7, z7);
    }

    static float o(Object obj, long j7) {
        return f20819d.d(obj, j7);
    }

    static void p(Object obj, long j7, float f8) {
        f20819d.e(obj, j7, f8);
    }

    static double q(Object obj, long j7) {
        return f20819d.f(obj, j7);
    }

    static void r(Object obj, long j7, double d8) {
        f20819d.g(obj, j7, d8);
    }

    static Object s(Object obj, long j7) {
        return f20819d.f21465a.getObject(obj, j7);
    }

    static void t(Object obj, long j7, Object obj2) {
        f20819d.f21465a.putObject(obj, j7, obj2);
    }

    static void u(byte[] bArr, long j7, byte b8) {
        f20819d.a(bArr, f20822g + j7, b8);
    }

    static Unsafe v() {
        try {
            return (Unsafe) AccessController.doPrivileged(new wc());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean w(Class cls) {
        int i7 = q9.f21249a;
        try {
            Class cls2 = f20817b;
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

    static /* synthetic */ boolean z(Object obj, long j7) {
        return ((byte) ((f20819d.f21465a.getInt(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3))) & 255)) != 0;
    }
}
