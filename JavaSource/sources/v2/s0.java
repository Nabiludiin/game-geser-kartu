package v2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.ads.of3;

/* compiled from: MyApplication */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    private HandlerThread f26816a = null;

    /* renamed from: b, reason: collision with root package name */
    private Handler f26817b = null;

    /* renamed from: c, reason: collision with root package name */
    private int f26818c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f26819d = new Object();

    public final Looper a() {
        Looper looper;
        Object obj = this.f26819d;
        synchronized (obj) {
            try {
                if (this.f26818c != 0) {
                    p3.o.n(this.f26816a, "Invalid state: handlerThread should already been initialized.");
                } else if (this.f26816a == null) {
                    n1.k("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f26816a = handlerThread;
                    handlerThread.start();
                    this.f26817b = new of3(this.f26816a.getLooper());
                    n1.k("Looper thread started.");
                } else {
                    n1.k("Resuming the looper thread");
                    obj.notifyAll();
                }
                this.f26818c++;
                looper = this.f26816a.getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public final Handler b() {
        return this.f26817b;
    }
}
