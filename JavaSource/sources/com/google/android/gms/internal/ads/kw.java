package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class kw extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    private static final kw zzh;
    private static volatile d15 zzi;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        kw kwVar = new kw();
        zzh = kwVar;
        sz4.U(kw.class, kwVar);
    }

    private kw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public void j0(boolean z7) {
        this.zzd |= 1;
        this.zze = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public void k0(boolean z7) {
        this.zzd |= 2;
        this.zzf = z7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void d0(int i7) {
        this.zzd |= 4;
        this.zzg = i7;
    }

    public static jw i0() {
        return (jw) zzh.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (ordinal == 3) {
            return new kw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new jw(bArr);
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
        synchronized (kw.class) {
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
