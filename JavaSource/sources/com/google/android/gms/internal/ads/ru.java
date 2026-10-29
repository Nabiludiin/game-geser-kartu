package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ru extends sz4 implements x05 {
    private static final ru zzB;
    private static volatile d15 zzC = null;
    public static final int zza = 7;
    public static final int zzb = 8;
    public static final int zzc = 9;
    public static final int zzd = 10;
    public static final int zze = 11;
    public static final int zzf = 12;
    public static final int zzg = 13;
    public static final int zzh = 14;
    public static final int zzi = 15;
    public static final int zzj = 16;
    public static final int zzk = 17;
    private int zzl;
    private int zzm;
    private dx zzo;
    private fx zzp;
    private hx zzv;
    private hv zzw;
    private zu zzx;
    private vx zzy;
    private xx zzz;
    private int zzn = 1000;
    private b05 zzu = sz4.y();
    private b05 zzA = sz4.y();

    static {
        ru ruVar = new ru();
        zzB = ruVar;
        sz4.U(ru.class, ruVar);
    }

    private ru() {
    }

    public static ru d0() {
        return zzB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void e0(ou ouVar) {
        this.zzm = ouVar.a();
        this.zzl |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void f0(fx fxVar) {
        fxVar.getClass();
        this.zzp = fxVar;
        this.zzl |= 8;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzB, "\u0004\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzl", "zzm", ou.d(), "zzn", ox.d(), "zzo", "zzp", "zzu", bx.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", tv.class});
        }
        if (ordinal == 3) {
            return new ru();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new qu(bArr);
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
        synchronized (ru.class) {
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

    public fx j0() {
        fx fxVar = this.zzp;
        return fxVar == null ? fx.d0() : fxVar;
    }
}
