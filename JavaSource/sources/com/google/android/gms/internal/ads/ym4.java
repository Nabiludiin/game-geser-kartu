package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class ym4 extends sz4 implements x05 {
    private static final ym4 zzd;
    private static volatile d15 zze;
    private int zza;
    private bn4 zzb;
    private int zzc;

    static {
        ym4 ym4Var = new ym4();
        zzd = ym4Var;
        sz4.U(ym4.class, ym4Var);
    }

    private ym4() {
    }

    public static ym4 e0(qy4 qy4Var, ez4 ez4Var) {
        return (ym4) sz4.C(zzd, qy4Var, ez4Var);
    }

    public static xm4 f0() {
        return (xm4) zzd.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzd, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0000\u0003\u000b", new Object[]{"zza", "zzb", "zzc"});
        }
        if (ordinal == 3) {
            return new ym4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new xm4(bArr);
        }
        if (ordinal == 5) {
            return zzd;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zze;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (ym4.class) {
            try {
                d15Var = zze;
                if (d15Var == null) {
                    d15Var = new pz4(zzd);
                    zze = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final bn4 d0() {
        bn4 bn4Var = this.zzb;
        return bn4Var == null ? bn4.f0() : bn4Var;
    }

    final /* synthetic */ void g0(bn4 bn4Var) {
        bn4Var.getClass();
        this.zzb = bn4Var;
        this.zza |= 1;
    }
}
