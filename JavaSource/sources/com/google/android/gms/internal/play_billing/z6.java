package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class z6 extends d4 implements a5 {
    private static final z6 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;

    static {
        z6 z6Var = new z6();
        zzb = z6Var;
        d4.y(z6.class, z6Var);
    }

    private z6() {
    }

    static /* synthetic */ void B(z6 z6Var, int i7) {
        z6Var.zzd |= 128;
        z6Var.zzl = i7;
    }

    static /* synthetic */ void C(z6 z6Var, int i7) {
        z6Var.zzd |= 256;
        z6Var.zzm = i7;
    }

    static /* synthetic */ void D(z6 z6Var, int i7) {
        z6Var.zzd |= 8;
        z6Var.zzh = i7;
    }

    static /* synthetic */ void E(z6 z6Var, long j7) {
        z6Var.zzd |= 16;
        z6Var.zzi = j7;
    }

    static /* synthetic */ void F(z6 z6Var, long j7) {
        z6Var.zzd |= 32;
        z6Var.zzj = j7;
    }

    static /* synthetic */ void G(z6 z6Var, long j7) {
        z6Var.zzd |= 512;
        z6Var.zzn = 772604006L;
    }

    static /* synthetic */ void H(z6 z6Var, String str) {
        str.getClass();
        z6Var.zzd |= 4;
        z6Var.zzg = str;
    }

    static /* synthetic */ void I(z6 z6Var, boolean z7) {
        z6Var.zzd |= 64;
        z6Var.zzk = z7;
    }

    static /* synthetic */ void J(z6 z6Var, String str) {
        str.getClass();
        z6Var.zzd |= 1;
        z6Var.zze = str;
    }

    static /* synthetic */ void K(z6 z6Var, String str) {
        z6Var.zzd |= 2;
        z6Var.zzf = str;
    }

    public static x6 L() {
        return (x6) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i8 == 3) {
            return new z6();
        }
        y6 y6Var = null;
        if (i8 == 4) {
            return new x6(y6Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
