package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class fk2 implements yr2 {

    /* renamed from: a, reason: collision with root package name */
    private final z64 f8303a;

    /* renamed from: b, reason: collision with root package name */
    private final ev1 f8304b;

    /* renamed from: c, reason: collision with root package name */
    private final f02 f8305c;

    /* renamed from: d, reason: collision with root package name */
    private final hk2 f8306d;

    public fk2(z64 z64Var, ev1 ev1Var, f02 f02Var, hk2 hk2Var) {
        this.f8303a = z64Var;
        this.f8304b = ev1Var;
        this.f8305c = f02Var;
        this.f8306d = hk2Var;
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final a5.d a() {
        ly lyVar = uy.Gc;
        if (((Boolean) s2.b0.c().d(lyVar)).booleanValue()) {
            hk2 hk2Var = this.f8306d;
            if (hk2Var.d() != null) {
                gk2 d8 = hk2Var.d();
                d8.getClass();
                return p64.a(d8);
            }
        }
        if (iy3.c((String) s2.b0.c().d(uy.I1)) || (!((Boolean) s2.b0.c().d(lyVar)).booleanValue() && (this.f8306d.b() || !this.f8305c.e()))) {
            return p64.a(new gk2(new Bundle()));
        }
        this.f8306d.a(true);
        return this.f8303a.B0(new Callable() { // from class: com.google.android.gms.internal.ads.ek2
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return fk2.this.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.yr2
    public final int b() {
        return 1;
    }

    final /* synthetic */ gk2 c() {
        List<String> asList = Arrays.asList(((String) s2.b0.c().d(uy.I1)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : asList) {
            try {
                v13 a8 = this.f8304b.a(str, new JSONObject());
                a8.s();
                boolean e8 = this.f8305c.e();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) s2.b0.c().d(uy.Gc)).booleanValue() || e8) {
                    try {
                        wd0 c8 = a8.c();
                        if (c8 != null) {
                            bundle2.putString("sdk_version", c8.toString());
                        }
                    } catch (d13 unused) {
                    }
                }
                try {
                    wd0 b8 = a8.b();
                    if (b8 != null) {
                        bundle2.putString("adapter_version", b8.toString());
                    }
                } catch (d13 unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (d13 unused3) {
            }
        }
        gk2 gk2Var = new gk2(bundle);
        if (((Boolean) s2.b0.c().d(uy.Gc)).booleanValue()) {
            this.f8306d.c(gk2Var);
        }
        return gk2Var;
    }
}
