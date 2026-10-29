package com.google.android.datatransport.cct;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import y1.g;

/* compiled from: MyApplication */
public final class a implements g {

    /* renamed from: c, reason: collision with root package name */
    static final String f4314c;

    /* renamed from: d, reason: collision with root package name */
    static final String f4315d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f4316e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set f4317f;

    /* renamed from: g, reason: collision with root package name */
    public static final a f4318g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f4319h;

    /* renamed from: a, reason: collision with root package name */
    private final String f4320a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4321b;

    static {
        String a8 = e.a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f4314c = a8;
        String a9 = e.a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f4315d = a9;
        String a10 = e.a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f4316e = a10;
        f4317f = Collections.unmodifiableSet(new HashSet(Arrays.asList(w1.b.b("proto"), w1.b.b("json"))));
        f4318g = new a(a8, null);
        f4319h = new a(a9, a10);
    }

    public a(String str, String str2) {
        this.f4320a = str;
        this.f4321b = str2;
    }

    public static a c(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (!str.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        String str2 = split[0];
        if (str2.isEmpty()) {
            throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            str3 = null;
        }
        return new a(str2, str3);
    }

    @Override // y1.g
    public Set a() {
        return f4317f;
    }

    public byte[] b() {
        String str = this.f4321b;
        if (str == null && this.f4320a == null) {
            return null;
        }
        String str2 = this.f4320a;
        if (str == null) {
            str = "";
        }
        return String.format("%s%s%s%s", "1$", str2, "\\", str).getBytes(Charset.forName("UTF-8"));
    }

    public String d() {
        return this.f4321b;
    }

    public String e() {
        return this.f4320a;
    }

    @Override // y1.f
    public byte[] getExtras() {
        return b();
    }

    @Override // y1.f
    public String getName() {
        return "cct";
    }
}
