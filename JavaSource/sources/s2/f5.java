package s2;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: MyApplication */
public final class f5 {

    /* renamed from: a, reason: collision with root package name */
    public static final f5 f26092a = new f5();

    protected f5() {
    }

    public final b5 a(Context context, i3 i3Var) {
        String str;
        String a8 = i3Var.a();
        Set c8 = i3Var.c();
        List unmodifiableList = !c8.isEmpty() ? Collections.unmodifiableList(new ArrayList(c8)) : null;
        boolean g8 = i3Var.g(context);
        Bundle d8 = i3Var.d(AdMobAdapter.class);
        String e8 = i3Var.e();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            String packageName = applicationContext.getPackageName();
            z.a();
            str = w2.g.y(Thread.currentThread().getStackTrace(), packageName);
        } else {
            str = null;
        }
        boolean l7 = i3Var.l();
        k2.t h8 = s3.e().h();
        return new b5(8, -1L, d8, -1, unmodifiableList, g8, Math.max(i3Var.i(), h8.c()), false, e8, null, null, a8, i3Var.h(), i3Var.j(), Collections.unmodifiableList(new ArrayList(i3Var.k())), i3Var.f(), str, l7, null, h8.d(), (String) Collections.max(Arrays.asList(null, h8.a()), e5.f26087q), i3Var.b(), i3Var.n(), i3Var.m(), h8.b().c(), i3Var.p(), i3Var.q());
    }
}
