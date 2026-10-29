package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class d6 extends d4 implements a5 {
    private static final d6 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private n6 zzh;
    private int zzi;

    static {
        d6 d6Var = new d6();
        zzb = d6Var;
        d4.y(d6.class, d6Var);
    }

    private d6() {
    }

    public static d6 B(byte[] bArr, t3 t3Var) {
        return (d6) d4.r(zzb, bArr, t3Var);
    }

    static /* synthetic */ void D(d6 d6Var, s6 s6Var) {
        d6Var.zzi = s6Var.a();
        d6Var.zzd |= 4;
    }

    static /* synthetic */ void E(d6 d6Var, n6 n6Var) {
        n6Var.getClass();
        d6Var.zzh = n6Var;
        d6Var.zzd |= 2;
    }

    static /* synthetic */ void F(d6 d6Var, n7 n7Var) {
        n7Var.getClass();
        d6Var.zzf = n7Var;
        d6Var.zze = 7;
    }

    static /* synthetic */ void G(d6 d6Var, d8 d8Var) {
        d8Var.getClass();
        d6Var.zzf = d8Var;
        d6Var.zze = 6;
    }

    static /* synthetic */ void H(d6 d6Var, int i7) {
        d6Var.zzg = i7 - 1;
        d6Var.zzd |= 1;
    }

    public static b6 I() {
        return (b6) zzb.n();
    }

    public final n7 C() {
        return this.zze == 7 ? (n7) this.zzf : n7.D();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", e6.f21524a, "zzh", g7.class, "zzi", r6.f21728a, d8.class, n7.class});
        }
        if (i8 == 3) {
            return new d6();
        }
        c6 c6Var = null;
        if (i8 == 4) {
            return new b6(c6Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
