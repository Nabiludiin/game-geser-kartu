package androidx.appcompat.app;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import java.util.Calendar;

/* compiled from: MyApplication */
class j {

    /* renamed from: d, reason: collision with root package name */
    private static j f343d;

    /* renamed from: a, reason: collision with root package name */
    private final Context f344a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationManager f345b;

    /* renamed from: c, reason: collision with root package name */
    private final a f346c = new a();

    /* compiled from: MyApplication */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        boolean f347a;

        /* renamed from: b, reason: collision with root package name */
        long f348b;

        /* renamed from: c, reason: collision with root package name */
        long f349c;

        /* renamed from: d, reason: collision with root package name */
        long f350d;

        /* renamed from: e, reason: collision with root package name */
        long f351e;

        /* renamed from: f, reason: collision with root package name */
        long f352f;

        a() {
        }
    }

    j(Context context, LocationManager locationManager) {
        this.f344a = context;
        this.f345b = locationManager;
    }

    static j a(Context context) {
        if (f343d == null) {
            Context applicationContext = context.getApplicationContext();
            f343d = new j(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f343d;
    }

    private Location b() {
        Location c8 = androidx.core.content.b.b(this.f344a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location c9 = androidx.core.content.b.b(this.f344a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (c9 == null || c8 == null) ? c9 != null ? c9 : c8 : c9.getTime() > c8.getTime() ? c9 : c8;
    }

    private Location c(String str) {
        try {
            if (this.f345b.isProviderEnabled(str)) {
                return this.f345b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e8) {
            Log.d("TwilightManager", "Failed to get last known location", e8);
            return null;
        }
    }

    private boolean e() {
        return this.f346c.f352f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j7;
        a aVar = this.f346c;
        long currentTimeMillis = System.currentTimeMillis();
        i b8 = i.b();
        b8.a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j8 = b8.f340a;
        b8.a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z7 = b8.f342c == 1;
        long j9 = b8.f341b;
        long j10 = b8.f340a;
        b8.a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j11 = b8.f341b;
        if (j9 == -1 || j10 == -1) {
            j7 = currentTimeMillis + 43200000;
        } else {
            j7 = (currentTimeMillis > j10 ? j11 : currentTimeMillis > j9 ? j10 : j9) + 60000;
        }
        aVar.f347a = z7;
        aVar.f348b = j8;
        aVar.f349c = j9;
        aVar.f350d = j10;
        aVar.f351e = j11;
        aVar.f352f = j7;
    }

    boolean d() {
        a aVar = this.f346c;
        if (e()) {
            return aVar.f347a;
        }
        Location b8 = b();
        if (b8 != null) {
            f(b8);
            return aVar.f347a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i7 = Calendar.getInstance().get(11);
        return i7 < 6 || i7 >= 22;
    }
}
