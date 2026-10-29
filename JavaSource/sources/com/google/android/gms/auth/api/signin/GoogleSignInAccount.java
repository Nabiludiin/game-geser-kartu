package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import p3.o;
import q3.c;

/* compiled from: MyApplication */
@Deprecated
public class GoogleSignInAccount extends q3.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new a();
    public static final e D = h.d();
    private final String A;
    private final String B;
    private final Set C = new HashSet();

    /* renamed from: q, reason: collision with root package name */
    final int f4401q;

    /* renamed from: r, reason: collision with root package name */
    private final String f4402r;

    /* renamed from: s, reason: collision with root package name */
    private final String f4403s;

    /* renamed from: t, reason: collision with root package name */
    private final String f4404t;

    /* renamed from: u, reason: collision with root package name */
    private final String f4405u;

    /* renamed from: v, reason: collision with root package name */
    private final Uri f4406v;

    /* renamed from: w, reason: collision with root package name */
    private String f4407w;

    /* renamed from: x, reason: collision with root package name */
    private final long f4408x;

    /* renamed from: y, reason: collision with root package name */
    private final String f4409y;

    /* renamed from: z, reason: collision with root package name */
    final List f4410z;

    GoogleSignInAccount(int i7, String str, String str2, String str3, String str4, Uri uri, String str5, long j7, String str6, List list, String str7, String str8) {
        this.f4401q = i7;
        this.f4402r = str;
        this.f4403s = str2;
        this.f4404t = str3;
        this.f4405u = str4;
        this.f4406v = uri;
        this.f4407w = str5;
        this.f4408x = j7;
        this.f4409y = str6;
        this.f4410z = list;
        this.A = str7;
        this.B = str8;
    }

    public static GoogleSignInAccount V0(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l7, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l7.longValue(), o.g(str7), new ArrayList((Collection) o.m(set)), str5, str6);
    }

    public static GoogleSignInAccount W0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            hashSet.add(new Scope(jSONArray.getString(i7)));
        }
        GoogleSignInAccount V0 = V0(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        V0.f4407w = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return V0;
    }

    public Account M0() {
        String str = this.f4404t;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String N0() {
        return this.f4404t;
    }

    public String O0() {
        return this.B;
    }

    public String P0() {
        return this.A;
    }

    public String Q0() {
        return this.f4402r;
    }

    public String R0() {
        return this.f4403s;
    }

    public Uri S0() {
        return this.f4406v;
    }

    public Set T0() {
        HashSet hashSet = new HashSet(this.f4410z);
        hashSet.addAll(this.C);
        return hashSet;
    }

    public String U0() {
        return this.f4407w;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f4409y.equals(this.f4409y) && googleSignInAccount.T0().equals(T0());
    }

    public int hashCode() {
        return ((this.f4409y.hashCode() + 527) * 31) + T0().hashCode();
    }

    public String k() {
        return this.f4405u;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int a8 = c.a(parcel);
        c.l(parcel, 1, this.f4401q);
        c.r(parcel, 2, Q0(), false);
        c.r(parcel, 3, R0(), false);
        c.r(parcel, 4, N0(), false);
        c.r(parcel, 5, k(), false);
        c.q(parcel, 6, S0(), i7, false);
        c.r(parcel, 7, U0(), false);
        c.o(parcel, 8, this.f4408x);
        c.r(parcel, 9, this.f4409y, false);
        c.v(parcel, 10, this.f4410z, false);
        c.r(parcel, 11, P0(), false);
        c.r(parcel, 12, O0(), false);
        c.b(parcel, a8);
    }
}
