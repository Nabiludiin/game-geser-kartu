package com.android.billingclient.api;

/* compiled from: MyApplication */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private int f3904a;

    /* renamed from: b, reason: collision with root package name */
    private int f3905b;

    /* renamed from: c, reason: collision with root package name */
    private String f3906c;

    /* compiled from: MyApplication */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f3907a;

        /* renamed from: b, reason: collision with root package name */
        private int f3908b = 0;

        /* renamed from: c, reason: collision with root package name */
        private String f3909c = "";

        /* synthetic */ a(p1.t tVar) {
        }

        public d a() {
            d dVar = new d();
            dVar.f3904a = this.f3907a;
            dVar.f3905b = this.f3908b;
            dVar.f3906c = this.f3909c;
            return dVar;
        }

        public a b(String str) {
            this.f3909c = str;
            return this;
        }

        public a c(int i7) {
            this.f3908b = i7;
            return this;
        }

        public a d(int i7) {
            this.f3907a = i7;
            return this;
        }
    }

    public static a d() {
        return new a(null);
    }

    public String a() {
        return this.f3906c;
    }

    public int b() {
        return this.f3905b;
    }

    public int c() {
        return this.f3904a;
    }

    public String toString() {
        return "Response Code: " + com.google.android.gms.internal.play_billing.q0.i(this.f3904a) + ", Debug Message: " + this.f3906c;
    }
}
