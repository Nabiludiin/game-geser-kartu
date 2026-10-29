package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* compiled from: MyApplication */
public final class ut extends q3.a {
    public static final Parcelable.Creator<ut> CREATOR = new vt();

    /* renamed from: q, reason: collision with root package name */
    public final String f16970q;

    /* renamed from: r, reason: collision with root package name */
    public final long f16971r;

    /* renamed from: s, reason: collision with root package name */
    public final String f16972s;

    /* renamed from: t, reason: collision with root package name */
    public final String f16973t;

    /* renamed from: u, reason: collision with root package name */
    public final String f16974u;

    /* renamed from: v, reason: collision with root package name */
    public final Bundle f16975v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f16976w;

    /* renamed from: x, reason: collision with root package name */
    public long f16977x;

    /* renamed from: y, reason: collision with root package name */
    public String f16978y;

    /* renamed from: z, reason: collision with root package name */
    public int f16979z;

    ut(String str, long j7, String str2, String str3, String str4, Bundle bundle, boolean z7, long j8, String str5, int i7) {
        this.f16970q = str;
        this.f16971r = j7;
        this.f16972s = str2 == null ? "" : str2;
        this.f16973t = str3 == null ? "" : str3;
        this.f16974u = str4 == null ? "" : str4;
        this.f16975v = bundle == null ? new Bundle() : bundle;
        this.f16976w = z7;
        this.f16977x = j8;
        this.f16978y = str5;
        this.f16979z = i7;
    }

    public static ut M0(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                int size = pathSegments.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 51);
                sb.append("Expected 2 path parts for namespace and id, found :");
                sb.append(size);
                String sb2 = sb.toString();
                int i7 = v2.n1.f26802b;
                w2.p.f(sb2);
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new ut(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException e8) {
            e = e8;
            int i8 = v2.n1.f26802b;
            w2.p.g("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e9) {
            e = e9;
            int i82 = v2.n1.f26802b;
            w2.p.g("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f16970q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 2, str, false);
        q3.c.o(parcel, 3, this.f16971r);
        q3.c.r(parcel, 4, this.f16972s, false);
        q3.c.r(parcel, 5, this.f16973t, false);
        q3.c.r(parcel, 6, this.f16974u, false);
        q3.c.f(parcel, 7, this.f16975v, false);
        q3.c.c(parcel, 8, this.f16976w);
        q3.c.o(parcel, 9, this.f16977x);
        q3.c.r(parcel, 10, this.f16978y, false);
        q3.c.l(parcel, 11, this.f16979z);
        q3.c.b(parcel, a8);
    }
}
