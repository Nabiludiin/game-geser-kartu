package h1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import e1.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import m1.p;
import m1.q;

/* compiled from: MyApplication */
public class l implements f1.e {

    /* renamed from: u, reason: collision with root package name */
    private static final String f24084u = e1.j.f("SystemJobScheduler");

    /* renamed from: q, reason: collision with root package name */
    private final Context f24085q;

    /* renamed from: r, reason: collision with root package name */
    private final JobScheduler f24086r;

    /* renamed from: s, reason: collision with root package name */
    private final f1.j f24087s;

    /* renamed from: t, reason: collision with root package name */
    private final k f24088t;

    public l(Context context, f1.j jVar) {
        this(context, jVar, (JobScheduler) context.getSystemService("jobscheduler"), new k(context));
    }

    public static void b(Context context) {
        List g8;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g8 = g(context, jobScheduler)) == null || g8.isEmpty()) {
            return;
        }
        Iterator it = g8.iterator();
        while (it.hasNext()) {
            c(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    private static void c(JobScheduler jobScheduler, int i7) {
        try {
            jobScheduler.cancel(i7);
        } catch (Throwable th) {
            e1.j.c().b(f24084u, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i7)), th);
        }
    }

    private static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> g8 = g(context, jobScheduler);
        if (g8 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g8) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    private static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            e1.j.c().b(f24084u, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, f1.j jVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g8 = g(context, jobScheduler);
        List a8 = jVar.o().y().a();
        boolean z7 = false;
        HashSet hashSet = new HashSet(g8 != null ? g8.size() : 0);
        if (g8 != null && !g8.isEmpty()) {
            for (JobInfo jobInfo : g8) {
                String h8 = h(jobInfo);
                if (TextUtils.isEmpty(h8)) {
                    c(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(h8);
                }
            }
        }
        Iterator it = a8.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                e1.j.c().a(f24084u, "Reconciling jobs", new Throwable[0]);
                z7 = true;
                break;
            }
        }
        if (!z7) {
            return z7;
        }
        WorkDatabase o7 = jVar.o();
        o7.c();
        try {
            q B = o7.B();
            Iterator it2 = a8.iterator();
            while (it2.hasNext()) {
                B.b((String) it2.next(), -1L);
            }
            o7.r();
            o7.g();
            return z7;
        } catch (Throwable th) {
            o7.g();
            throw th;
        }
    }

    @Override // f1.e
    public boolean a() {
        return true;
    }

    @Override // f1.e
    public void d(String str) {
        List f8 = f(this.f24085q, this.f24086r, str);
        if (f8 == null || f8.isEmpty()) {
            return;
        }
        Iterator it = f8.iterator();
        while (it.hasNext()) {
            c(this.f24086r, ((Integer) it.next()).intValue());
        }
        this.f24087s.o().y().c(str);
    }

    @Override // f1.e
    public void e(p... pVarArr) {
        List f8;
        WorkDatabase o7 = this.f24087s.o();
        n1.f fVar = new n1.f(o7);
        for (p pVar : pVarArr) {
            o7.c();
            try {
                p m7 = o7.B().m(pVar.f24709a);
                if (m7 == null) {
                    e1.j.c().h(f24084u, "Skipping scheduling " + pVar.f24709a + " because it's no longer in the DB", new Throwable[0]);
                    o7.r();
                } else if (m7.f24710b != s.ENQUEUED) {
                    e1.j.c().h(f24084u, "Skipping scheduling " + pVar.f24709a + " because it is no longer enqueued", new Throwable[0]);
                    o7.r();
                } else {
                    m1.g b8 = o7.y().b(pVar.f24709a);
                    int d8 = b8 != null ? b8.f24687b : fVar.d(this.f24087s.i().i(), this.f24087s.i().g());
                    if (b8 == null) {
                        this.f24087s.o().y().d(new m1.g(pVar.f24709a, d8));
                    }
                    j(pVar, d8);
                    if (Build.VERSION.SDK_INT == 23 && (f8 = f(this.f24085q, this.f24086r, pVar.f24709a)) != null) {
                        int indexOf = f8.indexOf(Integer.valueOf(d8));
                        if (indexOf >= 0) {
                            f8.remove(indexOf);
                        }
                        j(pVar, !f8.isEmpty() ? ((Integer) f8.get(0)).intValue() : fVar.d(this.f24087s.i().i(), this.f24087s.i().g()));
                    }
                    o7.r();
                }
            } finally {
                o7.g();
            }
        }
    }

    public void j(p pVar, int i7) {
        JobInfo a8 = this.f24088t.a(pVar, i7);
        e1.j c8 = e1.j.c();
        String str = f24084u;
        c8.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f24709a, Integer.valueOf(i7)), new Throwable[0]);
        try {
            if (this.f24086r.schedule(a8) == 0) {
                e1.j.c().h(str, String.format("Unable to schedule work ID %s", pVar.f24709a), new Throwable[0]);
                if (pVar.f24725q && pVar.f24726r == e1.n.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f24725q = false;
                    e1.j.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f24709a), new Throwable[0]);
                    j(pVar, i7);
                }
            }
        } catch (IllegalStateException e8) {
            List g8 = g(this.f24085q, this.f24086r);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g8 != null ? g8.size() : 0), Integer.valueOf(this.f24087s.o().B().g().size()), Integer.valueOf(this.f24087s.i().h()));
            e1.j.c().b(f24084u, format, new Throwable[0]);
            throw new IllegalStateException(format, e8);
        } catch (Throwable th) {
            e1.j.c().b(f24084u, String.format("Unable to schedule %s", pVar), th);
        }
    }

    public l(Context context, f1.j jVar, JobScheduler jobScheduler, k kVar) {
        this.f24085q = context;
        this.f24087s = jVar;
        this.f24086r = jobScheduler;
        this.f24088t = kVar;
    }
}
