package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class dk extends sz4 implements x05 {
    private static final dk zzc;
    private static volatile d15 zzd;
    private int zza;
    private int zzb;

    static {
        dk dkVar = new dk();
        zzc = dkVar;
        sz4.U(dk.class, dkVar);
    }

    private dk() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zza", "zzb", gk.f8962a});
        }
        if (ordinal == 3) {
            return new dk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ck(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzd;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (dk.class) {
            try {
                d15Var = zzd;
                if (d15Var == null) {
                    d15Var = new pz4(zzc);
                    zzd = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
