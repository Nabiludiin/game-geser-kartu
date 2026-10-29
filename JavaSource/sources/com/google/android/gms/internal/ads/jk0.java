package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class jk0 {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReference f10579a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    private final Object f10580b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private String f10581c = null;

    /* renamed from: d, reason: collision with root package name */
    final AtomicBoolean f10582d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    private final AtomicInteger f10583e = new AtomicInteger(-1);

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f10584f = new AtomicReference(null);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f10585g = new AtomicReference(null);

    /* renamed from: h, reason: collision with root package name */
    private final ConcurrentMap f10586h = new ConcurrentHashMap(9);

    /* renamed from: i, reason: collision with root package name */
    private final Object f10587i = new Object();

    public static final Bundle q(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    static final boolean r(Context context) {
        if (!((Boolean) s2.b0.c().d(uy.E0)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) < ((Integer) s2.b0.c().d(uy.F0)).intValue()) {
            return false;
        }
        if (((Boolean) s2.b0.c().d(uy.G0)).booleanValue()) {
            try {
                context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final void s(Context context, String str, String str2, Bundle bundle) {
        if (a(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e8) {
                String valueOf = String.valueOf(str2);
                int i7 = v2.n1.f26802b;
                w2.p.d("Invalid event ID: ".concat(valueOf), e8);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f10584f, true)) {
                ConcurrentMap concurrentMap = this.f10586h;
                Method method = (Method) concurrentMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        w("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.f10584f.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    w("logEventInternal", true);
                }
            }
        }
    }

    private final Method t(Context context, String str) {
        ConcurrentMap concurrentMap = this.f10586h;
        Method method = (Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, null);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            w(str, false);
            return null;
        }
    }

    private final void u(Context context, String str, String str2) {
        if (x(context, "com.google.android.gms.measurement.AppMeasurement", this.f10584f, true)) {
            ConcurrentMap concurrentMap = this.f10586h;
            Method method = (Method) concurrentMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentMap.put(str2, method);
                } catch (Exception unused) {
                    w(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f10584f.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                v2.n1.k(sb.toString());
            } catch (Exception unused2) {
                w(str2, false);
            }
        }
    }

    private final Object v(String str, Context context) {
        AtomicReference atomicReference = this.f10584f;
        if (!x(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return t(context, str).invoke(atomicReference.get(), null);
        } catch (Exception unused) {
            w(str, true);
            return null;
        }
    }

    private final void w(String str, boolean z7) {
        AtomicBoolean atomicBoolean = this.f10582d;
        if (atomicBoolean.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        String sb2 = sb.toString();
        int i7 = v2.n1.f26802b;
        w2.p.f(sb2);
        if (z7) {
            w2.p.f("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
    }

    private final boolean x(Context context, String str, AtomicReference atomicReference, boolean z7) {
        if (atomicReference.get() == null) {
            try {
                m3.l1.a(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            } catch (Exception unused) {
                w("getInstance", z7);
                return false;
            }
        }
        return true;
    }

    public final boolean a(Context context) {
        if (((Boolean) s2.b0.c().d(uy.f17230w0)).booleanValue() && !this.f10582d.get()) {
            if (((Boolean) s2.b0.c().d(uy.H0)).booleanValue()) {
                return true;
            }
            AtomicInteger atomicInteger = this.f10583e;
            if (atomicInteger.get() == -1) {
                s2.z.a();
                if (!w2.g.A(context, k3.k.f24503a)) {
                    s2.z.a();
                    if (w2.g.B(context)) {
                        int i7 = v2.n1.f26802b;
                        w2.p.f("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    }
                }
                atomicInteger.set(1);
            }
            if (atomicInteger.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void b(Context context, s2.o4 o4Var) {
        kk0.b(context).a().c(o4Var);
        if (((Boolean) s2.b0.c().d(uy.J0)).booleanValue() && a(context) && r(context)) {
            synchronized (this.f10587i) {
            }
        }
    }

    public final void c(Context context, s2.b5 b5Var) {
        if (((Boolean) s2.b0.c().d(uy.J0)).booleanValue() && a(context) && r(context)) {
            synchronized (this.f10587i) {
            }
        }
    }

    public final void d(Context context, String str) {
        if (a(context)) {
            u(context, str, "beginAdUnitExposure");
        }
    }

    public final void e(Context context, String str) {
        if (a(context)) {
            u(context, str, "endAdUnitExposure");
        }
    }

    public final String f(Context context) {
        if (a(context)) {
            AtomicReference atomicReference = this.f10584f;
            if (x(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str = (String) t(context, "getCurrentScreenName").invoke(atomicReference.get(), null);
                    if (str == null) {
                        str = (String) t(context, "getCurrentScreenClass").invoke(atomicReference.get(), null);
                    }
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    w("getCurrentScreenName", false);
                }
            }
        }
        return "";
    }

    public final void g(Context context, String str) {
        if (a(context) && (context instanceof Activity) && x(context, "com.google.firebase.analytics.FirebaseAnalytics", this.f10585g, false)) {
            ConcurrentMap concurrentMap = this.f10586h;
            Method method = (Method) concurrentMap.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    concurrentMap.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    w("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.f10585g.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                w("setCurrentScreen", false);
            }
        }
    }

    public final String h(Context context) {
        if (!a(context)) {
            return null;
        }
        synchronized (this.f10580b) {
            try {
                String str = this.f10581c;
                if (str != null) {
                    return str;
                }
                String str2 = (String) v("getGmpAppId", context);
                this.f10581c = str2;
                return str2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String i(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!a(context)) {
            return null;
        }
        long longValue = ((Long) s2.b0.c().d(uy.C0)).longValue();
        if (longValue < 0) {
            return (String) v("getAppInstanceId", context);
        }
        AtomicReference atomicReference = this.f10579a;
        if (atomicReference.get() == null) {
            if (com.google.android.gms.common.util.d.a()) {
                threadPoolExecutor = nf3.a().a(((Integer) s2.b0.c().d(uy.D0)).intValue(), new hk0(this), 2);
            } else {
                ly lyVar = uy.D0;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) s2.b0.c().d(lyVar)).intValue(), ((Integer) s2.b0.c().d(lyVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new hk0(this));
            }
            m3.l1.a(atomicReference, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.ik0
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return jk0.this.p(context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String j(Context context) {
        Object v7;
        if (a(context) && (v7 = v("generateEventId", context)) != null) {
            return v7.toString();
        }
        return null;
    }

    public final void k(Context context, String str, Map map) {
        s(context, "_ac", str, q(map));
    }

    public final void l(Context context, String str, Map map) {
        s(context, "_ai", str, q(map));
    }

    public final void m(Context context, String str) {
        s(context, "_aq", str, null);
    }

    public final void n(Context context, String str) {
        s(context, "_aa", str, null);
    }

    public final void o(Context context, String str, String str2, String str3, int i7) {
        if (a(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i7);
            s(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i7).length());
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i7);
            v2.n1.k(sb.toString());
        }
    }

    final /* synthetic */ String p(Context context) {
        return (String) v("getAppInstanceId", context);
    }
}
