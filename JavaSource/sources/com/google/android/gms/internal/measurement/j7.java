package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class j7 extends xa implements yb {
    private static final j7 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        j7 j7Var = new j7();
        zzg = j7Var;
        xa.v(j7.class, j7Var);
    }

    private j7() {
    }

    public static c7 G() {
        return (c7) zzg.r();
    }

    public static j7 H() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", h7.f21000a, "zze", d7.f20872a, "zzf", f7.f20942a});
        }
        if (i8 == 3) {
            return new j7();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new c7(bArr);
        }
        if (i8 == 5) {
            return zzg;
        }
        throw null;
    }

    public final e7 F() {
        e7 c8 = e7.c(this.zze);
        return c8 == null ? e7.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : c8;
    }

    final /* synthetic */ void I(e7 e7Var) {
        this.zze = e7Var.a();
        this.zzb |= 2;
    }

    public final int K() {
        int a8 = i7.a(this.zzd);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }

    public final int L() {
        int a8 = g7.a(this.zzf);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }

    final /* synthetic */ void M(int i7) {
        this.zzd = i7 - 1;
        this.zzb |= 1;
    }

    final /* synthetic */ void N(int i7) {
        this.zzf = i7 - 1;
        this.zzb |= 4;
    }
}
