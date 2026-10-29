package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: MyApplication */
final class hr0 implements DialogInterface.OnCancelListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f9624q;

    hr0(JsPromptResult jsPromptResult) {
        this.f9624q = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f9624q.cancel();
    }
}
