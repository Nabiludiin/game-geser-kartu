package com.android.billingclient.api;

import android.text.TextUtils;
import com.android.billingclient.api.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3877a;

    /* renamed from: b, reason: collision with root package name */
    private String f3878b;

    /* renamed from: c, reason: collision with root package name */
    private String f3879c;

    /* renamed from: d, reason: collision with root package name */
    private C0072c f3880d;

    /* renamed from: e, reason: collision with root package name */
    private com.google.android.gms.internal.play_billing.j0 f3881e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList f3882f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f3883g;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f3884a;

        /* renamed from: b, reason: collision with root package name */
        private String f3885b;

        /* renamed from: c, reason: collision with root package name */
        private List f3886c;

        /* renamed from: d, reason: collision with root package name */
        private ArrayList f3887d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3888e;

        /* renamed from: f, reason: collision with root package name */
        private C0072c.a f3889f;

        /* synthetic */ a(p1.s sVar) {
            C0072c.a a8 = C0072c.a();
            C0072c.a.b(a8);
            this.f3889f = a8;
        }

        public c a() {
            ArrayList arrayList = this.f3887d;
            boolean z7 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            List list = this.f3886c;
            boolean z8 = (list == null || list.isEmpty()) ? false : true;
            if (!z7 && !z8) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            }
            if (z7 && z8) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            }
            p1.s sVar = null;
            if (!z7) {
                List list2 = this.f3886c;
                if (list2 != null) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((b) it.next()) == null) {
                            throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                        }
                    }
                }
            } else {
                if (this.f3887d.contains(null)) {
                    throw new IllegalArgumentException("SKU cannot be null.");
                }
                if (this.f3887d.size() > 1) {
                    android.support.v4.media.session.b.a(this.f3887d.get(0));
                    throw null;
                }
            }
            c cVar = new c(sVar);
            if (z7) {
                android.support.v4.media.session.b.a(this.f3887d.get(0));
                throw null;
            }
            cVar.f3877a = z8 && !((b) this.f3886c.get(0)).b().f().isEmpty();
            cVar.f3878b = this.f3884a;
            cVar.f3879c = this.f3885b;
            cVar.f3880d = this.f3889f.a();
            ArrayList arrayList2 = this.f3887d;
            cVar.f3882f = arrayList2 != null ? new ArrayList(arrayList2) : new ArrayList();
            cVar.f3883g = this.f3888e;
            List list3 = this.f3886c;
            cVar.f3881e = list3 != null ? com.google.android.gms.internal.play_billing.j0.m(list3) : com.google.android.gms.internal.play_billing.j0.n();
            return cVar;
        }

        public a b(List list) {
            this.f3886c = new ArrayList(list);
            return this;
        }
    }

    /* compiled from: MyApplication */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final f f3890a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3891b;

        /* compiled from: MyApplication */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private f f3892a;

            /* renamed from: b, reason: collision with root package name */
            private String f3893b;

            /* synthetic */ a(p1.s sVar) {
            }

            public b a() {
                com.google.android.gms.internal.play_billing.w.c(this.f3892a, "ProductDetails is required for constructing ProductDetailsParams.");
                return new b(this, null);
            }

            public a b(f fVar) {
                this.f3892a = fVar;
                if (fVar.a() != null) {
                    fVar.a().getClass();
                    f.b a8 = fVar.a();
                    if (a8.a() != null) {
                        this.f3893b = a8.a();
                    }
                }
                return this;
            }
        }

        /* synthetic */ b(a aVar, p1.s sVar) {
            this.f3890a = aVar.f3892a;
            this.f3891b = aVar.f3893b;
        }

        public static a a() {
            return new a(null);
        }

        public final f b() {
            return this.f3890a;
        }

        public final String c() {
            return this.f3891b;
        }
    }

    /* compiled from: MyApplication */
    /* renamed from: com.android.billingclient.api.c$c, reason: collision with other inner class name */
    public static class C0072c {

        /* renamed from: a, reason: collision with root package name */
        private String f3894a;

        /* renamed from: b, reason: collision with root package name */
        private String f3895b;

        /* renamed from: c, reason: collision with root package name */
        private int f3896c = 0;

        /* compiled from: MyApplication */
        /* renamed from: com.android.billingclient.api.c$c$a */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f3897a;

            /* renamed from: b, reason: collision with root package name */
            private String f3898b;

            /* renamed from: c, reason: collision with root package name */
            private boolean f3899c;

            /* renamed from: d, reason: collision with root package name */
            private int f3900d = 0;

            /* synthetic */ a(p1.s sVar) {
            }

            static /* synthetic */ a b(a aVar) {
                aVar.f3899c = true;
                return aVar;
            }

            public C0072c a() {
                boolean z7 = true;
                p1.s sVar = null;
                if (TextUtils.isEmpty(this.f3897a) && TextUtils.isEmpty(null)) {
                    z7 = false;
                }
                boolean isEmpty = TextUtils.isEmpty(this.f3898b);
                if (z7 && !isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                }
                if (!this.f3899c && !z7 && isEmpty) {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
                C0072c c0072c = new C0072c(sVar);
                c0072c.f3894a = this.f3897a;
                c0072c.f3896c = this.f3900d;
                c0072c.f3895b = this.f3898b;
                return c0072c;
            }
        }

        /* synthetic */ C0072c(p1.s sVar) {
        }

        public static a a() {
            return new a(null);
        }

        final int b() {
            return this.f3896c;
        }

        final String c() {
            return this.f3894a;
        }

        final String d() {
            return this.f3895b;
        }
    }

    /* synthetic */ c(p1.s sVar) {
    }

    public static a a() {
        return new a(null);
    }

    public int b() {
        return 0;
    }

    public final int c() {
        return this.f3880d.b();
    }

    public long d() {
        return 0L;
    }

    final d e() {
        f.b bVar;
        if (this.f3881e.isEmpty()) {
            return n0.f4016i;
        }
        b bVar2 = (b) this.f3881e.get(0);
        for (int i7 = 1; i7 < this.f3881e.size(); i7++) {
            b bVar3 = (b) this.f3881e.get(i7);
            if (!bVar3.b().d().equals(bVar2.b().d()) && !bVar3.b().d().equals("play_pass_subs")) {
                return n0.a(5, "All products should have same ProductType.");
            }
        }
        String f8 = bVar2.b().f();
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        com.google.android.gms.internal.play_billing.j0 j0Var = this.f3881e;
        int size = j0Var.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar4 = (b) j0Var.get(i8);
            if (bVar4.b().e() != null && bVar4.c() == null) {
                return n0.a(5, String.format("offerToken is required for constructing ProductDetailsParams for subscriptions. Missing value for product id: %s", bVar4.b().c()));
            }
            if (hashMap.containsKey(bVar4.b().c())) {
                return n0.a(5, String.format("ProductId can not be duplicated. Invalid product id: %s.", bVar4.b().c()));
            }
            hashMap.put(bVar4.b().c(), bVar4);
            if (!bVar2.b().d().equals("play_pass_subs") && !bVar4.b().d().equals("play_pass_subs") && !f8.equals(bVar4.b().f())) {
                return n0.a(5, "All products must have the same package name.");
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashMap.containsKey(str)) {
                return n0.a(5, String.format("OldProductId must not be one of the products to be purchased. Invalid old product id: %s.", str));
            }
        }
        List b8 = bVar2.b().b();
        String c8 = bVar2.c();
        if (c8 != null && b8 != null) {
            Iterator it2 = b8.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    bVar = null;
                    break;
                }
                bVar = (f.b) it2.next();
                if (c8.equals(bVar.a())) {
                    break;
                }
            }
            if (bVar != null && bVar.b() != null) {
                return n0.a(5, "Both autoPayDetails and autoPayBalanceThreshold is required for constructing ProductDetailsParams for autopay.");
            }
        }
        return n0.f4016i;
    }

    public final String f() {
        return this.f3878b;
    }

    public final String g() {
        return this.f3879c;
    }

    public String h() {
        return null;
    }

    public final String i() {
        return this.f3880d.c();
    }

    public final String j() {
        return this.f3880d.d();
    }

    public final ArrayList k() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f3882f);
        return arrayList;
    }

    public final List l() {
        return this.f3881e;
    }

    public final boolean t() {
        return this.f3883g;
    }

    final boolean u() {
        if (this.f3878b != null || this.f3879c != null || this.f3880d.d() != null || this.f3880d.b() != 0 || this.f3877a || this.f3883g) {
            return true;
        }
        com.google.android.gms.internal.play_billing.j0 j0Var = this.f3881e;
        if (j0Var != null) {
            int size = j0Var.size();
            for (int i7 = 0; i7 < size; i7++) {
            }
        }
        return false;
    }
}
