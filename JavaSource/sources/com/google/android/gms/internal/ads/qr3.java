package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
final class qr3 implements jr3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f14589a;

    /* renamed from: b, reason: collision with root package name */
    private final h85 f14590b;

    /* renamed from: c, reason: collision with root package name */
    private final as3 f14591c;

    /* renamed from: d, reason: collision with root package name */
    private final nu3 f14592d;

    /* renamed from: e, reason: collision with root package name */
    private final ExecutorService f14593e;

    /* renamed from: f, reason: collision with root package name */
    private final jq3 f14594f;

    /* renamed from: g, reason: collision with root package name */
    private final lc3 f14595g;

    qr3(Context context, h85 h85Var, as3 as3Var, nu3 nu3Var, ExecutorService executorService, jq3 jq3Var, lc3 lc3Var) {
        this.f14589a = context;
        this.f14590b = h85Var;
        this.f14591c = as3Var;
        this.f14592d = nu3Var;
        this.f14593e = executorService;
        this.f14594f = jq3Var;
        this.f14595g = lc3Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static tk3 f(int i7) {
        sk3 g02 = tk3.g0();
        g02.I(i7);
        return (tk3) g02.A();
    }

    @Override // com.google.android.gms.internal.ads.jr3
    public final a5.d a() {
        final h85 h85Var = this.f14590b;
        Objects.requireNonNull(h85Var);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.lr3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return h85.this.b();
            }
        };
        ExecutorService executorService = this.f14593e;
        h64 h64Var = (h64) p64.g((h64) p64.k((h64) p64.j((h64) p64.k(h64.C(p64.d(callable, executorService)), new hx3() { // from class: com.google.android.gms.internal.ads.pr3
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                qr3.this.b((mq) obj);
                return new Integer(0);
            }
        }, g74.a()), new w54() { // from class: com.google.android.gms.internal.ads.mr3
            @Override // com.google.android.gms.internal.ads.w54
            public final /* synthetic */ a5.d d(Object obj) {
                return qr3.this.c((Integer) obj);
            }
        }, g74.a()), new hx3() { // from class: com.google.android.gms.internal.ads.nr3
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return qr3.this.d((xk3) obj);
            }
        }, executorService), kr3.class, or3.f13461a, g74.a());
        this.f14592d.e(15202, h64Var);
        return h64Var;
    }

    final /* synthetic */ int b(mq mqVar) {
        if (jd3.a(mqVar)) {
            return 0;
        }
        this.f14592d.c(15204, mqVar.name());
        throw new kr3(null);
    }

    final /* synthetic */ a5.d c(Integer num) {
        return this.f14591c.a();
    }

    final /* synthetic */ tk3 d(xk3 xk3Var) {
        String d02 = xk3Var.d0().d0();
        String e02 = xk3Var.d0().e0();
        lu3 a8 = this.f14592d.a(15203);
        try {
            a8.a();
            be3 a9 = vc3.a(this.f14589a, 1, (mq) this.f14590b.b(), d02, e02, "1", this.f14595g);
            a8.c();
            int i7 = 2;
            if (a9.f5736s == 2) {
                this.f14592d.b(15208);
                return f(4);
            }
            byte[] bArr = a9.f5735r;
            if (bArr == null || bArr.length == 0) {
                this.f14592d.b(5010);
                return f(8);
            }
            try {
                oq h02 = oq.h0(bArr, ez4.b());
                if (h02.d0().d0().isEmpty() || h02.d0().e0().isEmpty() || h02.f0().w().length == 0) {
                    this.f14592d.b(15207);
                } else {
                    if (xk3Var.equals(xk3.h0()) || !TextUtils.equals(xk3Var.d0().d0(), h02.d0().d0()) || !TextUtils.equals(xk3Var.d0().e0(), h02.d0().e0())) {
                        int i8 = a9.f5736s;
                        if (i8 == 4) {
                            if (!this.f14594f.a(h02.e0().w())) {
                                this.f14592d.b(15206);
                                return f(12);
                            }
                            i8 = 4;
                        }
                        sk3 g02 = tk3.g0();
                        if (i8 == 2) {
                            i7 = 4;
                        } else if (i8 != 3) {
                            i7 = i8 != 4 ? i8 != 6 ? 1 : 5 : 3;
                        }
                        g02.I(i7);
                        uk3 g03 = xk3.g0();
                        g03.E(h02.d0());
                        g03.G((mq) this.f14590b.b());
                        g02.E((xk3) g03.A());
                        g02.H(h02.e0());
                        g02.G(h02.f0());
                        return (tk3) g02.A();
                    }
                    this.f14592d.b(15209);
                }
                return f(11);
            } catch (e05 e8) {
                this.f14592d.d(15205, e8);
                return f(9);
            } catch (NullPointerException unused) {
                this.f14592d.b(15210);
                return f(10);
            }
        } catch (Throwable th) {
            try {
                a8.b(th);
                throw th;
            } catch (Throwable th2) {
                a8.c();
                throw th2;
            }
        }
    }
}
