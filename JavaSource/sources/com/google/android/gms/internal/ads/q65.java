package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class q65 extends sz4 implements x05 {
    private static final q65 zzd;
    private static volatile d15 zze;
    private int zza;
    private String zzb = "";
    private xz4 zzc = sz4.u();

    static {
        q65 q65Var = new q65();
        zzd = q65Var;
        sz4.U(q65.class, q65Var);
    }

    private q65() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u0016", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new q65();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new p65(bArr);
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
        synchronized (q65.class) {
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
