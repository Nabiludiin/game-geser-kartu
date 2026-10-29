package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: MyApplication */
public final class iw4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f10245a;

    /* renamed from: b, reason: collision with root package name */
    public final eq5 f10246b;

    /* renamed from: c, reason: collision with root package name */
    public final eq5 f10247c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10248d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10249e;

    public iw4(String str, eq5 eq5Var, eq5 eq5Var2, int i7, int i8) {
        boolean z7;
        if (i7 != 0) {
            z7 = false;
            i8 = i8 == 0 ? 0 : i8;
            rx3.a(z7);
            rx3.a(true ^ TextUtils.isEmpty(str));
            this.f10245a = str;
            this.f10246b = eq5Var;
            eq5Var2.getClass();
            this.f10247c = eq5Var2;
            this.f10248d = i7;
            this.f10249e = i8;
        }
        z7 = true;
        rx3.a(z7);
        rx3.a(true ^ TextUtils.isEmpty(str));
        this.f10245a = str;
        this.f10246b = eq5Var;
        eq5Var2.getClass();
        this.f10247c = eq5Var2;
        this.f10248d = i7;
        this.f10249e = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && iw4.class == obj.getClass()) {
            iw4 iw4Var = (iw4) obj;
            if (this.f10248d == iw4Var.f10248d && this.f10249e == iw4Var.f10249e && this.f10245a.equals(iw4Var.f10245a) && this.f10246b.equals(iw4Var.f10246b) && this.f10247c.equals(iw4Var.f10247c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f10248d + 527) * 31) + this.f10249e) * 31) + this.f10245a.hashCode()) * 31) + this.f10246b.hashCode()) * 31) + this.f10247c.hashCode();
    }
}
