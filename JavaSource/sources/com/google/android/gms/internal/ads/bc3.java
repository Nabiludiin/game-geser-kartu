package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class bc3 extends wb3 {
    public bc3(qb3 qb3Var, HashSet hashSet, JSONObject jSONObject, long j7) {
        super(qb3Var, hashSet, jSONObject, j7);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xb3
    /* renamed from: a */
    public final void onPostExecute(String str) {
        ka3 a8;
        if (!TextUtils.isEmpty(str) && (a8 = ka3.a()) != null) {
            for (q93 q93Var : a8.e()) {
                if (this.f18173c.contains(q93Var.h())) {
                    q93Var.g().h(str, this.f18175e);
                }
            }
        }
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        qb3 qb3Var = this.f18731b;
        JSONObject jSONObject = this.f18174d;
        if (hb3.g(jSONObject, qb3Var.d())) {
            return null;
        }
        qb3Var.e(jSONObject);
        return jSONObject.toString();
    }

    @Override // com.google.android.gms.internal.ads.xb3, android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        onPostExecute((String) obj);
    }
}
