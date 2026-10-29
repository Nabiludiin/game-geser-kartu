package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import java.util.Objects;

/* compiled from: MyApplication */
final class be0 implements DialogInterface.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ de0 f5729q;

    be0(de0 de0Var) {
        Objects.requireNonNull(de0Var);
        this.f5729q = de0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        de0 de0Var = this.f5729q;
        Intent i8 = de0Var.i();
        r2.t.g();
        v2.f2.z(de0Var.j(), i8);
    }
}
