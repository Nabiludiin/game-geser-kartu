package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: MyApplication */
public final class fn {

    /* renamed from: d, reason: collision with root package name */
    private static final String[] f8335d = {"/aclk", "/pcs/click", "/dbm/clk"};

    /* renamed from: a, reason: collision with root package name */
    private final String f8336a = "ad.doubleclick.net";

    /* renamed from: b, reason: collision with root package name */
    private final String[] f8337b = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};

    /* renamed from: c, reason: collision with root package name */
    private final zm f8338c;

    public fn(zm zmVar) {
        this.f8338c = zmVar;
    }

    private final Uri f(Uri uri, String str) {
        try {
            if (uri == null) {
                throw null;
            }
            try {
                if (uri.getHost().equals(this.f8336a)) {
                    if (uri.getPath().contains(";")) {
                        if (uri.toString().contains("dc_ms=")) {
                            throw new gn("Parameter already exists: dc_ms");
                        }
                        String uri2 = uri.toString();
                        int indexOf = uri2.indexOf(";adurl");
                        if (indexOf != -1) {
                            int i7 = indexOf + 1;
                            return Uri.parse(uri2.substring(0, i7) + "dc_ms=" + str + ";" + uri2.substring(i7));
                        }
                        String encodedPath = uri.getEncodedPath();
                        int indexOf2 = uri2.indexOf(encodedPath);
                        return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
                    }
                }
            } catch (NullPointerException unused) {
            }
            if (uri.getQueryParameter("ms") != null) {
                throw new gn("Query parameter already exists: ms");
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 == -1) {
                return uri.buildUpon().appendQueryParameter("ms", str).build();
            }
            int i8 = indexOf3 + 1;
            return Uri.parse(uri3.substring(0, i8) + "ms=" + str + "&" + uri3.substring(i8));
        } catch (UnsupportedOperationException unused2) {
            throw new gn("Provided Uri is not in a valid state");
        }
    }

    public final boolean a(Uri uri) {
        uri.getClass();
        try {
            String host = uri.getHost();
            String[] strArr = this.f8337b;
            for (int i7 = 0; i7 < 3; i7++) {
                if (host.endsWith(strArr[i7])) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final zm b() {
        return this.f8338c;
    }

    public final void c(MotionEvent motionEvent) {
        this.f8338c.f(motionEvent);
    }

    public final Uri d(Uri uri, Context context, View view, Activity activity) {
        try {
            return f(uri, this.f8338c.g(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new gn("Provided Uri is not in a valid state");
        }
    }

    public final boolean e(Uri uri) {
        if (a(uri)) {
            String[] strArr = f8335d;
            for (int i7 = 0; i7 < 3; i7++) {
                if (uri.getPath().endsWith(strArr[i7])) {
                    return true;
                }
            }
        }
        return false;
    }
}
