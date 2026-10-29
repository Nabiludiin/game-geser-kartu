package n1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* compiled from: MyApplication */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f24939a;

    public f(WorkDatabase workDatabase) {
        this.f24939a = workDatabase;
    }

    public static void a(Context context, x0.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i7 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i8 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.x();
            try {
                bVar.Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i7)});
                bVar.Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i8)});
                sharedPreferences.edit().clear().apply();
                bVar.X();
            } finally {
                bVar.l0();
            }
        }
    }

    private int c(String str) {
        this.f24939a.c();
        try {
            Long a8 = this.f24939a.x().a(str);
            int i7 = 0;
            int intValue = a8 != null ? a8.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i7 = intValue + 1;
            }
            e(str, i7);
            this.f24939a.r();
            this.f24939a.g();
            return intValue;
        } catch (Throwable th) {
            this.f24939a.g();
            throw th;
        }
    }

    private void e(String str, int i7) {
        this.f24939a.x().b(new m1.d(str, i7));
    }

    public int b() {
        int c8;
        synchronized (f.class) {
            c8 = c("next_alarm_manager_id");
        }
        return c8;
    }

    public int d(int i7, int i8) {
        synchronized (f.class) {
            int c8 = c("next_job_scheduler_id");
            if (c8 >= i7 && c8 <= i8) {
                i7 = c8;
            }
            e("next_job_scheduler_id", i7 + 1);
        }
        return i7;
    }
}
