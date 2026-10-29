package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class tw2 implements sx2 {

    /* renamed from: a, reason: collision with root package name */
    private c91 f16474a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f16475b = g74.a();

    @Override // com.google.android.gms.internal.ads.sx2
    public final /* bridge */ /* synthetic */ a5.d a(tx2 tx2Var, rx2 rx2Var, Object obj) {
        return c(tx2Var, rx2Var, null);
    }

    public final c91 b() {
        return this.f16474a;
    }

    public final a5.d c(tx2 tx2Var, rx2 rx2Var, c91 c91Var) {
        b91 a8 = rx2Var.a(tx2Var.f16482b);
        a8.s(new wx2(true));
        c91 c91Var2 = (c91) a8.g();
        this.f16474a = c91Var2;
        final w51 a9 = c91Var2.a();
        final w23 w23Var = new w23();
        h64 C = h64.C(a9.b());
        w54 w54Var = new w54(this) { // from class: com.google.android.gms.internal.ads.sw2
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                o03 o03Var = (o03) obj;
                w23Var.f17993b = o03Var;
                Iterator it = o03Var.f13137b.f12529a.iterator();
                boolean z7 = false;
                loop0: while (true) {
                    if (it.hasNext()) {
                        Iterator it2 = ((c03) it.next()).f6150a.iterator();
                        while (it2.hasNext()) {
                            if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                                break loop0;
                            }
                            z7 = true;
                        }
                    } else if (z7) {
                        return a9.c(p64.a(o03Var));
                    }
                }
                return p64.a(null);
            }
        };
        Executor executor = this.f16475b;
        return (h64) p64.k((h64) p64.j(C, w54Var, executor), new hx3() { // from class: com.google.android.gms.internal.ads.rw2
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                w23 w23Var2 = w23.this;
                w23Var2.f17994c = (r41) obj;
                return w23Var2;
            }
        }, executor);
    }

    @Override // com.google.android.gms.internal.ads.sx2
    public final /* synthetic */ Object h() {
        return this.f16474a;
    }
}
