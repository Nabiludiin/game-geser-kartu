package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class p7 extends xa implements yb {
    private static final p7 zzf;
    private int zzb;
    private String zzd = "";
    private db zze = xa.B();

    static {
        p7 p7Var = new p7();
        zzf = p7Var;
        xa.v(p7.class, p7Var);
    }

    private p7() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zzd", "zze", w7.class});
        }
        if (i8 == 3) {
            return new p7();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new o7(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }

    public final List G() {
        return this.zze;
    }
}
