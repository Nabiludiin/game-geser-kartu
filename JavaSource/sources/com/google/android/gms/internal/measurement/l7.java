package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class l7 extends xa implements yb {
    private static final l7 zzj;
    private int zzb;
    private long zzd;
    private String zze = "";
    private String zzf = "";
    private long zzg;
    private float zzh;
    private double zzi;

    static {
        l7 l7Var = new l7();
        zzj = l7Var;
        xa.v(l7.class, l7Var);
    }

    private l7() {
    }

    public static k7 Q() {
        return (k7) zzj.r();
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new l7();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new k7(bArr);
        }
        if (i8 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final long G() {
        return this.zzd;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final long L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzb & 16) != 0;
    }

    public final float N() {
        return this.zzh;
    }

    public final boolean O() {
        return (this.zzb & 32) != 0;
    }

    public final double P() {
        return this.zzi;
    }

    final /* synthetic */ void R(long j7) {
        this.zzb |= 1;
        this.zzd = j7;
    }

    final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void T(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzf = str;
    }

    final /* synthetic */ void U() {
        this.zzb &= -5;
        this.zzf = zzj.zzf;
    }

    final /* synthetic */ void V(long j7) {
        this.zzb |= 8;
        this.zzg = j7;
    }

    final /* synthetic */ void W() {
        this.zzb &= -9;
        this.zzg = 0L;
    }

    final /* synthetic */ void X(double d8) {
        this.zzb |= 32;
        this.zzi = d8;
    }

    final /* synthetic */ void Y() {
        this.zzb &= -33;
        this.zzi = 0.0d;
    }
}
