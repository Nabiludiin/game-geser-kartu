package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class y4 extends xa implements yb {
    private static final y4 zzh;
    private int zzb;
    private String zzd = "";
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        y4 y4Var = new y4();
        zzh = y4Var;
        xa.v(y4.class, y4Var);
    }

    private y4() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzh, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg"});
        }
        if (i8 == 3) {
            return new y4();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new x4(bArr);
        }
        if (i8 == 5) {
            return zzh;
        }
        throw null;
    }

    public final String F() {
        return this.zzd;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final boolean H() {
        return this.zze;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final boolean J() {
        return this.zzf;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final int L() {
        return this.zzg;
    }

    final /* synthetic */ void M(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzd = str;
    }
}
