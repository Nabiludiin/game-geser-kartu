package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
final class jx3 extends gx3 implements Serializable {

    /* renamed from: q, reason: collision with root package name */
    private final Pattern f10808q;

    jx3(Pattern pattern) {
        pattern.getClass();
        this.f10808q = pattern;
    }

    @Override // com.google.android.gms.internal.ads.gx3
    public final fx3 a(CharSequence charSequence) {
        return new ix3(this.f10808q.matcher(charSequence));
    }

    public final String toString() {
        return this.f10808q.toString();
    }
}
