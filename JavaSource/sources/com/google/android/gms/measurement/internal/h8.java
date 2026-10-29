package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* compiled from: MyApplication */
final class h8 extends x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ w9 f22199e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h8(w9 w9Var, b8 b8Var) {
        super(b8Var);
        Objects.requireNonNull(w9Var);
        this.f22199e = w9Var;
    }

    @Override // com.google.android.gms.measurement.internal.x
    public final void a() {
        final w9 B = this.f22199e.f22928a.B();
        Objects.requireNonNull(B);
        new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.g8
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                w9.this.u0();
            }
        }).start();
    }
}
