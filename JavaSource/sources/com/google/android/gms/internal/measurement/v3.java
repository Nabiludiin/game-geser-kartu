package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class v3 extends xa implements yb {
    private static final v3 zzh;
    private int zzb;
    private f4 zzd;
    private z3 zze;
    private boolean zzf;
    private String zzg = "";

    static {
        v3 v3Var = new v3();
        zzh = v3Var;
        xa.v(v3.class, v3Var);
    }

    private v3() {
    }

    public static v3 N() {
        return zzh;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new v3();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new u3(bArr);
        }
        if (i8 == 5) {
            return zzh;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final f4 G() {
        f4 f4Var = this.zzd;
        return f4Var == null ? f4.M() : f4Var;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final z3 I() {
        z3 z3Var = this.zze;
        return z3Var == null ? z3.O() : z3Var;
    }

    public final boolean J() {
        return (this.zzb & 4) != 0;
    }

    public final boolean K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final String M() {
        return this.zzg;
    }

    final /* synthetic */ void O(String str) {
        this.zzb |= 8;
        this.zzg = str;
    }
}
