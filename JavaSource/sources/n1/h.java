package n1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* compiled from: MyApplication */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final WorkDatabase f24941a;

    public h(WorkDatabase workDatabase) {
        this.f24941a = workDatabase;
    }

    public static void b(Context context, x0.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j7 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j8 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            bVar.x();
            try {
                bVar.Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j7)});
                bVar.Y("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j8)});
                sharedPreferences.edit().clear().apply();
                bVar.X();
            } finally {
                bVar.l0();
            }
        }
    }

    public boolean a() {
        Long a8 = this.f24941a.x().a("reschedule_needed");
        return a8 != null && a8.longValue() == 1;
    }

    public void c(boolean z7) {
        this.f24941a.x().b(new m1.d("reschedule_needed", z7));
    }
}
