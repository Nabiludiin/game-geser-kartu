package v2;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.ag0;
import java.util.concurrent.Callable;

/* compiled from: MyApplication */
public abstract class e1 {
    public static Object a(Context context, Callable callable) {
        try {
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            try {
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                return callable.call();
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        } catch (Throwable th) {
            w2.p.d("Unexpected exception.", th);
            ag0.c(context).a(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
