package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import e1.e;
import e1.j;
import i1.c;
import i1.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import m1.p;

/* compiled from: MyApplication */
public class a implements c, f1.b {
    static final String A = j.f("SystemFgDispatcher");

    /* renamed from: q, reason: collision with root package name */
    private Context f3078q;

    /* renamed from: r, reason: collision with root package name */
    private f1.j f3079r;

    /* renamed from: s, reason: collision with root package name */
    private final o1.a f3080s;

    /* renamed from: t, reason: collision with root package name */
    final Object f3081t = new Object();

    /* renamed from: u, reason: collision with root package name */
    String f3082u;

    /* renamed from: v, reason: collision with root package name */
    final Map f3083v;

    /* renamed from: w, reason: collision with root package name */
    final Map f3084w;

    /* renamed from: x, reason: collision with root package name */
    final Set f3085x;

    /* renamed from: y, reason: collision with root package name */
    final d f3086y;

    /* renamed from: z, reason: collision with root package name */
    private b f3087z;

    /* compiled from: MyApplication */
    /* renamed from: androidx.work.impl.foreground.a$a, reason: collision with other inner class name */
    class RunnableC0055a implements Runnable {

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ WorkDatabase f3088q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f3089r;

        RunnableC0055a(WorkDatabase workDatabase, String str) {
            this.f3088q = workDatabase;
            this.f3089r = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p m7 = this.f3088q.B().m(this.f3089r);
            if (m7 == null || !m7.b()) {
                return;
            }
            synchronized (a.this.f3081t) {
                a.this.f3084w.put(this.f3089r, m7);
                a.this.f3085x.add(m7);
                a aVar = a.this;
                aVar.f3086y.d(aVar.f3085x);
            }
        }
    }

    /* compiled from: MyApplication */
    interface b {
        void b(int i7, int i8, Notification notification);

        void d(int i7, Notification notification);

        void e(int i7);

        void stop();
    }

    a(Context context) {
        this.f3078q = context;
        f1.j k7 = f1.j.k(context);
        this.f3079r = k7;
        o1.a p7 = k7.p();
        this.f3080s = p7;
        this.f3082u = null;
        this.f3083v = new LinkedHashMap();
        this.f3085x = new HashSet();
        this.f3084w = new HashMap();
        this.f3086y = new d(this.f3078q, p7, this);
        this.f3079r.m().d(this);
    }

    public static Intent a(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str, e eVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    private void g(Intent intent) {
        j.c().d(A, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f3079r.f(UUID.fromString(stringExtra));
    }

    private void h(Intent intent) {
        int i7 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        j.c().a(A, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.f3087z == null) {
            return;
        }
        this.f3083v.put(stringExtra, new e(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.f3082u)) {
            this.f3082u = stringExtra;
            this.f3087z.b(intExtra, intExtra2, notification);
            return;
        }
        this.f3087z.d(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.f3083v.entrySet().iterator();
        while (it.hasNext()) {
            i7 |= ((e) ((Map.Entry) it.next()).getValue()).a();
        }
        e eVar = (e) this.f3083v.get(this.f3082u);
        if (eVar != null) {
            this.f3087z.b(eVar.c(), i7, eVar.b());
        }
    }

    private void i(Intent intent) {
        j.c().d(A, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f3080s.b(new RunnableC0055a(this.f3079r.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    @Override // i1.c
    public void b(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            j.c().a(A, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f3079r.w(str);
        }
    }

    @Override // f1.b
    public void c(String str, boolean z7) {
        Map.Entry entry;
        synchronized (this.f3081t) {
            try {
                p pVar = (p) this.f3084w.remove(str);
                if (pVar != null ? this.f3085x.remove(pVar) : false) {
                    this.f3086y.d(this.f3085x);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar = (e) this.f3083v.remove(str);
        if (str.equals(this.f3082u) && this.f3083v.size() > 0) {
            Iterator it = this.f3083v.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.f3082u = (String) entry.getKey();
            if (this.f3087z != null) {
                e eVar2 = (e) entry.getValue();
                this.f3087z.b(eVar2.c(), eVar2.a(), eVar2.b());
                this.f3087z.e(eVar2.c());
            }
        }
        b bVar = this.f3087z;
        if (eVar == null || bVar == null) {
            return;
        }
        j.c().a(A, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(eVar.c()), str, Integer.valueOf(eVar.a())), new Throwable[0]);
        bVar.e(eVar.c());
    }

    void j(Intent intent) {
        j.c().d(A, "Stopping foreground service", new Throwable[0]);
        b bVar = this.f3087z;
        if (bVar != null) {
            bVar.stop();
        }
    }

    void k() {
        this.f3087z = null;
        synchronized (this.f3081t) {
            this.f3086y.e();
        }
        this.f3079r.m().i(this);
    }

    void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    void m(b bVar) {
        if (this.f3087z != null) {
            j.c().b(A, "A callback already exists.", new Throwable[0]);
        } else {
            this.f3087z = bVar;
        }
    }

    @Override // i1.c
    public void f(List list) {
    }
}
