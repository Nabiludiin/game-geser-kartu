package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class d8 extends d4 implements a5 {
    private static final d8 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;

    static {
        d8 d8Var = new d8();
        zzb = d8Var;
        d4.y(d8.class, d8Var);
    }

    private d8() {
    }

    static /* synthetic */ void B(d8 d8Var, boolean z7) {
        d8Var.zzd |= 8;
        d8Var.zzh = z7;
    }

    static /* synthetic */ void C(d8 d8Var, int i7) {
        d8Var.zzd |= 16;
        d8Var.zzi = i7;
    }

    static /* synthetic */ void D(d8 d8Var, long j7) {
        d8Var.zzd |= 4;
        d8Var.zzg = j7;
    }

    static /* synthetic */ void E(d8 d8Var, boolean z7) {
        d8Var.zzd |= 2;
        d8Var.zzf = true;
    }

    public static b8 F() {
        return (b8) zzb.n();
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i8 == 3) {
            return new d8();
        }
        c8 c8Var = null;
        if (i8 == 4) {
            return new b8(c8Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
