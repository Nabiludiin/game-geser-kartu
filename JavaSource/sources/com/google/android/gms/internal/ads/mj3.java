package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.concurrent.ExecutorService;

/* compiled from: MyApplication */
public final class mj3 implements n85 {

    /* renamed from: a, reason: collision with root package name */
    private final w85 f12276a;

    /* renamed from: b, reason: collision with root package name */
    private final w85 f12277b;

    private mj3(w85 w85Var, w85 w85Var2) {
        this.f12276a = w85Var;
        this.f12277b = w85Var2;
    }

    public static mj3 a(w85 w85Var, w85 w85Var2) {
        return new mj3(w85Var, w85Var2);
    }

    @Override // com.google.android.gms.internal.ads.b95
    public final /* bridge */ /* synthetic */ Object b() {
        ExecutorService executorService = (ExecutorService) this.f12276a.b();
        li3 li3Var = (li3) this.f12277b.b();
        String str = Build.VERSION.RELEASE;
        String str2 = Build.MODEL;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30 + String.valueOf(str2).length() + 1);
        sb.append("Mozilla/5.0 (Linux; Android ");
        sb.append(str);
        sb.append("; ");
        sb.append(str2);
        sb.append(")");
        return new rj3(executorService, sb.toString(), li3Var.r0());
    }
}
