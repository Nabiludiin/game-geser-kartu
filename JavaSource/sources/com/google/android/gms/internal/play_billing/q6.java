package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class q6 extends d4 implements a5 {
    private static final q6 zzb;

    static {
        q6 q6Var = new q6();
        zzb = q6Var;
        d4.y(q6.class, q6Var);
    }

    private q6() {
    }

    public static q6 C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        p6 p6Var = null;
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0000", null);
        }
        if (i8 == 3) {
            return new q6();
        }
        if (i8 == 4) {
            return new o6(p6Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
