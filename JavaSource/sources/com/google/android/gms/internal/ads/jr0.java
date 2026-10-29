package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: MyApplication */
final class jr0 implements DialogInterface.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ JsPromptResult f10720q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ EditText f10721r;

    jr0(JsPromptResult jsPromptResult, EditText editText) {
        this.f10720q = jsPromptResult;
        this.f10721r = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        this.f10720q.confirm(this.f10721r.getText().toString());
    }
}
