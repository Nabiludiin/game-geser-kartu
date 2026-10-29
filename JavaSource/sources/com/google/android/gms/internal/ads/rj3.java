package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.c;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class rj3 implements lj3 {

    /* renamed from: a, reason: collision with root package name */
    private final ExecutorService f14953a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14954b;

    /* renamed from: c, reason: collision with root package name */
    private final long f14955c;

    public rj3(ExecutorService executorService, String str, long j7) {
        this.f14953a = executorService;
        this.f14954b = str;
        this.f14955c = j7;
    }

    private final a5.d e(final String str, final boolean z7, final byte[] bArr, final String str2) {
        return androidx.concurrent.futures.c.a(new c.InterfaceC0016c() { // from class: com.google.android.gms.internal.ads.oj3
            @Override // androidx.concurrent.futures.c.InterfaceC0016c
            public final /* synthetic */ Object a(c.a aVar) {
                return rj3.this.c(str, z7, str2, bArr, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void d(java.lang.String r6, androidx.concurrent.futures.c.a r7, boolean r8, java.lang.String r9, byte[] r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.rj3.d(java.lang.String, androidx.concurrent.futures.c$a, boolean, java.lang.String, byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.lj3
    public final a5.d a(String str, byte[] bArr, String str2) {
        return e(str, true, bArr, "application/x-protobuf");
    }

    @Override // com.google.android.gms.internal.ads.lj3
    public final a5.d b(String str) {
        return e(str, false, new byte[0], null);
    }

    final /* synthetic */ Object c(final String str, final boolean z7, final String str2, final byte[] bArr, final c.a aVar) {
        this.f14953a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.nj3
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                rj3.this.d(str, aVar, z7, str2, bArr);
            }
        });
        return "";
    }
}
