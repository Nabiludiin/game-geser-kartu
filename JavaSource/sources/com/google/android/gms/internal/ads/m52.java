package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: MyApplication */
final /* synthetic */ class m52 implements w54 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ m52 f12079a = new m52();

    private /* synthetic */ m52() {
    }

    @Override // com.google.android.gms.internal.ads.w54
    public final /* synthetic */ a5.d d(Object obj) {
        Throwable th = (ExecutionException) obj;
        if (th.getCause() != null) {
            th = th.getCause();
        }
        return p64.c(th);
    }
}
