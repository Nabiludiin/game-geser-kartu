package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class w7 extends d4 implements a5 {
    private static final w7 zzb;
    private int zzd;
    private n6 zze;
    private long zzf;

    static {
        w7 w7Var = new w7();
        zzb = w7Var;
        d4.y(w7.class, w7Var);
    }

    private w7() {
    }

    static /* synthetic */ void B(w7 w7Var, n6 n6Var) {
        n6Var.getClass();
        w7Var.zze = n6Var;
        w7Var.zzd |= 1;
    }

    static /* synthetic */ void C(w7 w7Var, long j7) {
        w7Var.zzd |= 2;
        w7Var.zzf = j7;
    }

    public static u7 D() {
        return (u7) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i8 == 3) {
            return new w7();
        }
        v7 v7Var = null;
        if (i8 == 4) {
            return new u7(v7Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
