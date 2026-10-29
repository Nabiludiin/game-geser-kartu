package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.net.Uri;

/* compiled from: MyApplication */
public final class wu0 implements n85 {
    private wu0(iu0 iu0Var) {
    }

    public static wu0 a(iu0 iu0Var) {
        return new wu0(iu0Var);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* synthetic */ Object b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
