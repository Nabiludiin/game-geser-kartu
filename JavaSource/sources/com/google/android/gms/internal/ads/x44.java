package com.google.android.gms.internal.ads;

/* compiled from: MyApplication */
final class x44 {

    /* renamed from: b, reason: collision with root package name */
    static final x44 f18537b = new x44(new a("Failure occurred while trying to finish a future."));

    /* renamed from: a, reason: collision with root package name */
    final Throwable f18538a;

    x44(Throwable th) {
        th.getClass();
        this.f18538a = th;
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
}
