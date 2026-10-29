package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class w5 extends xa implements yb {
    private static final w5 zzh;
    private int zzb;
    private int zzd;
    private z6 zze;
    private z6 zzf;
    private boolean zzg;

    static {
        w5 w5Var = new w5();
        zzh = w5Var;
        xa.v(w5.class, w5Var);
    }

    private w5() {
    }

    public static v5 M() {
        return (v5) zzh.r();
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new w5();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new v5(bArr);
        }
        if (i8 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final z6 H() {
        z6 z6Var = this.zze;
        return z6Var == null ? z6.O() : z6Var;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final z6 J() {
        z6 z6Var = this.zzf;
        return z6Var == null ? z6.O() : z6Var;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final boolean L() {
        return this.zzg;
    }

    final /* synthetic */ void N(int i7) {
        this.zzb |= 1;
        this.zzd = i7;
    }

    final /* synthetic */ void O(z6 z6Var) {
        z6Var.getClass();
        this.zze = z6Var;
        this.zzb |= 2;
    }

    final /* synthetic */ void P(z6 z6Var) {
        this.zzf = z6Var;
        this.zzb |= 4;
    }

    final /* synthetic */ void Q(boolean z7) {
        this.zzb |= 8;
        this.zzg = z7;
    }
}
