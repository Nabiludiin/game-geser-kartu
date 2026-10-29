package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import e1.j;
import f1.b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public class SystemJobService extends JobService implements b {

    /* renamed from: s, reason: collision with root package name */
    private static final String f3059s = j.f("SystemJobService");

    /* renamed from: q, reason: collision with root package name */
    private f1.j f3060q;

    /* renamed from: r, reason: collision with root package name */
    private final Map f3061r = new HashMap();

    private static String a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // f1.b
    public void c(String str, boolean z7) {
        JobParameters jobParameters;
        j.c().a(f3059s, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f3061r) {
            jobParameters = (JobParameters) this.f3061r.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z7);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            f1.j k7 = f1.j.k(getApplicationContext());
            this.f3060q = k7;
            k7.m().d(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            j.c().h(f3059s, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        f1.j jVar = this.f3060q;
        if (jVar != null) {
            jVar.m().i(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        WorkerParameters.a aVar;
        Uri[] triggeredContentUris;
        String[] triggeredContentAuthorities;
        Network network;
        String[] triggeredContentAuthorities2;
        Uri[] triggeredContentUris2;
        if (this.f3060q == null) {
            j.c().a(f3059s, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        String a8 = a(jobParameters);
        if (TextUtils.isEmpty(a8)) {
            j.c().b(f3059s, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f3061r) {
            try {
                if (this.f3061r.containsKey(a8)) {
                    j.c().a(f3059s, String.format("Job is already being executed by SystemJobService: %s", a8), new Throwable[0]);
                    return false;
                }
                j.c().a(f3059s, String.format("onStartJob for %s", a8), new Throwable[0]);
                this.f3061r.put(a8, jobParameters);
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 24) {
                    aVar = new WorkerParameters.a();
                    triggeredContentUris = jobParameters.getTriggeredContentUris();
                    if (triggeredContentUris != null) {
                        triggeredContentUris2 = jobParameters.getTriggeredContentUris();
                        aVar.f2965b = Arrays.asList(triggeredContentUris2);
                    }
                    triggeredContentAuthorities = jobParameters.getTriggeredContentAuthorities();
                    if (triggeredContentAuthorities != null) {
                        triggeredContentAuthorities2 = jobParameters.getTriggeredContentAuthorities();
                        aVar.f2964a = Arrays.asList(triggeredContentAuthorities2);
                    }
                    if (i7 >= 28) {
                        network = jobParameters.getNetwork();
                        aVar.f2966c = network;
                    }
                } else {
                    aVar = null;
                }
                this.f3060q.v(a8, aVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f3060q == null) {
            j.c().a(f3059s, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a8 = a(jobParameters);
        if (TextUtils.isEmpty(a8)) {
            j.c().b(f3059s, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        j.c().a(f3059s, String.format("onStopJob for %s", a8), new Throwable[0]);
        synchronized (this.f3061r) {
            this.f3061r.remove(a8);
        }
        this.f3060q.x(a8);
        return !this.f3060q.m().f(a8);
    }
}
