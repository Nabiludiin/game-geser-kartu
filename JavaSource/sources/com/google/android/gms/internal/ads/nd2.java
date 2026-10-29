package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: MyApplication */
public abstract class nd2 implements ka2 {
    private static Bundle d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final boolean a(o03 o03Var, c03 c03Var) {
        return !TextUtils.isEmpty(c03Var.f6192v.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, ""));
    }

    @Override // com.google.android.gms.internal.ads.ka2
    public final a5.d b(o03 o03Var, c03 c03Var) {
        JSONObject jSONObject = c03Var.f6192v;
        String optString = jSONObject.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, "");
        w03 w03Var = o03Var.f13136a.f11326a;
        v03 v03Var = new v03();
        v03Var.X(w03Var);
        v03Var.F(optString);
        s2.b5 b5Var = w03Var.f17958d;
        Bundle d8 = d(b5Var.C);
        Bundle d9 = d(d8.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d9.putInt("gw", 1);
        String optString2 = jSONObject.optString("mad_hac", null);
        if (optString2 != null) {
            d9.putString("mad_hac", optString2);
        }
        String optString3 = jSONObject.optString("adJson", null);
        if (optString3 != null) {
            d9.putString("_ad", optString3);
        }
        d9.putBoolean("_noRefresh", true);
        JSONObject jSONObject2 = c03Var.D;
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = jSONObject2.optString(next, null);
            if (next != null) {
                d9.putString(next, optString4);
            }
        }
        d8.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d9);
        v03Var.z(new s2.b5(b5Var.f26056q, b5Var.f26057r, d9, b5Var.f26059t, b5Var.f26060u, b5Var.f26061v, b5Var.f26062w, b5Var.f26063x, b5Var.f26064y, b5Var.f26065z, b5Var.A, b5Var.B, d8, b5Var.D, b5Var.E, b5Var.F, b5Var.G, b5Var.H, b5Var.I, b5Var.J, b5Var.K, b5Var.L, b5Var.M, b5Var.N, b5Var.O, b5Var.P, b5Var.Q));
        w03 Y = v03Var.Y();
        Bundle bundle = new Bundle();
        f03 f03Var = o03Var.f13137b.f12530b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList<>(f03Var.f7925a));
        bundle2.putInt("refresh_interval", f03Var.f7927c);
        bundle2.putString("gws_query_id", f03Var.f7926b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = w03Var.f17961g;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bundle3.putString("allocation_id", c03Var.f6194w);
        bundle3.putString("ad_source_name", c03Var.F);
        bundle3.putStringArrayList("click_urls", new ArrayList<>(c03Var.f6154c));
        bundle3.putStringArrayList("imp_urls", new ArrayList<>(c03Var.f6156d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList<>(c03Var.f6180p));
        bundle3.putStringArrayList("fill_urls", new ArrayList<>(c03Var.f6174m));
        bundle3.putStringArrayList("video_start_urls", new ArrayList<>(c03Var.f6162g));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList<>(c03Var.f6164h));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList<>(c03Var.f6166i));
        bundle3.putString("transaction_id", c03Var.f6168j);
        bundle3.putString("valid_from_timestamp", c03Var.f6170k);
        bundle3.putBoolean("is_closable_area_disabled", c03Var.P);
        bundle3.putString("recursive_server_response_data", c03Var.f6179o0);
        bundle3.putBoolean("is_analytics_logging_enabled", c03Var.W);
        di0 di0Var = c03Var.f6172l;
        if (di0Var != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", di0Var.f7115r);
            bundle4.putString("rb_type", di0Var.f7114q);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return c(Y, bundle, c03Var, o03Var);
    }

    protected abstract a5.d c(w03 w03Var, Bundle bundle, c03 c03Var, o03 o03Var);
}
