package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class g6 extends xa implements yb {
    private static final g6 zzf;
    private int zzb;
    private int zzd;
    private long zze;

    static {
        g6 g6Var = new g6();
        zzf = g6Var;
        xa.v(g6.class, g6Var);
    }

    private g6() {
    }

    public static f6 J() {
        return (f6) zzf.r();
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i8 == 3) {
            return new g6();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new f6(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final boolean H() {
        return (this.zzb & 2) != 0;
    }

    public final long I() {
        return this.zze;
    }

    final /* synthetic */ void K(int i7) {
        this.zzb |= 1;
        this.zzd = i7;
    }

    final /* synthetic */ void L(long j7) {
        this.zzb |= 2;
        this.zze = j7;
    }
}
