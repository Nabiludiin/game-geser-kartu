package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class zj extends sz4 implements x05 {
    private static final zj zzg;
    private static volatile d15 zzh;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzb = 100;
    private long zze = 300;
    private long zzf = 1000;

    static {
        zj zjVar = new zj();
        zzg = zjVar;
        sz4.U(zj.class, zjVar);
    }

    private zj() {
    }

    public static zj d0() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzg, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new zj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new yj(bArr);
        }
        if (ordinal == 5) {
            return zzg;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzh;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (zj.class) {
            try {
                d15Var = zzh;
                if (d15Var == null) {
                    d15Var = new pz4(zzg);
                    zzh = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
