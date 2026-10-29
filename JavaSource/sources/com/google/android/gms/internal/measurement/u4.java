package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class u4 extends xa implements yb {
    private static final u4 zzi;
    private int zzb;
    private boolean zzg;
    private db zzd = xa.B();
    private db zze = xa.B();
    private db zzf = xa.B();
    private db zzh = xa.B();

    static {
        u4 u4Var = new u4();
        zzi = u4Var;
        xa.v(u4.class, u4Var);
    }

    private u4() {
    }

    public static u4 L() {
        return zzi;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zzd", i4.class, "zze", k4.class, "zzf", r4.class, "zzg", "zzh", i4.class});
        }
        if (i8 == 3) {
            return new u4();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new g4(bArr);
        }
        if (i8 == 5) {
            return zzi;
        }
        throw null;
    }

    public final List F() {
        return this.zzd;
    }

    public final List G() {
        return this.zze;
    }

    public final List H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 1) != 0;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final List K() {
        return this.zzh;
    }
}
