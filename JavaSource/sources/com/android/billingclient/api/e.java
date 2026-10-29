package com.android.billingclient.api;

/* compiled from: MyApplication */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f3912a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f3913b;

    /* compiled from: MyApplication */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f3914a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f3915b;

        private a() {
        }

        public e a() {
            if (!this.f3914a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new e(true, this.f3915b);
        }

        public a b() {
            this.f3914a = true;
            return this;
        }
    }

    private e(boolean z7, boolean z8) {
        this.f3912a = z7;
        this.f3913b = z8;
    }

    public static a c() {
        return new a();
    }

    boolean a() {
        return this.f3912a;
    }

    boolean b() {
        return this.f3913b;
    }
}
