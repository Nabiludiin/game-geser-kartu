package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.e;
import e1.j;
import java.util.HashMap;
import java.util.Map;
import m1.p;

/* compiled from: MyApplication */
public class b implements f1.b {

    /* renamed from: t, reason: collision with root package name */
    private static final String f3025t = j.f("CommandHandler");

    /* renamed from: q, reason: collision with root package name */
    private final Context f3026q;

    /* renamed from: r, reason: collision with root package name */
    private final Map f3027r = new HashMap();

    /* renamed from: s, reason: collision with root package name */
    private final Object f3028s = new Object();

    b(Context context) {
        this.f3026q = context;
    }

    static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent d(Context context, String str, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z7);
        return intent;
    }

    static Intent e(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    static Intent f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    private void g(Intent intent, int i7, e eVar) {
        j.c().a(f3025t, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new c(this.f3026q, i7, eVar).a();
    }

    private void h(Intent intent, int i7, e eVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f3028s) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                j c8 = j.c();
                String str = f3025t;
                c8.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.f3027r.containsKey(string)) {
                    j.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    d dVar = new d(this.f3026q, i7, string, eVar);
                    this.f3027r.put(string, dVar);
                    dVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void i(Intent intent, int i7) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z7 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        j.c().a(f3025t, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i7)), new Throwable[0]);
        c(string, z7);
    }

    private void j(Intent intent, int i7, e eVar) {
        j.c().a(f3025t, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i7)), new Throwable[0]);
        eVar.g().s();
    }

    private void k(Intent intent, int i7, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        j c8 = j.c();
        String str = f3025t;
        c8.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase o7 = eVar.g().o();
        o7.c();
        try {
            p m7 = o7.B().m(string);
            if (m7 == null) {
                j.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (m7.f24710b.c()) {
                j.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long a8 = m7.a();
            if (m7.b()) {
                j.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a8)), new Throwable[0]);
                a.c(this.f3026q, eVar.g(), string, a8);
                eVar.k(new e.b(eVar, a(this.f3026q), i7));
            } else {
                j.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a8)), new Throwable[0]);
                a.c(this.f3026q, eVar.g(), string, a8);
            }
            o7.r();
        } finally {
            o7.g();
        }
    }

    private void l(Intent intent, e eVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        j.c().a(f3025t, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        eVar.g().x(string);
        a.a(this.f3026q, eVar.g(), string);
        eVar.c(string, false);
    }

    private static boolean m(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // f1.b
    public void c(String str, boolean z7) {
        synchronized (this.f3028s) {
            try {
                f1.b bVar = (f1.b) this.f3027r.remove(str);
                if (bVar != null) {
                    bVar.c(str, z7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean n() {
        boolean z7;
        synchronized (this.f3028s) {
            z7 = !this.f3027r.isEmpty();
        }
        return z7;
    }

    void o(Intent intent, int i7, e eVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            g(intent, i7, eVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            j(intent, i7, eVar);
            return;
        }
        if (!m(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            j.c().b(f3025t, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            k(intent, i7, eVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            h(intent, i7, eVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            l(intent, eVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            i(intent, i7);
        } else {
            j.c().h(f3025t, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
