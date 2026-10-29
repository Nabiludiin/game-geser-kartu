package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public enum mq implements uz4 {
    UNSUPPORTED(0),
    ARM7(2),
    X86(4),
    ARM64(5),
    X86_64(6),
    RISCV64(7),
    UNKNOWN(999);


    /* renamed from: q, reason: collision with root package name */
    private final int f12367q;

    mq(int i7) {
        this.f12367q = i7;
    }

    public static mq c(int i7) {
        if (i7 == 0) {
            return UNSUPPORTED;
        }
        if (i7 == 2) {
            return ARM7;
        }
        if (i7 == 999) {
            return UNKNOWN;
        }
        if (i7 == 4) {
            return X86;
        }
        if (i7 == 5) {
            return ARM64;
        }
        if (i7 == 6) {
            return X86_64;
        }
        if (i7 != 7) {
            return null;
        }
        return RISCV64;
    }

    public static wz4 d() {
        return jq.f10694a;
    }

    @Override // com.google.android.gms.internal.ads.uz4
    public final int a() {
        return this.f12367q;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f12367q);
    }
}
