package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: MyApplication */
public final class dg {

    /* renamed from: a, reason: collision with root package name */
    private final int f7093a;

    /* renamed from: b, reason: collision with root package name */
    private final List f7094b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7095c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f7096d;

    public dg(int i7, List list, int i8, InputStream inputStream) {
        this.f7093a = i7;
        this.f7094b = list;
        this.f7095c = i8;
        this.f7096d = inputStream;
    }

    public final int a() {
        return this.f7093a;
    }

    public final List b() {
        return Collections.unmodifiableList(this.f7094b);
    }

    public final int c() {
        return this.f7095c;
    }

    public final InputStream d() {
        InputStream inputStream = this.f7096d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }
}
