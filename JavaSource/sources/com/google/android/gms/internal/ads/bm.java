package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* compiled from: MyApplication */
final class bm implements Runnable {
    /* synthetic */ bm(byte[] bArr) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        try {
            cm.f6496b = MessageDigest.getInstance("MD5");
            countDownLatch = cm.f6499e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = cm.f6499e;
        } catch (Throwable th) {
            cm.f6499e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
