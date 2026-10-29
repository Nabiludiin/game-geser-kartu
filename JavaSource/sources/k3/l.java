package k3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;

/* compiled from: MyApplication */
public class l {

    /* renamed from: c, reason: collision with root package name */
    private static l f24513c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f24514a;

    /* renamed from: b, reason: collision with root package name */
    private volatile String f24515b;

    public l(Context context) {
        this.f24514a = context.getApplicationContext();
    }

    public static l a(Context context) {
        p3.o.m(context);
        synchronized (l.class) {
            try {
                if (f24513c == null) {
                    b0.d(context);
                    f24513c = new l(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f24513c;
    }

    static final x d(PackageInfo packageInfo, x... xVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            y yVar = new y(packageInfo.signatures[0].toByteArray());
            for (int i7 = 0; i7 < xVarArr.length; i7++) {
                if (xVarArr[i7].equals(yVar)) {
                    return xVarArr[i7];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            k3.x[] r4 = k3.a0.f24461a
            k3.x r4 = d(r2, r4)
            goto L45
        L39:
            k3.x[] r4 = k3.a0.f24461a
            r4 = r4[r1]
            k3.x[] r5 = new k3.x[r0]
            r5[r1] = r4
            k3.x r4 = d(r2, r5)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.l.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    private final k0 f(String str, boolean z7, boolean z8) {
        k0 c8;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return k0.c("null pkg");
        }
        if (str.equals(this.f24515b)) {
            return k0.b();
        }
        if (b0.e()) {
            c8 = b0.b(str, k.f(this.f24514a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f24514a.getPackageManager().getPackageInfo(str, 64);
                boolean f8 = k.f(this.f24514a);
                if (packageInfo == null) {
                    c8 = k0.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        c8 = k0.c("single cert required");
                    } else {
                        y yVar = new y(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        k0 a8 = b0.a(str2, yVar, f8, false);
                        c8 = (!a8.f24509a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !b0.a(str2, yVar, false, true).f24509a) ? a8 : k0.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e8) {
                return k0.d("no pkg ".concat(str), e8);
            }
        }
        if (c8.f24509a) {
            this.f24515b = str;
        }
        return c8;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (k.f(this.f24514a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i7) {
        k0 c8;
        int length;
        String[] packagesForUid = this.f24514a.getPackageManager().getPackagesForUid(i7);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            c8 = null;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    p3.o.m(c8);
                    break;
                }
                c8 = f(packagesForUid[i8], false, false);
                if (c8.f24509a) {
                    break;
                }
                i8++;
            }
        } else {
            c8 = k0.c("no pkgs");
        }
        c8.e();
        return c8.f24509a;
    }
}
