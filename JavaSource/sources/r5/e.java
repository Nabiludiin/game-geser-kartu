package r5;

import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
class e {

    /* renamed from: d, reason: collision with root package name */
    private static final long f25891d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    private static final long f25892e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    private final com.google.firebase.installations.f f25893a = com.google.firebase.installations.f.c();

    /* renamed from: b, reason: collision with root package name */
    private long f25894b;

    /* renamed from: c, reason: collision with root package name */
    private int f25895c;

    e() {
    }

    private synchronized long a(int i7) {
        if (c(i7)) {
            return (long) Math.min(Math.pow(2.0d, this.f25895c) + this.f25893a.e(), f25892e);
        }
        return f25891d;
    }

    private static boolean c(int i7) {
        if (i7 != 429) {
            return i7 >= 500 && i7 < 600;
        }
        return true;
    }

    private static boolean d(int i7) {
        return (i7 >= 200 && i7 < 300) || i7 == 401 || i7 == 404;
    }

    private synchronized void e() {
        this.f25895c = 0;
    }

    public synchronized boolean b() {
        boolean z7;
        if (this.f25895c != 0) {
            z7 = this.f25893a.a() > this.f25894b;
        }
        return z7;
    }

    public synchronized void f(int i7) {
        if (d(i7)) {
            e();
            return;
        }
        this.f25895c++;
        this.f25894b = this.f25893a.a() + a(i7);
    }
}
