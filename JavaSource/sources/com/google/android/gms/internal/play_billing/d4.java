package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
public abstract class d4 extends u2 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected q5 zzc = q5.c();

    private static final boolean e(d4 d4Var, boolean z7) {
        byte byteValue = ((Byte) d4Var.h(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e8 = g5.a().b(d4Var.getClass()).e(d4Var);
        if (z7) {
            d4Var.h(2, true != e8 ? null : d4Var, null);
        }
        return e8;
    }

    private final int j(j5 j5Var) {
        return g5.a().b(getClass()).d(this);
    }

    private static d4 k(d4 d4Var, byte[] bArr, int i7, int i8, t3 t3Var) {
        if (i8 == 0) {
            return d4Var;
        }
        d4 q7 = d4Var.q();
        try {
            j5 b8 = g5.a().b(q7.getClass());
            b8.i(q7, bArr, 0, i8, new x2(t3Var));
            b8.f(q7);
            return q7;
        } catch (l4 e8) {
            throw e8;
        } catch (o5 e9) {
            throw e9.a();
        } catch (IOException e10) {
            if (e10.getCause() instanceof l4) {
                throw ((l4) e10.getCause());
            }
            throw new l4(e10);
        } catch (IndexOutOfBoundsException unused) {
            throw new l4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    static d4 p(Class cls) {
        Map map = zzb;
        d4 d4Var = (d4) map.get(cls);
        if (d4Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                d4Var = (d4) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (d4Var != null) {
            return d4Var;
        }
        d4 d4Var2 = (d4) ((d4) w5.j(cls)).h(6, null, null);
        if (d4Var2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, d4Var2);
        return d4Var2;
    }

    protected static d4 r(d4 d4Var, byte[] bArr, t3 t3Var) {
        d4 k7 = k(d4Var, bArr, 0, bArr.length, t3Var);
        if (k7 == null || e(k7, true)) {
            return k7;
        }
        throw new o5(k7).a();
    }

    protected static h4 s() {
        return e4.g();
    }

    protected static i4 t() {
        return h5.e();
    }

    static Object u(Method method, Object obj, Object... objArr) {
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

    protected static Object v(z4 z4Var, String str, Object[] objArr) {
        return new i5(z4Var, str, objArr);
    }

    protected static void y(Class cls, d4 d4Var) {
        d4Var.x();
        zzb.put(cls, d4Var);
    }

    final boolean A() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // com.google.android.gms.internal.play_billing.z4
    public final /* synthetic */ y4 S() {
        return (b4) h(5, null, null);
    }

    @Override // com.google.android.gms.internal.play_billing.z4
    public final void a(p3 p3Var) {
        g5.a().b(getClass()).a(this, q3.K(p3Var));
    }

    @Override // com.google.android.gms.internal.play_billing.u2
    final int c(j5 j5Var) {
        if (A()) {
            int d8 = j5Var.d(this);
            if (d8 >= 0) {
                return d8;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + d8);
        }
        int i7 = this.zzd & Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int d9 = j5Var.d(this);
        if (d9 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | d9;
            return d9;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + d9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return g5.a().b(getClass()).h(this, (d4) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.a5
    public final /* synthetic */ z4 g() {
        return (d4) h(6, null, null);
    }

    protected abstract Object h(int i7, Object obj, Object obj2);

    public final int hashCode() {
        if (A()) {
            return l();
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int l7 = l();
        this.zza = l7;
        return l7;
    }

    @Override // com.google.android.gms.internal.play_billing.z4
    public final int i() {
        if (A()) {
            int j7 = j(null);
            if (j7 >= 0) {
                return j7;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + j7);
        }
        int i7 = this.zzd & Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int j8 = j(null);
        if (j8 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | j8;
            return j8;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + j8);
    }

    final int l() {
        return g5.a().b(getClass()).b(this);
    }

    public final boolean m() {
        return e(this, true);
    }

    protected final b4 n() {
        return (b4) h(5, null, null);
    }

    public final b4 o() {
        b4 b4Var = (b4) h(5, null, null);
        b4Var.k(this);
        return b4Var;
    }

    final d4 q() {
        return (d4) h(4, null, null);
    }

    public final String toString() {
        return b5.a(this, super.toString());
    }

    protected final void w() {
        g5.a().b(getClass()).f(this);
        x();
    }

    final void x() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void z(int i7) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }
}
