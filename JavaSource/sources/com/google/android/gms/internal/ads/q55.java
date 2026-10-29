package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class q55 extends sz4 implements x05 {
    private static final q55 zzj;
    private static volatile d15 zzk;
    private int zza;
    private long zzc;
    private boolean zzd;
    private int zze;
    private boolean zzh;
    private boolean zzi;
    private String zzb = "";
    private String zzf = "";
    private String zzg = "";

    static {
        q55 q55Var = new q55();
        zzj = q55Var;
        sz4.U(q55.class, q55Var);
    }

    private q55() {
    }

    public static p55 d0() {
        return (p55) zzj.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzj, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", r55.f14744a, "zzf", "zzg", "zzh", "zzi"});
        }
        if (ordinal == 3) {
            return new q55();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new p55(bArr);
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
        synchronized (q55.class) {
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

    final /* synthetic */ void e0(String str) {
        this.zza |= 1;
        this.zzb = str;
    }

    final /* synthetic */ void f0(long j7) {
        this.zza |= 2;
        this.zzc = j7;
    }

    final /* synthetic */ void g0(boolean z7) {
        this.zza |= 4;
        this.zzd = z7;
    }
}
