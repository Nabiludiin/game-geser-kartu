package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class zi4 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f20193a;

    /* renamed from: b, reason: collision with root package name */
    private final hw4 f20194b;

    /* synthetic */ zi4(Class cls, hw4 hw4Var, byte[] bArr) {
        this.f20193a = cls;
        this.f20194b = hw4Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zi4)) {
            return false;
        }
        zi4 zi4Var = (zi4) obj;
        return zi4Var.f20193a.equals(this.f20193a) && zi4Var.f20194b.equals(this.f20194b);
    }

    public final int hashCode() {
        return Objects.hash(this.f20193a, this.f20194b);
    }

    public final String toString() {
        hw4 hw4Var = this.f20194b;
        String simpleName = this.f20193a.getSimpleName();
        String valueOf = String.valueOf(hw4Var);
        StringBuilder sb = new StringBuilder(simpleName.length() + 21 + valueOf.length());
        sb.append(simpleName);
        sb.append(", object identifier: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
