package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class lk3 extends sz4 implements x05 {
    private static final lk3 zzc;
    private static volatile d15 zzd;
    private int zza;
    private dj zzb;

    static {
        lk3 lk3Var = new lk3();
        zzc = lk3Var;
        sz4.U(lk3.class, lk3Var);
    }

    private lk3() {
    }

    public static kk3 d0() {
        return (kk3) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0004\u0001\u0000\u0001\u0012\u0012\u0001\u0000\u0000\u0000\u0012ဉ\u0000", new Object[]{"zza", "zzb"});
        }
        if (ordinal == 3) {
            return new lk3();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new kk3(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzd;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (lk3.class) {
            try {
                d15Var = zzd;
                if (d15Var == null) {
                    d15Var = new pz4(zzc);
                    zzd = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    final /* synthetic */ void e0(dj djVar) {
        djVar.getClass();
        this.zzb = djVar;
        this.zza |= 1;
    }
}
