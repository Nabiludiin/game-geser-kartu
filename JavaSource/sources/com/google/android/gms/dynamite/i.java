package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: MyApplication */
final class i implements DynamiteModule.b {
    i() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0078b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0078b c0078b = new DynamiteModule.b.C0078b();
        c0078b.f4593a = aVar.a(context, str);
        int i7 = 1;
        int b8 = aVar.b(context, str, true);
        c0078b.f4594b = b8;
        int i8 = c0078b.f4593a;
        if (i8 == 0) {
            i8 = 0;
            if (b8 == 0) {
                i7 = 0;
                c0078b.f4595c = i7;
                return c0078b;
            }
        }
        if (b8 < i8) {
            i7 = -1;
        }
        c0078b.f4595c = i7;
        return c0078b;
    }
}
