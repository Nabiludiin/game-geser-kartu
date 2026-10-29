package p4;

import android.app.Application;
import android.content.Context;

/* compiled from: MyApplication */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f25285a;

    public static a a(Context context) {
        a aVar;
        synchronized (a.class) {
            try {
                if (f25285a == null) {
                    j jVar = new j(null);
                    jVar.b((Application) context.getApplicationContext());
                    f25285a = jVar.a();
                }
                aVar = f25285a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public abstract v2 b();

    public abstract l0 c();
}
