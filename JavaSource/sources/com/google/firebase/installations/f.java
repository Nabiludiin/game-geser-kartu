package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final long f23037b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f23038c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    private static f f23039d;

    /* renamed from: a, reason: collision with root package name */
    private final s5.a f23040a;

    private f(s5.a aVar) {
        this.f23040a = aVar;
    }

    public static f c() {
        return d(s5.b.b());
    }

    public static f d(s5.a aVar) {
        if (f23039d == null) {
            f23039d = new f(aVar);
        }
        return f23039d;
    }

    static boolean g(String str) {
        return f23038c.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f23040a.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(q5.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f23037b;
    }
}
