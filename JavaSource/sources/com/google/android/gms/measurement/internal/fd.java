package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class fd implements r5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f22153a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ sd f22154b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ pd f22155c;

    fd(pd pdVar, String str, sd sdVar) {
        this.f22153a = str;
        this.f22154b = sdVar;
        Objects.requireNonNull(pdVar);
        this.f22155c = pdVar;
    }

    @Override // com.google.android.gms.measurement.internal.r5
    public final void a(String str, int i7, Throwable th, byte[] bArr, Map map) {
        this.f22155c.v(this.f22153a, i7, th, bArr, this.f22154b);
    }
}
