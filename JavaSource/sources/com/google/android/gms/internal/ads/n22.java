package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;

/* compiled from: MyApplication */
final /* synthetic */ class n22 implements w54 {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ n22 f12553a = new n22();

    private /* synthetic */ n22() {
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
