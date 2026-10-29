package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* compiled from: MyApplication */
public final class uc extends ad {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f22697d;

    /* renamed from: e, reason: collision with root package name */
    private x f22698e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f22699f;

    protected uc(pd pdVar) {
        super(pdVar);
        this.f22697d = (AlarmManager) this.f22928a.e().getSystemService("alarm");
    }

    private final x o() {
        if (this.f22698e == null) {
            this.f22698e = new tc(this, this.f22755b.g0());
        }
        return this.f22698e;
    }

    private final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f22928a.e().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(q());
        }
    }

    private final int q() {
        if (this.f22699f == null) {
            this.f22699f = Integer.valueOf("measurement".concat(String.valueOf(this.f22928a.e().getPackageName())).hashCode());
        }
        return this.f22699f.intValue();
    }

    private final PendingIntent r() {
        Context e8 = this.f22928a.e();
        return PendingIntent.getBroadcast(e8, 0, new Intent().setClassName(e8, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), com.google.android.gms.internal.measurement.l1.f21085a);
    }

    @Override // com.google.android.gms.measurement.internal.ad
    protected final boolean l() {
        AlarmManager alarmManager = this.f22697d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        p();
        return false;
    }

    public final void m(long j7) {
        j();
        w6 w6Var = this.f22928a;
        w6Var.c();
        Context e8 = w6Var.e();
        if (!yd.j0(e8)) {
            w6Var.a().v().a("Receiver not registered/enabled");
        }
        if (!yd.E(e8, false)) {
            w6Var.a().v().a("Service not registered/enabled");
        }
        n();
        w6Var.a().w().b("Scheduling upload, millis", Long.valueOf(j7));
        long b8 = w6Var.f().b() + j7;
        w6Var.w();
        if (j7 < Math.max(0L, ((Long) c5.M.b(null)).longValue()) && !o().c()) {
            o().b(j7);
        }
        w6Var.c();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f22697d;
            if (alarmManager != null) {
                w6Var.w();
                alarmManager.setInexactRepeating(2, b8, Math.max(((Long) c5.H.b(null)).longValue(), j7), r());
                return;
            }
            return;
        }
        Context e9 = w6Var.e();
        ComponentName componentName = new ComponentName(e9, "com.google.android.gms.measurement.AppMeasurementJobService");
        int q7 = q();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        com.google.android.gms.internal.measurement.m1.a(e9, new JobInfo.Builder(q7, componentName).setMinimumLatency(j7).setOverrideDeadline(j7 + j7).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void n() {
        j();
        this.f22928a.a().w().a("Unscheduling upload");
        AlarmManager alarmManager = this.f22697d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        o().d();
        if (Build.VERSION.SDK_INT >= 24) {
            p();
        }
    }
}
