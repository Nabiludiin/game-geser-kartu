package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class o43 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f13187a;

    /* renamed from: b, reason: collision with root package name */
    private final List f13188b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ x43 f13189c;

    /* synthetic */ o43(x43 x43Var, Object obj, List list, byte[] bArr) {
        Objects.requireNonNull(x43Var);
        this.f13189c = x43Var;
        this.f13187a = obj;
        this.f13188b = list;
    }

    public final w43 a(Callable callable) {
        List list = this.f13188b;
        o64 p7 = p64.p(list);
        a5.d a8 = p7.a(n43.f12571a, cm0.f6506g);
        x43 x43Var = this.f13189c;
        return new w43(x43Var, this.f13187a, null, a8, list, p7.a(callable, x43Var.e()), null);
    }
}
