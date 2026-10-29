package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class uw3 {

    /* renamed from: a, reason: collision with root package name */
    private static final rw3 f17026a = new rw3("PhoneskyVerificationUtils");

    public static boolean a(Context context) {
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        f17026a.b("Play Store package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (Signature signature : signatureArr) {
                            String a8 = sw3.a(signature.toByteArray());
                            arrayList.add(a8);
                            if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(a8)) {
                                String str = Build.TAGS;
                                if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(a8)) {
                                }
                            }
                            return true;
                        }
                        f17026a.b(String.format("Play Store package certs are not valid. Found these sha256 certs: [%s].", tw3.a(", ", arrayList)), new Object[0]);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    f17026a.b("Play Store package is not found.", new Object[0]);
                }
            } else {
                f17026a.b("Play Store package is disabled.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            f17026a.b("Play Store package is not found.", new Object[0]);
        }
        return false;
    }
}
