package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class u5 extends xa implements yb {
    private static final u5 zzk;
    private int zzb;
    private boolean zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        u5 u5Var = new u5();
        zzk = u5Var;
        xa.v(u5.class, u5Var);
    }

    private u5() {
    }

    public static t5 M() {
        return (t5) zzk.r();
    }

    public static u5 N() {
        return zzk;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzk, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i8 == 3) {
            return new u5();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new t5(bArr);
        }
        if (i8 == 5) {
            return zzk;
        }
        throw null;
    }

    public final boolean F() {
        return this.zzd;
    }

    public final boolean G() {
        return this.zze;
    }

    public final boolean H() {
        return this.zzf;
    }

    public final boolean I() {
        return this.zzg;
    }

    public final boolean J() {
        return this.zzh;
    }

    public final boolean K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzj;
    }

    final /* synthetic */ void O(boolean z7) {
        this.zzb |= 1;
        this.zzd = z7;
    }

    final /* synthetic */ void P(boolean z7) {
        this.zzb |= 2;
        this.zze = z7;
    }

    final /* synthetic */ void Q(boolean z7) {
        this.zzb |= 4;
        this.zzf = z7;
    }

    final /* synthetic */ void R(boolean z7) {
        this.zzb |= 8;
        this.zzg = z7;
    }

    final /* synthetic */ void S(boolean z7) {
        this.zzb |= 16;
        this.zzh = z7;
    }

    final /* synthetic */ void T(boolean z7) {
        this.zzb |= 32;
        this.zzi = z7;
    }

    final /* synthetic */ void U(boolean z7) {
        this.zzb |= 64;
        this.zzj = z7;
    }
}
