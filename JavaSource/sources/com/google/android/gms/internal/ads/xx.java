package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class xx extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    private static final xx zzj;
    private static volatile d15 zzk;
    private int zze;
    private tx zzf;
    private b05 zzg = sz4.y();
    private int zzh;
    private pv zzi;

    static {
        xx xxVar = new xx();
        zzj = xxVar;
        sz4.U(xx.class, xxVar);
    }

    private xx() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzj, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003᠌\u0001\u0004ဉ\u0002", new Object[]{"zze", "zzf", "zzg", nv.class, "zzh", ox.d(), "zzi"});
        }
        if (ordinal == 3) {
            return new xx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new wx(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzk;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (xx.class) {
            try {
                d15Var = zzk;
                if (d15Var == null) {
                    d15Var = new pz4(zzj);
                    zzk = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
