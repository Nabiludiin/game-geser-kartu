package com.nabil.utilities;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.MobileAds;
import java.util.concurrent.atomic.AtomicBoolean;
import x4.a;
import x4.b;
import x4.c;
import x4.d;

/* compiled from: MyApplication */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    static x4.c f4276a;

    /* renamed from: b, reason: collision with root package name */
    static AtomicBoolean f4277b = new AtomicBoolean(false);

    public static /* synthetic */ void c(Activity activity, x4.e eVar) {
        if (eVar != null) {
            Log.w("TAG", String.format("%s: %s", Integer.valueOf(eVar.a()), eVar.b()));
        }
        if (f4276a.b()) {
            d(activity);
        }
    }

    private static void d(Context context) {
        if (f4277b.getAndSet(true)) {
            return;
        }
        MobileAds.a(context);
    }

    public static void e(final Activity activity) {
        x4.d a8 = new d.a().b(new a.C0146a(activity).c(1).a("B3EEABB8EE11C2BE770B684D95219ECB").b()).c(false).a();
        x4.c a9 = x4.f.a(activity);
        f4276a = a9;
        a9.a(activity, a8, new c.b() { // from class: com.nabil.utilities.a
            @Override // x4.c.b
            public final void a() {
                x4.f.b(r0, new b.a() { // from class: com.nabil.utilities.c
                    @Override // x4.b.a
                    public final void a(x4.e eVar) {
                        d.c(r1, eVar);
                    }
                });
            }
        }, new c.a() { // from class: com.nabil.utilities.b
            @Override // x4.c.a
            public final void a(x4.e eVar) {
                Log.w("TAG", String.format("%s: %s", Integer.valueOf(eVar.a()), eVar.b()));
            }
        });
        if (f4276a.b()) {
            d(activity);
        }
    }
}
