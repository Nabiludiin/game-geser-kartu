package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class ra4 extends l94 {

    /* renamed from: a, reason: collision with root package name */
    private final int f14814a;

    /* renamed from: b, reason: collision with root package name */
    private final int f14815b = 12;

    /* renamed from: c, reason: collision with root package name */
    private final int f14816c = 16;

    /* renamed from: d, reason: collision with root package name */
    private final qa4 f14817d;

    /* synthetic */ ra4(int i7, int i8, int i9, qa4 qa4Var, byte[] bArr) {
        this.f14814a = i7;
        this.f14817d = qa4Var;
    }

    public static pa4 b() {
        return new pa4(null);
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f14817d != qa4.f14348d;
    }

    public final int c() {
        return this.f14814a;
    }

    public final qa4 d() {
        return this.f14817d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ra4)) {
            return false;
        }
        ra4 ra4Var = (ra4) obj;
        return ra4Var.f14814a == this.f14814a && ra4Var.f14817d == this.f14817d;
    }

    public final int hashCode() {
        return Objects.hash(ra4.class, Integer.valueOf(this.f14814a), 12, 16, this.f14817d);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f14817d);
        int length = valueOf.length();
        int length2 = String.valueOf(12).length();
        int length3 = String.valueOf(16).length();
        int i7 = this.f14814a;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i7).length() + 10);
        sb.append("AesGcm Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(12);
        sb.append("-byte IV, ");
        sb.append(16);
        sb.append("-byte tag, and ");
        sb.append(i7);
        sb.append("-byte key)");
        return sb.toString();
    }
}
