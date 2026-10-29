package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
public final class ag3 extends sz4 implements x05 {
    private static final ag3 zzb;
    private static volatile d15 zzc;
    private p05 zza = p05.a();

    static {
        ag3 ag3Var = new ag3();
        zzb = ag3Var;
        sz4.U(ag3.class, ag3Var);
    }

    private ag3() {
    }

    public static ag3 f0(InputStream inputStream) {
        return (ag3) sz4.F(zzb, inputStream);
    }

    public static ag3 g0() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        int ordinal = rz4Var.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return sz4.V(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zf3.f20161a});
        }
        if (ordinal == 3) {
            return new ag3();
        }
        byte[] bArr = null;
        if (ordinal == 4) {
            return new yf3(bArr);
        }
        if (ordinal == 5) {
            return zzb;
        }
        if (ordinal != 6) {
            throw null;
        }
        d15 d15Var2 = zzc;
        if (d15Var2 != null) {
            return d15Var2;
        }
        synchronized (ag3.class) {
            try {
                d15Var = zzc;
                if (d15Var == null) {
                    d15Var = new pz4(zzb);
                    zzc = d15Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return d15Var;
    }

    public final int d0() {
        return this.zza.size();
    }

    public final Map e0() {
        return Collections.unmodifiableMap(this.zza);
    }

    final /* synthetic */ Map h0() {
        if (!this.zza.i()) {
            this.zza = this.zza.d();
        }
        return this.zza;
    }
}
