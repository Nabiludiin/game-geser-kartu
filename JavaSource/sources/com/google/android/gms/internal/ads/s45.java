package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class s45 extends sz4 implements x05 {
    private static final s45 zzi;
    private static volatile d15 zzj;
    private int zza;
    private r45 zzb;
    private qy4 zzd;
    private qy4 zze;
    private int zzf;
    private qy4 zzg;
    private byte zzh = 2;
    private b05 zzc = sz4.y();

    static {
        s45 s45Var = new s45();
        zzi = s45Var;
        sz4.U(s45.class, s45Var);
    }

    private s45() {
        qy4 qy4Var = qy4.f14669r;
        this.zzd = qy4Var;
        this.zze = qy4Var;
        this.zzg = qy4Var;
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        byte[] bArr = null;
        switch (rz4Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzh);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzh = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return sz4.V(zzi, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zza", "zzb", "zzc", k45.class, "zzd", "zze", "zzf", "zzg"});
            case NEW_MUTABLE_INSTANCE:
                return new s45();
            case NEW_BUILDER:
                return new p45(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzi;
            case GET_PARSER:
                d15 d15Var2 = zzj;
                if (d15Var2 != null) {
                    return d15Var2;
                }
                synchronized (s45.class) {
                    try {
                        d15Var = zzj;
                        if (d15Var == null) {
                            d15Var = new pz4(zzi);
                            zzj = d15Var;
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
}
