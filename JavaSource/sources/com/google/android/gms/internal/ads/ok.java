package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ok extends sz4 implements x05 {
    private static final ok zzd;
    private static volatile d15 zze;
    private int zza;
    private int zzb;
    private long zzc = -1;

    static {
        ok okVar = new ok();
        zzd = okVar;
        sz4.U(ok.class, okVar);
    }

    private ok() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zza", "zzb", ek.f7661a, "zzc"});
        }
        if (ordinal == 3) {
            return new ok();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new nk(bArr);
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
        synchronized (ok.class) {
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
