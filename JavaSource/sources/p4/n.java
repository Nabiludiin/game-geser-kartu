package p4;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: MyApplication */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25470a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference f25471b = new AtomicReference();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicReference f25472c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    private final AtomicReference f25473d = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReference f25474e = new AtomicReference();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference f25475f = new AtomicReference();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference f25476g = new AtomicReference();

    n(Application application) {
        this.f25470a = application.getApplicationContext();
    }

    public final Object a(String str) {
        Object obj;
        AtomicReference atomicReference = this.f25475f;
        if (atomicReference.get() == null || (obj = ((Bundle) atomicReference.get()).get(str)) == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final void b(Context context) {
        AtomicReference atomicReference = this.f25475f;
        if (atomicReference.get() == null) {
            try {
                atomicReference.set(u3.e.a(context).c(context.getPackageName(), 128).metaData);
            } catch (PackageManager.NameNotFoundException | NullPointerException e8) {
                Log.w("UserMessagingPlatform", "Failed to get metadata. ", e8);
            }
        }
    }

    public final void c(Map map) {
        Log.d("UserMessagingPlatform", "Update Firebase: ".concat(map.toString()));
        HashMap hashMap = new HashMap();
        for (String str : map.keySet()) {
            try {
                hashMap.put((Enum) ((Method) this.f25474e.get()).invoke(null, str), (Enum) ((Method) this.f25473d.get()).invoke(null, map.get(str)));
            } catch (Exception e8) {
                Log.w("UserMessagingPlatform", "Failed to invoke the Firebase static method.", e8);
            }
        }
        AtomicReference atomicReference = this.f25472c;
        if (atomicReference.get() == null || hashMap.isEmpty()) {
            return;
        }
        try {
            ((Method) atomicReference.get()).invoke(this.f25471b.get(), hashMap);
        } catch (Exception e9) {
            Log.w("UserMessagingPlatform", "Failed to invoke Firebase method. ", e9);
        }
    }

    public final boolean d() {
        AtomicReference atomicReference = this.f25476g;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        Context context = this.f25470a;
        if (context == null) {
            atomicReference.set(Boolean.FALSE);
            return false;
        }
        try {
            this.f25471b.set(FirebaseAnalytics.class.getDeclaredMethod("getInstance", Context.class).invoke(null, context));
            this.f25472c.set(FirebaseAnalytics.class.getDeclaredMethod("setConsent", Map.class));
            FirebaseAnalytics.a aVar = FirebaseAnalytics.a.GRANTED;
            FirebaseAnalytics.b bVar = FirebaseAnalytics.b.AD_STORAGE;
            Method declaredMethod = FirebaseAnalytics.a.class.getDeclaredMethod("valueOf", String.class);
            Method declaredMethod2 = FirebaseAnalytics.b.class.getDeclaredMethod("valueOf", String.class);
            this.f25473d.set(declaredMethod);
            this.f25474e.set(declaredMethod2);
            this.f25476g.set(Boolean.TRUE);
            return true;
        } catch (Exception e8) {
            Log.w("UserMessagingPlatform", "No Firebase class found. ", e8);
            this.f25476g.set(Boolean.FALSE);
            return false;
        }
    }
}
