package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
public abstract class xh3 {
    public static a5.d a(w4.i iVar, w4.a aVar) {
        final vh3 vh3Var = new vh3(iVar, null);
        iVar.b(g74.a(), new w4.e() { // from class: com.google.android.gms.internal.ads.wh3
            @Override // w4.e
            public final /* synthetic */ void a(w4.i iVar2) {
                vh3 vh3Var2 = vh3.this;
                if (iVar2.l()) {
                    vh3Var2.cancel(false);
                    return;
                }
                if (iVar2.n()) {
                    vh3Var2.l(iVar2.k());
                    return;
                }
                Exception j7 = iVar2.j();
                if (j7 == null) {
                    throw new IllegalStateException();
                }
                vh3Var2.m(j7);
            }
        });
        return vh3Var;
    }
}
