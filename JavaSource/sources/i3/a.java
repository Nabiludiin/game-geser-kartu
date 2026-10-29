package i3;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p3.o;

/* compiled from: MyApplication */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f24171c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static a f24172d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f24173a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f24174b;

    a(Context context) {
        this.f24174b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        o.m(context);
        Lock lock = f24171c;
        lock.lock();
        try {
            if (f24172d == null) {
                f24172d = new a(context.getApplicationContext());
            }
            a aVar = f24172d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f24171c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        return str + ":" + str2;
    }

    public GoogleSignInAccount b() {
        String c8;
        String c9 = c("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(c9) && (c8 = c(d("googleSignInAccount", c9))) != null) {
            try {
                return GoogleSignInAccount.W0(c8);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    protected final String c(String str) {
        this.f24173a.lock();
        try {
            return this.f24174b.getString(str, null);
        } finally {
            this.f24173a.unlock();
        }
    }
}
