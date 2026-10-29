package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class am4 extends sz4 implements x05 {
    private static final am4 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb;
    private em4 zzc;
    private qy4 zzd = qy4.f14669r;

    static {
        am4 am4Var = new am4();
        zze = am4Var;
        sz4.U(am4.class, am4Var);
    }

    private am4() {
    }

    public static zl4 g0() {
        return (zl4) zze.P();
    }

    public static am4 h0() {
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new am4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new zl4(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzf;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (am4.class) {
            try {
                d15Var = zzf;
                if (d15Var == null) {
                    d15Var = new pz4(zze);
                    zzf = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final int d0() {
        return this.zzb;
    }

    public final em4 e0() {
        em4 em4Var = this.zzc;
        return em4Var == null ? em4.f0() : em4Var;
    }

    public final qy4 f0() {
        return this.zzd;
    }

    final /* synthetic */ void i0(em4 em4Var) {
        em4Var.getClass();
        this.zzc = em4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void j0(qy4 qy4Var) {
        this.zzd = qy4Var;
    }
}
