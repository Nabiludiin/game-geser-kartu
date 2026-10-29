package com.google.android.gms.internal.play_billing;

import java.util.Arrays;

/* compiled from: MyApplication */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private final String f21729a;

    /* renamed from: b, reason: collision with root package name */
    private final r f21730b;

    /* renamed from: c, reason: collision with root package name */
    private r f21731c;

    /* synthetic */ s(String str, t tVar) {
        r rVar = new r();
        this.f21730b = rVar;
        this.f21731c = rVar;
        str.getClass();
        this.f21729a = str;
    }

    public final s a(Object obj) {
        r rVar = new r();
        this.f21731c.f21722b = rVar;
        this.f21731c = rVar;
        rVar.f21721a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f21729a);
        sb.append('{');
        r rVar = this.f21730b.f21722b;
        String str = "";
        while (rVar != null) {
            Object obj = rVar.f21721a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r3.length() - 1);
            }
            rVar = rVar.f21722b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
