package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import d5.b;
import f5.c;
import f5.e;
import f5.r;
import java.util.Arrays;
import java.util.List;
import m5.d;
import u5.h;

/* compiled from: MyApplication */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d5.a lambda$getComponents$0(e eVar) {
        return b.a((c5.e) eVar.a(c5.e.class), (Context) eVar.a(Context.class), (d) eVar.a(d.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<c> getComponents() {
        return Arrays.asList(c.e(d5.a.class).b(r.i(c5.e.class)).b(r.i(Context.class)).b(r.i(d.class)).e(a.f22958a).d().c(), h.b("fire-analytics", "23.0.0"));
    }
}
