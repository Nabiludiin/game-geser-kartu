package com.google.android.gms.internal.ads;

import java.util.UUID;

/* compiled from: MyApplication */
public final class j32 implements n85 {
    public static j32 a() {
        return i32.f9824a;
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        r2.t.g();
        String uuid = UUID.randomUUID().toString();
        v85.b(uuid);
        return uuid;
    }
}
