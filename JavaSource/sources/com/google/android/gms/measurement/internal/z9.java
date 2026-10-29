package com.google.android.gms.measurement.internal;

import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* compiled from: MyApplication */
final class z9 implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private final URL f22931q;

    /* renamed from: r, reason: collision with root package name */
    private final byte[] f22932r;

    /* renamed from: s, reason: collision with root package name */
    private final x9 f22933s;

    /* renamed from: t, reason: collision with root package name */
    private final String f22934t;

    /* renamed from: u, reason: collision with root package name */
    private final Map f22935u;

    /* renamed from: v, reason: collision with root package name */
    final /* synthetic */ aa f22936v;

    public z9(aa aaVar, String str, URL url, byte[] bArr, Map map, x9 x9Var) {
        Objects.requireNonNull(aaVar);
        this.f22936v = aaVar;
        p3.o.g(str);
        p3.o.m(url);
        p3.o.m(x9Var);
        this.f22931q = url;
        this.f22932r = bArr;
        this.f22933s = x9Var;
        this.f22934t = str;
        this.f22935u = map;
    }

    private final void b(final int i7, final Exception exc, final byte[] bArr, final Map map) {
        this.f22936v.f22928a.b().t(new Runnable() { // from class: com.google.android.gms.measurement.internal.y9
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                z9.this.a(i7, exc, bArr, map);
            }
        });
    }

    final /* synthetic */ void a(int i7, Exception exc, byte[] bArr, Map map) {
        this.f22933s.a(this.f22934t, i7, exc, bArr, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.OutputStream] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.z9.run():void");
    }
}
