package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: MyApplication */
public final class aq {

    /* renamed from: a, reason: collision with root package name */
    private final ko f5203a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5204b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5205c;

    /* renamed from: e, reason: collision with root package name */
    private final Class[] f5207e;

    /* renamed from: d, reason: collision with root package name */
    private volatile Method f5206d = null;

    /* renamed from: f, reason: collision with root package name */
    private final CountDownLatch f5208f = new CountDownLatch(1);

    public aq(ko koVar, String str, String str2, Class... clsArr) {
        this.f5203a = koVar;
        this.f5204b = str;
        this.f5205c = str2;
        this.f5207e = clsArr;
        koVar.d().submit(new zp(this));
    }

    private final String c(byte[] bArr, String str) {
        return new String(this.f5203a.f().b(bArr, str), "UTF-8");
    }

    public final Method a() {
        if (this.f5206d != null) {
            return this.f5206d;
        }
        try {
            if (this.f5208f.await(2L, TimeUnit.SECONDS)) {
                return this.f5206d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    final /* synthetic */ void b() {
        try {
            ko koVar = this.f5203a;
            Class<?> loadClass = koVar.e().loadClass(c(koVar.g(), this.f5204b));
            if (loadClass != null) {
                this.f5206d = loadClass.getMethod(c(koVar.g(), this.f5205c), this.f5207e);
            }
        } catch (mn | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException | NullPointerException unused) {
        } catch (Throwable th) {
            this.f5208f.countDown();
            throw th;
        }
        this.f5208f.countDown();
    }
}
