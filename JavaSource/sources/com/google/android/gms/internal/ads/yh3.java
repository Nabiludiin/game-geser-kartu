package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.File;

/* compiled from: MyApplication */
public final class yh3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f19587a;

    private yh3(w85 w85Var) {
        this.f19587a = w85Var;
    }

    public static yh3 a(w85 w85Var) {
        return new yh3(w85Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        File dir = ((Context) this.f19587a.b()).getDir("yqzdkcache", 0);
        v85.b(dir);
        return dir;
    }
}
