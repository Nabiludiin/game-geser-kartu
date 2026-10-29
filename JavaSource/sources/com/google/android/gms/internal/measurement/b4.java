package com.google.android.gms.internal.measurement;

/* compiled from: MyApplication */
public final class b4 extends xa implements yb {
    private static final b4 zzj;
    private int zzb;
    private int zzd;
    private String zze = "";
    private v3 zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        b4 b4Var = new b4();
        zzj = b4Var;
        xa.v(b4.class, b4Var);
    }

    private b4() {
    }

    public static a4 N() {
        return (a4) zzj.r();
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzj, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new b4();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new a4(bArr);
        }
        if (i8 == 5) {
            return zzj;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final String H() {
        return this.zze;
    }

    public final v3 I() {
        v3 v3Var = this.zzf;
        return v3Var == null ? v3.N() : v3Var;
    }

    public final boolean J() {
        return this.zzg;
    }

    public final boolean K() {
        return this.zzh;
    }

    public final boolean L() {
        return (this.zzb & 32) != 0;
    }

    public final boolean M() {
        return this.zzi;
    }

    final /* synthetic */ void O(String str) {
        this.zzb |= 2;
        this.zze = str;
    }
}
