package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class in {

    /* renamed from: a, reason: collision with root package name */
    private final a5.d f10092a;

    public in(final Context context, Executor executor) {
        this.f10092a = p64.d(new Callable(this) { // from class: com.google.android.gms.internal.ads.hn
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                Context context2 = context;
                try {
                    return sc3.a(context2, context2.getPackageName(), Integer.toString(context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionCode));
                } catch (Throwable unused) {
                    return null;
                }
            }
        }, executor);
    }

    public final a5.d a() {
        return this.f10092a;
    }
}
