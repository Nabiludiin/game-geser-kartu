package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class ed implements r5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f22104a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ List f22105b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ pd f22106c;

    ed(pd pdVar, String str, List list) {
        this.f22104a = str;
        this.f22105b = list;
        Objects.requireNonNull(pdVar);
        this.f22106c = pdVar;
    }

    @Override // com.google.android.gms.measurement.internal.r5
    public final void a(String str, int i7, Throwable th, byte[] bArr, Map map) {
        this.f22106c.A(true, i7, th, bArr, this.f22104a, this.f22105b);
    }
}
