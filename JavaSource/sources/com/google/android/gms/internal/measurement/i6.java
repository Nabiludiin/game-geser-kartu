package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class i6 extends xa implements yb {
    private static final i6 zzj;
    private int zzb;
    private db zzd = xa.B();
    private String zze = "";
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;

    static {
        i6 i6Var = new i6();
        zzj = i6Var;
        xa.v(i6.class, i6Var);
    }

    private i6() {
    }

    public static h6 P() {
        return (h6) zzj.r();
    }

    private final void a0() {
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
            return xa.w(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004", new Object[]{"zzb", "zzd", m6.class, "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new i6();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new h6(bArr);
        }
        if (i8 == 5) {
            return zzj;
        }
        throw null;
    }

    public final List F() {
        return this.zzd;
    }

    public final int G() {
        return this.zzd.size();
    }

    public final m6 H(int i7) {
        return (m6) this.zzd.get(i7);
    }

    public final String I() {
        return this.zze;
    }

    public final boolean J() {
        return (this.zzb & 2) != 0;
    }

    public final long K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 4) != 0;
    }

    public final long M() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zzb & 8) != 0;
    }

    public final int O() {
        return this.zzh;
    }

    final /* synthetic */ void Q(int i7, m6 m6Var) {
        m6Var.getClass();
        a0();
        this.zzd.set(i7, m6Var);
    }

    final /* synthetic */ void R(m6 m6Var) {
        m6Var.getClass();
        a0();
        this.zzd.add(m6Var);
    }

    final /* synthetic */ void S(Iterable iterable) {
        a0();
        o9.i(iterable, this.zzd);
    }

    final /* synthetic */ void T() {
        this.zzd = xa.B();
    }

    final /* synthetic */ void U(int i7) {
        a0();
        this.zzd.remove(i7);
    }

    final /* synthetic */ void V(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    final /* synthetic */ void W(long j7) {
        this.zzb |= 2;
        this.zzf = j7;
    }

    final /* synthetic */ void X(long j7) {
        this.zzb |= 4;
        this.zzg = j7;
    }

    final /* synthetic */ void Y(long j7) {
        this.zzb |= 16;
        this.zzi = j7;
    }
}
