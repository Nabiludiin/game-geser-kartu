package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class gj3 extends sz4 implements x05 {
    private static final gj3 zzi;
    private static volatile d15 zzj;
    private int zza;
    private boolean zzc;
    private boolean zzd;
    private long zzh;
    private boolean zzb = true;
    private long zze = 600000;
    private long zzf = 3600000;
    private String zzg = "https://pagead2.googlesyndication.com/mads/asp";

    static {
        gj3 gj3Var = new gj3();
        zzi = gj3Var;
        sz4.U(gj3.class, gj3Var);
    }

    private gj3() {
    }

    public static fj3 h0() {
        return (fj3) zzi.P();
    }

    public static gj3 i0() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzi, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဈ\u0005\u0007ဂ\u0006", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (ordinal == 3) {
            return new gj3();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new fj3(bArr);
        }
        if (ordinal == 5) {
            return zzi;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzj;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (gj3.class) {
            try {
                d15Var = zzj;
                if (d15Var == null) {
                    d15Var = new pz4(zzi);
                    zzj = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final boolean d0() {
        return this.zzd;
    }

    public final long e0() {
        return this.zzf;
    }

    public final String f0() {
        return this.zzg;
    }

    public final long g0() {
        return this.zzh;
    }

    final /* synthetic */ void j0(boolean z7) {
        this.zza |= 4;
        this.zzd = z7;
    }

    final /* synthetic */ void k0(long j7) {
        this.zza |= 64;
        this.zzh = j7;
    }
}
