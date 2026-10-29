package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class k75 extends sz4 implements x05 {
    private static final k75 zzj;
    private static volatile d15 zzk;
    private int zza;
    private s65 zzh;
    private String zzb = "";
    private String zzc = "";
    private b05 zzd = sz4.y();
    private b05 zze = sz4.y();
    private b05 zzf = sz4.y();
    private int zzg = -1;
    private String zzi = "";

    static {
        k75 k75Var = new k75();
        zzj = k75Var;
        sz4.U(k75.class, k75Var);
    }

    private k75() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzj, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0003\u0000\u0001ဈ\u0001\u0002\u001b\u0003\u001b\u0004င\u0002\u0005ဈ\u0000\b\u001b\tဈ\u0004\nဉ\u0003", new Object[]{"zza", "zzc", "zzd", w65.class, "zze", d75.class, "zzg", "zzb", "zzf", r75.class, "zzi", "zzh"});
        }
        if (ordinal == 3) {
            return new k75();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new j75(bArr);
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
        synchronized (k75.class) {
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
