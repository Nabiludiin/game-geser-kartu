package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;

/* compiled from: MyApplication */
final class ie0 implements DialogInterface.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ je0 f10014q;

    ie0(je0 je0Var) {
        Objects.requireNonNull(je0Var);
        this.f10014q = je0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f10014q.b("User canceled the download.");
    }
}
