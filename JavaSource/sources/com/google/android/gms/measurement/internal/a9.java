package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* compiled from: MyApplication */
final class a9 implements xd {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ w9 f21855a;

    a9(w9 w9Var) {
        Objects.requireNonNull(w9Var);
        this.f21855a = w9Var;
    }

    @Override // com.google.android.gms.measurement.internal.xd
    public final void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            this.f21855a.p("auto", "_err", bundle);
        } else {
            this.f21855a.w("auto", "_err", bundle, str);
        }
    }
}
