package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class i65 extends sz4 implements x05 {
    private static final i65 zzh;
    private static volatile d15 zzi;
    private int zza;
    private int zzb;
    private int zze;
    private String zzc = "";
    private xz4 zzd = sz4.u();
    private b05 zzf = sz4.y();
    private qy4 zzg = qy4.f14669r;

    static {
        i65 i65Var = new i65();
        zzh = i65Var;
        sz4.U(i65.class, i65Var);
    }

    private i65() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzh, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", g65.class, "zzg"});
        }
        if (ordinal == 3) {
            return new i65();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new h65(bArr);
        }
        if (ordinal == 5) {
            return zzh;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzi;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (i65.class) {
            try {
                d15Var = zzi;
                if (d15Var == null) {
                    d15Var = new pz4(zzh);
                    zzi = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
