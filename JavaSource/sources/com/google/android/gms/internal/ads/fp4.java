package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class fp4 extends sz4 implements x05 {
    private static final fp4 zzf;
    private static volatile d15 zzg;
    private int zza;
    private int zzb;
    private ap4 zzc;
    private qy4 zzd;
    private qy4 zze;

    static {
        fp4 fp4Var = new fp4();
        zzf = fp4Var;
        sz4.U(fp4.class, fp4Var);
    }

    private fp4() {
        qy4 qy4Var = qy4.f14669r;
        this.zzd = qy4Var;
        this.zze = qy4Var;
    }

    public static fp4 h0(qy4 qy4Var, ez4 ez4Var) {
        return (fp4) sz4.C(zzf, qy4Var, ez4Var);
    }

    public static ep4 i0() {
        return (ep4) zzf.P();
    }

    public static fp4 j0() {
        return zzf;
    }

    public static d15 k0() {
        return zzf.p();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zza", "zzb", "zzc", "zzd", "zze"});
        }
        if (ordinal == 3) {
            return new fp4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ep4(bArr);
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
        synchronized (fp4.class) {
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

    public final int d0() {
        return this.zzb;
    }

    public final ap4 e0() {
        ap4 ap4Var = this.zzc;
        return ap4Var == null ? ap4.f0() : ap4Var;
    }

    public final qy4 f0() {
        return this.zzd;
    }

    public final qy4 g0() {
        return this.zze;
    }

    final /* synthetic */ void l0(ap4 ap4Var) {
        ap4Var.getClass();
        this.zzc = ap4Var;
        this.zza |= 1;
    }

    final /* synthetic */ void m0(qy4 qy4Var) {
        this.zzd = qy4Var;
    }

    final /* synthetic */ void n0(qy4 qy4Var) {
        this.zze = qy4Var;
    }
}
