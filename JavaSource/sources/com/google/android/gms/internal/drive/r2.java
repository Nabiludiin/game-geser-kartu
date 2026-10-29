package com.google.android.gms.internal.drive;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

abstract class r2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f20712a = Logger.getLogger(r2.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final Unsafe f20713b;

    /* renamed from: c, reason: collision with root package name */
    private static final Class f20714c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f20715d;

    /* renamed from: e, reason: collision with root package name */
    private static final boolean f20716e;

    /* renamed from: f, reason: collision with root package name */
    private static final d f20717f;

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f20718g;

    /* renamed from: h, reason: collision with root package name */
    private static final boolean f20719h;

    /* renamed from: i, reason: collision with root package name */
    private static final long f20720i;

    /* renamed from: j, reason: collision with root package name */
    private static final long f20721j;

    /* renamed from: k, reason: collision with root package name */
    private static final long f20722k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f20723l;

    /* renamed from: m, reason: collision with root package name */
    private static final long f20724m;

    /* renamed from: n, reason: collision with root package name */
    private static final long f20725n;

    /* renamed from: o, reason: collision with root package name */
    private static final long f20726o;

    /* renamed from: p, reason: collision with root package name */
    private static final long f20727p;

    /* renamed from: q, reason: collision with root package name */
    private static final long f20728q;

    /* renamed from: r, reason: collision with root package name */
    private static final long f20729r;

    /* renamed from: s, reason: collision with root package name */
    private static final long f20730s;

    /* renamed from: t, reason: collision with root package name */
    private static final long f20731t;

    /* renamed from: u, reason: collision with root package name */
    private static final long f20732u;

    /* renamed from: v, reason: collision with root package name */
    private static final long f20733v;

    /* renamed from: w, reason: collision with root package name */
    private static final int f20734w;

    /* renamed from: x, reason: collision with root package name */
    static final boolean f20735x;

    static final class a extends d {
        a(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void a(Object obj, long j7, double d8) {
            d(obj, j7, Double.doubleToLongBits(d8));
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void b(Object obj, long j7, float f8) {
            c(obj, j7, Float.floatToIntBits(f8));
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void e(Object obj, long j7, boolean z7) {
            if (r2.f20735x) {
                r2.l(obj, j7, z7);
            } else {
                r2.n(obj, j7, z7);
            }
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void f(Object obj, long j7, byte b8) {
            if (r2.f20735x) {
                r2.b(obj, j7, b8);
            } else {
                r2.k(obj, j7, b8);
            }
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final boolean i(Object obj, long j7) {
            return r2.f20735x ? r2.J(obj, j7) : r2.K(obj, j7);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final float j(Object obj, long j7) {
            return Float.intBitsToFloat(g(obj, j7));
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final double k(Object obj, long j7) {
            return Double.longBitsToDouble(h(obj, j7));
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final byte l(Object obj, long j7) {
            return r2.f20735x ? r2.H(obj, j7) : r2.I(obj, j7);
        }
    }

    static final class b extends d {
        b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void a(Object obj, long j7, double d8) {
            d(obj, j7, Double.doubleToLongBits(d8));
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void b(Object obj, long j7, float f8) {
            c(obj, j7, Float.floatToIntBits(f8));
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void e(Object obj, long j7, boolean z7) {
            if (r2.f20735x) {
                r2.l(obj, j7, z7);
            } else {
                r2.n(obj, j7, z7);
            }
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void f(Object obj, long j7, byte b8) {
            if (r2.f20735x) {
                r2.b(obj, j7, b8);
            } else {
                r2.k(obj, j7, b8);
            }
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final boolean i(Object obj, long j7) {
            return r2.f20735x ? r2.J(obj, j7) : r2.K(obj, j7);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final float j(Object obj, long j7) {
            return Float.intBitsToFloat(g(obj, j7));
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final double k(Object obj, long j7) {
            return Double.longBitsToDouble(h(obj, j7));
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final byte l(Object obj, long j7) {
            return r2.f20735x ? r2.H(obj, j7) : r2.I(obj, j7);
        }
    }

    static final class c extends d {
        c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void a(Object obj, long j7, double d8) {
            this.f20736a.putDouble(obj, j7, d8);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void b(Object obj, long j7, float f8) {
            this.f20736a.putFloat(obj, j7, f8);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void e(Object obj, long j7, boolean z7) {
            this.f20736a.putBoolean(obj, j7, z7);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final void f(Object obj, long j7, byte b8) {
            this.f20736a.putByte(obj, j7, b8);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final boolean i(Object obj, long j7) {
            return this.f20736a.getBoolean(obj, j7);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final float j(Object obj, long j7) {
            return this.f20736a.getFloat(obj, j7);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final double k(Object obj, long j7) {
            return this.f20736a.getDouble(obj, j7);
        }

        @Override // com.google.android.gms.internal.drive.r2.d
        public final byte l(Object obj, long j7) {
            return this.f20736a.getByte(obj, j7);
        }
    }

    static abstract class d {

        /* renamed from: a, reason: collision with root package name */
        Unsafe f20736a;

        d(Unsafe unsafe) {
            this.f20736a = unsafe;
        }

        public abstract void a(Object obj, long j7, double d8);

        public abstract void b(Object obj, long j7, float f8);

        public final void c(Object obj, long j7, int i7) {
            this.f20736a.putInt(obj, j7, i7);
        }

        public final void d(Object obj, long j7, long j8) {
            this.f20736a.putLong(obj, j7, j8);
        }

        public abstract void e(Object obj, long j7, boolean z7);

        public abstract void f(Object obj, long j7, byte b8);

        public final int g(Object obj, long j7) {
            return this.f20736a.getInt(obj, j7);
        }

        public final long h(Object obj, long j7) {
            return this.f20736a.getLong(obj, j7);
        }

        public abstract boolean i(Object obj, long j7);

        public abstract float j(Object obj, long j7);

        public abstract double k(Object obj, long j7);

        public abstract byte l(Object obj, long j7);
    }

    static {
        Unsafe t7 = t();
        f20713b = t7;
        f20714c = g.b();
        boolean C = C(Long.TYPE);
        f20715d = C;
        boolean C2 = C(Integer.TYPE);
        f20716e = C2;
        d dVar = null;
        if (t7 != null) {
            if (!g.a()) {
                dVar = new c(t7);
            } else if (C) {
                dVar = new b(t7);
            } else if (C2) {
                dVar = new a(t7);
            }
        }
        f20717f = dVar;
        f20718g = v();
        f20719h = u();
        long y7 = y(byte[].class);
        f20720i = y7;
        f20721j = y(boolean[].class);
        f20722k = z(boolean[].class);
        f20723l = y(int[].class);
        f20724m = z(int[].class);
        f20725n = y(long[].class);
        f20726o = z(long[].class);
        f20727p = y(float[].class);
        f20728q = z(float[].class);
        f20729r = y(double[].class);
        f20730s = z(double[].class);
        f20731t = y(Object[].class);
        f20732u = z(Object[].class);
        Field w7 = w();
        f20733v = (w7 == null || dVar == null) ? -1L : dVar.f20736a.objectFieldOffset(w7);
        f20734w = (int) (y7 & 7);
        f20735x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    static int A(Object obj, long j7) {
        return f20717f.g(obj, j7);
    }

    static long B(Object obj, long j7) {
        return f20717f.h(obj, j7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean C(Class cls) {
        if (!g.a()) {
            return false;
        }
        try {
            Class cls2 = f20714c;
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

    static boolean D(Object obj, long j7) {
        return f20717f.i(obj, j7);
    }

    static float E(Object obj, long j7) {
        return f20717f.j(obj, j7);
    }

    static double F(Object obj, long j7) {
        return f20717f.k(obj, j7);
    }

    static Object G(Object obj, long j7) {
        return f20717f.f20736a.getObject(obj, j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte H(Object obj, long j7) {
        return (byte) (A(obj, (-4) & j7) >>> ((int) (((~j7) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte I(Object obj, long j7) {
        return (byte) (A(obj, (-4) & j7) >>> ((int) ((j7 & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean J(Object obj, long j7) {
        return H(obj, j7) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean K(Object obj, long j7) {
        return I(obj, j7) != 0;
    }

    static byte a(byte[] bArr, long j7) {
        return f20717f.l(bArr, f20720i + j7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Object obj, long j7, byte b8) {
        long j8 = (-4) & j7;
        int A = A(obj, j8);
        int i7 = ((~((int) j7)) & 3) << 3;
        e(obj, j8, ((255 & b8) << i7) | (A & (~(255 << i7))));
    }

    static void c(Object obj, long j7, double d8) {
        f20717f.a(obj, j7, d8);
    }

    static void d(Object obj, long j7, float f8) {
        f20717f.b(obj, j7, f8);
    }

    static void e(Object obj, long j7, int i7) {
        f20717f.c(obj, j7, i7);
    }

    static void f(Object obj, long j7, long j8) {
        f20717f.d(obj, j7, j8);
    }

    static void g(Object obj, long j7, Object obj2) {
        f20717f.f20736a.putObject(obj, j7, obj2);
    }

    static void h(Object obj, long j7, boolean z7) {
        f20717f.e(obj, j7, z7);
    }

    static void i(byte[] bArr, long j7, byte b8) {
        f20717f.f(bArr, f20720i + j7, b8);
    }

    private static Field j(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k(Object obj, long j7, byte b8) {
        long j8 = (-4) & j7;
        int i7 = (((int) j7) & 3) << 3;
        e(obj, j8, ((255 & b8) << i7) | (A(obj, j8) & (~(255 << i7))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(Object obj, long j7, boolean z7) {
        b(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(Object obj, long j7, boolean z7) {
        k(obj, j7, z7 ? (byte) 1 : (byte) 0);
    }

    static boolean r() {
        return f20719h;
    }

    static boolean s() {
        return f20718g;
    }

    static Unsafe t() {
        try {
            return (Unsafe) AccessController.doPrivileged(new s2());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean u() {
        Unsafe unsafe = f20713b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            if (g.a()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger = f20712a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean v() {
        Unsafe unsafe = f20713b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (w() == null) {
                return false;
            }
            if (g.a()) {
                return true;
            }
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            Logger logger = f20712a;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(valueOf.length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static Field w() {
        Field j7;
        if (g.a() && (j7 = j(Buffer.class, "effectiveDirectAddress")) != null) {
            return j7;
        }
        Field j8 = j(Buffer.class, "address");
        if (j8 == null || j8.getType() != Long.TYPE) {
            return null;
        }
        return j8;
    }

    static Object x(Class cls) {
        try {
            return f20713b.allocateInstance(cls);
        } catch (InstantiationException e8) {
            throw new IllegalStateException(e8);
        }
    }

    private static int y(Class cls) {
        if (f20719h) {
            return f20717f.f20736a.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int z(Class cls) {
        if (f20719h) {
            return f20717f.f20736a.arrayIndexScale(cls);
        }
        return -1;
    }
}
