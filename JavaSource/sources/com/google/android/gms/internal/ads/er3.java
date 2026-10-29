package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/* compiled from: MyApplication */
final class er3 {

    /* renamed from: a, reason: collision with root package name */
    private final zg f7793a;

    /* renamed from: b, reason: collision with root package name */
    private final long f7794b;

    /* renamed from: c, reason: collision with root package name */
    private final long f7795c;

    /* renamed from: d, reason: collision with root package name */
    private final String f7796d;

    private er3(zg zgVar, long j7, long j8, String str) {
        this.f7793a = zgVar;
        this.f7794b = j7;
        this.f7795c = j8;
        this.f7796d = str;
    }

    static /* synthetic */ er3 a(zg zgVar, byte[] bArr) {
        Optional empty;
        Optional empty2;
        zgVar.a();
        zgVar.c(bArr);
        empty = Optional.empty();
        List list = (List) zgVar.b(empty);
        long longValue = ((Long) list.get(0)).longValue();
        long longValue2 = ((Long) list.get(1)).longValue();
        long longValue3 = ((Long) list.get(2)).longValue();
        empty2 = Optional.empty();
        zgVar.d(longValue, empty2);
        return new er3(zgVar, longValue2, longValue3, "3.".concat(new String(eh.a(), StandardCharsets.UTF_8)));
    }

    final /* synthetic */ String b(Map map) {
        Optional of;
        zg zgVar = this.f7793a;
        long j7 = this.f7794b;
        of = Optional.of(map);
        return hj3.a((byte[]) zgVar.d(j7, of), true);
    }

    final /* synthetic */ void c(Map map) {
        Optional of;
        zg zgVar = this.f7793a;
        long j7 = this.f7795c;
        of = Optional.of(map);
        zgVar.d(j7, of);
    }

    final /* synthetic */ String d() {
        return this.f7796d;
    }
}
