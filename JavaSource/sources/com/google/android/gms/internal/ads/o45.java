package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class o45 extends sz4 implements x05 {
    private static final o45 zzh;
    private static volatile d15 zzi;
    private int zza;
    private n45 zzb;
    private qy4 zzd;
    private qy4 zze;
    private int zzf;
    private byte zzg = 2;
    private b05 zzc = sz4.y();

    static {
        o45 o45Var = new o45();
        zzh = o45Var;
        sz4.U(o45.class, o45Var);
    }

    private o45() {
        qy4 qy4Var = qy4.f14669r;
        this.zzd = qy4Var;
        this.zze = qy4Var;
    }

    public static l45 d0() {
        return (l45) zzh.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        byte[] bArr = null;
        switch (rz4Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzg);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzg = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return sz4.V(zzh, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zza", "zzb", "zzc", k45.class, "zzd", "zze", "zzf"});
            case NEW_MUTABLE_INSTANCE:
                return new o45();
            case NEW_BUILDER:
                return new l45(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzh;
            case GET_PARSER:
                d15 d15Var2 = zzi;
                if (d15Var2 != null) {
                    return d15Var2;
                }
                synchronized (o45.class) {
                    try {
                        d15Var = zzi;
                        if (d15Var == null) {
                            d15Var = new pz4(zzh);
                            zzi = d15Var;
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

    final /* synthetic */ void e0(k45 k45Var) {
        k45Var.getClass();
        b05 b05Var = this.zzc;
        if (!b05Var.a()) {
            this.zzc = sz4.z(b05Var);
        }
        this.zzc.add(k45Var);
    }
}
