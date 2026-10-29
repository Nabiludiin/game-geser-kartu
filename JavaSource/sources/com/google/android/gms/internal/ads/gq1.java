package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public final class gq1 {

    /* renamed from: a, reason: collision with root package name */
    private final v2.n0 f9078a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.e f9079b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f9080c;

    public gq1(v2.n0 n0Var, com.google.android.gms.common.util.e eVar, Executor executor) {
        this.f9078a = n0Var;
        this.f9079b = eVar;
        this.f9080c = executor;
    }

    private final Bitmap c(byte[] bArr, BitmapFactory.Options options) {
        com.google.android.gms.common.util.e eVar = this.f9079b;
        long b8 = eVar.b();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long b9 = eVar.b();
        if (decodeByteArray != null) {
            long j7 = b9 - b8;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z7 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sb = new StringBuilder(String.valueOf(width).length() + 20 + String.valueOf(height).length() + 8 + String.valueOf(allocationByteCount).length() + 7 + String.valueOf(j7).length() + 15 + String.valueOf(z7).length());
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j7);
            sb.append(" on ui thread: ");
            sb.append(z7);
            v2.n1.k(sb.toString());
        }
        return decodeByteArray;
    }

    public final a5.d a(String str, final double d8, final boolean z7) {
        return p64.k(this.f9078a.a(str), new hx3() { // from class: com.google.android.gms.internal.ads.fq1
            @Override // com.google.android.gms.internal.ads.hx3
            public final /* synthetic */ Object apply(Object obj) {
                return gq1.this.b(d8, z7, (cf) obj);
            }
        }, this.f9080c);
    }

    final /* synthetic */ Bitmap b(double d8, boolean z7, cf cfVar) {
        byte[] bArr = cfVar.f6404b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d8 * 160.0d);
        if (!z7) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        if (((Boolean) s2.b0.c().d(uy.I6)).booleanValue()) {
            options.inJustDecodeBounds = true;
            c(bArr, options);
            options.inJustDecodeBounds = false;
            int i7 = options.outWidth * options.outHeight;
            if (i7 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i7 - 1) / ((Integer) s2.b0.c().d(uy.J6)).intValue())) / 2);
            }
        }
        return c(bArr, options);
    }
}
