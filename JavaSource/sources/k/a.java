package k;

import android.content.Context;
import android.content.res.Configuration;

/* compiled from: MyApplication */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f24262a;

    private a(Context context) {
        this.f24262a = context;
    }

    public static a b(Context context) {
        return new a(context);
    }

    public boolean a() {
        return this.f24262a.getApplicationInfo().targetSdkVersion < 14;
    }

    public int c() {
        return this.f24262a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int d() {
        Configuration configuration = this.f24262a.getResources().getConfiguration();
        int i7 = configuration.screenWidthDp;
        int i8 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i7 > 600) {
            return 5;
        }
        if (i7 > 960 && i8 > 720) {
            return 5;
        }
        if (i7 > 720 && i8 > 960) {
            return 5;
        }
        if (i7 >= 500) {
            return 4;
        }
        if (i7 > 640 && i8 > 480) {
            return 4;
        }
        if (i7 <= 480 || i8 <= 640) {
            return i7 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean e() {
        return this.f24262a.getResources().getBoolean(f.b.f23334a);
    }

    public boolean f() {
        return true;
    }
}
