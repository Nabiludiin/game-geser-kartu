package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class s6 extends xa implements yb {
    private static final s6 zzh;
    private int zzb;
    private db zzd = xa.B();
    private String zze = "";
    private String zzf = "";
    private int zzg;

    static {
        s6 s6Var = new s6();
        zzh = s6Var;
        xa.v(s6.class, s6Var);
    }

    private s6() {
    }

    public static p6 M() {
        return (p6) zzh.r();
    }

    public static p6 N(s6 s6Var) {
        va r7 = zzh.r();
        r7.v(s6Var);
        return (p6) r7;
    }

    private final void V() {
        db dbVar = this.zzd;
        if (dbVar.a()) {
            return;
        }
        this.zzd = xa.C(dbVar);
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzh, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zzd", u6.class, "zze", "zzf", "zzg", r6.f21326a});
        }
        if (i8 == 3) {
            return new s6();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new p6(bArr);
        }
        if (i8 == 5) {
            return zzh;
        }
        throw null;
    }

    public final List F() {
        return this.zzd;
    }

    public final int G() {
        return this.zzd.size();
    }

    public final u6 H(int i7) {
        return (u6) this.zzd.get(i7);
    }

    public final boolean I() {
        return (this.zzb & 1) != 0;
    }

    public final String J() {
        return this.zze;
    }

    public final boolean K() {
        return (this.zzb & 2) != 0;
    }

    public final String L() {
        return this.zzf;
    }

    final /* synthetic */ void O(int i7, u6 u6Var) {
        u6Var.getClass();
        V();
        this.zzd.set(i7, u6Var);
    }

    final /* synthetic */ void P(u6 u6Var) {
        u6Var.getClass();
        V();
        this.zzd.add(u6Var);
    }

    final /* synthetic */ void Q(Iterable iterable) {
        V();
        o9.i(iterable, this.zzd);
    }

    final /* synthetic */ void R() {
        this.zzd = xa.B();
    }

    final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void T(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }
}
