package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import android.os.RemoteException;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.internal.ads.gb0;
import com.google.android.gms.internal.ads.ve0;
import s2.z;
import t2.a;
import w3.b;

/* compiled from: MyApplication */
public class OfflineNotificationPoster extends Worker {

    /* renamed from: w, reason: collision with root package name */
    private final ve0 f4338w;

    public OfflineNotificationPoster(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4338w = z.b().j(context, new gb0());
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.a doWork() {
        try {
            this.f4338w.O3(b.C1(getApplicationContext()), new a(getInputData().i("uri"), getInputData().i("gws_query_id"), getInputData().i("image_url")));
            return ListenableWorker.a.c();
        } catch (RemoteException unused) {
            return ListenableWorker.a.a();
        }
    }
}
