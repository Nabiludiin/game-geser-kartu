package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class nx extends sz4 implements x05 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    private static final nx zzj;
    private static volatile d15 zzk;
    private int zze;
    private int zzf;
    private rv zzg;
    private String zzh = "";
    private String zzi = "";

    static {
        nx nxVar = new nx();
        zzj = nxVar;
        sz4.U(nx.class, nxVar);
    }

    private nx() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzj, "\u0004\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005᠌\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zze", "zzf", lx.d(), "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new nx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new kx(bArr);
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
        synchronized (nx.class) {
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
