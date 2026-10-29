package com.google.android.gms.internal.ads;

import java.util.Objects;
import p3.c;

/* compiled from: MyApplication */
final class du implements c.b {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ im0 f7302a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ eu f7303b;

    du(eu euVar, im0 im0Var) {
        this.f7302a = im0Var;
        Objects.requireNonNull(euVar);
        this.f7303b = euVar;
    }

    @Override // p3.c.b
    public final void a(k3.b bVar) {
        synchronized (this.f7303b.f()) {
            this.f7302a.e(new RuntimeException("Connection failed."));
        }
    }
}
