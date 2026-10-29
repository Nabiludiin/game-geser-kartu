package v2;

/* compiled from: MyApplication */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    private long f26875a;

    /* renamed from: b, reason: collision with root package name */
    private long f26876b = Long.MIN_VALUE;

    /* renamed from: c, reason: collision with root package name */
    private final Object f26877c = new Object();

    public w0(long j7) {
        this.f26875a = j7;
    }

    public final boolean a() {
        synchronized (this.f26877c) {
            try {
                long b8 = r2.t.o().b();
                if (this.f26876b + this.f26875a > b8) {
                    return false;
                }
                this.f26876b = b8;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(long j7) {
        synchronized (this.f26877c) {
            this.f26875a = j7;
        }
    }
}
