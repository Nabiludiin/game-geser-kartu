package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;

/* compiled from: MyApplication */
public abstract class a {

    /* compiled from: MyApplication */
    /* renamed from: com.android.billingclient.api.a$a, reason: collision with other inner class name */
    public static final class C0071a {

        /* renamed from: a, reason: collision with root package name */
        private volatile e f3841a;

        /* renamed from: b, reason: collision with root package name */
        private final Context f3842b;

        /* renamed from: c, reason: collision with root package name */
        private volatile p1.i f3843c;

        /* renamed from: d, reason: collision with root package name */
        private volatile boolean f3844d;

        /* renamed from: e, reason: collision with root package name */
        private volatile boolean f3845e;

        /* renamed from: f, reason: collision with root package name */
        volatile boolean f3846f;

        /* synthetic */ C0071a(Context context, p1.d0 d0Var) {
            this.f3842b = context;
        }

        private final boolean e() {
            try {
                Context context = this.f3842b;
                return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
            } catch (Exception e8) {
                com.google.android.gms.internal.play_billing.q0.m("BillingClient", "Unable to retrieve metadata value for enableBillingOverridesTesting.", e8);
                return false;
            }
        }

        public a a() {
            Context context = this.f3842b;
            if (context == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            }
            if (this.f3843c == null) {
                if (this.f3844d || this.f3845e) {
                    return e() ? new k0(null, context, null, null, this) : new b(null, context, null, null, this);
                }
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }
            if (this.f3841a == null || !this.f3841a.a()) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            if (this.f3843c == null) {
                e eVar = this.f3841a;
                return e() ? new k0(null, eVar, context, null, null, null, this) : new b(null, eVar, context, null, null, null, this);
            }
            e eVar2 = this.f3841a;
            p1.i iVar = this.f3843c;
            return e() ? new k0(null, eVar2, context, iVar, null, null, null, this) : new b(null, eVar2, context, iVar, null, null, null, this);
        }

        public C0071a b() {
            this.f3846f = true;
            return this;
        }

        public C0071a c(e eVar) {
            this.f3841a = eVar;
            return this;
        }

        public C0071a d(p1.i iVar) {
            this.f3843c = iVar;
            return this;
        }
    }

    public static C0071a e(Context context) {
        return new C0071a(context, null);
    }

    public abstract void a(p1.a aVar, p1.b bVar);

    public abstract void b(p1.e eVar, p1.f fVar);

    public abstract void c();

    public abstract d d(Activity activity, c cVar);

    public abstract void f(g gVar, p1.g gVar2);

    public abstract void g(p1.j jVar, p1.h hVar);

    public abstract void h(p1.d dVar);
}
