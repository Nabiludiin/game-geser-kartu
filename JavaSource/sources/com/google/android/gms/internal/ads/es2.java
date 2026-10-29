package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class es2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7806a;

    /* renamed from: b, reason: collision with root package name */
    private final z64 f7807b;

    es2(Context context, z64 z64Var) {
        this.f7806a = context;
        this.f7807b = z64Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        return ((Boolean) o00.f13122b.e()).booleanValue() ? this.f7807b.B0(new Callable() { // from class: com.google.android.gms.internal.ads.ds2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return es2.this.c();
            }
        }) : p64.a(new fs2(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 59;
    }

    final /* synthetic */ fs2 c() {
        Context context = this.f7806a;
        return new fs2(fy.c(context), fy.d(context));
    }
}
