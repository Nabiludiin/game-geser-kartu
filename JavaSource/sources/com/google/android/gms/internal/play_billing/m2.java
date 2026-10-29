package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
public final class m2 extends d4 implements a5 {
    private static final m2 zzb;
    private i4 zzd = d4.t();

    static {
        m2 m2Var = new m2();
        zzb = m2Var;
        d4.y(m2.class, m2Var);
    }

    private m2() {
    }

    public static l2 B() {
        return (l2) zzb.n();
    }

    static /* synthetic */ void D(m2 m2Var, Iterable iterable) {
        i4 i4Var = m2Var.zzd;
        if (!i4Var.d()) {
            int size = i4Var.size();
            m2Var.zzd = i4Var.V(size + size);
        }
        u2.d(iterable, m2Var.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.d4
    protected final Object h(int i7, Object obj, Object obj2) {
        int i8 = i7 - 1;
        if (i8 == 0) {
            return (byte) 1;
        }
        if (i8 == 2) {
            return d4.v(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", k2.class});
        }
        if (i8 == 3) {
            return new m2();
        }
        n2 n2Var = null;
        if (i8 == 4) {
            return new l2(n2Var);
        }
        if (i8 == 5) {
            return zzb;
        }
        throw null;
    }
}
