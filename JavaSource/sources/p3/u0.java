package p3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* compiled from: MyApplication */
public abstract class u0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f25271a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f25272b;

    /* renamed from: c, reason: collision with root package name */
    private static String f25273c;

    /* renamed from: d, reason: collision with root package name */
    private static int f25274d;

    public static int a(Context context) {
        b(context);
        return f25274d;
    }

    private static void b(Context context) {
        Bundle bundle;
        synchronized (f25271a) {
            try {
                if (f25272b) {
                    return;
                }
                f25272b = true;
                try {
                    bundle = u3.e.a(context).c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e8);
                }
                if (bundle == null) {
                    return;
                }
                f25273c = bundle.getString("com.google.app.id");
                f25274d = bundle.getInt("com.google.android.gms.version");
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
