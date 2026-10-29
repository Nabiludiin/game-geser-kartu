package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class sk extends sz4 implements x05 {
    private static final sk zzd;
    private static volatile d15 zze;
    private int zza;
    private long zzb = -1;
    private int zzc = 1000;

    static {
        sk skVar = new sk();
        zzd = skVar;
        sz4.U(sk.class, skVar);
    }

    private sk() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zza", "zzb", "zzc", gl.f9001a});
        }
        if (ordinal == 3) {
            return new sk();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new rk(bArr);
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
        synchronized (sk.class) {
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
