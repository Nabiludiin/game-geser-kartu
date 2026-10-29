package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* compiled from: MyApplication */
final class q8 extends ContentObserver {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q8(s8 s8Var, Handler handler) {
        super(null);
        Objects.requireNonNull(s8Var);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        i9.c();
    }
}
