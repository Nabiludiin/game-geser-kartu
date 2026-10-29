package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* compiled from: MyApplication */
final class u83 {

    /* renamed from: a, reason: collision with root package name */
    private final String f16639a;

    /* renamed from: b, reason: collision with root package name */
    private final k2.c f16640b;

    /* renamed from: c, reason: collision with root package name */
    private final String f16641c;

    /* synthetic */ u83(t83 t83Var, byte[] bArr) {
        this.f16639a = t83Var.b();
        this.f16640b = t83Var.c();
        this.f16641c = t83Var.d();
    }

    public final String a() {
        return this.f16639a;
    }

    public final String b() {
        k2.c cVar = this.f16640b;
        return cVar == null ? "unknown" : cVar.name().toLowerCase(Locale.ENGLISH);
    }

    public final String c() {
        return this.f16641c;
    }

    public final boolean equals(Object obj) {
        k2.c cVar;
        k2.c cVar2;
        if (obj instanceof u83) {
            u83 u83Var = (u83) obj;
            if (this.f16639a.equals(u83Var.f16639a) && (cVar = this.f16640b) != null && (cVar2 = u83Var.f16640b) != null && cVar.equals(cVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f16639a, this.f16640b);
    }
}
