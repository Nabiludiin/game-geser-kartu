package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class nw extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    private static final nw zzl;
    private static volatile d15 zzm;
    private int zzf;
    private int zzg = 1000;
    private zv zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    static {
        nw nwVar = new nw();
        zzl = nwVar;
        sz4.U(nw.class, nwVar);
    }

    private nw() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzl, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzf", "zzg", ox.d(), "zzh", "zzi", "zzj", "zzk"});
        }
        if (ordinal == 3) {
            return new nw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new mw(bArr);
        }
        if (ordinal == 5) {
            return zzl;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzm;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (nw.class) {
            try {
                d15Var = zzm;
                if (d15Var == null) {
                    d15Var = new pz4(zzl);
                    zzm = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
