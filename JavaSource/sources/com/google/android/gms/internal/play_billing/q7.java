package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class q7 extends d4 implements a5 {
    private static final q7 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private z6 zzg;
    private c7 zzh;

    static {
        q7 q7Var = new q7();
        zzb = q7Var;
        d4.y(q7.class, q7Var);
    }

    private q7() {
    }

    static /* synthetic */ void B(q7 q7Var, d6 d6Var) {
        q7Var.zzf = d6Var;
        q7Var.zze = 2;
    }

    static /* synthetic */ void C(q7 q7Var, i6 i6Var) {
        q7Var.zzf = i6Var;
        q7Var.zze = 3;
    }

    static /* synthetic */ void D(q7 q7Var, q6 q6Var) {
        q6Var.getClass();
        q7Var.zzf = q6Var;
        q7Var.zze = 7;
    }

    static /* synthetic */ void E(q7 q7Var, z6 z6Var) {
        z6Var.getClass();
        q7Var.zzg = z6Var;
        q7Var.zzd |= 1;
    }

    static /* synthetic */ void F(q7 q7Var, w7 w7Var) {
        w7Var.getClass();
        q7Var.zzf = w7Var;
        q7Var.zze = 8;
    }

    static /* synthetic */ void G(q7 q7Var, a8 a8Var) {
        q7Var.zzf = a8Var;
        q7Var.zze = 4;
    }

    public static o7 H() {
        return (o7) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", d6.class, i6.class, a8.class, w6.class, "zzh", q6.class, w7.class});
        }
        if (i8 == 3) {
            return new q7();
        }
        p7 p7Var = null;
        if (i8 == 4) {
            return new o7(p7Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
