package com.google.firebase.concurrent;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import f5.e0;
import f5.x;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* compiled from: MyApplication */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    static final x f22959a = new x(new o5.b() { // from class: g5.b
        @Override // o5.b
        public final Object get() {
            ScheduledExecutorService m7;
            m7 = ExecutorsRegistrar.m(Executors.newFixedThreadPool(4, ExecutorsRegistrar.k("Firebase Background", 10, ExecutorsRegistrar.i())));
            return m7;
        }
    });

    /* renamed from: b, reason: collision with root package name */
    static final x f22960b = new x(new o5.b() { // from class: g5.c
        @Override // o5.b
        public final Object get() {
            ScheduledExecutorService m7;
            m7 = ExecutorsRegistrar.m(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.k("Firebase Lite", 0, ExecutorsRegistrar.l())));
            return m7;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    static final x f22961c = new x(new o5.b() { // from class: g5.d
        @Override // o5.b
        public final Object get() {
            ScheduledExecutorService m7;
            m7 = ExecutorsRegistrar.m(Executors.newCachedThreadPool(ExecutorsRegistrar.j("Firebase Blocking", 11)));
            return m7;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    static final x f22962d = new x(new o5.b() { // from class: g5.e
        @Override // o5.b
        public final Object get() {
            ScheduledExecutorService newSingleThreadScheduledExecutor;
            newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.j("Firebase Scheduler", 0));
            return newSingleThreadScheduledExecutor;
        }
    });

    public static /* synthetic */ ScheduledExecutorService a(f5.e eVar) {
        return (ScheduledExecutorService) f22960b.get();
    }

    public static /* synthetic */ ScheduledExecutorService e(f5.e eVar) {
        return (ScheduledExecutorService) f22961c.get();
    }

    public static /* synthetic */ ScheduledExecutorService g(f5.e eVar) {
        return (ScheduledExecutorService) f22959a.get();
    }

    private static StrictMode.ThreadPolicy i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i7 = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i7 >= 26) {
            detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    private static ThreadFactory j(String str, int i7) {
        return new b(str, i7, null);
    }

    private static ThreadFactory k(String str, int i7, StrictMode.ThreadPolicy threadPolicy) {
        return new b(str, i7, threadPolicy);
    }

    private static StrictMode.ThreadPolicy l() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ScheduledExecutorService m(ExecutorService executorService) {
        return new o(executorService, (ScheduledExecutorService) f22962d.get());
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        return Arrays.asList(f5.c.d(e0.a(e5.a.class, ScheduledExecutorService.class), e0.a(e5.a.class, ExecutorService.class), e0.a(e5.a.class, Executor.class)).e(new f5.h() { // from class: g5.f
            @Override // f5.h
            public final Object a(f5.e eVar) {
                return ExecutorsRegistrar.g(eVar);
            }
        }).c(), f5.c.d(e0.a(e5.b.class, ScheduledExecutorService.class), e0.a(e5.b.class, ExecutorService.class), e0.a(e5.b.class, Executor.class)).e(new f5.h() { // from class: g5.g
            @Override // f5.h
            public final Object a(f5.e eVar) {
                return ExecutorsRegistrar.e(eVar);
            }
        }).c(), f5.c.d(e0.a(e5.c.class, ScheduledExecutorService.class), e0.a(e5.c.class, ExecutorService.class), e0.a(e5.c.class, Executor.class)).e(new f5.h() { // from class: g5.h
            @Override // f5.h
            public final Object a(f5.e eVar) {
                return ExecutorsRegistrar.a(eVar);
            }
        }).c(), f5.c.c(e0.a(e5.d.class, Executor.class)).e(new f5.h() { // from class: g5.i
            @Override // f5.h
            public final Object a(f5.e eVar) {
                Executor executor;
                executor = j.INSTANCE;
                return executor;
            }
        }).c());
    }
}
