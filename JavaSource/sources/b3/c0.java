package b3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.internal.ads.al0;
import com.google.android.gms.internal.ads.uy;
import com.google.android.gms.internal.ads.yw1;
import java.util.concurrent.ScheduledExecutorService;
import v2.f2;

/* compiled from: MyApplication */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3216a;

    /* renamed from: b, reason: collision with root package name */
    private final y0 f3217b;

    /* renamed from: c, reason: collision with root package name */
    private final long f3218c;

    /* renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f3219d;

    /* renamed from: e, reason: collision with root package name */
    private final PackageInfo f3220e;

    c0(Context context, long j7, PackageInfo packageInfo, y0 y0Var, ScheduledExecutorService scheduledExecutorService) {
        this.f3216a = context;
        this.f3218c = j7;
        this.f3220e = packageInfo;
        this.f3217b = y0Var;
        this.f3219d = scheduledExecutorService;
    }

    public static String c(String str) {
        return str == null ? "" : f2.X(str, "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2");
    }

    private final boolean e() {
        return this.f3217b.j().size() >= ((Integer) s2.b0.c().d(uy.i8)).intValue();
    }

    private static final void f(Bundle bundle, yw1 yw1Var) {
        if (((Boolean) s2.b0.c().d(uy.j8)).booleanValue()) {
            bundle.putLong(yw1Var.c(), r2.t.o().a());
        }
    }

    private static final void g(Bundle bundle, int i7) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i7 - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r6, b3.m0 r7) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L7a
            boolean r0 = r5.e()
            if (r0 == 0) goto Ld
            goto L7a
        Ld:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3d
            r1.<init>()     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "params"
            java.lang.String r3 = r7.f3293a     // Catch: org.json.JSONException -> L3d
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "signal_dictionary"
            w2.g r3 = s2.z.a()     // Catch: org.json.JSONException -> L3d
            android.os.Bundle r4 = r7.f3298f     // Catch: org.json.JSONException -> L3d
            org.json.JSONObject r3 = r3.u(r4)     // Catch: org.json.JSONException -> L3d
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L3d
            java.lang.String r2 = "sr"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = r7.f3295c     // Catch: org.json.JSONException -> L3d
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L3d
            if (r1 == 0) goto L3f
            java.lang.String r7 = ""
            goto L6f
        L3d:
            r7 = move-exception
            goto L62
        L3f:
            java.lang.String r7 = c(r7)     // Catch: org.json.JSONException -> L3d
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> L3d
            byte[] r7 = r7.getBytes(r1)     // Catch: org.json.JSONException -> L3d
            r1 = 10
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r1)     // Catch: org.json.JSONException -> L3d
            java.lang.String r1 = "rs"
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L3d
            java.lang.String r7 = "ts_ms"
            com.google.android.gms.common.util.e r1 = r2.t.o()     // Catch: org.json.JSONException -> L3d
            long r1 = r1.a()     // Catch: org.json.JSONException -> L3d
            r0.put(r7, r1)     // Catch: org.json.JSONException -> L3d
            goto L6b
        L62:
            java.lang.String r1 = "DiskCachingManager.createStringToWrite"
            com.google.android.gms.internal.ads.ql0 r2 = r2.t.l()
            r2.i(r7, r1)
        L6b:
            java.lang.String r7 = r0.toString()
        L6f:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L7a
            b3.y0 r0 = r5.f3217b
            r0.a(r6, r7)
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.c0.a(java.lang.String, b3.m0):void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:20|21|22|(1:24)(7:31|32|33|(1:35)|37|(1:42)(2:39|(1:41))|29)|25|26|28|29|18) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010c, code lost:
    
        if (r12.b() > r10) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final b3.m0 b(com.google.android.gms.internal.ads.al0 r22, final b3.w r23, android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.c0.b(com.google.android.gms.internal.ads.al0, b3.w, android.os.Bundle):b3.m0");
    }

    final /* synthetic */ void d(String str, w wVar, al0 al0Var) {
        if (this.f3217b.c(str) || e()) {
            return;
        }
        wVar.X2(w3.b.C1(this.f3216a), al0Var, null);
    }
}
