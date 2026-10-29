package androidx.core.os;

import android.os.CancellationSignal;

/* compiled from: MyApplication */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private boolean f1749a;

    /* renamed from: b, reason: collision with root package name */
    private b f1750b;

    /* renamed from: c, reason: collision with root package name */
    private Object f1751c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1752d;

    /* compiled from: MyApplication */
    static class a {
        static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* compiled from: MyApplication */
    public interface b {
        void onCancel();
    }

    private void d() {
        while (this.f1752d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f1749a) {
                    return;
                }
                this.f1749a = true;
                this.f1752d = true;
                b bVar = this.f1750b;
                Object obj = this.f1751c;
                if (bVar != null) {
                    try {
                        bVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f1752d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    a.a(obj);
                }
                synchronized (this) {
                    this.f1752d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public boolean b() {
        boolean z7;
        synchronized (this) {
            z7 = this.f1749a;
        }
        return z7;
    }

    public void c(b bVar) {
        synchronized (this) {
            try {
                d();
                if (this.f1750b == bVar) {
                    return;
                }
                this.f1750b = bVar;
                if (this.f1749a && bVar != null) {
                    bVar.onCancel();
                }
            } finally {
            }
        }
    }
}
