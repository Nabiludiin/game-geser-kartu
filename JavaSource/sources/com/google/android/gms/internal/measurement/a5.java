package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class a5 extends xa implements yb {
    private static final a5 zzu;
    private int zzb;
    private long zzd;
    private int zzf;
    private boolean zzk;
    private u4 zzp;
    private e5 zzq;
    private k5 zzr;
    private g5 zzs;
    private c5 zzt;
    private String zze = "";
    private db zzg = xa.B();
    private db zzh = xa.B();
    private db zzi = xa.B();
    private String zzj = "";
    private db zzl = xa.B();
    private db zzm = xa.B();
    private String zzn = "";
    private String zzo = "";

    static {
        a5 a5Var = new a5();
        zzu = a5Var;
        xa.v(a5.class, a5Var);
    }

    private a5() {
    }

    public static z4 V() {
        return (z4) zzu.r();
    }

    public static a5 W() {
        return zzu;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzu, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", i5.class, "zzh", y4.class, "zzi", r3.class, "zzj", "zzk", "zzl", s7.class, "zzm", w4.class, "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i8 == 3) {
            return new a5();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new z4(bArr);
        }
        if (i8 == 5) {
            return zzu;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final long G() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final String I() {
        return this.zze;
    }

    public final List J() {
        return this.zzg;
    }

    public final int K() {
        return this.zzh.size();
    }

    public final y4 L(int i7) {
        return (y4) this.zzh.get(i7);
    }

    public final List M() {
        return this.zzi;
    }

    public final List N() {
        return this.zzl;
    }

    public final int O() {
        return this.zzl.size();
    }

    public final List P() {
        return this.zzm;
    }

    public final String Q() {
        return this.zzn;
    }

    public final boolean R() {
        return (this.zzb & 128) != 0;
    }

    public final u4 S() {
        u4 u4Var = this.zzp;
        return u4Var == null ? u4.L() : u4Var;
    }

    public final boolean T() {
        return (this.zzb & 512) != 0;
    }

    public final k5 U() {
        k5 k5Var = this.zzr;
        return k5Var == null ? k5.J() : k5Var;
    }

    final /* synthetic */ void X(int i7, y4 y4Var) {
        y4Var.getClass();
        db dbVar = this.zzh;
        if (!dbVar.a()) {
            this.zzh = xa.C(dbVar);
        }
        this.zzh.set(i7, y4Var);
    }

    final /* synthetic */ void Y() {
        this.zzi = xa.B();
    }

    final /* synthetic */ void Z() {
        this.zzl = xa.B();
    }
}
