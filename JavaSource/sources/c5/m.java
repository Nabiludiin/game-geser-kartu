package c5;

import android.os.SystemClock;

/* compiled from: MyApplication */
public abstract class m {
    public static m a(long j7, long j8, long j9) {
        return new a(j7, j8, j9);
    }

    public static m e() {
        return a(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long b();

    public abstract long c();

    public abstract long d();
}
