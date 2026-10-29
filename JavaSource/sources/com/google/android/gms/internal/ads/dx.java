package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class dx extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final dx zzh;
    private static volatile d15 zzi;
    private int zzd;
    private String zze = "";
    private b05 zzf = sz4.y();
    private int zzg;

    static {
        dx dxVar = new dx();
        zzh = dxVar;
        sz4.U(dx.class, dxVar);
    }

    private dx() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001", new Object[]{"zzd", "zze", "zzf", bx.class, "zzg", ox.d()});
        }
        if (ordinal == 3) {
            return new dx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new cx(bArr);
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
        synchronized (dx.class) {
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
