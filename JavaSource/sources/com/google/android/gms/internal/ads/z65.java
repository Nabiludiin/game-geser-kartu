package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class z65 extends sz4 implements x05 {
    private static final z65 zzd;
    private static volatile d15 zze;
    private int zza;
    private String zzb = "";
    private int zzc;

    static {
        z65 z65Var = new z65();
        zzd = z65Var;
        sz4.U(z65.class, z65Var);
    }

    private z65() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", n75.f12617a});
        }
        if (ordinal == 3) {
            return new z65();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new y65(bArr);
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
        synchronized (z65.class) {
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
