package e7;

import x6.k0;

/* compiled from: MyApplication */
public final class k extends h {

    /* renamed from: s, reason: collision with root package name */
    public final Runnable f23293s;

    public k(Runnable runnable, long j7, i iVar) {
        super(j7, iVar);
        this.f23293s = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f23293s.run();
        } finally {
            this.f23291r.a();
        }
    }

    public String toString() {
        return "Task[" + k0.a(this.f23293s) + '@' + k0.b(this.f23293s) + ", " + this.f23290q + ", " + this.f23291r + ']';
    }
}
