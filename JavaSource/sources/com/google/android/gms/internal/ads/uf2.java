package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: MyApplication */
final class uf2 extends o21 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    uf2(yf2 yf2Var, View view, mr0 mr0Var, p41 p41Var, d03 d03Var) {
        super(view, null, p41Var, d03Var);
        Objects.requireNonNull(yf2Var);
    }

    @Override // com.google.android.gms.internal.ads.o21
    public final ob1 e(Set set) {
        return new ob1(Collections.EMPTY_SET);
    }
}
