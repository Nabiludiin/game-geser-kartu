package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import e1.j;
import m1.g;
import m1.h;
import n1.f;

/* compiled from: MyApplication */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f3024a = j.f("Alarms");

    public static void a(Context context, f1.j jVar, String str) {
        h y7 = jVar.o().y();
        g b8 = y7.b(str);
        if (b8 != null) {
            b(context, str, b8.f24687b);
            j.c().a(f3024a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            y7.c(str);
        }
    }

    private static void b(Context context, String str, int i7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i7, b.b(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        j.c().a(f3024a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i7)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, f1.j jVar, String str, long j7) {
        WorkDatabase o7 = jVar.o();
        h y7 = o7.y();
        g b8 = y7.b(str);
        if (b8 != null) {
            b(context, str, b8.f24687b);
            d(context, str, b8.f24687b, j7);
        } else {
            int b9 = new f(o7).b();
            y7.d(new g(str, b9));
            d(context, str, b9, j7);
        }
    }

    private static void d(Context context, String str, int i7, long j7) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i7, b.b(context, str), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j7, service);
        }
    }
}
