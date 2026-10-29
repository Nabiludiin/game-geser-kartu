package androidx.core.net;

import android.net.ConnectivityManager;

/* compiled from: MyApplication */
public abstract class a {

    /* compiled from: MyApplication */
    /* renamed from: androidx.core.net.a$a, reason: collision with other inner class name */
    static class C0027a {
        static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    public static boolean a(ConnectivityManager connectivityManager) {
        return C0027a.a(connectivityManager);
    }
}
