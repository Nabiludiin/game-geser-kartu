package androidx.startup;

import a1.b;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import z0.c;

/* compiled from: MyApplication */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    private static volatile a f2831d;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f2832e = new Object();

    /* renamed from: c, reason: collision with root package name */
    final Context f2835c;

    /* renamed from: b, reason: collision with root package name */
    final Set f2834b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    final Map f2833a = new HashMap();

    a(Context context) {
        this.f2835c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f2831d == null) {
            synchronized (f2832e) {
                try {
                    if (f2831d == null) {
                        f2831d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f2831d;
    }

    void a() {
        try {
            try {
                b.a("Startup");
                Bundle bundle = this.f2835c.getPackageManager().getProviderInfo(new ComponentName(this.f2835c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
                String string = this.f2835c.getString(z0.b.f27812a);
                if (bundle != null) {
                    HashSet hashSet = new HashSet();
                    for (String str : bundle.keySet()) {
                        if (string.equals(bundle.getString(str, null))) {
                            Class<?> cls = Class.forName(str);
                            if (z0.a.class.isAssignableFrom(cls)) {
                                this.f2834b.add(cls);
                                b(cls, hashSet);
                            }
                        }
                    }
                }
            } finally {
                b.b();
            }
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e8) {
            throw new c(e8);
        }
    }

    Object b(Class cls, Set set) {
        Object obj;
        synchronized (f2832e) {
            if (b.d()) {
                try {
                    b.a(cls.getSimpleName());
                } catch (Throwable th) {
                    b.b();
                    throw th;
                }
            }
            if (set.contains(cls)) {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
            }
            if (this.f2833a.containsKey(cls)) {
                obj = this.f2833a.get(cls);
            } else {
                set.add(cls);
                try {
                    z0.a aVar = (z0.a) cls.getDeclaredConstructor(null).newInstance(null);
                    List<Class> a8 = aVar.a();
                    if (!a8.isEmpty()) {
                        for (Class cls2 : a8) {
                            if (!this.f2833a.containsKey(cls2)) {
                                b(cls2, set);
                            }
                        }
                    }
                    obj = aVar.b(this.f2835c);
                    set.remove(cls);
                    this.f2833a.put(cls, obj);
                } catch (Throwable th2) {
                    throw new c(th2);
                }
            }
            b.b();
        }
        return obj;
    }

    public Object d(Class cls) {
        return b(cls, new HashSet());
    }
}
