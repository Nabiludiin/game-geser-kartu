package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.function.Function;

/* compiled from: MyApplication */
public final class ck3 extends sj3 {

    /* renamed from: b, reason: collision with root package name */
    private final ExecutorService f6483b;

    /* renamed from: c, reason: collision with root package name */
    private final ak3 f6484c;

    /* renamed from: d, reason: collision with root package name */
    private final Function f6485d;

    public ck3(File file, ExecutorService executorService, ak3 ak3Var, Function function) {
        super(file);
        this.f6483b = executorService;
        this.f6484c = ak3Var;
        this.f6485d = function;
    }

    @Override // com.google.android.gms.internal.ads.sj3
    public final a5.d b() {
        return p64.d(new Callable() { // from class: com.google.android.gms.internal.ads.yj3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return ck3.this.d();
            }
        }, this.f6483b);
    }

    @Override // com.google.android.gms.internal.ads.sj3
    public final a5.d c(final Object obj) {
        return p64.d(new Callable() { // from class: com.google.android.gms.internal.ads.xj3
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ck3.this.e(obj);
                return null;
            }
        }, this.f6483b);
    }

    final /* synthetic */ Object d() {
        Object d8;
        Object b8;
        synchronized (this) {
            try {
                try {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(this.f15654a);
                        try {
                            b8 = this.f6484c.b(fileInputStream);
                            fileInputStream.close();
                        } catch (Throwable th) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (wj3 e8) {
                        d8 = this.f6485d.apply(e8);
                        return d8;
                    }
                } catch (IOException e9) {
                    d8 = this.f6485d.apply(new wj3(e9));
                    return d8;
                }
            } catch (FileNotFoundException unused) {
                d8 = this.f6484c.d();
                return d8;
            }
        }
        return b8;
    }

    final /* synthetic */ Void e(Object obj) {
        synchronized (this) {
            File file = this.f15654a;
            y34.b(file);
            String parent = file.getParent();
            String name = file.getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 5);
            sb.append(name);
            sb.append(".temp");
            File file2 = new File(parent, sb.toString());
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    this.f6484c.a(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(this.f15654a)) {
                        throw new IOException("Failed to rename file.");
                    }
                } catch (Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e8) {
                file2.delete();
                throw e8;
            }
        }
        return null;
    }
}
