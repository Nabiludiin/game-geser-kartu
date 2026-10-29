package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: MyApplication */
final class gr0 implements DialogInterface.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ JsResult f9086q;

    gr0(JsResult jsResult) {
        this.f9086q = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f9086q.confirm();
    }
}
