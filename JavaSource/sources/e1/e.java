package e1;

import android.app.Notification;

/* compiled from: MyApplication */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f23163a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23164b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f23165c;

    public e(int i7, Notification notification, int i8) {
        this.f23163a = i7;
        this.f23165c = notification;
        this.f23164b = i8;
    }

    public int a() {
        return this.f23164b;
    }

    public Notification b() {
        return this.f23165c;
    }

    public int c() {
        return this.f23163a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f23163a == eVar.f23163a && this.f23164b == eVar.f23164b) {
            return this.f23165c.equals(eVar.f23165c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f23163a * 31) + this.f23164b) * 31) + this.f23165c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f23163a + ", mForegroundServiceType=" + this.f23164b + ", mNotification=" + this.f23165c + '}';
    }
}
