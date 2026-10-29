package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: MyApplication */
public final class l93 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f11465a;

    final boolean a() {
        return this.f11465a;
    }

    final void b(Context context) {
        lb3.b(context, "Application Context cannot be null");
        if (this.f11465a) {
            return;
        }
        this.f11465a = true;
        ta3.a().b(context);
        ja3.i().d(context);
        gb3.a(context);
        hb3.a(context);
        kb3.a(context);
        pa3.a().c(context);
        ia3.a().c(context);
        va3.a().b(context);
    }
}
