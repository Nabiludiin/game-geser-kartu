package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: MyApplication */
public final class oa3 {

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f13254b = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final List f13255a = new ArrayList();

    public final List a() {
        return this.f13255a;
    }

    public final void b(View view, u93 u93Var, String str) {
        na3 na3Var;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!f13254b.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        List list = this.f13255a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                na3Var = null;
                break;
            } else {
                na3Var = (na3) it.next();
                if (na3Var.a().get() == view) {
                    break;
                }
            }
        }
        if (na3Var == null) {
            list.add(new na3(view, u93Var, "Ad overlay"));
        }
    }

    public final void c() {
        this.f13255a.clear();
    }
}
