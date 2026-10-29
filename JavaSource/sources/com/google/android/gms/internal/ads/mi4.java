package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class mi4 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f12269a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f12270b;

    /* synthetic */ mi4(Class cls, Class cls2, byte[] bArr) {
        this.f12269a = cls;
        this.f12270b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mi4)) {
            return false;
        }
        mi4 mi4Var = (mi4) obj;
        return mi4Var.f12269a.equals(this.f12269a) && mi4Var.f12270b.equals(this.f12270b);
    }

    public final int hashCode() {
        return Objects.hash(this.f12269a, this.f12270b);
    }

    public final String toString() {
        Class cls = this.f12270b;
        String simpleName = this.f12269a.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb = new StringBuilder(simpleName.length() + 22 + simpleName2.length());
        sb.append(simpleName);
        sb.append(" with primitive type: ");
        sb.append(simpleName2);
        return sb.toString();
    }
}
