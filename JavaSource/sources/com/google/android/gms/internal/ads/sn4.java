package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class sn4 extends sz4 implements x05 {
    private static final sn4 zze;
    private static volatile d15 zzf;
    private int zza;
    private un4 zzb;
    private int zzc;
    private int zzd;

    static {
        sn4 sn4Var = new sn4();
        zze = sn4Var;
        sz4.U(sn4.class, sn4Var);
    }

    private sn4() {
    }

    public static sn4 g0(qy4 qy4Var, ez4 ez4Var) {
        return (sn4) sz4.C(zze, qy4Var, ez4Var);
    }

    public static rn4 h0() {
        return (rn4) zze.P();
    }

    public static sn4 i0() {
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new sn4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new rn4(bArr);
        }
        if (ordinal == 5) {
            return zze;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzf;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (sn4.class) {
            try {
                d15Var = zzf;
                if (d15Var == null) {
                    d15Var = new pz4(zze);
                    zzf = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final un4 d0() {
        un4 un4Var = this.zzb;
        return un4Var == null ? un4.g0() : un4Var;
    }

    public final int e0() {
        return this.zzc;
    }

    public final int f0() {
        return this.zzd;
    }

    final /* synthetic */ void j0(un4 un4Var) {
        un4Var.getClass();
        this.zzb = un4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void k0(int i7) {
        this.zzc = i7;
    }
}
