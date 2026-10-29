package p3;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f25197a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static int f25198b = 9;

    /* renamed from: c, reason: collision with root package name */
    private static n1 f25199c = null;

    /* renamed from: d, reason: collision with root package name */
    static HandlerThread f25200d = null;

    /* renamed from: e, reason: collision with root package name */
    private static Executor f25201e = null;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f25202f = false;

    public static h a(Context context) {
        synchronized (f25197a) {
            try {
                if (f25199c == null) {
                    f25199c = new n1(context.getApplicationContext(), f25202f ? b().getLooper() : context.getMainLooper(), f25201e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f25199c;
    }

    public static HandlerThread b() {
        synchronized (f25197a) {
            try {
                HandlerThread handlerThread = f25200d;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", f25198b);
                f25200d = handlerThread2;
                handlerThread2.start();
                return f25200d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected abstract k3.b c(j1 j1Var, ServiceConnection serviceConnection, String str, Executor executor);

    protected abstract void d(j1 j1Var, ServiceConnection serviceConnection, String str);

    public final void e(String str, String str2, int i7, ServiceConnection serviceConnection, String str3, boolean z7) {
        d(new j1(str, str2, 4225, z7), serviceConnection, str3);
    }
}
