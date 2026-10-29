package u3;

import android.content.Context;

/* compiled from: MyApplication */
public class e {

    /* renamed from: b, reason: collision with root package name */
    private static final e f26551b = new e();

    /* renamed from: a, reason: collision with root package name */
    private d f26552a = null;

    public static d a(Context context) {
        return f26551b.b(context);
    }

    public final synchronized d b(Context context) {
        try {
            if (this.f26552a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f26552a = new d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f26552a;
    }
}
