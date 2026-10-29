package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: MyApplication */
public final class e65 extends sz4 implements x05 {
    private static final e65 zzR;
    private static volatile d15 zzS;
    private z55 zzA;
    private e45 zzC;
    private v35 zzE;
    private x45 zzG;
    private int zzH;
    private long zzK;
    private c65 zzL;
    private d55 zzM;
    private w55 zzO;
    private int zza;
    private int zzb;
    private int zzc;
    private z35 zzg;
    private j55 zzk;
    private boolean zzl;
    private boolean zzo;
    private boolean zzp;
    private q55 zzv;
    private boolean zzw;
    private byte zzQ = 2;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private b05 zzh = sz4.y();
    private b05 zzi = sz4.y();
    private String zzj = "";
    private b05 zzm = sz4.y();
    private String zzn = "";
    private qy4 zzu = qy4.f14669r;
    private String zzx = "";
    private b05 zzy = sz4.y();
    private b05 zzz = sz4.y();
    private b05 zzB = sz4.y();
    private String zzD = "";
    private b05 zzF = sz4.y();
    private b05 zzI = sz4.y();
    private b05 zzJ = sz4.y();
    private String zzN = "";
    private b05 zzP = sz4.y();

    static {
        e65 e65Var = new e65();
        zzR = e65Var;
        sz4.U(e65.class, e65Var);
    }

    private e65() {
    }

    public static x35 g0() {
        return (x35) zzR.P();
    }

    @Override // com.google.android.gms.internal.ads.sz4
    protected final Object Y(rz4 rz4Var, Object obj, Object obj2) {
        d15 d15Var;
        byte[] bArr = null;
        switch (rz4Var) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return sz4.V(zzR, "\u0001%\u0000\u0001\u0001%%\u0000\n\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a%\u001b", new Object[]{"zza", "zzd", "zze", "zzf", "zzh", o55.class, "zzl", "zzm", "zzn", "zzo", "zzp", "zzb", k55.f10895a, "zzc", w35.f18019a, "zzg", "zzj", "zzk", "zzu", "zzi", i65.class, "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", o65.class, "zzC", "zzD", "zzE", "zzF", i45.class, "zzG", "zzH", x55.f18583a, "zzI", a55.class, "zzJ", g55.class, "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", t55.class});
            case NEW_MUTABLE_INSTANCE:
                return new e65();
            case NEW_BUILDER:
                return new x35(bArr);
            case GET_DEFAULT_INSTANCE:
                return zzR;
            case GET_PARSER:
                d15 d15Var2 = zzS;
                if (d15Var2 != null) {
                    return d15Var2;
                }
                synchronized (e65.class) {
                    try {
                        d15Var = zzS;
                        if (d15Var == null) {
                            d15Var = new pz4(zzR);
                            zzS = d15Var;
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
        return this.zzd;
    }

    public final List e0() {
        return this.zzh;
    }

    public final String f0() {
        return this.zzj;
    }

    final /* synthetic */ void h0(String str) {
        this.zza |= 4;
        this.zzd = str;
    }

    final /* synthetic */ void i0(String str) {
        this.zza |= 8;
        this.zze = str;
    }

    final /* synthetic */ void j0(z35 z35Var) {
        z35Var.getClass();
        this.zzg = z35Var;
        this.zza |= 32;
    }

    final /* synthetic */ void k0(o55 o55Var) {
        o55Var.getClass();
        b05 b05Var = this.zzh;
        if (!b05Var.a()) {
            this.zzh = sz4.z(b05Var);
        }
        this.zzh.add(o55Var);
    }

    final /* synthetic */ void l0(String str) {
        this.zza |= 64;
        this.zzj = str;
    }

    final /* synthetic */ void m0() {
        this.zza &= -65;
        this.zzj = zzR.zzj;
    }

    final /* synthetic */ void n0(j55 j55Var) {
        j55Var.getClass();
        this.zzk = j55Var;
        this.zza |= 128;
    }

    final /* synthetic */ void o0(q55 q55Var) {
        q55Var.getClass();
        this.zzv = q55Var;
        this.zza |= 8192;
    }

    final /* synthetic */ void p0(Iterable iterable) {
        b05 b05Var = this.zzy;
        if (!b05Var.a()) {
            this.zzy = sz4.z(b05Var);
        }
        ay4.j(iterable, this.zzy);
    }

    final /* synthetic */ void q0(Iterable iterable) {
        b05 b05Var = this.zzz;
        if (!b05Var.a()) {
            this.zzz = sz4.z(b05Var);
        }
        ay4.j(iterable, this.zzz);
    }

    final /* synthetic */ void s0(int i7) {
        this.zzb = i7 - 1;
        this.zza |= 1;
    }
}
