package com.google.android.gms.internal.play_billing;

/* compiled from: MyApplication */
final class c1 {

    /* renamed from: b, reason: collision with root package name */
    static final c1 f21490b = new c1(new a("Failure occurred while trying to finish a future."));

    /* renamed from: c, reason: collision with root package name */
    static final c1 f21491c = new c1(new b("Failure.exception is unexpectedly null."));

    /* renamed from: a, reason: collision with root package name */
    final Throwable f21492a;

    c1(Throwable th) {
        th.getClass();
        this.f21492a = th;
    }

    /* compiled from: MyApplication */
    class a extends Throwable {
        a(String str) {
            super("Failure occurred while trying to finish a future.");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: MyApplication */
    class b extends Throwable {
        b(String str) {
            super("Failure.exception is unexpectedly null.");
        }

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }
}
