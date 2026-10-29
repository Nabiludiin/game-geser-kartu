package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class tv extends sz4 implements x05 {
    private static final tv zzL;
    private static volatile d15 zzM = null;
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private pw zzA;
    private bw zzB;
    private int zzC;
    private int zzD;
    private pv zzE;
    private int zzF;
    private int zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private long zzK;
    private int zzu;
    private nw zzv;
    private rw zzw;
    private tw zzx;
    private vw zzy;
    private vv zzz;

    static {
        tv tvVar = new tv();
        zzL = tvVar;
        sz4.U(tv.class, tvVar);
    }

    private tv() {
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzL, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK"});
        }
        if (ordinal == 3) {
            return new tv();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new sv(bArr);
        }
        if (ordinal == 5) {
            return zzL;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzM;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (tv.class) {
            try {
                d15Var = zzM;
                if (d15Var == null) {
                    d15Var = new pz4(zzL);
                    zzM = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
