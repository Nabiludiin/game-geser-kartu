package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* compiled from: MyApplication */
public final class a84 implements o84 {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f4805b = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f4806a;

    private a84(InputStream inputStream) {
        this.f4806a = inputStream;
    }

    public static a84 a(String str) {
        return new a84(new ByteArrayInputStream(str.getBytes(f4805b)));
    }

    private static int c(pw4 pw4Var) {
        if (!(pw4Var instanceof tw4)) {
            throw new IOException("invalid key id: not a JSON primitive");
        }
        if (!pw4Var.h().d()) {
            throw new IOException("invalid key id: not a JSON number");
        }
        try {
            long c8 = og4.c(pw4Var.h().j());
            if (c8 > 4294967295L || c8 < -2147483648L) {
                throw new IOException("invalid key id");
            }
            return (int) c8;
        } catch (NumberFormatException e8) {
            throw new IOException(e8);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144 A[Catch: all -> 0x0033, IllegalStateException -> 0x0036, sw4 -> 0x0039, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x0014, B:4:0x0023, B:6:0x002d, B:8:0x003c, B:10:0x0053, B:12:0x005b, B:14:0x0065, B:16:0x006f, B:18:0x007b, B:20:0x0081, B:22:0x008f, B:24:0x0095, B:26:0x009b, B:28:0x00a1, B:30:0x00a9, B:40:0x00eb, B:44:0x0114, B:45:0x0137, B:47:0x0144, B:49:0x014a, B:51:0x0150, B:55:0x0191, B:57:0x01b4, B:64:0x019c, B:69:0x01a7, B:74:0x01b2, B:59:0x01d2, B:60:0x01db, B:79:0x01dc, B:80:0x01e3, B:88:0x011f, B:92:0x012a, B:96:0x0135, B:84:0x01e4, B:85:0x01ed, B:100:0x01ee, B:101:0x01f7, B:112:0x01f8, B:113:0x01ff, B:115:0x0200, B:116:0x0207, B:121:0x0208, B:124:0x0214, B:125:0x021b, B:126:0x021c, B:127:0x0223, B:128:0x0224, B:129:0x022b, B:136:0x022c, B:137:0x0231), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01dc A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e4 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.o84
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.ho4 b() {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.a84.b():com.google.android.gms.internal.ads.ho4");
    }
}
