package com.google.android.gms.measurement.internal;

import android.text.TextUtils;

/* compiled from: MyApplication */
final class c3 {

    /* renamed from: a, reason: collision with root package name */
    private final t4.u f21931a;

    c3(t4.u uVar) {
        this.f21931a = uVar;
    }

    static c3 c(String str) {
        return new c3((TextUtils.isEmpty(str) || str.length() > 1) ? t4.u.UNINITIALIZED : d8.j(str.charAt(0)));
    }

    final t4.u a() {
        return this.f21931a;
    }

    final String b() {
        return String.valueOf(d8.m(this.f21931a));
    }
}
