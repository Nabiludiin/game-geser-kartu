package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.Objects;

/* compiled from: MyApplication */
public final class ga2 {

    /* renamed from: a, reason: collision with root package name */
    private q0.a f8739a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f8740b;

    ga2(Context context) {
        this.f8740b = context;
    }

    public final a5.d a() {
        try {
            q0.a a8 = q0.a.a(this.f8740b);
            this.f8739a = a8;
            return a8 == null ? p64.c(new IllegalStateException("MeasurementManagerFutures is null")) : a8.b();
        } catch (Exception e8) {
            return p64.c(e8);
        }
    }

    public final a5.d b(Uri uri, InputEvent inputEvent) {
        try {
            q0.a aVar = this.f8739a;
            Objects.requireNonNull(aVar);
            return aVar.c(uri, inputEvent);
        } catch (Exception e8) {
            return p64.c(e8);
        }
    }
}
