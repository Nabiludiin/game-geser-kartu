package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: MyApplication */
final class jg implements ag {

    /* renamed from: a, reason: collision with root package name */
    private File f10534a = null;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f10535b;

    jg(Context context) {
        this.f10535b = context;
    }

    @Override // com.google.android.gms.internal.ads.ag
    public final File a() {
        if (this.f10534a == null) {
            this.f10534a = new File(this.f10535b.getCacheDir(), "volley");
        }
        return this.f10534a;
    }
}
