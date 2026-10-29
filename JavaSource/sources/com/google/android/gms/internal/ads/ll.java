package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ll extends sz4 implements x05 {
    private static final ll zze;
    private static volatile d15 zzf;
    private int zza;
    private long zzb;
    private String zzc = "";
    private qy4 zzd = qy4.f14669r;

    static {
        ll llVar = new ll();
        zze = llVar;
        sz4.U(ll.class, llVar);
    }

    private ll() {
    }

    public static ll h0() {
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
            return sz4.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new ll();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new kl(bArr);
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
        synchronized (ll.class) {
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

    public final boolean d0() {
        return (this.zza & 1) != 0;
    }

    public final long e0() {
        return this.zzb;
    }

    public final String f0() {
        return this.zzc;
    }

    public final qy4 g0() {
        return this.zzd;
    }
}
