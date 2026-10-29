package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class i6 extends d4 implements a5 {
    private static final i6 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        i6 i6Var = new i6();
        zzb = i6Var;
        d4.y(i6.class, i6Var);
    }

    private i6() {
    }

    static /* synthetic */ void C(i6 i6Var, s6 s6Var) {
        i6Var.zzh = s6Var.a();
        i6Var.zzd |= 2;
    }

    static /* synthetic */ void D(i6 i6Var, n7 n7Var) {
        n7Var.getClass();
        i6Var.zzf = n7Var;
        i6Var.zze = 4;
    }

    static /* synthetic */ void E(i6 i6Var, d8 d8Var) {
        d8Var.getClass();
        i6Var.zzf = d8Var;
        i6Var.zze = 3;
    }

    static /* synthetic */ void F(i6 i6Var, int i7) {
        i6Var.zzg = i7 - 1;
        i6Var.zzd |= 1;
    }

    public static f6 G() {
        return (f6) zzb.n();
    }

    public final n7 B() {
        return this.zze == 4 ? (n7) this.zzf : n7.D();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", e6.f21524a, g7.class, d8.class, n7.class, "zzh", r6.f21728a});
        }
        if (i8 == 3) {
            return new i6();
        }
        h6 h6Var = null;
        if (i8 == 4) {
            return new f6(h6Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
