package com.google.android.gms.internal.ads;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import java.util.UUID;

/* compiled from: MyApplication */
abstract class nh3 {

    /* renamed from: h, reason: collision with root package name */
    static final String f12735h = new UUID(0, 0).toString();

    /* renamed from: a, reason: collision with root package name */
    private final String f12736a;

    /* renamed from: b, reason: collision with root package name */
    private final String f12737b;

    /* renamed from: c, reason: collision with root package name */
    private final String f12738c;

    /* renamed from: d, reason: collision with root package name */
    private final String f12739d;

    /* renamed from: e, reason: collision with root package name */
    private final String f12740e;

    /* renamed from: f, reason: collision with root package name */
    final mh3 f12741f;

    /* renamed from: g, reason: collision with root package name */
    final lh3 f12742g;

    nh3(Context context, String str, String str2, String str3) {
        this.f12741f = mh3.a(context);
        this.f12742g = lh3.a(context);
        this.f12736a = str;
        this.f12737b = str.concat("_3p");
        this.f12738c = str2;
        this.f12739d = str2.concat("_3p");
        this.f12740e = str3;
    }

    private final String h(String str, String str2, String str3) {
        if (str2 != null && str3 != null) {
            StringBuilder sb = new StringBuilder(str.length() + str2.length() + str3.length());
            sb.append(str);
            sb.append(str2);
            sb.append(str3);
            return UUID.nameUUIDFromBytes(sb.toString().getBytes(StandardCharsets.UTF_8)).toString();
        }
        String str4 = this.f12740e;
        int length = str4.length();
        String str5 = str2 == null ? "null" : "not null";
        int length2 = length + 88 + str5.length();
        String str6 = str3 == null ? "null" : "not null";
        StringBuilder sb2 = new StringBuilder(length2 + 13 + str6.length());
        sb2.append(str4);
        sb2.append(": Invalid argument to generate PAIDv1 on 3p traffic, Ad ID is not null, package name is ");
        sb2.append(str5);
        sb2.append(", hashKey is ");
        sb2.append(str6);
        throw new IllegalArgumentException(sb2.toString());
    }

    final kh3 a(String str, String str2, long j7, boolean z7) {
        if (str != null) {
            try {
                UUID.fromString(str);
                if (!str.equals(f12735h)) {
                    String e8 = e(true);
                    String c8 = this.f12741f.c("paid_3p_hash_key", null);
                    if (e8 != null && c8 != null && !e8.equals(h(str, str2, c8))) {
                        return b(str, str2);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            return new kh3();
        }
        boolean z8 = str != null;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f12740e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        long d8 = d(z8);
        if (d8 != -1) {
            if (currentTimeMillis < d8) {
                this.f12741f.b(z8 ? this.f12739d : this.f12738c, Long.valueOf(currentTimeMillis));
            } else if (currentTimeMillis >= d8 + j7) {
                return b(str, str2);
            }
        }
        String e9 = e(z8);
        return (e9 != null || z7) ? new kh3(e9, d(z8)) : b(str, str2);
    }

    final kh3 b(String str, String str2) {
        if (str == null) {
            return f(UUID.randomUUID().toString(), false);
        }
        String uuid = UUID.randomUUID().toString();
        this.f12741f.b("paid_3p_hash_key", uuid);
        return f(h(str, str2, uuid), true);
    }

    final void c(boolean z7) {
        String str = z7 ? this.f12739d : this.f12738c;
        mh3 mh3Var = this.f12741f;
        mh3Var.f(str);
        mh3Var.f(z7 ? this.f12737b : this.f12736a);
    }

    final long d(boolean z7) {
        return this.f12741f.d(z7 ? this.f12739d : this.f12738c, -1L);
    }

    final String e(boolean z7) {
        return this.f12741f.c(z7 ? this.f12737b : this.f12736a, null);
    }

    final kh3 f(String str, boolean z7) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis < 0) {
            throw new IllegalStateException(this.f12740e.concat(": Invalid negative current timestamp. Updating PAID failed"));
        }
        mh3 mh3Var = this.f12741f;
        mh3Var.b(z7 ? this.f12739d : this.f12738c, Long.valueOf(currentTimeMillis));
        mh3Var.b(z7 ? this.f12737b : this.f12736a, str);
        return new kh3(str, currentTimeMillis);
    }

    final boolean g(boolean z7) {
        return this.f12741f.g(this.f12736a);
    }
}
