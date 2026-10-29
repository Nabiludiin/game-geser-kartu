package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class x6 extends xa implements yb {
    private static final x6 zzf;
    private int zzb;
    private int zzd = 1;
    private db zze = xa.B();

    static {
        x6 x6Var = new x6();
        zzf = x6Var;
        xa.v(x6.class, x6Var);
    }

    private x6() {
    }

    public static v6 F() {
        return (v6) zzf.r();
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", w6.f21421a, "zze", k6.class});
        }
        if (i8 == 3) {
            return new x6();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new v6(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }

    final /* synthetic */ void G(k6 k6Var) {
        k6Var.getClass();
        db dbVar = this.zze;
        if (!dbVar.a()) {
            this.zze = xa.C(dbVar);
        }
        this.zze.add(k6Var);
    }
}
