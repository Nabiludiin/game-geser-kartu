package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public final class o55 extends sz4 implements x05 {
    private static final o55 zzl;
    private static volatile d15 zzm;
    private int zza;
    private int zzb;
    private o45 zzd;
    private s45 zze;
    private int zzf;
    private int zzi;
    private byte zzk = 2;
    private String zzc = "";
    private xz4 zzg = sz4.u();
    private String zzh = "";
    private b05 zzj = sz4.y();

    static {
        o55 o55Var = new o55();
        zzl = o55Var;
        sz4.U(o55.class, o55Var);
    }

    private o55() {
    }

    public static n55 f0() {
        return (n55) zzl.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        byte[] bArr = null;
        switch (rz4Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzk);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzk = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return sz4.V(zzl, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zza", "zzb", "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", l55.f11428a, "zzj"});
            case NEW_MUTABLE_INSTANCE:
                return new o55();
            case NEW_BUILDER:
                return new n55(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzl;
            case GET_PARSER:
                d15 d15Var2 = zzm;
                if (d15Var2 != null) {
                    return d15Var2;
                }
                synchronized (o55.class) {
                    try {
                        d15Var = zzm;
                        if (d15Var == null) {
                            d15Var = new pz4(zzl);
                            zzm = d15Var;
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

    public final String d0() {
        return this.zzc;
    }

    public final int e0() {
        return this.zzj.size();
    }

    final /* synthetic */ void g0(int i7) {
        this.zza |= 1;
        this.zzb = i7;
    }

    final /* synthetic */ void h0(String str) {
        str.getClass();
        this.zza |= 2;
        this.zzc = str;
    }

    final /* synthetic */ void i0(o45 o45Var) {
        o45Var.getClass();
        this.zzd = o45Var;
        this.zza |= 4;
    }

    final /* synthetic */ void j0(String str) {
        str.getClass();
        b05 b05Var = this.zzj;
        if (!b05Var.a()) {
            this.zzj = sz4.z(b05Var);
        }
        this.zzj.add(str);
    }

    final /* synthetic */ void l0(int i7) {
        this.zzi = i7 - 1;
        this.zza |= 64;
    }
}
