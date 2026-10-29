package k2;

import android.os.RemoteException;
import s2.b3;
import s2.s4;

/* compiled from: MyApplication */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Object f24447a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private b3 f24448b;

    /* renamed from: c, reason: collision with root package name */
    private a f24449c;

    public void a(a aVar) {
        s4 s4Var;
        synchronized (this.f24447a) {
            this.f24449c = aVar;
            b3 b3Var = this.f24448b;
            if (b3Var == null) {
                return;
            }
            if (aVar == null) {
                s4Var = null;
            } else {
                try {
                    s4Var = new s4(aVar);
                } catch (RemoteException e8) {
                    w2.p.d("Unable to call setVideoLifecycleCallbacks on video controller.", e8);
                }
            }
            b3Var.r5(s4Var);
        }
    }

    public final void b(b3 b3Var) {
        synchronized (this.f24447a) {
            try {
                this.f24448b = b3Var;
                a aVar = this.f24449c;
                if (aVar != null) {
                    a(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b3 c() {
        b3 b3Var;
        synchronized (this.f24447a) {
            b3Var = this.f24448b;
        }
        return b3Var;
    }

    /* compiled from: MyApplication */
    public static abstract class a {
        public abstract void a();

        public abstract void c();

        public abstract void e();

        public void d() {
        }

        public void b(boolean z7) {
        }
    }
}
