package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class z3 extends xa implements yb {
    private static final z3 zzi;
    private int zzb;
    private int zzd;
    private boolean zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";

    static {
        z3 z3Var = new z3();
        zzi = z3Var;
        xa.v(z3.class, z3Var);
    }

    private z3() {
    }

    public static z3 O() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zzd", x3.f21436a, "zze", "zzf", "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new z3();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new w3(bArr);
        }
        if (i8 == 5) {
            return zzi;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final boolean H() {
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

    public final String L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzb & 16) != 0;
    }

    public final String N() {
        return this.zzh;
    }

    public final int Q() {
        int a8 = y3.a(this.zzd);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }
}
