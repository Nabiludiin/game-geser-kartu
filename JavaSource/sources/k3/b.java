package k3;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import p3.n;

/* compiled from: MyApplication */
public final class b extends q3.a {

    /* renamed from: q, reason: collision with root package name */
    final int f24463q;

    /* renamed from: r, reason: collision with root package name */
    private final int f24464r;

    /* renamed from: s, reason: collision with root package name */
    private final PendingIntent f24465s;

    /* renamed from: t, reason: collision with root package name */
    private final String f24466t;

    /* renamed from: u, reason: collision with root package name */
    public static final b f24462u = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new p();

    b(int i7, int i8, PendingIntent pendingIntent, String str) {
        this.f24463q = i7;
        this.f24464r = i8;
        this.f24465s = pendingIntent;
        this.f24466t = str;
    }

    static String S0(int i7) {
        if (i7 == 99) {
            return "UNFINISHED";
        }
        if (i7 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i7) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i7) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i7 + ")";
                }
        }
    }

    public int M0() {
        return this.f24464r;
    }

    public String N0() {
        return this.f24466t;
    }

    public PendingIntent O0() {
        return this.f24465s;
    }

    public boolean P0() {
        return (this.f24464r == 0 || this.f24465s == null) ? false : true;
    }

    public boolean Q0() {
        return this.f24464r == 0;
    }

    public void R0(Activity activity, int i7) {
        if (P0()) {
            PendingIntent pendingIntent = this.f24465s;
            p3.o.m(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i7, null, 0, 0, 0);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f24464r == bVar.f24464r && p3.n.a(this.f24465s, bVar.f24465s) && p3.n.a(this.f24466t, bVar.f24466t);
    }

    public int hashCode() {
        return p3.n.b(Integer.valueOf(this.f24464r), this.f24465s, this.f24466t);
    }

    public String toString() {
        n.a c8 = p3.n.c(this);
        c8.a("statusCode", S0(this.f24464r));
        c8.a("resolution", this.f24465s);
        c8.a("message", this.f24466t);
        return c8.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f24463q;
        int a8 = q3.c.a(parcel);
        q3.c.l(parcel, 1, i8);
        q3.c.l(parcel, 2, M0());
        q3.c.q(parcel, 3, O0(), i7, false);
        q3.c.r(parcel, 4, N0(), false);
        q3.c.b(parcel, a8);
    }

    public b(int i7) {
        this(i7, null, null);
    }

    public b(int i7, PendingIntent pendingIntent) {
        this(i7, pendingIntent, null);
    }

    public b(int i7, PendingIntent pendingIntent, String str) {
        this(1, i7, pendingIntent, str);
    }
}
