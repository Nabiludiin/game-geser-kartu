package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class ac3 extends wb3 {
    public ac3(qb3 qb3Var, HashSet hashSet, JSONObject jSONObject, long j7) {
        super(qb3Var, hashSet, jSONObject, j7);
    }

    private final void c(String str) {
        ka3 a8 = ka3.a();
        if (a8 != null) {
            for (q93 q93Var : a8.e()) {
                if (this.f18173c.contains(q93Var.h())) {
                    q93Var.g().i(str, this.f18175e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.xb3
    /* renamed from: a */
    public final void onPostExecute(String str) {
        c(str);
        super.onPostExecute(str);
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f18174d.toString();
    }

    @Override // com.google.android.gms.internal.ads.xb3, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        c(str);
        super.onPostExecute(str);
    }
}
