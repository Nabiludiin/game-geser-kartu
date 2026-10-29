package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: MyApplication */
public final class xb4 {

    /* renamed from: a, reason: collision with root package name */
    private zb4 f18732a;

    /* renamed from: b, reason: collision with root package name */
    private String f18733b;

    /* renamed from: c, reason: collision with root package name */
    private yb4 f18734c;

    /* renamed from: d, reason: collision with root package name */
    private l94 f18735d;

    /* synthetic */ xb4(byte[] bArr) {
    }

    public final xb4 a(zb4 zb4Var) {
        this.f18732a = zb4Var;
        return this;
    }

    public final xb4 b(String str) {
        this.f18733b = str;
        return this;
    }

    public final xb4 c(yb4 yb4Var) {
        this.f18734c = yb4Var;
        return this;
    }

    public final xb4 d(l94 l94Var) {
        this.f18735d = l94Var;
        return this;
    }

    public final ac4 e() {
        if (this.f18732a == null) {
            this.f18732a = zb4.f20118c;
        }
        if (this.f18733b == null) {
            throw new GeneralSecurityException("kekUri must be set");
        }
        yb4 yb4Var = this.f18734c;
        if (yb4Var == null) {
            throw new GeneralSecurityException("dekParsingStrategy must be set");
        }
        l94 l94Var = this.f18735d;
        if (l94Var == null) {
            throw new GeneralSecurityException("dekParametersForNewKeys must be set");
        }
        if (l94Var.a()) {
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        if ((yb4Var.equals(yb4.f19468b) && (l94Var instanceof ra4)) || ((yb4Var.equals(yb4.f19470d) && (l94Var instanceof gb4)) || ((yb4Var.equals(yb4.f19469c) && (l94Var instanceof ed4)) || ((yb4Var.equals(yb4.f19471e) && (l94Var instanceof z94)) || ((yb4Var.equals(yb4.f19472f) && (l94Var instanceof ha4)) || (yb4Var.equals(yb4.f19473g) && (l94Var instanceof ab4))))))) {
            return new ac4(this.f18732a, this.f18733b, this.f18734c, this.f18735d, null);
        }
        String yb4Var2 = this.f18734c.toString();
        String valueOf = String.valueOf(this.f18735d);
        StringBuilder sb = new StringBuilder(yb4Var2.length() + 67 + valueOf.length() + 1);
        sb.append("Cannot use parsing strategy ");
        sb.append(yb4Var2);
        sb.append(" when new keys are picked according to ");
        sb.append(valueOf);
        sb.append(".");
        throw new GeneralSecurityException(sb.toString());
    }
}
