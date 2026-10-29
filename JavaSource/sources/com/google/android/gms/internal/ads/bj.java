package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class bj extends sz4 implements x05 {
    private static final bj zzj;
    private static volatile d15 zzk;
    private int zza;
    private int zzb;
    private boolean zze;
    private sj zzg;
    private zj zzh;
    private boolean zzi;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private boolean zzf = true;

    static {
        bj bjVar = new bj();
        zzj = bjVar;
        sz4.U(bj.class, bjVar);
    }

    private bj() {
    }

    public static aj h0() {
        return (aj) zzj.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzj, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", ej.f7653a, "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new bj();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new aj(bArr);
        }
        if (ordinal == 5) {
            return zzj;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzk;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (bj.class) {
            try {
                d15Var = zzk;
                if (d15Var == null) {
                    d15Var = new pz4(zzj);
                    zzk = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final String d0() {
        return this.zzd;
    }

    public final boolean e0() {
        return this.zze;
    }

    public final sj f0() {
        sj sjVar = this.zzg;
        return sjVar == null ? sj.i0() : sjVar;
    }

    public final zj g0() {
        zj zjVar = this.zzh;
        return zjVar == null ? zj.d0() : zjVar;
    }

    final /* synthetic */ void i0(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void j0(boolean z7) {
        this.zza |= 8;
        this.zze = z7;
    }
}
