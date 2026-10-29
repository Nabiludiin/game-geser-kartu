package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class g65 extends sz4 implements x05 {
    private static final g65 zzd;
    private static volatile d15 zze;
    private int zza;
    private String zzb = "";
    private String zzc = "";

    static {
        g65 g65Var = new g65();
        zzd = g65Var;
        sz4.U(g65.class, g65Var);
    }

    private g65() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new g65();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new f65(bArr);
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
        synchronized (g65.class) {
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
