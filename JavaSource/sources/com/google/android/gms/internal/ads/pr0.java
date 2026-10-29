package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class pr0 implements m64 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f14026a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f14027b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Uri f14028c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ yr0 f14029d;

    pr0(yr0 yr0Var, List list, String str, Uri uri) {
        this.f14026a = list;
        this.f14027b = str;
        this.f14028c = uri;
        Objects.requireNonNull(yr0Var);
        this.f14029d = yr0Var;
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final void a(Throwable th) {
        String valueOf = String.valueOf(this.f14028c);
        int i7 = v2.n1.f26802b;
        w2.p.f("Failed to parse gmsg params for: ".concat(valueOf));
    }

    @Override // com.google.android.gms.internal.ads.m64
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = this.f14026a;
        String str = this.f14027b;
        this.f14029d.v((Map) obj, list, str);
    }
}
