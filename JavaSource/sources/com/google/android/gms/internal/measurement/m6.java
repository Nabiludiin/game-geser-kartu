package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class m6 extends xa implements yb {
    private static final m6 zzj;
    private int zzb;
    private long zzf;
    private float zzg;
    private double zzh;
    private String zzd = "";
    private String zze = "";
    private db zzi = xa.B();

    static {
        m6 m6Var = new m6();
        zzj = m6Var;
        xa.v(m6.class, m6Var);
    }

    private m6() {
    }

    public static l6 R() {
        return (l6) zzj.r();
    }

    private final void d0() {
        db dbVar = this.zzi;
        if (dbVar.a()) {
            return;
        }
        this.zzi = xa.C(dbVar);
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", m6.class});
        }
        if (i8 == 3) {
            return new m6();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new l6(bArr);
        }
        if (i8 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final String G() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final String I() {
        return this.zze;
    }

    public final boolean J() {
        return (this.zzb & 4) != 0;
    }

    public final long K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzb & 8) != 0;
    }

    public final float M() {
        return this.zzg;
    }

    public final boolean N() {
        return (this.zzb & 16) != 0;
    }

    public final double O() {
        return this.zzh;
    }

    public final List P() {
        return this.zzi;
    }

    public final int Q() {
        return this.zzi.size();
    }

    final /* synthetic */ void S(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }

    final /* synthetic */ void T(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zze = str;
    }

    final /* synthetic */ void U() {
        this.zzb &= -3;
        this.zze = zzj.zze;
    }

    final /* synthetic */ void V(long j7) {
        this.zzb |= 4;
        this.zzf = j7;
    }

    final /* synthetic */ void W() {
        this.zzb &= -5;
        this.zzf = 0L;
    }

    final /* synthetic */ void X(double d8) {
        this.zzb |= 16;
        this.zzh = d8;
    }

    final /* synthetic */ void Y() {
        this.zzb &= -17;
        this.zzh = 0.0d;
    }

    final /* synthetic */ void Z(m6 m6Var) {
        m6Var.getClass();
        d0();
        this.zzi.add(m6Var);
    }

    final /* synthetic */ void a0(Iterable iterable) {
        d0();
        o9.i(iterable, this.zzi);
    }

    final /* synthetic */ void b0() {
        this.zzi = xa.B();
    }
}
