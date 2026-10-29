package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.measurement.internal.cc;
import t4.m0;

/* compiled from: MyApplication */
public final class AppMeasurementService extends Service implements m0 {

    /* renamed from: q, reason: collision with root package name */
    private cc f21827q;

    private final cc c() {
        if (this.f21827q == null) {
            this.f21827q = new cc(this);
        }
        return this.f21827q;
    }

    @Override // t4.m0
    public final boolean L(int i7) {
        return stopSelfResult(i7);
    }

    @Override // t4.m0
    public final void a(Intent intent) {
        l0.a.b(intent);
    }

    @Override // t4.m0
    public final void b(JobParameters jobParameters, boolean z7) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return c().d(intent);
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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i7, int i8) {
        c().c(intent, i7, i8);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        c();
        cc.j(intent);
        return true;
    }
}
