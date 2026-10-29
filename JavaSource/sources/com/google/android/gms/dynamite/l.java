package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: MyApplication */
final class l implements DynamiteModule.b.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f4597a;

    public l(int i7, int i8) {
        this.f4597a = i7;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int a(Context context, String str) {
        return this.f4597a;
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b.a
    public final int b(Context context, String str, boolean z7) {
        return 0;
    }
}
