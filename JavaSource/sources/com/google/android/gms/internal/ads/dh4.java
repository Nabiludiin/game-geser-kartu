package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class dh4 extends s84 {

    /* renamed from: a, reason: collision with root package name */
    private final si4 f7113a;

    public dh4(si4 si4Var) {
        this.f7113a = si4Var;
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f7113a.c().f0() != uo4.RAW;
    }

    public final si4 b() {
        return this.f7113a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dh4)) {
            return false;
        }
        si4 si4Var = ((dh4) obj).f7113a;
        si4 si4Var2 = this.f7113a;
        return si4Var2.c().f0().equals(si4Var.c().f0()) && si4Var2.c().d0().equals(si4Var.c().d0()) && si4Var2.c().e0().equals(si4Var.c().e0());
    }

    public final int hashCode() {
        si4 si4Var = this.f7113a;
        return Objects.hash(si4Var.c(), si4Var.e());
    }

    public final String toString() {
        si4 si4Var = this.f7113a;
        String d02 = si4Var.c().d0();
        int ordinal = si4Var.c().f0().ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", d02, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
