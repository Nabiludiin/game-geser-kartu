package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.c;

/* compiled from: MyApplication */
public final class ia2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9937a;

    ia2(Context context) {
        this.f9937a = context;
    }

    public final a5.d a(boolean z7) {
        try {
            androidx.privacysandbox.ads.adservices.topics.c a8 = new c.a().b("com.google.android.gms.ads").c(z7).a();
            r0.a a9 = r0.a.a(this.f9937a);
            return a9 != null ? a9.b(a8) : p64.c(new IllegalStateException());
        } catch (Exception e8) {
            return p64.c(e8);
        }
    }
}
