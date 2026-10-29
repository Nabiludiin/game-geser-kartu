package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import f5.h;
import f5.r;
import java.util.Arrays;
import java.util.List;
import n5.i;

/* compiled from: MyApplication */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    public static /* synthetic */ p5.c a(f5.e eVar) {
        return new b((c5.e) eVar.a(c5.e.class), eVar.d(i.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<f5.c> getComponents() {
        return Arrays.asList(f5.c.e(p5.c.class).b(r.i(c5.e.class)).b(r.g(i.class)).e(new h() { // from class: p5.d
            @Override // f5.h
            public final Object a(f5.e eVar) {
                return FirebaseInstallationsRegistrar.a(eVar);
            }
        }).c(), n5.h.a(), u5.h.b("fire-installations", "17.0.1"));
    }
}
