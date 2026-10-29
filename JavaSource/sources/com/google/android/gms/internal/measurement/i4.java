package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class i4 extends xa implements yb {
    private static final i4 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        i4 i4Var = new i4();
        zzg = i4Var;
        xa.v(i4.class, i4Var);
    }

    private i4() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", n4.f21152a, "zze", l4.f21091a, "zzf", s4.f21372a});
        }
        if (i8 == 3) {
            return new i4();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new h4(bArr);
        }
        if (i8 == 5) {
            return zzg;
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
        int a8 = m4.a(this.zze);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }

    public final int I() {
        int a8 = t4.a(this.zzf);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }
}
