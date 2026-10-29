package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* compiled from: MyApplication */
public final class bp3 {

    /* renamed from: a, reason: collision with root package name */
    private Uri f5888a;

    /* renamed from: b, reason: collision with root package name */
    private Map f5889b;

    /* renamed from: c, reason: collision with root package name */
    private long f5890c;

    /* renamed from: d, reason: collision with root package name */
    private final long f5891d;

    /* renamed from: e, reason: collision with root package name */
    private int f5892e;

    /* synthetic */ bp3(cq3 cq3Var, byte[] bArr) {
        this.f5888a = cq3Var.f6571a;
        this.f5889b = cq3Var.f6574d;
        this.f5890c = cq3Var.f6575e;
        this.f5891d = cq3Var.f6576f;
        this.f5892e = cq3Var.f6577g;
    }

    public final bp3 a(Uri uri) {
        this.f5888a = uri;
        return this;
    }

    public final bp3 b(Map map) {
        this.f5889b = map;
        return this;
    }

    public final bp3 c(long j7) {
        this.f5890c = j7;
        return this;
    }

    public final bp3 d(int i7) {
        this.f5892e = 6;
        return this;
    }

    public final cq3 e() {
        rx3.k(this.f5888a, "The uri must be set.");
        return new cq3(this.f5888a, 0L, 1, null, this.f5889b, this.f5890c, this.f5891d, null, this.f5892e, null, null);
    }

    public bp3() {
        this.f5889b = Collections.EMPTY_MAP;
        this.f5891d = -1L;
    }
}
