package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class b7 extends xa implements yb {
    private static final b7 zzf;
    private int zzb;
    private int zzd;
    private cb zze = xa.z();

    static {
        b7 b7Var = new b7();
        zzf = b7Var;
        xa.v(b7.class, b7Var);
    }

    private b7() {
    }

    public static a7 K() {
        return (a7) zzf.r();
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i8 == 3) {
            return new b7();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new a7(bArr);
        }
        if (i8 == 5) {
            return zzf;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzb & 1) != 0;
    }

    public final int G() {
        return this.zzd;
    }

    public final List H() {
        return this.zze;
    }

    public final int I() {
        return this.zze.size();
    }

    public final long J(int i7) {
        return this.zze.R(i7);
    }

    final /* synthetic */ void L(int i7) {
        this.zzb |= 1;
        this.zzd = i7;
    }

    final /* synthetic */ void M(Iterable iterable) {
        cb cbVar = this.zze;
        if (!cbVar.a()) {
            this.zze = xa.A(cbVar);
        }
        o9.i(iterable, this.zze);
    }
}
