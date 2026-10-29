package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: MyApplication */
public final class oi4 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f13338a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f13339b;

    /* synthetic */ oi4(li4 li4Var, byte[] bArr) {
        this.f13338a = new HashMap(li4Var.d());
        this.f13339b = new HashMap(li4Var.e());
    }

    public static li4 a() {
        return new li4(null);
    }

    public final Object b(b84 b84Var, Class cls) {
        mi4 mi4Var = new mi4(b84Var.getClass(), cls, null);
        Map map = this.f13338a;
        if (map.containsKey(mi4Var)) {
            return ((ki4) map.get(mi4Var)).a(b84Var);
        }
        String obj = mi4Var.toString();
        StringBuilder sb = new StringBuilder(obj.length() + 102);
        sb.append("No PrimitiveConstructor for ");
        sb.append(obj);
        sb.append(" available, see https://developers.google.com/tink/faq/registration_errors");
        throw new GeneralSecurityException(sb.toString());
    }

    public final Object c(xg4 xg4Var, fh4 fh4Var, Class cls) {
        Map map = this.f13339b;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        final qi4 qi4Var = (qi4) map.get(cls);
        return qi4Var.c(xg4Var, fh4Var, new pi4() { // from class: com.google.android.gms.internal.ads.ni4
            @Override // com.google.android.gms.internal.ads.pi4
            public final /* synthetic */ Object a(l84 l84Var) {
                return oi4.this.b(l84Var.a(), qi4Var.b());
            }
        });
    }

    final /* synthetic */ Map d() {
        return this.f13338a;
    }

    final /* synthetic */ Map e() {
        return this.f13339b;
    }
}
