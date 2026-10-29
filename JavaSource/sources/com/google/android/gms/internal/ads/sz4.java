package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
public abstract class sz4 extends ay4 {
    private static final int zza = Integer.MIN_VALUE;
    private static final int zzb = Integer.MAX_VALUE;
    private static Map<Class<?>, sz4> zzd = new ConcurrentHashMap();
    static final int zzr = Integer.MAX_VALUE;
    static final int zzs = 0;
    private int zzc = -1;
    protected z15 zzt = z15.a();

    static sz4 A(sz4 sz4Var, uy4 uy4Var, ez4 ez4Var) {
        sz4 M = sz4Var.M();
        try {
            n15 b8 = f15.a().b(M.getClass());
            b8.l(M, vy4.W(uy4Var), ez4Var);
            b8.e(M);
            return M;
        } catch (e05 e8) {
            if (e8.b()) {
                throw new e05(e8);
            }
            throw e8;
        } catch (x15 e9) {
            throw e9.a();
        } catch (IOException e10) {
            if (e10.getCause() instanceof e05) {
                throw ((e05) e10.getCause());
            }
            throw new e05(e10);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof e05) {
                throw ((e05) e11.getCause());
            }
            throw e11;
        }
    }

    protected static sz4 B(sz4 sz4Var, qy4 qy4Var) {
        ez4 ez4Var = ez4.f7893c;
        int i7 = dy4.f7358a;
        sz4 C = C(sz4Var, qy4Var, ez4.f7893c);
        b0(C);
        return C;
    }

    protected static sz4 C(sz4 sz4Var, qy4 qy4Var, ez4 ez4Var) {
        sz4 c02 = c0(sz4Var, qy4Var, ez4Var);
        b0(c02);
        return c02;
    }

    protected static sz4 D(sz4 sz4Var, byte[] bArr) {
        int length = bArr.length;
        ez4 ez4Var = ez4.f7893c;
        int i7 = dy4.f7358a;
        sz4 a02 = a0(sz4Var, bArr, 0, length, ez4.f7893c);
        b0(a02);
        return a02;
    }

    protected static sz4 E(sz4 sz4Var, byte[] bArr, ez4 ez4Var) {
        sz4 a02 = a0(sz4Var, bArr, 0, bArr.length, ez4Var);
        b0(a02);
        return a02;
    }

    protected static sz4 F(sz4 sz4Var, InputStream inputStream) {
        uy4 d8 = uy4.d(inputStream, 4096);
        ez4 ez4Var = ez4.f7893c;
        int i7 = dy4.f7358a;
        sz4 A = A(sz4Var, d8, ez4.f7893c);
        b0(A);
        return A;
    }

    protected static sz4 G(sz4 sz4Var, InputStream inputStream, ez4 ez4Var) {
        sz4 A = A(sz4Var, uy4.d(inputStream, 4096), ez4Var);
        b0(A);
        return A;
    }

    static sz4 T(Class cls) {
        sz4 sz4Var = zzd.get(cls);
        if (sz4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                sz4Var = zzd.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (sz4Var != null) {
            return sz4Var;
        }
        sz4 b8 = ((sz4) f25.k(cls)).b();
        if (b8 == null) {
            throw new IllegalStateException();
        }
        zzd.put(cls, b8);
        return b8;
    }

    protected static void U(Class cls, sz4 sz4Var) {
        sz4Var.r();
        zzd.put(cls, sz4Var);
    }

    protected static Object V(v05 v05Var, String str, Object[] objArr) {
        return new h15(v05Var, str, objArr);
    }

    private int X(n15 n15Var) {
        if (n15Var != null) {
            return n15Var.g(this);
        }
        return f15.a().b(getClass()).g(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean Z(sz4 sz4Var, boolean z7) {
        byte byteValue = ((Byte) sz4Var.Y(rz4.GET_MEMOIZED_IS_INITIALIZED, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean i7 = f15.a().b(sz4Var.getClass()).i(sz4Var);
        if (z7) {
            sz4Var.Y(rz4.SET_MEMOIZED_IS_INITIALIZED, true != i7 ? null : sz4Var, null);
        }
        return i7;
    }

    private static sz4 a0(sz4 sz4Var, byte[] bArr, int i7, int i8, ez4 ez4Var) {
        if (i8 == 0) {
            return sz4Var;
        }
        sz4 M = sz4Var.M();
        try {
            n15 b8 = f15.a().b(M.getClass());
            b8.m(M, bArr, i7, i7 + i8, new ey4(ez4Var));
            b8.e(M);
            return M;
        } catch (e05 e8) {
            if (e8.b()) {
                throw new e05(e8);
            }
            throw e8;
        } catch (x15 e9) {
            throw e9.a();
        } catch (IOException e10) {
            if (e10.getCause() instanceof e05) {
                throw ((e05) e10.getCause());
            }
            throw new e05(e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new e05("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static sz4 b0(sz4 sz4Var) {
        if (sz4Var == null || sz4Var.a()) {
            return sz4Var;
        }
        throw sz4Var.i().a();
    }

    private static sz4 c0(sz4 sz4Var, qy4 qy4Var, ez4 ez4Var) {
        uy4 q7 = qy4Var.q();
        sz4 A = A(sz4Var, q7, ez4Var);
        q7.l(0);
        return A;
    }

    static Object t(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e8);
        } catch (InvocationTargetException e9) {
            Throwable cause = e9.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static xz4 u() {
        return tz4.e();
    }

    protected static xz4 v(xz4 xz4Var) {
        int size = xz4Var.size();
        return xz4Var.F(size + size);
    }

    protected static zz4 w() {
        return j05.g();
    }

    protected static zz4 x(zz4 zz4Var) {
        int size = zz4Var.size();
        return zz4Var.F(size + size);
    }

    protected static b05 y() {
        return g15.e();
    }

    protected static b05 z(b05 b05Var) {
        int size = b05Var.size();
        return b05Var.F(size + size);
    }

    void H(int i7) {
        this.zzq = i7;
    }

    void I() {
        this.zzq = 0;
    }

    boolean J() {
        return s() == 0;
    }

    @Override // com.google.android.gms.internal.ads.x05
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public final sz4 b() {
        return (sz4) Y(rz4.GET_DEFAULT_INSTANCE, null, null);
    }

    @Override // com.google.android.gms.internal.ads.v05
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final oz4 l() {
        return (oz4) Y(rz4.NEW_BUILDER, null, null);
    }

    sz4 M() {
        return (sz4) Y(rz4.NEW_MUTABLE_INSTANCE, null, null);
    }

    int N() {
        return f15.a().b(getClass()).j(this);
    }

    protected void O() {
        f15.a().b(getClass()).e(this);
        r();
    }

    protected final oz4 P() {
        return (oz4) Y(rz4.NEW_BUILDER, null, null);
    }

    public final oz4 Q() {
        oz4 oz4Var = (oz4) Y(rz4.NEW_BUILDER, null, null);
        oz4Var.B(this);
        return oz4Var;
    }

    void R() {
        g(Integer.MAX_VALUE);
    }

    Object S() {
        return Y(rz4.BUILD_MESSAGE_INFO, null, null);
    }

    protected abstract Object Y(rz4 rz4Var, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.ads.x05
    public final boolean a() {
        return Z(this, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return f15.a().b(getClass()).f(this, (sz4) obj);
    }

    @Override // com.google.android.gms.internal.ads.ay4
    int f() {
        return this.zzc & Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.ay4
    void g(int i7) {
        if (i7 >= 0) {
            this.zzc = i7 | (this.zzc & zza);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(i7);
        throw new IllegalStateException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.ay4
    int h(n15 n15Var) {
        if (!q()) {
            if (f() != Integer.MAX_VALUE) {
                return f();
            }
            int X = X(n15Var);
            g(X);
            return X;
        }
        int X2 = X(n15Var);
        if (X2 >= 0) {
            return X2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(X2).length() + 42);
        sb.append("serialized size must be non-negative, was ");
        sb.append(X2);
        throw new IllegalStateException(sb.toString());
    }

    public int hashCode() {
        if (q()) {
            return N();
        }
        if (J()) {
            H(N());
        }
        return s();
    }

    @Override // com.google.android.gms.internal.ads.v05
    public int m() {
        return h(null);
    }

    @Override // com.google.android.gms.internal.ads.v05
    public void n(az4 az4Var) {
        f15.a().b(getClass()).k(this, bz4.K(az4Var));
    }

    @Override // com.google.android.gms.internal.ads.v05
    public final d15 p() {
        return (d15) Y(rz4.GET_PARSER, null, null);
    }

    boolean q() {
        return (this.zzc & zza) != 0;
    }

    void r() {
        this.zzc &= Integer.MAX_VALUE;
    }

    int s() {
        return this.zzq;
    }

    public String toString() {
        return y05.a(this, super.toString());
    }
}
