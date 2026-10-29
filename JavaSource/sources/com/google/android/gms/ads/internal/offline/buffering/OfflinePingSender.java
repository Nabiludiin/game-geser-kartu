package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.gb0;
import com.google.android.gms.internal.ads.ve0;
import s2.z;

/* compiled from: MyApplication */
public class OfflinePingSender extends Worker {

    /* renamed from: w, reason: collision with root package name */
    private final ve0 f4339w;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4339w = z.b().j(context, new gb0());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.f4339w.f();
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
