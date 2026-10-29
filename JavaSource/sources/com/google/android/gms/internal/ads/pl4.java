package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class pl4 extends sz4 implements x05 {
    private static final pl4 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb;
    private qy4 zzc = qy4.f14669r;
    private tl4 zzd;

    static {
        pl4 pl4Var = new pl4();
        zze = pl4Var;
        sz4.U(pl4.class, pl4Var);
    }

    private pl4() {
    }

    public static pl4 g0(qy4 qy4Var, ez4 ez4Var) {
        return (pl4) sz4.C(zze, qy4Var, ez4Var);
    }

    public static ol4 h0() {
        return (ol4) zze.P();
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
            return sz4.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new pl4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ol4(bArr);
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
        synchronized (pl4.class) {
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

    public final qy4 e0() {
        return this.zzc;
    }

    public final tl4 f0() {
        tl4 tl4Var = this.zzd;
        return tl4Var == null ? tl4.f0() : tl4Var;
    }

    final /* synthetic */ void j0(qy4 qy4Var) {
        this.zzc = qy4Var;
    }

    final /* synthetic */ void k0(tl4 tl4Var) {
        tl4Var.getClass();
        this.zzd = tl4Var;
        this.zza |= 1;
    }
}
