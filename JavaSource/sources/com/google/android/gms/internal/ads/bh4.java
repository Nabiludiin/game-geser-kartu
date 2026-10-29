package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class bh4 extends s84 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5780a;

    /* renamed from: b, reason: collision with root package name */
    private final uo4 f5781b;

    /* synthetic */ bh4(String str, uo4 uo4Var, byte[] bArr) {
        this.f5780a = str;
        this.f5781b = uo4Var;
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f5781b != uo4.RAW;
    }

    public final String toString() {
        String str = this.f5780a;
        int ordinal = this.f5781b.ordinal();
        return String.format("(typeUrl=%s, outputPrefixType=%s)", str, ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK");
    }
}
