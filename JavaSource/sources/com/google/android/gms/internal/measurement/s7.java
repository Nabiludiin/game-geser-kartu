package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class s7 extends xa implements yb {
    private static final s7 zzf;
    private int zzb;
    private db zzd = xa.B();
    private n7 zze;

    static {
        s7 s7Var = new s7();
        zzf = s7Var;
        xa.v(s7.class, s7Var);
    }

    private s7() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", w7.class, "zze"});
        }
        if (i8 == 3) {
            return new s7();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new q7(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List F() {
        return this.zzd;
    }

    public final n7 G() {
        n7 n7Var = this.zze;
        return n7Var == null ? n7.H() : n7Var;
    }
}
