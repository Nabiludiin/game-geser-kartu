package w4;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: MyApplication */
final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Object f27110a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private Queue f27111b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27112c;

    c0() {
    }

    public final void a(b0 b0Var) {
        synchronized (this.f27110a) {
            try {
                if (this.f27111b == null) {
                    this.f27111b = new ArrayDeque();
                }
                this.f27111b.add(b0Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(i iVar) {
        b0 b0Var;
        synchronized (this.f27110a) {
            if (this.f27111b != null && !this.f27112c) {
                this.f27112c = true;
                while (true) {
                    synchronized (this.f27110a) {
                        try {
                            b0Var = (b0) this.f27111b.poll();
                            if (b0Var == null) {
                                this.f27112c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    b0Var.b(iVar);
                }
            }
        }
    }
}
