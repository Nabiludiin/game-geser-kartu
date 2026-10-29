package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* compiled from: MyApplication */
public final class m8 {

    /* renamed from: a, reason: collision with root package name */
    private final r.h f21131a;

    m8(r.h hVar) {
        this.f21131a = hVar;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        r.h hVar = uri != null ? (r.h) this.f21131a.get(uri.toString()) : null;
        if (hVar == null) {
            return null;
        }
        return (String) hVar.get("".concat(str3));
    }
}
