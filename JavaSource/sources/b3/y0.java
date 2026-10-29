package b3;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f3399a;

    /* renamed from: b, reason: collision with root package name */
    private SharedPreferences.Editor f3400b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3401c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f3402d = new Object();

    y0(Context context) {
        this.f3401c = context;
    }

    private final void k() {
        synchronized (this.f3402d) {
            try {
                if (this.f3399a != null) {
                    return;
                }
                SharedPreferences sharedPreferences = this.f3401c.getSharedPreferences("query_info_shared_prefs", 0);
                this.f3399a = sharedPreferences;
                this.f3400b = sharedPreferences.edit();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str, String str2) {
        k();
        synchronized (this.f3402d) {
            this.f3400b.putString(str, str2).commit();
        }
    }

    public final String b(String str) {
        String string;
        k();
        synchronized (this.f3402d) {
            string = this.f3399a.getString(str, null);
            this.f3400b.remove(str).commit();
        }
        return string;
    }

    public final boolean c(String str) {
        boolean contains;
        k();
        synchronized (this.f3402d) {
            contains = this.f3399a.contains(str);
        }
        return contains;
    }

    public final void d(String str, int i7, String str2, int i8) {
        k();
        synchronized (this.f3402d) {
            this.f3400b.putString("pn", str).putInt("vc", i7).putString("dm", str2).putInt("aav", i8).commit();
        }
    }

    public final String e() {
        String string;
        k();
        synchronized (this.f3402d) {
            string = this.f3399a.getString("pn", null);
        }
        return string;
    }

    public final int f() {
        int i7;
        k();
        synchronized (this.f3402d) {
            i7 = this.f3399a.getInt("vc", -1);
        }
        return i7;
    }

    public final String g() {
        String string;
        k();
        synchronized (this.f3402d) {
            string = this.f3399a.getString("dm", null);
        }
        return string;
    }

    public final int h() {
        int i7;
        k();
        synchronized (this.f3402d) {
            i7 = this.f3399a.getInt("aav", -1);
        }
        return i7;
    }

    public final void i() {
        k();
        synchronized (this.f3402d) {
            this.f3400b.clear().commit();
        }
    }

    public final Map j() {
        HashMap hashMap;
        k();
        synchronized (this.f3402d) {
            try {
                Map<String, ?> all = this.f3399a.getAll();
                hashMap = new HashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), "vc") && !Objects.equals(entry.getKey(), "dm") && !Objects.equals(entry.getKey(), "aav")) {
                        hashMap.put(entry.getKey(), (String) entry.getValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashMap;
    }
}
