package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: MyApplication */
public abstract class eq {
    public static String a(Context context, String str, List list, Executor executor) {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
            return null;
        }
        final j74 C = j74.C();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.dq
            public final /* synthetic */ void onChecksumsReady(List list2) {
                int type;
                byte[] value;
                j74 j74Var = j74.this;
                if (list2 == null) {
                    j74Var.l(null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        ApkChecksum a8 = ul.a(list2.get(i7));
                        type = a8.getType();
                        if (type == 8) {
                            value = a8.getValue();
                            j74Var.l(no.a(value));
                            return;
                        }
                    }
                    j74Var.l(null);
                } catch (Throwable unused) {
                    j74Var.l(null);
                }
            }
        });
        return (String) C.get();
    }
}
