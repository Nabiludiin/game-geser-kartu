package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class k45 extends sz4 implements x05 {
    private static final k45 zze;
    private static volatile d15 zzf;
    private int zza;
    private qy4 zzb;
    private qy4 zzc;
    private byte zzd = 2;

    static {
        k45 k45Var = new k45();
        zze = k45Var;
        sz4.U(k45.class, k45Var);
    }

    private k45() {
        qy4 qy4Var = qy4.f14669r;
        this.zzb = qy4Var;
        this.zzc = qy4Var;
    }

    public static j45 d0() {
        return (j45) zze.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        byte[] bArr = null;
        switch (rz4Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzd);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzd = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return sz4.V(zze, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zza", "zzb", "zzc"});
            case NEW_MUTABLE_INSTANCE:
                return new k45();
            case NEW_BUILDER:
                return new j45(bArr);
            case GET_DEFAULT_INSTANCE:
                return zze;
            case GET_PARSER:
                d15 d15Var2 = zzf;
                if (d15Var2 != null) {
                    return d15Var2;
                }
                synchronized (k45.class) {
                    try {
                        d15Var = zzf;
                        if (d15Var == null) {
                            d15Var = new pz4(zze);
                            zzf = d15Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return d15Var;
            default:
                throw null;
        }
    }

    final /* synthetic */ void e0(qy4 qy4Var) {
        this.zza |= 1;
        this.zzb = qy4Var;
    }

    final /* synthetic */ void f0(qy4 qy4Var) {
        this.zza |= 2;
        this.zzc = qy4Var;
    }
}
