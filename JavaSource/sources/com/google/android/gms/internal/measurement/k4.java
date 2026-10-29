package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class k4 extends xa implements yb {
    private static final k4 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        k4 k4Var = new k4();
        zzf = k4Var;
        xa.v(k4.class, k4Var);
    }

    private k4() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            ab abVar = n4.f21152a;
            return xa.w(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", abVar, "zze", abVar});
        }
        if (i8 == 3) {
            return new k4();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new j4(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int G() {
        int a8 = p4.a(this.zzd);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }

    public final int H() {
        int a8 = p4.a(this.zze);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }
}
