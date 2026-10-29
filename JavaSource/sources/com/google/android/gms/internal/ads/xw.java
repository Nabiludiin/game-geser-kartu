package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class xw extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final xw zzf;
    private static volatile d15 zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        xw xwVar = new xw();
        zzf = xwVar;
        sz4.U(xw.class, xwVar);
    }

    private xw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void h0(int i7) {
        this.zzc |= 2;
        this.zze = i7;
    }

    public static ww f0() {
        return (ww) zzf.P();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public void g0(boolean z7) {
        this.zzc |= 1;
        this.zzd = z7;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new xw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ww(bArr);
        }
        if (ordinal == 5) {
            return zzf;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzg;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (xw.class) {
            try {
                d15Var = zzg;
                if (d15Var == null) {
                    d15Var = new pz4(zzf);
                    zzg = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public boolean e0() {
        return this.zzd;
    }
}
