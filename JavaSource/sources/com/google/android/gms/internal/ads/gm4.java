package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class gm4 extends sz4 implements x05 {
    private static final gm4 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb;
    private km4 zzc;
    private qy4 zzd = qy4.f14669r;

    static {
        gm4 gm4Var = new gm4();
        zze = gm4Var;
        sz4.U(gm4.class, gm4Var);
    }

    private gm4() {
    }

    public static gm4 g0(qy4 qy4Var, ez4 ez4Var) {
        return (gm4) sz4.C(zze, qy4Var, ez4Var);
    }

    public static fm4 h0() {
        return (fm4) zze.P();
    }

    public static d15 i0() {
        return zze.p();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new gm4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new fm4(bArr);
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
        synchronized (gm4.class) {
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

    public final int d0() {
        return this.zzb;
    }

    public final km4 e0() {
        km4 km4Var = this.zzc;
        return km4Var == null ? km4.f0() : km4Var;
    }

    public final qy4 f0() {
        return this.zzd;
    }

    final /* synthetic */ void j0(km4 km4Var) {
        km4Var.getClass();
        this.zzc = km4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void k0(qy4 qy4Var) {
        this.zzd = qy4Var;
    }
}
