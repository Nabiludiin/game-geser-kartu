package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class jx extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    private static final jx zzv;
    private static volatile d15 zzw;
    private int zzi;
    private pv zzk;
    private int zzl;
    private rv zzm;
    private int zzn;
    private String zzj = "";
    private int zzo = 1000;
    private int zzp = 1000;
    private int zzu = 1000;

    static {
        jx jxVar = new jx();
        zzv = jxVar;
        sz4.U(jx.class, jxVar);
    }

    private jx() {
    }

    public static jx d0() {
        return zzv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void e0(String str) {
        str.getClass();
        this.zzi |= 1;
        this.zzj = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void f0(rv rvVar) {
        rvVar.getClass();
        this.zzm = rvVar;
        this.zzi |= 8;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzv, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", ox.d(), "zzp", ox.d(), "zzu", ox.d()});
        }
        if (ordinal == 3) {
            return new jx();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ix(bArr);
        }
        if (ordinal == 5) {
            return zzv;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzw;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (jx.class) {
            try {
                d15Var = zzw;
                if (d15Var == null) {
                    d15Var = new pz4(zzv);
                    zzw = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }
}
