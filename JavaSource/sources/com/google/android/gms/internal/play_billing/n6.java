package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class n6 extends d4 implements a5 {
    private static final n6 zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private int zzi;
    private String zzf = "";
    private String zzh = "";

    static {
        n6 n6Var = new n6();
        zzb = n6Var;
        d4.y(n6.class, n6Var);
    }

    private n6() {
    }

    static /* synthetic */ void B(n6 n6Var, String str) {
        n6Var.zzd |= 8;
        n6Var.zzh = str;
    }

    static /* synthetic */ void C(n6 n6Var, String str) {
        str.getClass();
        n6Var.zzd |= 2;
        n6Var.zzf = str;
    }

    static /* synthetic */ void D(n6 n6Var, int i7) {
        n6Var.zzd |= 16;
        n6Var.zzi = i7;
    }

    static /* synthetic */ void E(n6 n6Var, l6 l6Var) {
        n6Var.zzg = l6Var.a();
        n6Var.zzd |= 4;
    }

    static /* synthetic */ void F(n6 n6Var, int i7) {
        n6Var.zzd |= 1;
        n6Var.zze = i7;
    }

    public static j6 G() {
        return (j6) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003\u0007င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", k6.f21593a, "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new n6();
        }
        m6 m6Var = null;
        if (i8 == 4) {
            return new j6(m6Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
