package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class e6 extends xa implements yb {
    private static final e6 zzd;
    private db zzb = xa.B();

    static {
        e6 e6Var = new e6();
        zzd = e6Var;
        xa.v(e6.class, e6Var);
    }

    private e6() {
    }

    public static x5 G() {
        return (x5) zzd.r();
    }

    public static e6 H() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", b6.class});
        }
        if (i8 == 3) {
            return new e6();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new x5(bArr);
        }
        if (i8 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List F() {
        return this.zzb;
    }

    final /* synthetic */ void I(Iterable iterable) {
        db dbVar = this.zzb;
        if (!dbVar.a()) {
            this.zzb = xa.C(dbVar);
        }
        o9.i(iterable, this.zzb);
    }
}
