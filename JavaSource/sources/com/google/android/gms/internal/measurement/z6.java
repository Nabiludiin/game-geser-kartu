package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class z6 extends xa implements yb {
    private static final z6 zzg;
    private cb zzb = xa.z();
    private cb zzd = xa.z();
    private db zze = xa.B();
    private db zzf = xa.B();

    static {
        z6 z6Var = new z6();
        zzg = z6Var;
        xa.v(z6.class, z6Var);
    }

    private z6() {
    }

    public static y6 N() {
        return (y6) zzg.r();
    }

    public static z6 O() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzg, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zzd", "zze", g6.class, "zzf", b7.class});
        }
        if (i8 == 3) {
            return new z6();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new y6(bArr);
        }
        if (i8 == 5) {
            return zzg;
        }
        throw null;
    }

    public final List F() {
        return this.zzb;
    }

    public final int G() {
        return this.zzb.size();
    }

    public final List H() {
        return this.zzd;
    }

    public final int I() {
        return this.zzd.size();
    }

    public final List J() {
        return this.zze;
    }

    public final int K() {
        return this.zze.size();
    }

    public final List L() {
        return this.zzf;
    }

    public final int M() {
        return this.zzf.size();
    }

    final /* synthetic */ void P(Iterable iterable) {
        cb cbVar = this.zzb;
        if (!cbVar.a()) {
            this.zzb = xa.A(cbVar);
        }
        o9.i(iterable, this.zzb);
    }

    final /* synthetic */ void Q() {
        this.zzb = xa.z();
    }

    final /* synthetic */ void R(Iterable iterable) {
        cb cbVar = this.zzd;
        if (!cbVar.a()) {
            this.zzd = xa.A(cbVar);
        }
        o9.i(iterable, this.zzd);
    }

    final /* synthetic */ void S() {
        this.zzd = xa.z();
    }

    final /* synthetic */ void T(Iterable iterable) {
        db dbVar = this.zze;
        if (!dbVar.a()) {
            this.zze = xa.C(dbVar);
        }
        o9.i(iterable, this.zze);
    }

    final /* synthetic */ void U() {
        this.zze = xa.B();
    }

    final /* synthetic */ void V(Iterable iterable) {
        db dbVar = this.zzf;
        if (!dbVar.a()) {
            this.zzf = xa.C(dbVar);
        }
        o9.i(iterable, this.zzf);
    }

    final /* synthetic */ void W() {
        this.zzf = xa.B();
    }
}
