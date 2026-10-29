package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.measurement.internal.cc;
import t4.m0;

/* compiled from: MyApplication */
public final class AppMeasurementJobService extends JobService implements m0 {

    /* renamed from: q, reason: collision with root package name */
    private cc f21825q;

    private final cc c() {
        if (this.f21825q == null) {
            this.f21825q = new cc(this);
        }
        return this.f21825q;
    }

    @Override // t4.m0
    public final boolean L(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override // t4.m0
    public final void b(JobParameters jobParameters, boolean z7) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        c().a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        c().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        c();
        cc.i(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        c().e(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c();
        cc.j(intent);
        return true;
    }

    @Override // t4.m0
    public final void a(Intent intent) {
    }
}
