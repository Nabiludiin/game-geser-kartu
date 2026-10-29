package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
public final class hu0 {

    /* renamed from: a, reason: collision with root package name */
    private w2.a f9692a;

    /* renamed from: b, reason: collision with root package name */
    private Context f9693b;

    /* renamed from: c, reason: collision with root package name */
    private long f9694c;

    /* renamed from: d, reason: collision with root package name */
    private WeakReference f9695d;

    public final hu0 a(w2.a aVar) {
        this.f9692a = aVar;
        return this;
    }

    public final hu0 b(Context context) {
        this.f9695d = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f9693b = context;
        return this;
    }

    public final hu0 c(long j7) {
        this.f9694c = j7;
        return this;
    }

    final /* synthetic */ w2.a d() {
        return this.f9692a;
    }

    final /* synthetic */ Context e() {
        return this.f9693b;
    }

    final /* synthetic */ long f() {
        return this.f9694c;
    }

    final /* synthetic */ WeakReference g() {
        return this.f9695d;
    }
}
