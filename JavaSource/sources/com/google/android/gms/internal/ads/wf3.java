package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class wf3 extends sz4 implements x05 {
    private static final wf3 zzn;
    private static volatile d15 zzo;
    private int zza;
    private long zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private String zzb = "";
    private zz4 zzk = sz4.w();
    private zz4 zzl = sz4.w();
    private zz4 zzm = sz4.w();

    static {
        wf3 wf3Var = new wf3();
        zzn = wf3Var;
        sz4.U(wf3.class, wf3Var);
    }

    private wf3() {
    }

    public static wf3 v0() {
        return zzn;
    }

    final /* synthetic */ void A0(boolean z7) {
        this.zza |= 8;
        this.zzf = true;
    }

    final /* synthetic */ void B0(long j7) {
        this.zza |= 16;
        this.zzg = j7;
    }

    final /* synthetic */ void C0(long j7) {
        this.zzh = j7;
    }

    final /* synthetic */ void D0(long j7) {
        this.zza |= 32;
        this.zzi = j7;
    }

    final /* synthetic */ void E0(long j7) {
        this.zza |= 64;
        this.zzj = j7;
    }

    final /* synthetic */ void F0(long j7) {
        zz4 zz4Var = this.zzk;
        if (!zz4Var.a()) {
            this.zzk = sz4.x(zz4Var);
        }
        this.zzk.f(j7);
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzn, "\u0004\f\u0000\u0001\u0001\f\f\u0000\u0003\u0000\u0001Ȉ\u0002ဂ\u0000\u0003င\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဂ\u0004\u0007\u0002\bဂ\u0005\tဂ\u0006\n%\u000b%\f%", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (ordinal == 3) {
            return new wf3();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new vf3(bArr);
        }
        if (ordinal == 5) {
            return zzn;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzo;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (wf3.class) {
            try {
                d15Var = zzo;
                if (d15Var == null) {
                    d15Var = new pz4(zzn);
                    zzo = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    final /* synthetic */ void d0(long j7) {
        zz4 zz4Var = this.zzl;
        if (!zz4Var.a()) {
            this.zzl = sz4.x(zz4Var);
        }
        this.zzl.f(j7);
    }

    final /* synthetic */ void e0(long j7) {
        zz4 zz4Var = this.zzm;
        if (!zz4Var.a()) {
            this.zzm = sz4.x(zz4Var);
        }
        this.zzm.f(j7);
    }

    final /* synthetic */ void f0() {
        this.zzm = sz4.w();
    }

    public final String h0() {
        return this.zzb;
    }

    public final long i0() {
        return this.zzc;
    }

    public final int j0() {
        return this.zzd;
    }

    public final boolean k0() {
        return this.zze;
    }

    public final boolean l0() {
        return this.zzf;
    }

    public final long m0() {
        return this.zzg;
    }

    public final long n0() {
        return this.zzh;
    }

    public final long o0() {
        return this.zzi;
    }

    public final boolean p0() {
        return (this.zza & 64) != 0;
    }

    public final List q0() {
        return this.zzk;
    }

    public final int r0() {
        return this.zzk.size();
    }

    public final int s0() {
        return this.zzl.size();
    }

    public final List t0() {
        return this.zzm;
    }

    public final int u0() {
        return this.zzm.size();
    }

    final /* synthetic */ void w0(String str) {
        str.getClass();
        this.zzb = str;
    }

    final /* synthetic */ void x0(long j7) {
        this.zza |= 1;
        this.zzc = j7;
    }

    final /* synthetic */ void y0(int i7) {
        this.zza |= 2;
        this.zzd = i7;
    }

    final /* synthetic */ void z0(boolean z7) {
        this.zza |= 4;
        this.zze = true;
    }
}
