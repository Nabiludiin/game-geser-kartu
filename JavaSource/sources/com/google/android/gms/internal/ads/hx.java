package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class hx extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    private static final hx zzn;
    private static volatile d15 zzo;
    private int zzg;
    private int zzh;
    private pv zzi;
    private pv zzj;
    private pv zzk;
    private b05 zzl = sz4.y();
    private int zzm;

    static {
        hx hxVar = new hx();
        zzn = hxVar;
        sz4.U(hx.class, hxVar);
    }

    private hx() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzn, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzg", "zzh", "zzi", "zzj", "zzk", "zzl", pv.class, "zzm"});
        }
        if (ordinal == 3) {
            return new hx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new gx(bArr);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzo;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (hx.class) {
            try {
                d15Var = zzo;
                if (d15Var == null) {
                    d15Var = new pz4(zzn);
                    zzo = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
