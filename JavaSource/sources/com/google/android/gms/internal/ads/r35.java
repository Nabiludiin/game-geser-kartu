package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class r35 extends sz4 implements x05 {
    private static final r35 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb;
    private long zzc;
    private qy4 zzd = qy4.f14669r;

    static {
        r35 r35Var = new r35();
        zze = r35Var;
        sz4.U(r35.class, r35Var);
    }

    private r35() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", q35.f14237a, "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new r35();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new p35(bArr);
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
        synchronized (r35.class) {
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
