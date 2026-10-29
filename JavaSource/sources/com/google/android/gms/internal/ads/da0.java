package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class da0 implements s80, ca0 {

    /* renamed from: q, reason: collision with root package name */
    private final ca0 f7010q;

    /* renamed from: r, reason: collision with root package name */
    private final HashSet f7011r = new HashSet();

    public da0(ca0 ca0Var) {
        this.f7010q = ca0Var;
    }

    @Override // com.google.android.gms.internal.ads.q80
    public /* synthetic */ void B(String str, Map map) {
        r80.d(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void J(String str, y50 y50Var) {
        this.f7010q.J(str, y50Var);
        this.f7011r.remove(new AbstractMap.SimpleEntry(str, y50Var));
    }

    @Override // com.google.android.gms.internal.ads.ca0
    public final void K(String str, y50 y50Var) {
        this.f7010q.K(str, y50Var);
        this.f7011r.add(new AbstractMap.SimpleEntry(str, y50Var));
    }

    @Override // com.google.android.gms.internal.ads.s80
    public /* synthetic */ void a(String str, JSONObject jSONObject) {
        r80.c(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.s80
    public final void b(String str) {
        this.f7010q.b(str);
    }

    @Override // com.google.android.gms.internal.ads.e90
    public /* synthetic */ void c(String str, JSONObject jSONObject) {
        r80.a(this, str, jSONObject);
    }

    public final void d() {
        HashSet hashSet = this.f7011r;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            AbstractMap.SimpleEntry simpleEntry = (AbstractMap.SimpleEntry) it.next();
            v2.n1.k("Unregistering eventhandler: ".concat(String.valueOf(((y50) simpleEntry.getValue()).toString())));
            this.f7010q.J((String) simpleEntry.getKey(), (y50) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.s80
    public /* synthetic */ void h(String str, String str2) {
        r80.b(this, str, str2);
    }
}
