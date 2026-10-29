package androidx.core.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

/* compiled from: MyApplication */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f1633c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static Set f1634d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private static final Object f1635e = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Context f1636a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f1637b;

    /* compiled from: MyApplication */
    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }

        static int b(NotificationManager notificationManager) {
            return notificationManager.getImportance();
        }
    }

    private l(Context context) {
        this.f1636a = context;
        this.f1637b = (NotificationManager) context.getSystemService("notification");
    }

    public static l b(Context context) {
        return new l(context);
    }

    public boolean a() {
        if (Build.VERSION.SDK_INT >= 24) {
            return a.a(this.f1637b);
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f1636a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f1636a.getApplicationInfo();
        String packageName = this.f1636a.getApplicationContext().getPackageName();
        int i7 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            Class<?> cls2 = Integer.TYPE;
            Method method = cls.getMethod("checkOpNoThrow", cls2, cls2, String.class);
            Integer num = (Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class);
            num.intValue();
            return ((Integer) method.invoke(appOpsManager, num, Integer.valueOf(i7), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }
}
