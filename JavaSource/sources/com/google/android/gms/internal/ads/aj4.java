package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class aj4 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f5007a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f5008b;

    /* synthetic */ aj4(Class cls, Class cls2, byte[] bArr) {
        this.f5007a = cls;
        this.f5008b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aj4)) {
            return false;
        }
        aj4 aj4Var = (aj4) obj;
        return aj4Var.f5007a.equals(this.f5007a) && aj4Var.f5008b.equals(this.f5008b);
    }

    public final int hashCode() {
        return Objects.hash(this.f5007a, this.f5008b);
    }

    public final String toString() {
        Class cls = this.f5008b;
        String simpleName = this.f5007a.getSimpleName();
        String simpleName2 = cls.getSimpleName();
        StringBuilder sb = new StringBuilder(simpleName.length() + 26 + simpleName2.length());
        sb.append(simpleName);
        sb.append(" with serialization type: ");
        sb.append(simpleName2);
        return sb.toString();
    }
}
