package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class sj0 extends q3.a {
    public static final Parcelable.Creator<sj0> CREATOR = new tj0();

    /* renamed from: q, reason: collision with root package name */
    public final String f15645q;

    /* renamed from: r, reason: collision with root package name */
    public final String f15646r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f15647s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f15648t;

    /* renamed from: u, reason: collision with root package name */
    public final List f15649u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f15650v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f15651w;

    /* renamed from: x, reason: collision with root package name */
    public final List f15652x;

    public sj0(String str, String str2, boolean z7, boolean z8, List list, boolean z9, boolean z10, List list2) {
        this.f15645q = str;
        this.f15646r = str2;
        this.f15647s = z7;
        this.f15648t = z8;
        this.f15649u = list;
        this.f15650v = z9;
        this.f15651w = z10;
        this.f15652x = list2 == null ? new ArrayList() : list2;
    }

    public static sj0 M0(JSONObject jSONObject) {
        return new sj0(jSONObject.optString("click_string", ""), jSONObject.optString("report_url", ""), jSONObject.optBoolean("rendered_ad_enabled", false), jSONObject.optBoolean("non_malicious_reporting_enabled", false), v2.r0.a(jSONObject.optJSONArray("allowed_headers"), null), jSONObject.optBoolean("protection_enabled", false), jSONObject.optBoolean("malicious_reporting_enabled", false), v2.r0.a(jSONObject.optJSONArray("webview_permissions"), null));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f15645q;
        int a8 = q3.c.a(parcel);
        q3.c.r(parcel, 2, str, false);
        q3.c.r(parcel, 3, this.f15646r, false);
        q3.c.c(parcel, 4, this.f15647s);
        q3.c.c(parcel, 5, this.f15648t);
        q3.c.t(parcel, 6, this.f15649u, false);
        q3.c.c(parcel, 7, this.f15650v);
        q3.c.c(parcel, 8, this.f15651w);
        q3.c.t(parcel, 9, this.f15652x, false);
        q3.c.b(parcel, a8);
    }
}
