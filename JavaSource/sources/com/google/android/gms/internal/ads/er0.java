package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: MyApplication */
final class er0 implements DialogInterface.OnCancelListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ JsResult f7788q;

    er0(JsResult jsResult) {
        this.f7788q = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f7788q.cancel();
    }
}
