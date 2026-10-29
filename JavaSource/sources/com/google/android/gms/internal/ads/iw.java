package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class iw extends sz4 implements x05 {
    public static final int zza = 1;
    public static final int zzb = 2;
    private static final iw zzf;
    private static volatile d15 zzg;
    private int zzc;
    private boolean zzd;
    private int zze;

    static {
        iw iwVar = new iw();
        zzf = iwVar;
        sz4.U(iw.class, iwVar);
    }

    private iw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void h0(int i7) {
        this.zzc |= 2;
        this.zze = i7;
    }

    public static hw e0() {
        return (hw) zzf.P();
    }

    public static iw f0() {
        return zzf;
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
            return sz4.V(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new iw();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new hw(bArr);
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
        synchronized (iw.class) {
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
}
