package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public abstract class cm0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z64 f6500a;

    /* renamed from: b, reason: collision with root package name */
    public static final z64 f6501b;

    /* renamed from: c, reason: collision with root package name */
    public static final z64 f6502c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f6503d;

    /* renamed from: e, reason: collision with root package name */
    public static final a74 f6504e;

    /* renamed from: f, reason: collision with root package name */
    public static final z64 f6505f;

    /* renamed from: g, reason: collision with root package name */
    public static final z64 f6506g;

    static {
        ExecutorService threadPoolExecutor;
        ExecutorService executorService;
        ExecutorService executorService2;
        if (com.google.android.gms.common.util.d.a()) {
            nf3.a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zl0("Default")));
        } else {
            ly lyVar = uy.oc;
            if (s2.b0.c().e(lyVar) != null && ((Boolean) s2.b0.c().e(lyVar)).booleanValue()) {
                ly lyVar2 = uy.pc;
                if (s2.b0.c().e(lyVar2) != null) {
                    ly lyVar3 = uy.qc;
                    if (s2.b0.c().e(lyVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) s2.b0.c().e(lyVar2)).intValue(), ((Integer) s2.b0.c().e(lyVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zl0("Default"));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) s2.b0.c().e(lyVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    }
                }
            }
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zl0("Default"));
        }
        byte[] bArr = null;
        f6500a = new bm0(threadPoolExecutor, bArr);
        if (com.google.android.gms.common.util.d.a()) {
            executorService = nf3.a().a(5, new zl0("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zl0("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorService = threadPoolExecutor3;
        }
        f6501b = new bm0(executorService, bArr);
        if (com.google.android.gms.common.util.d.a()) {
            executorService2 = nf3.a().c(new zl0("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zl0("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorService2 = threadPoolExecutor4;
        }
        f6502c = new bm0(executorService2, bArr);
        yl0 yl0Var = new yl0(3, new zl0("Schedule"));
        f6503d = yl0Var;
        f6504e = g74.c(yl0Var);
        f6505f = new bm0(new am0(), bArr);
        f6506g = new bm0(g74.a(), bArr);
    }
}
