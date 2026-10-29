package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class sq extends sz4 implements x05 {
    private static final sq zzf;
    private static volatile d15 zzg;
    private int zza;
    private wq zzb;
    private qy4 zzc = qy4.f14669r;
    private long zzd;
    private long zze;

    static {
        sq sqVar = new sq();
        zzf = sqVar;
        sz4.U(sq.class, sqVar);
    }

    private sq() {
    }

    public static sq f0() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new sq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new rq(bArr);
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
        synchronized (sq.class) {
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

    public final qy4 d0() {
        return this.zzc;
    }

    public final long e0() {
        return this.zze;
    }
}
