package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class p3 {

    /* renamed from: j, reason: collision with root package name */
    private static volatile p3 f21222j;

    /* renamed from: a, reason: collision with root package name */
    private final String f21223a = "FA";

    /* renamed from: b, reason: collision with root package name */
    protected final com.google.android.gms.common.util.e f21224b = com.google.android.gms.common.util.h.d();

    /* renamed from: c, reason: collision with root package name */
    protected final ExecutorService f21225c;

    /* renamed from: d, reason: collision with root package name */
    private final s4.a f21226d;

    /* renamed from: e, reason: collision with root package name */
    private final List f21227e;

    /* renamed from: f, reason: collision with root package name */
    private int f21228f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f21229g;

    /* renamed from: h, reason: collision with root package name */
    private final String f21230h;

    /* renamed from: i, reason: collision with root package name */
    private volatile v1 f21231i;

    protected p3(Context context, Bundle bundle) {
        q1.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new c3(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f21225c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f21226d = new s4.a(this);
        this.f21227e = new ArrayList();
        try {
            if (t4.l0.a(context, "google_app_id", t4.o.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, p3.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f21230h = null;
                    this.f21229g = true;
                    Log.w(this.f21223a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f21230h = "fa";
        f(new p2(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f21223a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new o3(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void f(f3 f3Var) {
        this.f21225c.execute(f3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void g(Exception exc, boolean z7, boolean z8) {
        p3 p3Var;
        Exception exc2;
        this.f21229g |= z7;
        if (z7) {
            Log.w(this.f21223a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z8) {
            p3Var = this;
            exc2 = exc;
            p3Var.d(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            p3Var = this;
            exc2 = exc;
        }
        Log.w(p3Var.f21223a, "Error with data collection. Data lost.", exc2);
    }

    private final void n(String str, String str2, Bundle bundle, boolean z7, boolean z8, Long l7) {
        f(new e3(this, l7, str, str2, bundle, z7, z8));
    }

    public static p3 o(Context context, Bundle bundle) {
        p3.o.m(context);
        if (f21222j == null) {
            synchronized (p3.class) {
                try {
                    if (f21222j == null) {
                        f21222j = new p3(context, bundle);
                    }
                } finally {
                }
            }
        }
        return f21222j;
    }

    public final String A() {
        s1 s1Var = new s1();
        f(new v2(this, s1Var));
        return s1Var.O(50L);
    }

    public final long B() {
        s1 s1Var = new s1();
        f(new w2(this, s1Var));
        Long r02 = s1Var.r0(500L);
        if (r02 != null) {
            return r02.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.f21224b.a()).nextLong();
        int i7 = this.f21228f + 1;
        this.f21228f = i7;
        return nextLong + i7;
    }

    public final String a() {
        s1 s1Var = new s1();
        f(new x2(this, s1Var));
        return s1Var.O(500L);
    }

    public final String b() {
        s1 s1Var = new s1();
        f(new z2(this, s1Var));
        return s1Var.O(500L);
    }

    public final Map c(String str, String str2, boolean z7) {
        s1 s1Var = new s1();
        f(new a3(this, str, str2, z7, s1Var));
        Bundle C1 = s1Var.C1(5000L);
        if (C1 == null || C1.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(C1.size());
        for (String str3 : C1.keySet()) {
            Object obj = C1.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void d(int i7, String str, Object obj, Object obj2, Object obj3) {
        f(new b3(this, false, 5, str, obj, null, null));
    }

    public final int e(String str) {
        s1 s1Var = new s1();
        f(new d3(this, str, s1Var));
        Integer num = (Integer) s1.D2(s1Var.C1(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    final /* synthetic */ String h() {
        return this.f21223a;
    }

    final /* synthetic */ boolean i() {
        return this.f21229g;
    }

    final /* synthetic */ v1 j() {
        return this.f21231i;
    }

    final /* synthetic */ void k(v1 v1Var) {
        this.f21231i = v1Var;
    }

    public final s4.a p() {
        return this.f21226d;
    }

    protected final v1 q(Context context, boolean z7) {
        try {
            return u1.asInterface(DynamiteModule.e(context, z7 ? DynamiteModule.f4578e : DynamiteModule.f4576c, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e8) {
            g(e8, true, false);
            return null;
        }
    }

    public final void r(String str, String str2, Bundle bundle) {
        n(str, str2, bundle, true, true, null);
    }

    public final void s(Bundle bundle) {
        f(new l2(this, bundle));
    }

    public final void t(String str, String str2, Bundle bundle) {
        f(new m2(this, str, str2, bundle));
    }

    public final List u(String str, String str2) {
        s1 s1Var = new s1();
        f(new n2(this, str, str2, s1Var));
        List list = (List) s1.D2(s1Var.C1(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void v(j2 j2Var, String str, String str2) {
        f(new o2(this, j2Var, str, str2));
    }

    public final void w(String str) {
        f(new q2(this, str));
    }

    public final void x(String str) {
        f(new r2(this, str));
    }

    public final void y(Runnable runnable) {
        f(new t2(this, runnable));
    }

    public final String z() {
        s1 s1Var = new s1();
        f(new u2(this, s1Var));
        return s1Var.O(500L);
    }
}
