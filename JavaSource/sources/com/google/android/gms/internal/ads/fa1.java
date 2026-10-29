package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: MyApplication */
public final class fa1 extends eg1 implements aa1 {
    public fa1(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.aa1
    public final void b1(final s2.x2 x2Var) {
        K0(new dg1() { // from class: com.google.android.gms.internal.ads.ea1
            @Override // com.google.android.gms.internal.ads.dg1
            public final /* synthetic */ void d(Object obj) {
                ((na1) obj).q(s2.x2.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.aa1
    public final void c() {
        K0(da1.f7012a);
    }

    @Override // com.google.android.gms.internal.ads.aa1
    public final void c1(final hl1 hl1Var) {
        K0(new dg1() { // from class: com.google.android.gms.internal.ads.ca1
            @Override // com.google.android.gms.internal.ads.dg1
            public final /* synthetic */ void d(Object obj) {
                na1 na1Var = (na1) obj;
                String message = hl1.this.getMessage();
                if (message == null) {
                    message = "Internal show error.";
                }
                na1Var.q(z13.d(12, message, null));
            }
        });
    }
}
