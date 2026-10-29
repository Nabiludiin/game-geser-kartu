package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* compiled from: MyApplication */
final class b8 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d8 f20833a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b8(d8 d8Var, Handler handler) {
        super(null);
        Objects.requireNonNull(d8Var);
        this.f20833a = d8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        this.f20833a.b().set(true);
    }
}
