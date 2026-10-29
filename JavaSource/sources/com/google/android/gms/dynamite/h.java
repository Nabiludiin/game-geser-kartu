package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: MyApplication */
final class h implements DynamiteModule.b {
    h() {
    }

    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0078b a(Context context, String str, DynamiteModule.b.a aVar) {
        int b8;
        DynamiteModule.b.C0078b c0078b = new DynamiteModule.b.C0078b();
        int a8 = aVar.a(context, str);
        c0078b.f4593a = a8;
        int i7 = 1;
        int i8 = 0;
        if (a8 != 0) {
            b8 = aVar.b(context, str, false);
            c0078b.f4594b = b8;
        } else {
            b8 = aVar.b(context, str, true);
            c0078b.f4594b = b8;
        }
        int i9 = c0078b.f4593a;
        if (i9 != 0) {
            i8 = i9;
        } else if (b8 == 0) {
            i7 = 0;
            c0078b.f4595c = i7;
            return c0078b;
        }
        if (i8 >= b8) {
            i7 = -1;
        }
        c0078b.f4595c = i7;
        return c0078b;
    }
}
