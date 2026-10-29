package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.List;

/* compiled from: MyApplication */
public final class ho4 extends sz4 implements x05 {
    private static final ho4 zzc;
    private static volatile d15 zzd;
    private int zza;
    private b05 zzb = sz4.y();

    static {
        ho4 ho4Var = new ho4();
        zzc = ho4Var;
        sz4.U(ho4.class, ho4Var);
    }

    private ho4() {
    }

    public static ho4 h0(byte[] bArr, ez4 ez4Var) {
        return (ho4) sz4.E(zzc, bArr, ez4Var);
    }

    public static ho4 i0(InputStream inputStream, ez4 ez4Var) {
        return (ho4) sz4.G(zzc, inputStream, ez4Var);
    }

    public static eo4 j0() {
        return (eo4) zzc.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zza", "zzb", go4.class});
        }
        if (ordinal == 3) {
            return new ho4();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new eo4(bArr);
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
        synchronized (ho4.class) {
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

    public final int d0() {
        return this.zza;
    }

    public final List e0() {
        return this.zzb;
    }

    public final int f0() {
        return this.zzb.size();
    }

    public final go4 g0(int i7) {
        return (go4) this.zzb.get(i7);
    }

    final /* synthetic */ void k0(int i7) {
        this.zza = i7;
    }

    final /* synthetic */ void l0(go4 go4Var) {
        go4Var.getClass();
        b05 b05Var = this.zzb;
        if (!b05Var.a()) {
            this.zzb = sz4.z(b05Var);
        }
        this.zzb.add(go4Var);
    }
}
