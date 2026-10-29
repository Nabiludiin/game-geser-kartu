package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* compiled from: MyApplication */
final class h8 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ l8 f21001a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h8(l8 l8Var, Handler handler) {
        super(null);
        Objects.requireNonNull(l8Var);
        this.f21001a = l8Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        this.f21001a.c();
    }
}
