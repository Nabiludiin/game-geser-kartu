package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class ws1 implements y50 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f18403a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18404b;

    /* renamed from: c, reason: collision with root package name */
    private final y50 f18405c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ xs1 f18406d;

    /* synthetic */ ws1(xs1 xs1Var, WeakReference weakReference, String str, y50 y50Var, byte[] bArr) {
        Objects.requireNonNull(xs1Var);
        this.f18406d = xs1Var;
        this.f18403a = weakReference;
        this.f18404b = str;
        this.f18405c = y50Var;
    }

    @Override // com.google.android.gms.internal.ads.y50
    public final void a(Object obj, Map map) {
        Object obj2 = this.f18403a.get();
        if (obj2 == null) {
            this.f18406d.e(this.f18404b, this);
        } else {
            this.f18405c.a(obj2, map);
        }
    }
}
