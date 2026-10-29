package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class z55 extends sz4 implements x05 {
    private static final z55 zzd;
    private static volatile d15 zze;
    private int zza;
    private String zzb = "";
    private qy4 zzc = qy4.f14669r;

    static {
        z55 z55Var = new z55();
        zzd = z55Var;
        sz4.U(z55.class, z55Var);
    }

    private z55() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new z55();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new y55(bArr);
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
        synchronized (z55.class) {
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
