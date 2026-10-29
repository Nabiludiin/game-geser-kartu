package c5;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.s;
import p3.n;
import p3.o;
import p3.r;

/* compiled from: MyApplication */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f3535a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3536b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3537c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3538d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3539e;

    /* renamed from: f, reason: collision with root package name */
    private final String f3540f;

    /* renamed from: g, reason: collision with root package name */
    private final String f3541g;

    private l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        o.q(!s.a(str), "ApplicationId must be set.");
        this.f3536b = str;
        this.f3535a = str2;
        this.f3537c = str3;
        this.f3538d = str4;
        this.f3539e = str5;
        this.f3540f = str6;
        this.f3541g = str7;
    }

    public static l a(Context context) {
        r rVar = new r(context);
        String a8 = rVar.a("google_app_id");
        if (TextUtils.isEmpty(a8)) {
            return null;
        }
        return new l(a8, rVar.a("google_api_key"), rVar.a("firebase_database_url"), rVar.a("ga_trackingId"), rVar.a("gcm_defaultSenderId"), rVar.a("google_storage_bucket"), rVar.a("project_id"));
    }

    public String b() {
        return this.f3535a;
    }

    public String c() {
        return this.f3536b;
    }

    public String d() {
        return this.f3539e;
    }

    public String e() {
        return this.f3541g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return n.a(this.f3536b, lVar.f3536b) && n.a(this.f3535a, lVar.f3535a) && n.a(this.f3537c, lVar.f3537c) && n.a(this.f3538d, lVar.f3538d) && n.a(this.f3539e, lVar.f3539e) && n.a(this.f3540f, lVar.f3540f) && n.a(this.f3541g, lVar.f3541g);
    }

    public int hashCode() {
        return n.b(this.f3536b, this.f3535a, this.f3537c, this.f3538d, this.f3539e, this.f3540f, this.f3541g);
    }

    public String toString() {
        return n.c(this).a("applicationId", this.f3536b).a("apiKey", this.f3535a).a("databaseUrl", this.f3537c).a("gcmSenderId", this.f3539e).a("storageBucket", this.f3540f).a("projectId", this.f3541g).toString();
    }
}
