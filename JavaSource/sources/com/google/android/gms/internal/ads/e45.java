package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class e45 extends sz4 implements x05 {
    private static final e45 zzf;
    private static volatile d15 zzg;
    private int zza;
    private d45 zzc;
    private long zzd;
    private String zzb = "";
    private String zze = "";

    static {
        e45 e45Var = new e45();
        zzf = e45Var;
        sz4.U(e45.class, e45Var);
    }

    private e45() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new e45();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new a45(bArr);
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
        synchronized (e45.class) {
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
}
