package u3;

import android.content.Context;
import com.google.android.gms.common.util.n;

/* compiled from: MyApplication */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static Context f26548a;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f26549b;

    public static synchronized boolean a(Context context) {
        boolean isInstantApp;
        Boolean bool;
        synchronized (b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f26548a;
            if (context2 != null && (bool = f26549b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f26549b = null;
            if (n.f()) {
                isInstantApp = applicationContext.getPackageManager().isInstantApp();
                f26549b = Boolean.valueOf(isInstantApp);
            } else {
                try {
                    context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                    f26549b = Boolean.TRUE;
                } catch (ClassNotFoundException unused) {
                    f26549b = Boolean.FALSE;
                }
            }
            f26548a = applicationContext;
            return f26549b.booleanValue();
        }
    }
}
