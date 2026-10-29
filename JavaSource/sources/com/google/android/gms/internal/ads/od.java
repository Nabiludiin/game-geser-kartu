package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class od {

    /* renamed from: a, reason: collision with root package name */
    public final int f13290a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13291b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13292c;

    /* renamed from: d, reason: collision with root package name */
    public final List f13293d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f13294e;

    public od(int i7, String str, int i8, List list, byte[] bArr) {
        this.f13290a = i7;
        this.f13291b = str;
        this.f13292c = i8;
        this.f13293d = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.f13294e = bArr;
    }

    public final int a() {
        int i7 = this.f13292c;
        if (i7 != 2) {
            return i7 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
