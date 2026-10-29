package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: MyApplication */
final class ho implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ ko f9591q;

    ho(ko koVar) {
        Objects.requireNonNull(koVar);
        this.f9591q = koVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9591q.r();
    }
}
