package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class w7 extends xa implements yb {
    private static final w7 zzj;
    private int zzb;
    private int zzd;
    private db zze = xa.B();
    private String zzf = "";
    private String zzg = "";
    private boolean zzh;
    private double zzi;

    static {
        w7 w7Var = new w7();
        zzj = w7Var;
        xa.v(w7.class, w7Var);
    }

    private w7() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zzd", u7.f21396a, "zze", w7.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new w7();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new t7(bArr);
        }
        if (i8 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List F() {
        return this.zze;
    }

    public final String G() {
        return this.zzf;
    }

    public final boolean H() {
        return (this.zzb & 4) != 0;
    }

    public final String I() {
        return this.zzg;
    }

    public final boolean J() {
        return (this.zzb & 8) != 0;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zzb & 16) != 0;
    }

    public final double M() {
        return this.zzi;
    }

    public final int O() {
        int a8 = v7.a(this.zzd);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }
}
