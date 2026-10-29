package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;

/* compiled from: MyApplication */
public final class bs5 extends wi {

    /* renamed from: s, reason: collision with root package name */
    public final w04 f5989s;

    public bs5(String str, Uri uri, List list) {
        super(str, null, false, 1);
        this.f5989s = w04.u(list);
    }

    @Override // com.google.android.gms.internal.ads.wi, java.lang.Throwable
    public final String getMessage() {
        w04 w04Var = this.f5989s;
        String message = super.getMessage();
        if (w04Var.isEmpty()) {
            return message;
        }
        int length = message.length();
        String valueOf = String.valueOf(w04Var);
        StringBuilder sb = new StringBuilder(length + 17 + valueOf.length());
        sb.append(message);
        sb.append("\nsniff failures: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
