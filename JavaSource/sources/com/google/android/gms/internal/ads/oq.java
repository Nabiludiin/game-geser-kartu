package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class oq extends sz4 implements x05 {
    private static final oq zze;
    private static volatile d15 zzf;
    private int zza;
    private uq zzb;
    private qy4 zzc;
    private qy4 zzd;

    static {
        oq oqVar = new oq();
        zze = oqVar;
        sz4.U(oq.class, oqVar);
    }

    private oq() {
        qy4 qy4Var = qy4.f14669r;
        this.zzc = qy4Var;
        this.zzd = qy4Var;
    }

    public static oq g0(qy4 qy4Var, ez4 ez4Var) {
        return (oq) sz4.C(zze, qy4Var, ez4Var);
    }

    public static oq h0(byte[] bArr, ez4 ez4Var) {
        return (oq) sz4.E(zze, bArr, ez4Var);
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zze, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new oq();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new nq(bArr);
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
        synchronized (oq.class) {
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
        uq uqVar = this.zzb;
        return uqVar == null ? uq.l0() : uqVar;
    }

    public final qy4 e0() {
        return this.zzc;
    }

    public final qy4 f0() {
        return this.zzd;
    }
}
