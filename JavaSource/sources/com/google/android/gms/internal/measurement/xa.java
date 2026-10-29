package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyApplication */
public abstract class xa extends o9 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected uc zzc = uc.a();

    protected static cb A(cb cbVar) {
        int size = cbVar.size();
        return cbVar.b0(size + size);
    }

    protected static db B() {
        return gc.e();
    }

    protected static db C(db dbVar) {
        int size = dbVar.size();
        return dbVar.b0(size + size);
    }

    private static final boolean D(xa xaVar, boolean z7) {
        byte byteValue = ((Byte) xaVar.E(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean e8 = fc.a().b(xaVar.getClass()).e(xaVar);
        if (z7) {
            xaVar.E(2, true != e8 ? null : xaVar, null);
        }
        return e8;
    }

    private final int k(ic icVar) {
        return fc.a().b(getClass()).g(this);
    }

    static xa u(Class cls) {
        Map map = zzd;
        xa xaVar = (xa) map.get(cls);
        if (xaVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                xaVar = (xa) map.get(cls);
            } catch (ClassNotFoundException e8) {
                throw new IllegalStateException("Class initialization cannot fail.", e8);
            }
        }
        if (xaVar != null) {
            return xaVar;
        }
        xa xaVar2 = (xa) ((xa) ad.h(cls)).E(6, null, null);
        if (xaVar2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, xaVar2);
        return xaVar2;
    }

    protected static void v(Class cls, xa xaVar) {
        xaVar.n();
        zzd.put(cls, xaVar);
    }

    protected static Object w(xb xbVar, String str, Object[] objArr) {
        return new hc(xbVar, str, objArr);
    }

    static Object x(Method method, Object obj, Object... objArr) {
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

    protected static bb y() {
        return ya.e();
    }

    protected static cb z() {
        return lb.e();
    }

    protected abstract Object E(int i7, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.xb
    public final int a() {
        if (m()) {
            int k7 = k(null);
            if (k7 >= 0) {
                return k7;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(k7).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(k7);
            throw new IllegalStateException(sb.toString());
        }
        int i7 = this.zzb & Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int k8 = k(null);
        if (k8 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | k8;
            return k8;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(k8).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(k8);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.xb
    public final /* synthetic */ wb b() {
        return (va) E(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.xb
    public final void d(ha haVar) {
        fc.a().b(getClass()).d(this, ia.K(haVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return fc.a().b(getClass()).f(this, (xa) obj);
    }

    @Override // com.google.android.gms.internal.measurement.o9
    final int f(ic icVar) {
        if (m()) {
            int g8 = icVar.g(this);
            if (g8 >= 0) {
                return g8;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(g8).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(g8);
            throw new IllegalStateException(sb.toString());
        }
        int i7 = this.zzb & Integer.MAX_VALUE;
        if (i7 != Integer.MAX_VALUE) {
            return i7;
        }
        int g9 = icVar.g(this);
        if (g9 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | g9;
            return g9;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(g9).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(g9);
        throw new IllegalStateException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.measurement.yb
    public final /* synthetic */ xb g() {
        return (xa) E(6, null, null);
    }

    public final int hashCode() {
        if (m()) {
            return p();
        }
        int i7 = this.zza;
        if (i7 != 0) {
            return i7;
        }
        int p7 = p();
        this.zza = p7;
        return p7;
    }

    public final boolean l() {
        return D(this, true);
    }

    final boolean m() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void n() {
        this.zzb &= Integer.MAX_VALUE;
    }

    final xa o() {
        return (xa) E(4, null, null);
    }

    final int p() {
        return fc.a().b(getClass()).j(this);
    }

    protected final void q() {
        fc.a().b(getClass()).b(this);
        n();
    }

    protected final va r() {
        return (va) E(5, null, null);
    }

    public final va s() {
        va vaVar = (va) E(5, null, null);
        vaVar.v(this);
        return vaVar;
    }

    final void t(int i7) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return zb.a(this, super.toString());
    }
}
