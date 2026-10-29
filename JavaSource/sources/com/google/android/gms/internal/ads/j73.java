package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class j73 extends sz4 implements x05 {
    private static final j73 zzd;
    private static volatile d15 zze;
    private long zza;
    private long zzb;
    private b05 zzc = sz4.y();

    static {
        j73 j73Var = new j73();
        zzd = j73Var;
        sz4.U(j73.class, j73Var);
    }

    private j73() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0002\u0002\u0002\u0003Ț", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new j73();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new i73(bArr);
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
        synchronized (j73.class) {
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
}
