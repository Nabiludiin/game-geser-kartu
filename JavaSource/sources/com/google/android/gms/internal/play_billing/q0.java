package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.d;
import com.android.billingclient.api.g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* compiled from: MyApplication */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f21711a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return n(intent.getExtras(), "ProxyBillingActivity");
        }
        l("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        if (bundle == null) {
            l(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            k(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        l(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle c(Bundle bundle, String str, String str2, long j7) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j7);
        return bundle;
    }

    public static Bundle d(com.android.billingclient.api.d dVar, l6 l6Var) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", dVar.c());
        bundle.putString("DEBUG_MESSAGE", dVar.a());
        bundle.putInt("LOG_REASON", l6Var.a());
        return bundle;
    }

    public static Bundle e(com.android.billingclient.api.d dVar, l6 l6Var, String str) {
        Bundle d8 = d(dVar, l6Var);
        if (str != null) {
            d8.putString("ADDITIONAL_LOG_DETAILS", str);
        }
        return d8;
    }

    public static Bundle f(String str, String str2, ArrayList arrayList, String str3, String str4, a aVar, long j7) {
        boolean z7;
        Bundle bundle = new Bundle();
        c(bundle, str, str2, j7);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(j0.p("subs", "inapp")));
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(j0.o("inapp")));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        z7 = aVar.f21472a;
        if (z7) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        int size = arrayList.size();
        boolean z8 = false;
        boolean z9 = false;
        for (int i7 = 0; i7 < size; i7++) {
            g.b bVar = (g.b) arrayList.get(i7);
            arrayList2.add(null);
            z8 |= !TextUtils.isEmpty(null);
            arrayList4.add(null);
            z9 |= !TextUtils.isEmpty(null);
            if (bVar.c().equals("first_party")) {
                w.c(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                arrayList3.add(null);
            }
        }
        if (z8) {
            bundle.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList2);
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        if (!TextUtils.isEmpty(null)) {
            bundle.putString("accountName", null);
        }
        if (z9) {
            bundle.putStringArrayList("SKU_DYNAMIC_PRODUCT_TOKEN_LIST", arrayList4);
        }
        return bundle;
    }

    public static com.android.billingclient.api.d g(Intent intent, String str) {
        if (intent != null) {
            d.a d8 = com.android.billingclient.api.d.d();
            d8.d(b(intent.getExtras(), str));
            d8.b(h(intent.getExtras(), str));
            return d8.a();
        }
        l("BillingHelper", "Got null intent!");
        d.a d9 = com.android.billingclient.api.d.d();
        d9.d(6);
        d9.b("An internal error occurred.");
        return d9.a();
    }

    public static String h(Bundle bundle, String str) {
        if (bundle == null) {
            l(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            k(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        l(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String i(int i7) {
        return p.c(i7).toString();
    }

    public static List j(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase o7 = o(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (o7 == null) {
                k("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(o7);
            return arrayList;
        }
        k("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i7 = 0; i7 < stringArrayList.size() && i7 < stringArrayList2.size(); i7++) {
            Purchase o8 = o(stringArrayList.get(i7), stringArrayList2.get(i7));
            if (o8 != null) {
                arrayList.add(o8);
            }
        }
        return arrayList;
    }

    public static void k(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i7 = 40000;
            while (!str2.isEmpty() && i7 > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i7));
                Log.v(str, str2.substring(0, min));
                str2 = str2.substring(min);
                i7 -= min;
            }
        }
    }

    public static void l(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void m(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static int n(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        l(str, "Unexpected null bundle received!");
        return 0;
    }

    private static Purchase o(String str, String str2) {
        if (str == null || str2 == null) {
            k("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e8) {
            l("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e8.toString()));
            return null;
        }
    }
}
