package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class qq extends sz4 implements x05 {
    private static final qq zzd;
    private static volatile d15 zze;
    private int zza;
    private sq zzb;
    private qy4 zzc = qy4.f14669r;

    static {
        qq qqVar = new qq();
        zzd = qqVar;
        sz4.U(qq.class, qqVar);
    }

    private qq() {
    }

    public static qq h0() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new qq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new pq(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zze;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (qq.class) {
            try {
                d15Var = zze;
                if (d15Var == null) {
                    d15Var = new pz4(zzd);
                    zze = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final boolean d0() {
        return (this.zza & 1) != 0;
    }

    public final sq e0() {
        sq sqVar = this.zzb;
        return sqVar == null ? sq.f0() : sqVar;
    }

    public final boolean f0() {
        return (this.zza & 2) != 0;
    }

    public final qy4 g0() {
        return this.zzc;
    }
}
