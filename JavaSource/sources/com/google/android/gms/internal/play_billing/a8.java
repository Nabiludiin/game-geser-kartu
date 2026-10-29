package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class a8 extends d4 implements a5 {
    private static final a8 zzb;
    private int zzd;
    private int zze;

    static {
        a8 a8Var = new a8();
        zzb = a8Var;
        d4.y(a8.class, a8Var);
    }

    private a8() {
    }

    public static a8 C() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", y7.f21818a});
        }
        if (i8 == 3) {
            return new a8();
        }
        z7 z7Var = null;
        if (i8 == 4) {
            return new x7(z7Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
