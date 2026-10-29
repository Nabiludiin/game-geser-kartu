package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: MyApplication */
final class f implements DynamiteModule.b {
    f() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0078b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0078b c0078b = new DynamiteModule.b.C0078b();
        int b8 = aVar.b(context, str, false);
        c0078b.f4594b = b8;
        c0078b.f4595c = b8 != 0 ? 1 : 0;
        return c0078b;
    }
}
