package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class z63 extends sz4 implements x05 {
    private static final z63 zzg;
    private static volatile d15 zzh;
    private int zzb;
    private int zzc;
    private boolean zzd;
    private boolean zzf;
    private String zza = "";
    private String zze = "";

    static {
        z63 z63Var = new z63();
        zzg = z63Var;
        sz4.U(z63.class, z63Var);
    }

    private z63() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzg, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u0007\u0005Ȉ\u0006\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf"});
        }
        if (ordinal == 3) {
            return new z63();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new y63(bArr);
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
        synchronized (z63.class) {
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
