package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* compiled from: MyApplication */
final class ce0 implements DialogInterface.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ de0 f6399q;

    ce0(de0 de0Var) {
        Objects.requireNonNull(de0Var);
        this.f6399q = de0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f6399q.b("Operation denied by user.");
    }
}
