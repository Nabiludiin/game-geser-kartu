package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class my {

    /* renamed from: a, reason: collision with root package name */
    private final List f12481a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f12482b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f12483c = new ArrayList();

    public final void a(ly lyVar) {
        this.f12481a.add(lyVar);
    }

    public final void b(ly lyVar) {
        this.f12482b.add(lyVar);
    }

    public final void c(ly lyVar) {
        this.f12483c.add(lyVar);
    }

    public final void d(SharedPreferences.Editor editor, int i7, JSONObject jSONObject) {
        for (ly lyVar : this.f12481a) {
            if (lyVar.m() == 1) {
                lyVar.b(editor, lyVar.c(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            w2.p.c("Flag Json is null.");
        }
    }

    public final List e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f12482b.iterator();
        while (it.hasNext()) {
            String str = (String) s2.b0.c().d((ly) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(vy.a());
        return arrayList;
    }

    public final List f() {
        List e8 = e();
        Iterator it = this.f12483c.iterator();
        while (it.hasNext()) {
            String str = (String) s2.b0.c().d((ly) it.next());
            if (!TextUtils.isEmpty(str)) {
                e8.add(str);
            }
        }
        e8.addAll(vy.b());
        return e8;
    }
}
