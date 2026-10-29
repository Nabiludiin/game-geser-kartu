package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: MyApplication */
public abstract class by4 implements d15 {
    static {
        ez4 ez4Var = ez4.f7893c;
        int i7 = dy4.f7358a;
    }

    @Override // com.google.android.gms.internal.ads.d15
    public final /* synthetic */ Object b(InputStream inputStream, ez4 ez4Var) {
        uy4 d8 = uy4.d(inputStream, 4096);
        v05 v05Var = (v05) a(d8, ez4Var);
        d8.l(0);
        if (v05Var == null || v05Var.a()) {
            return v05Var;
        }
        throw (!(v05Var instanceof ay4) ? new x15(v05Var) : ((ay4) v05Var).i()).a();
    }
}
