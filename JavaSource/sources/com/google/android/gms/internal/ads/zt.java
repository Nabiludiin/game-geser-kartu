package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Objects;

/* compiled from: MyApplication */
final class zt extends PushbackInputStream {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ cu f20337q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zt(cu cuVar, InputStream inputStream, int i7) {
        super(inputStream, 1);
        Objects.requireNonNull(cuVar);
        this.f20337q = cuVar;
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f20337q.f6633c.b();
        super.close();
    }
}
