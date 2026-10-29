package p3;

/* compiled from: MyApplication */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    private static p f25252b;

    /* renamed from: c, reason: collision with root package name */
    private static final q f25253c = new q(0, false, false, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private q f25254a;

    private p() {
    }

    public static synchronized p b() {
        p pVar;
        synchronized (p.class) {
            try {
                if (f25252b == null) {
                    f25252b = new p();
                }
                pVar = f25252b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    public q a() {
        return this.f25254a;
    }

    public final synchronized void c(q qVar) {
        if (qVar == null) {
            this.f25254a = f25253c;
            return;
        }
        q qVar2 = this.f25254a;
        if (qVar2 == null || qVar2.Q0() < qVar.Q0()) {
            this.f25254a = qVar;
        }
    }
}
