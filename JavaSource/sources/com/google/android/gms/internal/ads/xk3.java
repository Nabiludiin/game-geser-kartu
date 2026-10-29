package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class xk3 extends sz4 implements x05 {
    private static final xk3 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb = 0;
    private Object zzc;
    private int zzd;

    static {
        xk3 xk3Var = new xk3();
        zze = xk3Var;
        sz4.U(xk3.class, xk3Var);
    }

    private xk3() {
    }

    public static uk3 g0() {
        return (uk3) zze.P();
    }

    public static xk3 h0() {
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
            return sz4.V(zze, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003᠌\u0000", new Object[]{"zzc", "zzb", "zza", uq.class, sq.class, "zzd", mq.d()});
        }
        if (ordinal == 3) {
            return new xk3();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new uk3(bArr);
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
        synchronized (xk3.class) {
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

    public final uq d0() {
        return this.zzb == 1 ? (uq) this.zzc : uq.l0();
    }

    public final sq e0() {
        return this.zzb == 2 ? (sq) this.zzc : sq.f0();
    }

    public final mq f0() {
        mq c8 = mq.c(this.zzd);
        return c8 == null ? mq.UNSUPPORTED : c8;
    }

    final /* synthetic */ void i0(uq uqVar) {
        uqVar.getClass();
        this.zzc = uqVar;
        this.zzb = 1;
    }

    final /* synthetic */ void j0(sq sqVar) {
        sqVar.getClass();
        this.zzc = sqVar;
        this.zzb = 2;
    }

    final /* synthetic */ void k0(mq mqVar) {
        this.zzd = mqVar.a();
        this.zza |= 1;
    }
}
