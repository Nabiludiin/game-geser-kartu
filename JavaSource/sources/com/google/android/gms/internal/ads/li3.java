package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class li3 extends sz4 implements x05 {
    private static final li3 zzx;
    private static volatile d15 zzy;
    private int zza;
    private int zzb;
    private boolean zze;
    private ej3 zzf;
    private boolean zzg;
    private gj3 zzj;
    private boolean zzv;
    private boolean zzw;
    private boolean zzc = true;
    private String zzd = "unknown_host";
    private long zzh = 100;
    private long zzi = 2000;
    private long zzk = 200;
    private long zzl = 200;
    private long zzm = 20000;
    private String zzn = "";
    private String zzo = "";
    private long zzp = 500;
    private long zzu = 3000;

    static {
        li3 li3Var = new li3();
        zzx = li3Var;
        sz4.U(li3.class, li3Var);
    }

    private li3() {
    }

    public static ki3 y0() {
        return (ki3) zzx.P();
    }

    final /* synthetic */ void A0(String str) {
        str.getClass();
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void B0(ej3 ej3Var) {
        ej3Var.getClass();
        this.zzf = ej3Var;
        this.zza |= 16;
    }

    final /* synthetic */ void C0(long j7) {
        this.zza |= 64;
        this.zzh = j7;
    }

    final /* synthetic */ void D0(long j7) {
        this.zza |= 128;
        this.zzi = j7;
    }

    final /* synthetic */ void E0(gj3 gj3Var) {
        gj3Var.getClass();
        this.zzj = gj3Var;
        this.zza |= 256;
    }

    final /* synthetic */ void F0(long j7) {
        this.zza |= 32768;
        this.zzu = j7;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzx, "\u0004\u0012\u0000\u0001\u0001\u0013\u0012\u0000\u0000\u0000\u0001᠌\u0000\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဂ\u0007\bဉ\b\tဇ\u0001\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဈ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဇ\u0010\u0012ဂ\u0006\u0013ဇ\u0011", new Object[]{"zza", "zzb", mi3.f12268a, "zzd", "zze", "zzf", "zzg", "zzi", "zzj", "zzc", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzh", "zzw"});
        }
        if (ordinal == 3) {
            return new li3();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new ki3(bArr);
        }
        if (ordinal == 5) {
            return zzx;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzy;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (li3.class) {
            try {
                d15Var = zzy;
                if (d15Var == null) {
                    d15Var = new pz4(zzx);
                    zzy = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    final /* synthetic */ void d0(boolean z7) {
        this.zza |= 65536;
        this.zzv = z7;
    }

    public final int f0() {
        int a8 = ni3.a(this.zzb);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }

    final /* synthetic */ void g0(int i7) {
        this.zzb = i7 - 1;
        this.zza |= 1;
    }

    public final boolean h0() {
        return this.zzc;
    }

    public final String i0() {
        return this.zzd;
    }

    public final boolean j0() {
        return this.zze;
    }

    public final ej3 k0() {
        ej3 ej3Var = this.zzf;
        return ej3Var == null ? ej3.i0() : ej3Var;
    }

    public final boolean l0() {
        return this.zzg;
    }

    public final long m0() {
        return this.zzh;
    }

    public final long n0() {
        return this.zzi;
    }

    public final gj3 o0() {
        gj3 gj3Var = this.zzj;
        return gj3Var == null ? gj3.i0() : gj3Var;
    }

    public final long p0() {
        return this.zzk;
    }

    public final long q0() {
        return this.zzl;
    }

    public final long r0() {
        return this.zzm;
    }

    public final String s0() {
        return this.zzn;
    }

    public final String t0() {
        return this.zzo;
    }

    public final long u0() {
        return this.zzp;
    }

    public final long v0() {
        return this.zzu;
    }

    public final boolean w0() {
        return this.zzv;
    }

    public final boolean x0() {
        return this.zzw;
    }

    final /* synthetic */ void z0(boolean z7) {
        this.zza |= 2;
        this.zzc = z7;
    }
}
