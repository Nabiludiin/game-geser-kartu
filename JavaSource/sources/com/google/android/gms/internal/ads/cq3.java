package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class cq3 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f6570h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f6571a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6572b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f6573c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f6574d;

    /* renamed from: e, reason: collision with root package name */
    public final long f6575e;

    /* renamed from: f, reason: collision with root package name */
    public final long f6576f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6577g;

    static {
        ka.b("media3.datasource");
    }

    /* synthetic */ cq3(Uri uri, long j7, int i7, byte[] bArr, Map map, long j8, long j9, String str, int i8, Object obj, byte[] bArr2) {
        this(uri, 0L, 1, null, map, j8, j9, null, i8, null);
    }

    public final boolean a(int i7) {
        return (this.f6577g & i7) == i7;
    }

    public final bp3 b() {
        return new bp3(this, null);
    }

    public final String toString() {
        String obj = this.f6571a.toString();
        int length = obj.length();
        long j7 = this.f6575e;
        int length2 = String.valueOf(j7).length();
        long j8 = this.f6576f;
        int length3 = String.valueOf(j8).length();
        int i7 = this.f6577g;
        StringBuilder sb = new StringBuilder(length + 15 + length2 + 2 + length3 + 8 + String.valueOf(i7).length() + 1);
        sb.append("DataSpec[");
        sb.append("GET");
        sb.append(" ");
        sb.append(obj);
        sb.append(", ");
        sb.append(j7);
        sb.append(", ");
        sb.append(j8);
        sb.append(", null, ");
        sb.append(i7);
        sb.append("]");
        return sb.toString();
    }

    private cq3(Uri uri, long j7, int i7, byte[] bArr, Map map, long j8, long j9, String str, int i8, Object obj) {
        boolean z7 = false;
        boolean z8 = j8 >= 0;
        rx3.a(z8);
        rx3.a(z8);
        if (j9 <= 0) {
            j9 = j9 == -1 ? -1L : j9;
            rx3.a(z7);
            uri.getClass();
            this.f6571a = uri;
            this.f6572b = 1;
            this.f6573c = null;
            this.f6574d = Collections.unmodifiableMap(new HashMap(map));
            this.f6575e = j8;
            this.f6576f = j9;
            this.f6577g = i8;
        }
        z7 = true;
        rx3.a(z7);
        uri.getClass();
        this.f6571a = uri;
        this.f6572b = 1;
        this.f6573c = null;
        this.f6574d = Collections.unmodifiableMap(new HashMap(map));
        this.f6575e = j8;
        this.f6576f = j9;
        this.f6577g = i8;
    }

    public cq3(Uri uri, long j7, long j8, String str) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, j7, j8, null, 0, null);
    }
}
