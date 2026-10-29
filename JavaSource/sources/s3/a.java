package s3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.n;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p3.o;
import p3.o1;
import u3.e;

/* compiled from: MyApplication */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f26279b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile a f26280c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f26281a = new ConcurrentHashMap();

    private a() {
    }

    public static a b() {
        if (f26280c == null) {
            synchronized (f26279b) {
                try {
                    if (f26280c == null) {
                        f26280c = new a();
                    }
                } finally {
                }
            }
        }
        a aVar = f26280c;
        o.m(aVar);
        return aVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, boolean z7, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((e.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i7, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f26281a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean h8 = h(context, intent, serviceConnection, i7, executor);
            if (h8) {
                return h8;
            }
            return false;
        } finally {
            this.f26281a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof o1);
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        boolean bindService;
        if (executor == null) {
            executor = null;
        }
        if (!n.h() || executor == null) {
            return context.bindService(intent, serviceConnection, i7);
        }
        bindService = context.bindService(intent, i7, executor, serviceConnection);
        return bindService;
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i7) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i7, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f26281a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f26281a.get(serviceConnection));
        } finally {
            this.f26281a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}
