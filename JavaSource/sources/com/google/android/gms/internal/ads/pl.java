package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class pl extends sz4 implements x05 {
    private static final pl zzf;
    private static volatile d15 zzg;
    private int zza;
    private b05 zzb = sz4.y();
    private qy4 zzc = qy4.f14669r;
    private int zzd = 1;
    private int zze = 1;

    static {
        pl plVar = new pl();
        zzf = plVar;
        sz4.U(pl.class, plVar);
    }

    private pl() {
    }

    public static ol d0() {
        return (ol) zzf.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzf, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zza", "zzb", "zzc", "zzd", jl.f10596a, "zze", fl.f8308a});
        }
        if (ordinal == 3) {
            return new pl();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ol(bArr);
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
        synchronized (pl.class) {
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

    final /* synthetic */ void e0(qy4 qy4Var) {
        b05 b05Var = this.zzb;
        if (!b05Var.a()) {
            this.zzb = sz4.z(b05Var);
        }
        this.zzb.add(qy4Var);
    }

    final /* synthetic */ void f0(qy4 qy4Var) {
        this.zza |= 1;
        this.zzc = qy4Var;
    }

    final /* synthetic */ void h0(int i7) {
        this.zzd = 4;
        this.zza |= 2;
    }

    final /* synthetic */ void i0(int i7) {
        this.zze = i7 - 1;
        this.zza |= 4;
    }
}
