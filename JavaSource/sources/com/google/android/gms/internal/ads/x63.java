package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class x63 extends sz4 implements x05 {
    private static final x63 zzc;
    private static volatile d15 zzd;
    private b05 zza = sz4.y();
    private long zzb;

    static {
        x63 x63Var = new x63();
        zzc = x63Var;
        sz4.U(x63.class, x63Var);
    }

    private x63() {
    }

    public static w63 d0() {
        return (w63) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0002", new Object[]{"zza", p53.class, "zzb"});
        }
        if (ordinal == 3) {
            return new x63();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new w63(bArr);
        }
        if (ordinal == 5) {
            return zzc;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzd;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (x63.class) {
            try {
                d15Var = zzd;
                if (d15Var == null) {
                    d15Var = new pz4(zzc);
                    zzd = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    final /* synthetic */ void e0(p53 p53Var) {
        p53Var.getClass();
        b05 b05Var = this.zza;
        if (!b05Var.a()) {
            this.zza = sz4.z(b05Var);
        }
        this.zza.add(p53Var);
    }

    final /* synthetic */ void f0(long j7) {
        this.zzb = j7;
    }
}
