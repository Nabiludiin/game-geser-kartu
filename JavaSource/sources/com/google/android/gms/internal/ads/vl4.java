package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class vl4 extends sz4 implements x05 {
    private static final vl4 zze;
    private static volatile d15 zzf;
    private int zza;
    private int zzb;
    private am4 zzc;
    private qn4 zzd;

    static {
        vl4 vl4Var = new vl4();
        zze = vl4Var;
        sz4.U(vl4.class, vl4Var);
    }

    private vl4() {
    }

    public static vl4 g0(qy4 qy4Var, ez4 ez4Var) {
        return (vl4) sz4.C(zze, qy4Var, ez4Var);
    }

    public static ul4 h0() {
        return (ul4) zze.P();
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
            return sz4.V(zze, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zza", "zzb", "zzc", "zzd"});
        }
        if (ordinal == 3) {
            return new vl4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ul4(bArr);
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
        synchronized (vl4.class) {
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

    public final am4 e0() {
        am4 am4Var = this.zzc;
        return am4Var == null ? am4.h0() : am4Var;
    }

    public final qn4 f0() {
        qn4 qn4Var = this.zzd;
        return qn4Var == null ? qn4.i0() : qn4Var;
    }

    final /* synthetic */ void j0(am4 am4Var) {
        am4Var.getClass();
        this.zzc = am4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void k0(qn4 qn4Var) {
        qn4Var.getClass();
        this.zzd = qn4Var;
        this.zza |= 2;
    }
}
