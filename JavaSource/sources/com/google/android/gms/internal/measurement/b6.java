package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class b6 extends xa implements yb {
    private static final b6 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        b6 b6Var = new b6();
        zzf = b6Var;
        xa.v(b6.class, b6Var);
    }

    private b6() {
    }

    public static a6 F() {
        return (a6) zzf.r();
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", y5.f21448a, "zze", c6.f20852a});
        }
        if (i8 == 3) {
            return new b6();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new a6(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int H() {
        int a8 = z5.a(this.zzd);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }

    public final int I() {
        int a8 = d6.a(this.zze);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }

    final /* synthetic */ void J(int i7) {
        this.zzd = i7 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void K(int i7) {
        this.zze = i7 - 1;
        this.zzb |= 2;
    }
}
