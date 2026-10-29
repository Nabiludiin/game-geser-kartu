package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class hv extends sz4 implements x05 {
    private static final hv zzB;
    private static volatile d15 zzC = null;
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    private jv zzA;
    private int zzl;
    private int zzm = 1000;
    private int zzn = 1000;
    private int zzo;
    private int zzp;
    private int zzu;
    private int zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        hv hvVar = new hv();
        zzB = hvVar;
        sz4.U(hv.class, hvVar);
    }

    private hv() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzB, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzl", "zzm", ox.d(), "zzn", ox.d(), "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA"});
        }
        if (ordinal == 3) {
            return new hv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new gv(bArr);
        }
        if (ordinal == 5) {
            return zzB;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzC;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (hv.class) {
            try {
                d15Var = zzC;
                if (d15Var == null) {
                    d15Var = new pz4(zzB);
                    zzC = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
