package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class w45 extends sz4 implements x05 {
    private static final w45 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb;
    private boolean zzc;
    private int zzd;

    static {
        w45 w45Var = new w45();
        zze = w45Var;
        sz4.U(w45.class, w45Var);
    }

    private w45() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            wz4 wz4Var = u45.f16582a;
            return sz4.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zza", "zzb", wz4Var, "zzc", "zzd", wz4Var});
        }
        if (ordinal == 3) {
            return new w45();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new v45(bArr);
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
        synchronized (w45.class) {
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
}
