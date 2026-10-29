package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: MyApplication */
final class e implements DynamiteModule.b {
    e() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0078b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0078b c0078b = new DynamiteModule.b.C0078b();
        int a8 = aVar.a(context, str);
        c0078b.f4593a = a8;
        if (a8 != 0) {
            c0078b.f4595c = -1;
            return c0078b;
        }
        int b8 = aVar.b(context, str, true);
        c0078b.f4594b = b8;
        if (b8 != 0) {
            c0078b.f4595c = 1;
        }
        return c0078b;
    }
}
