package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: MyApplication */
public final class oo2 implements wr2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f13424a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13425b;

    public oo2(String str, boolean z7) {
        this.f13424a = str;
        this.f13425b = z7;
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((x81) obj).f18665b.putString("gct", this.f13424a);
    }

    @Override // com.google.android.gms.internal.ads.wr2
    public final /* bridge */ /* synthetic */ void d(Object obj) {
        Bundle bundle = ((x81) obj).f18664a;
        bundle.putString("gct", this.f13424a);
        if (this.f13425b) {
            bundle.putString("de", "1");
        }
    }
}
