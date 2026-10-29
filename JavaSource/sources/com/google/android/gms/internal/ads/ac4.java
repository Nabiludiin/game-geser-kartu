package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class ac4 extends l94 {

    /* renamed from: a, reason: collision with root package name */
    private final zb4 f4870a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4871b;

    /* renamed from: c, reason: collision with root package name */
    private final yb4 f4872c;

    /* renamed from: d, reason: collision with root package name */
    private final l94 f4873d;

    /* synthetic */ ac4(zb4 zb4Var, String str, yb4 yb4Var, l94 l94Var, byte[] bArr) {
        this.f4870a = zb4Var;
        this.f4871b = str;
        this.f4872c = yb4Var;
        this.f4873d = l94Var;
    }

    @Override // com.google.android.gms.internal.ads.s84
    public final boolean a() {
        return this.f4870a != zb4.f20118c;
    }

    public final String b() {
        return this.f4871b;
    }

    public final zb4 c() {
        return this.f4870a;
    }

    public final l94 d() {
        return this.f4873d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ac4)) {
            return false;
        }
        ac4 ac4Var = (ac4) obj;
        return ac4Var.f4872c.equals(this.f4872c) && ac4Var.f4873d.equals(this.f4873d) && ac4Var.f4871b.equals(this.f4871b) && ac4Var.f4870a.equals(this.f4870a);
    }

    public final int hashCode() {
        return Objects.hash(ac4.class, this.f4871b, this.f4872c, this.f4873d, this.f4870a);
    }

    public final String toString() {
        zb4 zb4Var = this.f4870a;
        l94 l94Var = this.f4873d;
        String valueOf = String.valueOf(this.f4872c);
        String valueOf2 = String.valueOf(l94Var);
        String valueOf3 = String.valueOf(zb4Var);
        String str = this.f4871b;
        int length = String.valueOf(str).length();
        int length2 = valueOf.length();
        StringBuilder sb = new StringBuilder(length + 64 + length2 + 27 + valueOf2.length() + 11 + valueOf3.length() + 1);
        sb.append("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(str);
        sb.append(", dekParsingStrategy: ");
        sb.append(valueOf);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(valueOf2);
        sb.append(", variant: ");
        sb.append(valueOf3);
        sb.append(")");
        return sb.toString();
    }
}
