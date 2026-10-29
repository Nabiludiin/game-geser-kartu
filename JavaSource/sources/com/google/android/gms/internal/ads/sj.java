package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class sj extends sz4 implements x05 {
    private static final sj zzg;
    private static volatile d15 zzh;
    private int zza;
    private boolean zzb;
    private int zzc = 5000;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    static {
        sj sjVar = new sj();
        zzg = sjVar;
        sz4.U(sj.class, sjVar);
    }

    private sj() {
    }

    public static sj i0() {
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
            return sz4.V(zzg, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new sj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new rj(bArr);
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
        synchronized (sj.class) {
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

    public final boolean d0() {
        return this.zzb;
    }

    public final int e0() {
        return this.zzc;
    }

    public final boolean f0() {
        return this.zzd;
    }

    public final boolean g0() {
        return this.zze;
    }

    public final boolean h0() {
        return this.zzf;
    }
}
