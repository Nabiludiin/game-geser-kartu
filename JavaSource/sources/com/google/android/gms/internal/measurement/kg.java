package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public final class kg extends k {

    /* renamed from: s, reason: collision with root package name */
    private final Callable f21083s;

    public kg(String str, Callable callable) {
        super("internal.appMetadata");
        this.f21083s = callable;
    }

    @Override // com.google.android.gms.internal.measurement.k
    public final r a(o4 o4Var, List list) {
        try {
            return q6.a(this.f21083s.call());
        } catch (Exception unused) {
            return r.f21314f;
        }
    }
}
