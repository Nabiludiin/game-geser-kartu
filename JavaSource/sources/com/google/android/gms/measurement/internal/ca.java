package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;

/* compiled from: MyApplication */
public final class ca extends e5 {

    /* renamed from: c, reason: collision with root package name */
    private JobScheduler f22009c;

    public ca(w6 w6Var) {
        super(w6Var);
    }

    @Override // com.google.android.gms.measurement.internal.e5
    protected final boolean m() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.e5
    protected final void n() {
        this.f22009c = (JobScheduler) this.f22928a.e().getSystemService("jobscheduler");
    }

    public final void o(long j7) {
        JobInfo pendingJob;
        j();
        h();
        JobScheduler jobScheduler = this.f22009c;
        if (jobScheduler != null) {
            pendingJob = jobScheduler.getPendingJob(p());
            if (pendingJob != null) {
                this.f22928a.a().w().a("[sgtm] There's an existing pending job, skip this schedule.");
                return;
            }
        }
        com.google.android.gms.internal.measurement.e7 q7 = q();
        if (q7 != com.google.android.gms.internal.measurement.e7.CLIENT_UPLOAD_ELIGIBLE) {
            this.f22928a.a().w().b("[sgtm] Not eligible for Scion upload", q7.name());
            return;
        }
        w6 w6Var = this.f22928a;
        w6Var.a().w().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j7));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        w6Var.a().w().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) p3.o.m(this.f22009c)).schedule(new JobInfo.Builder(p(), new ComponentName(w6Var.e(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j7).setOverrideDeadline(j7 + j7).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    final int p() {
        return "measurement-client".concat(String.valueOf(this.f22928a.e().getPackageName())).hashCode();
    }

    final com.google.android.gms.internal.measurement.e7 q() {
        j();
        h();
        if (this.f22009c == null) {
            return com.google.android.gms.internal.measurement.e7.MISSING_JOB_SCHEDULER;
        }
        w6 w6Var = this.f22928a;
        if (!w6Var.w().P()) {
            return com.google.android.gms.internal.measurement.e7.NOT_ENABLED_IN_MANIFEST;
        }
        w6 w6Var2 = this.f22928a;
        return w6Var2.L().u() >= 119000 ? !yd.F(w6Var.e(), "com.google.android.gms.measurement.AppMeasurementJobService") ? com.google.android.gms.internal.measurement.e7.MEASUREMENT_SERVICE_NOT_ENABLED : Build.VERSION.SDK_INT >= 24 ? !w6Var2.J().y() ? com.google.android.gms.internal.measurement.e7.NON_PLAY_MODE : com.google.android.gms.internal.measurement.e7.CLIENT_UPLOAD_ELIGIBLE : com.google.android.gms.internal.measurement.e7.ANDROID_TOO_OLD : com.google.android.gms.internal.measurement.e7.SDK_TOO_OLD;
    }
}
