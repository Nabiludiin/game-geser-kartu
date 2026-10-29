package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public abstract /* synthetic */ class xl0 {
    public static /* synthetic */ void a(ExecutorService executorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(isTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z7 = false;
            while (!isTerminated) {
                try {
                    isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z7) {
                        executorService.shutdownNow();
                        z7 = true;
                    }
                }
            }
            if (z7) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
