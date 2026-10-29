package com.android.billingclient.api;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: MyApplication */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.gms.internal.play_billing.j0 f3971a;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private com.google.android.gms.internal.play_billing.j0 f3972a;

        /* synthetic */ a(p1.z zVar) {
        }

        public g a() {
            if (this.f3972a != null) {
                return new g(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public a b(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!"play_pass_subs".equals(bVar.c())) {
                    hashSet.add(bVar.c());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f3972a = com.google.android.gms.internal.play_billing.j0.m(list);
            return this;
        }
    }

    /* compiled from: MyApplication */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f3973a;

        /* renamed from: b, reason: collision with root package name */
        private final String f3974b;

        /* compiled from: MyApplication */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private String f3975a;

            /* renamed from: b, reason: collision with root package name */
            private String f3976b;

            /* synthetic */ a(p1.z zVar) {
            }

            public b a() {
                if ("first_party".equals(this.f3976b)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f3975a == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.f3976b != null) {
                    return new b(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            public a b(String str) {
                this.f3975a = str;
                return this;
            }

            public a c(String str) {
                this.f3976b = str;
                return this;
            }
        }

        /* synthetic */ b(a aVar, p1.z zVar) {
            this.f3973a = aVar.f3975a;
            this.f3974b = aVar.f3976b;
        }

        public static a a() {
            return new a(null);
        }

        public final String b() {
            return this.f3973a;
        }

        public final String c() {
            return this.f3974b;
        }
    }

    /* synthetic */ g(a aVar, p1.z zVar) {
        this.f3971a = aVar.f3972a;
    }

    public static a a() {
        return new a(null);
    }

    public final com.google.android.gms.internal.play_billing.j0 b() {
        return this.f3971a;
    }

    public final String c() {
        return ((b) this.f3971a.get(0)).c();
    }
}
