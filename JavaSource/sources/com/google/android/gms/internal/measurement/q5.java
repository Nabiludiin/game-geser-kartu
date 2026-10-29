package com.google.android.gms.internal.measurement;

import java.util.Map;

/* compiled from: MyApplication */
public final class q5 extends xa implements yb {
    private static final q5 zzn;
    private int zzb;
    private long zzg;
    private long zzk;
    private rb zzl = rb.a();
    private rb zzm = rb.a();
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        q5 q5Var = new q5();
        zzn = q5Var;
        xa.v(q5.class, q5Var);
    }

    private q5() {
    }

    public static m5 f0() {
        return (m5) zzn.r();
    }

    public static q5 g0() {
        return zzn;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzn, "\u0004\n\u0000\u0001\u0001\n\n\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", n5.f21153a, "zzm", o5.f21207a});
        }
        if (i8 == 3) {
            return new q5();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new m5(bArr);
        }
        if (i8 == 5) {
            return zzn;
        }
        throw null;
    }

    final /* synthetic */ void F(String str) {
        this.zzb |= 16;
        this.zzh = str;
    }

    final /* synthetic */ void G() {
        this.zzb &= -17;
        this.zzh = zzn.zzh;
    }

    final /* synthetic */ void H(String str) {
        this.zzb |= 32;
        this.zzi = str;
    }

    final /* synthetic */ void I() {
        this.zzb &= -33;
        this.zzi = zzn.zzi;
    }

    final /* synthetic */ void J(String str) {
        this.zzb |= 64;
        this.zzj = str;
    }

    final /* synthetic */ void K() {
        this.zzb &= -65;
        this.zzj = zzn.zzj;
    }

    final /* synthetic */ void L(long j7) {
        this.zzb |= 128;
        this.zzk = j7;
    }

    final /* synthetic */ Map M() {
        if (!this.zzl.i()) {
            this.zzl = this.zzl.d();
        }
        return this.zzl;
    }

    final /* synthetic */ Map N() {
        if (!this.zzm.i()) {
            this.zzm = this.zzm.d();
        }
        return this.zzm;
    }

    public final boolean P() {
        return (this.zzb & 1) != 0;
    }

    public final String Q() {
        return this.zzd;
    }

    public final boolean R() {
        return (this.zzb & 2) != 0;
    }

    public final String S() {
        return this.zze;
    }

    public final boolean T() {
        return (this.zzb & 4) != 0;
    }

    public final String U() {
        return this.zzf;
    }

    public final boolean V() {
        return (this.zzb & 8) != 0;
    }

    public final long W() {
        return this.zzg;
    }

    public final boolean X() {
        return (this.zzb & 16) != 0;
    }

    public final String Y() {
        return this.zzh;
    }

    public final boolean Z() {
        return (this.zzb & 32) != 0;
    }

    public final String a0() {
        return this.zzi;
    }

    public final boolean b0() {
        return (this.zzb & 64) != 0;
    }

    public final String c0() {
        return this.zzj;
    }

    public final boolean d0() {
        return (this.zzb & 128) != 0;
    }

    public final long e0() {
        return this.zzk;
    }

    final /* synthetic */ void h0(String str) {
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void i0() {
        this.zzb &= -2;
        this.zzd = zzn.zzd;
    }

    final /* synthetic */ void j0(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void k0() {
        this.zzb &= -3;
        this.zze = zzn.zze;
    }

    final /* synthetic */ void l0(String str) {
        this.zzb |= 4;
        this.zzf = str;
    }

    final /* synthetic */ void m0() {
        this.zzb &= -5;
        this.zzf = zzn.zzf;
    }

    final /* synthetic */ void n0(long j7) {
        this.zzb |= 8;
        this.zzg = j7;
    }
}
