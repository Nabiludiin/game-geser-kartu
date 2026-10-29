package n1;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: MyApplication */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24956a = e1.j.f("WakeLocks");

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f24957b = new WeakHashMap();

    public static void a() {
        HashMap hashMap = new HashMap();
        WeakHashMap weakHashMap = f24957b;
        synchronized (weakHashMap) {
            hashMap.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                e1.j.c().h(f24956a, String.format("WakeLock held for %s", hashMap.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap weakHashMap = f24957b;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, str2);
        }
        return newWakeLock;
    }
}
