package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class tk3 extends sz4 implements x05 {
    private static final tk3 zzf;
    private static volatile d15 zzg;
    private int zza;
    private xk3 zzb;
    private qy4 zzc;
    private qy4 zzd;
    private int zze;

    static {
        tk3 tk3Var = new tk3();
        zzf = tk3Var;
        sz4.U(tk3.class, tk3Var);
    }

    private tk3() {
        qy4 qy4Var = qy4.f14669r;
        this.zzc = qy4Var;
        this.zzd = qy4Var;
    }

    public static sk3 g0() {
        return (sk3) zzf.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002\u0004᠌\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", ll3.f11649a});
        }
        if (ordinal == 3) {
            return new tk3();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new sk3(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzg;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (tk3.class) {
            try {
                d15Var = zzg;
                if (d15Var == null) {
                    d15Var = new pz4(zzf);
                    zzg = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final xk3 d0() {
        xk3 xk3Var = this.zzb;
        return xk3Var == null ? xk3.h0() : xk3Var;
    }

    public final qy4 e0() {
        return this.zzc;
    }

    public final qy4 f0() {
        return this.zzd;
    }

    final /* synthetic */ void h0(xk3 xk3Var) {
        xk3Var.getClass();
        this.zzb = xk3Var;
        this.zza |= 1;
    }

    final /* synthetic */ void i0(qy4 qy4Var) {
        qy4Var.getClass();
        this.zza |= 2;
        this.zzc = qy4Var;
    }

    final /* synthetic */ void j0(qy4 qy4Var) {
        qy4Var.getClass();
        this.zza |= 4;
        this.zzd = qy4Var;
    }

    public final int l0() {
        int a8 = ml3.a(this.zze);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }

    final /* synthetic */ void m0(int i7) {
        this.zze = i7 - 1;
        this.zza |= 8;
    }
}
