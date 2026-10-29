package p4;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MyApplication */
public final class p implements y1 {

    /* renamed from: a, reason: collision with root package name */
    private final Application f25488a;

    /* renamed from: b, reason: collision with root package name */
    private final r f25489b;

    /* renamed from: c, reason: collision with root package name */
    private final x2 f25490c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f25491d;

    public p(Application application, r rVar, x2 x2Var, Executor executor) {
        this.f25488a = application;
        this.f25489b = rVar;
        this.f25491d = executor;
        this.f25490c = x2Var;
    }

    @Override // p4.y1
    public final Executor a() {
        return this.f25491d;
    }

    @Override // p4.y1
    public final boolean c(String str, JSONObject jSONObject) {
        int hashCode = str.hashCode();
        if (hashCode != 94746189) {
            if (hashCode == 113399775 && str.equals("write")) {
                m1 m1Var = new m1(this.f25488a);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    Log.d("UserMessagingPlatform", "Writing to storage: [" + next + "] " + String.valueOf(opt));
                    if (m1Var.e(next, opt)) {
                        this.f25489b.c().add(next);
                    } else {
                        Log.d("UserMessagingPlatform", "Failed writing key: ".concat(String.valueOf(next)));
                    }
                }
                this.f25489b.d();
                m1Var.c();
                Map b8 = m1Var.b();
                if (b8.size() > 1) {
                    this.f25490c.a(b8);
                    m1Var.d();
                }
                return true;
            }
        } else if (str.equals("clear")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("keys");
            if (optJSONArray == null || optJSONArray.length() == 0) {
                Log.d("UserMessagingPlatform", "Action[clear]: wrong args.".concat(String.valueOf(jSONObject.toString())));
            } else {
                HashSet hashSet = new HashSet();
                int length = optJSONArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    String optString = optJSONArray.optString(i7);
                    if (TextUtils.isEmpty(optString)) {
                        Log.d("UserMessagingPlatform", "Action[clear]: empty key at index: " + i7);
                    } else {
                        hashSet.add(optString);
                    }
                }
                n1.b(this.f25488a, hashSet);
            }
            return true;
        }
        return false;
    }
}
