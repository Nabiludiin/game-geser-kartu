package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class t3 extends xa implements yb {
    private static final t3 zzl;
    private int zzb;
    private int zzd;
    private String zze = "";
    private db zzf = xa.B();
    private boolean zzg;
    private z3 zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        t3 t3Var = new t3();
        zzl = t3Var;
        xa.v(t3.class, t3Var);
    }

    private t3() {
    }

    public static s3 R() {
        return (s3) zzl.r();
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzl, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zzd", "zze", "zzf", v3.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i8 == 3) {
            return new t3();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new s3(bArr);
        }
        if (i8 == 5) {
            return zzl;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final String H() {
        return this.zze;
    }

    public final List I() {
        return this.zzf;
    }

    public final int J() {
        return this.zzf.size();
    }

    public final v3 K(int i7) {
        return (v3) this.zzf.get(i7);
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final z3 M() {
        z3 z3Var = this.zzh;
        return z3Var == null ? z3.O() : z3Var;
    }

    public final boolean N() {
        return this.zzi;
    }

    public final boolean O() {
        return this.zzj;
    }

    public final boolean P() {
        return (this.zzb & 64) != 0;
    }

    public final boolean Q() {
        return this.zzk;
    }

    final /* synthetic */ void S(String str) {
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void T(int i7, v3 v3Var) {
        v3Var.getClass();
        db dbVar = this.zzf;
        if (!dbVar.a()) {
            this.zzf = xa.C(dbVar);
        }
        this.zzf.set(i7, v3Var);
    }
}
