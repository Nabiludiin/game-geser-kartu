package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: MyApplication */
public abstract class y34 {
    public static void a(byte[] bArr, File file) {
        x34 x34Var = new x34(file, new w34[0], null);
        bArr.getClass();
        OutputStream a8 = x34Var.a();
        try {
            a8.write(bArr);
            a8.close();
        } catch (Throwable th) {
            try {
                a8.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void b(File file) {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }
}
