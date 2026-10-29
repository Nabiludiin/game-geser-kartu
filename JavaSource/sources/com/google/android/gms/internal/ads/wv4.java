package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* compiled from: MyApplication */
public final class wv4 implements il4 {

    /* renamed from: a, reason: collision with root package name */
    private final ThreadLocal f18446a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18447b;

    /* renamed from: c, reason: collision with root package name */
    private final Key f18448c;

    /* renamed from: d, reason: collision with root package name */
    private final int f18449d;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public wv4(String str, Key key) {
        int i7;
        vv4 vv4Var = new vv4(this);
        this.f18446a = vv4Var;
        if (!nf4.a(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f18447b = str;
        this.f18448c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    i7 = 20;
                    this.f18449d = i7;
                    vv4Var.get();
                    return;
                }
                break;
            case 392315023:
                if (str.equals("HMACSHA224")) {
                    i7 = 28;
                    this.f18449d = i7;
                    vv4Var.get();
                    return;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    i7 = 32;
                    this.f18449d = i7;
                    vv4Var.get();
                    return;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    i7 = 48;
                    this.f18449d = i7;
                    vv4Var.get();
                    return;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    i7 = 64;
                    this.f18449d = i7;
                    vv4Var.get();
                    return;
                }
                break;
        }
        throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
    }

    @Override // com.google.android.gms.internal.ads.il4
    public final byte[] a(byte[] bArr, int i7) {
        if (i7 > this.f18449d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.f18446a;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i7);
    }

    final /* synthetic */ String b() {
        return this.f18447b;
    }

    final /* synthetic */ Key c() {
        return this.f18448c;
    }
}
