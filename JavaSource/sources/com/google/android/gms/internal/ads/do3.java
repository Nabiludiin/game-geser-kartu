package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: MyApplication */
final class do3 extends io3 {

    /* renamed from: f, reason: collision with root package name */
    private final Context f7190f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f7191g;

    do3(ak akVar, dn3 dn3Var, Map map, Context context, nu3 nu3Var) {
        super("yl2V2fIFd/+gtM2i3wtw7rRydnC7INCVtpRFdnYEC9BkEYS1KI4o6evRDqm9gjRN", "/ngo8an629JW3IpM1KyGjEthGKpic0JTOThCbrYq6ZE=", akVar, dn3Var, nu3Var.a(120));
        this.f7190f = context;
        this.f7191g = map;
    }

    @Override // com.google.android.gms.internal.ads.io3
    protected final void a(Method method, ak akVar) {
        Long l7 = -1L;
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                Long l8 = (Long) method.invoke("", this.f7190f);
                if (l8 == null) {
                    throw null;
                }
                l7 = l8;
            } else {
                a5.d dVar = (a5.d) this.f7191g.get("gs");
                if (dVar != null && dVar.isDone()) {
                    l7 = Long.valueOf(((xk) dVar.get()).c1());
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        synchronized (akVar) {
            akVar.V(l7.longValue());
        }
    }
}
