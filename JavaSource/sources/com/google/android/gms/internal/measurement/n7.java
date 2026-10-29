package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class n7 extends xa implements yb {
    private static final n7 zzd;
    private db zzb = xa.B();

    static {
        n7 n7Var = new n7();
        zzd = n7Var;
        xa.v(n7.class, n7Var);
    }

    private n7() {
    }

    public static n7 H() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", p7.class});
        }
        if (i8 == 3) {
            return new n7();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new m7(bArr);
        }
        if (i8 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List F() {
        return this.zzb;
    }

    public final int G() {
        return this.zzb.size();
    }
}
