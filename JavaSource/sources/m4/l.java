package m4;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class l implements h3.b {

    /* renamed from: e, reason: collision with root package name */
    private static h3.b f24896e;

    /* renamed from: a, reason: collision with root package name */
    private final Context f24897a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24898b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f24899c;

    /* renamed from: d, reason: collision with root package name */
    private final ExecutorService f24900d;

    l(Context context) {
        this.f24898b = false;
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f24899c = newSingleThreadScheduledExecutor;
        this.f24900d = Executors.newSingleThreadExecutor();
        this.f24897a = context;
        if (this.f24898b) {
            return;
        }
        newSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f24898b = true;
    }

    static synchronized h3.b d(Context context) {
        h3.b bVar;
        synchronized (l.class) {
            try {
                p3.o.n(context, "Context must not be null");
                if (f24896e == null) {
                    f24896e = new l(context.getApplicationContext());
                }
                bVar = f24896e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    protected static final void f(Context context) {
        if (!g(context).edit().remove("app_set_id").commit()) {
            String valueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (g(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String valueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    private static final SharedPreferences g(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void h(Context context) {
        if (g(context).edit().putLong("app_set_id_last_used_time", com.google.android.gms.common.util.h.d().a()).commit()) {
            return;
        }
        String valueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(valueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    @Override // h3.b
    public final w4.i a() {
        final w4.j jVar = new w4.j();
        this.f24900d.execute(new Runnable() { // from class: m4.h
            @Override // java.lang.Runnable
            public final void run() {
                l.this.e(jVar);
            }
        });
        return jVar.a();
    }

    protected final long b() {
        long j7 = g(this.f24897a).getLong("app_set_id_last_used_time", -1L);
        if (j7 != -1) {
            return j7 + 33696000000L;
        }
        return -1L;
    }

    final /* synthetic */ void e(w4.j jVar) {
        String string = g(this.f24897a).getString("app_set_id", null);
        long b8 = b();
        if (string == null || com.google.android.gms.common.util.h.d().a() > b8) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f24897a;
                if (!g(context).edit().putString("app_set_id", string).commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(valueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                h(context);
                Context context2 = this.f24897a;
                if (!g(context2).edit().putLong("app_set_id_creation_time", com.google.android.gms.common.util.h.d().a()).commit()) {
                    String valueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", valueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(valueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e8) {
                jVar.b(e8);
                return;
            }
        } else {
            try {
                h(this.f24897a);
            } catch (k e9) {
                jVar.b(e9);
                return;
            }
        }
        jVar.c(new h3.c(string, 1));
    }
}
