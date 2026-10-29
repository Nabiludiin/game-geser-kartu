package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
public final class j9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10398a;

    /* renamed from: b, reason: collision with root package name */
    public final m5 f10399b;

    /* renamed from: c, reason: collision with root package name */
    public final n4 f10400c;

    /* renamed from: d, reason: collision with root package name */
    public final jc f10401d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f10402e;

    /* renamed from: f, reason: collision with root package name */
    public final l7 f10403f;

    static {
        new pu5().c();
        String str = hi2.f9535a;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    /* synthetic */ j9(String str, i1 i1Var, m5 m5Var, n4 n4Var, jc jcVar, l7 l7Var, byte[] bArr) {
        this.f10398a = str;
        this.f10399b = m5Var;
        this.f10400c = n4Var;
        this.f10401d = jcVar;
        this.f10402e = i1Var;
        this.f10403f = l7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9)) {
            return false;
        }
        j9 j9Var = (j9) obj;
        return Objects.equals(this.f10398a, j9Var.f10398a) && this.f10402e.equals(j9Var.f10402e) && Objects.equals(this.f10399b, j9Var.f10399b) && Objects.equals(this.f10400c, j9Var.f10400c) && Objects.equals(this.f10401d, j9Var.f10401d) && Objects.equals(this.f10403f, j9Var.f10403f);
    }

    public final int hashCode() {
        int hashCode = this.f10398a.hashCode() * 31;
        m5 m5Var = this.f10399b;
        return (((((((hashCode + (m5Var != null ? m5Var.hashCode() : 0)) * 31) + this.f10400c.hashCode()) * 31) + this.f10402e.hashCode()) * 31) + this.f10401d.hashCode()) * 31;
    }
}
