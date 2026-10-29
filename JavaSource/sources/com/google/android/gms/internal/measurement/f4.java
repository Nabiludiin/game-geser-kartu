package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class f4 extends xa implements yb {
    private static final f4 zzh;
    private int zzb;
    private int zzd;
    private boolean zzf;
    private String zze = "";
    private db zzg = xa.B();

    static {
        f4 f4Var = new f4();
        zzh = f4Var;
        xa.v(f4.class, f4Var);
    }

    private f4() {
    }

    public static f4 M() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zzd", d4.f20871a, "zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new f4();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new c4(bArr);
        }
        if (i8 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final boolean J() {
        return this.zzf;
    }

    public final List K() {
        return this.zzg;
    }

    public final int L() {
        return this.zzg.size();
    }

    public final int O() {
        int a8 = e4.a(this.zzd);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }
}
