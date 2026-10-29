package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class r45 extends sz4 implements x05 {
    private static final r45 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb;
    private qy4 zzc;
    private qy4 zzd;

    static {
        r45 r45Var = new r45();
        zze = r45Var;
        sz4.U(r45.class, r45Var);
    }

    private r45() {
        qy4 qy4Var = qy4.f14669r;
        this.zzc = qy4Var;
        this.zzd = qy4Var;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new r45();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new q45(bArr);
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
        synchronized (r45.class) {
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
