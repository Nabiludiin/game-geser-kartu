package androidx.core.provider;

import android.os.Handler;
import android.os.Looper;

/* compiled from: MyApplication */
abstract class b {
    static Handler a() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
