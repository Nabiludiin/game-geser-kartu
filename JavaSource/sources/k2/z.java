package k2;

import android.content.Context;
import com.google.android.gms.internal.ads.gb0;
import s2.h1;

/* compiled from: MyApplication */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    private static volatile h1 f24458a;

    public static h1 a(Context context) {
        if (f24458a == null) {
            synchronized (z.class) {
                try {
                    if (f24458a == null) {
                        f24458a = s2.z.b().d(context, new gb0());
                    }
                } finally {
                }
            }
        }
        return f24458a;
    }
}
