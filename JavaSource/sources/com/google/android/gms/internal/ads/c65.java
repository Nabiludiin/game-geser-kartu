package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class c65 extends sz4 implements x05 {
    private static final c65 zzd;
    private static volatile d15 zze;
    private int zza;
    private int zzb;
    private String zzc = "";

    static {
        c65 c65Var = new c65();
        zzd = c65Var;
        sz4.U(c65.class, c65Var);
    }

    private c65() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", b65.f5604a, "zzc"});
        }
        if (ordinal == 3) {
            return new c65();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new a65(bArr);
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
        synchronized (c65.class) {
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
