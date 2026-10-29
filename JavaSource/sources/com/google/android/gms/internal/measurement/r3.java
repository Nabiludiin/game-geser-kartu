package com.google.android.gms.internal.measurement;

import java.util.List;

/* compiled from: MyApplication */
public final class r3 extends xa implements yb {
    private static final r3 zzi;
    private int zzb;
    private int zzd;
    private db zze = xa.B();
    private db zzf = xa.B();
    private boolean zzg;
    private boolean zzh;

    static {
        r3 r3Var = new r3();
        zzi = r3Var;
        xa.v(r3.class, r3Var);
    }

    private r3() {
    }

    @Override // com.google.android.gms.internal.measurement.xa
    protected final Object E(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return xa.w(zzi, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zzd", "zze", b4.class, "zzf", t3.class, "zzg", "zzh"});
        }
        if (i8 == 3) {
            return new r3();
        }
        byte[] bArr = null;
        if (i8 == 4) {
            return new q3(bArr);
        }
        if (i8 == 5) {
            return zzi;
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

    public final b4 J(int i7) {
        return (b4) this.zze.get(i7);
    }

    public final List K() {
        return this.zzf;
    }

    public final int L() {
        return this.zzf.size();
    }

    public final t3 M(int i7) {
        return (t3) this.zzf.get(i7);
    }

    final /* synthetic */ void N(int i7, b4 b4Var) {
        b4Var.getClass();
        db dbVar = this.zze;
        if (!dbVar.a()) {
            this.zze = xa.C(dbVar);
        }
        this.zze.set(i7, b4Var);
    }

    final /* synthetic */ void O(int i7, t3 t3Var) {
        t3Var.getClass();
        db dbVar = this.zzf;
        if (!dbVar.a()) {
            this.zzf = xa.C(dbVar);
        }
        this.zzf.set(i7, t3Var);
    }
}
