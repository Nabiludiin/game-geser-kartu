package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class c5 extends xa implements yb {
    private static final c5 zzd;
    private db zzb = xa.B();

    static {
        c5 c5Var = new c5();
        zzd = c5Var;
        xa.v(c5.class, c5Var);
    }

    private c5() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i8 == 3) {
            return new c5();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new b5(bArr);
        }
        if (i8 == 5) {
            return zzd;
        }
        throw null;
    }
}
